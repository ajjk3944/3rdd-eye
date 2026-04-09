package z3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c.C0377b;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3019d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3017b f24469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3020e f24470b;

    public C3019d(C3020e c3020e, InterfaceC3017b interfaceC3017b) {
        this.f24470b = c3020e;
        this.f24469a = interfaceC3017b;
    }

    public final void onBackCancelled() {
        if (this.f24470b.f24468a != null) {
            this.f24469a.d();
        }
    }

    public final void onBackInvoked() {
        this.f24469a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f24470b.f24468a != null) {
            this.f24469a.c(new C0377b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f24470b.f24468a != null) {
            this.f24469a.a(new C0377b(backEvent));
        }
    }
}
