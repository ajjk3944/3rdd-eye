package nk;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 extends c0 {
    public Object[] F;
    public String G;

    @Override // nk.c0
    public final c0 G() {
        if (this.D) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + w());
        }
        o0(null);
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 Y(double d6) {
        if (!this.f18358y && (Double.isNaN(d6) || d6 == Double.NEGATIVE_INFINITY || d6 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
        }
        if (this.D) {
            this.D = false;
            y(Double.toString(d6));
            return this;
        }
        o0(Double.valueOf(d6));
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 Z(long j) {
        if (this.D) {
            this.D = false;
            y(Long.toString(j));
            return this;
        }
        o0(Long.valueOf(j));
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 b() {
        if (this.D) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + w());
        }
        int i10 = this.f18353a;
        int i11 = this.E;
        if (i10 == i11 && this.f18354d[i10 - 1] == 1) {
            this.E = ~i11;
            return this;
        }
        h();
        ArrayList arrayList = new ArrayList();
        o0(arrayList);
        Object[] objArr = this.F;
        int i12 = this.f18353a;
        objArr[i12] = arrayList;
        this.f18356r[i12] = 0;
        R(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f18353a;
        if (i10 > 1 || (i10 == 1 && this.f18354d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f18353a = 0;
    }

    @Override // nk.c0
    public final c0 f() {
        if (this.D) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + w());
        }
        int i10 = this.f18353a;
        int i11 = this.E;
        if (i10 == i11 && this.f18354d[i10 - 1] == 3) {
            this.E = ~i11;
            return this;
        }
        h();
        g0 g0Var = new g0();
        o0(g0Var);
        this.F[this.f18353a] = g0Var;
        R(3);
        return this;
    }

    @Override // nk.c0
    public final c0 f0(Float f10) {
        if (f10 != null) {
            Y(f10.doubleValue());
            return this;
        }
        if (f10 == null) {
            G();
            return this;
        }
        BigDecimal bigDecimal = new BigDecimal(f10.toString());
        if (this.D) {
            this.D = false;
            y(bigDecimal.toString());
            return this;
        }
        o0(bigDecimal);
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f18353a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // nk.c0
    public final c0 i() {
        if (L() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f18353a;
        int i11 = this.E;
        if (i10 == (~i11)) {
            this.E = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f18353a = i12;
        this.F[i12] = null;
        int[] iArr = this.f18356r;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 i0(String str) {
        if (this.D) {
            this.D = false;
            y(str);
            return this;
        }
        o0(str);
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 n0(boolean z10) {
        if (this.D) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + w());
        }
        o0(Boolean.valueOf(z10));
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void o0(Serializable serializable) {
        String str;
        Object objPut;
        int iL = L();
        int i10 = this.f18353a;
        if (i10 == 1) {
            if (iL != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i11 = i10 - 1;
            this.f18354d[i11] = 7;
            this.F[i11] = serializable;
            return;
        }
        if (iL != 3 || (str = this.G) == null) {
            if (iL == 1) {
                ((List) this.F[i10 - 1]).add(serializable);
                return;
            } else {
                if (iL != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if ((serializable == null && !this.B) || (objPut = ((Map) this.F[i10 - 1]).put(str, serializable)) == null) {
            this.G = null;
            return;
        }
        throw new IllegalArgumentException("Map key '" + this.G + "' has multiple values at path " + w() + ": " + objPut + " and " + serializable);
    }

    @Override // nk.c0
    public final c0 q() {
        if (L() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.G != null) {
            throw new IllegalStateException("Dangling name: " + this.G);
        }
        int i10 = this.f18353a;
        int i11 = this.E;
        if (i10 == (~i11)) {
            this.E = ~i11;
            return this;
        }
        this.D = false;
        int i12 = i10 - 1;
        this.f18353a = i12;
        this.F[i12] = null;
        this.f18355g[i12] = null;
        int[] iArr = this.f18356r;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 y(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f18353a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (L() != 3 || this.G != null || this.D) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.G = str;
        this.f18355g[this.f18353a - 1] = str;
        return this;
    }
}
