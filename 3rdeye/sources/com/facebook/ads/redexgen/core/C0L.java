package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0L extends AbstractViewOnTouchListenerC21620d implements InterfaceC3236ck {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC3014Xy A04;
    public boolean A05;
    public final C6F A06;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    static {
        A03();
    }

    public C0L(C3272dL c3272dL) {
        super(c3272dL);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C6F(c3272dL, new C3233ch(), new C3232cg());
        A02();
    }

    public C0L(C3272dL c3272dL, AttributeSet attributeSet) {
        super(c3272dL, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C6F(c3272dL, new C3233ch(), new C3232cg());
        A02();
    }

    public C0L(C3272dL c3272dL, AttributeSet attributeSet, int i) {
        super(c3272dL, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C6F(c3272dL, new C3233ch(), new C3232cg());
        A02();
    }

    private int A00(int i) {
        int i10 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i11 = (measuredWidth - spacing) - i10;
        int itemSize = getAdapter().A0B();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i;
            }
            int spacing3 = numFullItems * i10;
            spacing2 = (int) ((i11 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2C(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        XP.A0I(this);
    }

    private void A04(int i, int i10) {
        if (i == this.A03 && i10 == this.A02) {
            return;
        }
        this.A03 = i;
        this.A02 = i10;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractViewOnTouchListenerC21620d
    public final void A20(int i, boolean z10) {
        super.A20(i, z10);
        A04(i, 0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3236ck
    public final int A8g(int i) {
        int iAbs = Math.abs(i);
        int scrollXAbs = ((AbstractViewOnTouchListenerC21620d) this).A06;
        if (iAbs <= scrollXAbs) {
            return 0;
        }
        int scrollXAbs2 = this.A01;
        if (scrollXAbs2 == 0) {
            return 1;
        }
        int scrollXAbs3 = this.A01;
        return 1 + (iAbs / scrollXAbs3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C23196g, android.view.View
    public final void onMeasure(int i, int i10) {
        int height;
        int itemSize;
        super.onMeasure(i, i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i11 = (int) AbstractC2975Wl.A02;
            int verticalPadding = U7.A0F(getContext());
            height = (i11 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i10);
        switch (verticalPadding3) {
            case RecyclerView.UNDEFINED_DURATION /* -2147483648 */:
                int verticalPadding4 = View.MeasureSpec.getSize(i10);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i10);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = C3009Xt.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C23196g
    public void setAdapter(QC qc) {
        this.A06.A2J(qc == null ? -1 : qc.hashCode());
        super.setAdapter(qc);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i10 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i11 = i10 - pageWidth2;
        C6F c6f = this.A06;
        int pageWidth3 = this.A01;
        c6f.A2K((i11 - pageWidth3) / 2);
        C6F c6f2 = this.A06;
        int pageWidth4 = this.A01;
        c6f2.A2I(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A20(i, false);
    }

    public void setOnPageChangedListener(InterfaceC3014Xy interfaceC3014Xy) {
        this.A04 = interfaceC3014Xy;
    }

    public void setShowTextInCarousel(boolean z10) {
        this.A05 = z10;
    }
}
