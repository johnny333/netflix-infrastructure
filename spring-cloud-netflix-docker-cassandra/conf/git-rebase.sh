#!/usr/bin/env bash

cd ./../auth/ && git rebase origin/develop && cd ../conf/
cd ./../employees/ && git rebase origin/develop && cd ../conf/
cd ./../medical_leave/ && git rebase origin/develop && cd ../conf/
cd ./../proxy/ && git rebase origin/develop && cd ../conf/
cd ./../registry/ && git rebase origin/develop && cd ../conf/
cd ./../timesheet/ && git rebase origin/develop && cd ../conf/
cd ./../vacation/ && git rebase origin/develop && cd ../conf/