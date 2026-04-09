package i2;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* renamed from: i2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4434G<V> {

    /* renamed from: a, reason: collision with root package name */
    public final C4448h f38325a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f38326b;

    public C4434G(C4448h c4448h) {
        this.f38325a = c4448h;
        this.f38326b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4434G)) {
            return false;
        }
        C4434G c4434g = (C4434G) obj;
        C4448h c4448h = this.f38325a;
        if (c4448h != null && c4448h.equals(c4434g.f38325a)) {
            return true;
        }
        Throwable th = this.f38326b;
        if (th == null || c4434g.f38326b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38325a, this.f38326b});
    }

    public C4434G(Throwable th) {
        this.f38326b = th;
        this.f38325a = null;
    }
}
