package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
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
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852Zn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12958a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12959b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12960c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.n f12961d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12962e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.a f12963f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12964g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12965h;
    public final AtomicBoolean i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f12966j;

    public C0852Zn(C0623Mf c0623Mf, u2.n nVar, V2.e eVar, B2.a aVar, Context context) {
        HashMap map = new HashMap();
        this.f12958a = map;
        this.i = new AtomicBoolean();
        this.f12966j = new AtomicReference(new Bundle());
        this.f12960c = c0623Mf;
        this.f12961d = nVar;
        E9 e9 = H9.f8838u2;
        C2841s c2841s = C2841s.f23267e;
        this.f12962e = ((Boolean) c2841s.f23270c.a(e9)).booleanValue();
        this.f12963f = aVar;
        E9 e92 = H9.f8868z2;
        G9 g9 = c2841s.f23270c;
        this.f12964g = ((Boolean) g9.a(e92)).booleanValue();
        this.f12965h = ((Boolean) g9.a(H9.J7)).booleanValue();
        this.f12959b = context;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        C0538Hf c0538Hf = jVar.f22795h;
        map.put("device", C2911G.Q());
        map.put("app", (String) eVar.f3869c);
        Context context2 = (Context) eVar.f3868b;
        map.put("is_lite_sdk", true != C2911G.g(context2) ? "0" : "1");
        ArrayList arrayListD = c2841s.f23268a.D();
        if (((Boolean) g9.a(H9.E7)).booleanValue()) {
            arrayListD.addAll(c0538Hf.i().s().i);
        }
        map.put("e", TextUtils.join(",", arrayListD));
        map.put("sdkVersion", (String) eVar.f3870d);
        if (((Boolean) g9.a(H9.Bc)).booleanValue()) {
            map.put("is_bstar", true != C2911G.e(context2) ? "0" : "1");
        }
        if (((Boolean) g9.a(H9.Ga)).booleanValue() && ((Boolean) g9.a(H9.f8645O2)).booleanValue()) {
            String str = c0538Hf.f8974g;
            map.put("plugin", str == null ? "" : str);
        }
    }

    public final void a(Map map, boolean z6) {
        if (map.isEmpty()) {
            u2.k.c("Empty paramMap.");
            return;
        }
        b(map);
        String strA = this.f12963f.a(map);
        AbstractC2907C.m(strA);
        boolean z7 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f12962e) {
            if (!z6 || this.f12964g) {
                if (!z7 || this.f12965h) {
                    this.f12960c.execute(new RunnableC0899ao(this, strA, 0));
                }
            }
        }
    }

    public final void b(Map map) {
        Bundle bundleF;
        if (map == null || map.isEmpty()) {
            u2.k.c("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.i.getAndSet(true);
        AtomicReference atomicReference = this.f12966j;
        if (!andSet) {
            String str = (String) C2841s.f23267e.f23270c.a(H9.Lb);
            SharedPreferencesOnSharedPreferenceChangeListenerC1647of sharedPreferencesOnSharedPreferenceChangeListenerC1647of = new SharedPreferencesOnSharedPreferenceChangeListenerC1647of(this, str);
            if (TextUtils.isEmpty(str)) {
                bundleF = Bundle.EMPTY;
            } else {
                Context context = this.f12959b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1647of);
                bundleF = AbstractC0241a.F(context, str);
            }
            atomicReference.set(bundleF);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }
}
