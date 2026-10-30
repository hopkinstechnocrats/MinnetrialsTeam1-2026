package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorSubsystem;
public class MotorCommands extends Command{

        public static Command spinMotor(MotorSubsystem motorSubsystem){
            return Commands.run(
                () -> {
                    motorSubsystem.testMotorSpin();
                },
                motorSubsystem);
        }
        public static Command brakeMotor(MotorSubsystem motorSubsystem){
            return Commands.run(
                () -> {
                    motorSubsystem.testMotorBrake();
                },
                motorSubsystem);
        }
}
