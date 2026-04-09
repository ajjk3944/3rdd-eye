package b9;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class l<A, B> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final A f18083b;

    /* renamed from: c, reason: collision with root package name */
    public final B f18084c;

    public l(A a10, B b10) {
        this.f18083b = a10;
        this.f18084c = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.b(this.f18083b, lVar.f18083b) && kotlin.jvm.internal.l.b(this.f18084c, lVar.f18084c);
    }

    public final int hashCode() {
        A a10 = this.f18083b;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f18084c;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f18083b + ", " + this.f18084c + ')';
    }
}
