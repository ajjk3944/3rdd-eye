package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gc4 {
    public final fc4 a;
    public final ec4 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public gc4(ec4 ec4Var, fc4 fc4Var, Looper looper) {
        this.b = ec4Var;
        this.a = fc4Var;
        this.e = looper;
    }

    public final void a() {
        zt0.b0(!this.f);
        this.f = true;
        jb4 jb4Var = (jb4) this.b;
        if (!jb4Var.M && jb4Var.o.getThread().isAlive()) {
            jb4Var.m.a(14, this).a();
        } else {
            a30.x("Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z) {
        notifyAll();
    }
}
