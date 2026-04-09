package m4;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f16265a.mark(Integer.MAX_VALUE);
    }

    public final void f(long j) throws IOException {
        int i10 = this.f16266d;
        if (i10 > j) {
            this.f16266d = 0;
            this.f16265a.reset();
        } else {
            j -= i10;
        }
        b((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f16265a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
