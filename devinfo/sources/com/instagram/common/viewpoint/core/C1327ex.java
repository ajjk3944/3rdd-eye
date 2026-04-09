package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1327ex extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC1932pF A02;
    public final Uri A03;
    public final C5Y A04;
    public final C1432ge A05;
    public final String A06;

    public C1327ex(C1432ge c1432ge, Uri uri, C5Y c5y) throws IOException {
        this.A05 = c1432ge;
        this.A04 = c5y;
        this.A03 = uri;
        this.A06 = C1367fb.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i4) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5I();
        this.A01 = (int) this.A02.AGi(new C02565i(this.A03, i4, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        int i11 = this.A02.read(bArr, i4, i10);
        int read = this.A00;
        this.A00 = read + i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j8 = this.A01 - this.A00;
        if (j8 <= 0) {
            return 0L;
        }
        if (j > j8) {
            j = j8;
        }
        this.A00 = (int) (this.A00 + j);
        A00(this.A00);
        return j;
    }
}
