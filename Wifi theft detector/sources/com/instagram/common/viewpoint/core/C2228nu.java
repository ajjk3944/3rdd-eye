package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2228nu implements DD {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public H9 A00;
    public InterfaceC2165ms A01;
    public final HD A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, 26, 22, 12, 21, 29, 89, Flags.CD, 28, 24, 29, 89, 13, 17, 28, 89, 10, 13, Flags.CD, 28, 24, 20, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, 63, 108, 100};
    }

    static {
        A01();
    }

    public C2228nu(HD hd) {
        this.A02 = hd;
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
    public final void AAB(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC2310pF interfaceC2310pF, Uri uri, Map<String, List<String>> map, long j10, long j11, HA ha) throws IOException {
        C07299f c07299f = new C07299f(interfaceC2310pF, j10, j11);
        this.A01 = c07299f;
        if (this.A00 != null) {
            return;
        }
        H9[] extractors = this.A02.A5O(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                H9 h92 = extractors[i10];
                try {
                } catch (EOFException unused) {
                    if (this.A00 != null || c07299f.A8n() == j10) {
                    }
                } catch (Throwable th) {
                    AbstractC05983y.A08(this.A00 != null || c07299f.A8n() == j10);
                    c07299f.AIl();
                    throw th;
                }
                if (h92.AK5(c07299f)) {
                    this.A00 = h92;
                    AbstractC05983y.A08(this.A00 != null || c07299f.A8n() == j10);
                    c07299f.AIl();
                } else {
                    boolean z10 = this.A00 != null || c07299f.A8n() == j10;
                    AbstractC05983y.A08(z10);
                    c07299f.AIl();
                    i10++;
                }
            }
            if (this.A00 == null) {
                throw new C2203nV(A00(24, 34, 2) + C5C.A0s(extractors) + A00(0, 24, 55), (Uri) AbstractC05983y.A01(uri));
            }
        }
        H9 h93 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        h93.AAC(ha);
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final int AHM(HV hv) throws IOException {
        return ((H9) AbstractC05983y.A01(this.A00)).AHL((InterfaceC2165ms) AbstractC05983y.A01(this.A01), hv);
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
    public final void AJ6(long j10, long j11) {
        ((H9) AbstractC05983y.A01(this.A00)).AJ6(j10, j11);
    }
}
