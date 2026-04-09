package io.sentry.cache.tape;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f12141c = new g(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f12142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12143b;

    public g(int i10, long j) {
        this.f12142a = j;
        this.f12143b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g.class.getSimpleName());
        sb2.append("[position=");
        sb2.append(this.f12142a);
        sb2.append(", length=");
        return h0.b.i(this.f12143b, "]", sb2);
    }
}
