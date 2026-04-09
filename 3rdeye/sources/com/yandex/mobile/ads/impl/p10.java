package com.yandex.mobile.ads.impl;

import H6.C0675l;

/* loaded from: classes3.dex */
public final class p10 {
    public static final px1 a(C0675l c0675l) {
        kotlin.jvm.internal.l.f(c0675l, "<this>");
        j6.h actionHandler = c0675l.getActionHandler();
        px1 px1Var = actionHandler instanceof px1 ? (px1) actionHandler : null;
        if (px1Var == null) {
            px1Var = new px1(0);
        }
        c0675l.setActionHandler(px1Var);
        return px1Var;
    }
}
