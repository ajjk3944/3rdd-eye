package xi;

import ak.m0;
import android.location.Location;
import android.os.Handler;
import com.google.android.gms.internal.measurement.e5;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p.l2;

/* loaded from: classes.dex */
public final class u implements ek.e {
    public final js.e B;
    public final l2 D;
    public final q3.a E;
    public final qm.c F;
    public ak.u G;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f25365a;

    /* renamed from: d, reason: collision with root package name */
    public final bk.f f25366d;

    /* renamed from: g, reason: collision with root package name */
    public final qm.c f25367g;

    /* renamed from: r, reason: collision with root package name */
    public final ag.b f25368r;

    /* renamed from: x, reason: collision with root package name */
    public final om.f f25369x;

    /* renamed from: y, reason: collision with root package name */
    public final xj.i f25370y;

    public u(Executor executor, bk.f fVar, qm.c cVar, ag.b bVar, om.f fVar2, xj.i iVar, js.e eVar, cj.a aVar, l2 l2Var, q3.a aVar2, qm.c cVar2) {
        this.f25365a = executor;
        this.f25366d = fVar;
        this.f25367g = cVar;
        this.f25368r = bVar;
        this.f25369x = fVar2;
        this.f25370y = iVar;
        this.B = eVar;
        this.D = l2Var;
        this.E = aVar2;
        this.F = cVar2;
        this.G = new ak.u();
        fVar.f2812l = this;
        eVar.f13797d = this;
        String strN = fVar2.n("key_last_location", "");
        br.l.b(strN);
        this.G = ak.u.b((ak.u) iVar.g(strN), 0.0d, 0.0d, 32763);
        ch.n.b("SdkLocationRepository", "Last device location: " + this.G);
    }

