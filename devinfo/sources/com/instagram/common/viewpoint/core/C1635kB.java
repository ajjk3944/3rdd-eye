package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.kB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1635kB extends AbstractRunnableC0923Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C1635kB(N8 n8, String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() throws InterruptedException {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                Iterator<String> itKeys = this.A00.A02.A05().keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.A0J(this.A01)) {
                        this.A00.A0E((C0699Nf) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                    }
                }
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e2) {
            InterfaceC0847Tc interfaceC0847TcA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC0847TcA08.ABC(encryptedId, AbstractC0848Td.A1B, new C0849Te(e2));
        } catch (JSONException e10) {
            this.A00.A0M();
            InterfaceC0847Tc interfaceC0847TcA082 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC0847TcA082.ABC(encryptedId2, AbstractC0848Td.A1A, new C0849Te(e10));
        }
    }
}
