package com.staircase3.opensignal.utils;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import mq.b0;
import mq.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final xm.a f6172a;

    /* renamed from: b, reason: collision with root package name */
    public final jn.b f6173b;

    /* renamed from: c, reason: collision with root package name */
    public FirebaseAnalytics f6174c;

    public a(xm.a aVar, jn.b bVar) {
        br.l.e(aVar, "isConnectivityAssistantEnabledUseCase");
        br.l.e(bVar, "sdkApi");
        this.f6172a = aVar;
        this.f6173b = bVar;
    }

    public static /* synthetic */ void e(a aVar, String str, String str2, String str3, int i10) {
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        aVar.b(0L, str, str2, str3);
    }

    public final Bundle a(String str, String str2, Map map) {
        LinkedHashMap linkedHashMapY = b0.Y(map);
        linkedHashMapY.put("item_category", str);
        linkedHashMapY.put("action", str2);
        linkedHashMapY.put("app_version_code", 8003020);
        linkedHashMapY.put("client_identifier", (String) this.f6173b.f13782c.getValue());
        linkedHashMapY.put("is_connectivity_assistant_enabled", Boolean.valueOf(this.f6172a.a()));
        int size = linkedHashMapY.size();
        Collection collectionH = w.f16945a;
        if (size != 0) {
            Iterator it = linkedHashMapY.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(linkedHashMapY.size());
                    arrayList.add(new lq.l(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new lq.l(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    collectionH = arrayList;
                } else {
                    collectionH = e5.H(new lq.l(entry.getKey(), entry.getValue()));
                }
            }
        }
        lq.l[] lVarArr = (lq.l[]) collectionH.toArray(new lq.l[0]);
        return e5.m((lq.l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }

    public final void b(long j, String str, String str2, String str3) {
        br.l.e(str, "category");
        br.l.e(str2, "action");
        br.l.e(str3, "label");
        Bundle bundleA = a(str, str2, b0.R(new lq.l("label", str3), new lq.l("value", Long.valueOf(j))));
        FirebaseAnalytics firebaseAnalytics = this.f6174c;
        if (firebaseAnalytics == null) {
            br.l.l("firebaseAnalytics");
            throw null;
        }
        i1 i1Var = firebaseAnalytics.f5809a;
        i1Var.getClass();
        i1Var.c(new c1(i1Var, (String) null, str, bundleA, false));
    }

    public final void c(String str, String str2, String str3) {
        br.l.e(str, "category");
        br.l.e(str2, "action");
        br.l.e(str3, "label");
        e(this, str, str2, str3, 8);
    }

    public final void d(String str, String str2, Map map) {
        br.l.e(str2, "action");
        for (Map.Entry entry : map.entrySet()) {
            Objects.toString(entry.getValue());
        }
        Bundle bundleA = a(str, str2, map);
        FirebaseAnalytics firebaseAnalytics = this.f6174c;
        if (firebaseAnalytics == null) {
            br.l.l("firebaseAnalytics");
            throw null;
        }
        i1 i1Var = firebaseAnalytics.f5809a;
        i1Var.getClass();
        i1Var.c(new c1(i1Var, (String) null, str, bundleA, false));
    }

    public final void f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", str);
        bundle.putInt("app_version_code", 8003020);
        bundle.putString("client_identifier", (String) this.f6173b.f13782c.getValue());
        bundle.putBoolean("is_connectivity_assistant_enabled", this.f6172a.a());
        FirebaseAnalytics firebaseAnalytics = this.f6174c;
        if (firebaseAnalytics == null) {
            br.l.l("firebaseAnalytics");
            throw null;
        }
        i1 i1Var = firebaseAnalytics.f5809a;
        i1Var.getClass();
        i1Var.c(new c1(i1Var, (String) null, "screen_view", bundle, false));
    }
}
