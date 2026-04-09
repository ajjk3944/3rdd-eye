package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C4839e4;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4901m {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f36590a;

    C4901m() {
        this.f36590a = new EnumMap(C4839e4.a.class);
    }

    public static C4901m a(String str) {
        EnumMap enumMap = new EnumMap(C4839e4.a.class);
        if (str.length() >= C4839e4.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                C4839e4.a[] aVarArrValues = C4839e4.a.values();
                int length = aVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) aVarArrValues[i10], (C4839e4.a) EnumC4925p.zza(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C4901m(enumMap);
            }
        }
        return new C4901m();
    }

    public final EnumC4925p b(C4839e4.a aVar) {
        EnumC4925p enumC4925p = (EnumC4925p) this.f36590a.get(aVar);
        return enumC4925p == null ? EnumC4925p.UNSET : enumC4925p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.measurement.internal.C4839e4.a r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.p r0 = com.google.android.gms.measurement.internal.EnumC4925p.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.p r0 = com.google.android.gms.measurement.internal.EnumC4925p.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.p r0 = com.google.android.gms.measurement.internal.EnumC4925p.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.p r0 = com.google.android.gms.measurement.internal.EnumC4925p.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.p r0 = com.google.android.gms.measurement.internal.EnumC4925p.TCF
        L20:
            java.util.EnumMap r4 = r2.f36590a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4901m.c(com.google.android.gms.measurement.internal.e4$a, int):void");
    }

    public final void d(C4839e4.a aVar, EnumC4925p enumC4925p) {
        this.f36590a.put((EnumMap) aVar, (C4839e4.a) enumC4925p);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (C4839e4.a aVar : C4839e4.a.values()) {
            EnumC4925p enumC4925p = (EnumC4925p) this.f36590a.get(aVar);
            if (enumC4925p == null) {
                enumC4925p = EnumC4925p.UNSET;
            }
            sb2.append(enumC4925p.zzl);
        }
        return sb2.toString();
    }

    private C4901m(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C4839e4.a.class);
        this.f36590a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
