package b9;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class q<A, B, C> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final A f18093b;

    /* renamed from: c, reason: collision with root package name */
    public final B f18094c;

    /* renamed from: d, reason: collision with root package name */
    public final C f18095d;

    public q(A a10, B b10, C c10) {
        this.f18093b = a10;
        this.f18094c = b10;
        this.f18095d = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.b(this.f18093b, qVar.f18093b) && kotlin.jvm.internal.l.b(this.f18094c, qVar.f18094c) && kotlin.jvm.internal.l.b(this.f18095d, qVar.f18095d);
    }

    public final int hashCode() {
        A a10 = this.f18093b;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f18094c;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f18095d;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f18093b + ", " + this.f18094c + ", " + this.f18095d + ')';
    }
}
