package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;


public class drive extends SubsystemBase{
    TalonFX leftFrontTalon = new TalonFX(1);
    TalonFX rightFrontTalon = new TalonFX(3);
    TalonFX leftBackTalon = new TalonFX(2);
    TalonFX rightBackTalon = new TalonFX(4);

    private TalonFX leaderMotor1, followerMotor1, leaderMotor2, followerMotor2;
    public drive(){
        leaderMotor1 = new TalonFX(1);
        followerMotor1 = new TalonFX(2);
        leaderMotor2 = new TalonFX(3);
        followerMotor2 = new TalonFX(4);

        followerMotor1.set(ControlMode.Follower, leaderMotor1.getDeviceID());
        followerMotor1.setInverted(TalonFXInvertType.FollowMaster)
        //followerMotor2.set(ControlMode.Follower, leaderMotor2
        


    }

    MotorController left = new MotorControllerGroup(leftFrontTalon, leftBackTalon);
    MotorController right = new M
=    DifferentialDrive drive = new DifferentialDrive(left, right);
    DifferentialDrive drive2 = new DifferentialDrive(leftFrontTalon, leftBackTalon);
    public Joystick driverController = new Joystick(Constants.DRIVER_CONTROLLER);

    
   
    
}
