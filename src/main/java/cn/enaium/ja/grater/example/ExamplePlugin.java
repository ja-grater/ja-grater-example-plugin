package cn.enaium.ja.grater.example;

import cn.enaiun.ja.grater.plugin.PluginInitialize;
import cn.enaiun.ja.grater.transformer.Transformer;

import java.util.Collections;
import java.util.List;

/**
 * @author Enaium
 */
public class ExamplePlugin implements PluginInitialize {

    @Override
    public void initialize() {
        System.out.println("Hello Example Plugin");
    }

    @Override
    public String getName() {
        return "ja-grater-example-plugin";
    }

    @Override
    public String getAuthor() {
        return "Enaium";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getDescription() {
        return "ja-grater-example-plugin";
    }

    @Override
    public List<Transformer> getTransformers() {
        return Collections.singletonList(new Transformer() {
            @Override
            public String target() {
                return "sun/launcher/LauncherHelper";
            }

            @Override
            public byte[] transform(ClassLoader classLoader, String s, byte[] bytes) throws Throwable {
                System.out.println("Transformer:" + s);
                return bytes;
            }
        });
    }
}
