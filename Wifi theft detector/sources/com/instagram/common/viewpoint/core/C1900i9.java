package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1900i9 implements InterfaceC1118Ou {
    private C1119Ov A00(InterfaceC1117Ot interfaceC1117Ot) {
        return (C1119Ov) interfaceC1117Ot.A7E();
    }

    public final void A01(InterfaceC1117Ot interfaceC1117Ot) {
        if (!interfaceC1117Ot.A9R()) {
            interfaceC1117Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC1117Ot);
        float fA8r = A8r(interfaceC1117Ot);
        float elevation = AbstractC1121Ox.A00(fA8S, fA8r, interfaceC1117Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1121Ox.A01(fA8S, fA8r, interfaceC1117Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC1117Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final ColorStateList A71(InterfaceC1117Ot interfaceC1117Ot) {
        return A00(interfaceC1117Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final float A7v(InterfaceC1117Ot interfaceC1117Ot) {
        return interfaceC1117Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final float A8S(InterfaceC1117Ot interfaceC1117Ot) {
        return A00(interfaceC1117Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final float A8X(InterfaceC1117Ot interfaceC1117Ot) {
        return A8r(interfaceC1117Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final float A8Y(InterfaceC1117Ot interfaceC1117Ot) {
        return A8r(interfaceC1117Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final float A8r(InterfaceC1117Ot interfaceC1117Ot) {
        return A00(interfaceC1117Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AAG(InterfaceC1117Ot interfaceC1117Ot, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C1119Ov background = new C1119Ov(colorStateList, f10);
        interfaceC1117Ot.AJK(background);
        View view = interfaceC1117Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AJX(interfaceC1117Ot, f12);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void ADP(InterfaceC1117Ot interfaceC1117Ot) {
        AJX(interfaceC1117Ot, A8S(interfaceC1117Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AFT(InterfaceC1117Ot interfaceC1117Ot) {
        AJX(interfaceC1117Ot, A8S(interfaceC1117Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AJJ(InterfaceC1117Ot interfaceC1117Ot, ColorStateList colorStateList) {
        A00(interfaceC1117Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AJP(InterfaceC1117Ot interfaceC1117Ot, float f10) {
        interfaceC1117Ot.A7F().setElevation(f10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AJX(InterfaceC1117Ot interfaceC1117Ot, float f10) {
        A00(interfaceC1117Ot).A07(f10, interfaceC1117Ot.A9R(), interfaceC1117Ot.A8q());
        A01(interfaceC1117Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1118Ou
    public final void AJj(InterfaceC1117Ot interfaceC1117Ot, float f10) {
        A00(interfaceC1117Ot).A06(f10);
    }
}
