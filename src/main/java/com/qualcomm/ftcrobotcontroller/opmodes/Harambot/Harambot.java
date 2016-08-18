package com.qualcomm.ftcrobotcontroller.opmodes.Harambot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import java.util.Date;

/**
 * Created by Admin on 8/18/2016.
 */
public class Harambot extends OpMode {
    /*
    DcMotor f1;
    Servo ss1;
     */

    private static Date robotTime = new Date();

    @Override
    public void init() {
        setupHardwareMap(); // add controls
        log(); // debuger
        resetEncoders(); // resets encoderss
        setupController();
    }

    @Override
    public void loop() {
        log(); // updates debuger
        setupController(); // controls robots
    }

    @Override
    public void stop(){
        speed(0f); // make sure the robot is stopped moving
        /*
        TODO make sure robot returns to default state
         */
    }

    public void speed(float power){ } // set speed for motors

    public void log() {
        /*
        what we want to log
        motor positions
        time running
        whats plugged in to what port/names
        how fast things are running
        servo positions
        motor speed
         */

    }

    public void resetEncoders() { }

    public void setupController() { } // this is used to control motors

    public void setupHardwareMap() { }

    public long getRobotTime(){
        return robotTime.getTime();
    }
}
