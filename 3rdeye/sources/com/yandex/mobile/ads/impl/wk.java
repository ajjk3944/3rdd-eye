package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wk {
    public static jp1 a(xk xkVar) {
        ns nsVarA;
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.a((xkVar == null || (nsVarA = xkVar.a()) == null) ? null : nsVarA.b(), Constants.ADMON_AD_TYPE);
        jp1Var.a(xkVar != null ? xkVar.b() : null, "parameters");
        vy1 vy1VarC = xkVar != null ? xkVar.c() : null;
        if (vy1VarC != null) {
            jp1Var.b(vy1VarC.a().a(), "size_type");
            jp1Var.b(Integer.valueOf(vy1VarC.getWidth()), "width");
            jp1Var.b(Integer.valueOf(vy1VarC.getHeight()), "height");
        }
        return jp1Var;
    }
}
