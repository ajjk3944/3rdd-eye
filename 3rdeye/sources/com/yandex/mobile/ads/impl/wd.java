package com.yandex.mobile.ads.impl;

import A9.C0575f;
import F9.C0663f;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c9.C2101v;
import com.yandex.mobile.ads.impl.ew1;
import f9.InterfaceC4350h;
import java.util.Set;

/* loaded from: classes3.dex */
public final class wd {
    private wd() {
    }

    public static void a(Context context, mp1 reporter) {
        vd vdVar;
        I9.b bVar = A9.U.f212b;
        C0663f c0663fA = A9.F.a(InterfaceC4350h.a.C0456a.d(C0575f.a(), bVar));
        td tdVar = new td(bVar, new Handler(Looper.getMainLooper()));
        ud udVar = new ud(reporter);
        l42 l42Var = new l42();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA == null || !du1VarA.i()) {
            return;
        }
        Long lJ = du1VarA.j();
        long jLongValue = lJ != null ? lJ.longValue() : 1000L;
        Long lK = du1VarA.k();
        long jLongValue2 = lK != null ? lK.longValue() : 3500L;
        Set<z50> setR = du1VarA.r();
        if (setR == null) {
            setR = C2101v.f18583b;
        }
        Set<z50> set = setR;
        vd vdVar2 = vd.f34449k;
        if (vdVar2 == null) {
            synchronized (vd.f34448j) {
                vdVar = vd.f34449k;
                if (vdVar == null) {
                    vd vdVar3 = new vd(jLongValue, jLongValue2, set, c0663fA, tdVar, udVar, l42Var, 0);
                    vd.f34449k = vdVar3;
                    vdVar = vdVar3;
                }
            }
            vdVar2 = vdVar;
        }
        vdVar2.c();
    }
}
