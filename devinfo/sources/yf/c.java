package yf;

import com.google.gson.i;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f37601l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f37602m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f37603n;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f37604a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f37605b;

    /* renamed from: c, reason: collision with root package name */
    public int f37606c;

    /* renamed from: d, reason: collision with root package name */
    public i f37607d;

    /* renamed from: e, reason: collision with root package name */
    public String f37608e;

    /* renamed from: f, reason: collision with root package name */
    public String f37609f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f37610h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37611i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37612k;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f37602m[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f37602m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f37603n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f37605b = iArr;
        this.f37606c = 0;
        if (iArr.length == 0) {
            this.f37605b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f37605b;
        int i4 = this.f37606c;
        this.f37606c = i4 + 1;
        iArr2[i4] = 6;
        this.f37610h = 2;
        this.f37612k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f37604a = writer;
        F(i.f20732d);
    }

    public c A() throws IOException {
        if (this.j != null) {
            if (!this.f37612k) {
                this.j = null;
                return this;
            }
            W();
        }
        c();
        this.f37604a.write("null");
        return this;
    }

    public final int E() {
        int i4 = this.f37606c;
        if (i4 != 0) {
            return this.f37605b[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void F(i iVar) {
        Objects.requireNonNull(iVar);
        this.f37607d = iVar;
        this.f37609f = ",";
        if (iVar.f20735c) {
            this.f37608e = ": ";
            if (iVar.f20733a.isEmpty()) {
                this.f37609f = ", ";
            }
        } else {
            this.f37608e = ":";
        }
        this.g = this.f37607d.f20733a.isEmpty() && this.f37607d.f20734b.isEmpty();
    }

    public final void G(int i4) {
        if (i4 == 0) {
            throw null;
        }
        this.f37610h = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f37611i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = yf.c.f37603n
            goto L9
        L7:
            java.lang.String[] r0 = yf.c.f37602m
        L9:
            java.io.Writer r1 = r8.f37604a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.c.L(java.lang.String):void");
    }

    public void N(double d10) throws IOException {
        W();
        if (this.f37610h == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            c();
            this.f37604a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void O(long j) throws IOException {
        W();
        c();
        this.f37604a.write(Long.toString(j));
    }

    public void T(Number number) throws IOException {
        if (number == null) {
            A();
            return;
        }
        W();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f37610h != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f37601l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        c();
        this.f37604a.append((CharSequence) string);
    }

    public void U(String str) throws IOException {
        if (str == null) {
            A();
            return;
        }
        W();
        c();
        L(str);
    }

    public void V(boolean z3) throws IOException {
        W();
        c();
        this.f37604a.write(z3 ? "true" : "false");
    }

    public final void W() throws IOException {
        if (this.j != null) {
            int iE = E();
            if (iE == 5) {
                this.f37604a.write(this.f37609f);
            } else if (iE != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            y();
            this.f37605b[this.f37606c - 1] = 4;
            L(this.j);
            this.j = null;
        }
    }

    public final void c() throws IOException {
        int iE = E();
        if (iE == 1) {
            this.f37605b[this.f37606c - 1] = 2;
            y();
            return;
        }
        Writer writer = this.f37604a;
        if (iE == 2) {
            writer.append((CharSequence) this.f37609f);
            y();
        } else {
            if (iE == 4) {
                writer.append((CharSequence) this.f37608e);
                this.f37605b[this.f37606c - 1] = 5;
                return;
            }
            if (iE != 6) {
                if (iE != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f37610h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f37605b[this.f37606c - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37604a.close();
        int i4 = this.f37606c;
        if (i4 > 1 || (i4 == 1 && this.f37605b[i4 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f37606c = 0;
    }

    public void e() throws IOException {
        W();
        c();
        int i4 = this.f37606c;
        int[] iArr = this.f37605b;
        if (i4 == iArr.length) {
            this.f37605b = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.f37605b;
        int i10 = this.f37606c;
        this.f37606c = i10 + 1;
        iArr2[i10] = 1;
        this.f37604a.write(91);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f37606c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f37604a.flush();
    }

    public void g() throws IOException {
        W();
        c();
        int i4 = this.f37606c;
        int[] iArr = this.f37605b;
        if (i4 == iArr.length) {
            this.f37605b = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.f37605b;
        int i10 = this.f37606c;
        this.f37606c = i10 + 1;
        iArr2[i10] = 3;
        this.f37604a.write(123);
    }

    public final void m(int i4, int i10, char c9) throws IOException {
        int iE = E();
        if (iE != i10 && iE != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.f37606c--;
        if (iE == i10) {
            y();
        }
        this.f37604a.write(c9);
    }

    public void p() throws IOException {
        m(1, 2, ']');
    }

    public void v() throws IOException {
        m(3, 5, '}');
    }

    public void w(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iE = E();
        if (iE != 3 && iE != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.j = str;
    }

    public final void y() throws IOException {
        if (this.g) {
            return;
        }
        String str = this.f37607d.f20733a;
        Writer writer = this.f37604a;
        writer.write(str);
        int i4 = this.f37606c;
        for (int i10 = 1; i10 < i4; i10++) {
            writer.write(this.f37607d.f20734b);
        }
    }
}
