package com.squareup.picasso;

import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class h0 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final f f5904a;

    public h0(f fVar) {
        super(fVar, null);
        this.f5904a = fVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = this.f5904a;
        d0 d0Var = fVar.N;
        f fVar2 = ((h0) obj).f5904a;
        d0 d0Var2 = fVar2.N;
        return d0Var == d0Var2 ? fVar.f5882a - fVar2.f5882a : d0Var2.ordinal() - d0Var.ordinal();
    }
}
