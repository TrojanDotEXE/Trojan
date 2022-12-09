package org.firstinspires.ftc.teamcode.TeleOpLuca;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Robot;

@TeleOp(name = "TeleOpLuca", group = "")

 public class MecanumWheels extends OpMode {

 public Robot robot;
 @Override
 public void init() {

  robot.initialize();

  telemetry.addData("Robot este initializat","ok");

 }

 @Override
 public void loop() {

  double y= gamepad1.left_stick_y;
  double x= gamepad1.left_stick_x;
  double turn= gamepad1.right_stick_x;

  double theta= Math.atan2(y, x);
  double power= Math.hypot(y, x);

  double sin = Math.sin(theta - Math.PI / 4);
  double cos= Math.cos(theta - Math.PI/4);
  double max= Math.max(Math.abs(sin),Math.abs(cos));

  double leftfront = power * cos/max + turn;
  double rightfront = power * sin/max - turn;
  double leftback = power * sin/max + turn;
  double rightback = power * cos/max - turn;

  if ((power + Math.abs(turn)) > 1 ) {

   leftfront /= power + turn;
   rightfront /= power + turn;
   leftback /= power + turn;
   rightback /= power + turn;

  }
 }
}
