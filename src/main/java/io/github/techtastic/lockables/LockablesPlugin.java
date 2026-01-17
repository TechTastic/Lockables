package io.github.techtastic.lockables;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import io.github.techtastic.lockables.systems.AccessBlockPlacementSystem;
import io.github.techtastic.lockables.systems.PreventBlockDestructionSystem;
import io.github.techtastic.lockables.systems.PreventBlockUseSystem;

public class LockablesPlugin extends JavaPlugin {
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public LockablesPlugin(JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Hello from %s version %s", this.getName(), this.getManifest().getVersion().toString());
    }

    @Override
    protected void setup() {


        this.getEntityStoreRegistry().registerSystem(new AccessBlockPlacementSystem());
        this.getEntityStoreRegistry().registerSystem(new PreventBlockDestructionSystem());
        this.getEntityStoreRegistry().registerSystem(new PreventBlockUseSystem());
    }
}
