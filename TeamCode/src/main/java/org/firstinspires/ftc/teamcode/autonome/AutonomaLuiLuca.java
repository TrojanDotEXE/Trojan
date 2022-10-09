package org.firstinspires.ftc.teamcode.autonome;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous (name = "BasicAutonomous", group = "Tutorial")
public class  AutonomaLuiLuca extends  LinearOpMode {

    public Robot troujan = new Robot();


    @Override
    public void runOpMode() throws InterruptedException {

        troujan.initialize();

        waitForStart();

        while (opModeIsActive()) {
        }

        }

            public void moveForward (double power, long time){

                troujan.leftFront.setPower(power);
                troujan.leftRear.setPower(power);
                troujan.rightFront.setPower(power);
                troujan.rightRear.setPower(power);

                sleep(time);
            }

            public void turnRight (double power, long time){

                troujan.leftFront.setPower(-power);
                troujan.leftRear.setPower(-power);
                troujan.rightFront.setPower(power);
                troujan.rightRear.setPower(power);

                sleep(time);
            }

            public void  turnLeft (double power, long time) {

                troujan.leftFront.setPower(power);
                troujan.leftRear.setPower(power);
                troujan.rightFront.setPower(-power);
                troujan.rightRear.setPower(-power);

                sleep(time);
            }

            public void stopMotor() {

                troujan.leftFront.setPower(0);
                troujan.leftRear.setPower(0);
                troujan.rightFront.setPower(0);
                troujan.rightRear.setPower(0);

            }





























}
