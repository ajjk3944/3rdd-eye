package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2599Hr extends RelativeLayout implements Wf {
    public static byte[] A0E;
    public static String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public String A00;
    public boolean A01;
    public final int A02;
    public final AbstractC3344eW A03;
    public final boolean A04;
    public final boolean A05;
    public final AbstractC3547hy A06;
    public final C3272dL A07;
    public final US A08;
    public final C2971Wh A09;
    public final XH A0A;
    public final InterfaceC3003Xn A0B;
    public final YY A0C;
    public final C3345eX A0D;

    public static String A16(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A17() {
        A0E = new byte[]{95, 16, 25, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract ME A1A(String str);

    public abstract void A1D();

    public abstract void A1E();

    public abstract void A1G(boolean z10);

    public abstract void A1H(boolean z10);

    public abstract boolean A1I();

    public abstract boolean A1J();

    public abstract boolean A1K();

    public abstract C3217cR getFullScreenAdStyle();

    static {
        A17();
        A0G = (int) (AbstractC2975Wl.A02 * 80.0f);
    }

    public AbstractC2599Hr(C3272dL c3272dL, YY yy, US us, AbstractC3547hy abstractC3547hy, int i, boolean z10, boolean z11, InterfaceC3003Xn interfaceC3003Xn, int i10) {
        super(c3272dL);
        this.A0A = new XH();
        this.A01 = false;
        this.A00 = A16(0, 0, 48);
        this.A03 = new C2600Hs(this);
        this.A02 = i;
        this.A07 = c3272dL;
        this.A05 = z10;
        this.A04 = z11;
        this.A0B = interfaceC3003Xn;
        this.A0C = yy;
        this.A06 = abstractC3547hy;
        this.A08 = us;
        this.A0D = new C3345eX(this, 1, new WeakReference(this.A03), c3272dL);
        this.A0D.A0W(abstractC3547hy.A0i());
        this.A0D.A0X(abstractC3547hy.A0j());
        this.A09 = C2971Wh.A00(this.A07, this.A06, this);
        if (this.A06.A1U()) {
            this.A00 = A15(this.A02, i10);
        }
    }

    public static String A15(int i, int i10) {
        return A16(4, 3, 9) + (i + 1) + A16(0, 4, 50) + i10;
    }

    public void A1B() {
        this.A09.A03();
    }

    public final void A1C() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1F(boolean z10) {
    }

    public AbstractC3547hy getAdDataBundle() {
        return this.A06;
    }

    public C3345eX getAdViewabilityChecker() {
        return this.A0D;
    }

    public XH getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
