package gk;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final c f9613n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f9614o;

    /* renamed from: a, reason: collision with root package name */
    public final f f9615a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9616b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9617c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9618d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9619e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9620f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9621g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9622h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9623i;
    public final int j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9624l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9625m;

    static {
        c cVar = new c(null, 0L, 0L, 0, 0L, 0L, 0L, 0, false, false, 2019);
        f9613n = cVar;
        f9614o = a(cVar, 0L, 0L, 0L, 0L, 0, false, 6143);
    }

    public c(f fVar, long j, long j7, long j10, int i10, long j11, long j12, long j13, long j14, int i11, boolean z10, boolean z11, boolean z12) {
        l.e(fVar, "scheduleType");
        this.f9615a = fVar;
        this.f9616b = j;
        this.f9617c = j7;
        this.f9618d = j10;
        this.f9619e = i10;
        this.f9620f = j11;
        this.f9621g = j12;
        this.f9622h = j13;
        this.f9623i = j14;
        this.j = i11;
        this.k = z10;
        this.f9624l = z11;
        this.f9625m = z12;
    }

    public static c a(c cVar, long j, long j7, long j10, long j11, int i10, boolean z10, int i11) {
        f fVar = cVar.f9615a;
        long j12 = (i11 & 2) != 0 ? cVar.f9616b : j;
        long j13 = cVar.f9617c;
        long j14 = j12;
        long j15 = cVar.f9618d;
        int i12 = cVar.f9619e;
        long j16 = (i11 & 32) != 0 ? cVar.f9620f : j7;
        long j17 = (i11 & 64) != 0 ? cVar.f9621g : j10;
        long j18 = (i11 & 128) != 0 ? cVar.f9622h : j11;
        long j19 = cVar.f9623i;
        int i13 = (i11 & 512) != 0 ? cVar.j : i10;
        boolean z11 = (i11 & 1024) != 0 ? cVar.k : true;
        boolean z12 = (i11 & 2048) != 0 ? cVar.f9624l : true;
        boolean z13 = (i11 & 4096) != 0 ? cVar.f9625m : z10;
        cVar.getClass();
        l.e(fVar, "scheduleType");
        return new c(fVar, j14, j13, j15, i12, j16, j17, j18, j19, i13, z11, z12, z13);
    }

    public final boolean b() {
        return this.f9617c < 30000 && this.f9618d < 30000 && this.f9619e == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9615a == cVar.f9615a && this.f9616b == cVar.f9616b && this.f9617c == cVar.f9617c && this.f9618d == cVar.f9618d && this.f9619e == cVar.f9619e && this.f9620f == cVar.f9620f && this.f9621g == cVar.f9621g && this.f9622h == cVar.f9622h && this.f9623i == cVar.f9623i && this.j == cVar.j && this.k == cVar.k && this.f9624l == cVar.f9624l && this.f9625m == cVar.f9625m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9625m) + g.b(g.b(c7.a.C(this.j, h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.f9619e, h0.b.b(h0.b.b(h0.b.b(this.f9615a.hashCode() * 31, 31, this.f9616b), 31, this.f9617c), 31, this.f9618d), 31), 31, this.f9620f), 31, this.f9621g), 31, this.f9622h), 31, this.f9623i), 31), this.k, 31), this.f9624l, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Schedule(scheduleType=");
        sb2.append(this.f9615a);
        sb2.append(", timeAddedInMillis=");
        sb2.append(this.f9616b);
        sb2.append(", initialDelayInMillis=");
        sb2.append(this.f9617c);
        sb2.append(", repeatPeriodInMillis=");
        sb2.append(this.f9618d);
        sb2.append(", repeatCount=");
        sb2.append(this.f9619e);
        sb2.append(", startingExecutionTime=");
        sb2.append(this.f9620f);
        sb2.append(", lastSuccessfulExecutionTime=");
        sb2.append(this.f9621g);
        sb2.append(", scheduleExecutionTime=");
        sb2.append(this.f9622h);
        sb2.append(", spacingDelayInMillis=");
        sb2.append(this.f9623i);
        sb2.append(", currentExecutionCount=");
        sb2.append(this.j);
        sb2.append(", rescheduleForTriggers=");
        sb2.append(this.k);
        sb2.append(", manualExecution=");
        sb2.append(this.f9624l);
        sb2.append(", consentRequired=");
        return c7.a.r(sb2, this.f9625m, ')');
    }

    public /* synthetic */ c(f fVar, long j, long j7, int i10, long j10, long j11, long j12, int i11, boolean z10, boolean z11, int i12) {
        this((i12 & 1) != 0 ? f.FIXED_WINDOW : fVar, -1L, j, j7, i10, -1L, (i12 & 64) != 0 ? -1L : j10, (i12 & 128) != 0 ? -1L : j11, (i12 & 256) != 0 ? 0L : j12, (i12 & 512) != 0 ? 0 : i11, false, (i12 & 2048) != 0 ? false : z10, (i12 & 4096) != 0 ? true : z11);
    }
}
