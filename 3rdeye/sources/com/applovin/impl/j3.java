package com.applovin.impl;

import com.applovin.impl.h3;
import com.applovin.impl.i3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f19587b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f19588c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f19589d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19590a;

    public j3(com.applovin.impl.sdk.k kVar) {
        this.f19590a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l5, Long l10) {
        return l5;
    }

    private void b(h3 h3Var, i3 i3Var, h3.a aVar) {
        HashMap map;
        if (a(h3Var, i3Var, aVar)) {
            String strB = i3Var.b();
            HashMap mapA = a(i3Var.a());
            synchronized (mapA) {
                try {
                    if (mapA.containsKey(strB)) {
                        map = (HashMap) mapA.get(strB);
                    } else {
                        HashMap map2 = new HashMap();
                        mapA.put(strB, map2);
                        map = map2;
                    }
                    map.put(h3Var, aVar.a(map.get(h3Var)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(h3 h3Var, i3 i3Var) {
        b(h3Var, i3Var, new androidx.work.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l5) {
        return Long.valueOf(l5 != null ? 1 + l5.longValue() : 1L);
    }

    public void a(h3 h3Var, i3 i3Var, Long l5) {
        b(h3Var, i3Var, new M8.a(l5, 11));
    }

    public Map a(h3 h3Var, i3.a aVar) {
        HashMap mapA = a(aVar);
        HashMap map = new HashMap();
        synchronized (mapA) {
            try {
                for (String str : mapA.keySet()) {
                    map.put(str, ((HashMap) mapA.get(str)).get(h3Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    private HashMap a(i3.a aVar) {
        if (aVar == i3.a.AD_UNIT_ID) {
            return f19587b;
        }
        if (aVar == i3.a.AD_FORMAT) {
            return f19588c;
        }
        return f19589d;
    }

    private boolean a(h3 h3Var, i3 i3Var, h3.a aVar) {
        if (h3Var == null) {
            this.f19590a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f19590a.O().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (i3Var == null) {
            this.f19590a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f19590a.O().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (aVar != null) {
            return true;
        }
        this.f19590a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19590a.O().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }
}
