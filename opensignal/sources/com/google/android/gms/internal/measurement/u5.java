package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class u5 extends h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5217g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5(String str, int i10) {
        super(str);
        this.f5217g = i10;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n f(kg.r rVar, List list) {
        switch (this.f5217g) {
            case 0:
                return n.f5129f;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.f5129f;
        }
    }
}
