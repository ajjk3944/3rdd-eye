package lu;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class p extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15953a;

    /* renamed from: d, reason: collision with root package name */
    public final String f15954d;

    public p(Serializable serializable, boolean z10) {
        br.l.e(serializable, "body");
        this.f15953a = z10;
        this.f15954d = serializable.toString();
    }

    @Override // lu.a0
    public final String a() {
        return this.f15954d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f15953a == pVar.f15953a && br.l.a(this.f15954d, pVar.f15954d);
    }

    public final int hashCode() {
        return this.f15954d.hashCode() + (Boolean.hashCode(this.f15953a) * 31);
    }

    @Override // lu.a0
    public final String toString() {
        boolean z10 = this.f15953a;
        String str = this.f15954d;
        if (!z10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        mu.a0.a(str, sb2);
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }
}
