package qf;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f32301a;

    public e(String str) {
        k.e(str, "sessionId");
        this.f32301a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.a(this.f32301a, ((e) obj).f32301a);
    }

    public final int hashCode() {
        return this.f32301a.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("SessionDetails(sessionId="), this.f32301a, ')');
    }
}
