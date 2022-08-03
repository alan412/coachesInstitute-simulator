package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group="@CoachesInstitute")
public class ServoButton2 extends OpMode {
    Servo servo;

    @Override
    public void init() {
        telemetry.addData("programmer", "Alan");
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        double leftY = -gamepad1.left_stick_y;
        telemetry.addData("Left Stick Y", leftY);
        if(gamepad1.y){
            servo.setPosition(0.5);
        }
        else if(gamepad1.b){
            servo.setPosition(0.0);
        }
    }
}
