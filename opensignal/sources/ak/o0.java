package ak;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f626c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f627d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f628e;

    /* renamed from: f, reason: collision with root package name */
    public final String f629f;

    /* renamed from: g, reason: collision with root package name */
    public final long f630g;

    public o0(long j, long j7, int i10, boolean z10, boolean z11, String str, long j10) {
        this.f624a = j;
        this.f625b = j7;
        this.f626c = i10;
        this.f627d = z10;
        this.f628e = z11;
        this.f629f = str;
        this.f630g = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f624a == o0Var.f624a && this.f625b == o0Var.f625b && this.f626c == o0Var.f626c && this.f627d == o0Var.f627d && this.f628e == o0Var.f628e && br.l.a(this.f629f, o0Var.f629f) && this.f630g == o0Var.f630g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f630g) + c7.a.g(this.f629f, w.g.b(w.g.b(c7.a.C(this.f626c, h0.b.b(Long.hashCode(this.f624a) * 31, 31, this.f625b), 31), this.f627d, 31), this.f628e, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleConfig(initialDelayInMillis=");
        sb2.append(this.f624a);
        sb2.append(", repeatPeriodInMillis=");
        sb2.append(this.f625b);
        sb2.append(", repeatCount=");
        sb2.append(this.f626c);
        sb2.append(", manualExecution=");
        sb2.append(this.f627d);
        sb2.append(", consentRequired=");
        sb2.append(this.f628e);
        sb2.append(", scheduleType=");
        sb2.append(this.f629f);
        sb2.append(", spacingDelayInMillis=");
        return w.g.h(sb2, this.f630g, ')');
    }
}
