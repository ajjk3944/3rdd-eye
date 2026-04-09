package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zz implements et0, u91, gt {
    public final Context f;
    public final ha1 g;
    public final v91 h;
    public final bo j;
    public boolean k;
    public Boolean m;
    public final HashSet i = new HashSet();
    public final Object l = new Object();

    static {
        h80.f("GreedyScheduler");
    }

    public zz(Context context, ru0 ru0Var, xb4 xb4Var, ha1 ha1Var) {
        this.f = context;
        this.g = ha1Var;
        this.h = new v91(context, xb4Var, this);
        this.j = new bo(this, (f20) ru0Var.h);
    }

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        synchronized (this.l) {
            try {
                Iterator it = this.i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    oa1 oa1Var = (oa1) it.next();
                    if (oa1Var.a.equals(str)) {
                        h80.d().a(new Throwable[0]);
                        this.i.remove(oa1Var);
                        this.h.b(this.i);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.et0
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.m;
        ha1 ha1Var = this.g;
        if (bool == null) {
            this.m = Boolean.valueOf(nm0.a(this.f, ha1Var.q));
        }
        if (!this.m.booleanValue()) {
            h80.d().e(new Throwable[0]);
            return;
        }
        if (!this.k) {
            ha1Var.u.b(this);
            this.k = true;
        }
        h80.d().a(new Throwable[0]);
        bo boVar = this.j;
        if (boVar != null && (runnable = (Runnable) boVar.c.remove(str)) != null) {
            ((Handler) boVar.b.g).removeCallbacks(runnable);
        }
        ha1Var.o0(str);
    }

    @Override // defpackage.u91
    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h80.d().a(new Throwable[0]);
            this.g.o0((String) obj);
        }
    }

    @Override // defpackage.et0
    public final void d(oa1... oa1VarArr) {
        if (this.m == null) {
            this.m = Boolean.valueOf(nm0.a(this.f, this.g.q));
        }
        if (!this.m.booleanValue()) {
            h80.d().e(new Throwable[0]);
            return;
        }
        if (!this.k) {
            this.g.u.b(this);
            this.k = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (oa1 oa1Var : oa1VarArr) {
            long jA = oa1Var.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (oa1Var.b == 1) {
                if (jCurrentTimeMillis < jA) {
                    bo boVar = this.j;
                    if (boVar != null) {
                        f20 f20Var = boVar.b;
                        HashMap map = boVar.c;
                        Runnable runnable = (Runnable) map.remove(oa1Var.a);
                        if (runnable != null) {
                            ((Handler) f20Var.g).removeCallbacks(runnable);
                        }
                        jq3 jq3Var = new jq3(boVar, oa1Var, 10, false);
                        map.put(oa1Var.a, jq3Var);
                        ((Handler) f20Var.g).postDelayed(jq3Var, oa1Var.a() - System.currentTimeMillis());
                    }
                } else if (oa1Var.b()) {
                    ri riVar = oa1Var.j;
                    if (riVar.c) {
                        h80 h80VarD = h80.d();
                        oa1Var.toString();
                        h80VarD.a(new Throwable[0]);
                    } else if (riVar.h.a.size() > 0) {
                        h80 h80VarD2 = h80.d();
                        oa1Var.toString();
                        h80VarD2.a(new Throwable[0]);
                    } else {
                        hashSet.add(oa1Var);
                        hashSet2.add(oa1Var.a);
                    }
                } else {
                    h80.d().a(new Throwable[0]);
                    this.g.n0(oa1Var.a, null);
                }
            }
        }
        synchronized (this.l) {
            try {
                if (!hashSet.isEmpty()) {
                    h80 h80VarD3 = h80.d();
                    TextUtils.join(",", hashSet2);
                    h80VarD3.a(new Throwable[0]);
                    this.i.addAll(hashSet);
                    this.h.b(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u91
    public final void e(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h80.d().a(new Throwable[0]);
            this.g.n0((String) obj, null);
        }
    }

    @Override // defpackage.et0
    public final boolean f() {
        return false;
    }
}
