package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.ArcadeDrive;
import org.usfirst.frc.team4.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {

	public boolean tank = true;

	private VictorSP m_leftFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTFRONT);
	private VictorSP m_leftRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTREAR);

	private VictorSP m_rightFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
	private VictorSP m_rightRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTREAR);

	public void initDefaultCommand() {
        if (tank){
        	setDefaultCommand(new TankDrive());
        } else {
        	setDefaultCommand(new ArcadeDrive());
        }
    }

	public void tankDrive(double right, double left) {
		rightSide(right);

		// Motors are mirrored
		leftSide(-left);
	}

	public void arcadeDrive(double x, double y) {
		if (x > .2) {
			rightSide(y - x);
			leftSide(-y - x);
		} else if (x < -.2) {
			rightSide(y + x);
			leftSide(-y + x);
		} else {
			rightSide(y);
			leftSide(-y);
		}
	}

	public void stop() {
		tankDrive(0, 0);
	}

	public void rightSide(double s) {
		m_rightFwd.set(s);
		m_rightRwd.set(s);
	}

	public void leftSide(double s) {
		m_leftFwd.set(s);
		m_leftRwd.set(s);
	}
}
