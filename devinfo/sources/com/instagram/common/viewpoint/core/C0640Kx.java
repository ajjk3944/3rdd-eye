package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0640Kx implements XN {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public int A02;
    public AbstractC0971Yb A03;
    public String A04;
    public String A05;
    public ViewOnClickListenerC0634Kr A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{78, 102, 112, 118, 102, 72, 117, 97, 96, 123, 119, 120, 125, 119, 127};
    }

    public C0640Kx(int i4, int i10, int i11, String str, String str2, AbstractC0971Yb abstractC0971Yb, ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
        this.A01 = i4;
        this.A00 = i10;
        this.A02 = i11;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC0971Yb;
        this.A06 = viewOnClickListenerC0634Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && this.A03 != null) {
            this.A03.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 66));
            this.A03.A0A();
            if (this.A07 != null) {
                this.A03.setToolbarActionMode(this.A07.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A0D(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final synchronized void ADS() {
        if (!this.A09) {
            this.A06.A0E(A00(6, 9, 101));
        }
        A04();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final synchronized void AFV(float f10) {
        if (!this.A09 && this.A03 != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(this.A03.getToolbarActionMode());
                    this.A03.setProgressClickListener(new ViewOnClickListenerC1107bN(this));
                    this.A03.A0B();
                    this.A03.setToolbarListener(new LB(this));
                    this.A0A = true;
                    if (this.A07 == null || this.A07.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f10 <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        if (this.A07 == null || this.A07.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(YM.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 100), String.valueOf((int) Math.ceil(f10))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
