package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public class TB extends AbstractC1949uB implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient C1465lC f11356d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f11357e;

    /* renamed from: f, reason: collision with root package name */
    public transient SB f11358f;

    public TB(C1465lC c1465lC, int i) {
        this.f11356d = c1465lC;
        this.f11357e = i;
        Object[] objArr = C1519mC.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1895tB
    public final /* synthetic */ Collection a() {
        return new PB(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1895tB
    public final Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1895tB
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1895tB
    public /* synthetic */ Map d() {
        return this.f11356d;
    }
}
