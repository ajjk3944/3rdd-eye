package rb;

import android.view.WindowManager;

/* loaded from: classes.dex */
public final class n implements m, s5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21492a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowManager f21493b;

    public /* synthetic */ n(WindowManager windowManager, int i10) {
        this.f21492a = i10;
        this.f21493b = windowManager;
    }

    @Override // rb.m, s5.f
    public final void a() {
        int i10 = this.f21492a;
    }

    @Override // s5.f
    public void b(io.sentry.android.replay.capture.e eVar) {
        eVar.c(this.f21493b.getDefaultDisplay());
    }

    @Override // rb.m
    public void c(io.sentry.android.replay.capture.e eVar) {
        eVar.c(this.f21493b.getDefaultDisplay());
    }

    private final void d() {
    }

    private final void e() {
    }
}
