package yj;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37641a;

    public static final Throwable a(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).f37640a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return nk.k.a(this.f37641a, ((l) obj).f37641a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f37641a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f37641a;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
