package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: c.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366F implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.l f5791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.l f5792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.a f5793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.a f5794d;

    public C0366F(p5.l lVar, p5.l lVar2, p5.a aVar, p5.a aVar2) {
        this.f5791a = lVar;
        this.f5792b = lVar2;
        this.f5793c = aVar;
        this.f5794d = aVar2;
    }

    public final void onBackCancelled() {
        this.f5794d.b();
    }

    public final void onBackInvoked() {
        this.f5793c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        this.f5792b.f(new C0377b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        this.f5791a.f(new C0377b(backEvent));
    }
}
