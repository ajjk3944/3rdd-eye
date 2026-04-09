package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tr2 {
    public int a;
    public py2 b;
    public x12 c;
    public View d;
    public List e;
    public c63 g;
    public Bundle h;
    public ag2 i;
    public ag2 j;
    public ag2 k;
    public xz2 l;
    public n70 m;
    public pd2 n;
    public View o;
    public View p;
    public u10 q;
    public double r;
    public b22 s;
    public b22 t;
    public String u;
    public float x;
    public String y;
    public final bw0 v = new bw0(0);
    public final bw0 w = new bw0(0);
    public List f = Collections.EMPTY_LIST;

    public static tr2 l(e72 e72Var) {
        sr2 sr2Var;
        e72 e72Var2;
        try {
            py2 py2VarO = e72Var.o();
            if (py2VarO == null) {
                e72Var2 = e72Var;
                sr2Var = null;
            } else {
                e72Var2 = e72Var;
                sr2Var = new sr2(py2VarO, e72Var2);
            }
            return m(sr2Var, e72Var2.p(), (View) n(e72Var2.q()), e72Var2.b(), e72Var2.c(), e72Var2.e(), e72Var2.u2(), e72Var2.j(), (View) n(e72Var2.m()), e72Var2.E(), e72Var2.i(), e72Var2.n(), e72Var2.k(), e72Var2.f(), e72Var2.g(), e72Var2.X());
        } catch (RemoteException unused) {
            gi2.q0(5);
            return null;
        }
    }

    public static tr2 m(sr2 sr2Var, x12 x12Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, u10 u10Var, String str4, String str5, double d, b22 b22Var, String str6, float f) {
        tr2 tr2Var = new tr2();
        tr2Var.a = 6;
        tr2Var.b = sr2Var;
        tr2Var.c = x12Var;
        tr2Var.d = view;
        tr2Var.o("headline", str);
        tr2Var.e = list;
        tr2Var.o("body", str2);
        tr2Var.h = bundle;
        tr2Var.o("call_to_action", str3);
        tr2Var.o = view2;
        tr2Var.q = u10Var;
        tr2Var.o("store", str4);
        tr2Var.o("price", str5);
        tr2Var.r = d;
        tr2Var.s = b22Var;
        tr2Var.o("advertiser", str6);
        synchronized (tr2Var) {
            tr2Var.x = f;
        }
        return tr2Var;
    }

    public static Object n(u10 u10Var) {
        if (u10Var == null) {
            return null;
        }
        return oi0.l1(u10Var);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final b22 b() {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.e.get(0);
        if (obj instanceof IBinder) {
            return p12.B3((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.u;
    }

    public final synchronized ag2 h() {
        return this.i;
    }

    public final synchronized ag2 i() {
        return this.j;
    }

    public final synchronized ag2 j() {
        return this.k;
    }

    public final synchronized xz2 k() {
        return this.l;
    }

    public final synchronized void o(String str, String str2) {
        if (str2 == null) {
            this.w.remove(str);
        } else {
            this.w.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.w.get(str);
    }

    public final synchronized int q() {
        return this.a;
    }

    public final synchronized py2 r() {
        return this.b;
    }

    public final synchronized x12 s() {
        return this.c;
    }
}
