package org.firstinspires.ftc.teamcode.autonome;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

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

                troujan.left.setPower(power);
                troujan.right.setPower(power);

                sleep(time);
            }

            public void turnRight (double power, long time){


                troujan.left.setPower(-power);
                troujan.right.setPower(power);

                sleep(time);
            }

            public void  turnLeft (double power, long time) {

                troujan.left.setPower(power);
                troujan.right.setPower(-power);

                sleep(time);
            }

            public void stopMotor() {

                troujan.left.setPower(0);
                troujan.right.setPower(0);

            }





























}
