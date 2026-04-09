package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class li {
    public static String a(RectF viewRect, jj0 imageValue) {
        ni niVarA;
        xz1 xz1VarB;
        float fWidth;
        int iC;
        kotlin.jvm.internal.l.f(viewRect, "viewRect");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        f02 f02VarE = imageValue.e();
        if (f02VarE == null || (niVarA = f02VarE.a()) == null || (xz1VarB = imageValue.e().b()) == null) {
            return null;
        }
        float fWidth2 = viewRect.width();
        float fHeight = viewRect.height();
        float fG = imageValue.g();
        float fA = imageValue.a();
        float fC = xz1VarB.c();
        float fB = xz1VarB.b();
        if (fWidth2 == 0.0f || fHeight == 0.0f || fG == 0.0f || fA == 0.0f || fC == 0.0f || fB == 0.0f) {
            return null;
        }
        if (viewRect.width() / viewRect.height() > xz1VarB.c() / xz1VarB.b()) {
            fWidth = viewRect.height();
            iC = xz1VarB.b();
        } else {
            fWidth = viewRect.width();
            iC = xz1VarB.c();
        }
        if (fWidth / iC <= 1.0f) {
            if (fWidth2 / fHeight > fC / fB) {
                if (kotlin.jvm.internal.l.b(niVarA.c(), niVarA.b())) {
                    return niVarA.c();
                }
            } else if (kotlin.jvm.internal.l.b(niVarA.d(), niVarA.a())) {
                return niVarA.d();
            }
        } else if (fWidth2 / fHeight > fG / fA) {
            if (kotlin.jvm.internal.l.b(niVarA.c(), niVarA.b())) {
                return niVarA.c();
            }
        } else if (kotlin.jvm.internal.l.b(niVarA.d(), niVarA.a())) {
            return niVarA.d();
        }
        return null;
    }
}
