package k1;

import T1.B;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModelImpl.kt */
/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5208b {

    /* renamed from: a, reason: collision with root package name */
    public final B f43150a = new B();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f43151b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f43152c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f43153d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }
}
