package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group="@CoachesInstitute")
public class ServoControlTrigger extends OpMode {
   Servo servo;

   @Override
   public void init() {
       telemetry.addData("Programmer(s)", "Alan");
       servo = hardwareMap.get(Servo.class, "servo");
   }

   @Override
   public void loop() {
       telemetry.addData("Left Trigger", gamepad1.left_trigger);
       servo.setPosition(gamepad1.left_trigger);
   }
}
