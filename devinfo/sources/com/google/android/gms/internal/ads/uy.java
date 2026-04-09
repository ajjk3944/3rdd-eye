package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class uy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17382b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f17383c;

    public uy(qz qzVar) {
        Context context = qzVar.getContext();
        this.f17381a = context;
        this.f17382b = ua.j.C.f35261c.F(context, qzVar.J1().f38129a);
        this.f17383c = new WeakReference(qzVar);
    }

    public abstract boolean b(String str);

    public boolean c(String str, String[] strArr) {
        return b(str);
    }

    public boolean e(String str, String[] strArr, my myVar) {
        return b(str);
    }

    public abstract void q();

    public final void r(String str, String str2, String str3, String str4) {
        za.d.f38136b.post(new ty(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void s(HashMap map) {
        qz qzVar = (qz) this.f17383c.get();
        if (qzVar != null) {
            qzVar.a("onPrecacheEvent", map);
        }
    }

    public void a() {
    }

    public void f(int i4) {
    }

    public void h(int i4) {
    }

    public void o(int i4) {
    }

    public void p(int i4) {
    }
}
