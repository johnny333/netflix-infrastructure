#!/usr/bin/env bash

cd ./../auth/ && git pull --rebase && cd ../conf/
cd ./../employees/ && git pull --rebase && cd ../conf/
#cd ./../medical_leave/ && git pull --rebase && cd ../conf/
cd ./../proxy/ && git pull --rebase && cd ../conf/
cd ./../registry/ && git pull --rebase && cd ../conf/
cd ./../timesheet/ && git pull --rebase && cd ../conf/
#cd ./../vacation/ && git pull --rebase && cd ../conf/