package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2221nn implements FL, InterfaceC0805Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C06345i A01;
    public InterfaceC0921Hd A02;
    public boolean A04;
    public final Uri A06;
    public final AnonymousClass48 A07;
    public final AG A08;
    public final DD A09;
    public final HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C07379p A0D;
    public final HV A0B = new HV();
    public boolean A03 = true;
    public final long A05 = Cq.A00();

    public C2221nn(C07379p c07379p, Uri uri, InterfaceC2310pF interfaceC2310pF, DD dd, HA ha, AnonymousClass48 anonymousClass48) {
        this.A0D = c07379p;
        this.A06 = uri;
        this.A08 = new AG(interfaceC2310pF);
        this.A09 = dd;
        this.A0A = ha;
        this.A07 = anonymousClass48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j10, long j11) {
        this.A0B.A00 = j10;
        this.A00 = j11;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.FL
    public final void A4r() {
        this.A0C = true;
    }

    @Override // com.instagram.common.viewpoint.core.FL
    public final void AAr() throws IOException {
        int iAHM = 0;
        while (iAHM == 0 && !this.A0C) {
            try {
                long j10 = this.A0B.A00;
                this.A01 = new C06345i(this.A06, j10, -1L, this.A0D.A0b);
                long jAGi = this.A08.AGi(this.A01);
                if (jAGi != -1) {
                    jAGi += j10;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC2310pF interfaceC2310pF = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final AG ag = this.A08;
                    final int i10 = this.A0D.A09.A01;
                    interfaceC2310pF = new InterfaceC2310pF(ag, i10, this) { // from class: com.facebook.ads.redexgen.X.9r
                        public int A00;
                        public final int A01;
                        public final InterfaceC2310pF A02;
                        public final InterfaceC0805Cp A03;
                        public final byte[] A04;

                        {
                            AbstractC05983y.A07(i10 > 0);
                            this.A02 = ag;
                            this.A01 = i10;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i10;
                        }

                        private boolean A00() throws IOException {
                            int bytesRead = this.A02.read(this.A04, 0, 1);
                            if (bytesRead == -1) {
                                return false;
                            }
                            int bytesRead2 = this.A04[0];
                            int metadataLength = (bytesRead2 & 255) << 4;
                            if (metadataLength == 0) {
                                return true;
                            }
                            int i11 = 0;
                            int i12 = metadataLength;
                            byte[] bArr = new byte[metadataLength];
                            while (i12 > 0) {
                                int bytesRead3 = this.A02.read(bArr, i11, i12);
                                if (bytesRead3 == -1) {
                                    return false;
                                }
                                i11 += bytesRead3;
                                i12 -= bytesRead3;
                            }
                            while (metadataLength > 0) {
                                int bytesRead4 = metadataLength - 1;
                                if (bArr[bytesRead4] != 0) {
                                    break;
                                }
                                metadataLength--;
                            }
                            if (metadataLength > 0) {
                                this.A03.AE5(new C06214v(bArr, metadataLength));
                            }
                            return true;
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
                        public final void A43(InterfaceC06455t interfaceC06455t) {
                            AbstractC05983y.A01(interfaceC06455t);
                            this.A02.A43(interfaceC06455t);
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
                        public final Map<String, List<String>> A8t() {
                            return this.A02.A8t();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
                        public final Uri A9P() {
                            return this.A02.A9P();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
                        public final long AGi(C06345i c06345i) {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
                        public final void close() {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC05542c
                        public final int read(byte[] bArr, int i11, int i12) throws IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int i13 = this.A02.read(bArr, i11, Math.min(this.A00, i12));
                            if (i13 != -1) {
                                int bytesRead = this.A00;
                                this.A00 = bytesRead - i13;
                            }
                            return i13;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6e(C07379p.A0g);
                }
                this.A09.AAB(interfaceC2310pF, this.A06, this.A08.A8t(), j10, jAGi, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5y();
                }
                if (this.A03) {
                    this.A09.AJ6(j10, this.A00);
                    this.A03 = false;
                }
                while (iAHM == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        iAHM = this.A09.AHM(this.A0B);
                        long position = this.A09.A7a();
                        if (position > this.A0D.A0M + j10) {
                            j10 = position;
                            this.A07.A02();
                            this.A0D.A0O.post(this.A0D.A0a);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iAHM == 1) {
                    iAHM = 0;
                } else {
                    long jA7a = this.A09.A7a();
                    String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (jA7a != -1) {
                        this.A0B.A00 = this.A09.A7a();
                    }
                }
                AbstractC06295d.A00(this.A08);
            } catch (Throwable th) {
                if (iAHM != 1 && this.A09.A7a() != -1) {
                    this.A0B.A00 = this.A09.A7a();
                }
                AbstractC06295d.A00(this.A08);
                throw th;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0805Cp
    public final void AE5(C06214v c06214v) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c06214v.A07();
        InterfaceC0921Hd interfaceC0921Hd = (InterfaceC0921Hd) AbstractC05983y.A01(this.A02);
        interfaceC0921Hd.AIr(c06214v, iA07);
        interfaceC0921Hd.AIu(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
