package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {
    WPI_TalonSRX testMotor;

    public MotorSubsystem(){
    testMotor = new WPI_TalonSRX(Constants.k_TestMotorCANID);
    testMotor.configFactoryDefault();
    testMotor.setNeutralMode(NeutralMode.Brake);
}
public void testMotorSpin(){
 testMotor.set(Constants.k_testMotorSpeed);
}
public void testMotorBrake(){
 testMotor.set(0);
}
}
