package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.Subsystems.ClawSubsystem;

public class CollectCommand extends CommandBase {

    private final ClawSubsystem clawSubsystem;

    public CollectCommand(ClawSubsystem clawSubsystem){

        this.clawSubsystem = clawSubsystem;
        addRequirements(clawSubsystem);

    }

    @Override
    public void initialize(){

        clawSubsystem.collectSample();

    }

    @Override
    public boolean isFinished(){

        return true;

    }


}
