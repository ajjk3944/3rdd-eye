package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public final class P extends Writer {

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f15830c = new StringBuilder(128);

    /* renamed from: b, reason: collision with root package name */
    public final String f15829b = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f15830c;
        if (sb.length() > 0) {
            Log.d(this.f15829b, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f15830c.append(c10);
            }
        }
    }
}
