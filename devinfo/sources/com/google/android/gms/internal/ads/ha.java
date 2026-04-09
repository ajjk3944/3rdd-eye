package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ha implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final ma f11780a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11782c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11783d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11784e;

    /* renamed from: f, reason: collision with root package name */
    public final ja f11785f;
    public Integer g;

    /* renamed from: h, reason: collision with root package name */
    public c1.o f11786h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11787i;
    public x9 j;

    /* renamed from: k, reason: collision with root package name */
    public aw f11788k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.recyclerview.widget.z0 f11789l;

    public ha(int i4, String str, ja jaVar) {
        Uri uri;
        String host;
        this.f11780a = ma.f13826c ? new ma() : null;
        this.f11784e = new Object();
        int iHashCode = 0;
        this.f11787i = false;
        this.j = null;
        this.f11781b = i4;
        this.f11782c = str;
        this.f11785f = jaVar;
        androidx.recyclerview.widget.z0 z0Var = new androidx.recyclerview.widget.z0();
        z0Var.f1563a = 2500;
        this.f11789l = z0Var;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f11783d = iHashCode;
    }

    public final void a(String str) {
        if (ma.f13826c) {
            this.f11780a.a(Thread.currentThread().getId(), str);
        }
    }

    public final void b(String str) {
        c1.o oVar = this.f11786h;
        if (oVar != null) {
            HashSet hashSet = (HashSet) oVar.f2571c;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) oVar.f2569a;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            oVar.j();
        }
        if (ma.f13826c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new f1(this, str, id2));
                return;
            }
            ma maVar = this.f11780a;
            maVar.a(id2, str);
            maVar.b(toString());
        }
    }

    public final void c() {
        c1.o oVar = this.f11786h;
        if (oVar != null) {
            oVar.j();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.g.intValue() - ((ha) obj).g.intValue();
    }

    public final String d() {
        int i4 = this.f11781b;
        String str = this.f11782c;
        if (i4 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return r5.c.m(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public final void e() {
        synchronized (this.f11784e) {
        }
    }

    public Map f() {
        return Collections.EMPTY_MAP;
    }

    public byte[] g() {
        return null;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f11784e) {
            z3 = this.f11787i;
        }
        return z3;
    }

    public abstract b5.i0 i(fa faVar);

    public abstract void j(Object obj);

    public final void k(aw awVar) {
        synchronized (this.f11784e) {
            this.f11788k = awVar;
        }
    }

    public final void l(b5.i0 i0Var) {
        aw awVar;
        synchronized (this.f11784e) {
            awVar = this.f11788k;
        }
        if (awVar != null) {
            awVar.g(this, i0Var);
        }
    }

    public final void m() {
        aw awVar;
        synchronized (this.f11784e) {
            awVar = this.f11788k;
        }
        if (awVar != null) {
            awVar.p(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f11783d));
        e();
        Integer num = this.g;
        String str = this.f11782c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        je.u.B(sb2, "[ ] ", str, " ", strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }
}
