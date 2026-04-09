package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0x, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0x extends C1F implements InterfaceC1271e2 {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC0988Ys A04;
    public boolean A05;
    public final C02956v A06;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
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

    public C0x(C1436gi c1436gi) {
        super(c1436gi);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C02956v(c1436gi, new C1269e0(), new C1268dz());
        A02();
    }

    public C0x(C1436gi c1436gi, AttributeSet attributeSet) {
        super(c1436gi, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C02956v(c1436gi, new C1269e0(), new C1268dz());
        A02();
    }

    public C0x(C1436gi c1436gi, AttributeSet attributeSet, int i4) {
        super(c1436gi, attributeSet, i4);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C02956v(c1436gi, new C1269e0(), new C1268dz());
        A02();
    }

    private int A00(int i4) {
        int i10 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i11 = (measuredWidth - spacing) - i10;
        int itemSize = getAdapter().A0B();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i4) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i4;
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
        YB.A0K(this);
    }

    private void A04(int i4, int i10) {
        if (i4 == this.A03 && i10 == this.A02) {
            return;
        }
        this.A03 = i4;
        this.A02 = i10;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.instagram.common.viewpoint.core.C1F
    public final void A20(int i4, boolean z3) {
        super.A20(i4, z3);
        A04(i4, 0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271e2
    public final int A8o(int i4) {
        int iAbs = Math.abs(i4);
        int scrollXAbs = ((C1F) this).A06;
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

    @Override // com.instagram.common.viewpoint.core.C7M, android.view.View
    public final void onMeasure(int i4, int i10) {
        int height;
        int itemSize;
        super.onMeasure(i4, i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i11 = (int) XX.A02;
            int verticalPadding = C0886Up.A0F(getContext());
            height = (i11 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i10);
        switch (verticalPadding3) {
            case LinearLayoutManager.INVALID_OFFSET /* -2147483648 */:
                int verticalPadding4 = View.MeasureSpec.getSize(i10);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i10);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = C0983Yn.A09;
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

    @Override // com.instagram.common.viewpoint.core.C7M
    public void setAdapter(AbstractC0784Qq abstractC0784Qq) {
        this.A06.A2J(abstractC0784Qq == null ? -1 : abstractC0784Qq.hashCode());
        super.setAdapter(abstractC0784Qq);
    }

    public void setChildSpacing(int i4) {
        this.A00 = i4;
    }

    public void setChildWidth(int i4) {
        this.A01 = i4;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i10 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i11 = i10 - pageWidth2;
        C02956v c02956v = this.A06;
        int pageWidth3 = this.A01;
        c02956v.A2K((i11 - pageWidth3) / 2);
        C02956v c02956v2 = this.A06;
        int pageWidth4 = this.A01;
        c02956v2.A2I(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i4) {
        A20(i4, false);
    }

    public void setOnPageChangedListener(InterfaceC0988Ys interfaceC0988Ys) {
        this.A04 = interfaceC0988Ys;
    }

    public void setShowTextInCarousel(boolean z3) {
        this.A05 = z3;
    }
}
