package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0442Df extends ImageView implements InterfaceC1324eu {
    public static byte[] A06;
    public static String[] A07 = {"aghB38UhEEJpk0kXnwVgQHJdsNEW", "Z42NiOwJIVHIw0Yvb2zaIIHOyWtQtdjq", "3gFse8uXyFGORzgMyq8kaPi65dxCnZzv", "Jw8apcEAXkOZ3AQdkmgk3jwFJH7gSyWz", "3SkqDykKznuf11rk6OObVQ9S0DbCfrGf", "LUP6WVZdZh28wzzt0Y5b2oxyslCE6YSF", "OrWA41O07SU0jmvClar47c0fhMdTsOQM", "iv"};
    public static final int A08;
    public static final int A09;
    public C0473Ek A00;
    public final Paint A01;
    public final RectF A02;
    public final C1436gi A03;
    public final VI A04;
    public final AbstractC0454Dr A05;

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[2].charAt(1) == 'n') {
                throw new RuntimeException();
            }
            A07[4] = "46k42TMmXNLOzm12QaWH4fref2fTAqwO";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 73);
            i12++;
        }
    }

    public static void A06() {
        A06 = new byte[]{44, 20, 21, 4, 65, 32, 5};
    }

    static {
        A06();
        A09 = (int) (XX.A02 * 4.0f);
        A08 = (int) (XX.A02 * 6.0f);
    }

    public C0442Df(C1436gi c1436gi, VI vi2) {
        this(c1436gi, vi2, false);
    }

    public C0442Df(C1436gi c1436gi, VI vi2, boolean z3) {
        super(c1436gi);
        this.A05 = new AbstractC0454Dr() { // from class: com.facebook.ads.redexgen.X.3W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0455Ds c0455Ds) {
                this.A00.A09();
            }
        };
        this.A04 = vi2;
        this.A03 = c1436gi;
        if (z3) {
            this.A02 = new RectF();
        } else {
            this.A02 = null;
        }
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(A09, A09, A09, A09);
        setContentDescription(A03(0, 7, 40));
        A05();
        setOnClickListener(new ViewOnClickListenerC1341fB(this));
    }

    private void A04() {
        setImageBitmap(YN.A01(YM.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(YN.A01(YM.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1324eu
    public final void AAv(C0473Ek c0473Ek) {
        this.A00 = c0473Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A05);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1324eu
    public final void AKV(C0473Ek c0473Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A05);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int x10 = getHeight();
        int y10 = x10 / 2;
        if (this.A02 != null) {
            RectF rectF = this.A02;
            int x11 = getWidth();
            float f10 = x11;
            int x12 = getHeight();
            rectF.set(0.0f, 0.0f, f10, x12);
            RectF rectF2 = this.A02;
            int x13 = A08;
            float f11 = x13;
            if (A07[3].charAt(1) == 84) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "zT7YbptMnSmKw0M5I4XTvaxbvvVXxWiN";
            strArr[1] = "NI8lQWe2kpQIwBdYvxwMMOMmXOv2vWWW";
            int x14 = A08;
            canvas.drawRoundRect(rectF2, f11, x14, this.A01);
        } else {
            int x15 = Math.min(width, y10);
            canvas.drawCircle(width, y10, x15, this.A01);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundPaintColor(int i4) {
        this.A01.setColor(i4);
    }
}
