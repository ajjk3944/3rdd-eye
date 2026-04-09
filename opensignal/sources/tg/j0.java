package tg;

/* loaded from: classes.dex */
public final class j0 {
    public static final i0 Companion = new i0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22806a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22808c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22809d;

    public /* synthetic */ j0(int i10, String str, String str2, int i11, long j) {
        if (15 != (i10 & 15)) {
            ku.p0.f(i10, 15, h0.f22791a.getDescriptor());
            throw null;
        }
        this.f22806a = str;
        this.f22807b = str2;
        this.f22808c = i11;
        this.f22809d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return br.l.a(this.f22806a, j0Var.f22806a) && br.l.a(this.f22807b, j0Var.f22807b) && this.f22808c == j0Var.f22808c && this.f22809d == j0Var.f22809d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22809d) + c7.a.C(this.f22808c, c7.a.g(this.f22807b, this.f22806a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionDetails(sessionId=");
        sb2.append(this.f22806a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f22807b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f22808c);
        sb2.append(", sessionStartTimestampUs=");
        return w.g.h(sb2, this.f22809d, ')');
    }

    public j0(int i10, long j, String str, String str2) {
        this.f22806a = str;
        this.f22807b = str2;
        this.f22808c = i10;
        this.f22809d = j;
    }
}
