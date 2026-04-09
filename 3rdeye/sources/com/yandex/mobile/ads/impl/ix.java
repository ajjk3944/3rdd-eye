package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ix {

    /* renamed from: a, reason: collision with root package name */
    private final sw f28886a;

    /* renamed from: b, reason: collision with root package name */
    private final tx f28887b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ez0> f28888c;

    /* renamed from: d, reason: collision with root package name */
    private final vw f28889d;

    /* renamed from: e, reason: collision with root package name */
    private final cx f28890e;

    /* renamed from: f, reason: collision with root package name */
    private final jx f28891f;

    public ix(sw appData, tx sdkData, ArrayList mediationNetworksData, vw consentsData, cx debugErrorIndicatorData, jx jxVar) {
        kotlin.jvm.internal.l.f(appData, "appData");
        kotlin.jvm.internal.l.f(sdkData, "sdkData");
        kotlin.jvm.internal.l.f(mediationNetworksData, "mediationNetworksData");
        kotlin.jvm.internal.l.f(consentsData, "consentsData");
        kotlin.jvm.internal.l.f(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f28886a = appData;
        this.f28887b = sdkData;
        this.f28888c = mediationNetworksData;
        this.f28889d = consentsData;
        this.f28890e = debugErrorIndicatorData;
        this.f28891f = jxVar;
    }

    public final sw a() {
        return this.f28886a;
    }

    public final vw b() {
        return this.f28889d;
    }

    public final cx c() {
        return this.f28890e;
    }

    public final jx d() {
        return this.f28891f;
    }

    public final List<ez0> e() {
        return this.f28888c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix)) {
            return false;
        }
        ix ixVar = (ix) obj;
        return kotlin.jvm.internal.l.b(this.f28886a, ixVar.f28886a) && kotlin.jvm.internal.l.b(this.f28887b, ixVar.f28887b) && kotlin.jvm.internal.l.b(this.f28888c, ixVar.f28888c) && kotlin.jvm.internal.l.b(this.f28889d, ixVar.f28889d) && kotlin.jvm.internal.l.b(this.f28890e, ixVar.f28890e) && kotlin.jvm.internal.l.b(this.f28891f, ixVar.f28891f);
    }

    public final tx f() {
        return this.f28887b;
    }

    public final int hashCode() {
        int iHashCode = (this.f28890e.hashCode() + ((this.f28889d.hashCode() + m9.a(this.f28888c, (this.f28887b.hashCode() + (this.f28886a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        jx jxVar = this.f28891f;
        return iHashCode + (jxVar == null ? 0 : jxVar.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f28886a + ", sdkData=" + this.f28887b + ", mediationNetworksData=" + this.f28888c + ", consentsData=" + this.f28889d + ", debugErrorIndicatorData=" + this.f28890e + ", logsData=" + this.f28891f + ")";
    }
}
