#!/bin/bash
# Steinbeck ping google.com script
# this is simply a template/prototype towards a better way to script and get measurable pass/fail type of results.
# TODO - move check numbers to variables at the top of the script, such that the avg could be longer for external systems, but shorter for internal systems.
# dhartford 20141231
touch progress.txt
echo 10 > progress.txt
ping -c 20 google.com > results.txt
echo 50 > progress.txt
packetloss=$(awk '/packet loss/{sub(/%/, "");x=$6} END{print x}' results.txt)
duplicates=$(awk '/duplicates/{sub(/+/,"");x=$6} END{print x}' results.txt)
pingavg=$(awk '/rtt/{split($4,a,"/");x=a[2]} END{print x}' results.txt)
jitter=$(awk '/rtt/{split($4,a,"/");x=a[4]} END{print x}' results.txt)

echo $packetloss >> debug.txt
echo $duplicates >> debug.txt
echo $pingavg >> debug.txt
echo $jitter >> debug.txt

if test $packetloss -gt 0
then
	echo "Ping packet loss[ $packetloss ] greater than expected 0" >> error.txt
fi
if test $duplicates -gt 0
then
	echo "Ping duplicate count[ $duplicates ] greater than expected 0" >> error.txt
fi
if test $pingavg -gt 10
then
	echo "Ping average rtt in ms [ $pingavg ] greater than expected 10ms" >> error.txt
fi
if test $jitter -gt 4
then
	echo "Ping jitter [ $jitter ] greater than expected 4ms" >> error.txt
fi
echo 100 > progress.txt
