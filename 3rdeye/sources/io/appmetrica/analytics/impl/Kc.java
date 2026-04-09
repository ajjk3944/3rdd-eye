package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class Kc extends C5066x5 {

    /* renamed from: n, reason: collision with root package name */
    public final C4852ok f39718n;

    public Kc(Context context, C4759l5 c4759l5, J4 j4, AbstractC4889q5 abstractC4889q5, C4544cm c4544cm, InterfaceC4952sh interfaceC4952sh, ICommonExecutor iCommonExecutor, int i, C4852ok c4852ok, Yb yb, K9 k92) {
        super(context, c4759l5, j4, abstractC4889q5, c4544cm, interfaceC4952sh, iCommonExecutor, i, yb, k92);
        this.f39718n = c4852ok;
    }

    public final C4809n3 a(Ic ic) {
        Field field;
        Context context = this.f42033c;
        IHandlerExecutor iHandlerExecutorA = this.f39718n.a();
        Executor executorF = this.f39718n.f();
        String str = null;
        try {
            Class<?> clsFindClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((clsFindClass == null || (field = clsFindClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        BillingType billingType = (str == null || y9.q.i0(str) || y9.n.a0(str, "2.", false) || y9.n.a0(str, "3.", false) || y9.n.a0(str, "4.", false)) ? BillingType.NONE : (!y9.n.a0(str, "5.", false) && y9.n.a0(str, "6.", false)) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6;
        return new C4809n3(context, iHandlerExecutorA, executorF, billingType, new C4705j3(Nm.a(C5038w2.class).a(this.f42033c)), new C4680i3(ic, Ga.j().w().e()));
    }

    public final Ag b(Ic ic) {
        C5075xe c5075xe = new C5075xe(ic);
        Objects.requireNonNull(ic);
        return new Ag(c5075xe, new Hc(ic), ic);
    }

    @Override // io.appmetrica.analytics.impl.C5066x5
    public final I9 a(N9 n9, C4555d7 c4555d7, C4513bh c4513bh, J4 j4, C4759l5 c4759l5, Cif cif) {
        return this.f42041l.a(n9, c4555d7, c4513bh, j4, c4759l5, cif).a();
    }
}
