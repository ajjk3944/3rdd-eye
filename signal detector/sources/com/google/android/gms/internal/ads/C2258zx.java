package com.google.android.gms.internal.ads;

import c5.C0412i;
import h5.InterfaceC2370d;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.zx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2258zx extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f17994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1449kx f17995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2258zx(C1449kx c1449kx, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f17995f = c1449kx;
    }

    @Override // p5.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return ((C2258zx) j((InterfaceC2370d) obj2, (C1611nx) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C2258zx c2258zx = new C2258zx(this.f17995f, interfaceC2370d);
        c2258zx.f17994e = obj;
        return c2258zx;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        C1503lx c1503lx = (C1503lx) ((C1611nx) this.f17994e).s();
        q5.i.d(Collections.unmodifiableMap(((C1611nx) c1503lx.f13551b).B()), "getQueryIdToAdQualityDataMapMap(...)");
        C1449kx c1449kx = this.f17995f;
        String strD = c1449kx.D();
        q5.i.d(strD, "getGwsQueryId(...)");
        c1503lx.b();
        ((C1611nx) c1503lx.f13551b).E().put(strD, c1449kx);
        return (C1611nx) c1503lx.d();
    }
}
