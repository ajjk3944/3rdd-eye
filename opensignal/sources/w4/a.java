package w4;

import ee.f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f24194a = new f(28);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f24195b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f24196c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f24197d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.o(autoCloseable);
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }
}
