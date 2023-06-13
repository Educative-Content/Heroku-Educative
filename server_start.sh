#!/usr/bin/env bash
echo 'Starting my app'
cd '/home/ec2-user/server'
sudo java -jar target/java-artifact-1.0.jar > /dev/null 2> /dev/null < /dev/null &
