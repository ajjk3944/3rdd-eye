package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes2.dex */
public class e0 extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f10698a;

    public e0(Context context) {
        this(context, null);
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f10698a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f10698a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }

    public e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10698a = getVisibility();
    }
}
