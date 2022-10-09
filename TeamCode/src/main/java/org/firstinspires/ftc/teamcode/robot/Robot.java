package org.firstinspires.ftc.teamcode.robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot extends LinearOpMode {

    public DcMotor leftFront, rightFront;
    public DcMotor rightRear, leftRear;

    public Servo claw ;

    public void initialize(){

        leftFront = hardwareMap.get (DcMotor.class, "leftFront");
        rightFront = hardwareMap.get (DcMotor.class, "rightFront");
        leftRear = hardwareMap.get (DcMotor.class, "leftRear");
        rightRear = hardwareMap.get (DcMotor.class, "rightRear");
        claw = hardwareMap.get (Servo.class, "claw");

        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftRear.setDirection(DcMotorSimple.Direction.FORWARD);
        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightRear.setDirection(DcMotorSimple.Direction.REVERSE);

        leftFront.setPower(0);
        leftRear.setPower(0);
        rightFront.setPower(0);
        rightFront.setPower(0);


    }


    public Robot(){}
    @Override
    public void runOpMode(){}
}
