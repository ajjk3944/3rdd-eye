package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.mR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3802mR implements InterfaceC2454Cb {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public GX A00;
    public InterfaceC3738lN A01;
    public final InterfaceC2558Gb A02;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, 26, 22, 12, 21, 29, 89, 11, 28, 24, 29, 89, 13, 17, 28, 89, 10, 13, 11, 28, 24, 20, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, 63, 108, 100};
    }

    static {
        A01();
    }

    public C3802mR(InterfaceC2558Gb interfaceC2558Gb) {
        this.A02 = interfaceC2558Gb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2454Cb
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5q() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2454Cb
    public final long A7S() {
        if (this.A01 != null) {
            return this.A01.A8f();
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2454Cb
    public final void AA3(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC3884nl interfaceC3884nl, Uri uri, Map<String, List<String>> map, long j4, long j10, GY gy) throws IOException {
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(interfaceC3884nl, j4, j10);
        this.A01 = anonymousClass90;
        if (this.A00 != null) {
            return;
        }
        GX[] extractors = this.A02.A5G(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                GX gx = extractors[i];
                try {
                } catch (EOFException unused) {
                    if (this.A00 != null || anonymousClass90.A8f() == j4) {
                    }
                } catch (Throwable th) {
                    C3M.A08(this.A00 != null || anonymousClass90.A8f() == j4);
                    anonymousClass90.AI1();
                    throw th;
                }
                if (gx.AJL(anonymousClass90)) {
                    this.A00 = gx;
                    C3M.A08(this.A00 != null || anonymousClass90.A8f() == j4);
                    anonymousClass90.AI1();
                } else {
                    boolean z10 = this.A00 != null || anonymousClass90.A8f() == j4;
                    C3M.A08(z10);
                    anonymousClass90.AI1();
                    i++;
                }
            }
            if (this.A00 == null) {
                throw new C3785m9(A00(24, 34, 2) + AbstractC22614a.A0s(extractors) + A00(0, 24, 55), (Uri) C3M.A01(uri));
            }
        }
        GX gx2 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        gx2.AA4(gy);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2454Cb
    public final int AGc(C2576Gt c2576Gt) throws IOException {
        return ((GX) C3M.A01(this.A00)).AGb((InterfaceC3738lN) C3M.A01(this.A01), c2576Gt);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2454Cb
    public final void AGr() {
        if (this.A00 != null) {
            this.A00.AGr();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2454Cb
    public final void AIM(long j4, long j10) {
        ((GX) C3M.A01(this.A00)).AIM(j4, j10);
    }
}
