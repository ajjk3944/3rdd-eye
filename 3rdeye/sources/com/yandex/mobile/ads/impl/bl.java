package com.yandex.mobile.ads.impl;

import R9.AbstractC1564a;
import c9.C2099t;
import c9.C2101v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1564a f25319a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25320b = 0;

    static {
        iq0.f28836a.getClass();
        f25319a = iq0.a();
    }

    public static zk a(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        Set<String> set = C2101v.f18583b;
        Set<String> setA = localStorage.a("BiddingSettingsAdUnitIdsSet", set);
        if (setA == null) {
            setA = set;
        }
        Set<String> setA2 = localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (setA2 != null) {
            set = setA2;
        }
        al alVar = new al();
        ArrayList arrayList = new ArrayList(setA.size());
        Iterator<String> it = setA.iterator();
        while (it.hasNext()) {
            String strD = localStorage.d(a(it.next()));
            if (strD != null && strD.length() != 0) {
                try {
                    n9 n9VarA = alVar.a(new JSONObject(strD));
                    if (n9VarA != null) {
                        arrayList.add(n9VarA);
                    }
                } catch (JSONException unused) {
                    fp0.b(new Object[0]);
                }
            }
        }
        long jB = localStorage.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(set.size());
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            String strD2 = localStorage.d(b(it2.next()));
            if (strD2 != null) {
                AbstractC1564a abstractC1564a = f25319a;
                abstractC1564a.getClass();
                sz0 sz0Var = (sz0) abstractC1564a.a(N9.a.b(sz0.Companion.serializer()), strD2);
                if (sz0Var != null) {
                    arrayList2.add(sz0Var);
                }
            }
        }
        vz0 vz0Var = new vz0(jB, arrayList2);
        if (arrayList.isEmpty() && set.isEmpty()) {
            return null;
        }
        return new zk(arrayList, vz0Var);
    }

    private static String b(String str) {
        return androidx.work.s.d("MediationPrefetchSettingsAdUnitIdsInfo_", str);
    }

    public static void b(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        Set<String> set = C2101v.f18583b;
        Set<String> setA = localStorage.a("BiddingSettingsAdUnitIdsSet", set);
        if (setA == null) {
            setA = set;
        }
        Set<String> setA2 = localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (setA2 != null) {
            set = setA2;
        }
        Iterator<String> it = setA.iterator();
        while (it.hasNext()) {
            localStorage.a(a(it.next()));
        }
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            localStorage.a(b(it2.next()));
        }
        localStorage.a("BiddingSettingsAdUnitIdsSet");
        localStorage.a("MediationPrefetchSettingsAdUnitIdsSet");
    }

    private static String a(String str) {
        return androidx.work.s.d("BiddingSettingsAdUnitIdsInfo_", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.mobile.ads.impl.cs0, java.lang.Object] */
    public static void a(cs0 localStorage, zk biddingSettings) {
        List<sz0> listE;
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(biddingSettings, "biddingSettings");
        List<n9> listC = biddingSettings.c();
        HashSet hashSet = new HashSet(listC.size());
        for (n9 n9Var : listC) {
            String strC = n9Var.c();
            String strD = n9Var.d();
            hashSet.add(strC);
            localStorage.a(a(strC), strD);
        }
        Set<String> set = C2101v.f18583b;
        Set setA = localStorage.a("BiddingSettingsAdUnitIdsSet", set);
        if (setA == null) {
            setA = set;
        }
        for (String str : setA) {
            if (!hashSet.contains(str)) {
                localStorage.a(a(str));
            }
        }
        localStorage.a("BiddingSettingsAdUnitIdsSet", hashSet);
        vz0 vz0VarD = biddingSettings.d();
        long jD = vz0VarD != null ? vz0VarD.d() : 0L;
        if (vz0VarD == null || (listE = vz0VarD.e()) == null) {
            listE = C2099t.f18581b;
        }
        HashSet hashSet2 = new HashSet(listE.size());
        for (sz0 sz0Var : listE) {
            hashSet2.add(sz0Var.d());
            String strB = b(sz0Var.d());
            AbstractC1564a abstractC1564a = f25319a;
            abstractC1564a.getClass();
            localStorage.a(strB, abstractC1564a.b(sz0.Companion.serializer(), sz0Var));
        }
        Set setA2 = localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (setA2 != null) {
            set = setA2;
        }
        for (String str2 : set) {
            if (!hashSet2.contains(str2)) {
                localStorage.a(b(str2));
            }
        }
        localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        localStorage.a("MediationPrefetchLoadTimeoutMillis", jD);
    }
}
