package kj;

import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import pj.InterfaceC7379a;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static org.eclipse.paho.client.mqttv3.logging.a f51638a = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", q.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    private static final ServiceLoader f51639b = ServiceLoader.load(InterfaceC7379a.class, q.class.getClassLoader());

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f51640c = Pattern.compile("((.+)@)?([^:]*)(:(\\d+))?");

    public static void a(URI uri) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (uri == null || uri.getHost() != null || uri.getAuthority() == null || uri.getAuthority().isEmpty()) {
            return;
        }
        Matcher matcher = f51640c.matcher(uri.getAuthority());
        if (matcher.find()) {
            c(uri, "userInfo", matcher.group(2));
            c(uri, "host", matcher.group(3));
            String strGroup = matcher.group(5);
            c(uri, "port", Integer.valueOf(strGroup != null ? Integer.parseInt(strGroup) : -1));
        }
    }

    public static p b(String str, MqttConnectOptions mqttConnectOptions, String str2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            URI uri = new URI(str);
            a(uri);
            String lowerCase = uri.getScheme().toLowerCase();
            ServiceLoader serviceLoader = f51639b;
            synchronized (serviceLoader) {
                try {
                    Iterator it = serviceLoader.iterator();
                    while (it.hasNext()) {
                        InterfaceC7379a interfaceC7379a = (InterfaceC7379a) it.next();
                        if (interfaceC7379a.a().contains(lowerCase)) {
                            return interfaceC7379a.b(uri, mqttConnectOptions, str2);
                        }
                    }
                    throw new IllegalArgumentException(uri.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(str, e10);
        }
    }

    private static void c(URI uri, String str, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = URI.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(uri, obj);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e10) {
            f51638a.warning(q.class.getName(), "setURIField", "115", new Object[]{uri.toString()}, e10);
        }
    }

    public static void d(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || scheme.isEmpty()) {
                throw new IllegalArgumentException("missing scheme in broker URI: " + str);
            }
            String lowerCase = scheme.toLowerCase();
            ServiceLoader serviceLoader = f51639b;
            synchronized (serviceLoader) {
                try {
                    Iterator it = serviceLoader.iterator();
                    while (it.hasNext()) {
                        InterfaceC7379a interfaceC7379a = (InterfaceC7379a) it.next();
                        if (interfaceC7379a.a().contains(lowerCase)) {
                            interfaceC7379a.c(uri);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("no NetworkModule installed for scheme \"" + lowerCase + "\" of URI \"" + str + "\"");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Can't parse string to URI \"" + str + "\"", e10);
        }
    }
}
