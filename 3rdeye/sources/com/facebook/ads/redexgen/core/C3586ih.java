package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3586ih extends AbstractRunnableC2959Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C3586ih(MW mw, JSONObject jSONObject) {
        this.A00 = mw;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() throws InterruptedException {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                this.A00.A02.A0B(this.A01);
                this.A00.A06.countDown();
            }
        } catch (InterruptedException e4) {
            this.A00.A03.A08().AAy(A00(0, 17, 25), AbstractC2885Sv.A1B, new C2886Sw(e4));
        } catch (JSONException e10) {
            this.A00.A0M();
            this.A00.A03.A08().AAy(A00(0, 17, 25), AbstractC2885Sv.A1A, new C2886Sw(e10));
        }
    }
}
