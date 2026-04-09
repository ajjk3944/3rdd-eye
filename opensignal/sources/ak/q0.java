package ak;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f641a;

    /* renamed from: b, reason: collision with root package name */
    public final int f642b;

    /* renamed from: c, reason: collision with root package name */
    public final int f643c;

    /* renamed from: d, reason: collision with root package name */
    public final long f644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f645e;

    /* renamed from: f, reason: collision with root package name */
    public final int f646f;

    /* renamed from: g, reason: collision with root package name */
    public final String f647g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f648h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f649i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f650l;

    public q0(ArrayList arrayList, int i10, int i11, long j, int i12, int i13, String str, boolean z10, Integer num, Integer num2, Integer num3, Integer num4) {
        br.l.e(str, "testServerDefault");
        this.f641a = arrayList;
        this.f642b = i10;
        this.f643c = i11;
        this.f644d = j;
        this.f645e = i12;
        this.f646f = i13;
        this.f647g = str;
        this.f648h = z10;
        this.f649i = num;
        this.j = num2;
        this.k = num3;
        this.f650l = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return br.l.a(this.f641a, q0Var.f641a) && this.f642b == q0Var.f642b && this.f643c == q0Var.f643c && this.f644d == q0Var.f644d && this.f645e == q0Var.f645e && this.f646f == q0Var.f646f && br.l.a(this.f647g, q0Var.f647g) && this.f648h == q0Var.f648h && br.l.a(this.f649i, q0Var.f649i) && br.l.a(this.j, q0Var.j) && br.l.a(this.k, q0Var.k) && br.l.a(this.f650l, q0Var.f650l);
    }

    public final int hashCode() {
        int iB = w.g.b(c7.a.g(this.f647g, c7.a.C(this.f646f, c7.a.C(this.f645e, h0.b.b(c7.a.C(this.f643c, c7.a.C(this.f642b, this.f641a.hashCode() * 31, 31), 31), 31, this.f644d), 31), 31), 31), this.f648h, 31);
        Integer num = this.f649i;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f650l;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServerResponseTestConfig(testServers=");
        sb2.append(this.f641a);
        sb2.append(", packetSizeBytes=");
        sb2.append(this.f642b);
        sb2.append(", packetCount=");
        sb2.append(this.f643c);
        sb2.append(", timeoutMs=");
        sb2.append(this.f644d);
        sb2.append(", packetDelayMs=");
        sb2.append(this.f645e);
        sb2.append(", port=");
        sb2.append(this.f646f);
        sb2.append(", testServerDefault=");
        sb2.append(this.f647g);
        sb2.append(", randomizePayload=");
        sb2.append(this.f648h);
        sb2.append(", verificationVersion=");
        sb2.append(this.f649i);
        sb2.append(", verificationPacketsToSend=");
        sb2.append(this.j);
        sb2.append(", verificationPacketsSpacing=");
        sb2.append(this.k);
        sb2.append(", verificationPacketEncryption=");
        return w.g.i(sb2, this.f650l, ')');
    }
}
