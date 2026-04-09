package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ct0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10212a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10213b;

    /* renamed from: c, reason: collision with root package name */
    public final x81 f10214c;

    /* renamed from: d, reason: collision with root package name */
    public final za.l f10215d;

    /* renamed from: e, reason: collision with root package name */
    public final at0 f10216e;

    /* renamed from: f, reason: collision with root package name */
    public final cs0 f10217f;
    public final t00 g;

    public ct0(Context context, ex exVar, x81 x81Var, za.l lVar, at0 at0Var, cs0 cs0Var, t00 t00Var) {
        this.f10212a = context;
        this.f10213b = exVar;
        this.f10214c = x81Var;
        this.f10215d = lVar;
        this.f10216e = at0Var;
        this.f10217f = cs0Var;
        this.g = t00Var;
    }

    public final void a(List list, z.e eVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), eVar, null, null);
        }
    }

    public final void b(String str, z.e eVar, bs0 bs0Var, d70 d70Var) {
        vd.b bVarE;
        yr0 yr0VarC = null;
        if (cs0.a() && ((Boolean) ol.f14725d.u()).booleanValue()) {
            yr0VarC = d7.C(14, this.f10212a);
            yr0VarC.b();
        }
        yr0 yr0Var = yr0VarC;
        if (eVar != null) {
            bVarE = new r7((za.h) eVar.f37798a, this.f10215d, this.f10214c, this.f10216e, this.g, 9).c(str);
        } else {
            bVarE = ((ex) this.f10214c).e(new ae(9, this, str));
        }
        bVarE.a(new q81(0, bVarE, new aw(this, yr0Var, bs0Var, d70Var, 24)), this.f10213b);
    }
}
