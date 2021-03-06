package de.hanamicode.somepatches.mixin;

import io.netty.handler.timeout.ReadTimeoutHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import de.hanamicode.somepatches.Config;

@Mixin(ReadTimeoutHandler.class)
public class MixinReadTimeoutHandler {
	@ModifyArg(method = "<init>(I)V", at = @At(
			value = "INVOKE",
			target = "io/netty/handler/timeout/ReadTimeoutHandler.<init>" +
					"(JLjava/util/concurrent/TimeUnit;)V"
	))
	private static long getTimeout(long timeout) {
		return timeout == 30 ? Config.getReadTimeout() : timeout;
	}
}
