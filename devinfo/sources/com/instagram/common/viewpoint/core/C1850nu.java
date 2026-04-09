package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1850nu implements DD {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public H9 A00;
    public InterfaceC1787ms A01;
    public final HD A02;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, 26, 22, 12, 21, 29, 89, 11, 28, 24, 29, 89, 13, 17, 28, 89, 10, 13, 11, 28, 24, 20, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, Utf8.REPLACEMENT_BYTE, 108, 100};
    }

    static {
        A01();
    }

    public C1850nu(HD hd2) {
        this.A02 = hd2;
    }

    @Override // com.instagram.common.viewpoint.core.DD
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5y() {
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final long A7a() {
        if (this.A01 != null) {
            return this.A01.A8n();
        }
        return -1L;
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final void AAB(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC1932pF interfaceC1932pF, Uri uri, Map<String, List<String>> map, long j, long j8, HA ha2) throws IOException {
        C03519f c03519f = new C03519f(interfaceC1932pF, j, j8);
        this.A01 = c03519f;
        if (this.A00 != null) {
            return;
        }
        H9[] extractors = this.A02.A5O(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                H9 h9 = extractors[i4];
                try {
                } catch (EOFException unused) {
                    if (this.A00 != null || c03519f.A8n() == j) {
                    }
                } catch (Throwable th2) {
                    AbstractC02203y.A08(this.A00 != null || c03519f.A8n() == j);
                    c03519f.AIl();
                    throw th2;
                }
                if (h9.AK5(c03519f)) {
                    this.A00 = h9;
                    AbstractC02203y.A08(this.A00 != null || c03519f.A8n() == j);
                    c03519f.AIl();
                } else {
                    boolean z3 = this.A00 != null || c03519f.A8n() == j;
                    AbstractC02203y.A08(z3);
                    c03519f.AIl();
                    i4++;
                }
            }
            if (this.A00 == null) {
                throw new C1825nV(A00(24, 34, 2) + C5C.A0s(extractors) + A00(0, 24, 55), (Uri) AbstractC02203y.A01(uri));
            }
        }
        H9 h92 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        h92.AAC(ha2);
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final int AHM(HV hv) throws IOException {
        return ((H9) AbstractC02203y.A01(this.A00)).AHL((InterfaceC1787ms) AbstractC02203y.A01(this.A01), hv);
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final void AHb() {
        if (this.A00 != null) {
            this.A00.AHb();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final void AJ6(long j, long j8) {
        ((H9) AbstractC02203y.A01(this.A00)).AJ6(j, j8);
    }
}
