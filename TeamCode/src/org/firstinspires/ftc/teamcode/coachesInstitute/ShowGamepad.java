package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group="@Coaches Institute")
public class ShowGamepad extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Programmer", "Coach Alan");
    }

    @Override
    public void loop() {
        telemetry.addData("Left X", gamepad1.left_stick_x);
        telemetry.addData("Left Y", gamepad1.left_stick_y);

    }
}
