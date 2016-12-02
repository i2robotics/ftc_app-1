package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Helpers.RobotControl;

/**
 * Created by Nathanael on 10/29/2016.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="AutoTest2", group="Linear Opmode")  // @Autonomous(...) is the other common choice

public class AutoTest2 extends LinearOpMode {

    //RobotControl robot;
    public ElapsedTime runtime;
    RobotControl robot;
    ColorSensor colorEast;

    public void runOpMode() throws InterruptedException {
        this.colorEast = this.hardwareMap.colorSensor.get("colorEast");
        robot = new RobotControl(this);
        robot.buttonPressEast.setPosition(.9);
        //robot.colorEast.setI2cAddress(I2cAddr.create8bit(0x6c));
        colorEast.enableLed(true);

        robot.gyro.calibrate();
        telemetry.addData("Sensor", colorEast.blue());
        telemetry.update();
        waitForStart();
//        while(robot.eLineSensor.getVoltage() < 1.5 || robot.wLineSensor.getVoltage()  < 1.5){
//            if(!opModeIsActive()) return;
//
//
//            if(robot.eLineSensor.getVoltage() < 1.5){
//                robot.nw.setPower(.2);
//                robot.sw.setPower(.2);
//            }
//            else{
//                robot.nw.setPower(-.2);
//                robot.sw.setPower(-.2);
//            }
//            if(robot.wLineSensor.getVoltage() < 1.5){
//                robot.ne.setPower(-.2);
//                robot.se.setPower(-.2);
//            }
//            else {
//                robot.ne.setPower(.2);
//                robot.se.setPower(.2);
//            }
//        }
//        robot.runtime.reset();
//        while (robot.runtime.milliseconds() < 2000) {
//
//            robot.drive(90, .75, 0);
//            //robot.drive(180,.5,robot.gyroRot());
//            //robot.drive(35, 1, 0);
//            if (!opModeIsActive()) return;
//            telemetry.addData("Sensor", robot.colorEast.blue());
//            telemetry.update();
//
//
//            if (robot.colorEast.blue() >= 2) {
//                if (!opModeIsActive()) return;
//                robot.buttonPressEast.setPosition(.9);
//                telemetry.addData("Sensor", robot.colorEast.blue());
//                telemetry.update();
//            }
//            else{
//                robot.buttonPressEast.setPosition(.627);
//            }
//
//
//            }
        robot.runtime.reset();
        while(robot.runtime.milliseconds() < 20000){
            if(!opModeIsActive()) return;
            telemetry.addData("Blue Color", colorEast.blue());
            telemetry.addData("All Color", colorEast.argb());

        }
        }




    }






