package zc;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f27052c = new o1(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f27053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27054b;

    public o1(int i10) {
        EnumMap enumMap = new EnumMap(n1.class);
        this.f27053a = enumMap;
        n1 n1Var = n1.AD_STORAGE;
        l1 l1Var = l1.UNINITIALIZED;
        enumMap.put((EnumMap) n1Var, (n1) l1Var);
        enumMap.put((EnumMap) n1.ANALYTICS_STORAGE, (n1) l1Var);
        this.f27054b = i10;
    }

    public static String a(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static o1 b(int i10, Bundle bundle) {
        if (bundle == null) {
            return new o1(i10);
        }
        EnumMap enumMap = new EnumMap(n1.class);
        for (n1 n1Var : m1.STORAGE.zzb()) {
            enumMap.put((EnumMap) n1Var, (n1) d(bundle.getString(n1Var.zze)));
        }
        return new o1(enumMap, i10);
    }

    public static o1 c(int i10, String str) {
        EnumMap enumMap = new EnumMap(n1.class);
        n1[] n1VarArrZza = m1.STORAGE.zza();
        for (int i11 = 0; i11 < n1VarArrZza.length; i11++) {
            String str2 = str == null ? "" : str;
            n1 n1Var = n1VarArrZza[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) n1Var, (n1) e(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) n1Var, (n1) l1.UNINITIALIZED);
            }
        }
        return new o1(enumMap, i10);
    }

    public static l1 d(String str) {
        return str == null ? l1.UNINITIALIZED : str.equals("granted") ? l1.GRANTED : str.equals("denied") ? l1.DENIED : l1.UNINITIALIZED;
    }

    public static l1 e(char c4) {
        return c4 != '+' ? c4 != '0' ? c4 != '1' ? l1.UNINITIALIZED : l1.GRANTED : l1.DENIED : l1.POLICY;
    }

    public static char h(l1 l1Var) {
        if (l1Var == null) {
            return '-';
        }
        int iOrdinal = l1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        for (n1 n1Var : m1.STORAGE.zzb()) {
            if (this.f27053a.get(n1Var) != o1Var.f27053a.get(n1Var)) {
                return false;
            }
        }
        return this.f27054b == o1Var.f27054b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
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
            zc.m1 r1 = zc.m1.STORAGE
            zc.n1[] r1 = r1.zza()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f27053a
            java.lang.Object r4 = r5.get(r4)
            zc.l1 r4 = (zc.l1) r4
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
        throw new UnsupportedOperationException("Method not decompiled: zc.o1.f():java.lang.String");
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (n1 n1Var : m1.STORAGE.zza()) {
            sb2.append(h((l1) this.f27053a.get(n1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f27053a.values().iterator();
        int iHashCode = this.f27054b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((l1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(n1 n1Var) {
        return ((l1) this.f27053a.get(n1Var)) != l1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.o1 j(zc.o1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<zc.n1> r1 = zc.n1.class
            r0.<init>(r1)
            zc.m1 r1 = zc.m1.STORAGE
            zc.n1[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f27053a
            java.lang.Object r5 = r5.get(r4)
            zc.l1 r5 = (zc.l1) r5
            java.util.EnumMap r6 = r9.f27053a
            java.lang.Object r6 = r6.get(r4)
            zc.l1 r6 = (zc.l1) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            zc.l1 r7 = zc.l1.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            zc.l1 r7 = zc.l1.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            zc.l1 r7 = zc.l1.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            zc.l1 r5 = zc.l1.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            zc.o1 r9 = new zc.o1
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.o1.j(zc.o1):zc.o1");
    }

    public final o1 k(o1 o1Var) {
        EnumMap enumMap = new EnumMap(n1.class);
        for (n1 n1Var : m1.STORAGE.zzb()) {
            l1 l1Var = (l1) this.f27053a.get(n1Var);
            if (l1Var == l1.UNINITIALIZED) {
                l1Var = (l1) o1Var.f27053a.get(n1Var);
            }
            if (l1Var != null) {
                enumMap.put((EnumMap) n1Var, (n1) l1Var);
            }
        }
        return new o1(enumMap, this.f27054b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f27054b));
        for (n1 n1Var : m1.STORAGE.zzb()) {
            sb2.append(",");
            sb2.append(n1Var.zze);
            sb2.append("=");
            l1 l1Var = (l1) this.f27053a.get(n1Var);
            if (l1Var == null) {
                l1Var = l1.UNINITIALIZED;
            }
            sb2.append(l1Var);
        }
        return sb2.toString();
    }

    public o1(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(n1.class);
        this.f27053a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f27054b = i10;
    }
}
