package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.monetization.ads.mediation.base.a;
import com.yandex.mobile.ads.impl.do1;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class qx0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    private final ux0 f32371a;

    /* renamed from: b, reason: collision with root package name */
    private final wz0 f32372b;

    public /* synthetic */ qx0(ux0 ux0Var) {
        this(ux0Var, new wz0());
    }

    public final T a(Context context, zy0 mediationNetwork, Class<T> clazz) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(clazz, "clazz");
        T t10 = null;
        try {
            String strE = mediationNetwork.e();
            this.f32372b.getClass();
            if (!wz0.a(context, strE)) {
                return null;
            }
            Object objA = do1.a.a(strE, new Object[0]);
            T tCast = clazz.cast(objA);
            if (tCast == null) {
                try {
                    a(context, mediationNetwork, objA == null ? String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{strE}, 1)) : String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{objA.getClass().getName(), clazz.getName()}, 2)));
                } catch (ClassCastException e4) {
                    e = e4;
                    t10 = tCast;
                    a(context, mediationNetwork, "does_not_conform_to_protocol", e);
                    return t10;
                } catch (Throwable th) {
                    th = th;
                    t10 = tCast;
                    a(context, mediationNetwork, "could_not_create_adapter", th);
                    return t10;
                }
            }
            return tCast;
        } catch (ClassCastException e10) {
            e = e10;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public qx0(ux0 mediatedAdapterReporter, wz0 mediationSupportedChecker) {
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediationSupportedChecker, "mediationSupportedChecker");
        this.f32371a = mediatedAdapterReporter;
        this.f32372b = mediationSupportedChecker;
    }

    private final void a(Context context, zy0 zy0Var, String str) {
        this.f32371a.a(context, zy0Var, C2078B.o(new b9.l("reason", "could_not_create_adapter"), new b9.l("description", str)), (String) null);
    }

    private final void a(Context context, zy0 zy0Var, String str, Throwable th) {
        LinkedHashMap linkedHashMapP = C2078B.p(new b9.l("reason", str));
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        fp0.c(new Object[0]);
        linkedHashMapP.put("description", th.getClass().getName() + " " + message);
        this.f32371a.a(context, zy0Var, linkedHashMapP, (String) null);
    }
}
