#!/bin/bash
set -e
OUT_DIR="out"
rm -rf "$OUT_DIR"
mkdir -p "$OUT_DIR"
find src -name '*.java' > sources.txt
javac -d "$OUT_DIR" @sources.txt
rm sources.txt
echo "Compilation successful. Classes are in $OUT_DIR" 
