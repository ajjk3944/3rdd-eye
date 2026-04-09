package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n0 {
    public static final m0 Companion = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final String f31871a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31873c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31874d;

    public /* synthetic */ n0(int i4, String str, String str2, int i10, long j) {
        if (15 != (i4 & 15)) {
            ml.k.a(i4, 15, l0.f31863a.d());
            throw null;
        }
        this.f31871a = str;
        this.f31872b = str2;
        this.f31873c = i10;
        this.f31874d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return nk.k.a(this.f31871a, n0Var.f31871a) && nk.k.a(this.f31872b, n0Var.f31872b) && this.f31873c == n0Var.f31873c && this.f31874d == n0Var.f31874d;
    }

    public final int hashCode() {
        int iM = (je.u.m(this.f31871a.hashCode() * 31, 31, this.f31872b) + this.f31873c) * 31;
        long j = this.f31874d;
        return iM + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f31871a + ", firstSessionId=" + this.f31872b + ", sessionIndex=" + this.f31873c + ", sessionStartTimestampUs=" + this.f31874d + ')';
    }

    public n0(String str, String str2, int i4, long j) {
        this.f31871a = str;
        this.f31872b = str2;
        this.f31873c = i4;
        this.f31874d = j;
    }
}
