package com.qualcomm.ftcrobotcontroller.opmodes.AlpoidV2;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class TeleOP extends OpMode {

    /*
    DcMotor f1;
    Servo ss1;
     */

    @Override
    public void init() {

        setupHardwareMap(); // add controls
        log(); // debuger
        resetEncoders(); // resets encoders
        //update 3
        setupController();

    }

    @Override
    public void loop() {

    }

    @Override
    public void stop(){
        speed(0f);
    }


    public void speed(float power){ }

    public void turnLeft() {}

    public void turnRight() {}

    public void log() {}

    public void resetEncoders() {}

    public void setupController() {}

    public void setupHardwareMap() {}

    public void setupRobot(){}


}