    public final void a(ak.u uVar) {
        synchronized (this.H) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                ((ek.f) it.next()).v0(uVar);
            }
        }
    }

    public final void b(String str) {
        ch.n.c("SdkLocationRepository", "Error requesting the location: ".concat(str));
        a(this.G);
    }

    public final void c(ik.a aVar) {
        ch.n.b("SdkLocationRepository", "registerForTrigger " + aVar.a());
        if (t.f25364a[aVar.a().ordinal()] == 1) {
            this.f25366d.e();
            return;
        }
        ch.n.b("SdkLocationRepository", aVar.a() + " type not handled for location");
    }

    public final void d(ek.f fVar) {
        synchronized (this.H) {
            this.H.remove(fVar);
        }
        g();
    }

    public final void e() {
        bk.f fVar = this.f25366d;
        ak.u uVar = new ak.u();
        if (((ag.b) fVar.f2806d).g()) {
            try {
                pc.a aVar = (pc.a) fVar.f2803a;
                br.l.e(aVar, "fusedLocationProviderClient");
                bc.j jVar = new bc.j(0);
                jVar.f2610b = true;
                jVar.f2612d = ee.f.f8095g;
                jVar.f2611c = 2414;
                dd.r rVarC = aVar.c(0, jVar.d());
                br.l.d(rVarC, "getLastLocation(...)");
                e5.h(rVarC, 2L, TimeUnit.SECONDS);
                Location location = (Location) rVarC.h();
                if (location != null) {
                    uVar = (ak.u) ((xj.i) fVar.f2809g).a(location);
                }
            } catch (Exception e4) {
                ch.n.e("FusedLocationDataSource", e4);
            }
        } else {
            ch.n.b("FusedLocationDataSource", "Cannot get last location as we don't have permission.");
        }
        synchronized (this) {
            if (!uVar.c()) {
                uVar = this.G;
            }
            i(uVar);
        }
    }

    public final void f(ak.u uVar) {
        if (!this.D.D()) {
            ch.n.b("SdkLocationRepository", "Not saving location because GDPR consent is not granted.");
            return;
        }
        try {
            this.f25369x.u("key_last_location", (String) this.f25370y.a(uVar));
        } catch (Exception e4) {
            ch.n.e("SdkLocationRepository", e4);
            cj.a.E(e4, "Error in saveLastLocation saving location: " + uVar);
        }
    }

    public final void g() {
        boolean zIsEmpty;
        synchronized (this.H) {
            zIsEmpty = true;
            if (this.H.isEmpty()) {
                synchronized (this.I) {
                    zIsEmpty = true ^ this.I.isEmpty();
                }
            }
        }
        if (zIsEmpty) {
            return;
        }
        this.f25366d.f();
        Handler handler = (Handler) this.B.f13800x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        } else {
            br.l.l("handler");
            throw null;
        }
    }

    public final void h(ik.a aVar) {
        ch.n.b("SdkLocationRepository", "unregisterForTrigger " + aVar.a());
        if (t.f25364a[aVar.a().ordinal()] == 1) {
            this.f25366d.f();
            return;
        }
        ch.n.b("SdkLocationRepository", aVar.a() + " type not handled for location");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v27 */
    public final void i(ak.u uVar) {
        Object obj;
        ch.n.b("SdkLocationRepository", "updatedLocation() called with: deviceLocation = " + uVar);
        int i10 = ((ak.g) this.E.f20680g).f529f.f450b.f423m;
        br.l.e(uVar, "deviceLocation");
        qm.c cVar = this.F;
        double d6 = uVar.f721a;
        double d10 = uVar.f722b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d6);
        sb2.append('#');
        sb2.append(d10);
        String string = sb2.toString();
        oh.p pVar = (oh.p) cVar.f20918d;
        synchronized (pVar) {
            br.l.e(string, "key");
            obj = ((com.google.android.exoplayer2.source.hls.c) pVar.f19481d).get(string);
            if (obj == null) {
                obj = null;
            }
        }
        m0 m0Var = (m0) obj;
        if (m0Var == null) {
            wj.a aVar = new wj.a(d6, d10);
            ?? r22 = ((ak.g) ((q3.a) cVar.f20919g).f20680g).f529f.f466t.f620a;
            if (r22.isEmpty()) {
                ch.n.b("PolygonRegionRestrictionResolver", "No region restrictions configured");
                ch.n.b("PolygonRegionRestrictionResolver", "Adding to cache: " + string + " -> null");
                ((oh.p) cVar.f20918d).H(string, null);
            } else {
                ArrayList arrayList = new ArrayList();
                for (m0 m0Var2 : r22) {
                    for (String str : m0Var2.f617a) {
                        Map map = (Map) ((lq.q) cVar.f20920r).getValue();
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        br.l.d(lowerCase, "toLowerCase(...)");
                        List<wj.d> list = (List) map.get(lowerCase);
                        if (list != null && !list.isEmpty()) {
                            for (wj.d dVar : list) {
                                br.l.e(dVar, "poly");
                                if (qm.c.C(aVar, dVar.f24540a)) {
                                    ArrayList arrayList2 = dVar.f24541b;
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it = arrayList2.iterator();
                                        while (it.hasNext()) {
                                            if (qm.c.C(aVar, (List) it.next())) {
                                                break;
                                            }
                                        }
                                    }
                                    arrayList.add(m0Var2);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    ((oh.p) cVar.f20918d).H(string, null);
                } else {
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    m0 next = it2.next();
                    if (it2.hasNext()) {
                        int i11 = ((m0) next).f618b;
                        do {
                            Object next2 = it2.next();
                            int i12 = ((m0) next2).f618b;
                            next = next;
                            if (i11 > i12) {
                                next = next2;
                                i11 = i12;
                            }
                        } while (it2.hasNext());
                    }
                    m0Var = next;
                    ch.n.b("PolygonRegionRestrictionResolver", "Adding to cache: " + string + " -> " + m0Var);
                    ((oh.p) cVar.f20918d).H(string, m0Var);
                }
            }
            m0Var = null;
        } else {
            ch.n.b("PolygonRegionRestrictionResolver", "Cache hit for " + string + ": " + m0Var);
        }
        ch.n.b("SdkLocationRepository", "Location is in restricted region: " + m0Var);
        int i13 = m0Var != null ? m0Var.f618b : -1;
        if (i13 != -1) {
            i10 = i13;
        }
        if (i10 > -1) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(uVar.f721a));
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            uVar = ak.u.b(uVar, bigDecimal.setScale(i10, roundingMode).doubleValue(), new BigDecimal(String.valueOf(uVar.f722b)).setScale(i10, roundingMode).doubleValue(), 32764);
            ch.n.b("SdkLocationRepository", "updatedLocation()  Rounded latitude " + uVar.f721a + " with " + i10 + " decimals to " + uVar.f721a);
            ch.n.b("SdkLocationRepository", "updatedLocation() Rounded longitude " + uVar.f722b + " with " + i10 + " decimals to " + uVar.f722b);
        }
        synchronized (this) {
            js.e eVar = this.B;
            Handler handler = (Handler) eVar.f13800x;
            if (handler == null) {
                br.l.l("handler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = (Handler) eVar.f13800x;
            if (handler2 == null) {
                br.l.l("handler");
                throw null;
            }
            handler2.postDelayed(new s9.c(uVar, 4, eVar), ((ak.g) ((q3.a) eVar.f13799r).f20680g).f529f.f450b.f413a);
            if (!uVar.c()) {
                uVar = this.G;
            }
            this.G = uVar;
            a(uVar);
            f(uVar);
            this.f25367g.S();
        }
    }

    @Override // ek.e
    public final void q0() {
        synchronized (this.I) {
            Iterator it = this.I.iterator();
            while (it.hasNext()) {
                ((ek.e) it.next()).q0();
            }
        }
    }
}
