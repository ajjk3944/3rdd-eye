package mi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: mi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6843d {
    public final InputStream a(String path) throws IOException {
        AbstractC6492s.i(path, "path");
        ClassLoader classLoader = C6843d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
