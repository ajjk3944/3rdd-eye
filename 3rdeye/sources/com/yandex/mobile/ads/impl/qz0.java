package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rz0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class qz0 {
    public static final void a(ArrayList report) {
        kotlin.jvm.internal.l.f(report, "report");
        Iterator it = report.iterator();
        while (it.hasNext()) {
            rz0.a aVar = (rz0.a) it.next();
            int iOrdinal = aVar.b().ordinal();
            if (iOrdinal == 0) {
                uo0.b(aVar.a(), new Object[0]);
            } else if (iOrdinal == 1) {
                uo0.a(aVar.a(), new Object[0]);
            }
        }
    }
}
