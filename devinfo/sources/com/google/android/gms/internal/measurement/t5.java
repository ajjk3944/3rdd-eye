package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t5 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(String str, int i4) {
        super(str);
        this.f19937c = i4;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(a0.x0 x0Var, List list) {
        switch (this.f19937c) {
            case 0:
                return n.J8;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.J8;
        }
    }
}
