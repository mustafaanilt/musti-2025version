package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Peripheral; // Adjust the package name as necessary

public class shooter_yukari extends Command{
    private final Peripheral shooter;
    public shooter_yukari(Peripheral shooter){
        this.shooter = shooter;
        addRequirements(shooter);
    }
    @Override
    public void initialize(){
    }
    @Override
    public void execute(){
        shooter.ShooteraciYukari();
    }
    @Override
    public void end(boolean interrupt){
        shooter.ShooteraciDurdur();
    }
    @Override
    public boolean isFinished(){
        shooter.ShooteraciDurdur();
        return false;
    }
    
}
