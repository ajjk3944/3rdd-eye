package com.google.android.gms.internal.ads;

import c5.C0412i;
import h5.InterfaceC2370d;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.sx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1880sx extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f16825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880sx(String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f16826f = str;
    }

    @Override // p5.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return ((C1880sx) j((InterfaceC2370d) obj2, (C1611nx) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C1880sx c1880sx = new C1880sx(this.f16826f, interfaceC2370d);
        c1880sx.f16825e = obj;
        return c1880sx;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        C1503lx c1503lx = (C1503lx) ((C1611nx) this.f16825e).s();
        q5.i.d(Collections.unmodifiableMap(((C1611nx) c1503lx.f13551b).B()), "getQueryIdToAdQualityDataMapMap(...)");
        String str = this.f16826f;
        q5.i.e(str, "key");
        c1503lx.b();
        ((C1611nx) c1503lx.f13551b).E().remove(str);
        return (C1611nx) c1503lx.d();
    }
}
