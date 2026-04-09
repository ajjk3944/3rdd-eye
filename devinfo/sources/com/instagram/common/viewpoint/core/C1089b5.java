package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1089b5 extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C1089b5(C1436gi c1436gi) {
        super(c1436gi);
        this.A03 = new ImageView(c1436gi);
        this.A02 = new ImageView(c1436gi);
        A00();
    }

    public C1089b5(C1436gi c1436gi, AttributeSet attributeSet) {
        super(c1436gi, attributeSet);
        this.A03 = new ImageView(c1436gi, attributeSet);
        this.A02 = new ImageView(c1436gi, attributeSet);
        A00();
    }

    public C1089b5(C1436gi c1436gi, AttributeSet attributeSet, int i4) {
        super(c1436gi, attributeSet, i4);
        this.A03 = new ImageView(c1436gi, attributeSet, i4);
        this.A02 = new ImageView(c1436gi, attributeSet, i4);
        A00();
    }

    public C1089b5(C1436gi c1436gi, AttributeSet attributeSet, int i4, int i10) {
        super(c1436gi, attributeSet, i4, i10);
        this.A03 = new ImageView(c1436gi, attributeSet, i4, i10);
        this.A02 = new ImageView(c1436gi, attributeSet, i4, i10);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC0946Xc.A04(this.A03, EnumC0946Xc.A0B);
        setId(YB.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z3, i4, i10, i11, i12);
            return;
        }
        int i13 = i11 - i4;
        int i14 = i12 - i10;
        float fMin = Math.min(i13 / this.A01, i14 / this.A00);
        int i15 = (int) (this.A01 * fMin);
        int i16 = (int) (this.A00 * fMin);
        this.A02.layout(i4, i10, i11, i12);
        int blurBorderViewHeight = (i13 / 2) + i4;
        int blurBorderViewWidth = (i14 / 2) + i10;
        this.A03.layout(blurBorderViewHeight - (i15 / 2), blurBorderViewWidth - (i16 / 2), (i15 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i16 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            YB.A0V(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            YB.A0N(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
