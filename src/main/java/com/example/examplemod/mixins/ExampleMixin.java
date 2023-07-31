package com.example.examplemod.mixins;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("unused")
@Mixin(Player.class)
public class ExampleMixin {

    //Removes the turtle helmet water breathing effect
    @Inject(method = "turtleHelmetTick()V", at = @At("HEAD"), cancellable = true)
    private void injected(CallbackInfo ci) {
        ci.cancel();
    }
}
