package org.firstinspires.ftc.teamcode.TeleOpLuca;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.robot.Robot;

@TeleOp(name = "TeleOpLuca", group = "")
public class TeleOpLuca extends OpMode {

    public Robot robot;

    @Override
    public void init() {

        robot.initialize();


        telemetry.addData("Status: ","initializat");

    }

    @Override
    public void loop() {

        double leftPower;
        double rightPower;

        double drive = -gamepad1.left_stick_y;
        double turn  =  gamepad1.right_stick_x;
        leftPower    = Range.clip(drive + turn, -1.0, 1.0) ;
        rightPower   = Range.clip(drive - turn, -1.0, 1.0) ;

        telemetry.addData("Putere totala motoare: ","%f",leftPower+rightPower);
        telemetry.addData("Putere motor stanga / dreapta: ","%f / %f",leftPower, rightPower);

        robot.right.setPower(rightPower);
        robot.left.setPower(leftPower);

       if(gamepad2.a){

           robot.claw.setPosition(0.5);
       }
       else{

           robot.claw.setPosition(1);
       }
    }
}
