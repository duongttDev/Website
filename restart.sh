#!/bin/bash
echo stop application
sh stop.sh
echo build application
sh build.sh
echo start application
sh start.sh