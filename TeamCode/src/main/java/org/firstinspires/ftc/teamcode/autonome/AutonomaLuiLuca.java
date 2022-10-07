package org.firstinspires.ftc.teamcode.autonome;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous (name = "BasicAutonomous", group = "Tutorial")
public class  AutonomaLuiLuca extends  LinearOpMode {
             DcMotor leftFront, rightFront ;
             DcMotor rightRear, leftRear;

             Servo claw ;
            @Override
            public void runOpMode() throws InterruptedException {
                leftFront = hardwareMap.get (DcMotor.class, "leftFront");
                rightFront = hardwareMap.get (DcMotor.class, "rightFront");
                leftRear = hardwareMap.get (DcMotor.class, "leftRear");
                rightRear = hardwareMap.get (DcMotor.class, "rightRear");
                claw = hardwareMap.get (Servo.class, "claw");


                waitForStart();


                while (opModeIsActive()) {


                }

            }

            public void moveForward (double power, long time){

                leftFront.setPower(power);
                leftRear.setPower(power);
                rightFront.setPower(power);
                rightRear.setPower(power);

                sleep(time);
            }

            public void turnRight (double power, long time){

                leftFront.setPower(-power);
                leftRear.setPower(-power);
                rightFront.setPower(power);
                rightRear.setPower(power);

                sleep(time);
            }

            public void  turnLeft (double power, long time) {

                leftFront.setPower(power);
                leftRear.setPower(power);
                rightFront.setPower(-power);
                rightRear.setPower(-power);

                sleep(time);
            }

            public void stopMotor() {

                leftFront.setPower(0);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(0);


            }





























}
