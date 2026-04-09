package c2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import g2.i1;
import g2.j1;
import g2.k1;
import g2.l1;
import g2.r0;
import g2.s0;
import i2.d1;
import i2.y1;
import j2.f1;
import j2.g1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i4, Object obj) {
        super(1);
        this.f2644a = i4;
        this.f2645b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [g2.s0, i2.a] */
    @Override // mk.c
    public final Object invoke(Object obj) {
        int i4 = this.f2644a;
        int i10 = 3;
        y1 y1Var = y1.f25817b;
        y1 y1Var2 = y1.f25816a;
        ck.c cVar = null;
        yj.u uVar = yj.u.f37649a;
        Object obj2 = this.f2645b;
        switch (i4) {
            case 0:
                Throwable th2 = (Throwable) obj;
                k0 k0Var = (k0) obj2;
                xk.h hVar = k0Var.f2640c;
                if (hVar != null) {
                    hVar.i(th2);
                }
                k0Var.f2640c = null;
                return uVar;
            case 1:
                r0 r0Var = (r0) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    r0.j(r0Var, (s0) arrayList.get(i11));
                }
                return uVar;
            case 2:
                ((i2.e0) obj2).Z((d3.c) obj);
                return uVar;
            case 3:
                o1.c cVar2 = (o1.c) obj;
                g3.p pVar = (g3.p) obj2;
                if (pVar.f25565n) {
                    xk.x.v(pVar.b0(), null, null, new al.p(pVar, cVar2, cVar, 17), 3);
                }
                return uVar;
            case 4:
                ((vd.b) obj2).cancel(false);
                return uVar;
            case 5:
                i2.a aVar = (i2.a) obj;
                i2.f0 f0Var = (i2.f0) obj2;
                if (aVar.q() != Integer.MAX_VALUE) {
                    if (aVar.b().f25659b) {
                        aVar.B();
                    }
                    for (Map.Entry entry : aVar.b().g.entrySet()) {
                        i2.f0.a(f0Var, (g2.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.h());
                    }
                    d1 d1Var = aVar.h().f25612q;
                    nk.k.b(d1Var);
                    while (!d1Var.equals(f0Var.f25658a.h())) {
                        for (g2.a aVar2 : f0Var.b(d1Var).keySet()) {
                            i2.f0.a(f0Var, aVar2, f0Var.c(d1Var, aVar2), d1Var);
                        }
                        d1Var = d1Var.f25612q;
                        nk.k.b(d1Var);
                    }
                }
                return uVar;
            case 6:
                ((w0.e) obj2).b((i1.l) obj);
                return Boolean.TRUE;
            case 7:
                return Boolean.valueOf(((n1.s) obj).w0(((n1.c) obj2).f29514a));
            case 8:
                i2.j0 j0Var = (i2.j0) obj;
                j2.r rVar = ((j2.j) obj2).f27188p;
                if (rVar.getInsetsListener().g.g() > 0) {
                    x.u uVar2 = k1.f24368a;
                    j0Var.f25692a = true;
                    i2.m0 m0Var = j0Var.f25695d;
                    g2.v vVarE0 = m0Var.e0();
                    if (d3.i.a(j0Var.f25693b, 9223372034707292159L)) {
                        j0Var.f25693b = ii.a.D(vVarE0.u(0L));
                        j0Var.f25694c = vVarE0.m();
                    }
                    m0Var.g0().H.b();
                    long jM = vVarE0.m();
                    x.e0 e0Var = rVar.getInsetsListener().f24396f;
                    int i12 = (int) (jM >> 32);
                    int i13 = (int) (jM & 4294967295L);
                    for (i1 i1Var : k1.f24369b) {
                        Object objG = e0Var.g(i1Var);
                        nk.k.b(objG);
                        l1 l1Var = (l1) objG;
                        j1 j1Var = (j1) i1Var;
                        k1.a(j0Var, j1Var.f24365c, l1Var.f24376h, i12, i13);
                        if (((Boolean) l1Var.f24371b.getValue()).booleanValue()) {
                            k1.a(j0Var, l1Var.f24375f, l1Var.j, i12, i13);
                            k1.a(j0Var, l1Var.g, l1Var.f24378k, i12, i13);
                        }
                        k1.a(j0Var, j1Var.f24366d, l1Var.f24377i, i12, i13);
                    }
                    x.a0 a0Var = rVar.getInsetsListener().f24397h;
                    if (a0Var.i()) {
                        g1.q qVar = rVar.getInsetsListener().f24398i;
                        Object[] objArr = a0Var.f36846a;
                        int i14 = a0Var.f36847b;
                        for (int i15 = 0; i15 < i14; i15++) {
                            u0 u0Var = (u0) objArr[i15];
                            g2.o oVar = (g2.o) qVar.get(i15);
                            Rect rect = (Rect) u0Var.getValue();
                            j0Var.b(oVar.b(), rect.left);
                            j0Var.b(oVar.d(), rect.top);
                            j0Var.b(oVar.c(), rect.right);
                            j0Var.b(oVar.a(), rect.bottom);
                        }
                    }
                }
                return uVar;
            case 9:
                return Boolean.valueOf(((x.j) obj2).a(((p2.p) obj).g));
            case 10:
                return Boolean.valueOf(j2.d0.c((p2.p) obj, (Resources) obj2));
            case 11:
                return new j0.z(i10, (j2.d1) obj2);
            case 12:
                if (f1.f27141b.compareAndSet(false, true)) {
                    ((zk.h) obj2).l(uVar);
                }
                return uVar;
            case 13:
                r1.d dVar = (r1.d) obj;
                p1.q qVarX = dVar.M().x();
                mk.e eVar = ((g1) obj2).f27147d;
                if (eVar != null) {
                    eVar.invoke(qVarX, (s1.b) dVar.M().f25417c);
                }
                return uVar;
            case 14:
                l1.e eVar2 = (l1.e) obj;
                if (!eVar2.f25565n) {
                    return y1Var;
                }
                if (eVar2.f28543p != null) {
                    f2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                eVar2.f28543p = null;
                nk.q qVar2 = (nk.q) obj2;
                qVar2.f29982a = qVar2.f29982a;
                return y1Var2;
            case 15:
                l1.e eVar3 = (l1.e) obj;
                if (!eVar3.f25554a.f25565n) {
                    return y1Var;
                }
                l1.e eVar4 = eVar3.f28543p;
                if (eVar4 != null) {
                    l0 l0Var = new l0(15, (jf.c) obj2);
                    if (l0Var.invoke(eVar4) == y1Var2) {
                        i2.k.w(eVar4, l0Var);
                    }
                }
                eVar3.f28543p = null;
                eVar3.f28542o = null;
                return y1Var2;
            case 16:
                g2.v vVar = (g2.v) obj;
                nk.k.e(vVar, "it");
                ((u0) obj2).setValue(new o1.b(vVar.E(0L)));
                return uVar;
            case 17:
                nm.c0 c0Var = (nm.c0) obj;
                nk.k.e(c0Var, "it");
                return Boolean.valueOf(c0Var.a() != ((nm.c0) obj2).a());
            case 18:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return uVar;
            case 19:
                p1.h0 h0Var = (p1.h0) obj;
                p1.k0 k0Var2 = (p1.k0) obj2;
                float f10 = k0Var2.f30990o;
                if (h0Var.f30965b != f10) {
                    h0Var.f30964a |= 1;
                    h0Var.f30965b = f10;
                }
                float f11 = k0Var2.f30991p;
                if (h0Var.f30966c != f11) {
                    h0Var.f30964a |= 2;
                    h0Var.f30966c = f11;
                }
                float f12 = k0Var2.f30992q;
                if (h0Var.f30967d != f12) {
                    h0Var.f30964a |= 4;
                    h0Var.f30967d = f12;
                }
                h0Var.d(0.0f);
                h0Var.e(0.0f);
                float f13 = k0Var2.f30993r;
                if (h0Var.g != f13) {
                    h0Var.f30964a |= 32;
                    h0Var.g = f13;
                }
                float f14 = k0Var2.f30994s;
                if (h0Var.j != f14) {
                    h0Var.f30964a |= 2048;
                    h0Var.j = f14;
                }
                long j = k0Var2.f30995t;
                long j8 = h0Var.f30972k;
                int i16 = p1.m0.f31007b;
                if (j8 != j) {
                    h0Var.f30964a |= Buffer.SEGMENTING_THRESHOLD;
                    h0Var.f30972k = j;
                }
                p1.j0 j0Var2 = k0Var2.f30996u;
                if (!nk.k.a(h0Var.f30973l, j0Var2)) {
                    h0Var.f30964a |= Segment.SIZE;
                    h0Var.f30973l = j0Var2;
                }
                boolean z3 = k0Var2.f30997v;
                if (h0Var.f30974m != z3) {
                    h0Var.f30964a |= Http2.INITIAL_MAX_FRAME_SIZE;
                    h0Var.f30974m = z3;
                }
                long j9 = k0Var2.f30998w;
                if (!p1.s.c(h0Var.f30970h, j9)) {
                    h0Var.f30964a |= 64;
                    h0Var.f30970h = j9;
                }
                long j10 = k0Var2.f30999x;
                if (!p1.s.c(h0Var.f30971i, j10)) {
                    h0Var.f30964a |= 128;
                    h0Var.f30971i = j10;
                }
                int i17 = k0Var2.f31000y;
                if (h0Var.f30978q != i17) {
                    h0Var.f30964a |= 524288;
                    h0Var.f30978q = i17;
                }
                return uVar;
            case 20:
                p2.v.a((p2.x) obj, ((p2.h) obj2).f31050a);
                return uVar;
            case 21:
                tk.c[] cVarArr = p2.v.f31140a;
                ((p2.x) obj).a(p2.t.f31114a, cm.g.s((String) obj2));
                return uVar;
            case 22:
                ((List) obj).add((Float) ((j0.r0) obj2).invoke());
                return true;
            case 23:
                Throwable th3 = (Throwable) obj;
                p4.z zVar = (p4.z) obj2;
                yj.n nVar = zVar.j;
                if (th3 != null) {
                    zVar.f31364h.C(new p4.j0(th3));
                }
                if (nVar.a()) {
                    ((p4.g0) nVar.getValue()).close();
                }
                return uVar;
            case 24:
                File file = (File) obj;
                nk.k.e(file, "it");
                return new p4.r0(((cl.d) obj2).f2910a, file);
            case 25:
                r1.d dVar2 = (r1.d) obj;
                s1.b bVar = (s1.b) obj2;
                p1.j jVar = bVar.f33240l;
                if (bVar.f33242n && bVar.f33251w && jVar != null) {
                    i0.f fVarM = dVar2.M();
                    long jE = fVarM.E();
                    fVarM.x().c();
                    try {
                        ((i0.f) ((nm.d0) fVarM.f25416b).f30011b).x().g(jVar);
                        bVar.c(dVar2);
                    } finally {
                        fVarM.x().k();
                        fVarM.R(jE);
                    }
                } else {
                    bVar.c(dVar2);
                }
                return uVar;
            case 26:
                v1.b0 b0Var = (v1.b0) obj;
                v1.c cVar3 = (v1.c) obj2;
                cVar3.g(b0Var);
                mk.c cVar4 = cVar3.f35623i;
                if (cVar4 != null) {
                    cVar4.invoke(b0Var);
                }
                return uVar;
            case 27:
                return obj == ((x.a0) obj2) ? "(this)" : String.valueOf(obj);
            case 28:
                return obj == ((x.b0) obj2) ? "(this)" : String.valueOf(obj);
            default:
                return obj == ((x.f0) obj2) ? "(this)" : String.valueOf(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(jf.c cVar, l1.e eVar, nk.q qVar) {
        super(1);
        this.f2644a = 14;
        this.f2645b = qVar;
    }
}
