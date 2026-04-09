package z;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class b extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final String f3420b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f3421c = new StringBuilder(128);

    public b(String str) {
        this.f3420b = str;
    }

    private void a() {
        if (this.f3421c.length() > 0) {
            Log.d(this.f3420b, this.f3421c.toString());
            StringBuilder sb = this.f3421c;
            sb.delete(0, sb.length());
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
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f3421c.append(c2);
            }
        }
    }
}
