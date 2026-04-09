package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.xbill.DNS.Flags;
import org.xbill.DNS.KEYRecord;

/* renamed from: com.facebook.ads.redexgen.X.lR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2088lR implements H9 {
    public static byte[] A0C;
    public static String[] A0D = {"Jp9jYTsvX0byW8PsTh8WCsi4kS5THTDZ", "u9JmQf2RUpXkbwKGcH1ldYLO1OaAnoG0", "zVRI5h7vLNN08I5W1BFePAuDidXDjkLB", "GupX0AjjIH906l5opBlPCY0Mrv7mkKOY", "YLyM9aD6SKjNKerJ1EloHyT", "oAaNr5RuznTKLecZmpLN", "Q5WjYzMQ2NaCiwYPtyRn68zXUmvTXGHf", "bi8dQH0GL9bk2fQxVP7KQMQdOg6RbrhP"};
    public static final HD A0E;
    public int A00;
    public long A01;
    public long A02;
    public HA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C06204u A08;
    public final C06214v A09;
    public final C06214v A0A;
    public final C2087lQ A0B;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{39, Flags.CD, 6, 12, 5, 24, 7, 15, 14, 74, 43, 46, 62, 57, 74, 25, 30, 24, 15, Flags.CD, 7};
    }

    static {
        A04();
        A0E = new HD() { // from class: com.facebook.ads.redexgen.X.lS
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2088lR.A07();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public C2088lR() {
        this(0);
    }

    public C2088lR(int i10) {
        this.A07 = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.A0B = new C2087lQ(true);
        this.A09 = new C06214v(KEYRecord.Flags.FLAG4);
        this.A00 = -1;
        this.A01 = -1L;
        this.A0A = new C06214v(10);
        this.A08 = new C06204u(this.A0A.A0l());
    }

    public static int A00(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private int A01(InterfaceC2165ms interfaceC2165ms) throws IOException {
        int i10 = 0;
        while (true) {
            interfaceC2165ms.AGt(this.A0A.A0l(), 0, 10);
            this.A0A.A0f(0);
            if (this.A0A.A0K() != 4801587) {
                break;
            }
            this.A0A.A0g(3);
            int length = this.A0A.A0H();
            int firstFramePosition = length + 10;
            i10 += firstFramePosition;
            interfaceC2165ms.A47(length);
        }
        interfaceC2165ms.AIl();
        interfaceC2165ms.A47(i10);
        if (this.A01 == -1) {
            this.A01 = i10;
        }
        return i10;
    }

    private C2169mx A02(long j10, boolean z10) {
        return new C2169mx(j10, this.A01, A00(this.A00, this.A0B.A0J()), this.A00, z10);
    }

    @RequiresNonNull({"extractorOutput"})
    private void A05(long j10, boolean z10) {
        if (this.A05) {
            return;
        }
        boolean z11 = (this.A07 & 1) != 0 && this.A00 > 0;
        String[] strArr = A0D;
        if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "wRCLGMQDqXZHrYOEljE7cvu367IJP6qz";
        strArr2[1] = "FofxBB8LpAk5nYyyotl0uMBanfu6Lq1A";
        if (z11 && this.A0B.A0J() == C.TIME_UNSET && !z10) {
            return;
        }
        if (!z11 || this.A0B.A0J() == C.TIME_UNSET) {
            this.A03.AJ7(new C2160mn(C.TIME_UNSET));
        } else {
            this.A03.AJ7(A02(j10, (this.A07 & 2) != 0));
        }
        this.A05 = true;
    }

    private void A06(InterfaceC2165ms interfaceC2165ms) throws IOException {
        if (this.A04) {
            return;
        }
        this.A00 = -1;
        interfaceC2165ms.AIl();
        if (interfaceC2165ms.A8n() == 0) {
            A01(interfaceC2165ms);
        }
        int currentFrameSize = 0;
        long j10 = 0;
        while (true) {
            try {
                if (!interfaceC2165ms.AGu(this.A0A.A0l(), 0, 2, true)) {
                    break;
                }
                this.A0A.A0f(0);
                if (C2087lQ.A0F(this.A0A.A0M())) {
                    if (!interfaceC2165ms.AGu(this.A0A.A0l(), 0, 4, true)) {
                        break;
                    }
                    this.A08.A08(14);
                    int iA04 = this.A08.A04(13);
                    int numValidFrames = A0D[7].charAt(7);
                    if (numValidFrames != 114) {
                        A0D[4] = "EiGF";
                        if (iA04 > 6) {
                            j10 += iA04;
                            currentFrameSize++;
                            if (currentFrameSize == 1000 || !interfaceC2165ms.A48(iA04 - 6, true)) {
                                break;
                            }
                        } else {
                            this.A04 = true;
                            throw C3K.A01(A03(0, 21, 88), null);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    currentFrameSize = 0;
                    break;
                }
            } catch (EOFException unused) {
            }
        }
        interfaceC2165ms.AIl();
        if (currentFrameSize > 0) {
            this.A00 = (int) (j10 / currentFrameSize);
        } else {
            this.A00 = -1;
        }
        this.A04 = true;
    }

    public static /* synthetic */ H9[] A07() {
        return new H9[]{new C2088lR()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A03 = ha;
        this.A0B.A5c(ha, new LG(0, 1));
        ha.A6O();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2165ms interfaceC2165ms, HV hv) throws IOException {
        AbstractC05983y.A02(this.A03);
        long jA8O = interfaceC2165ms.A8O();
        if (((this.A07 & 2) == 0 && ((this.A07 & 1) == 0 || jA8O == -1)) ? false : true) {
            A06(interfaceC2165ms);
        }
        int bytesRead = interfaceC2165ms.read(this.A09.A0l(), 0, KEYRecord.Flags.FLAG4);
        boolean z10 = bytesRead == -1;
        A05(jA8O, z10);
        if (z10) {
            return -1;
        }
        this.A09.A0f(0);
        this.A09.A0e(bytesRead);
        if (!this.A06) {
            this.A0B.AGq(this.A02, 4);
            this.A06 = true;
        }
        this.A0B.A5A(this.A09);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j10, long j11) {
        this.A06 = false;
        this.A0B.AJ5();
        this.A02 = j11;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2165ms interfaceC2165ms) throws IOException {
        int headerPosition;
        int iA01 = A01(interfaceC2165ms);
        int i10 = iA01;
        int frameSize = 0;
        int syncBytes = 0;
        do {
            interfaceC2165ms.AGt(this.A0A.A0l(), 0, 2);
            this.A0A.A0f(0);
            int startPosition = this.A0A.A0M();
            if (!C2087lQ.A0F(startPosition)) {
                syncBytes = 0;
                frameSize = 0;
                i10++;
                interfaceC2165ms.AIl();
                interfaceC2165ms.A47(i10);
            } else {
                syncBytes++;
                String[] strArr = A0D;
                String str = strArr[2];
                String str2 = strArr[3];
                int headerPosition2 = str.charAt(14);
                int startPosition2 = str2.charAt(14);
                if (headerPosition2 != startPosition2) {
                    throw new RuntimeException();
                }
                A0D[7] = "vlF0iwwjiK26GT4HTqGcAOiXXpcsHbpg";
                if (syncBytes >= 4 && frameSize > 188) {
                    return true;
                }
                interfaceC2165ms.AGt(this.A0A.A0l(), 0, 4);
                this.A08.A08(14);
                C06204u c06204u = this.A08;
                int headerPosition3 = A0D[5].length();
                if (headerPosition3 == 4) {
                    throw new RuntimeException();
                }
                A0D[4] = "LrBCAcAc8FKB1NeW";
                int headerPosition4 = c06204u.A04(13);
                if (headerPosition4 <= 6) {
                    syncBytes = 0;
                    frameSize = 0;
                    i10++;
                    interfaceC2165ms.AIl();
                    interfaceC2165ms.A47(i10);
                } else {
                    int startPosition3 = headerPosition4 - 6;
                    interfaceC2165ms.A47(startPosition3);
                    frameSize += headerPosition4;
                }
            }
            headerPosition = i10 - iA01;
        } while (headerPosition < 8192);
        return false;
    }
}
