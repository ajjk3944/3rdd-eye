package c7;

import android.net.NetworkRequest;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2781b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2782a;

    static {
        String strG = v.g("NetworkRequestCompat");
        nk.k.d(strG, "tagWithPrefix(...)");
        f2781b = strG;
    }

    public h(NetworkRequest networkRequest) {
        this.f2782a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && nk.k.a(this.f2782a, ((h) obj).f2782a);
    }

    public final int hashCode() {
        Object obj = this.f2782a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f2782a + ')';
    }
}
