package org.firstinspires.ftc.teamcode.robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot extends LinearOpMode {

    public DcMotor right, left;

    public Servo claw ;

    public void initialize(){

        left = hardwareMap.get (DcMotor.class, "leftRear");
        right = hardwareMap.get (DcMotor.class, "rightRear");
        claw = hardwareMap.get (Servo.class, "claw");

        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        left.setDirection(DcMotorSimple.Direction.FORWARD);
        right.setDirection(DcMotorSimple.Direction.REVERSE);

        left.setPower(0);
        right.setPower(0);


    }


    public Robot(){}
    @Override
    public void runOpMode(){}
}
