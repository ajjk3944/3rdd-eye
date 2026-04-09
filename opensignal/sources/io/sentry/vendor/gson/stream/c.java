package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {
    public static final String[] E = new String[128];
    public String B;
    public final boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f12844a;

    /* renamed from: d, reason: collision with root package name */
    public int[] f12845d;

    /* renamed from: g, reason: collision with root package name */
    public int f12846g;

    /* renamed from: r, reason: collision with root package name */
    public String f12847r;

    /* renamed from: x, reason: collision with root package name */
    public String f12848x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12849y;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            E[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = E;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f12845d = iArr;
        this.f12846g = 0;
        if (iArr.length == 0) {
            this.f12845d = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f12845d;
        int i10 = this.f12846g;
        this.f12846g = i10 + 1;
        iArr2[i10] = 6;
        this.f12848x = ":";
        this.D = true;
        this.f12844a = writer;
    }

    public final void b() throws IOException {
        int iQ = q();
        if (iQ == 1) {
            this.f12845d[this.f12846g - 1] = 2;
            h();
            return;
        }
        Writer writer = this.f12844a;
        if (iQ == 2) {
            writer.append(',');
            h();
        } else {
            if (iQ == 4) {
                writer.append((CharSequence) this.f12848x);
                this.f12845d[this.f12846g - 1] = 5;
                return;
            }
            if (iQ != 6) {
                if (iQ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f12849y) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f12845d[this.f12846g - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12844a.close();
        int i10 = this.f12846g;
        if (i10 > 1 || (i10 == 1 && this.f12845d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f12846g = 0;
    }

    public final void f(int i10, int i11, char c4) throws IOException {
        int iQ = q();
        if (iQ != i11 && iQ != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.B != null) {
            throw new IllegalStateException("Dangling name: " + this.B);
        }
        this.f12846g--;
        if (iQ == i11) {
            h();
        }
        this.f12844a.write(c4);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f12846g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f12844a.flush();
    }

    public final void h() throws IOException {
        if (this.f12847r == null) {
            return;
        }
        Writer writer = this.f12844a;
        writer.write(10);
        int i10 = this.f12846g;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f12847r);
        }
    }

    public final void i() throws IOException {
        if (this.B != null) {
            if (!this.D) {
                this.B = null;
                return;
            }
            y();
        }
        b();
        this.f12844a.write("null");
    }

    public final int q() {
        int i10 = this.f12846g;
        if (i10 != 0) {
            return this.f12845d[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            java.io.Writer r0 = r7.f12844a
            r1 = 34
            r0.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L3a
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            java.lang.String[] r6 = io.sentry.vendor.gson.stream.c.E
            r5 = r6[r5]
            if (r5 != 0) goto L2b
            goto L37
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L37
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L32
            int r6 = r3 - r4
            r0.write(r8, r4, r6)
        L32:
            r0.write(r5)
            int r4 = r3 + 1
        L37:
            int r3 = r3 + 1
            goto Ld
        L3a:
            if (r4 >= r2) goto L40
            int r2 = r2 - r4
            r0.write(r8, r4, r2)
        L40:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.w(java.lang.String):void");
    }

    public final void y() throws IOException {
        if (this.B != null) {
            int iQ = q();
            if (iQ == 5) {
                this.f12844a.write(44);
            } else if (iQ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f12845d[this.f12846g - 1] = 4;
            w(this.B);
            this.B = null;
        }
    }
}
