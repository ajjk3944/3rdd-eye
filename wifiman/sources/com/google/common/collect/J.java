package com.google.common.collect;

import com.google.common.collect.AbstractC5070p;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
final class J extends AbstractC5070p {

    /* renamed from: h, reason: collision with root package name */
    static final AbstractC5070p f38324h = new J(null, new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f38325e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f38326f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f38327g;

    static class a extends r {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC5070p f38328c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f38329d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f38330e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f38331f;

        /* renamed from: com.google.common.collect.J$a$a, reason: collision with other inner class name */
        class C1209a extends AbstractC5069o {
            C1209a() {
            }

            @Override // java.util.List
            /* renamed from: X0, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                AbstractC6769h.g(i10, a.this.f38331f);
                int i11 = i10 * 2;
                Object obj = a.this.f38329d[a.this.f38330e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f38329d[i11 + (a.this.f38330e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.AbstractC5068n
            public boolean s() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f38331f;
            }
        }

        a(AbstractC5070p abstractC5070p, Object[] objArr, int i10, int i11) {
            this.f38328c = abstractC5070p;
            this.f38329d = objArr;
            this.f38330e = i10;
            this.f38331f = i11;
        }

        @Override // com.google.common.collect.r
        AbstractC5069o J() {
            return new C1209a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: T */
        public S iterator() {
            return v().iterator();
        }

        @Override // com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f38328c.get(key));
        }

        @Override // com.google.common.collect.AbstractC5068n
        int g(Object[] objArr, int i10) {
            return v().g(objArr, i10);
        }

        @Override // com.google.common.collect.AbstractC5068n
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f38331f;
        }
    }

    static final class b extends r {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC5070p f38333c;

        /* renamed from: d, reason: collision with root package name */
        private final transient AbstractC5069o f38334d;

        b(AbstractC5070p abstractC5070p, AbstractC5069o abstractC5069o) {
            this.f38333c = abstractC5070p;
            this.f38334d = abstractC5069o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: T */
        public S iterator() {
            return v().iterator();
        }

        @Override // com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f38333c.get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractC5068n
        int g(Object[] objArr, int i10) {
            return v().g(objArr, i10);
        }

        @Override // com.google.common.collect.AbstractC5068n
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f38333c.size();
        }

        @Override // com.google.common.collect.r
        public AbstractC5069o v() {
            return this.f38334d;
        }
    }

    static final class c extends AbstractC5069o {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f38335c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f38336d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f38337e;

        c(Object[] objArr, int i10, int i11) {
            this.f38335c = objArr;
            this.f38336d = i10;
            this.f38337e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC6769h.g(i10, this.f38337e);
            Object obj = this.f38335c[(i10 * 2) + this.f38336d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.AbstractC5068n
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38337e;
        }
    }

    private J(Object obj, Object[] objArr, int i10) {
        this.f38325e = obj;
        this.f38326f = objArr;
        this.f38327g = i10;
    }

    static J B(int i10, Object[] objArr) {
        return C(i10, objArr, null);
    }

    static J C(int i10, Object[] objArr, AbstractC5070p.a aVar) {
        if (i10 == 0) {
            return (J) f38324h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC5061g.a(obj, obj2);
            return new J(null, objArr, 1);
        }
        AbstractC6769h.k(i10, objArr.length >> 1);
        Object objE = E(objArr, i10, r.y(i10), 0);
        if (objE instanceof Object[]) {
            Object[] objArr2 = (Object[]) objE;
            AbstractC5070p.a.C1212a c1212a = (AbstractC5070p.a.C1212a) objArr2[2];
            if (aVar == null) {
                throw c1212a.a();
            }
            aVar.f38403e = c1212a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objE = obj3;
            i10 = iIntValue;
        }
        return new J(objE, objArr, i10);
    }

    private static Object E(Object[] objArr, int i10, int i11, int i12) {
        AbstractC5070p.a.C1212a c1212a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC5061g.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC5061g.a(obj3, obj4);
                int iB = AbstractC5067m.b(obj3.hashCode());
                while (true) {
                    int i19 = iB & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else {
                        if (obj3.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj5 = objArr[i21];
                            Objects.requireNonNull(obj5);
                            c1212a = new AbstractC5070p.a.C1212a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        iB = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c1212a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC5061g.a(obj6, obj7);
                int iB2 = AbstractC5067m.b(obj6.hashCode());
                while (true) {
                    int i26 = iB2 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(objArr[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = objArr[i28];
                            Objects.requireNonNull(obj8);
                            c1212a = new AbstractC5070p.a.C1212a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        iB2 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c1212a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC5061g.a(obj9, obj10);
            int iB3 = AbstractC5067m.b(obj9.hashCode());
            while (true) {
                int i33 = iB3 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                } else {
                    if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c1212a = new AbstractC5070p.a.C1212a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    iB3 = i33 + 1;
                    i14 = -1;
                }
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c1212a};
    }

    static Object J(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC5067m.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC5067m.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC5067m.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.AbstractC5070p, java.util.Map
    public Object get(Object obj) {
        Object objJ = J(this.f38325e, this.f38326f, this.f38327g, 0, obj);
        if (objJ == null) {
            return null;
        }
        return objJ;
    }

    @Override // com.google.common.collect.AbstractC5070p
    r h() {
        return new a(this, this.f38326f, 0, this.f38327g);
    }

    @Override // com.google.common.collect.AbstractC5070p
    r j() {
        return new b(this, new c(this.f38326f, 0, this.f38327g));
    }

    @Override // com.google.common.collect.AbstractC5070p
    AbstractC5068n l() {
        return new c(this.f38326f, 1, this.f38327g);
    }

    @Override // java.util.Map
    public int size() {
        return this.f38327g;
    }
}
