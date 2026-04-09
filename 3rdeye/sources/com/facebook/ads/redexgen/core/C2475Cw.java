package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2475Cw extends RelativeLayout implements InterfaceC3289dc {
    public static byte[] A0B;
    public static String[] A0C = {"QrML4Ecz92sfYCeCtaSnFCosFmipGlTz", "VhmrcYjsqpOA7Iy", "ZK9HRS350jRidth", "ZjYoflRzQYTDfI0m0JAvuVl9vp7GlkSu", "MmC", "ZvQ3uBw3DQ7M1xesozkO3pU9", "XD5i8EmzP8U96tjWoOsk6YaJBmNCgDM7", "cjtQcAKtxYCLU"};
    public static final int A0D;
    public static final int A0E;
    public int A00;
    public int A01;
    public ObjectAnimator A02;
    public AbstractC2895Tf A03;
    public AbstractC2895Tf A04;
    public AbstractC2895Tf A05;
    public AbstractC2895Tf A06;
    public E1 A07;
    public boolean A08;
    public boolean A09;
    public final ProgressBar A0A;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        String[] strArr = A0C;
        if (strArr[0].charAt(7) != strArr[6].charAt(7)) {
            throw new RuntimeException();
        }
        A0C[4] = "F3xM2b87YXaGRbor1WnSFNsn05JfW";
        A0B = new byte[]{-5, -3, -6, -14, -3, -16, -2, -2};
    }

    static {
        A03();
        A0D = (int) (AbstractC2975Wl.A02 * 8.0f);
        A0E = (int) (AbstractC2975Wl.A02 * 6.0f);
    }

    public C2475Cw(C3272dL c3272dL, int i) {
        this(c3272dL, A0E, -12549889, 0, i);
    }

    public C2475Cw(C3272dL c3272dL, int i, int i10) {
        this(c3272dL, i10, -12549889, 0, i);
    }

    public C2475Cw(C3272dL c3272dL, int i, int i10, int i11, int i12) {
        super(c3272dL);
        this.A08 = false;
        this.A01 = -1;
        this.A09 = true;
        this.A06 = new DM() { // from class: com.facebook.ads.redexgen.X.2P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                if (this.A00.A07 != null) {
                    this.A00.A09(true);
                }
            }
        };
        this.A04 = new DR() { // from class: com.facebook.ads.redexgen.X.2N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                this.A00.A02();
            }
        };
        this.A05 = new DP() { // from class: com.facebook.ads.redexgen.X.2K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                if (this.A00.A07 != null) {
                    this.A00.A09(true);
                }
            }
        };
        this.A03 = new DX() { // from class: com.facebook.ads.redexgen.X.2G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C22383d c22383d) {
                if (this.A00.A07 != null && this.A00.A09) {
                    this.A00.A06();
                }
            }
        };
        this.A00 = i12;
        this.A0A = new ProgressBar(c3272dL, null, R.attr.progressBarStyleHorizontal);
        A08(i10, i11, false);
        this.A0A.setMax(10000);
        addView(this.A0A, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02.setTarget(null);
            this.A02 = null;
            this.A0A.clearAnimation();
        }
    }

    public final void A06() {
        A02();
        this.A02 = ObjectAnimator.ofInt(this.A0A, A01(0, 8, 56), 0, 0);
        this.A02.setDuration(0L);
        this.A02.setInterpolator(new LinearInterpolator());
        this.A02.start();
        this.A01 = -1;
    }

    public final void A07(int i) {
        if (this.A08) {
            return;
        }
        A02();
        int i10 = this.A00;
        int i11 = i10 > 0 ? (i * 10000) / i10 : 0;
        int i12 = this.A01;
        int progress = A0C[3].charAt(25);
        if (progress != 112) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[0] = "EPor81PzILPcuU6FixKr7Fru1uzRlGJl";
        strArr[6] = "FnG13n1zUgJ6jZbSKNpX0gvuGbObv9dX";
        if (i12 >= i11 || i10 <= i) {
            int progress2 = this.A00;
            if (progress2 != -1) {
                int duration = this.A0A.getProgress();
                if (duration < 10000) {
                    this.A0A.setProgress(10000);
                    return;
                }
                return;
            }
            return;
        }
        ProgressBar progressBar = this.A0A;
        int duration2 = this.A01;
        this.A02 = ObjectAnimator.ofInt(progressBar, A01(0, 8, 56), duration2, i11);
        ObjectAnimator objectAnimator = this.A02;
        int duration3 = Math.min(250, i10 - i);
        objectAnimator.setDuration(duration3);
        this.A02.setInterpolator(new LinearInterpolator());
        this.A02.start();
        this.A01 = i11;
    }

    public final void A08(int i, int i10, boolean z10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        if (z10) {
            gradientDrawable.setCornerRadius(40.0f);
            gradientDrawable2.setCornerRadius(40.0f);
            gradientDrawable3.setCornerRadius(40.0f);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable3, new ScaleDrawable(gradientDrawable2, 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A0A.setProgressDrawable(layerDrawable);
    }

    public final void A09(boolean z10) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int position = this.A00;
        int duration = position == -1 ? this.A07.getDuration() : this.A00;
        int i = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int position2 = this.A01;
        if (position2 >= i || duration <= currentPositionInMillis) {
            int position3 = this.A00;
            if (position3 != -1) {
                ProgressBar progressBar = this.A0A;
                String[] strArr = A0C;
                String str = strArr[1];
                String str2 = strArr[2];
                int duration2 = str.length();
                int position4 = str2.length();
                if (duration2 != position4) {
                    throw new RuntimeException();
                }
                A0C[4] = "qF0L9nDi3kEsuJUK3R2iV2qYkdzV6";
                int duration3 = progressBar.getProgress();
                if (duration3 < 10000) {
                    this.A0A.setProgress(10000);
                    return;
                }
                return;
            }
            return;
        }
        if (z10) {
            ProgressBar progressBar2 = this.A0A;
            int position5 = this.A01;
            this.A02 = ObjectAnimator.ofInt(progressBar2, A01(0, 8, 56), position5, i);
            ObjectAnimator objectAnimator = this.A02;
            int position6 = Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(position6);
            this.A02.setInterpolator(new LinearInterpolator());
            this.A02.start();
        } else {
            ProgressBar progressBar3 = this.A0A;
            int duration4 = A0C[7].length();
            if (duration4 != 13) {
                progressBar3.setProgress(i);
            } else {
                A0C[5] = "fU59jt";
                progressBar3.setProgress(i);
            }
        }
        this.A01 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3289dc
    public final void AAm(E1 e12) {
        this.A07 = e12;
        e12.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3289dc
    public final void AJk(E1 e12) {
        e12.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }

    public int getCustomDuration() {
        return this.A00;
    }

    public void setCustomDuration(int i) {
        this.A00 = i;
    }

    public void setShouldClearAnimationWhenVideoCompleted(boolean z10) {
        this.A09 = z10;
    }
}
