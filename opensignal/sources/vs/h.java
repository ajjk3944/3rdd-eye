package vs;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h {
    public static b a(List list, rr.a0 a0Var, or.k kVar) {
        List listQ0 = mq.o.Q0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            g gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return a0Var != null ? new z(arrayList, a0Var.n().q(kVar)) : new b(arrayList, new j1.a(16, kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static g b(Object obj, ur.a0 a0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new x(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new v(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e((Character) obj);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c((Boolean) obj);
        }
        if (obj instanceof String) {
            return new y((String) obj);
        }
        boolean z10 = obj instanceof byte[];
        ?? H = mq.w.f16945a;
        int i10 = 0;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    H = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        H.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Byte.valueOf(bArr[0]));
                }
            }
            return a(H, a0Var, or.k.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    H = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        H.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Short.valueOf(sArr[0]));
                }
            }
            return a(H, a0Var, or.k.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    H = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i10 < length6) {
                        H.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Integer.valueOf(iArr[0]));
                }
            }
            return a(H, a0Var, or.k.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    H = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i10 < length8) {
                        H.add(Long.valueOf(jArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Long.valueOf(jArr[0]));
                }
            }
            return a(H, a0Var, or.k.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    H = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i10 < length10) {
                        H.add(Character.valueOf(cArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Character.valueOf(cArr[0]));
                }
            }
            return a(H, a0Var, or.k.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    H = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i10 < length12) {
                        H.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Float.valueOf(fArr[0]));
                }
            }
            return a(H, a0Var, or.k.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    H = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i10 < length14) {
                        H.add(Double.valueOf(dArr[i10]));
                        i10++;
                    }
                } else {
                    H = e5.H(Double.valueOf(dArr[0]));
                }
            }
            return a(H, a0Var, or.k.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new w(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length15 = zArr.length;
        if (length15 != 0) {
            if (length15 != 1) {
                H = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i10 < length16) {
                    H.add(Boolean.valueOf(zArr[i10]));
                    i10++;
                }
            } else {
                H = e5.H(Boolean.valueOf(zArr[0]));
            }
        }
        return a(H, a0Var, or.k.BOOLEAN);
    }
}
