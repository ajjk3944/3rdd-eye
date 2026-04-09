package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class li0 implements fi0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13497a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13498b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f13499c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13500d;

    public /* synthetic */ li0(Context context, Object obj, Executor executor, int i4) {
        this.f13497a = i4;
        this.f13498b = context;
        this.f13500d = obj;
        this.f13499c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0527  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(com.google.android.gms.internal.ads.dq0 r69, com.google.android.gms.internal.ads.wp0 r70, com.google.android.gms.internal.ads.ci0 r71) throws com.google.android.gms.internal.ads.qj0 {
        /*
            Method dump skipped, instructions count: 3097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li0.c(com.google.android.gms.internal.ads.dq0, com.google.android.gms.internal.ads.wp0, com.google.android.gms.internal.ads.ci0):java.lang.Object");
    }

    public static final boolean d(dq0 dq0Var, int i4) {
        return ((hq0) dq0Var.f10543a.f15651b).f11947h.contains(Integer.toString(i4));
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) throws JSONException, IOException {
        kq0 kq0Var;
        va.c3 c3VarF;
        switch (this.f13497a) {
            case 0:
                qq0 qq0Var = (qq0) ci0Var.f10135b;
                hq0 hq0Var = (hq0) dq0Var.f10543a.f15651b;
                String string = wp0Var.f18112v.toString();
                Context context = this.f13498b;
                fr frVar = (fr) ci0Var.f10136c;
                try {
                    qq0Var.f15399a.C0(new vb.b(context), hq0Var.f11944d, string, frVar);
                    return;
                } finally {
                }
            case 1:
                aq0 aq0Var = wp0Var.f18106s;
                JSONObject jSONObject = wp0Var.f18112v;
                boolean z3 = wp0Var.f18084g0;
                IInterface iInterface = ci0Var.f10136c;
                Object obj = ci0Var.f10135b;
                hq0 hq0Var2 = (hq0) dq0Var.f10543a.f15651b;
                va.c3 c3Var = hq0Var2.f11946f;
                boolean z10 = c3Var.f36049n;
                int i4 = c3Var.f36039b;
                int i10 = c3Var.f36042e;
                Context context2 = this.f13498b;
                if (z10) {
                    pa.h hVar = new pa.h(i10, i4);
                    hVar.f31534e = true;
                    hVar.f31535f = i4;
                    c3VarF = new va.c3(context2, hVar);
                } else {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.U8)).booleanValue() && z3) {
                        pa.h hVar2 = new pa.h(i10, i4);
                        hVar2.g = true;
                        hVar2.f31536h = i4;
                        c3VarF = new va.c3(context2, hVar2);
                    } else {
                        c3VarF = yr1.f(context2, wp0Var.f18110u);
                    }
                }
                va.c3 c3Var2 = c3VarF;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.U8)).booleanValue() && z3) {
                    qq0 qq0Var2 = (qq0) obj;
                    try {
                        qq0Var2.f15399a.S0(new vb.b(context2), c3Var2, hq0Var2.f11944d, jSONObject.toString(), pd.b.E(aq0Var), (fr) iInterface);
                        return;
                    } finally {
                    }
                }
                qq0 qq0Var3 = (qq0) obj;
                try {
                    qq0Var3.f15399a.Y3(new vb.b(context2), c3Var2, hq0Var2.f11944d, jSONObject.toString(), pd.b.E(aq0Var), (fr) iInterface);
                    return;
                } finally {
                }
            default:
                qq0 qq0Var4 = (qq0) ci0Var.f10135b;
                hq0 hq0Var3 = (hq0) dq0Var.f10543a.f15651b;
                String string2 = wp0Var.f18112v.toString();
                String strE = pd.b.E(wp0Var.f18106s);
                Context context3 = this.f13498b;
                fr frVar2 = (fr) ci0Var.f10136c;
                qm qmVar = hq0Var3.j;
                ArrayList arrayList = hq0Var3.f11947h;
                try {
                    qq0Var4.f15399a.i2(new vb.b(context3), hq0Var3.f11944d, string2, strE, frVar2, qmVar, arrayList);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) throws kq0 {
        kq0 kq0Var;
        View view;
        int i4 = this.f13497a;
        Executor executor = this.f13499c;
        Object obj = this.f13500d;
        switch (i4) {
            case 0:
                pq0 pq0Var = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                l90 l90Var = new l90(11, new ki0(this, ci0Var, wp0Var, 0), (Object) null);
                s9 s9Var = new s9(wp0Var.f18073a0, 1);
                n10 n10Var = (n10) obj;
                k10 k10Var = n10Var.f14105c;
                n10 n10Var2 = n10Var.f14106d;
                l10 l10Var = new l10(k10Var, n10Var2, pq0Var, l90Var, s9Var);
                ((s60) l10Var.M.a()).m1(new r20(0, (qq0) ci0Var.f10135b), executor);
                ((vi0) ci0Var.f10136c).i4(new dk0((e60) l10Var.U.a(), (s80) l10Var.W.a(), (o60) l10Var.Q.a(), (t60) l10Var.T.a(), (v60) l10Var.X.a(), (v70) n10Var2.R.a(), (c70) l10Var.Y.a(), (z80) l10Var.Z.a(), (s70) l10Var.f13323a0.a(), (m60) l10Var.f13325c0.a()));
                return l10Var.Z();
            case 1:
                Object obj2 = ci0Var.f10135b;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.U8)).booleanValue() && wp0Var.f18084g0) {
                    try {
                        gr grVarU = ((qq0) obj2).f15399a.U();
                        if (grVarU == null) {
                            za.i.e("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new kq0(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            Parcel parcelR0 = grVarU.r0(grVarU.T(), 1);
                            vb.a aVarR0 = vb.b.r0(parcelR0.readStrongBinder());
                            parcelR0.recycle();
                            view = (View) vb.b.U0(aVarR0);
                            Parcel parcelR02 = grVarU.r0(grVarU.T(), 2);
                            ClassLoader classLoader = ng.f14287a;
                            boolean z3 = parcelR02.readInt() != 0;
                            parcelR02.recycle();
                            if (view == null) {
                                throw new kq0(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z3) {
                                try {
                                    view = (View) yo0.F(s81.f15906b, new s40(this, view, wp0Var, 5), fx.f11279f).get();
                                } catch (InterruptedException | ExecutionException e2) {
                                    throw new kq0(e2);
                                }
                            }
                        } catch (RemoteException e22) {
                            throw new kq0(e22);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) vb.b.U0(((qq0) obj2).f15399a.d());
                    } finally {
                    }
                }
                p10 p10Var = (p10) obj;
                pq0 pq0Var2 = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                qq0 qq0Var = (qq0) obj2;
                aw awVar = new aw(view, (qz) null, new kh0(1, qq0Var), (xp0) wp0Var.f18110u.get(0));
                k10 k10Var2 = p10Var.f14832d;
                p10 p10Var2 = p10Var.f14834e;
                o10 o10Var = new o10(k10Var2, p10Var2, pq0Var2, awVar);
                ((r80) o10Var.f14509f0.a()).v1(view);
                ((s60) o10Var.M.a()).m1(new r20(0, qq0Var), executor);
                ((vi0) ci0Var.f10136c).i4(new dk0((e60) o10Var.R.a(), (s80) o10Var.X.a(), (o60) o10Var.U.a(), (t60) o10Var.Q.a(), o10Var.Z(), (v70) p10Var2.T.a(), (c70) o10Var.f14504a0.a(), (z80) o10Var.f14505b0.a(), (s70) o10Var.f14506c0.a(), (m60) o10Var.f14507d0.a()));
                return o10Var.a0();
            default:
                return c(dq0Var, wp0Var, ci0Var);
        }
    }
}
