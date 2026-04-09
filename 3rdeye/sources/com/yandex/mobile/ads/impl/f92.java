package com.yandex.mobile.ads.impl;

import c9.C2101v;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f92 {
    public static final void a(e92 e92Var, ip1 report) {
        String strA;
        Set<Long> setB;
        kotlin.jvm.internal.l.f(e92Var, "<this>");
        kotlin.jvm.internal.l.f(report, "report");
        try {
            C4075b c4075bA = report.a();
            if (c4075bA == null || (strA = c4075bA.a()) == null) {
                strA = "";
            }
            C4075b c4075bA2 = report.a();
            if (c4075bA2 == null || (setB = c4075bA2.b()) == null) {
                setB = C2101v.f18583b;
            }
            e92Var.setExperiments(strA);
            e92Var.setTriggeredTestIds(setB);
            setB.toString();
            fp0.a(new Object[0]);
        } catch (Throwable th) {
            th.toString();
            fp0.b(new Object[0]);
        }
    }
}
