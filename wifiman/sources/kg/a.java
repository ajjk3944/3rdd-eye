package Kg;

import Lg.l;
import java.io.Closeable;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

/* loaded from: classes4.dex */
public abstract class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static String f10777a;

    /* renamed from: Kg.a$a, reason: collision with other inner class name */
    public interface InterfaceC0432a {
    }

    static {
        try {
            InputStream resourceAsStream = a.class.getClassLoader().getResourceAsStream("version.properties");
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                f10777a = properties.getProperty("jmdns.version");
                resourceAsStream.close();
            } catch (Throwable th2) {
                resourceAsStream.close();
                throw th2;
            }
        } catch (Exception unused) {
            f10777a = "VERSION MISSING";
        }
    }

    public static a f0(InetAddress inetAddress, String str) {
        return new l(inetAddress, str, 0L);
    }

    public abstract void b0(String str, e eVar);

    public abstract void d0(f fVar);

    public abstract void m0(d dVar);

    public abstract void n0(String str, e eVar);

    public abstract void o0(f fVar);

    public abstract void p0(d dVar);
}
