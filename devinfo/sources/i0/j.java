package i0;

import c2.d0;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.common.api.internal.a0;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u f25426a;

    /* renamed from: b, reason: collision with root package name */
    public final g f25427b;

    /* renamed from: c, reason: collision with root package name */
    public final c f25428c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f25429d;

    public j(u uVar, g gVar, c cVar, a0 a0Var) {
        this.f25426a = uVar;
        this.f25427b = gVar;
        this.f25428c = cVar;
        this.f25429d = a0Var;
    }

    public final void a(final int i4, Object obj, u0.p pVar, int i10) {
        int i11;
        Object obj2;
        u0.p pVar2;
        pVar.X(-462424778);
        int i12 = (pVar.d(i4) ? 4 : 2) | i10 | (pVar.h(obj) ? 32 : 16) | (pVar.f(this) ? 256 : 128);
        if (pVar.O(i12 & 1, (i12 & 147) != 146)) {
            i11 = i4;
            obj2 = obj;
            pVar2 = pVar;
            j0.m.b(obj2, i11, this.f25426a.f25523r, c1.n.c(-824725566, new mk.e() { // from class: i0.h
                @Override // mk.e
                public final Object invoke(Object obj3, Object obj4) {
                    u0.p pVar3 = (u0.p) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (pVar3.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j jVar = this.f25420a;
                        a0 a0Var = jVar.f25427b.f25419a;
                        int i13 = i4;
                        j0.h hVarD = a0Var.d(i13);
                        ((c1.h) hVarD.f26901c.f25418d).b(jVar.f25428c, Integer.valueOf(i13 - hVarD.f26899a), pVar3, 0);
                    } else {
                        pVar3.R();
                    }
                    return yj.u.f37649a;
                }
            }, pVar), pVar2, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & AppLovinMediationAdapter.ERROR_CHILD_USER));
        } else {
            i11 = i4;
            obj2 = obj;
            pVar2 = pVar;
            pVar2.R();
        }
        m1 m1VarR = pVar2.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new i(this, i11, obj2, i10);
        }
    }

    public final Object b(int i4) {
        g gVar = this.f25427b;
        gVar.getClass();
        j0.h hVarD = gVar.f25419a.d(i4);
        ((d0) hVarD.f26901c.f25417c).invoke(Integer.valueOf(i4 - hVarD.f26899a));
        return null;
    }

    public final int c() {
        g gVar = this.f25427b;
        gVar.getClass();
        return gVar.f25419a.f9069b;
    }

    public final Object d(int i4) {
        a0 a0Var = this.f25429d;
        Object[] objArr = (Object[]) a0Var.f9071d;
        int i10 = i4 - a0Var.f9069b;
        Object obj = (i10 < 0 || i10 >= objArr.length) ? null : objArr[i10];
        if (obj != null) {
            return obj;
        }
        g gVar = this.f25427b;
        gVar.getClass();
        j0.h hVarD = gVar.f25419a.d(i4);
        Object objInvoke = ((g1.a) hVarD.f26901c.f25416b).invoke(Integer.valueOf(i4 - hVarD.f26899a));
        return objInvoke == null ? new j0.f(i4) : objInvoke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return nk.k.a(this.f25427b, ((j) obj).f25427b);
    }

    public final int hashCode() {
        return this.f25427b.hashCode();
    }
}
