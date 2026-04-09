package ec;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: c, reason: collision with root package name */
    public static final a2 f22541c = new a2(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f22542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22543b;

    public a2(int i4) {
        EnumMap enumMap = new EnumMap(z1.class);
        this.f22542a = enumMap;
        z1 z1Var = z1.AD_STORAGE;
        x1 x1Var = x1.UNINITIALIZED;
        enumMap.put((EnumMap) z1Var, (z1) x1Var);
        enumMap.put((EnumMap) z1.ANALYTICS_STORAGE, (z1) x1Var);
        this.f22543b = i4;
    }

    public static String a(int i4) {
        return i4 != -30 ? i4 != -20 ? i4 != -10 ? i4 != 0 ? i4 != 30 ? i4 != 90 ? i4 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static a2 b(int i4, Bundle bundle) {
        if (bundle == null) {
            return new a2(i4);
        }
        EnumMap enumMap = new EnumMap(z1.class);
        for (z1 z1Var : y1.STORAGE.f23203a) {
            enumMap.put((EnumMap) z1Var, (z1) d(bundle.getString(z1Var.f23248a)));
        }
        return new a2(enumMap, i4);
    }

    public static a2 c(int i4, String str) {
        EnumMap enumMap = new EnumMap(z1.class);
        z1[] z1VarArr = y1.STORAGE.f23203a;
        for (int i10 = 0; i10 < z1VarArr.length; i10++) {
            String str2 = str == null ? "" : str;
            z1 z1Var = z1VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put((EnumMap) z1Var, (z1) e(str2.charAt(i11)));
            } else {
                enumMap.put((EnumMap) z1Var, (z1) x1.UNINITIALIZED);
            }
        }
        return new a2(enumMap, i4);
    }

    public static x1 d(String str) {
        x1 x1Var = x1.UNINITIALIZED;
        return str == null ? x1Var : str.equals("granted") ? x1.GRANTED : str.equals("denied") ? x1.DENIED : x1Var;
    }

    public static x1 e(char c9) {
        return c9 != '+' ? c9 != '0' ? c9 != '1' ? x1.UNINITIALIZED : x1.GRANTED : x1.DENIED : x1.POLICY;
    }

    public static char h(x1 x1Var) {
        if (x1Var == null) {
            return '-';
        }
        int iOrdinal = x1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i4, int i10) {
        int i11 = -30;
        if (i4 == -20) {
            if (i10 == -30) {
                return true;
            }
            i4 = -20;
        }
        if (i4 != -30) {
            i11 = i4;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i4 < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        for (z1 z1Var : y1.STORAGE.f23203a) {
            if (this.f22542a.get(z1Var) != a2Var.f22542a.get(z1Var)) {
                return false;
            }
        }
        return this.f22543b == a2Var.f22543b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            ec.y1 r1 = ec.y1.STORAGE
            ec.z1[] r1 = r1.f23203a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f22542a
            java.lang.Object r4 = r5.get(r4)
            ec.x1 r4 = (ec.x1) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a2.f():java.lang.String");
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (z1 z1Var : y1.STORAGE.f23203a) {
            sb2.append(h((x1) this.f22542a.get(z1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f22542a.values().iterator();
        int iHashCode = this.f22543b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((x1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(z1 z1Var) {
        return ((x1) this.f22542a.get(z1Var)) != x1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.a2 j(ec.a2 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ec.z1> r1 = ec.z1.class
            r0.<init>(r1)
            ec.y1 r1 = ec.y1.STORAGE
            ec.z1[] r1 = r1.f23203a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f22542a
            java.lang.Object r5 = r5.get(r4)
            ec.x1 r5 = (ec.x1) r5
            java.util.EnumMap r6 = r9.f22542a
            java.lang.Object r6 = r6.get(r4)
            ec.x1 r6 = (ec.x1) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            ec.x1 r7 = ec.x1.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            ec.x1 r7 = ec.x1.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            ec.x1 r7 = ec.x1.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            ec.x1 r5 = ec.x1.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            ec.a2 r9 = new ec.a2
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a2.j(ec.a2):ec.a2");
    }

    public final a2 k(a2 a2Var) {
        EnumMap enumMap = new EnumMap(z1.class);
        for (z1 z1Var : y1.STORAGE.f23203a) {
            x1 x1Var = (x1) this.f22542a.get(z1Var);
            if (x1Var == x1.UNINITIALIZED) {
                x1Var = (x1) a2Var.f22542a.get(z1Var);
            }
            if (x1Var != null) {
                enumMap.put((EnumMap) z1Var, (z1) x1Var);
            }
        }
        return new a2(enumMap, this.f22543b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f22543b));
        for (z1 z1Var : y1.STORAGE.f23203a) {
            sb2.append(",");
            sb2.append(z1Var.f23248a);
            sb2.append("=");
            x1 x1Var = (x1) this.f22542a.get(z1Var);
            if (x1Var == null) {
                x1Var = x1.UNINITIALIZED;
            }
            sb2.append(x1Var);
        }
        return sb2.toString();
    }

    public a2(EnumMap enumMap, int i4) {
        EnumMap enumMap2 = new EnumMap(z1.class);
        this.f22542a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f22543b = i4;
    }
}
