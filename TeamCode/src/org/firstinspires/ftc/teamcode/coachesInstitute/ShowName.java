package org.firstinspires.ftc.teamcode.coachesInstitute;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group="@CoachesInstitute")
public class ShowName extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Programmer", "Coach Alan");
    }

    @Override
    public void loop() {

    }
}
