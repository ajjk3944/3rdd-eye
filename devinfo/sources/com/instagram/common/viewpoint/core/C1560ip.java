package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ip, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1560ip implements NJ {
    public static byte[] A02;
    public static String[] A03 = {"prnrxiqBIRUWmtrywfPqKqEQqhVy", "ZIMYOFT0ZsWMsvQaDuWdcBD1JUfFlpFK", "eDL3S9t0lib8FebdadRdAEhF6DEMjh5k", "bs6kAZMpX5XJVmB6S4pTEB090dM9ax0i", "QHqe8jS5x4PwEQqsnwl", "gxNXj6OyEOj3k7PGi9sSLvTTkEfltc4s", "tcOGThQLxe2W2uuyyUr03jLhoPapxorM", "Kh0wErWL647o91YILjhTKlO7bRERsR4e"};
    public final /* synthetic */ C03007a A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A03[4].length() == 18) {
            throw new RuntimeException();
        }
        A03[7] = "PFnJtf9LUj4qa4JPPUOTumvSeGZYJypM";
        A02 = new byte[]{14, 12, 8, 89, 15, 15, 14, 14, 118, 65, 83, 69, 86, 64, 65, 64, 4, 114, 77, 64, 65, 75, 4, 77, 73, 84, 86, 65, 87, 87, 77, 75, 74, 4, 66, 77, 86, 65, 64, 64, 65, 125, 74, 88, 78, 93, 75, 74, 75, 121, 70, 75, 74, 64, 110, 75, 99, 64, 72, 72, 70, 65, 72, 102, 66, 95, 93, 74, 92, 92, 70, 64, 65};
    }

    static {
        A01();
    }

    public C1560ip(C03007a c03007a, Runnable runnable) {
        this.A00 = c03007a;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFj(AbstractC1605jh abstractC1605jh) {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFk(AbstractC1605jh abstractC1605jh) {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFl(AbstractC1605jh abstractC1605jh) {
        this.A00.A07.A0C();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFm(AbstractC1605jh abstractC1605jh) {
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = abstractC1605jh;
        this.A00.A0L();
        if (this.A00.A07 != null) {
            this.A00.A07.A0F(abstractC1605jh);
        }
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFn(AbstractC1605jh abstractC1605jh) {
        AbstractC0919Vy.A05(A00(39, 34, 56), A00(8, 31, 51), A00(0, 8, 47));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFo(AbstractC1605jh abstractC1605jh) {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFp(AbstractC1605jh abstractC1605jh, AdError adError) {
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && C0886Up.A1y(this.A00.A0B)) {
            this.A00.A07.A0G(C0908Vm.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else if (AdError.NO_FILL.equals(adError)) {
            this.A00.A07.A0G(C0908Vm.A00(AdErrorType.NO_FILL));
        } else {
            this.A00.A07.A0G(C0908Vm.A00(AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0Q(abstractC1605jh);
        if (A03[7].charAt(7) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "5mDNAkmPsKXxtvZqFgypt4QK4uBiUiuf";
        strArr[2] = "5tmiAUheAxojxdkmR27o6gIBrLCMojmA";
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A07.A09();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void onRewardedVideoClosed() {
        this.A00.A07.A0A();
    }
}
