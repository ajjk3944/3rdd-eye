package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.nm;
import com.yandex.mobile.ads.impl.rq1;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class op1<T> implements Comparable<op1<T>> {

    /* renamed from: b, reason: collision with root package name */
    private final gi2.a f31460b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31461c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31462d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31463e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f31464f;

    /* renamed from: g, reason: collision with root package name */
    private rq1.a f31465g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f31466h;
    private cq1 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31467j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31468k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f31469l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f31470m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f31471n;

    /* renamed from: o, reason: collision with root package name */
    private hr1 f31472o;

    /* renamed from: p, reason: collision with root package name */
    private nm.a f31473p;

    /* renamed from: q, reason: collision with root package name */
    private Object f31474q;

    /* renamed from: r, reason: collision with root package name */
    private b f31475r;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31476b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f31477c;

        public a(String str, long j4) {
            this.f31476b = str;
            this.f31477c = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            op1.this.f31460b.a(this.f31476b, this.f31477c);
            op1 op1Var = op1.this;
            op1Var.f31460b.a(op1Var.toString());
        }
    }

    public interface b {
    }

    public op1(int i, String str, rq1.a aVar) {
        this.f31460b = gi2.a.f27766c ? new gi2.a() : null;
        this.f31464f = new Object();
        this.f31467j = true;
        this.f31468k = false;
        this.f31469l = false;
        this.f31470m = false;
        this.f31471n = false;
        this.f31473p = null;
        this.f31461c = i;
        this.f31462d = str;
        this.f31465g = aVar;
        a(new h00());
        this.f31463e = b(str);
    }

    public abstract rq1<T> a(nc1 nc1Var);

    public abstract void a(T t10);

    public fi2 b(fi2 fi2Var) {
        return fi2Var;
    }

    public final void c(String str) {
        cq1 cq1Var = this.i;
        if (cq1Var != null) {
            cq1Var.b(this);
        }
        if (gi2.a.f27766c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.f31460b.a(str, id);
                this.f31460b.a(toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        op1 op1Var = (op1) obj;
        int iG = g();
        int iG2 = op1Var.g();
        return iG == iG2 ? this.f31466h.intValue() - op1Var.f31466h.intValue() : r8.a(iG2) - r8.a(iG);
    }

    public final String d() {
        String strL = l();
        int i = this.f31461c;
        if (i == 0 || i == -1) {
            return strL;
        }
        return Integer.toString(i) + '-' + strL;
    }

    public Map<String, String> e() throws th {
        return Collections.EMPTY_MAP;
    }

    public final int f() {
        return this.f31461c;
    }

    public int g() {
        return 2;
    }

    public final hr1 h() {
        return this.f31472o;
    }

    public final Object i() {
        return this.f31474q;
    }

    public final int j() {
        return this.f31472o.a();
    }

    public final int k() {
        return this.f31463e;
    }

    public String l() {
        return this.f31462d;
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f31464f) {
            z10 = this.f31469l;
        }
        return z10;
    }

    public final boolean n() {
        boolean z10;
        synchronized (this.f31464f) {
            z10 = this.f31468k;
        }
        return z10;
    }

    public final void o() {
        synchronized (this.f31464f) {
            this.f31469l = true;
        }
    }

    public final void p() {
        b bVar;
        synchronized (this.f31464f) {
            bVar = this.f31475r;
        }
        if (bVar != null) {
            ((ui2) bVar).b(this);
        }
    }

    public final void q() {
        this.f31467j = false;
    }

    public final void r() {
        this.f31471n = true;
    }

    public final void s() {
        this.f31470m = true;
    }

    public final boolean t() {
        return this.f31467j;
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f31463e);
        StringBuilder sb = new StringBuilder();
        sb.append(n() ? "[X] " : "[ ] ");
        sb.append(l());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(qp1.a(g()));
        sb.append(" ");
        sb.append(this.f31466h);
        return sb.toString();
    }

    public final boolean u() {
        return this.f31471n;
    }

    public final boolean v() {
        return this.f31470m;
    }

    public void a() {
        synchronized (this.f31464f) {
            this.f31468k = true;
            this.f31465g = null;
        }
    }

    public byte[] b() throws th {
        return null;
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final void a(fi2 fi2Var) {
        rq1.a aVar;
        synchronized (this.f31464f) {
            aVar = this.f31465g;
        }
        if (aVar != null) {
            aVar.a(fi2Var);
        }
    }

    public final void b(int i) {
        this.f31466h = Integer.valueOf(i);
    }

    public final void b(Object obj) {
        this.f31474q = obj;
    }

    public final nm.a c() {
        return this.f31473p;
    }

    public final void a(rq1<?> rq1Var) {
        b bVar;
        synchronized (this.f31464f) {
            bVar = this.f31475r;
        }
        if (bVar != null) {
            ((ui2) bVar).a(this, rq1Var);
        }
    }

    public final void a(int i) {
        cq1 cq1Var = this.i;
        if (cq1Var != null) {
            cq1Var.a(this, i);
        }
    }

    public final void a(nm.a aVar) {
        this.f31473p = aVar;
    }

    public final void a(b bVar) {
        synchronized (this.f31464f) {
            this.f31475r = bVar;
        }
    }

    public final void a(cq1 cq1Var) {
        this.i = cq1Var;
    }

    public final void a(h00 h00Var) {
        this.f31472o = h00Var;
    }

    public final void a(String str) {
        if (gi2.a.f27766c) {
            this.f31460b.a(str, Thread.currentThread().getId());
        }
    }
}
