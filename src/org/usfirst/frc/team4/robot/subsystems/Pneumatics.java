package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
	
	public boolean isClawOpen = true;
	public boolean isArmOpen = true;
	
	private Compressor compressor = new Compressor(RobotMap.PNUEMATICS_COMPRESSOR);
    
    private DoubleSolenoid leftClaw = new DoubleSolenoid(RobotMap.PNEUMATICS_CLAW_LEFT_FWD, RobotMap.PNEUMATICS_CLAW_LEFT_RWD);
    private DoubleSolenoid rightClaw = new DoubleSolenoid(RobotMap.PNEUMATICS_CLAW_RIGHT_FWD, RobotMap.PNEUMATICS_CLAW_RIGHT_RWD);
    
    private DoubleSolenoid leftArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_LEFT_FWD, RobotMap.PNEUMATICS_ARM_LEFT_RWD);
    private DoubleSolenoid rightArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_RIGHT_FWD, RobotMap.PNEUMATICS_ARM_RIGHT_RWD);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void compStart(){
    	compressor.start();
    }
    
    public void compStop(){
    	compressor.stop();
    }
    
    public void clawOpen(){
    	leftClaw.set(DoubleSolenoid.Value.kForward);
    	rightClaw.set(DoubleSolenoid.Value.kForward);
    }
    
    public void clawClose(){
    	leftClaw.set(DoubleSolenoid.Value.kReverse);
    	rightClaw.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void armOpen(){
    	leftArm.set(DoubleSolenoid.Value.kForward);
    	rightArm.set(DoubleSolenoid.Value.kForward);
    }
    
    public void armClose(){
    	leftArm.set(DoubleSolenoid.Value.kReverse);
    	rightArm.set(DoubleSolenoid.Value.kReverse);
    }
}

