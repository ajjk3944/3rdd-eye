package com.bytedance.sdk.component.fkw.lh.ouw.ouw;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class lh implements Closeable {
    private int fkw;

    /* renamed from: lh, reason: collision with root package name */
    private final InputStream f7472lh;
    final Charset ouw;
    int vt;
    private byte[] yu;

    public lh(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private void vt() throws IOException {
        InputStream inputStream = this.f7472lh;
        byte[] bArr = this.yu;
        int i4 = inputStream.read(bArr, 0, bArr.length);
        if (i4 == -1) {
            throw new EOFException();
        }
        this.fkw = 0;
        this.vt = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f7472lh) {
            try {
                if (this.yu != null) {
                    this.yu = null;
                    this.f7472lh.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String ouw() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f7472lh
            monitor-enter(r0)
            byte[] r1 = r7.yu     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.fkw     // Catch: java.lang.Throwable -> L11
            int r2 = r7.vt     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.vt()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.fkw     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.vt     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.yu     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.fkw     // Catch: java.lang.Throwable -> L11
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
            java.nio.charset.Charset r6 = r7.ouw     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.fkw = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh$1 r1 = new com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh$1     // Catch: java.lang.Throwable -> L11
            int r2 = r7.vt     // Catch: java.lang.Throwable -> L11
            int r4 = r7.fkw     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.yu     // Catch: java.lang.Throwable -> L11
            int r4 = r7.fkw     // Catch: java.lang.Throwable -> L11
            int r5 = r7.vt     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.vt = r2     // Catch: java.lang.Throwable -> L11
            r7.vt()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.fkw     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.vt     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.yu     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.fkw     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.fkw = r2     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh.ouw():java.lang.String");
    }

    private lh(InputStream inputStream, Charset charset, byte b10) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(yu.ouw)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f7472lh = inputStream;
        this.ouw = charset;
        this.yu = new byte[Segment.SIZE];
    }
}
