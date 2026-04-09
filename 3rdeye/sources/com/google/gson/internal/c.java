package com.google.gson.internal;

import N7.H7;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.s;
import c9.AbstractC2084e;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import g0.C4356c;
import h9.AbstractC4424a;
import i9.C4464b;
import ia.C4468d;
import ia.z;
import io.appmetrica.analytics.impl.Oo;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import p9.p;
import z9.EnumC5872c;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public class c implements g, e5.e {
    public static int A(int i, int i10) {
        int i11 = i + i10;
        if ((i ^ i11) >= 0 || (i ^ i10) < 0) {
            return i11;
        }
        throw new ArithmeticException(H7.n(i, i10, "Addition overflows an int: ", " + "));
    }

    public static long B(long j4, long j10) {
        long j11 = j4 + j10;
        if ((j4 ^ j11) >= 0 || (j4 ^ j10) < 0) {
            return j11;
        }
        StringBuilder sbJ = s.j("Addition overflows a long: ", " + ", j4);
        sbJ.append(j10);
        throw new ArithmeticException(sbJ.toString());
    }

    public static int C(int i, int i10) {
        long j4 = i * i10;
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException(H7.n(i, i10, "Multiplication overflows an int: ", " * "));
        }
        return (int) j4;
    }

    public static long D(int i, long j4) {
        if (i == -1) {
            if (j4 != Long.MIN_VALUE) {
                return -j4;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j4 + " * " + i);
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j4;
        }
        long j10 = i;
        long j11 = j4 * j10;
        if (j11 / j10 == j4) {
            return j11;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j4 + " * " + i);
    }

    public static long E(long j4, long j10) {
        if (j10 == 1) {
            return j4;
        }
        if (j4 == 1) {
            return j10;
        }
        if (j4 == 0 || j10 == 0) {
            return 0L;
        }
        long j11 = j4 * j10;
        if (j11 / j10 == j4 && ((j4 != Long.MIN_VALUE || j10 != -1) && (j10 != Long.MIN_VALUE || j4 != -1))) {
            return j11;
        }
        StringBuilder sbJ = s.j("Multiplication overflows a long: ", " * ", j4);
        sbJ.append(j10);
        throw new ArithmeticException(sbJ.toString());
    }

    public static long F(long j4, long j10) {
        long j11 = j4 - j10;
        if ((j4 ^ j11) >= 0 || (j4 ^ j10) >= 0) {
            return j11;
        }
        StringBuilder sbJ = s.j("Subtraction overflows a long: ", " - ", j4);
        sbJ.append(j10);
        throw new ArithmeticException(sbJ.toString());
    }

    public static int G(long j4) {
        if (j4 > 2147483647L || j4 < -2147483648L) {
            throw new ArithmeticException(Oo.d(j4, "Calculation overflows an int: "));
        }
        return (int) j4;
    }

    public static final int H(z zVar, int i) {
        int i10;
        kotlin.jvm.internal.l.f(zVar, "<this>");
        int i11 = i + 1;
        int length = zVar.f38698f.length;
        int[] iArr = zVar.f38699g;
        kotlin.jvm.internal.l.f(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 >= i11) {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                } else {
                    i13 = i10 + 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        return i10 >= 0 ? i10 : ~i10;
    }

    public static long I(String str) {
        int i;
        int length = str.length();
        kotlin.jvm.internal.l.f(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(H7.n(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbJ = C4356c.j(length, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        long j4 = 0;
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j4++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i11 = i10 + 1;
                    char cCharAt2 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j4++;
                        i10 = i11;
                    } else {
                        j4 += 4;
                        i10 += 2;
                    }
                }
                j4 += i;
            }
            i10++;
        }
        return j4;
    }

    public static Object J(p pVar, Object obj, InterfaceC4347e interfaceC4347e) {
        kotlin.jvm.internal.l.f(pVar, "<this>");
        InterfaceC4350h context = interfaceC4347e.getContext();
        AbstractC4424a dVar = context == C4351i.f37871b ? new g9.d(interfaceC4347e) : new g9.e(interfaceC4347e, context);
        kotlin.jvm.internal.z.b(2, pVar);
        return pVar.invoke(obj, dVar);
    }

    public static final boolean a(z7.d dVar) {
        z7.f fVar = z7.f.MISSING_VARIABLE;
        z7.f fVar2 = dVar.f48476b;
        return fVar2 == fVar || fVar2 == z7.f.INVALID_VALUE || fVar2 == z7.f.TYPE_MISMATCH;
    }

    public static final boolean b(Object[] objArr, int i, int i10, List list) {
        if (i10 == list.size()) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (kotlin.jvm.internal.l.b(objArr[i + i11], list.get(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String c(Object[] objArr, int i, int i10, AbstractC2084e abstractC2084e) {
        StringBuilder sb = new StringBuilder((i10 * 3) + 2);
        sb.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i11];
            if (obj == abstractC2084e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    public static void d(StringBuilder sb, Object obj, p9.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void e(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbJ = C4356c.j(i, "radix ", " was not in valid range ");
            sbJ.append(new v9.g(2, 36, 1));
            throw new IllegalArgumentException(sbJ.toString());
        }
    }

    public static int f(long j4, long j10) {
        if (j4 < j10) {
            return -1;
        }
        return j4 > j10 ? 1 : 0;
    }

    public static int g(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final double h(double d10, EnumC5872c enumC5872c, EnumC5872c targetUnit) {
        kotlin.jvm.internal.l.f(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, enumC5872c.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / enumC5872c.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long i(long j4, EnumC5872c sourceUnit, EnumC5872c targetUnit) {
        kotlin.jvm.internal.l.f(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.l.f(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j4, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long j(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j4 = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j4 += i;
            i = inputStream.read(bArr);
        }
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC4347e k(p pVar, Object obj, InterfaceC4347e completion) {
        kotlin.jvm.internal.l.f(pVar, "<this>");
        kotlin.jvm.internal.l.f(completion, "completion");
        if (pVar instanceof AbstractC4424a) {
            return ((AbstractC4424a) pVar).create(obj, completion);
        }
        InterfaceC4350h context = completion.getContext();
        return context == C4351i.f37871b ? new g9.b(pVar, obj, completion) : new g9.c(completion, context, pVar, obj);
    }

    public static final C4464b l(Enum[] entries) {
        kotlin.jvm.internal.l.f(entries, "entries");
        return new C4464b(entries);
    }

    public static final boolean m(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static long o(long j4, long j10) {
        return j4 >= 0 ? j4 / j10 : ((j4 + 1) / j10) - 1;
    }

    public static int p(int i, long j4) {
        long j10 = i;
        return (int) (((j4 % j10) + j10) % j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String q(android.content.ContentResolver r9, android.net.Uri r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String r1 = "Failed in getting absolute path for Uri "
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L30 java.lang.RuntimeException -> L37
            r8 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L30 java.lang.RuntimeException -> L33
            if (r9 != 0) goto L1a
            if (r9 == 0) goto L60
            r9.close()
            return r2
        L1a:
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2d
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2d
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2d
            r9.close()
            return r10
        L29:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L61
        L2d:
            r0 = move-exception
            r10 = r0
            goto L3a
        L30:
            r0 = move-exception
            r10 = r0
            goto L61
        L33:
            r0 = move-exception
        L34:
            r10 = r0
            r9 = r2
            goto L3a
        L37:
            r0 = move-exception
            r4 = r10
            goto L34
        L3a:
            java.lang.String r0 = "OutputUtil"
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = " with Exception "
            r4.append(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r10)     // Catch: java.lang.Throwable -> L29
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L29
            C.S.b(r0, r10)     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto L60
            r9.close()
        L60:
            return r2
        L61:
            if (r2 == 0) goto L66
            r2.close()
        L66:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c.q(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    public static InterfaceC4347e r(InterfaceC4347e interfaceC4347e) {
        InterfaceC4347e<Object> interfaceC4347eIntercepted;
        kotlin.jvm.internal.l.f(interfaceC4347e, "<this>");
        h9.c cVar = interfaceC4347e instanceof h9.c ? (h9.c) interfaceC4347e : null;
        return (cVar == null || (interfaceC4347eIntercepted = cVar.intercepted()) == null) ? interfaceC4347e : interfaceC4347eIntercepted;
    }

    public static final boolean s(C4468d c4468d) {
        C4468d c4468d2;
        int i;
        kotlin.jvm.internal.l.f(c4468d, "<this>");
        try {
            c4468d2 = new C4468d();
            long j4 = c4468d.f38643c;
            long j10 = 64;
            if (j4 <= 64) {
                j10 = j4;
            }
            c4468d.k(c4468d2, 0L, j10);
            i = 0;
        } catch (EOFException unused) {
        }
        while (i < 16) {
            i++;
            if (c4468d2.K()) {
                return true;
            }
            int iQ0 = c4468d2.q0();
            if (Character.isISOControl(iQ0) && !Character.isWhitespace(iQ0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static final byte[] u(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        j(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.l.e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static void v(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static final void w(Object[] objArr, int i, int i10) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        while (i < i10) {
            objArr[i] = null;
            i++;
        }
    }

    public static int x(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d10 < -2.147483648E9d ? RecyclerView.UNDEFINED_DURATION : (int) Math.round(d10);
    }

    public static int y(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long z(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        return new ConcurrentSkipListMap();
    }
}
