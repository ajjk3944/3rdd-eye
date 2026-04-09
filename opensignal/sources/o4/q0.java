package o4;

import java.io.Writer;

/* loaded from: classes.dex */
public final class q0 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f18845a = new StringBuilder(128);

    public final void b() {
        StringBuilder sb2 = this.f18845a;
        if (sb2.length() > 0) {
            sb2.toString();
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c4 = cArr[i10 + i12];
            if (c4 == '\n') {
                b();
            } else {
                this.f18845a.append(c4);
            }
        }
    }
}
