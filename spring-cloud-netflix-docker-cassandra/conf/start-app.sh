#!/usr/bin/env bash

cd ./../auth/ && mvn clean && mvn install -Pdocker && cd ../conf/
cd ./../employees/ && mvn clean && mvn install -Pdocker && cd ../conf/
cd ./../medical_leave/ && mvn clean && mvn install -Pdocker && cd ../conf/
cd ./../proxy/ && mvn clean && mvn install -Pdocker && cd ../conf/
cd ./../registry/ && mvn clean && mvn install -Pdocker && cd ../conf/
cd ./../timesheet/ && mvn clean && mvn install -Pdocker && cd ../conf/
cd ./../vacation/ && mvn clean && mvn install -Pdocker && cd ../conf/
sudo docker-compose up --build -d
