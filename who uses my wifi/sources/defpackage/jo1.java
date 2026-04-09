package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class jo1 implements Comparable {
    public final qo1 f;
    public final int g;
    public final String h;
    public final int i;
    public final Object j;
    public final lo1 k;
    public Integer l;
    public ko1 m;
    public boolean n;
    public ao1 o;
    public mc2 p;
    public final tg0 q;

    public jo1(int i, String str, lo1 lo1Var) {
        Uri uri;
        String host;
        this.f = qo1.c ? new qo1() : null;
        this.j = new Object();
        int iHashCode = 0;
        this.n = false;
        this.o = null;
        this.g = i;
        this.h = str;
        this.k = lo1Var;
        tg0 tg0Var = new tg0();
        tg0Var.a = 2500;
        this.q = tg0Var;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.i = iHashCode;
    }

    public final void a(String str) {
        if (qo1.c) {
            this.f.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        ko1 ko1Var = this.m;
        if (ko1Var != null) {
            HashSet hashSet = (HashSet) ko1Var.b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) ko1Var.i;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            ko1Var.c();
        }
        if (qo1.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new le1(this, str, id));
                return;
            }
            qo1 qo1Var = this.f;
            qo1Var.a(str, id);
            qo1Var.b(toString());
        }
    }

    public final void c() {
        ko1 ko1Var = this.m;
        if (ko1Var != null) {
            ko1Var.c();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.l.intValue() - ((jo1) obj).l.intValue();
    }

    public final String d() {
        int i = this.g;
        String str = this.h;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return ex0.l(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.j) {
            z = this.n;
        }
        return z;
    }

    public abstract rl h(ho1 ho1Var);

    public abstract void i(Object obj);

    public final void j(rl rlVar) {
        mc2 mc2Var;
        List list;
        synchronized (this.j) {
            mc2Var = this.p;
        }
        if (mc2Var != null) {
            ao1 ao1Var = (ao1) rlVar.h;
            if (ao1Var != null) {
                if (ao1Var.e >= System.currentTimeMillis()) {
                    String strD = d();
                    synchronized (mc2Var) {
                        list = (List) ((HashMap) mc2Var.g).remove(strD);
                    }
                    if (list != null) {
                        if (ro1.a) {
                            ro1.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strD);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((f20) mc2Var.j).l((jo1) it.next(), rlVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            mc2Var.q(this);
        }
    }

    public final void k() {
        mc2 mc2Var;
        synchronized (this.j) {
            mc2Var = this.p;
        }
        if (mc2Var != null) {
            mc2Var.q(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.i));
        synchronized (this.j) {
        }
        Integer num = this.l;
        String str = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        ex0.q(sb, "[ ] ", str, " ", strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}
