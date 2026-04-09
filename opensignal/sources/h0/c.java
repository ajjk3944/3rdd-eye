package h0;

import g1.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f9673a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9674b;

    public c(long j, long j7) {
        this.f9673a = j;
        this.f9674b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r.c(this.f9673a, cVar.f9673a) && r.c(this.f9674b, cVar.f9674b);
    }

    public final int hashCode() {
        int i10 = r.f9270h;
        return Long.hashCode(this.f9674b) + (Long.hashCode(this.f9673a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        b.A(this.f9673a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) r.i(this.f9674b));
        sb2.append(')');
        return sb2.toString();
    }
}
