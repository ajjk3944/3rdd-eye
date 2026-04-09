package androidx.media3.common;

import java.io.IOException;

/* loaded from: classes.dex */
public class k0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1714a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1715d;

    public k0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f1714a = z10;
        this.f1715d = i10;
    }

    public static k0 a(Exception exc, String str) {
        return new k0(str, exc, true, 1);
    }

    public static k0 b(Exception exc, String str) {
        return new k0(str, exc, true, 4);
    }

    public static k0 c(String str) {
        return new k0(str, null, false, 1);
    }
}
