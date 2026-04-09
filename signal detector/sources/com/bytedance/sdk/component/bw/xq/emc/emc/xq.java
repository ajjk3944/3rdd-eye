package com.bytedance.sdk.component.bw.xq.emc.emc;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class xq implements Closeable {
    private int bw;
    private int dg;
    private final InputStream emc;
    private byte[] xq;
    private final Charset ypw;

    public xq(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void xq() throws IOException {
        InputStream inputStream = this.emc;
        byte[] bArr = this.xq;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.dg = 0;
        this.bw = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.emc) {
            try {
                if (this.xq != null) {
                    this.xq = null;
                    this.emc.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ypw() {
        return this.bw == -1;
    }

    public xq(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(dg.emc)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.emc = inputStream;
        this.ypw = charset;
        this.xq = new byte[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String emc() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.emc
            monitor-enter(r0)
            byte[] r1 = r7.xq     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.dg     // Catch: java.lang.Throwable -> L11
            int r2 = r7.bw     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.xq()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.dg     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.bw     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.xq     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.dg     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.ypw     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.dg = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.bytedance.sdk.component.bw.xq.emc.emc.xq$1 r1 = new com.bytedance.sdk.component.bw.xq.emc.emc.xq$1     // Catch: java.lang.Throwable -> L11
            int r2 = r7.bw     // Catch: java.lang.Throwable -> L11
            int r4 = r7.dg     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.xq     // Catch: java.lang.Throwable -> L11
            int r4 = r7.dg     // Catch: java.lang.Throwable -> L11
            int r5 = r7.bw     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.bw = r2     // Catch: java.lang.Throwable -> L11
            r7.xq()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.dg     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.bw     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.xq     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.dg     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.dg = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bw.xq.emc.emc.xq.emc():java.lang.String");
    }
}
