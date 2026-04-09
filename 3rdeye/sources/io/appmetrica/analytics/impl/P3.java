package io.appmetrica.analytics.impl;

import c9.C2077A;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class P3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T3 fromModel(O3 o32) {
        T3 t32 = new T3();
        t32.f40153a = a(o32.f39919a);
        int size = o32.f39920b.size();
        Q3[] q3Arr = new Q3[size];
        for (int i = 0; i < size; i++) {
            q3Arr[i] = a((N3) o32.f39920b.get(i));
        }
        t32.f40154b = q3Arr;
        return t32;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O3 toModel(T3 t32) {
        Q3 q32 = t32.f40153a;
        if (q32 == null) {
            q32 = new Q3();
        }
        N3 n3A = a(q32);
        Q3[] q3Arr = t32.f40154b;
        ArrayList arrayList = new ArrayList(q3Arr.length);
        for (Q3 q33 : q3Arr) {
            arrayList.add(a(q33));
        }
        return new O3(n3A, arrayList);
    }

    public static Q3 a(N3 n32) {
        S3 s32;
        Q3 q32 = new Q3();
        Map map = n32.f39888a;
        int i = 0;
        if (map != null) {
            s32 = new S3();
            int size = map.size();
            R3[] r3Arr = new R3[size];
            for (int i10 = 0; i10 < size; i10++) {
                r3Arr[i10] = new R3();
            }
            s32.f40086a = r3Arr;
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                R3 r32 = s32.f40086a[i11];
                r32.f40035a = str;
                r32.f40036b = str2;
                i11++;
            }
        } else {
            s32 = null;
        }
        q32.f40004a = s32;
        int iOrdinal = n32.f39889b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3) {
                        throw new b9.j();
                    }
                }
            } else {
                i = 1;
            }
        }
        q32.f40005b = i;
        return q32;
    }

    public static N3 a(Q3 q32) {
        LinkedHashMap linkedHashMap;
        EnumC4685i8 enumC4685i8;
        S3 s32 = q32.f40004a;
        if (s32 != null) {
            R3[] r3Arr = s32.f40086a;
            int iL = C2077A.l(r3Arr.length);
            if (iL < 16) {
                iL = 16;
            }
            linkedHashMap = new LinkedHashMap(iL);
            for (R3 r32 : r3Arr) {
                linkedHashMap.put(r32.f40035a, r32.f40036b);
            }
        } else {
            linkedHashMap = null;
        }
        int i = q32.f40005b;
        if (i == 0) {
            enumC4685i8 = EnumC4685i8.f41059b;
        } else if (i == 1) {
            enumC4685i8 = EnumC4685i8.f41060c;
        } else if (i == 2) {
            enumC4685i8 = EnumC4685i8.f41061d;
        } else if (i != 3) {
            enumC4685i8 = EnumC4685i8.f41059b;
        } else {
            enumC4685i8 = EnumC4685i8.f41062e;
        }
        return new N3(linkedHashMap, enumC4685i8);
    }
}
