package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j50 implements n70, x80 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12636a;

    /* renamed from: b, reason: collision with root package name */
    public final hq0 f12637b;

    /* renamed from: c, reason: collision with root package name */
    public final za.a f12638c;

    /* renamed from: d, reason: collision with root package name */
    public final ya.c0 f12639d;

    /* renamed from: e, reason: collision with root package name */
    public final re0 f12640e;

    /* renamed from: f, reason: collision with root package name */
    public final cs0 f12641f;
    public final ff0 g;

    public j50(Context context, hq0 hq0Var, za.a aVar, ya.c0 c0Var, re0 re0Var, cs0 cs0Var, ff0 ff0Var) {
        this.f12636a = context;
        this.f12637b = hq0Var;
        this.f12638c = aVar;
        this.f12639d = c0Var;
        this.f12640e = re0Var;
        this.f12641f = cs0Var;
        this.g = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void a(fb.o oVar) throws JSONException {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.K4)).booleanValue()) {
            b();
        }
    }

    public final void b() throws JSONException {
        String str;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.J4)).booleanValue()) {
            String str2 = this.f12637b.g;
            ww wwVarS = this.f12639d.s();
            androidx.recyclerview.widget.d dVar = ua.j.C.f35268l;
            boolean zG = this.g.g();
            if (wwVarS != null) {
                dVar.getClass();
                str = wwVarS.f18212d;
            } else {
                str = null;
            }
            dVar.t(this.f12636a, this.f12638c, false, wwVarS, str, str2, null, this.f12641f, null, null, zG);
        }
        this.f12640e.a();
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) throws JSONException {
        b();
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void k(String str) {
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
    }
}
