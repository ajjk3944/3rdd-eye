package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class h0 {
    h0() {
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC5081h abstractC5081h);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final void l(Object obj, b0 b0Var) {
        while (b0Var.w() != Integer.MAX_VALUE && m(obj, b0Var)) {
        }
    }

    final boolean m(Object obj, b0 b0Var) throws InvalidProtocolBufferException {
        int iA = b0Var.a();
        int iA2 = n0.a(iA);
        int iB = n0.b(iA);
        if (iB == 0) {
            e(obj, iA2, b0Var.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA2, b0Var.d());
            return true;
        }
        if (iB == 2) {
            d(obj, iA2, b0Var.z());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.h();
            }
            a(obj, iA2, b0Var.h());
            return true;
        }
        Object objN = n();
        int iC = n0.c(iA2, 4);
        l(objN, b0Var);
        if (iC != b0Var.a()) {
            throw InvalidProtocolBufferException.c();
        }
        c(obj, iA2, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(b0 b0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, o0 o0Var);

    abstract void t(Object obj, o0 o0Var);
}
