package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.Drive;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
    //functions	
    private VictorSP leftFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTFRONT);
    private VictorSP leftRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTREAR);
    
    private VictorSP rightFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
    private VictorSP rightRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTREAR);
	
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
    
    public void tankDrive(double right, double left){
    	rightFwd.set(right);
    	rightRwd.set(right);
    	
    	//Motors are mirrored
    	leftFwd.set(-left);
    	leftRwd.set(-left);
    }
    
    public void stop(){
    	tankDrive(0,0);
    }
}

