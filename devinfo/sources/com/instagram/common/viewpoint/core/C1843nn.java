package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1843nn implements FL, InterfaceC0427Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C02565i A01;
    public InterfaceC0543Hd A02;
    public boolean A04;
    public final Uri A06;
    public final AnonymousClass48 A07;
    public final AG A08;
    public final DD A09;
    public final HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C03599p A0D;
    public final HV A0B = new HV();
    public boolean A03 = true;
    public final long A05 = Cq.A00();

    public C1843nn(C03599p c03599p, Uri uri, InterfaceC1932pF interfaceC1932pF, DD dd2, HA ha2, AnonymousClass48 anonymousClass48) {
        this.A0D = c03599p;
        this.A06 = uri;
        this.A08 = new AG(interfaceC1932pF);
        this.A09 = dd2;
        this.A0A = ha2;
        this.A07 = anonymousClass48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j8) {
        this.A0B.A00 = j;
        this.A00 = j8;
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
                long j = this.A0B.A00;
                this.A01 = new C02565i(this.A06, j, -1L, this.A0D.A0b);
                long jAGi = this.A08.AGi(this.A01);
                if (jAGi != -1) {
                    jAGi += j;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC1932pF interfaceC1932pF = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final AG ag2 = this.A08;
                    final int i4 = this.A0D.A09.A01;
                    interfaceC1932pF = new InterfaceC1932pF(ag2, i4, this) { // from class: com.facebook.ads.redexgen.X.9r
                        public int A00;
                        public final int A01;
                        public final InterfaceC1932pF A02;
                        public final InterfaceC0427Cp A03;
                        public final byte[] A04;

                        {
                            AbstractC02203y.A07(i4 > 0);
                            this.A02 = ag2;
                            this.A01 = i4;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i4;
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
                            int i10 = 0;
                            int i11 = metadataLength;
                            byte[] bArr = new byte[metadataLength];
                            while (i11 > 0) {
                                int bytesRead3 = this.A02.read(bArr, i10, i11);
                                if (bytesRead3 == -1) {
                                    return false;
                                }
                                i10 += bytesRead3;
                                i11 -= bytesRead3;
                            }
                            while (metadataLength > 0) {
                                int bytesRead4 = metadataLength - 1;
                                if (bArr[bytesRead4] != 0) {
                                    break;
                                }
                                metadataLength--;
                            }
                            if (metadataLength > 0) {
                                this.A03.AE5(new C02434v(bArr, metadataLength));
                            }
                            return true;
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
                        public final void A43(InterfaceC02675t interfaceC02675t) {
                            AbstractC02203y.A01(interfaceC02675t);
                            this.A02.A43(interfaceC02675t);
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
                        public final Map<String, List<String>> A8t() {
                            return this.A02.A8t();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
                        public final Uri A9P() {
                            return this.A02.A9P();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
                        public final long AGi(C02565i c02565i) {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
                        public final void close() {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC01762c
                        public final int read(byte[] bArr, int i10, int i11) throws IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int i12 = this.A02.read(bArr, i10, Math.min(this.A00, i11));
                            if (i12 != -1) {
                                int bytesRead = this.A00;
                                this.A00 = bytesRead - i12;
                            }
                            return i12;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6e(C03599p.A0g);
                }
                this.A09.AAB(interfaceC1932pF, this.A06, this.A08.A8t(), j, jAGi, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5y();
                }
                if (this.A03) {
                    this.A09.AJ6(j, this.A00);
                    this.A03 = false;
                }
                while (iAHM == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        iAHM = this.A09.AHM(this.A0B);
                        long position = this.A09.A7a();
                        if (position > this.A0D.A0M + j) {
                            j = position;
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
                AbstractC02515d.A00(this.A08);
            } catch (Throwable th2) {
                if (iAHM != 1 && this.A09.A7a() != -1) {
                    this.A0B.A00 = this.A09.A7a();
                }
                AbstractC02515d.A00(this.A08);
                throw th2;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0427Cp
    public final void AE5(C02434v c02434v) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c02434v.A07();
        InterfaceC0543Hd interfaceC0543Hd = (InterfaceC0543Hd) AbstractC02203y.A01(this.A02);
        interfaceC0543Hd.AIr(c02434v, iA07);
        interfaceC0543Hd.AIu(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
