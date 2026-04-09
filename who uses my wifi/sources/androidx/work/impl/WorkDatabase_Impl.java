package androidx.work.impl;

import android.content.Context;
import defpackage.gw3;
import defpackage.h2;
import defpackage.jz0;
import defpackage.kz0;
import defpackage.l92;
import defpackage.mc2;
import defpackage.o30;
import defpackage.qm;
import defpackage.rl;
import defpackage.t83;
import defpackage.vg0;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;
    public volatile h2 l;
    public volatile l92 m;
    public volatile l92 n;
    public volatile t83 o;
    public volatile gw3 p;
    public volatile mc2 q;
    public volatile l92 r;

    @Override // defpackage.pq0
    public final o30 d() {
        return new o30(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.pq0
    public final kz0 e(qm qmVar) {
        l92 l92Var = new l92(qmVar, new vg0(8, this));
        Context context = (Context) qmVar.d;
        String str = (String) qmVar.e;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((jz0) qmVar.c).a(new rl(context, str, l92Var, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l92 i() {
        l92 l92Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new l92(this, 7);
                }
                l92Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l92Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l92 j() {
        l92 l92Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new l92(this, 11);
                }
                l92Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l92Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t83 k() {
        t83 t83Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new t83(this);
                }
                t83Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t83Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gw3 l() {
        gw3 gw3Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new gw3(this);
                }
                gw3Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gw3Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final mc2 m() {
        mc2 mc2Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new mc2(this);
                }
                mc2Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mc2Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h2 n() {
        h2 h2Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new h2(this);
                }
                h2Var = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l92 o() {
        l92 l92Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new l92(this, 15);
                }
                l92Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l92Var;
    }
}
