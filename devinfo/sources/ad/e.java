package ad;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f331b;

    public e(f fVar, b bVar) {
        this.f331b = fVar;
        this.f330a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f331b.f329a != null) {
            this.f330a.d();
        }
    }

    public final void onBackInvoked() {
        this.f330a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f331b.f329a != null) {
            this.f330a.a(new d.a(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f331b.f329a != null) {
            this.f330a.c(new d.a(backEvent));
        }
    }
}
