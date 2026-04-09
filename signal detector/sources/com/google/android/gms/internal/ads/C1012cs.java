package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import f4.InterfaceFutureC2326a;
import j$.util.concurrent.ConcurrentHashMap;
import q2.C2841s;
import t2.C2909E;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012cs implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13685c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13686d;

    /* renamed from: e, reason: collision with root package name */
    public final C0508Fj f13687e;

    /* renamed from: f, reason: collision with root package name */
    public final C1500lu f13688f;

    /* renamed from: g, reason: collision with root package name */
    public final C0960bu f13689g;

    /* renamed from: h, reason: collision with root package name */
    public final C2909E f13690h = p2.j.f22785C.f22795h.i();
    public final C0750Tn i;

    /* renamed from: j, reason: collision with root package name */
    public final C0576Jj f13691j;

    public C1012cs(Context context, String str, String str2, C0508Fj c0508Fj, C1500lu c1500lu, C0960bu c0960bu, C0750Tn c0750Tn, C0576Jj c0576Jj, long j6) {
        this.f13683a = context;
        this.f13684b = str;
        this.f13685c = str2;
        this.f13687e = c0508Fj;
        this.f13688f = c1500lu;
        this.f13689g = c0960bu;
        this.i = c0750Tn;
        this.f13691j = c0576Jj;
        this.f13686d = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        Bundle bundle = new Bundle();
        C0750Tn c0750Tn = this.i;
        ConcurrentHashMap concurrentHashMap = c0750Tn.f11457a;
        String str = this.f13684b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue()) {
            p2.j.f22785C.f22797k.getClass();
            c0750Tn.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f13686d));
            c0750Tn.b("foreground", true != C2911G.h(this.f13683a) ? "1" : "0");
        }
        C0508Fj c0508Fj = this.f13687e;
        C0960bu c0960bu = this.f13689g;
        q2.a1 a1Var = c0960bu.f13482d;
        C0470Df c0470Df = c0508Fj.f8178b;
        synchronized (c0470Df.f7810d) {
            c0470Df.f7807a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0470Df.f7815j = jElapsedRealtime;
            c0470Df.f7808b.e(a1Var, jElapsedRealtime);
        }
        bundle.putAll(this.f13688f.b());
        return AbstractC1984ut.e(new C1066ds(this.f13683a, bundle, str, this.f13685c, this.f13690h, c0960bu.f13485g, this.f13691j));
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 12;
    }
}
