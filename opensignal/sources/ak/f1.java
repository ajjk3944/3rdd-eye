package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f520a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f521b;

    /* renamed from: c, reason: collision with root package name */
    public final int f522c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f523d;

    public f1(List list, boolean z10, int i10, boolean z11) {
        br.l.e(list, "udpConfigItems");
        this.f520a = list;
        this.f521b = z10;
        this.f522c = i10;
        this.f523d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return br.l.a(this.f520a, f1Var.f520a) && this.f521b == f1Var.f521b && this.f522c == f1Var.f522c && this.f523d == f1Var.f523d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f523d) + c7.a.C(this.f522c, w.g.b(this.f520a.hashCode() * 31, this.f521b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpConfig(udpConfigItems=");
        sb2.append(this.f520a);
        sb2.append(", packetSendingOffsetEnabled=");
        sb2.append(this.f521b);
        sb2.append(", testCompletionMethod=");
        sb2.append(this.f522c);
        sb2.append(", createPacketsBeforeTest=");
        return c7.a.r(sb2, this.f523d, ')');
    }
}
