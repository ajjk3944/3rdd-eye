package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class J extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f31334a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f31335b = new StringBuilder(128);

    J(String str) {
        this.f31334a = str;
    }

    private void a() {
        if (this.f31335b.length() > 0) {
            Log.d(this.f31334a, this.f31335b.toString());
            StringBuilder sb2 = this.f31335b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f31335b.append(c10);
            }
        }
    }
}
