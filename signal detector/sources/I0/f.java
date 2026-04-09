package i0;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f20491a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j6) throws IOException {
        int i = this.f20493c;
        if (i > j6) {
            this.f20493c = 0;
            this.f20491a.reset();
        } else {
            j6 -= i;
        }
        a((int) j6);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f20491a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
