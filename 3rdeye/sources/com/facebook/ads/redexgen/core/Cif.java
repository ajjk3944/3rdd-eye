package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class Cif extends AbstractRunnableC2959Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public Cif(MW mw, String str) {
        this.A00 = mw;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() throws InterruptedException {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                Iterator<String> itKeys = this.A00.A02.A05().keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.A0J(this.A01)) {
                        this.A00.A0E((N2) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                    }
                }
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e4) {
            InterfaceC2884Su interfaceC2884SuA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC2884SuA08.AAy(encryptedId, AbstractC2885Sv.A1B, new C2886Sw(e4));
        } catch (JSONException e10) {
            this.A00.A0M();
            InterfaceC2884Su interfaceC2884SuA082 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC2884SuA082.AAy(encryptedId2, AbstractC2885Sv.A1A, new C2886Sw(e10));
        }
    }
}
