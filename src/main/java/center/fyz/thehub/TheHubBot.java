package center.fyz.thehub;

import net.drawer.plugin.Plugin;

public class TheHubBot extends Plugin {

    private static TheHubBot INSTANCE;

    public static TheHubBot getInstance() {
        return INSTANCE;
    }

    @Override
    public void onEnable(boolean reload) {
        INSTANCE = this;
    }
}
