package io.sentry;

import java.util.Date;

/* loaded from: classes.dex */
public final class h5 extends k4 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f12311a;

    /* renamed from: d, reason: collision with root package name */
    public final long f12312d;

    public h5(Date date, long j) {
        this.f12311a = date;
        this.f12312d = j;
    }

    @Override // io.sentry.k4, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(k4 k4Var) {
        if (!(k4Var instanceof h5)) {
            return super.compareTo(k4Var);
        }
        h5 h5Var = (h5) k4Var;
        long time = this.f12311a.getTime();
        long time2 = h5Var.f12311a.getTime();
        return time == time2 ? Long.valueOf(this.f12312d).compareTo(Long.valueOf(h5Var.f12312d)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.k4
    public final long b(k4 k4Var) {
        return k4Var instanceof h5 ? this.f12312d - ((h5) k4Var).f12312d : super.b(k4Var);
    }

    @Override // io.sentry.k4
    public final long c(k4 k4Var) {
        if (k4Var == null || !(k4Var instanceof h5)) {
            return super.c(k4Var);
        }
        h5 h5Var = (h5) k4Var;
        long j = h5Var.f12312d;
        int iCompareTo = compareTo(k4Var);
        long j7 = this.f12312d;
        if (iCompareTo < 0) {
            return d() + (j - j7);
        }
        return h5Var.d() + (j7 - j);
    }

    @Override // io.sentry.k4
    public final long d() {
        return this.f12311a.getTime() * 1000000;
    }

    public h5() {
        this(dr.a.q(), System.nanoTime());
    }
}
