Steinbeck
=========
Steinbeck easifies a simple job in a secure way. It can be used to run shell scripts on a (linux)unix box with SSH server during which it can check on-going progress and grab the end result..

Steinbeck may be used by system admins or security testers who have to deal with running scripts on (many) remote machines and/or getting results back.

## Features

- platform independence with java ;)
- secure connection with ssh
- multi-threading
- result grabbing
- progress updating 
 
==========================================================
dhartford additional notes:

The scripts need to be pure linux scripts.  If you are creating the scripts on windows, you can use a program like notepad++, and do a find/replace for '\r' to remove the carriage return [CR] so it will run properly.

Example script:

```bash
#!/bin/bash
# Steinbeck ping google.com script
touch progress.txt
echo 10 > progress.txt
ping -c 20 google.com > results.txt
echo 100 > progress.txt
```
