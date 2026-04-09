package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pm1 implements Closeable, Flushable {
    public static final Pattern j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f15046k = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public final b5.e1 f15047a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15048b;

    /* renamed from: c, reason: collision with root package name */
    public int f15049c;

    /* renamed from: d, reason: collision with root package name */
    public final xl1 f15050d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15051e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15052f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f15053h;

    /* renamed from: i, reason: collision with root package name */
    public String f15054i;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f15046k[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f15046k;
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

    public pm1(b5.e1 e1Var) {
        int[] iArr = new int[32];
        this.f15048b = iArr;
        boolean z3 = false;
        this.f15049c = 0;
        if (iArr.length == 0) {
            this.f15048b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f15048b;
        int i4 = this.f15049c;
        this.f15049c = i4 + 1;
        iArr2[i4] = 6;
        this.f15053h = 2;
        this.f15047a = e1Var;
        xl1 xl1Var = xl1.f18423d;
        Objects.requireNonNull(xl1Var);
        String str = xl1Var.f18424a;
        this.f15050d = xl1Var;
        this.f15052f = ",";
        if (xl1Var.f18426c) {
            this.f15051e = ": ";
            if (str.isEmpty()) {
                this.f15052f = ", ";
            }
        } else {
            this.f15051e = ":";
        }
        if (str.isEmpty() && xl1Var.f18425b.isEmpty()) {
            z3 = true;
        }
        this.g = z3;
    }

    public final void c(int i4, int i10, char c9) throws IOException {
        int iE = e();
        if (iE != i10 && iE != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f15054i;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f15049c--;
        if (iE == i10) {
            p();
        }
        this.f15047a.write(c9);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15047a.getClass();
        int i4 = this.f15049c;
        if (i4 > 1 || (i4 == 1 && this.f15048b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15049c = 0;
    }

    public final int e() {
        int i4 = this.f15049c;
        if (i4 != 0) {
            return this.f15048b[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f15049c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15047a.getClass();
    }

    public final void g() throws IOException {
        if (this.f15054i != null) {
            int iE = e();
            if (iE == 5) {
                this.f15047a.write(this.f15052f);
            } else if (iE != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            p();
            this.f15048b[this.f15049c - 1] = 4;
            m(this.f15054i);
            this.f15054i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            b5.e1 r0 = r8.f15047a
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
            java.lang.String[] r7 = com.google.android.gms.internal.ads.pm1.f15046k
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pm1.m(java.lang.String):void");
    }

    public final void p() throws IOException {
        if (this.g) {
            return;
        }
        xl1 xl1Var = this.f15050d;
        String str = xl1Var.f18424a;
        b5.e1 e1Var = this.f15047a;
        e1Var.write(str);
        int i4 = this.f15049c;
        for (int i10 = 1; i10 < i4; i10++) {
            e1Var.write(xl1Var.f18425b);
        }
    }

    public final void v() throws IOException {
        int iE = e();
        if (iE == 1) {
            this.f15048b[this.f15049c - 1] = 2;
            p();
            return;
        }
        b5.e1 e1Var = this.f15047a;
        if (iE == 2) {
            e1Var.append((CharSequence) this.f15052f);
            p();
        } else {
            if (iE == 4) {
                e1Var.append((CharSequence) this.f15051e);
                this.f15048b[this.f15049c - 1] = 5;
                return;
            }
            if (iE != 6) {
                if (iE != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f15053h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f15048b[this.f15049c - 1] = 7;
        }
    }
}
