package zc;

import android.os.Looper;

/* loaded from: classes.dex */
public final class e3 extends w {
    public final io.sentry.android.replay.gestures.c B;
    public final xr.a D;

    /* renamed from: r, reason: collision with root package name */
    public yh.a f26917r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26918x;

    /* renamed from: y, reason: collision with root package name */
    public final z7.j f26919y;

    public e3(c1 c1Var) {
        super(c1Var);
        this.f26918x = true;
        this.f26919y = new z7.j(4, this);
        this.B = new io.sentry.android.replay.gestures.c(this);
        this.D = new xr.a(this);
    }

    @Override // zc.w
    public final boolean v1() {
        return false;
    }

    public final void w1() {
        s1();
        if (this.f26917r == null) {
            this.f26917r = new yh.a(Looper.getMainLooper(), 1);
        }
    }
}
