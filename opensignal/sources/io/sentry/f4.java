package io.sentry;

/* loaded from: classes.dex */
public final class f4 implements l4 {

    /* renamed from: a, reason: collision with root package name */
    public final l4 f12251a;

    public f4() {
        if (io.sentry.util.g.f12810a || !io.sentry.util.g.f12811b) {
            this.f12251a = new y4(1);
        } else {
            this.f12251a = new y4(0);
        }
    }

    @Override // io.sentry.l4
    public final k4 a() {
        return this.f12251a.a();
    }
}
