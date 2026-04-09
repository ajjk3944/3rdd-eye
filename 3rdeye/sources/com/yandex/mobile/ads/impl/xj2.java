package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import com.yandex.mobile.ads.impl.nu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class xj2 {

    /* renamed from: a, reason: collision with root package name */
    private final za2 f35337a;

    /* renamed from: b, reason: collision with root package name */
    private final bk2 f35338b;

    public /* synthetic */ xj2(za2 za2Var) {
        this(za2Var, new bk2());
    }

    public final ArrayList a(za2 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        List<nu> listE = this.f35337a.e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            C2095p.b0(((nu) it.next()).j(), arrayList);
        }
        List<nu> listE2 = videoAd.e();
        ArrayList arrayList2 = new ArrayList(C2092m.T(listE2, 10));
        for (nu adCreative : listE2) {
            this.f35338b.getClass();
            kotlin.jvm.internal.l.f(adCreative, "adCreative");
            List<xh0> listF = adCreative.f();
            ArrayList arrayList3 = new ArrayList(C2092m.T(listF, 10));
            Iterator<T> it2 = listF.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((xh0) it2.next()).a());
            }
            Set setK0 = C2097r.K0(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it3 = listE.iterator();
            while (it3.hasNext()) {
                C2095p.b0(((nu) it3.next()).f(), arrayList4);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                if (setK0.add(((xh0) next).a())) {
                    arrayList5.add(next);
                }
            }
            arrayList2.add(new nu.a().c(adCreative.g()).b(adCreative.h()).a(adCreative.f()).c(arrayList).b(adCreative.c()).a(adCreative.i()).a(adCreative.e()).a(arrayList5).c(adCreative.j()).a(adCreative.b()).a());
        }
        return arrayList2;
    }

    public xj2(za2 wrapperAd, bk2 iconsProvider) {
        kotlin.jvm.internal.l.f(wrapperAd, "wrapperAd");
        kotlin.jvm.internal.l.f(iconsProvider, "iconsProvider");
        this.f35337a = wrapperAd;
        this.f35338b = iconsProvider;
    }
}
