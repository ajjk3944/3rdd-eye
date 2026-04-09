package w5;

import N7.C1154e9;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f47437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47440d;

    public q(int i, int i10, String str, boolean z10) {
        this.f47437a = str;
        this.f47438b = i;
        this.f47439c = i10;
        this.f47440d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.b(this.f47437a, qVar.f47437a) && this.f47438b == qVar.f47438b && this.f47439c == qVar.f47439c && this.f47440d == qVar.f47440d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = ((((this.f47437a.hashCode() * 31) + this.f47438b) * 31) + this.f47439c) * 31;
        boolean z10 = this.f47440d;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f47437a);
        sb.append(", pid=");
        sb.append(this.f47438b);
        sb.append(", importance=");
        sb.append(this.f47439c);
        sb.append(", isDefaultProcess=");
        return C1154e9.k(sb, this.f47440d, ')');
    }
}
