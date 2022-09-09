#!/bin/bash
nohup java -jar target/ProjectByMe-0.0.1-SNAPSHOT.jar  > target/website.log 2>&1 &
PID=$(ps -ef | grep ProjectByMe-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
    echo "Application started successfully"
else
    echo "Application started fail"
fi

