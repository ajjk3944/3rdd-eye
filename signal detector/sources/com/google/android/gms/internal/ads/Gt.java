package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONException;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Gt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8466a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f8467b;

    /* renamed from: c, reason: collision with root package name */
    public final C0710Rh f8468c;

    /* renamed from: d, reason: collision with root package name */
    public final C2090wr f8469d;

    /* renamed from: e, reason: collision with root package name */
    public final It f8470e;

    /* renamed from: f, reason: collision with root package name */
    public N9 f8471f;

    /* renamed from: g, reason: collision with root package name */
    public final Yu f8472g;

    /* renamed from: h, reason: collision with root package name */
    public final C0905au f8473h;
    public Ju i;

    public Gt(Context context, Executor executor, C0710Rh c0710Rh, C2090wr c2090wr, It it, C0905au c0905au) {
        this.f8466a = context;
        this.f8467b = executor;
        this.f8468c = c0710Rh;
        this.f8469d = c2090wr;
        this.f8473h = c0905au;
        this.f8470e = it;
        this.f8472g = c0710Rh.c();
    }

    public final boolean a(q2.a1 a1Var, String str, Cr cr, Dr dr) throws JSONException {
        boolean z6;
        C0893ai c0893ai;
        Xu xu;
        int i = 0;
        Executor executor = this.f8467b;
        if (str == null) {
            u2.k.e("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new RunnableC0558Ii(25, this));
            return false;
        }
        if (b()) {
            return false;
        }
        E9 e9 = H9.f8656Q2;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            q2.r.a();
        }
        boolean zBooleanValue = ((Boolean) g92.a(H9.fa)).booleanValue();
        C0710Rh c0710Rh = this.f8468c;
        if (zBooleanValue && a1Var.f23170f) {
            ((C0581Jo) c0710Rh.f11031z.c()).b(true);
        }
        q2.d1 d1Var = ((Dt) cr).f7849c;
        Pair pair = new Pair("api-call", Long.valueOf(a1Var.f23162N));
        p2.j.f22785C.f22797k.getClass();
        Bundle bundleC = AbstractC0709Rg.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C0905au c0905au = this.f8473h;
        c0905au.f13243c = str;
        c0905au.f13242b = d1Var;
        c0905au.f13241a = a1Var;
        c0905au.f13259t = bundleC;
        C0960bu c0960buA = c0905au.a();
        int iH = C1476lN.H(c0960buA);
        Context context = this.f8466a;
        Su suZ = AbstractC1135f5.z(context, iH, 4, a1Var);
        boolean zBooleanValue2 = ((Boolean) g92.a(H9.n9)).booleanValue();
        C2090wr c2090wr = this.f8469d;
        if (zBooleanValue2) {
            C0710Rh c0710Rh2 = c0710Rh.f10986b;
            C0895ak c0895ak = new C0895ak();
            c0895ak.f13213a = context;
            c0895ak.f13214b = c0960buA;
            C0895ak c0895ak2 = new C0895ak(c0895ak);
            K4.e eVar = new K4.e();
            eVar.d(c2090wr, executor);
            eVar.b(c2090wr, executor);
            z6 = true;
            c0893ai = new C0893ai(c0710Rh2, new C1437kl(19), new C1277hl(eVar), c0895ak2, new Nx(23), new C1283hr(0, this.f8471f), null, null);
        } else {
            K4.e eVar2 = new K4.e();
            HashSet hashSet = (HashSet) eVar2.f2244h;
            HashSet hashSet2 = (HashSet) eVar2.f2241e;
            z6 = true;
            It it = this.f8470e;
            if (it != null) {
                hashSet2.add(new C1922tl(it, executor));
                hashSet.add(new C1922tl(it, executor));
                eVar2.a(it, executor);
            }
            C0710Rh c0710Rh3 = c0710Rh.f10986b;
            C0895ak c0895ak3 = new C0895ak();
            c0895ak3.f13213a = context;
            c0895ak3.f13214b = c0960buA;
            C0895ak c0895ak4 = new C0895ak(c0895ak3);
            eVar2.d(c2090wr, executor);
            hashSet2.add(new C1922tl(c2090wr, executor));
            hashSet.add(new C1922tl(c2090wr, executor));
            eVar2.a(c2090wr, executor);
            ((HashSet) eVar2.f2239c).add(new C1922tl(c2090wr, executor));
            eVar2.c(c2090wr, executor);
            eVar2.b(c2090wr, executor);
            ((HashSet) eVar2.f2248m).add(new C1922tl(c2090wr, executor));
            ((HashSet) eVar2.f2247l).add(new C1922tl(c2090wr, executor));
            c0893ai = new C0893ai(c0710Rh3, new C1437kl(19), new C1277hl(eVar2), c0895ak4, new Nx(23), new C1283hr(0, this.f8471f), null, null);
        }
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            xu = (Xu) c0893ai.i.c();
            xu.i(4);
            xu.c(a1Var.f23153D);
            xu.d(a1Var.f23176m);
        } else {
            xu = null;
        }
        C0440Bj c0440Bj = (C0440Bj) c0893ai.f13198n.c();
        Ju juC = c0440Bj.c(c0440Bj.b());
        this.i = juC;
        juC.a(new CD(juC, i, new C1726q3(this, dr, xu, suZ, c0893ai, 7, false)), executor);
        return z6;
    }

    public final boolean b() {
        Ju ju = this.i;
        return (ju == null || ju.f9394c.isDone()) ? false : true;
    }
}
