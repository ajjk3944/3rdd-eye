package rj;

import br.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f21549a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21550b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21551c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21552d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21553e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21554f;

    public b(long j, long j7, long j10, String str, String str2, String str3) {
        l.e(str, "taskName");
        l.e(str2, "type");
        this.f21549a = j;
        this.f21550b = j7;
        this.f21551c = str;
        this.f21552d = str2;
        this.f21553e = j10;
        this.f21554f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21549a == bVar.f21549a && this.f21550b == bVar.f21550b && l.a(this.f21551c, bVar.f21551c) && l.a(this.f21552d, bVar.f21552d) && this.f21553e == bVar.f21553e && l.a(this.f21554f, bVar.f21554f);
    }

    public final int hashCode() {
        return this.f21554f.hashCode() + h0.b.b(c7.a.g(this.f21552d, c7.a.g(this.f21551c, h0.b.b(Long.hashCode(this.f21549a) * 31, 31, this.f21550b), 31), 31), 31, this.f21553e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobResultTableRow(id=");
        sb2.append(this.f21549a);
        sb2.append(", taskId=");
        sb2.append(this.f21550b);
        sb2.append(", taskName=");
        sb2.append(this.f21551c);
        sb2.append(", type=");
        sb2.append(this.f21552d);
        sb2.append(", timeInMillis=");
        sb2.append(this.f21553e);
        sb2.append(", data=");
        return h0.b.r(sb2, this.f21554f, ')');
    }
}
