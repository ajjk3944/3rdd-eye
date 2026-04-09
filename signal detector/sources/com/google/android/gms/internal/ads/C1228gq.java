package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228gq {

    /* renamed from: c, reason: collision with root package name */
    public final String f14382c;

    /* renamed from: d, reason: collision with root package name */
    public St f14383d = null;

    /* renamed from: e, reason: collision with root package name */
    public Qt f14384e = null;

    /* renamed from: f, reason: collision with root package name */
    public q2.f1 f14385f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14381b = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f14380a = Collections.synchronizedList(new ArrayList());

    public C1228gq(String str) {
        this.f14382c = str;
    }

    public static String d(Qt qt) {
        return ((Boolean) C2841s.f23267e.f23270c.a(H9.f8787m4)).booleanValue() ? qt.f10786p0 : qt.f10798w;
    }

    public final void a(Qt qt) {
        String strD = d(qt);
        Map map = this.f14381b;
        Object obj = map.get(strD);
        List list = this.f14380a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f14385f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f14385f = (q2.f1) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            q2.f1 f1Var = (q2.f1) list.get(iIndexOf);
            f1Var.f23210b = 0L;
            f1Var.f23211c = null;
        }
    }

    public final synchronized void b(Qt qt, int i) {
        Map map = this.f14381b;
        String strD = d(qt);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = qt.f10797v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        q2.f1 f1Var = new q2.f1(qt.f10732E, 0L, null, bundle, qt.f10734F, qt.f10736G, qt.f10738H, qt.f10740I);
        try {
            this.f14380a.add(i, f1Var);
        } catch (IndexOutOfBoundsException e6) {
            p2.j.f22785C.f22795h.f("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e6);
        }
        this.f14381b.put(strD, f1Var);
    }

    public final void c(Qt qt, long j6, C2852x0 c2852x0, boolean z6) {
        String strD = d(qt);
        Map map = this.f14381b;
        if (map.containsKey(strD)) {
            if (this.f14384e == null) {
                this.f14384e = qt;
            }
            q2.f1 f1Var = (q2.f1) map.get(strD);
            f1Var.f23210b = j6;
            f1Var.f23211c = c2852x0;
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.y7)).booleanValue() && z6) {
                this.f14385f = f1Var;
            }
        }
    }
}
