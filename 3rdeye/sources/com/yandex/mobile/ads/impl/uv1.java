package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import s9.AbstractC5588a;

/* loaded from: classes3.dex */
public final class uv1 extends AbstractC5588a<vw0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sv1 f34227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv1(rv1 rv1Var, sv1 sv1Var) {
        super(rv1Var);
        this.f34227a = sv1Var;
    }

    @Override // s9.AbstractC5588a
    public final void afterChange(w9.i<?> property, vw0 vw0Var, vw0 vw0Var2) {
        CustomizableMediaView customizableMediaViewD;
        sw0 sw0VarC;
        kotlin.jvm.internal.l.f(property, "property");
        vw0 vw0Var3 = vw0Var2;
        vw0 vw0Var4 = vw0Var;
        if (kotlin.jvm.internal.l.b(vw0Var3, vw0Var4) || (customizableMediaViewD = sv1.d(this.f34227a)) == null || (sw0VarC = sv1.c(this.f34227a)) == null) {
            return;
        }
        vw0Var4.a(customizableMediaViewD);
        customizableMediaViewD.post(new tv1(vw0Var3, customizableMediaViewD, sw0VarC));
    }
}
