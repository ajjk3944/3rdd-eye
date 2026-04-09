package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public static final ImmutableMap f11939h = new RegularImmutableMap(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object f11940e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f11941f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f11942g;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public final transient ImmutableMap f11943c;

        /* renamed from: d, reason: collision with root package name */
        public final transient Object[] f11944d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f11945e;

        /* renamed from: f, reason: collision with root package name */
        public final transient int f11946f;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i10, int i11) {
            this.f11943c = immutableMap;
            this.f11944d = objArr;
            this.f11945e = i10;
            this.f11946f = i11;
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList D() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                /* renamed from: G, reason: merged with bridge method [inline-methods] */
                public Map.Entry get(int i10) {
                    com.google.common.base.g.k(i10, EntrySet.this.f11946f);
                    int i11 = i10 * 2;
                    Object obj = EntrySet.this.f11944d[EntrySet.this.f11945e + i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.f11944d[i11 + (EntrySet.this.f11945e ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean i() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.f11946f;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int b(Object[] objArr, int i10) {
            return v().b(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f11943c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: j */
        public v0 iterator() {
            return v().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11946f;
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: c, reason: collision with root package name */
        public final transient ImmutableMap f11947c;

        /* renamed from: d, reason: collision with root package name */
        public final transient ImmutableList f11948d;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.f11947c = immutableMap;
            this.f11948d = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int b(Object[] objArr, int i10) {
            return v().b(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11947c.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: j */
        public v0 iterator() {
            return v().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11947c.size();
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList v() {
            return this.f11948d;
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: c, reason: collision with root package name */
        public final transient Object[] f11949c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f11950d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f11951e;

        public KeysOrValuesAsList(Object[] objArr, int i10, int i11) {
            this.f11949c = objArr;
            this.f11950d = i10;
            this.f11951e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            com.google.common.base.g.k(i10, this.f11951e);
            Object obj = this.f11949c[(i10 * 2) + this.f11950d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11951e;
        }
    }

    public RegularImmutableMap(Object obj, Object[] objArr, int i10) {
        this.f11940e = obj;
        this.f11941f = objArr;
        this.f11942g = i10;
    }

    public static RegularImmutableMap q(int i10, Object[] objArr, ImmutableMap.a aVar) {
        if (i10 == 0) {
            return (RegularImmutableMap) f11939h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            j.a(obj, obj2);
            return new RegularImmutableMap(null, objArr, 1);
        }
        com.google.common.base.g.o(i10, objArr.length >> 1);
        Object objR = r(objArr, i10, ImmutableSet.x(i10), 0);
        if (objR instanceof Object[]) {
            Object[] objArr2 = (Object[]) objR;
            ImmutableMap.a.C0217a c0217a = (ImmutableMap.a.C0217a) objArr2[2];
            if (aVar == null) {
                throw c0217a.a();
            }
            aVar.f11798e = c0217a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objR = obj3;
            i10 = iIntValue;
        }
        return new RegularImmutableMap(objR, objArr, i10);
    }

    public static Object r(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        ImmutableMap.a.C0217a c0217a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            j.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                j.a(obj3, obj4);
                int iC = z.c(obj3.hashCode());
                while (true) {
                    int i20 = iC & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                    } else {
                        if (obj3.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj5 = objArr[i22];
                            Objects.requireNonNull(obj5);
                            c0217a = new ImmutableMap.a.C0217a(obj3, obj4, obj5);
                            objArr[i22] = obj4;
                            break;
                        }
                        iC = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0217a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                j.a(obj6, obj7);
                int iC2 = z.c(obj6.hashCode());
                while (true) {
                    int i27 = iC2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                    } else {
                        if (obj6.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj8 = objArr[i29];
                            Objects.requireNonNull(obj8);
                            c0217a = new ImmutableMap.a.C0217a(obj6, obj7, obj8);
                            objArr[i29] = obj7;
                            break;
                        }
                        iC2 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0217a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            j.a(obj9, obj10);
            int iC3 = z.c(obj9.hashCode());
            while (true) {
                int i34 = iC3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj9.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = objArr[i36];
                        Objects.requireNonNull(obj11);
                        c0217a = new ImmutableMap.a.C0217a(obj9, obj10, obj11);
                        objArr[i36] = obj10;
                        break;
                    }
                    iC3 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0217a;
        return objArr2;
    }

    public static Object s(Object[] objArr, int i10, int i11, int i12) {
        Object objR = r(objArr, i10, i11, i12);
        if (objR instanceof Object[]) {
            throw ((ImmutableMap.a.C0217a) ((Object[]) objR)[2]).a();
        }
        return objR;
    }

    public static Object t(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
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
            int iC = z.c(obj2.hashCode());
            while (true) {
                int i12 = iC & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iC = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iC2 = z.c(obj2.hashCode());
            while (true) {
                int i14 = iC2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iC2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iC3 = z.c(obj2.hashCode());
            while (true) {
                int i16 = iC3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iC3 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        Object objT = t(this.f11940e, this.f11941f, this.f11942g, 0, obj);
        if (objT == null) {
            return null;
        }
        return objT;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet h() {
        return new EntrySet(this, this.f11941f, 0, this.f11942g);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet i() {
        return new KeySet(this, new KeysOrValuesAsList(this.f11941f, 0, this.f11942g));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection j() {
        return new KeysOrValuesAsList(this.f11941f, 1, this.f11942g);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean m() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f11942g;
    }
}
