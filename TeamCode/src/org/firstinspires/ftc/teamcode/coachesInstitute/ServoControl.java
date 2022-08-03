package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group="@CoachesInstitute")
public class ServoControl extends OpMode {
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
        servo.setPosition(leftY);

    }
}
