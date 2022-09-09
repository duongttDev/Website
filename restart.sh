#!/bin/bash
echo stop application
. stop.sh
echo build application
. build.sh
echo start application
. start.sh