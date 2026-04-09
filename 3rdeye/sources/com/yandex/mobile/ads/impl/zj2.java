package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import c9.C2099t;
import com.yandex.mobile.ads.impl.hb2;
import com.yandex.mobile.ads.impl.za2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zj2 {

    /* renamed from: a, reason: collision with root package name */
    private final za2 f36532a;

    /* renamed from: b, reason: collision with root package name */
    private final xj2 f36533b;

    /* renamed from: c, reason: collision with root package name */
    private final yj2 f36534c;

    /* renamed from: d, reason: collision with root package name */
    private final ak2 f36535d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f36536e;

    public /* synthetic */ zj2(Context context, za2 za2Var) {
        this(context, za2Var, new xj2(za2Var), new yj2(), new ak2());
    }

    public final ArrayList a(List videoAds) {
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList(C2092m.T(videoAds, 10));
        Iterator it = videoAds.iterator();
        while (it.hasNext()) {
            za2 videoAd = (za2) it.next();
            ArrayList arrayListA = this.f36533b.a(videoAd);
            yj2 yj2Var = this.f36534c;
            za2 wrapperVideoAd = this.f36532a;
            yj2Var.getClass();
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            kotlin.jvm.internal.l.f(wrapperVideoAd, "wrapperVideoAd");
            hb2 hb2VarL = videoAd.l();
            hb2 hb2VarL2 = wrapperVideoAd.l();
            hb2 hb2VarA = new hb2.a().a(C2097r.y0(hb2VarL2.a(), hb2VarL.a())).b(C2097r.y0(hb2VarL2.b(), hb2VarL.b())).a();
            ak2 ak2Var = this.f36535d;
            za2 wrapperVideoAd2 = this.f36532a;
            ak2Var.getClass();
            kotlin.jvm.internal.l.f(wrapperVideoAd2, "wrapperVideoAd");
            List listW = C2092m.W(videoAd, wrapperVideoAd2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listW.iterator();
            while (it2.hasNext()) {
                mh2 mh2VarM = ((za2) it2.next()).m();
                List<String> listA = mh2VarM != null ? mh2VarM.a() : null;
                if (listA == null) {
                    listA = C2099t.f18581b;
                }
                C2095p.b0(listA, arrayList2);
            }
            mh2 mh2Var = new mh2(arrayList2);
            Map<String, List<String>> mapH = videoAd.h();
            Map<String, List<String>> mapH2 = this.f36532a.h();
            ArrayList arrayListY0 = C2097r.y0(this.f36532a.d(), videoAd.d());
            Context context = this.f36536e;
            kotlin.jvm.internal.l.e(context, "context");
            arrayList.add(new za2.a(context, videoAd.o()).f(videoAd.g()).a(arrayListA).a(mapH).c(videoAd.b()).d(videoAd.c()).e(videoAd.f()).g(videoAd.j()).h(videoAd.k()).a(hb2VarA).a(mh2Var).a(videoAd.n()).a(mapH2).a((List) arrayListY0).a());
        }
        return arrayList;
    }

    public zj2(Context context, za2 wrapperVideoAd, xj2 wrappedAdCreativesCreator, yj2 wrappedAdExtensionsCreator, ak2 wrappedViewableImpressionCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(wrapperVideoAd, "wrapperVideoAd");
        kotlin.jvm.internal.l.f(wrappedAdCreativesCreator, "wrappedAdCreativesCreator");
        kotlin.jvm.internal.l.f(wrappedAdExtensionsCreator, "wrappedAdExtensionsCreator");
        kotlin.jvm.internal.l.f(wrappedViewableImpressionCreator, "wrappedViewableImpressionCreator");
        this.f36532a = wrapperVideoAd;
        this.f36533b = wrappedAdCreativesCreator;
        this.f36534c = wrappedAdExtensionsCreator;
        this.f36535d = wrappedViewableImpressionCreator;
        this.f36536e = context.getApplicationContext();
    }
}
