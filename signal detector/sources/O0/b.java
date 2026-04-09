package o0;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f22665a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22666b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f22667c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f22668d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC1135f5.r(autoCloseable);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}
