package c1;

import android.net.ConnectivityManager;
import androidx.lifecycle.f1;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.internal.ads.se;
import d0.e2;
import i2.d1;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import nk.s;
import t6.g0;
import t6.v;
import u0.a2;
import u0.d0;
import u0.t0;
import v0.k0;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2546d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i4) {
        this.f2543a = i4;
        this.f2544b = obj;
        this.f2545c = obj2;
        this.f2546d = obj3;
    }

    @Override // mk.a
    public final Object invoke() {
        int i4;
        u uVar;
        switch (this.f2543a) {
            case 0:
                c cVar = (c) this.f2544b;
                f1 f1Var = (f1) this.f2545c;
                s sVar = (s) this.f2546d;
                cVar.a();
                a aVar = (a) f1Var.f1136d;
                int i10 = sVar.f29984a;
                do {
                    i4 = aVar.get();
                } while (!aVar.compareAndSet(i4, ((i4 >>> 27) & 15) == i10 ? i4 - 1 : i4));
                return u.f37649a;
            case 1:
                c7.s sVar2 = (c7.s) this.f2544b;
                UUID uuid = (UUID) this.f2545c;
                t6.h hVar = (t6.h) this.f2546d;
                sVar2.getClass();
                String string = uuid.toString();
                v vVarE = v.e();
                String str = c7.s.f2807c;
                vVarE.a(str, "Updating progress for " + uuid + " (" + hVar + ")");
                WorkDatabase workDatabase = sVar2.f2808a;
                workDatabase.b();
                try {
                    b7.r rVarD = workDatabase.w().d(string);
                    if (rVarD == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (rVarD.f2031b == g0.f34350b) {
                        b7.o oVar = new b7.o(string, hVar);
                        b7.p pVarV = workDatabase.v();
                        pVarV.getClass();
                        com.bumptech.glide.f.r(pVarV.f2012a, false, true, new b7.b(3, pVarV, oVar));
                    } else {
                        v.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.p();
                    workDatabase.l();
                    return null;
                } catch (Throwable th2) {
                    try {
                        v.e().d(str, "Error updating Worker progress", th2);
                        throw th2;
                    } catch (Throwable th3) {
                        workDatabase.l();
                        throw th3;
                    }
                }
            case 2:
                d0.i iVar = (d0.i) this.f2544b;
                e2 e2Var = (e2) this.f2545c;
                d0.c cVar2 = (d0.c) this.f2546d;
                o7.c cVar3 = iVar.f21750s;
                while (true) {
                    w0.e eVar = (w0.e) cVar3.f30419b;
                    int i11 = eVar.f36399c;
                    uVar = u.f37649a;
                    if (i11 != 0) {
                        if (i11 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        o1.c cVar4 = (o1.c) ((d0.e) eVar.f36397a[i11 - 1]).f21703a.invoke();
                        if (cVar4 == null ? true : d0.i.q0(iVar, cVar4, 0L, 0L, 3)) {
                            w0.e eVar2 = (w0.e) cVar3.f30419b;
                            ((d0.e) eVar2.l(eVar2.f36399c - 1)).f21704b.resumeWith(uVar);
                        }
                    }
                }
                if (iVar.f21751t) {
                    o1.c cVar5 = (o1.c) iVar.f21749r.invoke();
                    if (cVar5 != null && d0.i.q0(iVar, cVar5, 0L, 0L, 3)) {
                        iVar.f21751t = false;
                    }
                }
                e2Var.f21716e = d0.i.p0(iVar, cVar2, 0L);
                return uVar;
            case 3:
                d0 d0Var = (d0) this.f2544b;
                i0.u uVar2 = (i0.u) this.f2545c;
                i0.c cVar6 = (i0.c) this.f2546d;
                i0.g gVar = (i0.g) d0Var.getValue();
                return new i0.j(uVar2, gVar, cVar6, new a0((sk.d) ((j0.g0) uVar2.f25512e.f2687e).getValue(), gVar));
            case 4:
                k0.c cVar7 = (k0.c) this.f2544b;
                o1.c cVarP0 = k0.c.p0(cVar7, (d1) this.f2545c, (c2.c) this.f2546d);
                if (cVarP0 == null) {
                    return null;
                }
                d0.i iVar2 = cVar7.f27779o;
                if (d3.k.a(iVar2.f21752u, 0L)) {
                    f0.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarP0.f(iVar2.s0(cVarP0, iVar2.f21752u, 0L) ^ (-9223372034707292160L));
            case 5:
                u0.p pVar = (u0.p) this.f2544b;
                v0.a aVar2 = (v0.a) this.f2545c;
                a2 a2Var = (a2) this.f2546d;
                v0.b bVar = pVar.M;
                v0.a aVar3 = bVar.f35556b;
                try {
                    bVar.f35556b = aVar2;
                    a2 a2Var2 = pVar.G;
                    int[] iArr = pVar.f34910o;
                    x.u uVar3 = pVar.f34917v;
                    pVar.f34910o = null;
                    pVar.f34917v = null;
                    try {
                        pVar.G = a2Var;
                        boolean z3 = bVar.f35559e;
                        try {
                            bVar.f35559e = false;
                            throw null;
                        } catch (Throwable th4) {
                            bVar.f35559e = z3;
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        pVar.G = a2Var2;
                        pVar.f34910o = iArr;
                        pVar.f34917v = uVar3;
                        throw th5;
                    }
                } catch (Throwable th6) {
                    bVar.f35556b = aVar3;
                    throw th6;
                }
            case 6:
                u0.a aVar4 = (u0.a) this.f2544b;
                u0.e2 e2Var2 = (u0.e2) this.f2545c;
                k0 k0Var = (k0) this.f2546d;
                if (aVar4 != null) {
                    e2Var2.a(e2Var2.c(aVar4) - e2Var2.f34796t);
                }
                List listE = com.bumptech.glide.f.e(e2Var2, null, e2Var2.f34796t, null);
                h1.b bVar2 = (h1.b) zj.n.i0(listE);
                Integer num = bVar2 != null ? bVar2.f24802b : null;
                List listA = k0Var.a(num);
                if (num != null && !listA.isEmpty()) {
                    listA = zj.n.j0(cm.g.s(new h1.b(((h1.b) zj.n.c0(listA)).f24801a, null, num)), zj.n.a0(listA));
                }
                return new h1.a(zj.n.j0(listE, listA));
            case 7:
                rl.e eVar3 = (rl.e) this.f2544b;
                rl.l lVar = (rl.l) this.f2545c;
                rl.a aVar5 = (rl.a) this.f2546d;
                a.a aVar6 = eVar3.f33057b;
                nk.k.b(aVar6);
                return aVar6.b(lVar.a(), aVar5.f33026h.f33116d);
            default:
                nk.q qVar = (nk.q) this.f2544b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f2545c;
                se seVar = (se) this.f2546d;
                if (qVar.f29982a) {
                    v.e().a(x6.i.f36992a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(seVar);
                }
                return u.f37649a;
        }
    }

    public /* synthetic */ b(u0.p pVar, v0.a aVar, a2 a2Var, t0 t0Var) {
        this.f2543a = 5;
        this.f2544b = pVar;
        this.f2545c = aVar;
        this.f2546d = a2Var;
    }
}
