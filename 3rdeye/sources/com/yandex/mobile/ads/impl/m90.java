package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class m90 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f30306a;

    /* renamed from: b, reason: collision with root package name */
    private final d30 f30307b;

    public /* synthetic */ m90(C4072a3 c4072a3) {
        this(c4072a3, new d30());
    }

    public final l90 a(Context context, List<pk1> preloadedDivKitDesigns) {
        Object next;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        this.f30307b.getClass();
        if (d30.a(context)) {
            Iterator<T> it = preloadedDivKitDesigns.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.l.b(((pk1) next).c().e(), c10.f25492c.a())) {
                    break;
                }
            }
            pk1 pk1Var = (pk1) next;
            if (pk1Var != null) {
                return new l90(pk1Var, this.f30306a, new h20(), new vq0());
            }
        }
        return null;
    }

    public m90(C4072a3 adConfiguration, d30 divKitIntegrationValidator) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f30306a = adConfiguration;
        this.f30307b = divKitIntegrationValidator;
    }
}
