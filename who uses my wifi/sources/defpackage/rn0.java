package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rn0 extends InputStream {
    public final /* synthetic */ sn0 f;

    public rn0(sn0 sn0Var) {
        this.f = sn0Var;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        sn0 sn0Var = this.f;
        if (sn0Var.h) {
            throw new IOException("closed");
        }
        return (int) Math.min(sn0Var.f.g, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        sn0 sn0Var = this.f;
        ac acVar = sn0Var.f;
        if (sn0Var.h) {
            throw new IOException("closed");
        }
        if (acVar.g == 0 && sn0Var.g.e(acVar, 8192L) == -1) {
            return -1;
        }
        return acVar.c() & 255;
    }

    public final String toString() {
        return this.f + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        sn0 sn0Var = this.f;
        ac acVar = sn0Var.f;
        if (!sn0Var.h) {
            j41.a(bArr.length, i, i2);
            if (acVar.g == 0 && sn0Var.g.e(acVar, 8192L) == -1) {
                return -1;
            }
            return acVar.read(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
