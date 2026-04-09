package X1;

import N7.C1154e9;

/* compiled from: NetworkState.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13542c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13543d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f13540a = z10;
        this.f13541b = z11;
        this.f13542c = z12;
        this.f13543d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13540a == cVar.f13540a && this.f13541b == cVar.f13541b && this.f13542c == cVar.f13542c && this.f13543d == cVar.f13543d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z10 = this.f13540a;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        int i10 = i * 31;
        boolean z11 = this.f13541b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z12 = this.f13542c;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z13 = this.f13543d;
        return i14 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.f13540a);
        sb.append(", isValidated=");
        sb.append(this.f13541b);
        sb.append(", isMetered=");
        sb.append(this.f13542c);
        sb.append(", isNotRoaming=");
        return C1154e9.k(sb, this.f13543d, ')');
    }
}
