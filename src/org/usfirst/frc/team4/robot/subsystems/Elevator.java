package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.Robot;
import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.Lift;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
    
    private VictorSP eleUrMom = new VictorSP(RobotMap.ELEVATOR_MOTOR);
	
    public void initDefaultCommand() {
       setDefaultCommand(new Lift());
    }
    
    public void eleVator(double height){
    	eleUrMom.set(Robot.oi.leftY(RobotMap.opCont));
    }
    
    public void stop(){
    	eleVator(0);
    }
}

