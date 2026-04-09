package org.conscrypt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    OpenSSLBIOInputStream(InputStream inputStream, boolean z10) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z10);
    }

    long getBioContext() {
        return this.ctx;
    }

    int gets(byte[] bArr) throws IOException {
        int i10;
        int i11 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i11 < bArr.length && (i10 = read()) != -1) {
                if (i10 != 10) {
                    bArr[i11] = (byte) i10;
                    i11++;
                } else if (i11 != 0) {
                    break;
                }
            }
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException("Invalid bounds");
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        do {
            int i13 = super.read(bArr, i10 + i12, (i11 - i12) - i10);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        } while (i10 + i12 < i11);
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }
}
