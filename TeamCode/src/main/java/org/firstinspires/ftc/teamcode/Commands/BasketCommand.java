package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.Subsystems.ArmSubsystem;

public class BasketCommand extends CommandBase {

    private final ArmSubsystem armSubsystem;

    public BasketCommand(ArmSubsystem armSubsystem){

        this.armSubsystem = armSubsystem;
        addRequirements(armSubsystem);

    }

    @Override
    public void initialize(){

        armSubsystem.extendToBasket();

    }

    @Override
    public boolean isFinished(){

        return true;

    }

}