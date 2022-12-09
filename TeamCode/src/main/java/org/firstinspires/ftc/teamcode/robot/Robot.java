package org.firstinspires.ftc.teamcode.robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot extends LinearOpMode {

    public DcMotor rightF, leftF, rightB, leftB;

    public Servo claw ;

    public void initialize(){

        leftF = hardwareMap.get (DcMotor.class, "leftFront");
        rightF = hardwareMap.get (DcMotor.class, "rightFront");
        rightB = hardwareMap.get (DcMotor.class, "rightRear");
        leftB = hardwareMap.get (DcMotor.class, "rightRear");
        claw = hardwareMap.get (Servo.class, "claw");

        leftF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftF.setDirection(DcMotorSimple.Direction.FORWARD);
        rightF.setDirection(DcMotorSimple.Direction.REVERSE);
        leftB.setDirection(DcMotorSimple.Direction.FORWARD);
        rightB.setDirection(DcMotorSimple.Direction.REVERSE);

        leftF.setPower(0);
        rightF.setPower(0);
        leftB.setPower(0);
        rightB.setPower(0);


    }


    public Robot(){}
    @Override
    public void runOpMode(){}
}
