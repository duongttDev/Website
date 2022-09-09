#!/bin/bash
nohup java -jar target/ProjectByMe-0.0.1-SNAPSHOT.jar  > target/website.log 2>&1 &
echo "Application started successfully"