package rl;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f33055c = new e(zj.n.v0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f33056a;

    /* renamed from: b, reason: collision with root package name */
    public final a.a f33057b;

    public e(Set set, a.a aVar) {
        this.f33056a = set;
        this.f33057b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return nk.k.a(eVar.f33056a, this.f33056a) && nk.k.a(eVar.f33057b, this.f33057b);
    }

    public final int hashCode() {
        int iHashCode = (this.f33056a.hashCode() + 1517) * 41;
        a.a aVar = this.f33057b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
