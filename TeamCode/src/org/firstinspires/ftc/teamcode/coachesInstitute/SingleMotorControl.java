package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(group="@CoachesInstitute")
public class SingleMotorControl extends OpMode {
   DcMotor motor;

   @Override
   public void init() {
       telemetry.addData("Programmer(s)", "Alan");
       motor = hardwareMap.get(DcMotor.class, "motor");
       motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
   }

   @Override
   public void loop() {
       telemetry.addData("Left Y", gamepad1.left_stick_y);
       motor.setPower(-gamepad1.left_stick_y);
   }
}
