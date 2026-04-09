package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import org.json.JSONException;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Lt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9774a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9775b;

    /* renamed from: c, reason: collision with root package name */
    public final C0710Rh f9776c;

    /* renamed from: d, reason: collision with root package name */
    public final It f9777d;

    /* renamed from: e, reason: collision with root package name */
    public final Bt f9778e;

    /* renamed from: f, reason: collision with root package name */
    public final Yt f9779f;

    /* renamed from: g, reason: collision with root package name */
    public final Yu f9780g;

    /* renamed from: h, reason: collision with root package name */
    public final C0905au f9781h;
    public InterfaceFutureC2326a i;

    public Lt(Context context, Executor executor, C0710Rh c0710Rh, Bt bt, It it, C0905au c0905au, Yt yt) {
        this.f9774a = context;
        this.f9775b = executor;
        this.f9776c = c0710Rh;
        this.f9778e = bt;
        this.f9777d = it;
        this.f9781h = c0905au;
        this.f9779f = yt;
        this.f9780g = c0710Rh.c();
    }

    public final boolean a(q2.a1 a1Var, String str, Cr cr, Dr dr) throws JSONException {
        Xu xu;
        int i = 27;
        int i3 = 0;
        Executor executor = this.f9775b;
        if (str == null) {
            u2.k.e("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new RunnableC0558Ii(i, this));
            return false;
        }
        InterfaceFutureC2326a interfaceFutureC2326a = this.i;
        if (interfaceFutureC2326a != null && !interfaceFutureC2326a.isDone()) {
            return false;
        }
        E9 e9 = H9.f8656Q2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            q2.r.a();
        }
        boolean zBooleanValue = ((Boolean) AbstractC1049da.f13768c.v()).booleanValue();
        Bt bt = this.f9778e;
        if (!zBooleanValue || bt.m() == null) {
            xu = null;
        } else {
            xu = (Xu) ((C1002ci) bt.m()).f13643g.c();
            xu.i(5);
            xu.c(a1Var.f23153D);
            xu.d(a1Var.f23176m);
        }
        boolean z6 = a1Var.f23170f;
        Context context = this.f9774a;
        Cr.t(context, z6);
        if (((Boolean) c2841s.f23270c.a(H9.fa)).booleanValue() && z6) {
            ((C0581Jo) this.f9776c.f11031z.c()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(a1Var.f23162N));
        p2.j.f22785C.f22797k.getClass();
        Bundle bundleC = AbstractC0709Rg.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C0905au c0905au = this.f9781h;
        c0905au.f13243c = str;
        c0905au.f13242b = new q2.d1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        c0905au.f13241a = a1Var;
        c0905au.f13259t = bundleC;
        C0960bu c0960buA = c0905au.a();
        Su suZ = AbstractC1135f5.z(context, C1476lN.H(c0960buA), 5, a1Var);
        Kt kt = new Kt();
        kt.f9555a = c0960buA;
        InterfaceFutureC2326a interfaceFutureC2326aJ = bt.j(new C0697Ql((Object) kt, (Object) null, 27, false), new Nx(i, this));
        this.i = interfaceFutureC2326aJ;
        interfaceFutureC2326aJ.a(new CD(interfaceFutureC2326aJ, i3, new C1726q3(this, dr, xu, suZ, kt, 8, false)), executor);
        return true;
    }

    public final C0744Th b(InterfaceC2254zt interfaceC2254zt) {
        C0744Th c0744Th = new C0744Th(this.f9776c.f10986b, 1);
        C0895ak c0895ak = new C0895ak();
        c0895ak.f13213a = this.f9774a;
        c0895ak.f13214b = ((Kt) interfaceC2254zt).f9555a;
        c0895ak.f13216d = this.f9779f;
        c0744Th.f11426f = new C0895ak(c0895ak);
        c0744Th.f11425e = new C1277hl(new K4.e());
        return c0744Th;
    }
}
