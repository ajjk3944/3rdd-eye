package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31914b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31915c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31916d;

    /* renamed from: e, reason: collision with root package name */
    public final k f31917e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31918f;
    public final String g;

    public w0(String str, String str2, int i4, long j, k kVar, String str3, String str4) {
        nk.k.e(str, "sessionId");
        nk.k.e(str2, "firstSessionId");
        nk.k.e(str4, "firebaseAuthenticationToken");
        this.f31913a = str;
        this.f31914b = str2;
        this.f31915c = i4;
        this.f31916d = j;
        this.f31917e = kVar;
        this.f31918f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return nk.k.a(this.f31913a, w0Var.f31913a) && nk.k.a(this.f31914b, w0Var.f31914b) && this.f31915c == w0Var.f31915c && this.f31916d == w0Var.f31916d && nk.k.a(this.f31917e, w0Var.f31917e) && nk.k.a(this.f31918f, w0Var.f31918f) && nk.k.a(this.g, w0Var.g);
    }

    public final int hashCode() {
        int iM = (je.u.m(this.f31913a.hashCode() * 31, 31, this.f31914b) + this.f31915c) * 31;
        long j = this.f31916d;
        return this.g.hashCode() + je.u.m((this.f31917e.hashCode() + ((iM + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f31918f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f31913a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f31914b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f31915c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f31916d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f31917e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f31918f);
        sb2.append(", firebaseAuthenticationToken=");
        return r5.c.l(sb2, this.g, ')');
    }
}
