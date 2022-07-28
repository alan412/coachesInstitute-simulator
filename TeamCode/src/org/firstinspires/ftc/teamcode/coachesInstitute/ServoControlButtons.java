package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group="@CoachesInstitute")
public class ServoControlButtons extends OpMode {
   Servo servo;

   @Override
   public void init() {
       telemetry.addData("Programmer(s)", "Alan");
       servo = hardwareMap.get(Servo.class, "servo");
   }

   @Override
   public void loop() {
       if(gamepad1.x){
           servo.setPosition(1.0);
           telemetry.addLine("Left");
       }
       else if(gamepad1.y){
           servo.setPosition(0.5);
           telemetry.addLine("Middle");
       }
       else if(gamepad1.b){
           servo.setPosition(0.0);
           telemetry.addLine("Right");
       }
   }
}
