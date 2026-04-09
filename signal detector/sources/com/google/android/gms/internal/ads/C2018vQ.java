package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2018vQ implements InterfaceC1020d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1020d f17272a;

    /* renamed from: b, reason: collision with root package name */
    public final C2108x8 f17273b;

    public C2018vQ(InterfaceC1020d interfaceC1020d, C2108x8 c2108x8) {
        this.f17272a = interfaceC1020d;
        this.f17273b = c2108x8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final C2108x8 a() {
        return this.f17273b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int b() {
        return this.f17272a.b();
    }

    public final boolean c(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2018vQ) {
            return this.f17272a.equals(((C2018vQ) obj).f17272a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (c(obj) && (obj instanceof C2018vQ)) {
            return this.f17273b.equals(((C2018vQ) obj).f17273b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final TP f() {
        return this.f17273b.f17549d[this.f17272a.g()];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int g() {
        return this.f17272a.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final TP h(int i) {
        return this.f17273b.f17549d[this.f17272a.t(i)];
    }

    public final int hashCode() {
        return this.f17273b.hashCode() + (this.f17272a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int o0(int i) {
        return this.f17272a.o0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int t(int i) {
        return this.f17272a.t(i);
    }
}
