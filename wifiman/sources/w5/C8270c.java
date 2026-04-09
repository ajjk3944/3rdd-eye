package w5;

import com.google.gson.d;
import com.google.gson.m;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8270c implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f64456l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f64457m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f64458n;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f64459a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f64460b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f64461c = 0;

    /* renamed from: d, reason: collision with root package name */
    private d f64462d;

    /* renamed from: e, reason: collision with root package name */
    private String f64463e;

    /* renamed from: f, reason: collision with root package name */
    private String f64464f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f64465g;

    /* renamed from: h, reason: collision with root package name */
    private m f64466h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f64467i;

    /* renamed from: j, reason: collision with root package name */
    private String f64468j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f64469k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f64457m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f64457m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f64458n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8270c(Writer writer) {
        m0(6);
        this.f64466h = m.LEGACY_STRICT;
        this.f64469k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f64459a = writer;
        o0(d.f38939d);
    }

    private static boolean S(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void Y() throws IOException {
        if (this.f64465g) {
            return;
        }
        this.f64459a.write(this.f64462d.b());
        int i10 = this.f64461c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f64459a.write(this.f64462d.a());
        }
    }

    private void a() throws IOException {
        int iF0 = f0();
        if (iF0 == 5) {
            this.f64459a.write(this.f64464f);
        } else if (iF0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        Y();
        n0(4);
    }

    private C8270c d0(int i10, char c10) throws IOException {
        g();
        m0(i10);
        this.f64459a.write(c10);
        return this;
    }

    private int f0() {
        int i10 = this.f64461c;
        if (i10 != 0) {
            return this.f64460b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void g() throws IOException {
        int iF0 = f0();
        if (iF0 == 1) {
            n0(2);
            Y();
            return;
        }
        if (iF0 == 2) {
            this.f64459a.append((CharSequence) this.f64464f);
            Y();
        } else {
            if (iF0 == 4) {
                this.f64459a.append((CharSequence) this.f64463e);
                n0(5);
                return;
            }
            if (iF0 != 6) {
                if (iF0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f64466h != m.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            n0(7);
        }
    }

    private void m0(int i10) {
        int i11 = this.f64461c;
        int[] iArr = this.f64460b;
        if (i11 == iArr.length) {
            this.f64460b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f64460b;
        int i12 = this.f64461c;
        this.f64461c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void n0(int i10) {
        this.f64460b[this.f64461c - 1] = i10;
    }

    private C8270c p(int i10, int i11, char c10) throws IOException {
        int iF0 = f0();
        if (iF0 != i11 && iF0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f64468j != null) {
            throw new IllegalStateException("Dangling name: " + this.f64468j);
        }
        this.f64461c--;
        if (iF0 == i11) {
            Y();
        }
        this.f64459a.write(c10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void s0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f64467i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = w5.C8270c.f64458n
            goto L9
        L7:
            java.lang.String[] r0 = w5.C8270c.f64457m
        L9:
            java.io.Writer r1 = r8.f64459a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L47
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L34
            goto L44
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2d
            java.lang.String r5 = "\\u2028"
            goto L34
        L2d:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L44
            java.lang.String r5 = "\\u2029"
        L34:
            if (r4 >= r3) goto L3d
            java.io.Writer r6 = r8.f64459a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3d:
            java.io.Writer r4 = r8.f64459a
            r4.write(r5)
            int r4 = r3 + 1
        L44:
            int r3 = r3 + 1
            goto L16
        L47:
            if (r4 >= r1) goto L4f
            java.io.Writer r0 = r8.f64459a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4f:
            java.io.Writer r9 = r8.f64459a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C8270c.s0(java.lang.String):void");
    }

    private void z0() throws IOException {
        if (this.f64468j != null) {
            a();
            s0(this.f64468j);
            this.f64468j = null;
        }
    }

    public final m C() {
        return this.f64466h;
    }

    public final boolean J() {
        return this.f64467i;
    }

    public boolean P() {
        return this.f64466h == m.LENIENT;
    }

    public C8270c T(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f64468j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iF0 = f0();
        if (iF0 != 3 && iF0 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f64468j = str;
        return this;
    }

    public C8270c b0() throws IOException {
        if (this.f64468j != null) {
            if (!this.f64469k) {
                this.f64468j = null;
                return this;
            }
            z0();
        }
        g();
        this.f64459a.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64459a.close();
        int i10 = this.f64461c;
        if (i10 > 1 || (i10 == 1 && this.f64460b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f64461c = 0;
    }

    public void flush() throws IOException {
        if (this.f64461c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f64459a.flush();
    }

    public C8270c h() throws IOException {
        z0();
        return d0(1, '[');
    }

    public C8270c j() throws IOException {
        z0();
        return d0(3, '{');
    }

    public final void o0(d dVar) {
        Objects.requireNonNull(dVar);
        this.f64462d = dVar;
        this.f64464f = ",";
        if (dVar.c()) {
            this.f64463e = ": ";
            if (this.f64462d.b().isEmpty()) {
                this.f64464f = ", ";
            }
        } else {
            this.f64463e = ":";
        }
        this.f64465g = this.f64462d.b().isEmpty() && this.f64462d.a().isEmpty();
    }

    public final void p0(boolean z10) {
        this.f64467i = z10;
    }

    public final void q0(boolean z10) {
        this.f64469k = z10;
    }

    public final void r0(m mVar) {
        Objects.requireNonNull(mVar);
        this.f64466h = mVar;
    }

    public C8270c s() {
        return p(1, 2, ']');
    }

    public C8270c t0(double d10) throws IOException {
        z0();
        if (this.f64466h == m.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            g();
            this.f64459a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public C8270c u0(long j10) throws IOException {
        z0();
        g();
        this.f64459a.write(Long.toString(j10));
        return this;
    }

    public C8270c v() {
        return p(3, 5, '}');
    }

    public C8270c v0(Boolean bool) throws IOException {
        if (bool == null) {
            return b0();
        }
        z0();
        g();
        this.f64459a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public C8270c w0(Number number) throws IOException {
        if (number == null) {
            return b0();
        }
        z0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!S(cls) && !f64456l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.f64466h != m.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        g();
        this.f64459a.append((CharSequence) string);
        return this;
    }

    public C8270c x0(String str) throws IOException {
        if (str == null) {
            return b0();
        }
        z0();
        g();
        s0(str);
        return this;
    }

    public final boolean y() {
        return this.f64469k;
    }

    public C8270c y0(boolean z10) throws IOException {
        z0();
        g();
        this.f64459a.write(z10 ? "true" : "false");
        return this;
    }
}
