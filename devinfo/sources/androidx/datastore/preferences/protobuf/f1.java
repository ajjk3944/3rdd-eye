package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f1 {
    public static e1 a(Object obj) {
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        if (e1Var != e1.f963f) {
            return e1Var;
        }
        e1 e1Var2 = new e1(0, new int[8], new Object[8], true);
        wVar.unknownFields = e1Var2;
        return e1Var2;
    }

    public static boolean b(int i4, k kVar, Object obj) throws a0 {
        int i10 = kVar.f1000a;
        j jVar = (j) kVar.f1003d;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            kVar.F(0);
            ((e1) obj).c(i11 << 3, Long.valueOf(jVar.s()));
            return true;
        }
        if (i12 == 1) {
            kVar.F(1);
            ((e1) obj).c((i11 << 3) | 1, Long.valueOf(jVar.p()));
            return true;
        }
        if (i12 == 2) {
            ((e1) obj).c((i11 << 3) | 2, kVar.n());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw a0.b();
            }
            kVar.F(5);
            ((e1) obj).c(5 | (i11 << 3), Integer.valueOf(jVar.o()));
            return true;
        }
        e1 e1Var = new e1(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i4 + 1;
        if (i15 >= 100) {
            throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.e() != Integer.MAX_VALUE && b(i15, kVar, e1Var)) {
        }
        if (i14 != kVar.f1000a) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
        if (e1Var.f968e) {
            e1Var.f968e = false;
        }
        ((e1) obj).c(i13 | 3, e1Var);
        return true;
    }
}
