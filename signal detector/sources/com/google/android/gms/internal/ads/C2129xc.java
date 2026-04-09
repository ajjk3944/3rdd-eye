package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2129xc implements InterfaceC1374jc, InterfaceC2075wc {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2075wc f17601a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f17602b = new HashSet();

    public C2129xc(C1536mc c1536mc) {
        this.f17601a = c1536mc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final void a(String str, Map map) {
        try {
            p("openIntentAsync", q2.r.f23260g.f23261a.j((HashMap) map));
        } catch (JSONException unused) {
            u2.k.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void b(String str, JSONObject jSONObject) {
        f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374jc, com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void c(String str) {
        this.f17601a.c(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2075wc
    public final void d(String str, InterfaceC0466Db interfaceC0466Db) {
        this.f17601a.d(str, interfaceC0466Db);
        this.f17602b.remove(new AbstractMap.SimpleEntry(str, interfaceC0466Db));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2075wc
    public final void e(String str, InterfaceC0466Db interfaceC0466Db) {
        this.f17601a.e(str, interfaceC0466Db);
        this.f17602b.add(new AbstractMap.SimpleEntry(str, interfaceC0466Db));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final /* synthetic */ void f(String str, String str2) {
        AbstractC1135f5.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final /* synthetic */ void p(String str, JSONObject jSONObject) {
        AbstractC1135f5.b(this, jSONObject);
    }
}
