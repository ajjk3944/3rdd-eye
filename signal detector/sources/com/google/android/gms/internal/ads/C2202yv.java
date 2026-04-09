package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2202yv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17787a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17788b;

    /* renamed from: c, reason: collision with root package name */
    public final JD f17789c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.n f17790d;

    /* renamed from: e, reason: collision with root package name */
    public final C2094wv f17791e;

    /* renamed from: f, reason: collision with root package name */
    public final Yu f17792f;

    /* renamed from: g, reason: collision with root package name */
    public final C0421Ah f17793g;

    public C2202yv(Context context, C0623Mf c0623Mf, JD jd, u2.n nVar, C2094wv c2094wv, Yu yu, C0421Ah c0421Ah) {
        this.f17787a = context;
        this.f17788b = c0623Mf;
        this.f17789c = jd;
        this.f17790d = nVar;
        this.f17791e = c2094wv;
        this.f17792f = yu;
        this.f17793g = c0421Ah;
    }

    public final void a(List list, d4.h hVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), hVar, null, null);
        }
    }

    public final void b(String str, d4.h hVar, Xu xu, C0560Ik c0560Ik) {
        InterfaceFutureC2326a interfaceFutureC2326aB;
        Su suY = null;
        if (Yu.a() && ((Boolean) AbstractC1049da.f13769d.v()).booleanValue()) {
            suY = AbstractC1135f5.y(this.f17787a, 14);
            suY.a();
        }
        Su su = suY;
        if (hVar != null) {
            interfaceFutureC2326aB = new C1726q3((u2.j) hVar.f19807b, this.f17790d, this.f17789c, this.f17791e, this.f17793g, 9).b(str);
        } else {
            interfaceFutureC2326aB = ((C0623Mf) this.f17789c).b(new CallableC1890t6(this, 9, str));
        }
        interfaceFutureC2326aB.a(new CD(interfaceFutureC2326aB, 0, new C1431kf(this, su, xu, c0560Ik, 24)), this.f17788b);
    }
}
