// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc112.robotbuilder2018practicerobot.subsystems;

import org.usfirst.frc112.robotbuilder2018practicerobot.RobotMap;
import org.usfirst.frc112.robotbuilder2018practicerobot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX rightMotorFrontTalonSRX1 = RobotMap.driveTrainRightMotorFrontTalonSRX1;
    private final WPI_VictorSPX rightMotorMiddleVictorSPX20 = RobotMap.driveTrainRightMotorMiddleVictorSPX20;
    private final WPI_VictorSPX rightMotorRearVictorSPX21 = RobotMap.driveTrainRightMotorRearVictorSPX21;
    private final SpeedControllerGroup rightDriveGroup = RobotMap.driveTrainRightDriveGroup;
    private final WPI_TalonSRX leftMotorFrontTalonSRX2 = RobotMap.driveTrainLeftMotorFrontTalonSRX2;
    private final WPI_VictorSPX leftMotorMiddleVictorSPX22 = RobotMap.driveTrainLeftMotorMiddleVictorSPX22;
    private final WPI_VictorSPX leftMotorRearVictorSPX23 = RobotMap.driveTrainLeftMotorRearVictorSPX23;
    private final SpeedControllerGroup leftDriveGroup = RobotMap.driveTrainLeftDriveGroup;
    private final DifferentialDrive differentialDrive = RobotMap.driveTrainDifferentialDrive;
    private final Encoder leftEncoder = RobotMap.driveTrainLeftEncoder;
    private final Encoder rightEncoder = RobotMap.driveTrainRightEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new driveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void setLeftRightGroupSpeeds(double leftSpeed, double rightSpeed) {
    	leftDriveGroup.set(leftSpeed);
    	rightDriveGroup.set(rightSpeed);
    }
    public void stop() {
    	leftDriveGroup.set(0);
    	rightDriveGroup.set(0);
    }

}

