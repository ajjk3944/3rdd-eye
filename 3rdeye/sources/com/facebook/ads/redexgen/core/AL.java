package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.KotlinVersion;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AL<K, V> extends AbstractC3820mj<K, V> {
    public static String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final AbstractC3820mj<Object, Object> A04 = new AL(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;

    @CheckForNull
    public final transient Object A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> AL<K, V> A00(int n9, Object[] alternatingKeysAndValues, C3818mh<K, V> builder) {
        Object obj;
        if (n9 == 0) {
            return (AL) A04;
        }
        if (n9 == 1) {
            AbstractC3761ll.A03(Objects.requireNonNull(alternatingKeysAndValues[0]), Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new AL<>(null, alternatingKeysAndValues, 1);
        }
        AbstractC3614jA.A01(n9, alternatingKeysAndValues.length >> 1);
        Object objA02 = A02(alternatingKeysAndValues, n9, AbstractC2415Al.A03(n9), 0);
        if (objA02 instanceof Object[]) {
            Object[] objArr = (Object[]) objA02;
            C3817mg c3817mg = (C3817mg) objArr[2];
            if (builder == null) {
                throw c3817mg.A02();
            }
            builder.A01 = c3817mg;
            obj = objArr[0];
            n9 = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, n9 * 2);
        } else {
            obj = objA02;
        }
        return new AL<>(obj, alternatingKeysAndValues, n9);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    public AL(@CheckForNull Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }

    @CheckForNull
    public static Object A01(@CheckForNull Object hashTableObject, @CheckForNull Object[] alternatingKeysAndValues, int size, int keyOffset, Object key) {
        int keyIndex;
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (!Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return null;
            }
            Object obj = alternatingKeysAndValues[keyOffset ^ 1];
            if (A03[3].length() == 2) {
                String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return Objects.requireNonNull(obj);
            }
        } else {
            if (hashTableObject == null) {
                return null;
            }
            if (hashTableObject instanceof byte[]) {
                String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) hashTableObject;
                    int mask = bArr.length - 1;
                    int iA00 = AbstractC3805mU.A00(key.hashCode());
                    while (true) {
                        int i = iA00 & mask;
                        int i10 = bArr[i];
                        String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        keyIndex = i10 & KotlinVersion.MAX_COMPONENT_VALUE;
                        if (keyIndex == 255) {
                            return null;
                        }
                        boolean zEquals = key.equals(alternatingKeysAndValues[keyIndex]);
                        String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (zEquals) {
                                break;
                            }
                            iA00 = i + 1;
                        }
                    }
                    Object obj2 = alternatingKeysAndValues[keyIndex ^ 1];
                    if (A03[1].length() != 20) {
                        return obj2;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj2;
                }
            } else if (hashTableObject instanceof short[]) {
                short[] sArr = (short[]) hashTableObject;
                int mask2 = sArr.length - 1;
                int iA002 = AbstractC3805mU.A00(key.hashCode());
                while (true) {
                    int i11 = iA002 & mask2;
                    int h10 = sArr[i11] & 65535;
                    if (h10 == 65535) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h10])) {
                        return alternatingKeysAndValues[h10 ^ 1];
                    }
                    iA002 = i11 + 1;
                }
            } else {
                int[] iArr = (int[]) hashTableObject;
                int mask3 = iArr.length - 1;
                int iA003 = AbstractC3805mU.A00(key.hashCode());
                while (true) {
                    int i12 = iA003 & mask3;
                    int h11 = iArr[i12];
                    if (h11 == -1) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h11])) {
                        return alternatingKeysAndValues[h11 ^ 1];
                    }
                    iA003 = i12 + 1;
                }
            }
        }
        throw new RuntimeException();
    }

    @CheckForNull
    public static Object A02(Object[] alternatingKeysAndValues, int n9, int tableSize, int keyOffset) {
        if (n9 == 1) {
            AbstractC3761ll.A03(Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int h10 = tableSize - 1;
        C3817mg c3817mg = null;
        int i = -1;
        if (tableSize > 128) {
            if (tableSize <= 32768) {
                short[] hashTable = new short[tableSize];
                Arrays.fill(hashTable, (short) -1);
                int keyIndex = 0;
                for (int i10 = 0; i10 < n9; i10++) {
                    int i11 = (i10 * 2) + keyOffset;
                    int h11 = (keyIndex * 2) + keyOffset;
                    Object value = Objects.requireNonNull(alternatingKeysAndValues[i11]);
                    Object objRequireNonNull = Objects.requireNonNull(alternatingKeysAndValues[i11 ^ 1]);
                    AbstractC3761ll.A03(value, objRequireNonNull);
                    int iA00 = AbstractC3805mU.A00(value.hashCode());
                    while (true) {
                        int i12 = iA00 & h10;
                        int i13 = hashTable[i12] & 65535;
                        if (i13 == 65535) {
                            hashTable[i12] = (short) h11;
                            if (keyIndex < i10) {
                                alternatingKeysAndValues[h11] = value;
                                alternatingKeysAndValues[h11 ^ 1] = objRequireNonNull;
                            }
                            keyIndex++;
                        } else {
                            boolean zEquals = value.equals(alternatingKeysAndValues[i13]);
                            if (A03[5].charAt(16) != 'P') {
                                throw new RuntimeException();
                            }
                            A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                            if (zEquals) {
                                c3817mg = new C3817mg(value, objRequireNonNull, Objects.requireNonNull(alternatingKeysAndValues[i13 ^ 1]));
                                alternatingKeysAndValues[i13 ^ 1] = objRequireNonNull;
                                break;
                            }
                            iA00 = i12 + 1;
                        }
                    }
                }
                return keyIndex == n9 ? hashTable : new Object[]{hashTable, Integer.valueOf(keyIndex), c3817mg};
            }
            int[] hashTable2 = new int[tableSize];
            Arrays.fill(hashTable2, -1);
            int i14 = 0;
            int i15 = 0;
            while (i15 < n9) {
                int i16 = (i15 * 2) + keyOffset;
                int i17 = (i14 * 2) + keyOffset;
                Object objRequireNonNull2 = Objects.requireNonNull(alternatingKeysAndValues[i16]);
                Object objRequireNonNull3 = Objects.requireNonNull(alternatingKeysAndValues[i16 ^ 1]);
                AbstractC3761ll.A03(objRequireNonNull2, objRequireNonNull3);
                int outKeyIndex = AbstractC3805mU.A00(objRequireNonNull2.hashCode());
                while (true) {
                    int outKeyIndex2 = outKeyIndex & h10;
                    int i18 = hashTable2[outKeyIndex2];
                    if (i18 == i) {
                        hashTable2[outKeyIndex2] = i17;
                        if (i14 < i15) {
                            alternatingKeysAndValues[i17] = objRequireNonNull2;
                            alternatingKeysAndValues[i17 ^ 1] = objRequireNonNull3;
                        }
                        i14++;
                    } else {
                        if (objRequireNonNull2.equals(alternatingKeysAndValues[i18])) {
                            c3817mg = new C3817mg(objRequireNonNull2, objRequireNonNull3, Objects.requireNonNull(alternatingKeysAndValues[i18 ^ 1]));
                            alternatingKeysAndValues[i18 ^ 1] = objRequireNonNull3;
                            break;
                        }
                        outKeyIndex = outKeyIndex2 + 1;
                        i = -1;
                    }
                }
                i15++;
                i = -1;
            }
            return i14 == n9 ? hashTable2 : new Object[]{hashTable2, Integer.valueOf(i14), c3817mg};
        }
        byte[] bArr = new byte[tableSize];
        Arrays.fill(bArr, (byte) -1);
        int i19 = 0;
        for (int i20 = 0; i20 < n9; i20++) {
            int i21 = (i20 * 2) + keyOffset;
            int i22 = (i19 * 2) + keyOffset;
            Object objRequireNonNull4 = Objects.requireNonNull(alternatingKeysAndValues[i21]);
            Object objRequireNonNull5 = Objects.requireNonNull(alternatingKeysAndValues[i21 ^ 1]);
            AbstractC3761ll.A03(objRequireNonNull4, objRequireNonNull5);
            int keyIndex2 = AbstractC3805mU.A00(objRequireNonNull4.hashCode());
            while (true) {
                int keyIndex3 = keyIndex2 & h10;
                int previousKeyIndex = bArr[keyIndex3] & KotlinVersion.MAX_COMPONENT_VALUE;
                if (previousKeyIndex == 255) {
                    bArr[keyIndex3] = (byte) i22;
                    if (i19 < i20) {
                        alternatingKeysAndValues[i22] = objRequireNonNull4;
                        alternatingKeysAndValues[i22 ^ 1] = objRequireNonNull5;
                    }
                    i19++;
                } else {
                    if (objRequireNonNull4.equals(alternatingKeysAndValues[previousKeyIndex])) {
                        c3817mg = new C3817mg(objRequireNonNull4, objRequireNonNull5, Objects.requireNonNull(alternatingKeysAndValues[previousKeyIndex ^ 1]));
                        alternatingKeysAndValues[previousKeyIndex ^ 1] = objRequireNonNull5;
                        break;
                    }
                    keyIndex2 = keyIndex3 + 1;
                }
            }
        }
        return i19 == n9 ? bArr : new Object[]{bArr, Integer.valueOf(i19), c3817mg};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3820mj
    public final AbstractC3811ma<V> A0A() {
        return new C1X(this.A00, 1, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3820mj
    public final AbstractC2415Al<Map.Entry<K, V>> A0D() {
        return new C1Z(this, this.A00, 0, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<K> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3820mj
    public final AbstractC2415Al<K> A0E() {
        final C1X c1x = new C1X(this.A00, 0, this.A01);
        return new AbstractC2415Al<K>(this, c1x) { // from class: com.facebook.ads.redexgen.X.1Y
            public final transient AbstractC2416Am<K> A00;
            public final transient AbstractC3820mj<K, ?> A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mj != com.google.common.collect.ImmutableMap<K, ?> */
            {
                this.A01 = this;
                this.A00 = c1x;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC3811ma
            public final int A0I(Object[] dst, int offset) {
                return A0J().A0I(dst, offset);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2415Al, com.facebook.ads.redexgen.core.AbstractC3811ma
            public final AbstractC2416Am<K> A0J() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC3811ma
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: A0N */
            public final AbstractC3983pg<K> iterator() {
                return A0J().iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC3811ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object object) {
                return this.A01.get(object) != null;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1Y != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3820mj
    public final boolean A0F() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3820mj, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v10 = (V) A01(this.A02, this.A00, this.A01, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AL != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}
