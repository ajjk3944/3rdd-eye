package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23819d implements InterfaceC3884nl {
    public static byte[] A00;
    public static final InterfaceC22834w A01;
    public static final C23819d A02;

    public static /* synthetic */ C23819d A00() {
        return new C23819d();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, 20, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3884nl
    public final /* synthetic */ Map A8l() {
        return AbstractC22824v.A00(this);
    }

    static {
        A02();
        A02 = new C23819d();
        A01 = new InterfaceC22834w() { // from class: com.facebook.ads.redexgen.X.nb
            @Override // com.facebook.ads.redexgen.core.InterfaceC22834w
            public final InterfaceC3884nl A5A() {
                return C23819d.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3884nl
    public final void A3v(C5H c5h) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3884nl
    public final Uri A9H() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3884nl
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3884nl
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i, int i10) {
        throw new UnsupportedOperationException();
    }
}
