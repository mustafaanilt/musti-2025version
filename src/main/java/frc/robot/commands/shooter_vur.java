package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Peripheral; // Adjust the package name as necessary

public class shooter_vur extends Command{
    private final Peripheral shooter;
    public shooter_vur(Peripheral shooter){
        this.shooter = shooter;
        addRequirements(shooter);
    }
    
    @Override
    public void initialize(){

    }
    @Override
    public void execute(){
        shooter.shooterTukur();
    }
    @Override
    public void end(boolean interrupt){
        shooter.shooterDurdur();
    }
    @Override
    public boolean isFinished(){
        shooter.shooterDurdur();
        return false;
    }
    
}
