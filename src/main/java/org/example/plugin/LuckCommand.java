package org.example.plugin;

import com.hypixel.hytale.protocol.GameMode;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.arguments.system.RequiredArg;
import com.hypixel.hytale.server.core.command.system.arguments.types.ArgTypes;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;

import javax.annotation.Nonnull;

public class LuckCommand extends CommandBase {
    private final RequiredArg<Double> messageArg;
    public LuckCommand() {
        super("luck", "Set a luck value between 0 and 1");
        this.setPermissionGroup(GameMode.Creative);
        this.messageArg = this.withRequiredArg("luck", "how lucky you are, affects magic item drops", ArgTypes.DOUBLE);

    }

    protected void executeSync(@Nonnull CommandContext ctx) {
        //ctx.sendMessage()
    }
}
