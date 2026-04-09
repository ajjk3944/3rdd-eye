package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s2 extends f2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f15840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.d f15841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(androidx.recyclerview.widget.d dVar, m2 m2Var, m2 m2Var2) {
        super(m2Var);
        this.f15840b = m2Var2;
        this.f15841c = dVar;
    }

    @Override // com.google.android.gms.internal.ads.f2, com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        l2 l2VarG = this.f15840b.g(j);
        n2 n2Var = l2VarG.f13331a;
        long j8 = n2Var.f14130a;
        long j9 = n2Var.f14131b;
        long j10 = this.f15841c.f1323b;
        n2 n2Var2 = new n2(j8, j9 + j10);
        n2 n2Var3 = l2VarG.f13332b;
        return new l2(n2Var2, new n2(n2Var3.f14130a, n2Var3.f14131b + j10));
    }
}
