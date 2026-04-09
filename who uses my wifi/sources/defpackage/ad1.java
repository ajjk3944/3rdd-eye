package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ad1 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ w9 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ w9 f;

    public ad1(w9 w9Var, int i, Bundle bundle) {
        this.f = w9Var;
        Boolean bool = Boolean.TRUE;
        this.c = w9Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract void a(rh rhVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.l) {
            this.c.l.remove(this);
        }
    }
}
