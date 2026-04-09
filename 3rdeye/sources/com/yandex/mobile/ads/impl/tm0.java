package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tm0 {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<tn0> f33679a;

    /* renamed from: b, reason: collision with root package name */
    private final ou f33680b;

    /* renamed from: c, reason: collision with root package name */
    private final n12 f33681c;

    /* renamed from: d, reason: collision with root package name */
    private final fz f33682d;

    public tm0(Context context, mb2<tn0> videoAdInfo, ou creativeAssetsProvider, n12 sponsoredAssetProviderCreator, fz callToActionAssetProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(creativeAssetsProvider, "creativeAssetsProvider");
        kotlin.jvm.internal.l.f(sponsoredAssetProviderCreator, "sponsoredAssetProviderCreator");
        kotlin.jvm.internal.l.f(callToActionAssetProvider, "callToActionAssetProvider");
        this.f33679a = videoAdInfo;
        this.f33680b = creativeAssetsProvider;
        this.f33681c = sponsoredAssetProviderCreator;
        this.f33682d = callToActionAssetProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ag<?>> a() {
        Object next;
        nu nuVarB = this.f33679a.b();
        this.f33680b.getClass();
        ArrayList arrayListI0 = C2097r.I0(ou.a(nuVarB));
        for (b9.l lVar : C2092m.W(new b9.l("sponsored", this.f33681c.a()), new b9.l("call_to_action", this.f33682d))) {
            String str = (String) lVar.f18083b;
            bz bzVar = (bz) lVar.f18084c;
            Iterator it = arrayListI0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.l.b(((ag) next).b(), str)) {
                    break;
                }
            }
            if (((ag) next) == null) {
                arrayListI0.add(bzVar.a());
            }
        }
        return arrayListI0;
    }
}
