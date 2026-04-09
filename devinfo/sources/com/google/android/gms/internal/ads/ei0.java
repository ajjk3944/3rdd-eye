package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ei0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f10803c;

    /* renamed from: d, reason: collision with root package name */
    public yp0 f10804d = null;

    /* renamed from: e, reason: collision with root package name */
    public wp0 f10805e = null;

    /* renamed from: f, reason: collision with root package name */
    public va.e3 f10806f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10802b = a0.g.r();

    /* renamed from: a, reason: collision with root package name */
    public final List f10801a = DesugarCollections.synchronizedList(new ArrayList());

    public ei0(String str) {
        this.f10803c = str;
    }

    public static String d(wp0 wp0Var) {
        return ((Boolean) va.s.f36163e.f36166c.a(sk.f16224m4)).booleanValue() ? wp0Var.f18101p0 : wp0Var.f18114w;
    }

    public final void a(wp0 wp0Var) {
        String strD = d(wp0Var);
        Map map = this.f10802b;
        Object obj = map.get(strD);
        List list = this.f10801a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f10806f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f10806f = (va.e3) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            va.e3 e3Var = (va.e3) list.get(iIndexOf);
            e3Var.f36084b = 0L;
            e3Var.f36085c = null;
        }
    }

    public final synchronized void b(wp0 wp0Var, int i4) {
        Map map = this.f10802b;
        String strD = d(wp0Var);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = wp0Var.f18112v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        va.e3 e3Var = new va.e3(wp0Var.E, 0L, null, bundle, wp0Var.F, wp0Var.G, wp0Var.H, wp0Var.I);
        try {
            this.f10801a.add(i4, e3Var);
        } catch (IndexOutOfBoundsException e2) {
            ua.j.C.f35265h.f("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e2);
        }
        this.f10802b.put(strD, e3Var);
    }

    public final void c(wp0 wp0Var, long j, va.w1 w1Var, boolean z3) {
        String strD = d(wp0Var);
        Map map = this.f10802b;
        if (map.containsKey(strD)) {
            if (this.f10805e == null) {
                this.f10805e = wp0Var;
            }
            va.e3 e3Var = (va.e3) map.get(strD);
            e3Var.f36084b = j;
            e3Var.f36085c = w1Var;
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16418y7)).booleanValue() && z3) {
                this.f10806f = e3Var;
            }
        }
    }
}
