package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import com.yandex.mobile.ads.impl.C4196s2;
import com.yandex.mobile.ads.impl.at;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class kt0 {

    /* renamed from: a, reason: collision with root package name */
    private final xs f29787a;

    /* renamed from: b, reason: collision with root package name */
    private final C4189r2 f29788b;

    /* renamed from: c, reason: collision with root package name */
    private final C4196s2 f29789c;

    /* renamed from: d, reason: collision with root package name */
    private final ft0 f29790d;

    public kt0(Context context, rm2 sdkEnvironmentModule, xs instreamAd) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        this.f29787a = instreamAd;
        this.f29788b = new C4189r2();
        this.f29789c = new C4196s2();
        this.f29790d = new ft0(context, sdkEnvironmentModule, instreamAd);
    }

    public final ArrayList a(String breakType) {
        C4196s2 c4196s2 = this.f29789c;
        List<zs> adBreaks = this.f29787a.a();
        c4196s2.getClass();
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        ArrayList arrayList = new ArrayList(adBreaks);
        Collections.sort(arrayList, new C4196s2.a());
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f29788b.getClass();
        kotlin.jvm.internal.l.f(breakType, "breakType");
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zs zsVar = (zs) it.next();
            if (kotlin.jvm.internal.l.b(zsVar.e(), breakType)) {
                if (at.a.f24808d == zsVar.b().a()) {
                    arrayList3.add(zsVar);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(C2092m.T(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(this.f29790d.a((zs) it2.next()));
        }
        return arrayList4;
    }
}
