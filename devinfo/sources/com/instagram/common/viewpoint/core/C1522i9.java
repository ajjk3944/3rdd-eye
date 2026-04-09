package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1522i9 implements InterfaceC0740Ou {
    private C0741Ov A00(InterfaceC0739Ot interfaceC0739Ot) {
        return (C0741Ov) interfaceC0739Ot.A7E();
    }

    public final void A01(InterfaceC0739Ot interfaceC0739Ot) {
        if (!interfaceC0739Ot.A9R()) {
            interfaceC0739Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC0739Ot);
        float fA8r = A8r(interfaceC0739Ot);
        float elevation = AbstractC0743Ox.A00(fA8S, fA8r, interfaceC0739Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC0743Ox.A01(fA8S, fA8r, interfaceC0739Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC0739Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final ColorStateList A71(InterfaceC0739Ot interfaceC0739Ot) {
        return A00(interfaceC0739Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final float A7v(InterfaceC0739Ot interfaceC0739Ot) {
        return interfaceC0739Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final float A8S(InterfaceC0739Ot interfaceC0739Ot) {
        return A00(interfaceC0739Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final float A8X(InterfaceC0739Ot interfaceC0739Ot) {
        return A8r(interfaceC0739Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final float A8Y(InterfaceC0739Ot interfaceC0739Ot) {
        return A8r(interfaceC0739Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final float A8r(InterfaceC0739Ot interfaceC0739Ot) {
        return A00(interfaceC0739Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AAG(InterfaceC0739Ot interfaceC0739Ot, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C0741Ov background = new C0741Ov(colorStateList, f10);
        interfaceC0739Ot.AJK(background);
        View view = interfaceC0739Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AJX(interfaceC0739Ot, f12);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void ADP(InterfaceC0739Ot interfaceC0739Ot) {
        AJX(interfaceC0739Ot, A8S(interfaceC0739Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AFT(InterfaceC0739Ot interfaceC0739Ot) {
        AJX(interfaceC0739Ot, A8S(interfaceC0739Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AJJ(InterfaceC0739Ot interfaceC0739Ot, ColorStateList colorStateList) {
        A00(interfaceC0739Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AJP(InterfaceC0739Ot interfaceC0739Ot, float f10) {
        interfaceC0739Ot.A7F().setElevation(f10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AJX(InterfaceC0739Ot interfaceC0739Ot, float f10) {
        A00(interfaceC0739Ot).A07(f10, interfaceC0739Ot.A9R(), interfaceC0739Ot.A8q());
        A01(interfaceC0739Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0740Ou
    public final void AJj(InterfaceC0739Ot interfaceC0739Ot, float f10) {
        A00(interfaceC0739Ot).A06(f10);
    }
}
