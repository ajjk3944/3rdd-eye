package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r44 implements Closeable, Flushable {
    public static final Pattern o = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] p = new String[128];
    public final n44 f;
    public int[] g;
    public int h;
    public final z34 i;
    public final String j;
    public final String k;
    public final boolean l;
    public int m;
    public String n;

    static {
        for (int i = 0; i <= 31; i++) {
            p[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = p;
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

    public r44(n44 n44Var) {
        int[] iArr = new int[32];
        this.g = iArr;
        boolean z = false;
        this.h = 0;
        if (iArr.length == 0) {
            this.g = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.g;
        int i = this.h;
        this.h = i + 1;
        iArr2[i] = 6;
        this.m = 2;
        this.f = n44Var;
        z34 z34Var = z34.d;
        Objects.requireNonNull(z34Var);
        String str = z34Var.a;
        this.i = z34Var;
        this.k = ",";
        if (z34Var.c) {
            this.j = ": ";
            if (str.isEmpty()) {
                this.k = ", ";
            }
        } else {
            this.j = ":";
        }
        if (str.isEmpty() && z34Var.b.isEmpty()) {
            z = true;
        }
        this.l = z;
    }

    public final void a(int i, int i2, char c) throws IOException {
        int iC = c();
        if (iC != i2 && iC != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.n;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.h--;
        if (iC == i2) {
            h();
        }
        this.f.write(c);
    }

    public final int c() {
        int i = this.h;
        if (i != 0) {
            return this.g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.getClass();
        int i = this.h;
        if (i > 1 || (i == 1 && this.g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    public final void f() throws IOException {
        if (this.n != null) {
            int iC = c();
            if (iC == 5) {
                this.f.write(this.k);
            } else if (iC != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.g[this.h - 1] = 4;
            g(this.n);
            this.n = null;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            n44 r0 = r8.f
            r1 = 34
            r0.write(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L39
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L20
            java.lang.String[] r7 = defpackage.r44.p
            r6 = r7[r6]
            if (r6 == 0) goto L37
            goto L2d
        L20:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L27
            java.lang.String r6 = "\\u2028"
            goto L2d
        L27:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2d:
            if (r4 >= r3) goto L33
            int r3 = r3 - r4
            r0.write(r9, r4, r3)
        L33:
            r0.write(r6)
            r4 = r5
        L37:
            r3 = r5
            goto Ld
        L39:
            if (r4 >= r2) goto L3f
            int r2 = r2 - r4
            r0.write(r9, r4, r2)
        L3f:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r44.g(java.lang.String):void");
    }

    public final void h() throws IOException {
        if (this.l) {
            return;
        }
        z34 z34Var = this.i;
        String str = z34Var.a;
        n44 n44Var = this.f;
        n44Var.write(str);
        int i = this.h;
        for (int i2 = 1; i2 < i; i2++) {
            n44Var.write(z34Var.b);
        }
    }

    public final void i() throws IOException {
        int iC = c();
        if (iC == 1) {
            this.g[this.h - 1] = 2;
            h();
            return;
        }
        n44 n44Var = this.f;
        if (iC == 2) {
            n44Var.append((CharSequence) this.k);
            h();
        } else {
            if (iC == 4) {
                n44Var.append((CharSequence) this.j);
                this.g[this.h - 1] = 5;
                return;
            }
            if (iC != 6) {
                if (iC != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.m != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.g[this.h - 1] = 7;
        }
    }
}
