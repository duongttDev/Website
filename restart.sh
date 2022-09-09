#!/bin/bash
echo stop application
source stop.sh
echo build application
source build.sh
echo start application
source start.sh