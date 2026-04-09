package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class l1 {
    public static k1 a(Object obj) {
        a0 a0Var = (a0) obj;
        k1 k1Var = a0Var.unknownFields;
        if (k1Var != k1.f1305f) {
            return k1Var;
        }
        k1 k1Var2 = new k1(0, new int[8], new Object[8], true);
        a0Var.unknownFields = k1Var2;
        return k1Var2;
    }

    public static boolean b(int i10, l lVar, Object obj) throws e0 {
        j jVar = (j) lVar.f1314d;
        int i11 = lVar.f1311a;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            lVar.C(0);
            ((k1) obj).c(i12 << 3, Long.valueOf(jVar.r()));
            return true;
        }
        if (i13 == 1) {
            lVar.C(1);
            ((k1) obj).c((i12 << 3) | 1, Long.valueOf(jVar.o()));
            return true;
        }
        if (i13 == 2) {
            ((k1) obj).c((i12 << 3) | 2, lVar.k());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw e0.b();
            }
            lVar.C(5);
            ((k1) obj).c(5 | (i12 << 3), Integer.valueOf(jVar.n()));
            return true;
        }
        k1 k1Var = new k1(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lVar.e() != Integer.MAX_VALUE && b(i16, lVar, k1Var)) {
        }
        if (i15 != lVar.f1311a) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
        if (k1Var.f1310e) {
            k1Var.f1310e = false;
        }
        ((k1) obj).c(i14 | 3, k1Var);
        return true;
    }
}
