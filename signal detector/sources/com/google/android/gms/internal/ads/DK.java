package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class DK implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f7745j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f7746k = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public final C2228zK f7747a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7748b;

    /* renamed from: c, reason: collision with root package name */
    public int f7749c;

    /* renamed from: d, reason: collision with root package name */
    public final C1419kK f7750d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7751e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7752f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7753g;

    /* renamed from: h, reason: collision with root package name */
    public int f7754h;
    public String i;

    static {
        for (int i = 0; i <= 31; i++) {
            f7746k[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f7746k;
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

    public DK(C2228zK c2228zK) {
        int[] iArr = new int[32];
        this.f7748b = iArr;
        boolean z6 = false;
        this.f7749c = 0;
        if (iArr.length == 0) {
            this.f7748b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f7748b;
        int i = this.f7749c;
        this.f7749c = i + 1;
        iArr2[i] = 6;
        this.f7754h = 2;
        this.f7747a = c2228zK;
        C1419kK c1419kK = C1419kK.f15108d;
        Objects.requireNonNull(c1419kK);
        String str = c1419kK.f15109a;
        this.f7750d = c1419kK;
        this.f7752f = ",";
        if (c1419kK.f15111c) {
            this.f7751e = ": ";
            if (str.isEmpty()) {
                this.f7752f = ", ";
            }
        } else {
            this.f7751e = ":";
        }
        if (str.isEmpty() && c1419kK.f15110b.isEmpty()) {
            z6 = true;
        }
        this.f7753g = z6;
    }

    public final void a() throws IOException {
        if (this.i != null) {
            e();
        }
        m();
        this.f7747a.write("null");
    }

    public final void b(int i, int i3, char c6) throws IOException {
        int iD = d();
        if (iD != i3 && iD != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.i;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f7749c--;
        if (iD == i3) {
            k();
        }
        this.f7747a.write(c6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7747a.getClass();
        int i = this.f7749c;
        if (i > 1 || (i == 1 && this.f7748b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7749c = 0;
    }

    public final int d() {
        int i = this.f7749c;
        if (i != 0) {
            return this.f7748b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void e() throws IOException {
        if (this.i != null) {
            int iD = d();
            if (iD == 5) {
                this.f7747a.write(this.f7752f);
            } else if (iD != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            k();
            this.f7748b[this.f7749c - 1] = 4;
            h(this.i);
            this.i = null;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f7749c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7747a.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zK r0 = r8.f7747a
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
            java.lang.String[] r7 = com.google.android.gms.internal.ads.DK.f7746k
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DK.h(java.lang.String):void");
    }

    public final void k() throws IOException {
        if (this.f7753g) {
            return;
        }
        C1419kK c1419kK = this.f7750d;
        String str = c1419kK.f15109a;
        C2228zK c2228zK = this.f7747a;
        c2228zK.write(str);
        int i = this.f7749c;
        for (int i3 = 1; i3 < i; i3++) {
            c2228zK.write(c1419kK.f15110b);
        }
    }

    public final void m() throws IOException {
        int iD = d();
        if (iD == 1) {
            this.f7748b[this.f7749c - 1] = 2;
            k();
            return;
        }
        C2228zK c2228zK = this.f7747a;
        if (iD == 2) {
            c2228zK.append((CharSequence) this.f7752f);
            k();
        } else {
            if (iD == 4) {
                c2228zK.append((CharSequence) this.f7751e);
                this.f7748b[this.f7749c - 1] = 5;
                return;
            }
            if (iD != 6) {
                if (iD != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f7754h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f7748b[this.f7749c - 1] = 7;
        }
    }
}
