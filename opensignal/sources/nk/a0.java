package nk;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 extends w {
    public static final Object D = new Object();
    public Object[] B;

    @Override // nk.w
    public final double G() throws androidx.datastore.preferences.protobuf.m, NumberFormatException {
        double dDoubleValue;
        v vVar = v.NUMBER;
        Object objX0 = x0(Object.class, vVar);
        if (objX0 instanceof Number) {
            dDoubleValue = ((Number) objX0).doubleValue();
        } else {
            if (!(objX0 instanceof String)) {
                throw u0(objX0, vVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objX0);
            } catch (NumberFormatException unused) {
                throw u0(objX0, v.NUMBER);
            }
        }
        if (this.f18451x || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            w0();
            return dDoubleValue;
        }
        throw new androidx.datastore.preferences.protobuf.m("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + q());
    }

    @Override // nk.w
    public final int L() throws NumberFormatException {
        int iIntValueExact;
        v vVar = v.NUMBER;
        Object objX0 = x0(Object.class, vVar);
        if (objX0 instanceof Number) {
            iIntValueExact = ((Number) objX0).intValue();
        } else {
            if (!(objX0 instanceof String)) {
                throw u0(objX0, vVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objX0);
                } catch (NumberFormatException unused) {
                    iIntValueExact = new BigDecimal((String) objX0).intValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw u0(objX0, v.NUMBER);
            }
        }
        w0();
        return iIntValueExact;
    }

    @Override // nk.w
    public final long R() throws NumberFormatException {
        long jLongValueExact;
        v vVar = v.NUMBER;
        Object objX0 = x0(Object.class, vVar);
        if (objX0 instanceof Number) {
            jLongValueExact = ((Number) objX0).longValue();
        } else {
            if (!(objX0 instanceof String)) {
                throw u0(objX0, vVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objX0);
                } catch (NumberFormatException unused) {
                    jLongValueExact = new BigDecimal((String) objX0).longValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw u0(objX0, v.NUMBER);
            }
        }
        w0();
        return jLongValueExact;
    }

    @Override // nk.w
    public final String V() {
        v vVar = v.NAME;
        Map.Entry entry = (Map.Entry) x0(Map.Entry.class, vVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw u0(key, vVar);
        }
        String str = (String) key;
        this.B[this.f18447a - 1] = entry.getValue();
        this.f18449g[this.f18447a - 2] = str;
        return str;
    }

    @Override // nk.w
    public final void Y() {
        x0(Void.class, v.NULL);
        w0();
    }

    @Override // nk.w
    public final String Z() {
        int i10 = this.f18447a;
        Object obj = i10 != 0 ? this.B[i10 - 1] : null;
        if (obj instanceof String) {
            w0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            w0();
            return obj.toString();
        }
        if (obj == D) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw u0(obj, v.STRING);
    }

    @Override // nk.w
    public final void b() {
        List list = (List) x0(List.class, v.BEGIN_ARRAY);
        z zVar = new z(v.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.B;
        int i10 = this.f18447a;
        objArr[i10 - 1] = zVar;
        this.f18448d[i10 - 1] = 1;
        this.f18450r[i10 - 1] = 0;
        if (zVar.hasNext()) {
            v0(zVar.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.B, 0, this.f18447a, (Object) null);
        this.B[0] = D;
        this.f18448d[0] = 8;
        this.f18447a = 1;
    }

    @Override // nk.w
    public final void f() {
        Map map = (Map) x0(Map.class, v.BEGIN_OBJECT);
        z zVar = new z(v.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.B;
        int i10 = this.f18447a;
        objArr[i10 - 1] = zVar;
        this.f18448d[i10 - 1] = 3;
        if (zVar.hasNext()) {
            v0(zVar.next());
        }
    }

    @Override // nk.w
    public final v f0() {
        int i10 = this.f18447a;
        if (i10 == 0) {
            return v.END_DOCUMENT;
        }
        Object obj = this.B[i10 - 1];
        if (obj instanceof z) {
            return ((z) obj).f18453a;
        }
        if (obj instanceof List) {
            return v.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return v.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return v.NAME;
        }
        if (obj instanceof String) {
            return v.STRING;
        }
        if (obj instanceof Boolean) {
            return v.BOOLEAN;
        }
        if (obj instanceof Number) {
            return v.NUMBER;
        }
        if (obj == null) {
            return v.NULL;
        }
        if (obj == D) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw u0(obj, "a JSON value");
    }

    @Override // nk.w
    public final void h() {
        v vVar = v.END_ARRAY;
        z zVar = (z) x0(z.class, vVar);
        if (zVar.f18453a != vVar || zVar.hasNext()) {
            throw u0(zVar, vVar);
        }
        w0();
    }

    @Override // nk.w
    public final void i() {
        v vVar = v.END_OBJECT;
        z zVar = (z) x0(z.class, vVar);
        if (zVar.f18453a != vVar || zVar.hasNext()) {
            throw u0(zVar, vVar);
        }
        this.f18449g[this.f18447a - 1] = null;
        w0();
    }

    @Override // nk.w
    public final void i0() {
        if (w()) {
            v0(V());
        }
    }

    @Override // nk.w
    public final int p0(io.sentry.t tVar) {
        v vVar = v.NAME;
        Map.Entry entry = (Map.Entry) x0(Map.Entry.class, vVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw u0(key, vVar);
        }
        String str = (String) key;
        int length = ((String[]) tVar.f12736a).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (((String[]) tVar.f12736a)[i10].equals(str)) {
                this.B[this.f18447a - 1] = entry.getValue();
                this.f18449g[this.f18447a - 2] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // nk.w
    public final int q0(io.sentry.t tVar) {
        int i10 = this.f18447a;
        Object obj = i10 != 0 ? this.B[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != D) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = ((String[]) tVar.f12736a).length;
        for (int i11 = 0; i11 < length; i11++) {
            if (((String[]) tVar.f12736a)[i11].equals(str)) {
                w0();
                return i11;
            }
        }
        return -1;
    }

    @Override // nk.w
    public final void r0() {
        if (!this.f18452y) {
            this.B[this.f18447a - 1] = ((Map.Entry) x0(Map.Entry.class, v.NAME)).getValue();
            this.f18449g[this.f18447a - 2] = "null";
        } else {
            v vVarF0 = f0();
            V();
            throw new bf.n("Cannot skip unexpected " + vVarF0 + " at " + q());
        }
    }

    @Override // nk.w
    public final void s0() {
        if (this.f18452y) {
            throw new bf.n("Cannot skip unexpected " + f0() + " at " + q());
        }
        int i10 = this.f18447a;
        if (i10 > 1) {
            this.f18449g[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.B[i10 - 1] : null;
        if (obj instanceof z) {
            throw new bf.n("Expected a value but was " + f0() + " at path " + q());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.B;
            int i11 = i10 - 1;
            objArr[i11] = ((Map.Entry) objArr[i11]).getValue();
        } else {
            if (i10 > 0) {
                w0();
                return;
            }
            throw new bf.n("Expected a value but was " + f0() + " at path " + q());
        }
    }

    public final void v0(Object obj) {
        int i10 = this.f18447a;
        if (i10 == this.B.length) {
            if (i10 == 256) {
                throw new bf.n("Nesting too deep at " + q());
            }
            int[] iArr = this.f18448d;
            this.f18448d = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18449g;
            this.f18449g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18450r;
            this.f18450r = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.B;
            this.B = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.B;
        int i11 = this.f18447a;
        this.f18447a = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // nk.w
    public final boolean w() {
        int i10 = this.f18447a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.B[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    public final void w0() {
        int i10 = this.f18447a;
        int i11 = i10 - 1;
        this.f18447a = i11;
        Object[] objArr = this.B;
        objArr[i11] = null;
        this.f18448d[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f18450r;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    v0(it.next());
                }
            }
        }
    }

    public final Object x0(Class cls, v vVar) {
        int i10 = this.f18447a;
        Object obj = i10 != 0 ? this.B[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && vVar == v.NULL) {
            return null;
        }
        if (obj == D) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw u0(obj, vVar);
    }

    @Override // nk.w
    public final boolean y() {
        Boolean bool = (Boolean) x0(Boolean.class, v.BOOLEAN);
        w0();
        return bool.booleanValue();
    }
}
