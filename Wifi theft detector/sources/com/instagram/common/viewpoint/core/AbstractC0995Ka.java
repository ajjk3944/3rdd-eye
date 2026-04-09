package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Ka, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0995Ka extends AbstractC1527c3 implements XQ {
    public static byte[] A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public C0827Dm A00;
    public DR A01;
    public DA A02;
    public final Handler A03;
    public final AbstractC1979jd A04;
    public final NR A05;
    public final InterfaceC1355Yh A06;
    public final AbstractC1477bF A07;
    public final XS A08;
    public final AtomicBoolean A09;

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0A = new byte[]{-117, -96, -104, -104, -104, -104, -104, -104, -104, 60, 72, 70, 7, 63, 58, 60, 62, 59, 72, 72, 68, 7, 58, 61, 76, 7, 66, 71, 77, 62, 75, 76, 77, 66, 77, 66, 58, 69, 7, 60, 69, 66, 60, 68, 62, 61, 64, 76, 74, Flags.CD, 67, 62, 64, 66, 63, 76, 76, 72, Flags.CD, 62, 65, 80, Flags.CD, 70, 75, 81, 66, 79, 80, 81, 70, 81, 70, 62, 73, Flags.CD, 67, 70, 75, 70, 80, 69, 60, 62, 64, 81, 70, 83, 70, 81, 86, 23, 10, 28, 6, 23, 9, 10, 9, 4, 27, 14, 9, 10, 20};
    }

    public abstract AbstractC1477bF A1R(C1531c7 c1531c7, NR nr, String str);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A1U() {
        LinearLayout linearLayout = new LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A07.A06());
        textView.setText(super.A07.A05().A1E());
        textView.setTextColor(-1);
        YB.A0a(textView, true, 24);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(XV.A0q, 0, XV.A0q, XV.A0b);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C1508bk c1508bk = new C1508bk(super.A07.A06());
        c1508bk.setRadius(15);
        YB.A0N(c1508bk, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0E, A0E);
        layoutParams3.gravity = 17;
        c1508bk.setLayoutParams(layoutParams3);
        new LM(c1508bk, super.A07.A06()).A05(A0E, A0E).A07(super.A07.A05().A2C().A01());
        TextView textView2 = new TextView(super.A07.A06());
        textView2.setText(String.format(Locale.US, super.A07.A05().A1F(), super.A07.A05().A29().A0I().A0G()));
        textView2.setTextColor(-1);
        YB.A0a(textView2, false, 17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(XV.A0f, XV.A0b, XV.A0f, 0);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
        linearLayout.addView(c1508bk);
        linearLayout.addView(textView2);
        addView(linearLayout);
        addView(A0J());
        if (this.A04.A2M() && this.A04.A2R()) {
            addView(A00(super.A07.A06(), super.A07.A05(), super.A07.A08(), EnumC1422aM.A07, super.A07.A0C()));
        }
        if (this.A04.A2W()) {
            addView(A01(super.A07.A06(), EnumC1422aM.A07));
        }
    }

    static {
        A0M();
        A0H = (int) (XX.A02 * 48.0f);
        A0G = (int) (XX.A02 * 80.0f);
        A0E = (int) (XX.A02 * 120.0f);
        A0F = (int) (XX.A02 * 128.0f);
        A0L = (int) (XX.A02 * 16.0f);
        A0B = (int) (XX.A02 * 4.0f);
        A0K = (int) (XX.A02 * 44.0f);
        A0I = XV.A0v;
        A0J = (int) (XX.A02 * 12.0f);
        A0N = (int) (XX.A02 * 12.0f);
        A0M = (int) (XX.A02 * 26.0f);
        A0C = P3.A02(-1, 77);
        A0D = P3.A02(A0C, 90);
    }

    public AbstractC0995Ka(C1531c7 c1531c7, boolean z10) {
        super(c1531c7, z10);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A09 = new AtomicBoolean(false);
        this.A04 = c1531c7.A05();
        this.A08 = XS.A00(c1531c7.A06(), this.A04, this);
        this.A05 = this.A04.A29();
        this.A07 = A0K(c1531c7);
        if (this.A04.A1w()) {
            this.A07.setVisibility(8);
        }
        AbstractC1349Yb abstractC1349YbA0B = c1531c7.A0B();
        this.A06 = c1531c7.A0C();
        if (abstractC1349YbA0B != null) {
            abstractC1349YbA0B.setLayoutParams(new RelativeLayout.LayoutParams(-1, abstractC1349YbA0B.getToolbarHeight()));
            abstractC1349YbA0B.setPageDetailsVisible(false);
        }
    }

    private ImageView A0J() {
        ImageView imageView = new ImageView(super.A07.A06());
        imageView.setImageBitmap(Bitmap.createScaledBitmap(YN.A01(YM.NAV_CROSS), XV.A0e, XV.A0e, true));
        imageView.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0L(0, 9, 6)));
        imageView.setBackground(circleBackground);
        imageView.setPadding(XV.A0Y, XV.A0Y, XV.A0Y, XV.A0Y);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.by
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A1W(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, XV.A0r, XV.A0b, 0);
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private AbstractC1477bF A0K(C1531c7 c1531c7) {
        String clickEvent;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.A04.A1w()) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c1531c7.A05().A10().equals(A0L(91, 14, 67))) {
            clickEvent = EnumC1707ez.A04.A03();
        } else {
            clickEvent = A0L(9, 37, 119);
        }
        AbstractC1477bF abstractC1477bFA1R = A1R(c1531c7, this.A05, clickEvent);
        abstractC1477bFA1R.getCTAButton().getCtaActionHelper().A08(this.A04);
        abstractC1477bFA1R.getCTAButton().setCreativeAsCtaLoggingHelper(this.A08);
        this.A02 = new DA(abstractC1477bFA1R, 400, 100, 0);
        YB.A0K(abstractC1477bFA1R);
        abstractC1477bFA1R.A0l(c1531c7.A00());
        if (C1264Up.A17(c1531c7.A06())) {
            abstractC1477bFA1R.A0k();
            if (c1531c7.A0B() != null) {
                c1531c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
        addView(abstractC1477bFA1R, layoutParams);
        abstractC1477bFA1R.getCTAButton().A0F(this.A04, c1531c7.A0B());
        return abstractC1477bFA1R;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1527c3
    public void A1C() throws RemoteException {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        if (this.A04 != null && this.A04.A29().A0L() != null) {
            XI.A06(super.A07.A06().A02(), this.A04.A29().A0L());
        }
        this.A08.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1527c3
    public void A1H(NR nr, String str, double d10, Bundle bundle) {
        super.A1H(nr, str, d10, bundle);
        this.A07.setInfo(nr.A0I(), nr.A0J(), str, this.A04.A2C().A01(), super.A07.A09(), null);
    }

    public final int A1Q(AbstractC1349Yb abstractC1349Yb) {
        return abstractC1349Yb == null ? AbstractC1349Yb.A00 : abstractC1349Yb.getToolbarHeight();
    }

    public void A1S() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new C0827Dm(true, false);
            if (this.A01 != null) {
                this.A00.A0L(this.A01);
            }
            C1072Na c1072NaA01 = this.A04.A28().A01();
            this.A00.A0L(new DB(getAdDetailsView().getCTAButton(), 300, -1, c1072NaA01.A0A(true)));
            Drawable startDrawable = YB.A08(A0C, A0D, A0B);
            this.A00.A0L(new DS(getAdDetailsView().getCTAButton(), 300, startDrawable, YB.A05(c1072NaA01.A09(true), A0B)));
            this.A00.A0L(new DQ(expandableLayout, 150, false));
            this.A00.A0K(2300);
        }
    }

    public final void A1T() {
        LinearLayout linearLayout = new LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A07.A06());
        textView.setText(super.A07.A05().A15());
        textView.setTextColor(-1);
        YB.A0a(textView, false, 15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0L, A0L, A0L, A0L);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C1502be c1502be = new C1502be(super.A07.A06(), 0, -13524404, YM.REWARD_GRANTED_ICON);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0H, A0H);
        layoutParams3.gravity = 17;
        c1502be.setLayoutParams(layoutParams3);
        linearLayout.addView(c1502be);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void A1V(int i10, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (getAdDetailsView() instanceof LK) {
            if ((getAdDetailsView() instanceof C6V) || (getAdDetailsView() instanceof C6U)) {
                YB.A0J(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    viewGroup.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0l(i10);
            ((LK) getAdDetailsView()).A0y(viewGroup, relativeLayout, i10);
        }
    }

    public final /* synthetic */ void A1W(View view) {
        this.A06.A4j(A0L(46, 45, 123));
    }

    public AbstractC1979jd getAdDataBundle() {
        return this.A04;
    }

    public DA getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC1477bF getAdDetailsView() {
        return this.A07;
    }

    public NR getAdInfo() {
        return this.A05;
    }

    public C0827Dm getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1527c3, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A09.get() && (this.A04.A29().A0K().A02().isEmpty() || this.A04.A29().A0K().A03() || this.A04.A1j())) {
            return;
        }
        getAdDetailsView().A0l(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View expandableLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.A04.A29().A0K().A03() && !this.A04.A1j() && !this.A04.A1w() && (expandableLayout = getAdDetailsView().getExpandableLayout()) != null && z10 && this.A01 == null) {
            this.A01 = new DR(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0L(this.A01);
            this.A00.A0J();
        }
    }
}
