package t6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f34326b = new b0(1);

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f34327c = new b0(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f34328a;

    public c0(androidx.lifecycle.l0 l0Var, h3.k kVar) {
        this.f34328a = kVar;
    }

    public void a(HashMap map) {
        Object[] objArr;
        nk.k.e(map, "values");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            nk.k.e(str, "key");
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f34328a;
            if (value == null) {
                value = null;
            } else {
                nk.e eVarA = nk.v.a(value.getClass());
                if (!eVarA.equals(nk.v.a(Boolean.TYPE)) && !eVarA.equals(nk.v.a(Byte.TYPE)) && !eVarA.equals(nk.v.a(Integer.TYPE)) && !eVarA.equals(nk.v.a(Long.TYPE)) && !eVarA.equals(nk.v.a(Float.TYPE)) && !eVarA.equals(nk.v.a(Double.TYPE)) && !eVarA.equals(nk.v.a(String.class)) && !eVarA.equals(nk.v.a(Boolean[].class)) && !eVarA.equals(nk.v.a(Byte[].class)) && !eVarA.equals(nk.v.a(Integer[].class)) && !eVarA.equals(nk.v.a(Long[].class)) && !eVarA.equals(nk.v.a(Float[].class)) && !eVarA.equals(nk.v.a(Double[].class)) && !eVarA.equals(nk.v.a(String[].class))) {
                    int i4 = 0;
                    if (eVarA.equals(nk.v.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = i.f34367a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i4 < length) {
                            objArr[i4] = Boolean.valueOf(zArr[i4]);
                            i4++;
                        }
                    } else if (eVarA.equals(nk.v.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = i.f34367a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i4 < length2) {
                            objArr[i4] = Byte.valueOf(bArr[i4]);
                            i4++;
                        }
                    } else if (eVarA.equals(nk.v.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = i.f34367a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i4 < length3) {
                            objArr[i4] = Integer.valueOf(iArr[i4]);
                            i4++;
                        }
                    } else if (eVarA.equals(nk.v.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = i.f34367a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i4 < length4) {
                            objArr[i4] = Long.valueOf(jArr[i4]);
                            i4++;
                        }
                    } else if (eVarA.equals(nk.v.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = i.f34367a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i4 < length5) {
                            objArr[i4] = Float.valueOf(fArr[i4]);
                            i4++;
                        }
                    } else {
                        if (!eVarA.equals(nk.v.a(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + eVarA);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = i.f34367a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i4 < length6) {
                            objArr[i4] = Double.valueOf(dArr[i4]);
                            i4++;
                        }
                    }
                    value = objArr;
                }
            }
            linkedHashMap.put(str, value);
        }
    }

    public c0() {
        this.f34328a = new LinkedHashMap();
    }
}
