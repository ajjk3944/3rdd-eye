package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f25296a;

    /* renamed from: b, reason: collision with root package name */
    private final d30 f25297b;

    public /* synthetic */ bj(C4072a3 c4072a3) {
        this(c4072a3, new d30());
    }

    public final aj a(Context context, h61 nativeAdPrivate) {
        w20 w20Var;
        Object next;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        this.f25297b.getClass();
        if (d30.a(context)) {
            List<w20> listC = nativeAdPrivate.c();
            if (listC != null) {
                Iterator<T> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.l.b(((w20) next).e(), c10.f25492c.a())) {
                        break;
                    }
                }
                w20Var = (w20) next;
            } else {
                w20Var = null;
            }
            if (w20Var != null) {
                N7.U3 u3B = w20Var.b();
                C4072a3 c4072a3 = this.f25296a;
                return new aj(u3B, c4072a3, new h20(), new r10(c4072a3.q().c(), new tz1()), new vq0());
            }
        }
        return null;
    }

    public bj(C4072a3 adConfiguration, d30 divKitIntegrationValidator) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f25296a = adConfiguration;
        this.f25297b = divKitIntegrationValidator;
    }
}
