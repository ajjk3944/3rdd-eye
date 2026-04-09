package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4839e4 {

    /* renamed from: c, reason: collision with root package name */
    public static final C4839e4 f36433c = new C4839e4(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f36434a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36435b;

    /* renamed from: com.google.android.gms.measurement.internal.e4$a */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        a(String str) {
            this.zze = str;
        }
    }

    private C4839e4(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f36434a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f36435b = i10;
    }

    static char a(EnumC4866h4 enumC4866h4) {
        if (enumC4866h4 == null) {
            return '-';
        }
        int iOrdinal = enumC4866h4.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static C4839e4 c(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C4839e4(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : EnumC4857g4.STORAGE.zzd) {
            enumMap.put((EnumMap) aVar, (a) i(bundle.getString(aVar.zze)));
        }
        return new C4839e4(enumMap, i10);
    }

    public static C4839e4 e(EnumC4866h4 enumC4866h4, EnumC4866h4 enumC4866h42, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put((EnumMap) a.AD_STORAGE, (a) enumC4866h4);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) enumC4866h42);
        return new C4839e4(enumMap, -10);
    }

    public static C4839e4 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] aVarArrZza = EnumC4857g4.STORAGE.zza();
        for (int i11 = 0; i11 < aVarArrZza.length; i11++) {
            a aVar = aVarArrZza[i11];
            int i12 = i11 + 2;
            if (i12 < str.length()) {
                enumMap.put((EnumMap) aVar, (a) g(str.charAt(i12)));
            } else {
                enumMap.put((EnumMap) aVar, (a) EnumC4866h4.UNINITIALIZED);
            }
        }
        return new C4839e4(enumMap, i10);
    }

    static EnumC4866h4 g(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? EnumC4866h4.UNINITIALIZED : EnumC4866h4.GRANTED : EnumC4866h4.DENIED : EnumC4866h4.POLICY;
    }

    static EnumC4866h4 h(Boolean bool) {
        return bool == null ? EnumC4866h4.UNINITIALIZED : bool.booleanValue() ? EnumC4866h4.GRANTED : EnumC4866h4.DENIED;
    }

    static EnumC4866h4 i(String str) {
        return str == null ? EnumC4866h4.UNINITIALIZED : str.equals("granted") ? EnumC4866h4.GRANTED : str.equals("denied") ? EnumC4866h4.DENIED : EnumC4866h4.UNINITIALIZED;
    }

    static String j(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String k(Bundle bundle) {
        String string;
        a[] aVarArr = EnumC4857g4.STORAGE.zzd;
        int length = aVarArr.length;
        int i10 = 0;
        while (true) {
            Boolean bool = null;
            if (i10 >= length) {
                return null;
            }
            a aVar = aVarArr[i10];
            if (bundle.containsKey(aVar.zze) && (string = bundle.getString(aVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i10++;
        }
    }

    public static boolean l(int i10, int i11) {
        if (i10 == -20 && i11 == -30) {
            return true;
        }
        return (i10 == -30 && i11 == -20) || i10 == i11 || i10 < i11;
    }

    public static C4839e4 p(String str) {
        return f(str, 100);
    }

    static String q(EnumC4866h4 enumC4866h4) {
        int iOrdinal = enumC4866h4.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public final int b() {
        return this.f36435b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C4839e4 d(com.google.android.gms.measurement.internal.C4839e4 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.e4$a> r1 = com.google.android.gms.measurement.internal.C4839e4.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.g4 r1 = com.google.android.gms.measurement.internal.EnumC4857g4.STORAGE
            com.google.android.gms.measurement.internal.e4$a[] r1 = com.google.android.gms.measurement.internal.EnumC4857g4.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f36434a
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.h4 r5 = (com.google.android.gms.measurement.internal.EnumC4866h4) r5
            java.util.EnumMap r6 = r9.f36434a
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.h4 r6 = (com.google.android.gms.measurement.internal.EnumC4866h4) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            com.google.android.gms.measurement.internal.h4 r7 = com.google.android.gms.measurement.internal.EnumC4866h4.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            com.google.android.gms.measurement.internal.h4 r7 = com.google.android.gms.measurement.internal.EnumC4866h4.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            com.google.android.gms.measurement.internal.h4 r7 = com.google.android.gms.measurement.internal.EnumC4866h4.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            com.google.android.gms.measurement.internal.h4 r5 = com.google.android.gms.measurement.internal.EnumC4866h4.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.e4 r9 = new com.google.android.gms.measurement.internal.e4
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4839e4.d(com.google.android.gms.measurement.internal.e4):com.google.android.gms.measurement.internal.e4");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4839e4)) {
            return false;
        }
        C4839e4 c4839e4 = (C4839e4) obj;
        for (a aVar : EnumC4857g4.STORAGE.zzd) {
            if (this.f36434a.get(aVar) != c4839e4.f36434a.get(aVar)) {
                return false;
            }
        }
        return this.f36435b == c4839e4.f36435b;
    }

    public final int hashCode() {
        int iHashCode = this.f36435b * 17;
        Iterator it = this.f36434a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC4866h4) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean m(a aVar) {
        return ((EnumC4866h4) this.f36434a.get(aVar)) != EnumC4866h4.DENIED;
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f36434a.entrySet()) {
            String strQ = q((EnumC4866h4) entry.getValue());
            if (strQ != null) {
                bundle.putString(((a) entry.getKey()).zze, strQ);
            }
        }
        return bundle;
    }

    public final C4839e4 o(C4839e4 c4839e4) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : EnumC4857g4.STORAGE.zzd) {
            EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f36434a.get(aVar);
            if (enumC4866h4 == EnumC4866h4.UNINITIALIZED) {
                enumC4866h4 = (EnumC4866h4) c4839e4.f36434a.get(aVar);
            }
            if (enumC4866h4 != null) {
                enumMap.put((EnumMap) aVar, (a) enumC4866h4);
            }
        }
        return new C4839e4(enumMap, this.f36435b);
    }

    public final EnumC4866h4 r() {
        EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f36434a.get(a.AD_STORAGE);
        return enumC4866h4 == null ? EnumC4866h4.UNINITIALIZED : enumC4866h4;
    }

    public final boolean s(C4839e4 c4839e4) {
        for (a aVar : (a[]) this.f36434a.keySet().toArray(new a[0])) {
            EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f36434a.get(aVar);
            EnumC4866h4 enumC4866h42 = (EnumC4866h4) c4839e4.f36434a.get(aVar);
            EnumC4866h4 enumC4866h43 = EnumC4866h4.DENIED;
            if (enumC4866h4 == enumC4866h43 && enumC4866h42 != enumC4866h43) {
                return true;
            }
        }
        return false;
    }

    public final EnumC4866h4 t() {
        EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f36434a.get(a.ANALYTICS_STORAGE);
        return enumC4866h4 == null ? EnumC4866h4.UNINITIALIZED : enumC4866h4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(j(this.f36435b));
        for (a aVar : EnumC4857g4.STORAGE.zzd) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f36434a.get(aVar);
            if (enumC4866h4 == null) {
                enumC4866h4 = EnumC4866h4.UNINITIALIZED;
            }
            sb2.append(enumC4866h4);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.g4 r1 = com.google.android.gms.measurement.internal.EnumC4857g4.STORAGE
            com.google.android.gms.measurement.internal.e4$a[] r1 = r1.zza()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f36434a
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.h4 r4 = (com.google.android.gms.measurement.internal.EnumC4866h4) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4839e4.u():java.lang.String");
    }

    public final String v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : EnumC4857g4.STORAGE.zza()) {
            sb2.append(a((EnumC4866h4) this.f36434a.get(aVar)));
        }
        return sb2.toString();
    }

    public final boolean w() {
        return m(a.AD_STORAGE);
    }

    public final boolean x() {
        return m(a.ANALYTICS_STORAGE);
    }

    public final boolean y() {
        Iterator it = this.f36434a.values().iterator();
        while (it.hasNext()) {
            if (((EnumC4866h4) it.next()) != EnumC4866h4.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public C4839e4(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f36434a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) h(null));
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) h(null));
        this.f36435b = i10;
    }
}
