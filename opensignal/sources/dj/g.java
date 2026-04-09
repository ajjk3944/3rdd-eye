package dj;

import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import br.l;
import cj.n;
import h9.p;
import h9.r2;
import hk.k;
import i7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import mq.o;
import xi.s;
import xi.u;

/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7401a;

    public /* synthetic */ g(ch.d dVar, boolean z10) {
        this.f7401a = dVar;
    }

    public static void d(g gVar, List list) {
        boolean z10;
        gVar.getClass();
        l.e(list, "triggers");
        synchronized (gVar.c()) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ik.a aVar = (ik.a) it.next();
                    m mVarC = gVar.c();
                    l.e(aVar, "trigger");
                    synchronized (mVarC.f11274a) {
                        z10 = mVarC.f11274a.get(aVar.a()) != null;
                    }
                    if (!z10) {
                        ch.n.b("TriggerRegistry", "Adding trigger " + aVar.getClass().getSimpleName() + " to dataSource");
                        m mVarC2 = gVar.c();
                        synchronized (mVarC2.f11274a) {
                            mVarC2.f11274a.put(aVar.a(), aVar);
                        }
                    }
                    gVar.f7401a.v0().D(aVar);
                    gVar.f7401a.Z().c(aVar);
                    if (aVar.f11434a.g1() == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Setting onTriggerListener ");
                        String simpleName = ((k) gVar.f7401a.Z0().f10078a) != null ? k.class.getSimpleName() : null;
                        if (simpleName == null) {
                            simpleName = "null";
                        }
                        sb2.append(simpleName);
                        sb2.append(" for trigger ");
                        sb2.append(aVar.getClass().getSimpleName());
                        ch.n.b("TriggerRegistry", sb2.toString());
                        aVar.f11434a.r1((k) gVar.f7401a.Z0().f10078a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public fj.g a(TelephonyManager telephonyManager, fj.n nVar, int i10) {
        ch.d dVar = this.f7401a;
        ch.f fVarF = dVar.F();
        ag.b bVarO0 = dVar.o0();
        bk.k kVarV0 = dVar.V0();
        al.b bVarK0 = dVar.k0();
        ch.i iVarN0 = dVar.n0();
        cj.a aVarI0 = dVar.i0();
        r2 r2Var = new r2(nVar, (com.opensignal.sdk.common.measurements.base.e) aVarI0.f3974d, (q3.a) aVarI0.f3978y, (ch.f) aVarI0.f3975g, (com.opensignal.sdk.common.measurements.base.f) aVarI0.f3976r, (com.opensignal.sdk.common.measurements.base.c) aVarI0.f3977x);
        fj.b bVarJ = dVar.j();
        ak.e eVar = ((ak.g) dVar.n().f20680g).f529f.f458l;
        ContentResolver contentResolver = dVar.d().getContentResolver();
        PackageManager packageManager = dVar.d().getPackageManager();
        l.d(packageManager, "getPackageManager(...)");
        ConnectivityManager connectivityManagerP = dVar.p();
        l.b(contentResolver);
        return new fj.g(fVarF, iVarN0, telephonyManager, bVarO0, kVarV0, nVar, bVarK0, r2Var, bVarJ, i10, eVar, contentResolver, packageManager, connectivityManagerP);
    }

    public fj.g b() {
        ch.d dVar = this.f7401a;
        cj.a aVarT0 = dVar.T0();
        int iX = ((bk.k) aVarT0.f3976r).x();
        TelephonyManager telephonyManager = (TelephonyManager) aVarT0.v().get(Integer.valueOf(iX));
        int iIntValue = Integer.valueOf(iX).intValue();
        return a(telephonyManager, dVar.U0().e(iIntValue), iIntValue);
    }

    public m c() {
        m mVar;
        ch.d dVar = this.f7401a;
        synchronized (dVar) {
            try {
                if (dVar.N == null) {
                    dVar.N = new m(2);
                }
                mVar = dVar.N;
                if (mVar == null) {
                    l.l("_triggerRegistryDataSource");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    public void e(List list, boolean z10) {
        int iY0;
        l.e(list, "triggers");
        ch.n.b("TriggerRegistry", "unregisterTriggers: " + list);
        synchronized (c()) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ik.a aVar = (ik.a) it.next();
                    r2 r2VarP0 = this.f7401a.P0();
                    l.e(aVar, "trigger");
                    synchronized (((qj.a) r2VarP0.f10470a)) {
                        iY0 = r2VarP0.y0(((p) r2VarP0.f10472g).c(), aVar) + r2VarP0.y0(r2VarP0.t0(), aVar);
                    }
                    ch.n.b("TriggerRegistry", "there are " + iY0 + " tasks using trigger  " + aVar.getClass().getSimpleName());
                    if (iY0 == 1 || z10) {
                        ch.n.b("TriggerRegistry", "Unregistering trigger " + aVar.getClass().getSimpleName());
                        m mVarC = c();
                        synchronized (mVarC.f11274a) {
                        }
                        this.f7401a.w0();
                        wi.h hVarC = ai.g.c(aVar.a());
                        if (hVarC != null) {
                            List<ik.a> listB = c().b();
                            ArrayList arrayList = new ArrayList();
                            for (ik.a aVar2 : listB) {
                                this.f7401a.w0();
                                wi.h hVarC2 = ai.g.c(aVar2.a());
                                if (hVarC2 != null) {
                                    arrayList.add(hVarC2);
                                }
                            }
                            if (!o.U0(arrayList).contains(hVarC)) {
                                ch.n.b("TriggerRegistry", "Unregistering receiverType " + wi.h.class.getSimpleName());
                                this.f7401a.v0().L(aVar);
                                this.f7401a.Z().h(aVar);
                            }
                        }
                        aVar.f11434a.r1(null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cj.n
    public void run() {
        ak.g gVar = (ak.g) this.f7401a.n().f20680g;
        u uVarZ = this.f7401a.Z();
        uVarZ.f25365a.execute(new s(uVarZ, 0));
        cj.a aVarV0 = this.f7401a.v0();
        ch.n.b("ReceiverRegistry", "Registering " + ((List) aVarV0.f3978y).size() + " common receivers: " + ((List) aVarV0.f3978y));
        synchronized (((oh.p) aVarV0.f3977x)) {
            try {
                for (ck.a aVar : (List) aVarV0.f3978y) {
                    if (aVar.f3995b < 23) {
                        aVarV0.C(aVar.f3994a);
                    } else if (ch.l.f3962t5.F().a()) {
                        aVarV0.C(aVar.f3994a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = ((LinkedHashMap) this.f7401a.U0().f8952m).values().iterator();
        while (it.hasNext()) {
            ((fj.n) it.next()).d();
        }
        this.f7401a.K().V(gVar);
        al.b bVarF = this.f7401a.f();
        q3.a aVar2 = (q3.a) bVarF.f812d;
        if (!aVar2.J0()) {
            ((ch.d) aVar2.f20679d).U().t(-1L, "back");
        }
        bVarF.n();
    }

    public g(ch.d dVar) {
        l.e(dVar, "serviceLocator");
        this.f7401a = dVar;
    }
}
