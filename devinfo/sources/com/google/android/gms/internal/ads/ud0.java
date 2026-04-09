package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ud0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17174a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17175b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f17176c;

    /* renamed from: d, reason: collision with root package name */
    public final za.l f17177d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17178e;

    /* renamed from: f, reason: collision with root package name */
    public final gb.a f17179f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17180h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f17181i;
    public final AtomicReference j;

    public ud0(ex exVar, za.l lVar, yb.e eVar, gb.a aVar, Context context) {
        HashMap map = new HashMap();
        this.f17174a = map;
        this.f17181i = new AtomicBoolean();
        this.j = new AtomicReference(new Bundle());
        this.f17176c = exVar;
        this.f17177d = lVar;
        pk pkVar = sk.f16348u2;
        va.s sVar = va.s.f36163e;
        this.f17178e = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue();
        this.f17179f = aVar;
        pk pkVar2 = sk.f16430z2;
        rk rkVar = sVar.f36166c;
        this.g = ((Boolean) rkVar.a(pkVar2)).booleanValue();
        this.f17180h = ((Boolean) rkVar.a(sk.J7)).booleanValue();
        this.f17175b = context;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        ua.j jVar = ua.j.C;
        ya.f0 f0Var = jVar.f35261c;
        zw zwVar = jVar.f35265h;
        map.put("device", ya.f0.Q());
        map.put("app", (String) eVar.f37510c);
        Context context2 = (Context) eVar.f37509b;
        map.put("is_lite_sdk", true != ya.f0.g(context2) ? "0" : "1");
        ArrayList arrayListB = sVar.f36164a.B();
        if (((Boolean) rkVar.a(sk.E7)).booleanValue()) {
            arrayListB.addAll(zwVar.i().s().f18216i);
        }
        map.put("e", TextUtils.join(",", arrayListB));
        map.put("sdkVersion", (String) eVar.f37511d);
        if (((Boolean) rkVar.a(sk.Dc)).booleanValue()) {
            map.put("is_bstar", true != ya.f0.e(context2) ? "0" : "1");
        }
        if (((Boolean) rkVar.a(sk.Ia)).booleanValue() && ((Boolean) rkVar.a(sk.O2)).booleanValue()) {
            String str = zwVar.g;
            map.put("plugin", str == null ? "" : str);
        }
    }

    public final void a(Map map, boolean z3) {
        if (map.isEmpty()) {
            za.i.c("Empty paramMap.");
            return;
        }
        b(map);
        String strA = this.f17179f.a(map);
        ya.a0.m(strA);
        boolean z10 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f17178e) {
            if (!z3 || this.g) {
                if (!z10 || this.f17180h) {
                    this.f17176c.execute(new vd0(this, strA, 0));
                }
            }
        }
    }

    public final void b(Map map) {
        Bundle bundleA;
        if (map == null || map.isEmpty()) {
            za.i.c("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f17181i.getAndSet(true);
        AtomicReference atomicReference = this.j;
        if (!andSet) {
            String str = (String) va.s.f36163e.f36166c.a(sk.Nb);
            ew ewVar = new ew(this, str);
            if (TextUtils.isEmpty(str)) {
                bundleA = Bundle.EMPTY;
            } else {
                Context context = this.f17175b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(ewVar);
                bundleA = nh.a.A(context, str);
            }
            atomicReference.set(bundleA);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }
}
