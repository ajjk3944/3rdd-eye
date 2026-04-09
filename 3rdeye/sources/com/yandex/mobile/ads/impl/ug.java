package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ug {

    /* renamed from: a, reason: collision with root package name */
    private final lj0 f34055a;

    public /* synthetic */ ug() {
        this(new lj0());
    }

    public final ArrayList a(List assets, Map images) {
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(images, "images");
        ArrayList arrayList = new ArrayList();
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            ag agVar = (ag) it.next();
            Object objD = agVar.d();
            String strC = agVar.c();
            if ("image".equals(strC) && (objD instanceof jj0)) {
                this.f34055a.getClass();
                if (lj0.a((jj0) objD, images)) {
                    arrayList.add(agVar);
                }
            } else {
                if ("media".equals(strC) && (objD instanceof sw0)) {
                    sw0 sw0Var = (sw0) objD;
                    if (sw0Var.a() != null) {
                        kotlin.jvm.internal.l.d(objD, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List<jj0> listA = sw0Var.a();
                        jj0 jj0Var = listA != null ? (jj0) C2097r.q0(listA) : null;
                        ya2 ya2VarC = sw0Var.c();
                        ku0 ku0VarB = sw0Var.b();
                        if (ya2VarC == null && ku0VarB == null) {
                            if (jj0Var != null) {
                                this.f34055a.getClass();
                                if (lj0.a(jj0Var, images)) {
                                }
                            }
                        }
                        arrayList.add(agVar);
                    }
                }
                arrayList.add(agVar);
            }
        }
        return arrayList;
    }

    public ug(lj0 imageValueValidator) {
        kotlin.jvm.internal.l.f(imageValueValidator, "imageValueValidator");
        this.f34055a = imageValueValidator;
    }
}
