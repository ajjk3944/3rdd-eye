package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class AL implements JL {

    /* renamed from: a, reason: collision with root package name */
    public final FK f6980a;

    /* renamed from: b, reason: collision with root package name */
    public final C1994v2 f6981b;

    public AL(C1994v2 c1994v2, FK fk) {
        ZJ zj = YK.f12633a;
        this.f6981b = c1994v2;
        this.f6980a = fk;
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final AbstractC1096eL a() {
        FK fk = this.f6980a;
        return fk instanceof AbstractC1096eL ? ((AbstractC1096eL) fk).p() : ((AbstractC0987cL) ((AbstractC1096eL) fk).w(5, null)).c();
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final void b(Object obj, Object obj2) {
        KL.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final boolean c(AbstractC1096eL abstractC1096eL, AbstractC1096eL abstractC1096eL2) {
        return abstractC1096eL.zzt.equals(abstractC1096eL2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final boolean d(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final void e(Object obj) {
        this.f6981b.getClass();
        RL rl = ((AbstractC1096eL) obj).zzt;
        if (rl.f10903e) {
            rl.f10903e = false;
        }
        ZJ zj = YK.f12633a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final void f(Object obj, C1014cu c1014cu) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final int g(AbstractC1096eL abstractC1096eL) {
        RL rl = abstractC1096eL.zzt;
        int i = rl.f10902d;
        if (i != -1) {
            return i;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < rl.f10899a; i6++) {
            int i7 = rl.f10900b[i6] >>> 3;
            QK qk = (QK) rl.f10901c[i6];
            int iJ = VK.J(8);
            int iJ2 = VK.J(i7) + VK.J(16);
            int iJ3 = VK.J(24);
            int iF = qk.f();
            i3 += iJ + iJ + iJ2 + AbstractC1135f5.i(iF, iF, iJ3);
        }
        rl.f10902d = i3;
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final void h(Object obj, C1506m c1506m, XK xk) {
        this.f6981b.getClass();
        C1994v2.C(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final int i(AbstractC1096eL abstractC1096eL) {
        return abstractC1096eL.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final void j(Object obj, byte[] bArr, int i, int i3, KK kk) {
        AbstractC1096eL abstractC1096eL = (AbstractC1096eL) obj;
        if (abstractC1096eL.zzt == RL.f10898f) {
            abstractC1096eL.zzt = RL.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }
}
