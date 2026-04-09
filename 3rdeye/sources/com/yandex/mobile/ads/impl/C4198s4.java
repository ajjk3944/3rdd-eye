package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import b9.C1992A;
import c9.C2097r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4198s4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32859a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final sg1 f32860b = new sg1();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f32861c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f32862d = new ArrayList();

    public final void a() {
        synchronized (this.f32859a) {
            this.f32861c.clear();
            this.f32862d.clear();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final List<C4185q4> b() {
        List<C4185q4> listG0;
        synchronized (this.f32859a) {
            listG0 = C2097r.G0(this.f32862d);
        }
        return listG0;
    }

    public final void b(EnumC4191r4 adLoadingPhaseType) {
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        a(adLoadingPhaseType, null);
    }

    public final void a(EnumC4191r4 adLoadingPhaseType) {
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        sg1 parametersProvider = this.f32860b;
        kotlin.jvm.internal.l.f(parametersProvider, "parametersProvider");
        a(adLoadingPhaseType, parametersProvider, null);
    }

    public final void a(EnumC4191r4 adLoadingPhaseType, tg1 parametersProvider, u92 u92Var) {
        Long l5;
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        kotlin.jvm.internal.l.f(parametersProvider, "parametersProvider");
        synchronized (this.f32859a) {
            try {
                Map map = (Map) this.f32861c.get(adLoadingPhaseType);
                Long lValueOf = (map == null || (l5 = (Long) map.get(u92Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l5.longValue());
                if (lValueOf != null) {
                    this.f32862d.add(new C4185q4(adLoadingPhaseType, parametersProvider.a(lValueOf.longValue())));
                }
                Map map2 = (Map) this.f32861c.get(adLoadingPhaseType);
                if (map2 != null) {
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(EnumC4191r4 adLoadingPhaseType, u92 u92Var) {
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        synchronized (this.f32859a) {
            try {
                Map linkedHashMap = (Map) this.f32861c.get(adLoadingPhaseType);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.f32861c.put(adLoadingPhaseType, linkedHashMap);
                linkedHashMap.put(u92Var, Long.valueOf(SystemClock.elapsedRealtime()));
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
