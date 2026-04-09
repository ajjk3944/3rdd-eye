package b2;

import N7.H7;

/* compiled from: SystemIdInfo.kt */
/* renamed from: b2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1828i {

    /* renamed from: a, reason: collision with root package name */
    public final String f17119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17121c;

    public C1828i(String workSpecId, int i, int i10) {
        kotlin.jvm.internal.l.f(workSpecId, "workSpecId");
        this.f17119a = workSpecId;
        this.f17120b = i;
        this.f17121c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1828i)) {
            return false;
        }
        C1828i c1828i = (C1828i) obj;
        return kotlin.jvm.internal.l.b(this.f17119a, c1828i.f17119a) && this.f17120b == c1828i.f17120b && this.f17121c == c1828i.f17121c;
    }

    public final int hashCode() {
        return (((this.f17119a.hashCode() * 31) + this.f17120b) * 31) + this.f17121c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f17119a);
        sb.append(", generation=");
        sb.append(this.f17120b);
        sb.append(", systemId=");
        return H7.p(sb, this.f17121c, ')');
    }
}
