package com.google.android.gms.internal.measurement;

import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4400l5 implements InterfaceC4495x5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4366h5 f35389a;

    /* renamed from: b, reason: collision with root package name */
    private final L5 f35390b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35391c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4446r4 f35392d;

    private C4400l5(L5 l52, AbstractC4446r4 abstractC4446r4, InterfaceC4366h5 interfaceC4366h5) {
        this.f35390b = l52;
        this.f35391c = abstractC4446r4.d(interfaceC4366h5);
        this.f35392d = abstractC4446r4;
        this.f35389a = interfaceC4366h5;
    }

    static C4400l5 g(L5 l52, AbstractC4446r4 abstractC4446r4, InterfaceC4366h5 interfaceC4366h5) {
        return new C4400l5(l52, abstractC4446r4, interfaceC4366h5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final boolean a(Object obj) {
        return this.f35392d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final void b(Object obj) {
        this.f35390b.l(obj);
        this.f35392d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final void c(Object obj, Object obj2) {
        AbstractC4511z5.n(this.f35390b, obj, obj2);
        if (this.f35391c) {
            AbstractC4511z5.l(this.f35392d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final void d(Object obj, InterfaceC4331d6 interfaceC4331d6) {
        Iterator itL = this.f35392d.b(obj).l();
        if (itL.hasNext()) {
            AbstractC5487d.a(((Map.Entry) itL.next()).getKey());
            throw null;
        }
        L5 l52 = this.f35390b;
        l52.d(l52.k(obj), interfaceC4331d6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final void e(Object obj, byte[] bArr, int i10, int i11, U3 u32) {
        D4 d42 = (D4) obj;
        if (d42.zzb == K5.k()) {
            d42.zzb = K5.l();
        }
        AbstractC5487d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final boolean f(Object obj, Object obj2) {
        if (!this.f35390b.k(obj).equals(this.f35390b.k(obj2))) {
            return false;
        }
        if (this.f35391c) {
            return this.f35392d.b(obj).equals(this.f35392d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final int zza(Object obj) {
        L5 l52 = this.f35390b;
        int iE = l52.e(l52.k(obj));
        return this.f35391c ? iE + this.f35392d.b(obj).a() : iE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final int zzb(Object obj) {
        int iHashCode = this.f35390b.k(obj).hashCode();
        return this.f35391c ? (iHashCode * 53) + this.f35392d.b(obj).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final Object zza() {
        InterfaceC4366h5 interfaceC4366h5 = this.f35389a;
        if (interfaceC4366h5 instanceof D4) {
            return ((D4) interfaceC4366h5).w();
        }
        return interfaceC4366h5.e().C();
    }
}
