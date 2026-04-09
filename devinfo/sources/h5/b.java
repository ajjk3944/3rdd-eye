package h5;

import java.util.LinkedHashMap;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24880a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return k.a(this.f24880a, ((b) obj).f24880a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24880a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f24880a + ')';
    }
}
