#!/usr/bin/env bash
cd .. && mvn clean && mvn install
cd docker && docker-compose up -d
