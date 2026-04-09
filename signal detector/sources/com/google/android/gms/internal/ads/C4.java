package com.google.android.gms.internal.ads;

import R.C0187n;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class C4 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final H4 f7516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7518c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7519d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7520e;

    /* renamed from: f, reason: collision with root package name */
    public final E4 f7521f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f7522g;

    /* renamed from: h, reason: collision with root package name */
    public K4.j f7523h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C1834s4 f7524j;

    /* renamed from: k, reason: collision with root package name */
    public C1431kf f7525k;

    /* renamed from: l, reason: collision with root package name */
    public final C0187n f7526l;

    public C4(int i, String str, E4 e42) {
        Uri uri;
        String host;
        this.f7516a = H4.f8550c ? new H4() : null;
        this.f7520e = new Object();
        int iHashCode = 0;
        this.i = false;
        this.f7524j = null;
        this.f7517b = i;
        this.f7518c = str;
        this.f7521f = e42;
        C0187n c0187n = new C0187n();
        c0187n.f3349a = 2500;
        this.f7526l = c0187n;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f7519d = iHashCode;
    }

    public final void a(String str) {
        if (H4.f8550c) {
            this.f7516a.a(Thread.currentThread().getId(), str);
        }
    }

    public final void b(String str) {
        K4.j jVar = this.f7523h;
        if (jVar != null) {
            HashSet hashSet = (HashSet) jVar.f2316b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) jVar.i;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            jVar.c();
        }
        if (H4.f8550c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1021d0(this, str, id));
                return;
            }
            H4 h42 = this.f7516a;
            h42.a(id, str);
            h42.b(toString());
        }
    }

    public final void c() {
        K4.j jVar = this.f7523h;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7522g.intValue() - ((C4) obj).f7522g.intValue();
    }

    public final String d() {
        int i = this.f7517b;
        String str = this.f7518c;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return AbstractC1135f5.n(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public final void e() {
        synchronized (this.f7520e) {
        }
    }

    public Map f() {
        return Collections.EMPTY_MAP;
    }

    public byte[] g() {
        return null;
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f7520e) {
            z6 = this.i;
        }
        return z6;
    }

    public abstract A1.s i(A4 a42);

    public abstract void j(Object obj);

    public final void k(C1431kf c1431kf) {
        synchronized (this.f7520e) {
            this.f7525k = c1431kf;
        }
    }

    public final void l(A1.s sVar) {
        C1431kf c1431kf;
        synchronized (this.f7520e) {
            c1431kf = this.f7525k;
        }
        if (c1431kf != null) {
            c1431kf.i(this, sVar);
        }
    }

    public final void m() {
        C1431kf c1431kf;
        synchronized (this.f7520e) {
            c1431kf = this.f7525k;
        }
        if (c1431kf != null) {
            c1431kf.o(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f7519d));
        e();
        Integer num = this.f7522g;
        String str = this.f7518c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        A.f.w(sb, "[ ] ", str, " ", strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}
