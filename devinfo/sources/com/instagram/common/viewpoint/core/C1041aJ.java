package com.instagram.common.viewpoint.core;

import android.animation.LayoutTransition;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1041aJ extends LinearLayout {
    public static String[] A0I = {"Jjhv1QqAIW86EmEZitDWSXUy5KAygWmD", "Knznf5NxnzMSGuCyCavmDPpLrbg6IGSX", "ILZruYKannRuDYsFiZYXNynBpyms", "eZKheB7115JCtr5xxUXw9oXkLPe4M5DC", "o2TLnhgUMatQJZ63WkSJRDhfBnbI", "vZrVQG4SvGUnBHUUGdfxrKmAlJmFc80m", "RT8BtEaKHOdmDtB2bzxk3zMCIxucDNYE", "yGiX4fEKWzcCLDIcRuEbwAcVWGPLZUB"};
    public ImageView A00;
    public ImageView A01;
    public InterfaceC1042aK A02;
    public Runnable A03;
    public boolean A04;
    public final int A05;
    public final Bitmap A06;
    public final Bitmap A07;
    public final Bitmap A08;
    public final Bitmap A09;
    public final Bitmap A0A;
    public final Bitmap A0B;
    public final AbstractC1601jd A0C;
    public final C1436gi A0D;
    public final VI A0E;
    public final InterfaceC0977Yh A0F;
    public final EnumC1044aM A0G;
    public final EnumC1047aP A0H;

    public C1041aJ(C1436gi c1436gi, boolean z3, AbstractC1601jd abstractC1601jd, VI vi2, InterfaceC0977Yh interfaceC0977Yh, EnumC1044aM enumC1044aM, InterfaceC1042aK interfaceC1042aK, EnumC1047aP enumC1047aP) {
        this(c1436gi, z3, abstractC1601jd, vi2, interfaceC0977Yh, enumC1044aM, enumC1047aP);
        this.A02 = interfaceC1042aK;
    }

    public C1041aJ(C1436gi c1436gi, boolean z3, AbstractC1601jd abstractC1601jd, VI vi2, InterfaceC0977Yh interfaceC0977Yh, EnumC1044aM enumC1044aM, EnumC1047aP enumC1047aP) {
        super(c1436gi);
        this.A07 = YN.A01(YM.CREDIT_LINE_INFO_ICON);
        this.A06 = YN.A01(YM.CREDIT_LINE_DETAIL_ICON);
        this.A04 = false;
        this.A08 = YN.A01(YM.AD_CHOICE_ICON);
        this.A09 = YN.A01(YM.AD_CHOICE_TEXT);
        this.A0A = YN.A01(YM.AD_CREDIT_LINE_COLLAPSE_TEXT);
        this.A0B = YN.A01(YM.CREDIT_LINE_TEXT);
        this.A05 = abstractC1601jd.A27();
        this.A0E = vi2;
        this.A0F = interfaceC0977Yh;
        this.A0G = enumC1044aM;
        this.A0D = c1436gi;
        this.A0C = abstractC1601jd;
        this.A0H = enumC1047aP;
        A05();
        A0K(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        YB.A0M(this.A00, 1.0f, 0.0f, 100);
        A0E(3, 300, new InterfaceC1028a6() { // from class: com.facebook.ads.redexgen.X.MA
            @Override // com.instagram.common.viewpoint.core.InterfaceC1028a6
            public final void AK7(Object obj, long j) {
                this.A00.A0U(obj, j);
            }
        }, new C1037aF(this));
        postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.aA
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0R();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        A0E(2, 300, new InterfaceC1028a6() { // from class: com.facebook.ads.redexgen.X.MB
            @Override // com.instagram.common.viewpoint.core.InterfaceC1028a6
            public final void AK7(Object obj, long j) {
                this.A00.A0V(obj, j);
            }
        }, new C1035aD(this));
        YB.A0M(this.A00, 0.0f, 1.0f, 0);
        YB.A0O(this.A00, 0);
    }

    private void A04() {
        if (this.A04 && this.A03 != null) {
            A06();
            A02();
        }
    }

    private void A05() {
        switch (this.A0H) {
            case A03:
                AbstractC1043aL.A02(this.A0D, this.A0G);
                break;
            case A02:
                AbstractC1043aL.A01(this.A0D, this.A0G);
                break;
        }
    }

    private void A06() {
        if (this.A04 && this.A03 != null) {
            removeCallbacks(this.A03);
            this.A03 = null;
        }
        String[] strArr = A0I;
        if (strArr[4].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0I[6] = "PZwK6paCNaN1NNUi7D9zVsXgJs4CpRYo";
        this.A04 = false;
    }

    private void A07() {
        switch (this.A0H) {
            case A02:
                YB.A0N(this, -859190839);
                return;
            default:
                if (A0I[7].length() == 20) {
                    throw new RuntimeException();
                }
                A0I[6] = "J4Bl2paDruPebaLnqzXafrD0wXfUXyp3";
                YB.A0N(this, -870569165);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        switch (this.A0H) {
            case A02:
                ImageView imageView = this.A01;
                int i4 = XV.A0S;
                if (A0I[7].length() != 20) {
                    String[] strArr = A0I;
                    strArr[4] = "IwvL04OrKqzmIeLShS8Q4SIdnVqi";
                    strArr[2] = "Ml3LYYHXQPQgDXepFoLqaPfqy73Y";
                    imageView.setPadding(i4, XV.A00, XV.A0A, XV.A00);
                    return;
                }
                throw new RuntimeException();
            case A04:
                this.A01.setPadding(XV.A0S, XV.A00, XV.A0S, XV.A00);
                this.A01.setVisibility(8);
                return;
            default:
                this.A01.setPadding(XV.A0I, XV.A00, XV.A0A, XV.A00);
                return;
        }
    }

    private void A09() {
        switch (this.A0H) {
            case A02:
                A0F(this.A00, this.A09, XV.A00, XV.A01, XV.A0S, XV.A01, XV.A0U);
                break;
            case A04:
                A0F(this.A00, this.A0B, XV.A02, XV.A00, XV.A02, XV.A00, -2);
                break;
            default:
                A0F(this.A00, this.A06, XV.A00, XV.A0A, XV.A0S, XV.A0A, -2);
                break;
        }
    }

    private void A0A() {
        switch (this.A0H) {
            case A02:
                A0F(this.A01, this.A08, XV.A0I, XV.A00, XV.A0I, XV.A00, XV.A0U);
                return;
            case A04:
                ImageView imageView = this.A01;
                Bitmap bitmap = this.A0A;
                int i4 = XV.A0S;
                int i10 = XV.A00;
                int i11 = XV.A0S;
                int i12 = XV.A00;
                String[] strArr = A0I;
                if (strArr[4].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[0] = "BqxrFQJIBIExT1rCMndHo1bmHb8U1dtr";
                strArr2[3] = "4mbJeCFNsEoBSiTcA819Z9qBG38wKlHe";
                A0F(imageView, bitmap, i4, i10, i11, i12, -2);
                return;
            default:
                A0F(this.A01, this.A07, XV.A0I, XV.A00, XV.A0I, XV.A00, -2);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = new Runnable() { // from class: com.facebook.ads.redexgen.X.a9
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A02();
            }
        };
        postDelayed(this.A03, this.A05);
    }

    private void A0C() {
        this.A04 = true;
        YB.A0O(this.A00, 0);
        A0B();
    }

    private final void A0D() {
        YB.A0O(this.A00, 8);
        YB.A0O(this.A01, 0);
        if (this.A0H == EnumC1047aP.A04) {
            this.A01.setPadding(XV.A0S, XV.A00, XV.A0S, XV.A00);
        } else {
            this.A01.setPadding(XV.A0I, XV.A00, XV.A0I, XV.A00);
        }
    }

    private void A0E(int i4, int i10, InterfaceC1028a6 interfaceC1028a6, LayoutTransition.TransitionListener transitionListener) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(i4, new C1039aH(this, i10, interfaceC1028a6));
        layoutTransition.addTransitionListener(transitionListener);
        setLayoutTransition(layoutTransition);
    }

    private void A0F(ImageView imageView, Bitmap bitmap, int i4, int i10, int i11, int i12, int i13) {
        YB.A0K(imageView);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i13);
        imageView.setPadding(i4, i10, i11, i12);
        imageView.setLayoutParams(layoutParams);
    }

    private void A0K(boolean z3) {
        setOrientation(0);
        setPadding(XV.A00, XV.A0I, XV.A00, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        A07();
        setCornerRadius(XV.A0C);
        this.A01 = new ImageView(getContext());
        A0A();
        addView(this.A01);
        if (this.A0H == EnumC1047aP.A04) {
            this.A01.setVisibility(8);
        }
        this.A00 = new ImageView(getContext());
        A09();
        addView(this.A00);
        A0L(z3);
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.a8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0T(view);
            }
        });
    }

    private void A0L(boolean z3) {
        if (z3 && (this.A0H == EnumC1047aP.A03 || this.A0H == EnumC1047aP.A04)) {
            A0C();
        } else {
            YB.A0O(this.A00, 8);
            YB.A0O(this.A01, 0);
        }
    }

    public final void A0O() {
        A06();
    }

    public final void A0P() {
        A06();
        A0D();
    }

    public final void A0Q() {
        this.A04 = true;
        post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aB
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0S();
            }
        });
    }

    public final /* synthetic */ void A0R() {
        YB.A0O(this.A00, 8);
    }

    public final /* synthetic */ void A0S() {
        postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.a7
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A03();
            }
        }, 300L);
    }

    public final /* synthetic */ void A0T(View view) {
        if (this.A04) {
            if (this.A0H == EnumC1047aP.A04) {
                return;
            }
            A04();
            if (this.A02 != null) {
                this.A02.ADW(view);
                return;
            } else {
                AbstractC1043aL.A07(this.A0E, this.A0D, this.A0F, this.A0C, this.A0G);
                return;
            }
        }
        A0Q();
    }

    public final /* synthetic */ void A0U(Object obj, long j) {
        ((View) obj).animate().translationX(getWidth()).setDuration(j).setInterpolator(new X7(1.5f)).setListener(new C1038aG(this)).start();
    }

    public final /* synthetic */ void A0V(Object obj, long j) {
        View view = (View) obj;
        view.setTranslationX(getWidth());
        view.animate().translationX(0.0f).setDuration(j).setListener(new C1036aE(this)).setInterpolator(new X8(1.5f)).start();
    }

    private void setCornerRadius(float f10) {
        setOutlineProvider(new C1034aC(this, f10));
        setClipToOutline(true);
    }
}
