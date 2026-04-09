package z4;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f37870a.mark(Integer.MAX_VALUE);
    }

    public final void e(long j) throws IOException {
        int i4 = this.f37872c;
        if (i4 > j) {
            this.f37872c = 0;
            this.f37870a.reset();
        } else {
            j -= i4;
        }
        c((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f37870a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
