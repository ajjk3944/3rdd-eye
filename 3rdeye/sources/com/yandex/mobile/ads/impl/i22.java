package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ij;
import com.yandex.mobile.ads.impl.vy1;

/* loaded from: classes3.dex */
public final class i22 {
    public static final ts a(Context context, int i) {
        cj prVar;
        cj prVar2;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        ij.a aVar = ij.f28703c;
        ij bannerSizeCalculationType = null;
        String strN = du1VarA != null ? du1VarA.n() : null;
        aVar.getClass();
        ij[] ijVarArrValues = ij.values();
        int length = ijVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            ij ijVar = ijVarArrValues[i10];
            if (kotlin.jvm.internal.l.b(ijVar.a(), strN)) {
                bannerSizeCalculationType = ijVar;
                break;
            }
            i10++;
        }
        if (bannerSizeCalculationType == null) {
            bannerSizeCalculationType = ij.f28704d;
        }
        ef1 ef1Var = ef1.f26822d;
        kotlin.jvm.internal.l.f(bannerSizeCalculationType, "bannerSizeCalculationType");
        int iOrdinal = bannerSizeCalculationType.ordinal();
        if (iOrdinal == 0) {
            prVar = new pr();
        } else if (iOrdinal == 1) {
            prVar = new ln1();
        } else if (iOrdinal == 2) {
            prVar = new jt1();
        } else if (iOrdinal == 3) {
            prVar = new kt1();
        } else {
            if (iOrdinal != 4) {
                throw new b9.j();
            }
            prVar = new uy0();
        }
        int iA = prVar.a(context, i, ef1Var);
        vy1.a aVar2 = vy1.a.f34740e;
        lb0 lb0Var = new lb0(i, iA, aVar2);
        ef1 ef1Var2 = ef1.f26821c;
        int iOrdinal2 = bannerSizeCalculationType.ordinal();
        if (iOrdinal2 == 0) {
            prVar2 = new pr();
        } else if (iOrdinal2 == 1) {
            prVar2 = new ln1();
        } else if (iOrdinal2 == 2) {
            prVar2 = new jt1();
        } else if (iOrdinal2 == 3) {
            prVar2 = new kt1();
        } else {
            if (iOrdinal2 != 4) {
                throw new b9.j();
            }
            prVar2 = new uy0();
        }
        lb0 lb0Var2 = new lb0(i, prVar2.a(context, i, ef1Var2), aVar2);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.c(applicationContext);
        return new ts(new jf1(applicationContext, lb0Var, lb0Var2));
    }
}
