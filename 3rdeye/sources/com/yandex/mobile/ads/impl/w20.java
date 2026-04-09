package com.yandex.mobile.ads.impl;

import i6.C4458a;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34773a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f34774b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f34775c;

    /* renamed from: d, reason: collision with root package name */
    private final List<jj0> f34776d;

    /* renamed from: e, reason: collision with root package name */
    private final N7.U3 f34777e;

    /* renamed from: f, reason: collision with root package name */
    private final C4458a f34778f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<n20> f34779g;

    public w20(String target, JSONObject card, JSONObject jSONObject, List<jj0> list, N7.U3 divData, C4458a divDataTag, Set<n20> divAssets) {
        kotlin.jvm.internal.l.f(target, "target");
        kotlin.jvm.internal.l.f(card, "card");
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(divDataTag, "divDataTag");
        kotlin.jvm.internal.l.f(divAssets, "divAssets");
        this.f34773a = target;
        this.f34774b = card;
        this.f34775c = jSONObject;
        this.f34776d = list;
        this.f34777e = divData;
        this.f34778f = divDataTag;
        this.f34779g = divAssets;
    }

    public final Set<n20> a() {
        return this.f34779g;
    }

    public final N7.U3 b() {
        return this.f34777e;
    }

    public final C4458a c() {
        return this.f34778f;
    }

    public final List<jj0> d() {
        return this.f34776d;
    }

    public final String e() {
        return this.f34773a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w20)) {
            return false;
        }
        w20 w20Var = (w20) obj;
        return kotlin.jvm.internal.l.b(this.f34773a, w20Var.f34773a) && kotlin.jvm.internal.l.b(this.f34774b, w20Var.f34774b) && kotlin.jvm.internal.l.b(this.f34775c, w20Var.f34775c) && kotlin.jvm.internal.l.b(this.f34776d, w20Var.f34776d) && kotlin.jvm.internal.l.b(this.f34777e, w20Var.f34777e) && kotlin.jvm.internal.l.b(this.f34778f, w20Var.f34778f) && kotlin.jvm.internal.l.b(this.f34779g, w20Var.f34779g);
    }

    public final int hashCode() {
        int iHashCode = (this.f34774b.hashCode() + (this.f34773a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f34775c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List<jj0> list = this.f34776d;
        return this.f34779g.hashCode() + B4.g.n((this.f34777e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31, this.f34778f.f38455a);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f34773a + ", card=" + this.f34774b + ", templates=" + this.f34775c + ", images=" + this.f34776d + ", divData=" + this.f34777e + ", divDataTag=" + this.f34778f + ", divAssets=" + this.f34779g + ")";
    }
}
