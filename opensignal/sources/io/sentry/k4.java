package io.sentry;

/* loaded from: classes.dex */
public abstract class k4 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k4 k4Var) {
        return Long.valueOf(d()).compareTo(Long.valueOf(k4Var.d()));
    }

    public long b(k4 k4Var) {
        return d() - k4Var.d();
    }

    public long c(k4 k4Var) {
        return (k4Var == null || compareTo(k4Var) >= 0) ? d() : k4Var.d();
    }

    public abstract long d();
}
