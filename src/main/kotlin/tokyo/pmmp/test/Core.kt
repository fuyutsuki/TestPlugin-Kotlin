package tokyo.pmmp.test

import cn.nukkit.plugin.PluginBase
import cn.nukkit.utils.TextFormat

class Core : PluginBase() {

    override fun onEnable() {
        logger.info(TextFormat.GREEN.toString() + "ことりん(・8・)")
    }

    override fun onDisable() {
        logger.info(TextFormat.RED.toString() + "さよならちゅん(・8・)")
    }
}