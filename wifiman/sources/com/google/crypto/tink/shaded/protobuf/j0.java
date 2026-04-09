package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
class j0 extends h0 {
    j0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public i0 g(Object obj) {
        return ((AbstractC5095w) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(i0 i0Var) {
        return i0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(i0 i0Var) {
        return i0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public i0 k(i0 i0Var, i0 i0Var2) {
        return i0.c().equals(i0Var2) ? i0Var : i0.c().equals(i0Var) ? i0.j(i0Var, i0Var2) : i0Var.i(i0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public i0 n() {
        return i0.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, i0 i0Var) {
        p(obj, i0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, i0 i0Var) {
        ((AbstractC5095w) obj).unknownFields = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public i0 r(i0 i0Var) {
        i0Var.h();
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(i0 i0Var, o0 o0Var) {
        i0Var.p(o0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(i0 i0Var, o0 o0Var) {
        i0Var.r(o0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    boolean q(b0 b0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(i0 i0Var, int i10, int i11) {
        i0Var.n(n0.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(i0 i0Var, int i10, long j10) {
        i0Var.n(n0.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(i0 i0Var, int i10, i0 i0Var2) {
        i0Var.n(n0.c(i10, 3), i0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(i0 i0Var, int i10, AbstractC5081h abstractC5081h) {
        i0Var.n(n0.c(i10, 2), abstractC5081h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(i0 i0Var, int i10, long j10) {
        i0Var.n(n0.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.h0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public i0 f(Object obj) {
        i0 i0VarG = g(obj);
        if (i0VarG != i0.c()) {
            return i0VarG;
        }
        i0 i0VarK = i0.k();
        p(obj, i0VarK);
        return i0VarK;
    }
}
