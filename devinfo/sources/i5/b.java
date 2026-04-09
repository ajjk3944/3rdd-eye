package i5;

import d.h;
import ec.z;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final z f25864a = new z(29);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f25865b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f25866c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f25867d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                h.B(autoCloseable);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
