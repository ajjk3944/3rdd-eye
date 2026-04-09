package o4;

import g4.i;
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

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2764c implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f22715l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f22716m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f22717n;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f22718a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f22719b;

    /* renamed from: c, reason: collision with root package name */
    public int f22720c;

    /* renamed from: d, reason: collision with root package name */
    public i f22721d;

    /* renamed from: e, reason: collision with root package name */
    public String f22722e;

    /* renamed from: f, reason: collision with root package name */
    public String f22723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22724g;

    /* renamed from: h, reason: collision with root package name */
    public int f22725h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public String f22726j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22727k;

    static {
        for (int i = 0; i <= 31; i++) {
            f22716m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f22716m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f22717n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C2764c(Writer writer) {
        int[] iArr = new int[32];
        this.f22719b = iArr;
        this.f22720c = 0;
        if (iArr.length == 0) {
            this.f22719b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f22719b;
        int i = this.f22720c;
        this.f22720c = i + 1;
        iArr2[i] = 6;
        this.f22725h = 2;
        this.f22727k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f22718a = writer;
        q(i.f20223d);
    }

    public final void a() throws IOException {
        int iP = p();
        if (iP == 1) {
            this.f22719b[this.f22720c - 1] = 2;
            n();
            return;
        }
        Writer writer = this.f22718a;
        if (iP == 2) {
            writer.append((CharSequence) this.f22723f);
            n();
        } else {
            if (iP == 4) {
                writer.append((CharSequence) this.f22722e);
                this.f22719b[this.f22720c - 1] = 5;
                return;
            }
            if (iP != 6) {
                if (iP != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f22725h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f22719b[this.f22720c - 1] = 7;
        }
    }

    public void b() throws IOException {
        y();
        a();
        int i = this.f22720c;
        int[] iArr = this.f22719b;
        if (i == iArr.length) {
            this.f22719b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f22719b;
        int i3 = this.f22720c;
        this.f22720c = i3 + 1;
        iArr2[i3] = 1;
        this.f22718a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22718a.close();
        int i = this.f22720c;
        if (i > 1 || (i == 1 && this.f22719b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f22720c = 0;
    }

    public void d() throws IOException {
        y();
        a();
        int i = this.f22720c;
        int[] iArr = this.f22719b;
        if (i == iArr.length) {
            this.f22719b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f22719b;
        int i3 = this.f22720c;
        this.f22720c = i3 + 1;
        iArr2[i3] = 3;
        this.f22718a.write(123);
    }

    public final void e(int i, int i3, char c6) throws IOException {
        int iP = p();
        if (iP != i3 && iP != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f22726j != null) {
            throw new IllegalStateException("Dangling name: " + this.f22726j);
        }
        this.f22720c--;
        if (iP == i3) {
            n();
        }
        this.f22718a.write(c6);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f22720c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f22718a.flush();
    }

    public void h() throws IOException {
        e(1, 2, ']');
    }

    public void k() throws IOException {
        e(3, 5, '}');
    }

    public void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f22726j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iP = p();
        if (iP != 3 && iP != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f22726j = str;
    }

    public final void n() throws IOException {
        if (this.f22724g) {
            return;
        }
        String str = this.f22721d.f20224a;
        Writer writer = this.f22718a;
        writer.write(str);
        int i = this.f22720c;
        for (int i3 = 1; i3 < i; i3++) {
            writer.write(this.f22721d.f20225b);
        }
    }

    public C2764c o() throws IOException {
        if (this.f22726j != null) {
            if (!this.f22727k) {
                this.f22726j = null;
                return this;
            }
            y();
        }
        a();
        this.f22718a.write("null");
        return this;
    }

    public final int p() {
        int i = this.f22720c;
        if (i != 0) {
            return this.f22719b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void q(i iVar) {
        Objects.requireNonNull(iVar);
        this.f22721d = iVar;
        this.f22723f = ",";
        if (iVar.f20226c) {
            this.f22722e = ": ";
            if (iVar.f20224a.isEmpty()) {
                this.f22723f = ", ";
            }
        } else {
            this.f22722e = ":";
        }
        this.f22724g = this.f22721d.f20224a.isEmpty() && this.f22721d.f20225b.isEmpty();
    }

    public final void r(int i) {
        if (i == 0) {
            throw null;
        }
        this.f22725h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = o4.C2764c.f22717n
            goto L9
        L7:
            java.lang.String[] r0 = o4.C2764c.f22716m
        L9:
            java.io.Writer r1 = r8.f22718a
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
        throw new UnsupportedOperationException("Method not decompiled: o4.C2764c.s(java.lang.String):void");
    }

    public void t(double d6) throws IOException {
        y();
        if (this.f22725h == 1 || !(Double.isNaN(d6) || Double.isInfinite(d6))) {
            a();
            this.f22718a.append((CharSequence) Double.toString(d6));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
        }
    }

    public void u(long j6) throws IOException {
        y();
        a();
        this.f22718a.write(Long.toString(j6));
    }

    public void v(Number number) throws IOException {
        if (number == null) {
            o();
            return;
        }
        y();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f22725h != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f22715l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        a();
        this.f22718a.append((CharSequence) string);
    }

    public void w(String str) throws IOException {
        if (str == null) {
            o();
            return;
        }
        y();
        a();
        s(str);
    }

    public void x(boolean z6) throws IOException {
        y();
        a();
        this.f22718a.write(z6 ? "true" : "false");
    }

    public final void y() throws IOException {
        if (this.f22726j != null) {
            int iP = p();
            if (iP == 5) {
                this.f22718a.write(this.f22723f);
            } else if (iP != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            n();
            this.f22719b[this.f22720c - 1] = 4;
            s(this.f22726j);
            this.f22726j = null;
        }
    }
}
