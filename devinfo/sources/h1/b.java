package h1;

import com.google.android.gms.internal.measurement.d5;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f24801a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f24802b;

    public b(int i4, d5 d5Var, Integer num) {
        this.f24801a = i4;
        this.f24802b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24801a == bVar.f24801a && k.a(null, null) && k.a(this.f24802b, bVar.f24802b);
    }

    public final int hashCode() {
        int i4 = ((this.f24801a * 31) + 0) * 31;
        Integer num = this.f24802b;
        return i4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f24801a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f24802b + ')';
    }
}
