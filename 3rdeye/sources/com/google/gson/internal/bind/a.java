package com.google.gson.internal.bind;

import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class a extends E5.a {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f23473v;

    /* renamed from: r, reason: collision with root package name */
    public Object[] f23474r;

    /* renamed from: s, reason: collision with root package name */
    public int f23475s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f23476t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f23477u;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    public static class C0353a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i10) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C0353a();
        f23473v = new Object();
    }

    @Override // E5.a
    public final String A() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f23475s) {
            Object[] objArr = this.f23474r;
            Object obj = objArr[i];
            if (obj instanceof e) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f23477u[i]);
                    sb.append(']');
                }
            } else if (obj instanceof j) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f23476t[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // E5.a
    public final boolean B() throws IOException {
        E5.b bVarC0 = C0();
        return (bVarC0 == E5.b.END_OBJECT || bVarC0 == E5.b.END_ARRAY) ? false : true;
    }

    @Override // E5.a
    public final E5.b C0() throws IOException {
        if (this.f23475s == 0) {
            return E5.b.END_DOCUMENT;
        }
        Object objU0 = U0();
        if (objU0 instanceof Iterator) {
            boolean z10 = this.f23474r[this.f23475s - 2] instanceof j;
            Iterator it = (Iterator) objU0;
            if (!it.hasNext()) {
                return z10 ? E5.b.END_OBJECT : E5.b.END_ARRAY;
            }
            if (z10) {
                return E5.b.NAME;
            }
            W0(it.next());
            return C0();
        }
        if (objU0 instanceof j) {
            return E5.b.BEGIN_OBJECT;
        }
        if (objU0 instanceof e) {
            return E5.b.BEGIN_ARRAY;
        }
        if (!(objU0 instanceof k)) {
            if (objU0 instanceof i) {
                return E5.b.NULL;
            }
            if (objU0 == f23473v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((k) objU0).f23515b;
        if (serializable instanceof String) {
            return E5.b.STRING;
        }
        if (serializable instanceof Boolean) {
            return E5.b.BOOLEAN;
        }
        if (serializable instanceof Number) {
            return E5.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // E5.a
    public final void Q0() throws IOException {
        if (C0() == E5.b.NAME) {
            q0();
            this.f23476t[this.f23475s - 2] = "null";
        } else {
            V0();
            int i = this.f23475s;
            if (i > 0) {
                this.f23476t[i - 1] = "null";
            }
        }
        int i10 = this.f23475s;
        if (i10 > 0) {
            int[] iArr = this.f23477u;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void S0(E5.b bVar) throws IOException {
        if (C0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + C0() + T0());
    }

    public final String T0() {
        return " at path " + A();
    }

    public final Object U0() {
        return this.f23474r[this.f23475s - 1];
    }

    public final Object V0() {
        Object[] objArr = this.f23474r;
        int i = this.f23475s - 1;
        this.f23475s = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // E5.a
    public final boolean W() throws IOException {
        S0(E5.b.BOOLEAN);
        boolean zB = ((k) V0()).b();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return zB;
    }

    public final void W0(Object obj) {
        int i = this.f23475s;
        Object[] objArr = this.f23474r;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            int[] iArr = new int[i * 2];
            String[] strArr = new String[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f23477u, 0, iArr, 0, this.f23475s);
            System.arraycopy(this.f23476t, 0, strArr, 0, this.f23475s);
            this.f23474r = objArr2;
            this.f23477u = iArr;
            this.f23476t = strArr;
        }
        Object[] objArr3 = this.f23474r;
        int i10 = this.f23475s;
        this.f23475s = i10 + 1;
        objArr3[i10] = obj;
    }

    @Override // E5.a
    public final void a() throws IOException {
        S0(E5.b.BEGIN_ARRAY);
        W0(((e) U0()).f23370b.iterator());
        this.f23477u[this.f23475s - 1] = 0;
    }

    @Override // E5.a
    public final void c() throws IOException {
        S0(E5.b.BEGIN_OBJECT);
        W0(((f.b) ((j) U0()).f23513b.entrySet()).iterator());
    }

    @Override // E5.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f23474r = new Object[]{f23473v};
        this.f23475s = 1;
    }

    @Override // E5.a
    public final void k() throws IOException {
        S0(E5.b.END_ARRAY);
        V0();
        V0();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // E5.a
    public final double k0() throws IOException {
        E5.b bVarC0 = C0();
        E5.b bVar = E5.b.NUMBER;
        if (bVarC0 != bVar && bVarC0 != E5.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC0 + T0());
        }
        k kVar = (k) U0();
        double dDoubleValue = kVar.f23515b instanceof Number ? kVar.c().doubleValue() : Double.parseDouble(kVar.d());
        if (!this.f1424c && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        V0();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return dDoubleValue;
    }

    @Override // E5.a
    public final void l() throws IOException {
        S0(E5.b.END_OBJECT);
        V0();
        V0();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // E5.a
    public final int m0() throws IOException {
        E5.b bVarC0 = C0();
        E5.b bVar = E5.b.NUMBER;
        if (bVarC0 != bVar && bVarC0 != E5.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC0 + T0());
        }
        k kVar = (k) U0();
        int iIntValue = kVar.f23515b instanceof Number ? kVar.c().intValue() : Integer.parseInt(kVar.d());
        V0();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return iIntValue;
    }

    @Override // E5.a
    public final long p0() throws IOException {
        E5.b bVarC0 = C0();
        E5.b bVar = E5.b.NUMBER;
        if (bVarC0 != bVar && bVarC0 != E5.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC0 + T0());
        }
        k kVar = (k) U0();
        long jLongValue = kVar.f23515b instanceof Number ? kVar.c().longValue() : Long.parseLong(kVar.d());
        V0();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return jLongValue;
    }

    @Override // E5.a
    public final String q0() throws IOException {
        S0(E5.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U0()).next();
        String str = (String) entry.getKey();
        this.f23476t[this.f23475s - 1] = str;
        W0(entry.getValue());
        return str;
    }

    @Override // E5.a
    public final String toString() {
        return a.class.getSimpleName();
    }

    @Override // E5.a
    public final void v0() throws IOException {
        S0(E5.b.NULL);
        V0();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // E5.a
    public final String y0() throws IOException {
        E5.b bVarC0 = C0();
        E5.b bVar = E5.b.STRING;
        if (bVarC0 != bVar && bVarC0 != E5.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC0 + T0());
        }
        String strD = ((k) V0()).d();
        int i = this.f23475s;
        if (i > 0) {
            int[] iArr = this.f23477u;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return strD;
    }
}
