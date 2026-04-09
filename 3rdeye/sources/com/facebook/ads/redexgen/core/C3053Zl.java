package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3053Zl extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C3053Zl(C3272dL c3272dL) {
        super(c3272dL);
        this.A03 = new ImageView(c3272dL);
        this.A02 = new ImageView(c3272dL);
        A00();
    }

    public C3053Zl(C3272dL c3272dL, AttributeSet attributeSet) {
        super(c3272dL, attributeSet);
        this.A03 = new ImageView(c3272dL, attributeSet);
        this.A02 = new ImageView(c3272dL, attributeSet);
        A00();
    }

    public C3053Zl(C3272dL c3272dL, AttributeSet attributeSet, int i) {
        super(c3272dL, attributeSet, i);
        this.A03 = new ImageView(c3272dL, attributeSet, i);
        this.A02 = new ImageView(c3272dL, attributeSet, i);
        A00();
    }

    public C3053Zl(C3272dL c3272dL, AttributeSet attributeSet, int i, int i10) {
        super(c3272dL, attributeSet, i, i10);
        this.A03 = new ImageView(c3272dL, attributeSet, i, i10);
        this.A02 = new ImageView(c3272dL, attributeSet, i, i10);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC2980Wq.A04(this.A03, EnumC2980Wq.A0B);
        setId(XP.A00());
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
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z10, i, i10, i11, i12);
            return;
        }
        int i13 = i11 - i;
        int i14 = i12 - i10;
        float fMin = Math.min(i13 / this.A01, i14 / this.A00);
        int i15 = (int) (this.A01 * fMin);
        int i16 = (int) (this.A00 * fMin);
        this.A02.layout(i, i10, i11, i12);
        int blurBorderViewHeight = (i13 / 2) + i;
        int blurBorderViewWidth = (i14 / 2) + i10;
        this.A03.layout(blurBorderViewHeight - (i15 / 2), blurBorderViewWidth - (i16 / 2), (i15 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i16 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            XP.A0Q(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            XP.A0K(this.A02, 0);
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
