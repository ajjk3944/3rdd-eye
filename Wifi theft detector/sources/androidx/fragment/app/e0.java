package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class e0 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final String f3321a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f3322b = new StringBuilder(128);

    public e0(String str) {
        this.f3321a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f3322b.length() > 0) {
            Log.d(this.f3321a, this.f3322b.toString());
            StringBuilder sb = this.f3322b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f3322b.append(c10);
            }
        }
    }
}
