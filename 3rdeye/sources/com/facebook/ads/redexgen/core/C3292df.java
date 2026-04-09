package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3292df extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC3884nl A02;
    public final Uri A03;
    public final InterfaceC22834w A04;
    public final C3246cu A05;
    public final String A06;

    public C3292df(C3246cu c3246cu, Uri uri, InterfaceC22834w interfaceC22834w) throws IOException {
        this.A05 = c3246cu;
        this.A04 = interfaceC22834w;
        this.A03 = uri;
        this.A06 = C3331eJ.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5A();
        this.A01 = (int) this.A02.AFy(new AnonymousClass56(this.A03, i, -1L, this.A06));
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
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.A02.read(bArr, i, i10);
        int read = this.A00;
        this.A00 = read + i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final long skip(long j4) throws IOException {
        long j10 = this.A01 - this.A00;
        if (j10 <= 0) {
            return 0L;
        }
        if (j4 > j10) {
            j4 = j10;
        }
        this.A00 = (int) (this.A00 + j4);
        A00(this.A00);
        return j4;
    }
}
