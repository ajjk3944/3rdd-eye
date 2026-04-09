package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C02605m extends E8 {
    public static byte[] A01;
    public final /* synthetic */ C1212d4 A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public C02605m(C1212d4 c1212d4) {
        this.A00 = c1212d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e92) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1210d2(this));
        this.A00.A0B.AGR(A00(0, 5, WebSocketProtocol.PAYLOAD_SHORT), this.A00.A03());
    }
}
