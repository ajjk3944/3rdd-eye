package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kp1 {
    public static final jp1 a(jp1 jp1Var, jp1 jp1Var2) {
        kotlin.jvm.internal.l.f(jp1Var, "<this>");
        if (jp1Var2 == null) {
            return new jp1((Map<String, ? extends Object>) jp1Var.b(), jp1Var.a());
        }
        C4075b c4075bA = jp1Var.a();
        if (c4075bA == null) {
            c4075bA = jp1Var2.a();
        }
        return new jp1(C2078B.q(jp1Var.b(), jp1Var2.b()), c4075bA);
    }
}
