package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1569iy implements NC {
    public static byte[] A02;
    public final /* synthetic */ C03097j A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, 21, 21, 68, 19, 17, 77, 104, 109, 124, 120, 105, 126, 44, 101, 127, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, 127, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, Utf8.REPLACEMENT_BYTE, 48, 1, Utf8.REPLACEMENT_BYTE, 61, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1569iy(C03097j c03097j, Runnable runnable) {
        this.A00 = c03097j;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEC(C1623jz c1623jz, String str, boolean z3) {
        this.A00.A07.A0C();
        boolean z10 = !TextUtils.isEmpty(str);
        if (z3 && z10) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(XB.A00(str));
                C0940Wu.A0D(this.A00.A0B, intent);
            } catch (C0938Ws e2) {
                Throwable cause = e2.getCause();
                Throwable cause2 = e2;
                if (cause != null) {
                    cause2 = e2.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), AbstractC0848Td.A04, new C0849Te(cause2));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AED(C1623jz c1623jz) {
        this.A00.A07.A04();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEE(C1623jz c1623jz) {
        this.A00.A07.A05();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEF(C1623jz c1623jz) {
        if (c1623jz != this.A00.A00) {
            return;
        }
        if (c1623jz == null) {
            this.A00.A0B.A08().ABC(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 3, 121), AbstractC0848Td.A0X, new C0849Te(A00(8, 37, 54)));
            AEG(c1623jz, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c1623jz;
        this.A00.A0L();
        this.A00.A07.A0F(c1623jz);
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEG(C1623jz c1623jz, AdError adError) {
        if (c1623jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c1623jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C0908Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEH(C1623jz c1623jz) {
        AbstractC0919Vy.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
