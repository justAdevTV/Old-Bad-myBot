package org.usfirst.frc.team4.robot;

import org.usfirst.frc.team4.robot.commands.ArmToggle;
import org.usfirst.frc.team4.robot.commands.ClawToggle;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public OI() {
		RobotMap.opA.toggleWhenPressed(new ClawToggle());
		RobotMap.opB.toggleWhenPressed(new ArmToggle());
	}

	public double rightY(Joystick cont) {
		return (cont.getRawAxis(RobotMap.CONT_RY));
	}

	public double leftY(Joystick cont) {
		return (cont.getRawAxis(RobotMap.CONT_LY));
	}
}
