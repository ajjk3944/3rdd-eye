package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f784d;

    /* renamed from: e, reason: collision with root package name */
    public final int f785e;

    /* renamed from: f, reason: collision with root package name */
    public final int f786f;

    /* renamed from: g, reason: collision with root package name */
    public final String f787g;

    /* renamed from: h, reason: collision with root package name */
    public final List f788h;

    /* renamed from: i, reason: collision with root package name */
    public final List f789i;
    public final List j;

    public x0(int i10, int i11, int i12, int i13, int i14, int i15, String str, List list, List list2, List list3) {
        br.l.e(list, "downloadServers");
        br.l.e(list2, "uploadServers");
        br.l.e(list3, "latencyServers");
        this.f781a = i10;
        this.f782b = i11;
        this.f783c = i12;
        this.f784d = i13;
        this.f785e = i14;
        this.f786f = i15;
        this.f787g = str;
        this.f788h = list;
        this.f789i = list2;
        this.j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f781a == x0Var.f781a && this.f782b == x0Var.f782b && this.f783c == x0Var.f783c && this.f784d == x0Var.f784d && this.f785e == x0Var.f785e && this.f786f == x0Var.f786f && br.l.a(this.f787g, x0Var.f787g) && br.l.a(this.f788h, x0Var.f788h) && br.l.a(this.f789i, x0Var.f789i) && br.l.a(this.j, x0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + h0.b.c(h0.b.c(c7.a.g(this.f787g, c7.a.C(this.f786f, c7.a.C(this.f785e, c7.a.C(this.f784d, c7.a.C(this.f783c, c7.a.C(this.f782b, Integer.hashCode(this.f781a) * 31, 31), 31), 31), 31), 31), 31), 31, this.f788h), 31, this.f789i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TestConfig(serverSelectionLatencyThreshold=");
        sb2.append(this.f781a);
        sb2.append(", serverSelectionLatencyThreshold2g=");
        sb2.append(this.f782b);
        sb2.append(", serverSelectionLatencyThreshold2gp=");
        sb2.append(this.f783c);
        sb2.append(", serverSelectionLatencyThreshold3g=");
        sb2.append(this.f784d);
        sb2.append(", serverSelectionLatencyThreshold3gp=");
        sb2.append(this.f785e);
        sb2.append(", serverSelectionLatencyThreshold4g=");
        sb2.append(this.f786f);
        sb2.append(", serverSelectionMethod=");
        sb2.append(this.f787g);
        sb2.append(", downloadServers=");
        sb2.append(this.f788h);
        sb2.append(", uploadServers=");
        sb2.append(this.f789i);
        sb2.append(", latencyServers=");
        return h0.b.t(sb2, this.j, ')');
    }
}
