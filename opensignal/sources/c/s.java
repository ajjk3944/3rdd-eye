package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ar.k f3043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ar.k f3044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar.a f3045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ar.a f3046d;

    public s(ar.k kVar, ar.k kVar2, ar.a aVar, ar.a aVar2) {
        this.f3043a = kVar;
        this.f3044b = kVar2;
        this.f3045c = aVar;
        this.f3046d = aVar2;
    }

    public final void onBackCancelled() {
        this.f3046d.c();
    }

    public final void onBackInvoked() {
        this.f3045c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        br.l.e(backEvent, "backEvent");
        this.f3044b.a(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        br.l.e(backEvent, "backEvent");
        this.f3043a.a(new b(backEvent));
    }
}
