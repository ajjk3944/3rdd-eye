package f1;

import b7.u;
import b7.w;
import bl.v;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Map;
import p.r;
import u0.l;
import u0.m1;
import u0.o2;
import u0.p;
import u0.q;
import x.e0;
import x.l0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final yb.i f23615e = new yb.i(new v(6), false, new w(9), 16);

    /* renamed from: a, reason: collision with root package name */
    public final Map f23616a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f23617b;

    /* renamed from: c, reason: collision with root package name */
    public g f23618c;

    /* renamed from: d, reason: collision with root package name */
    public final u f23619d;

    public e(Map map) {
        this.f23616a = map;
        long[] jArr = l0.f36914a;
        this.f23617b = new e0();
        this.f23619d = new u(6, this);
    }

    @Override // f1.c
    public final void e(Object obj, c1.h hVar, p pVar, int i4) {
        int i10;
        pVar.X(533563200);
        if ((i4 & 6) == 0) {
            i10 = (pVar.h(obj) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.h(hVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.h(this) ? 256 : 128;
        }
        if (pVar.O(i10 & 1, (i10 & 147) != 146)) {
            pVar.Y(obj);
            Object objL = pVar.L();
            Object obj2 = l.f34851a;
            if (objL == obj2) {
                u uVar = this.f23619d;
                if (!((Boolean) uVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f23616a.get(obj);
                o2 o2Var = i.f23623a;
                Object jVar = new j(new h(map, uVar));
                pVar.g0(jVar);
                objL = jVar;
            }
            j jVar2 = (j) objL;
            q.b(new r[]{i.f23623a.a(jVar2), b6.b.f1967a.a(jVar2)}, hVar, pVar, (i10 & AppLovinMediationAdapter.ERROR_CHILD_USER) | 8);
            boolean zH = pVar.h(this) | pVar.h(obj) | pVar.h(jVar2);
            Object objL2 = pVar.L();
            if (zH || objL2 == obj2) {
                objL2 = new d0.f(this, obj, jVar2);
                pVar.g0(objL2);
            }
            q.c(yj.u.f37649a, (mk.c) objL2, pVar);
            if (pVar.f34920y && pVar.G.f34735i == pVar.f34921z) {
                pVar.f34921z = -1;
                pVar.f34920y = false;
            }
            pVar.p(false);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new c1.e(this, obj, hVar, i4, 1);
        }
    }
}
