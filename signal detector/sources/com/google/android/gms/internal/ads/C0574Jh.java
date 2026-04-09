package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574Jh implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9333a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f9334b;

    public /* synthetic */ C0574Jh(C1431kf c1431kf, C1799rN c1799rN, int i) {
        this.f9333a = i;
        this.f9334b = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        int i = this.f9333a;
        int i3 = 1;
        InterfaceC2069wN interfaceC2069wN = this.f9334b;
        switch (i) {
            case 0:
                C2141xo c2141xo = (C2141xo) interfaceC2069wN.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                Set setSingleton = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8710a2)).booleanValue() ? Collections.singleton(new C1922tl(c2141xo, c0623Mf)) : Collections.EMPTY_SET;
                Cr.v(setSingleton);
                break;
            case 3:
                CallableC1493ln callableC1493ln = (CallableC1493ln) interfaceC2069wN.c();
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                break;
            case 11:
                C1431kf c1431kfN = C1431kf.n(((C1434ki) interfaceC2069wN).f15232a.a());
                break;
            case 12:
                break;
            case 15:
                C1922tl c1922tl = new C1922tl((C1435kj) interfaceC2069wN.c(), AbstractC0640Nf.f10011g);
                int i6 = RB.f10866c;
                break;
            case 16:
                Set setSingleton2 = Collections.singleton(new C1922tl((C1435kj) interfaceC2069wN.c(), AbstractC0640Nf.f10011g));
                Cr.v(setSingleton2);
                break;
            case 19:
                Set setSingleton3 = Collections.singleton(new C1922tl((C1435kj) interfaceC2069wN.c(), AbstractC0640Nf.f10011g));
                Cr.v(setSingleton3);
                break;
            case 20:
                C1705pj c1705pj = (C1705pj) interfaceC2069wN.c();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                break;
            case 23:
                C0560Ik c0560Ik = (C0560Ik) interfaceC2069wN.c();
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                break;
            case 24:
                C0560Ik c0560Ik2 = (C0560Ik) interfaceC2069wN.c();
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                break;
        }
        return new C1922tl((C0508Fj) interfaceC2069wN.c(), AbstractC0640Nf.f10011g);
    }

    public /* synthetic */ C0574Jh(InterfaceC2069wN interfaceC2069wN, int i) {
        this.f9333a = i;
        this.f9334b = interfaceC2069wN;
    }
}
