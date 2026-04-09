package com.google.android.gms.internal.ads;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class Mx extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f9930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1009cp f9931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mx(C1009cp c1009cp, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f9931f = c1009cp;
    }

    @Override // p5.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return ((Mx) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new Mx(this.f9931f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f9930e;
        R2.a.H(obj);
        if (i == 0) {
            this.f9930e = 1;
            Object objJ = this.f9931f.j(this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objJ == enumC2380a) {
                return enumC2380a;
            }
        }
        return C0412i.f5929a;
    }
}
