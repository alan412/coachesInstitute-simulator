package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(group="@CoachesInstitute")
public class SlowerTurn1 extends OpMode {
   DcMotor leftMotor;
   DcMotor rightMotor;

   @Override
   public void init() {
       leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
       rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

       leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
       rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
       leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
   }

   @Override
   public void loop() {
       double forward = -gamepad1.left_stick_y;
       double right = gamepad1.left_stick_x / 2;
       double leftSpeed = forward + right;
       double rightSpeed = forward - right;

       double maxSpeed = 1.0;
       maxSpeed = Math.max(maxSpeed, Math.abs(leftSpeed));
       maxSpeed = Math.max(maxSpeed, Math.abs(rightSpeed));

       leftSpeed = leftSpeed / maxSpeed;
       rightSpeed = rightSpeed / maxSpeed;
       
       leftMotor.setPower(leftSpeed);
       rightMotor.setPower(rightSpeed);
      
       telemetry.addData("Left", leftSpeed);
       telemetry.addData("Right", rightSpeed);
   }
}

