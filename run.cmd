@echo off

cd V3
cd _project
IF EXIST "Zombies_in_Z_Building.jar" (
    echo [Jyph] Running...
    echo --------------------
    java.exe -jar Zombies_in_Z_Building.jar
)
