package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2092m;
import c9.C2097r;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.yandex.mobile.ads.impl.np;
import com.yandex.mobile.ads.impl.vt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class d41 {

    /* renamed from: a, reason: collision with root package name */
    private final ej0 f25947a;

    /* renamed from: b, reason: collision with root package name */
    private final s51 f25948b;

    /* renamed from: c, reason: collision with root package name */
    private final e61 f25949c;

    /* renamed from: d, reason: collision with root package name */
    private final p71 f25950d;

    /* renamed from: e, reason: collision with root package name */
    private final x71 f25951e;

    public /* synthetic */ d41(ej0 ej0Var) {
        this(ej0Var, new s51(), new e61(), new p71(), new x71());
    }

    public final kt a(w31 nativeAd) {
        np.a aVarB;
        vt.a aVar;
        List<jj0> listA;
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        List<ag<?>> listB = nativeAd.b();
        int iL = C2077A.l(C2092m.T(listB, 10));
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            ag agVar = (ag) it.next();
            linkedHashMap.put(agVar.b(), agVar.d());
        }
        Object obj = linkedHashMap.get("media");
        vt vtVar = null;
        sw0 sw0Var = obj instanceof sw0 ? (sw0) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        jj0 jj0Var = obj2 instanceof jj0 ? (jj0) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        jj0 jj0Var2 = obj3 instanceof jj0 ? (jj0) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        np npVar = obj4 instanceof np ? (np) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get("body");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get("domain");
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get(AppIntroBaseFragmentKt.ARG_TITLE);
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        String str10 = obj14 instanceof String ? (String) obj14 : null;
        boolean z10 = linkedHashMap.get("feedback") != null;
        jj0 jj0Var3 = (sw0Var == null || (listA = sw0Var.a()) == null) ? null : (jj0) C2097r.q0(listA);
        s51 s51Var = this.f25948b;
        ej0 imageProvider = this.f25947a;
        s51Var.getClass();
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        mt mtVar = jj0Var3 != null ? new mt(new r51(imageProvider, jj0Var3), jj0Var3.d(), jj0Var3.g(), jj0Var3.a()) : null;
        s51 s51Var2 = this.f25948b;
        ej0 imageProvider2 = this.f25947a;
        s51Var2.getClass();
        kotlin.jvm.internal.l.f(imageProvider2, "imageProvider");
        mt mtVar2 = jj0Var != null ? new mt(new r51(imageProvider2, jj0Var), jj0Var.d(), jj0Var.g(), jj0Var.a()) : null;
        s51 s51Var3 = this.f25948b;
        ej0 imageProvider3 = this.f25947a;
        s51Var3.getClass();
        kotlin.jvm.internal.l.f(imageProvider3, "imageProvider");
        mt mtVar3 = jj0Var2 != null ? new mt(new r51(imageProvider3, jj0Var2), jj0Var2.d(), jj0Var2.g(), jj0Var2.a()) : null;
        qt qtVarA = this.f25949c.a(sw0Var);
        this.f25951e.getClass();
        if (npVar != null && (aVarB = npVar.b()) != null) {
            int iOrdinal = aVarB.ordinal();
            if (iOrdinal == 0) {
                aVar = vt.a.f34662b;
            } else {
                if (iOrdinal != 1) {
                    throw new b9.j();
                }
                aVar = vt.a.f34663c;
            }
            vtVar = new vt(aVar, npVar.a());
        }
        this.f25950d.getClass();
        return new kt(qtVarA, mtVar2, mtVar3, mtVar, vtVar, str, str2, str3, str4, str5, p71.a(str6), str7, str8, str9, str10, z10);
    }

    public d41(ej0 imageProvider, s51 imageCreator, e61 mediaCreator, p71 assetRatingProvider, x71 closeButtonCreator) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(imageCreator, "imageCreator");
        kotlin.jvm.internal.l.f(mediaCreator, "mediaCreator");
        kotlin.jvm.internal.l.f(assetRatingProvider, "assetRatingProvider");
        kotlin.jvm.internal.l.f(closeButtonCreator, "closeButtonCreator");
        this.f25947a = imageProvider;
        this.f25948b = imageCreator;
        this.f25949c = mediaCreator;
        this.f25950d = assetRatingProvider;
        this.f25951e = closeButtonCreator;
    }
}
