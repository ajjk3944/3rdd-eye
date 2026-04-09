package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wi0 implements OnBackAnimationCallback {
    public final /* synthetic */ ui0 a;
    public final /* synthetic */ ui0 b;
    public final /* synthetic */ vi0 c;
    public final /* synthetic */ vi0 d;

    public wi0(ui0 ui0Var, ui0 ui0Var2, vi0 vi0Var, vi0 vi0Var2) {
        this.a = ui0Var;
        this.b = ui0Var2;
        this.c = vi0Var;
        this.d = vi0Var2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        this.b.g(new f9(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        this.a.g(new f9(backEvent));
    }
}
