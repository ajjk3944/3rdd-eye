package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.iA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1523iA implements InterfaceC0739Ot {
    public Drawable A00;
    public final /* synthetic */ C0738Os A01;

    public C1523iA(C0738Os c0738Os) {
        this.A01 = c0738Os;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0739Ot
    public final Drawable A7E() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0739Ot
    public final C0738Os A7F() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0739Ot
    public final boolean A8q() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0739Ot
    public final boolean A9R() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0739Ot
    public final void AJK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0739Ot
    public final void AJl(int i4, int i10, int i11, int i12) {
        this.A01.A05.set(i4, i10, i11, i12);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i4, this.A01.A04.top + i10, this.A01.A04.right + i11, this.A01.A04.bottom + i12);
    }
}
