package bc;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.measurement.i4;
import h7.r1;
import h9.r2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n implements ac.g, ac.h {

    /* renamed from: e, reason: collision with root package name */
    public final ac.c f2624e;

    /* renamed from: f, reason: collision with root package name */
    public final a f2625f;

    /* renamed from: g, reason: collision with root package name */
    public final bm.e f2626g;
    public final int j;
    public final z k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2629l;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f2633p;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f2623d = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f2627h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f2628i = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2630m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ConnectionResult f2631n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f2632o = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public n(d dVar, ac.f fVar) {
        this.f2633p = dVar;
        Looper looper = dVar.J.getLooper();
        bm.d dVarA = fVar.a();
        r2 r2Var = new r2((u.f) dVarA.f2826d, (String) dVarA.f2827g, (String) dVarA.f2828r);
        i4 i4Var = (i4) fVar.f329d.f2830d;
        cc.s.h(i4Var);
        ac.c cVarG = i4Var.g(fVar.f326a, looper, r2Var, fVar.f330e, this, this);
        r1 r1Var = fVar.f328c;
        if (r1Var == null || !(cVarG instanceof cc.e)) {
            String str = fVar.f327b;
            if (str != null && (cVarG instanceof cc.e)) {
                ((cc.e) cVarG).f3631s = str;
            }
        } else {
            ((cc.e) cVarG).f3632t = r1Var;
        }
        this.f2624e = cVarG;
        this.f2625f = fVar.f331f;
        this.f2626g = new bm.e(5);
        this.j = fVar.f332g;
        if (!cVarG.b()) {
            this.k = null;
            return;
        }
        Context context = dVar.f2592x;
        yh.a aVar = dVar.J;
        bm.d dVarA2 = fVar.a();
        this.k = new z(context, aVar, new r2((u.f) dVarA2.f2826d, (String) dVarA2.f2827g, (String) dVarA2.f2828r));
    }

    public final void a() {
        Object obj = this.f2624e;
        d dVar = this.f2633p;
        cc.s.d(dVar.J);
        this.f2631n = null;
        l(ConnectionResult.f4805y);
        if (this.f2629l) {
            yh.a aVar = dVar.J;
            a aVar2 = this.f2625f;
            aVar.removeMessages(11, aVar2);
            dVar.J.removeMessages(9, aVar2);
            this.f2629l = false;
        }
        Iterator it = this.f2628i.values().iterator();
        while (it.hasNext()) {
            j jVar = ((x) it.next()).f2660a;
            try {
                ((om.f) ((a5.t) jVar.f2613e).f154b).accept(obj, new dd.h());
            } catch (DeadObjectException unused) {
                d(3);
                ((cc.e) obj).f("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException e4) {
                e = e4;
                io.sentry.android.core.e0.c("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            } catch (RuntimeException e10) {
                e = e10;
                io.sentry.android.core.e0.c("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            }
        }
        g();
        k();
    }

    public final void b(int i10) {
        cc.s.d(this.f2633p.J);
        this.f2631n = null;
        this.f2629l = true;
        String str = ((cc.e) this.f2624e).f3615a;
        bm.e eVar = this.f2626g;
        eVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        eVar.I(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f2625f;
        d dVar = this.f2633p;
        yh.a aVar2 = dVar.J;
        aVar2.sendMessageDelayed(Message.obtain(aVar2, 9, aVar), 5000L);
        yh.a aVar3 = dVar.J;
        aVar3.sendMessageDelayed(Message.obtain(aVar3, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.B.f2830d;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f2628i.values().iterator();
        while (it.hasNext()) {
            ((x) it.next()).getClass();
        }
    }

    public final boolean c(ConnectionResult connectionResult) {
        synchronized (d.N) {
            try {
                d dVar = this.f2633p;
                if (dVar.G == null || !dVar.H.contains(this.f2625f)) {
                    return false;
                }
                k kVar = dVar.G;
                int i10 = this.j;
                kVar.getClass();
                c0 c0Var = new c0(connectionResult, i10);
                AtomicReference atomicReference = kVar.f2615g;
                while (true) {
                    if (atomicReference.compareAndSet(null, c0Var)) {
                        kVar.f2616r.post(new re.a(kVar, c0Var));
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                dVar.f2593y.g(dVar.f2592x, connectionResult, true);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ac.g
    public final void d(int i10) {
        d dVar = this.f2633p;
        if (Looper.myLooper() == dVar.J.getLooper()) {
            b(i10);
        } else {
            dVar.J.post(new m(i10, 0, this));
        }
    }

    @Override // ac.g
    public final void e() {
        d dVar = this.f2633p;
        if (Looper.myLooper() == dVar.J.getLooper()) {
            a();
        } else {
            dVar.J.post(new b4.e(1, this));
        }
    }

    @Override // ac.h
    public final void f(ConnectionResult connectionResult) {
        n(connectionResult, null);
    }

    public final void g() {
        LinkedList linkedList = this.f2623d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = (v) arrayList.get(i10);
            if (!((cc.e) this.f2624e).q()) {
                return;
            }
            if (h(vVar)) {
                linkedList.remove(vVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(v vVar) {
        if (vVar == null) {
            bm.e eVar = this.f2626g;
            ac.c cVar = this.f2624e;
            vVar.f(eVar, cVar.b());
            try {
                vVar.g(this);
                return true;
            } catch (DeadObjectException unused) {
                d(1);
                ((cc.e) cVar).f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Feature[] featureArrA = vVar.a(this);
        Feature feature = null;
        if (featureArrA != null && featureArrA.length != 0) {
            zzj zzjVar = ((cc.e) this.f2624e).f3635w;
            Feature[] featureArr = zzjVar == null ? null : zzjVar.f4865d;
            if (featureArr == null) {
                featureArr = new Feature[0];
            }
            u.e eVar2 = new u.e(featureArr.length);
            for (Feature feature2 : featureArr) {
                eVar2.put(feature2.f4811a, Long.valueOf(feature2.d()));
            }
            for (Feature feature3 : featureArrA) {
                Long l10 = (Long) eVar2.get(feature3.f4811a);
                if (l10 == null || l10.longValue() < feature3.d()) {
                    feature = feature3;
                    break;
                }
            }
        }
        if (feature == null) {
            bm.e eVar3 = this.f2626g;
            ac.c cVar2 = this.f2624e;
            vVar.f(eVar3, cVar2.b());
            try {
                vVar.g(this);
                return true;
            } catch (DeadObjectException unused2) {
                d(1);
                ((cc.e) cVar2).f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f2624e.getClass().getName();
        String str = feature.f4811a;
        long jD = feature.d();
        StringBuilder sb2 = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jD).length() + 2);
        w.g.q(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(jD);
        sb2.append(").");
        io.sentry.android.core.e0.p("GoogleApiManager", sb2.toString());
        d dVar = this.f2633p;
        if (!dVar.K || !vVar.b(this)) {
            vVar.e(new ac.k(feature));
            return true;
        }
        int iC = vVar.c(this);
        o oVar = new o(this.f2625f, feature);
        ArrayList arrayList = this.f2630m;
        int iIndexOf = arrayList.indexOf(oVar);
        if (iIndexOf >= 0) {
            o oVar2 = (o) arrayList.get(iIndexOf);
            dVar.J.removeMessages(15, oVar2);
            dVar.J.sendMessageDelayed(Message.obtain(dVar.J, 15, oVar2), 5000L);
            return false;
        }
        arrayList.add(oVar);
        dVar.J.sendMessageDelayed(Message.obtain(dVar.J, 15, oVar), 5000L);
        dVar.J.sendMessageDelayed(Message.obtain(dVar.J, 16, oVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iC));
        if (c(connectionResult)) {
            String str2 = feature.f4811a;
            long jD2 = feature.d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jD2).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(jD2);
            io.sentry.android.core.e0.p("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!dVar.g(connectionResult, this.j)) {
            return false;
        }
        String str3 = feature.f4811a;
        long jD3 = feature.d();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jD3).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(jD3);
        io.sentry.android.core.e0.p("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void i(Status status, Exception exc, boolean z10) {
        cc.s.d(this.f2633p.J);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2623d.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (!z10 || vVar.f2656a == 2) {
                if (status != null) {
                    vVar.d(status);
                } else {
                    vVar.e(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        cc.s.d(this.f2633p.J);
        i(status, null, false);
    }

    public final void k() {
        d dVar = this.f2633p;
        yh.a aVar = dVar.J;
        a aVar2 = this.f2625f;
        aVar.removeMessages(12, aVar2);
        yh.a aVar3 = dVar.J;
        aVar3.sendMessageDelayed(aVar3.obtainMessage(12, aVar2), dVar.f2588a);
    }

    public final void l(ConnectionResult connectionResult) {
        HashSet hashSet = this.f2627h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (cc.s.k(connectionResult, ConnectionResult.f4805y)) {
            cc.e eVar = (cc.e) this.f2624e;
            if (!eVar.q() || eVar.f3616b == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void m(ConnectionResult connectionResult) {
        cc.s.d(this.f2633p.J);
        Object obj = this.f2624e;
        String name = obj.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(strValueOf);
        ((cc.e) obj).f(sb2.toString());
        n(connectionResult, null);
    }

    public final void n(ConnectionResult connectionResult, RuntimeException runtimeException) {
        bd.a aVar;
        d dVar = this.f2633p;
        cc.s.d(dVar.J);
        z zVar = this.k;
        if (zVar != null && (aVar = zVar.j) != null) {
            aVar.e();
        }
        cc.s.d(this.f2633p.J);
        this.f2631n = null;
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.B.f2830d;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(connectionResult);
        if ((this.f2624e instanceof ec.e) && connectionResult.f4807d != 24) {
            dVar.f2589d = true;
            yh.a aVar2 = dVar.J;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(19), 300000L);
        }
        int i10 = connectionResult.f4807d;
        if (i10 == 4) {
            j(d.M);
            return;
        }
        if (i10 == 25) {
            j(d.c(this.f2625f, connectionResult));
            return;
        }
        LinkedList linkedList = this.f2623d;
        if (linkedList.isEmpty()) {
            this.f2631n = connectionResult;
            return;
        }
        if (runtimeException != null) {
            cc.s.d(dVar.J);
            i(null, runtimeException, false);
            return;
        }
        if (!dVar.K) {
            j(d.c(this.f2625f, connectionResult));
            return;
        }
        a aVar3 = this.f2625f;
        i(d.c(aVar3, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || dVar.g(connectionResult, this.j)) {
            return;
        }
        if (connectionResult.f4807d == 18) {
            this.f2629l = true;
        }
        if (!this.f2629l) {
            j(d.c(aVar3, connectionResult));
        } else {
            yh.a aVar4 = dVar.J;
            aVar4.sendMessageDelayed(Message.obtain(aVar4, 9, aVar3), 5000L);
        }
    }

    public final void o(v vVar) {
        cc.s.d(this.f2633p.J);
        boolean zQ = ((cc.e) this.f2624e).q();
        LinkedList linkedList = this.f2623d;
        if (zQ) {
            if (h(vVar)) {
                k();
                return;
            } else {
                linkedList.add(vVar);
                return;
            }
        }
        linkedList.add(vVar);
        ConnectionResult connectionResult = this.f2631n;
        if (connectionResult == null || connectionResult.f4807d == 0 || connectionResult.f4808g == null) {
            q();
        } else {
            n(connectionResult, null);
        }
    }

    public final void p() {
        d dVar = this.f2633p;
        cc.s.d(dVar.J);
        Status status = d.L;
        j(status);
        this.f2626g.I(false, status);
        for (g gVar : (g[]) this.f2628i.keySet().toArray(new g[0])) {
            o(new a0(gVar, new dd.h()));
        }
        l(new ConnectionResult(4, null, null));
        if (((cc.e) this.f2624e).q()) {
            dVar.J.post(new b4.e(2, new b9.c(7, this)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        d dVar = this.f2633p;
        cc.s.d(dVar.J);
        ac.c cVar = this.f2624e;
        cc.e eVar = (cc.e) cVar;
        if (eVar.q() || eVar.r()) {
            return;
        }
        try {
            int iH = dVar.B.H(dVar.f2592x, cVar);
            if (iH != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iH, null, null);
                String name = cVar.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(string);
                io.sentry.android.core.e0.p("GoogleApiManager", sb2.toString());
                n(connectionResult, null);
                return;
            }
            p pVar = new p(dVar, cVar, this.f2625f);
            if (cVar.b()) {
                z zVar = this.k;
                cc.s.h(zVar);
                bd.a aVar = zVar.j;
                if (aVar != null) {
                    aVar.e();
                }
                r2 r2Var = zVar.f2670i;
                r2Var.f10475y = Integer.valueOf(System.identityHashCode(zVar));
                ad.b bVar = zVar.f2668g;
                Context context = zVar.f2666e;
                Handler handler = zVar.f2667f;
                zVar.j = (bd.a) bVar.g(context, handler.getLooper(), r2Var, (ad.a) r2Var.f10474x, zVar, zVar);
                zVar.k = pVar;
                Set set = zVar.f2669h;
                if (set == null || set.isEmpty()) {
                    handler.post(new b4.e(zVar));
                } else {
                    bd.a aVar2 = zVar.j;
                    aVar2.getClass();
                    aVar2.j = new cc.h((cc.e) aVar2);
                    aVar2.u(2, null);
                }
            }
            try {
                eVar.j = pVar;
                eVar.u(2, null);
            } catch (SecurityException e4) {
                n(new ConnectionResult(10, null, null), e4);
            }
        } catch (IllegalStateException e10) {
            n(new ConnectionResult(10, null, null), e10);
        }
    }
}
