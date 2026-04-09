package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class w31 {

    /* renamed from: a, reason: collision with root package name */
    private final ar1 f34792a;

    /* renamed from: b, reason: collision with root package name */
    private List<? extends ag<?>> f34793b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34794c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34795d;

    /* renamed from: e, reason: collision with root package name */
    private final ir0 f34796e;

    /* renamed from: f, reason: collision with root package name */
    private final C4108f4 f34797f;

    /* renamed from: g, reason: collision with root package name */
    private final cb0 f34798g;

    /* renamed from: h, reason: collision with root package name */
    private final cb0 f34799h;
    private final List<String> i;

    /* renamed from: j, reason: collision with root package name */
    private final List<tx1> f34800j;

    /* renamed from: k, reason: collision with root package name */
    private final ra f34801k;

    public w31(ar1 responseNativeType, List<? extends ag<?>> assets, String str, String str2, ir0 ir0Var, C4108f4 c4108f4, cb0 cb0Var, cb0 cb0Var2, List<String> renderTrackingUrls, List<tx1> showNotices, ra raVar) {
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(renderTrackingUrls, "renderTrackingUrls");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        this.f34792a = responseNativeType;
        this.f34793b = assets;
        this.f34794c = str;
        this.f34795d = str2;
        this.f34796e = ir0Var;
        this.f34797f = c4108f4;
        this.f34798g = cb0Var;
        this.f34799h = cb0Var2;
        this.i = renderTrackingUrls;
        this.f34800j = showNotices;
        this.f34801k = raVar;
    }

    public static w31 a(w31 w31Var, List assets) {
        ar1 responseNativeType = w31Var.f34792a;
        String str = w31Var.f34794c;
        String str2 = w31Var.f34795d;
        ir0 ir0Var = w31Var.f34796e;
        C4108f4 c4108f4 = w31Var.f34797f;
        cb0 cb0Var = w31Var.f34798g;
        cb0 cb0Var2 = w31Var.f34799h;
        List<String> renderTrackingUrls = w31Var.i;
        List<tx1> showNotices = w31Var.f34800j;
        ra raVar = w31Var.f34801k;
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(renderTrackingUrls, "renderTrackingUrls");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        return new w31(responseNativeType, assets, str, str2, ir0Var, c4108f4, cb0Var, cb0Var2, renderTrackingUrls, showNotices, raVar);
    }

    public final List<ag<?>> b() {
        return this.f34793b;
    }

    public final C4108f4 c() {
        return this.f34797f;
    }

    public final String d() {
        return this.f34795d;
    }

    public final ir0 e() {
        return this.f34796e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w31)) {
            return false;
        }
        w31 w31Var = (w31) obj;
        return this.f34792a == w31Var.f34792a && kotlin.jvm.internal.l.b(this.f34793b, w31Var.f34793b) && kotlin.jvm.internal.l.b(this.f34794c, w31Var.f34794c) && kotlin.jvm.internal.l.b(this.f34795d, w31Var.f34795d) && kotlin.jvm.internal.l.b(this.f34796e, w31Var.f34796e) && kotlin.jvm.internal.l.b(this.f34797f, w31Var.f34797f) && kotlin.jvm.internal.l.b(this.f34798g, w31Var.f34798g) && kotlin.jvm.internal.l.b(this.f34799h, w31Var.f34799h) && kotlin.jvm.internal.l.b(this.i, w31Var.i) && kotlin.jvm.internal.l.b(this.f34800j, w31Var.f34800j) && kotlin.jvm.internal.l.b(this.f34801k, w31Var.f34801k);
    }

    public final List<String> f() {
        return this.i;
    }

    public final ar1 g() {
        return this.f34792a;
    }

    public final List<tx1> h() {
        return this.f34800j;
    }

    public final int hashCode() {
        int iA = m9.a(this.f34793b, this.f34792a.hashCode() * 31, 31);
        String str = this.f34794c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34795d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ir0 ir0Var = this.f34796e;
        int iHashCode3 = (iHashCode2 + (ir0Var == null ? 0 : ir0Var.hashCode())) * 31;
        C4108f4 c4108f4 = this.f34797f;
        int iHashCode4 = (iHashCode3 + (c4108f4 == null ? 0 : c4108f4.hashCode())) * 31;
        cb0 cb0Var = this.f34798g;
        int iHashCode5 = (iHashCode4 + (cb0Var == null ? 0 : cb0Var.hashCode())) * 31;
        cb0 cb0Var2 = this.f34799h;
        int iA2 = m9.a(this.f34800j, m9.a(this.i, (iHashCode5 + (cb0Var2 == null ? 0 : cb0Var2.hashCode())) * 31, 31), 31);
        ra raVar = this.f34801k;
        return iA2 + (raVar != null ? raVar.hashCode() : 0);
    }

    public final String toString() {
        ar1 ar1Var = this.f34792a;
        List<? extends ag<?>> list = this.f34793b;
        String str = this.f34794c;
        String str2 = this.f34795d;
        ir0 ir0Var = this.f34796e;
        C4108f4 c4108f4 = this.f34797f;
        cb0 cb0Var = this.f34798g;
        cb0 cb0Var2 = this.f34799h;
        List<String> list2 = this.i;
        List<tx1> list3 = this.f34800j;
        ra raVar = this.f34801k;
        StringBuilder sb = new StringBuilder("Native(responseNativeType=");
        sb.append(ar1Var);
        sb.append(", assets=");
        sb.append(list);
        sb.append(", adId=");
        com.google.android.gms.measurement.internal.a.l(sb, str, ", info=", str2, ", link=");
        sb.append(ir0Var);
        sb.append(", impressionData=");
        sb.append(c4108f4);
        sb.append(", hideConditions=");
        sb.append(cb0Var);
        sb.append(", showConditions=");
        sb.append(cb0Var2);
        sb.append(", renderTrackingUrls=");
        sb.append(list2);
        sb.append(", showNotices=");
        sb.append(list3);
        sb.append(", additionalInfo=");
        sb.append(raVar);
        sb.append(")");
        return sb.toString();
    }

    public final String a() {
        return this.f34794c;
    }

    public final void a(ArrayList arrayList) {
        kotlin.jvm.internal.l.f(arrayList, "<set-?>");
        this.f34793b = arrayList;
    }
}
