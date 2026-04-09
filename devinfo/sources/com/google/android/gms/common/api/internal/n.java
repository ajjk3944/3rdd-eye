package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements ob.g, ob.h {

    /* renamed from: b, reason: collision with root package name */
    public final ob.c f9102b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9103c;

    /* renamed from: d, reason: collision with root package name */
    public final yb.i f9104d;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final w f9107h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9108i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f9111m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f9101a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9105e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f9106f = new HashMap();
    public final ArrayList j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public nb.b f9109k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f9110l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public n(d dVar, ob.f fVar) {
        this.f9111m = dVar;
        Looper looper = dVar.f9092m.getLooper();
        i0.f fVarA = fVar.a();
        va.o oVar = new va.o((x.f) fVarA.f25416b, (String) fVarA.f25417c, (String) fVarA.f25418d);
        jm.a aVar = (jm.a) fVar.f30487c.f28442b;
        pb.y.h(aVar);
        ob.c cVarD = aVar.d(fVar.f30485a, looper, oVar, fVar.f30488d, this, this);
        String str = fVar.f30486b;
        if (str != null && (cVarD instanceof pb.e)) {
            ((pb.e) cVarD).f31583s = str;
        }
        if (str != null && (cVarD instanceof i)) {
            d.h.C(cVarD);
            throw null;
        }
        this.f9102b = cVarD;
        this.f9103c = fVar.f30489e;
        this.f9104d = new yb.i(11);
        this.g = fVar.f30490f;
        if (!cVarD.m()) {
            this.f9107h = null;
            return;
        }
        Context context = dVar.f9086e;
        ac.k kVar = dVar.f9092m;
        i0.f fVarA2 = fVar.a();
        this.f9107h = new w(context, kVar, new va.o((x.f) fVarA2.f25416b, (String) fVarA2.f25417c, (String) fVarA2.f25418d));
    }

    @Override // ob.h
    public final void O(nb.b bVar) {
        l(bVar, null);
    }

    @Override // ob.g
    public final void S(int i4) {
        Looper looperMyLooper = Looper.myLooper();
        ac.k kVar = this.f9111m.f9092m;
        if (looperMyLooper == kVar.getLooper()) {
            f(i4);
        } else {
            kVar.post(new b4.a(this, i4, 1));
        }
    }

    @Override // ob.g
    public final void T() {
        Looper looperMyLooper = Looper.myLooper();
        ac.k kVar = this.f9111m.f9092m;
        if (looperMyLooper == kVar.getLooper()) {
            e();
        } else {
            kVar.post(new b5.o(5, this));
        }
    }

    public final void a(nb.b bVar) {
        HashSet hashSet = this.f9105e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (pb.y.l(bVar, nb.b.f29883f)) {
                this.f9102b.e();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        pb.y.c(this.f9111m.f9092m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z3) {
        pb.y.c(this.f9111m.f9092m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f9101a.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (!z3 || sVar.f9122a == 2) {
                if (status != null) {
                    sVar.c(status);
                } else {
                    sVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f9101a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            s sVar = (s) arrayList.get(i4);
            if (!this.f9102b.g()) {
                return;
            }
            if (h(sVar)) {
                linkedList.remove(sVar);
            }
        }
    }

    public final void e() {
        d dVar = this.f9111m;
        pb.y.c(dVar.f9092m);
        this.f9109k = null;
        a(nb.b.f29883f);
        ac.k kVar = dVar.f9092m;
        if (this.f9108i) {
            a aVar = this.f9103c;
            kVar.removeMessages(11, aVar);
            kVar.removeMessages(9, aVar);
            this.f9108i = false;
        }
        Iterator it = this.f9106f.values().iterator();
        if (it.hasNext()) {
            throw je.u.o(it);
        }
        d();
        g();
    }

    public final void f(int i4) {
        d dVar = this.f9111m;
        ac.k kVar = dVar.f9092m;
        pb.y.c(dVar.f9092m);
        this.f9109k = null;
        this.f9108i = true;
        String strL = this.f9102b.l();
        yb.i iVar = this.f9104d;
        iVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strL != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strL);
        }
        iVar.S(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f9103c;
        kVar.sendMessageDelayed(Message.obtain(kVar, 9, aVar), 5000L);
        kVar.sendMessageDelayed(Message.obtain(kVar, 11, aVar), 120000L);
        ((SparseIntArray) dVar.g.f28442b).clear();
        Iterator it = this.f9106f.values().iterator();
        if (it.hasNext()) {
            throw je.u.o(it);
        }
    }

    public final void g() {
        d dVar = this.f9111m;
        ac.k kVar = dVar.f9092m;
        a aVar = this.f9103c;
        kVar.removeMessages(12, aVar);
        kVar.sendMessageDelayed(kVar.obtainMessage(12, aVar), dVar.f9082a);
    }

    public final boolean h(s sVar) {
        nb.d dVar;
        if (sVar == null) {
            yb.i iVar = this.f9104d;
            ob.c cVar = this.f9102b;
            sVar.f(iVar, cVar.m());
            try {
                sVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                S(1);
                cVar.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        nb.d[] dVarArrB = sVar.b(this);
        if (dVarArrB == null || dVarArrB.length == 0) {
            dVar = null;
        } else {
            nb.d[] dVarArrK = this.f9102b.k();
            if (dVarArrK == null) {
                dVarArrK = new nb.d[0];
            }
            x.e eVar = new x.e(dVarArrK.length);
            for (nb.d dVar2 : dVarArrK) {
                eVar.put(dVar2.f29892a, Long.valueOf(dVar2.a()));
            }
            int length = dVarArrB.length;
            for (int i4 = 0; i4 < length; i4++) {
                dVar = dVarArrB[i4];
                Long l10 = (Long) eVar.get(dVar.f29892a);
                if (l10 == null || l10.longValue() < dVar.a()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            yb.i iVar2 = this.f9104d;
            ob.c cVar2 = this.f9102b;
            sVar.f(iVar2, cVar2.m());
            try {
                sVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                S(1);
                cVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f9102b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f29892a + ", " + dVar.a() + ").");
        if (!this.f9111m.f9093n || !sVar.a(this)) {
            sVar.d(new ob.k(dVar));
            return true;
        }
        o oVar = new o(this.f9103c, dVar);
        int iIndexOf = this.j.indexOf(oVar);
        if (iIndexOf >= 0) {
            o oVar2 = (o) this.j.get(iIndexOf);
            this.f9111m.f9092m.removeMessages(15, oVar2);
            ac.k kVar = this.f9111m.f9092m;
            kVar.sendMessageDelayed(Message.obtain(kVar, 15, oVar2), 5000L);
        } else {
            this.j.add(oVar);
            ac.k kVar2 = this.f9111m.f9092m;
            kVar2.sendMessageDelayed(Message.obtain(kVar2, 15, oVar), 5000L);
            ac.k kVar3 = this.f9111m.f9092m;
            kVar3.sendMessageDelayed(Message.obtain(kVar3, 16, oVar), 120000L);
            nb.b bVar = new nb.b(2, null, null);
            if (!i(bVar)) {
                this.f9111m.b(bVar, this.g);
            }
        }
        return false;
    }

    public final boolean i(nb.b bVar) {
        synchronized (d.f9080q) {
        }
        return false;
    }

    public final void j() {
        d dVar = this.f9111m;
        pb.y.c(dVar.f9092m);
        ob.c cVar = this.f9102b;
        if (cVar.g() || cVar.c()) {
            return;
        }
        try {
            km.n nVar = dVar.g;
            Context context = dVar.f9086e;
            SparseIntArray sparseIntArray = (SparseIntArray) nVar.f28442b;
            pb.y.h(context);
            int iJ = cVar.j();
            int iC = ((SparseIntArray) nVar.f28442b).get(iJ, -1);
            if (iC == -1) {
                iC = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i4);
                    if (iKeyAt > iJ && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (iC == -1) {
                    iC = ((nb.e) nVar.f28443c).c(iJ, context);
                }
                sparseIntArray.put(iJ, iC);
            }
            if (iC != 0) {
                nb.b bVar = new nb.b(iC, null, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                l(bVar, null);
                return;
            }
            p pVar = new p();
            pVar.f9119f = dVar;
            pVar.f9117d = null;
            pVar.f9118e = null;
            pVar.f9114a = false;
            pVar.f9115b = cVar;
            pVar.f9116c = this.f9103c;
            if (cVar.m()) {
                w wVar = this.f9107h;
                pb.y.h(wVar);
                Handler handler = wVar.f9137c;
                va.o oVar = wVar.f9140f;
                hc.a aVar = wVar.g;
                if (aVar != null) {
                    aVar.f();
                }
                oVar.g = Integer.valueOf(System.identityHashCode(wVar));
                wVar.g = (hc.a) wVar.f9138d.d(wVar.f9136b, handler.getLooper(), oVar, (gc.a) oVar.f36150f, wVar, wVar);
                wVar.f9141h = pVar;
                Set set = wVar.f9139e;
                if (set == null || set.isEmpty()) {
                    handler.post(new b5.o(7, wVar));
                } else {
                    hc.a aVar2 = wVar.g;
                    aVar2.getClass();
                    aVar2.d(new pb.k((pb.e) aVar2));
                }
            }
            try {
                cVar.d(pVar);
            } catch (SecurityException e2) {
                l(new nb.b(10, null, null), e2);
            }
        } catch (IllegalStateException e10) {
            l(new nb.b(10, null, null), e10);
        }
    }

    public final void k(s sVar) {
        pb.y.c(this.f9111m.f9092m);
        boolean zG = this.f9102b.g();
        LinkedList linkedList = this.f9101a;
        if (zG) {
            if (h(sVar)) {
                g();
                return;
            } else {
                linkedList.add(sVar);
                return;
            }
        }
        linkedList.add(sVar);
        nb.b bVar = this.f9109k;
        if (bVar == null || bVar.f29885b == 0 || bVar.f29886c == null) {
            j();
        } else {
            l(bVar, null);
        }
    }

    public final void l(nb.b bVar, RuntimeException runtimeException) {
        hc.a aVar;
        pb.y.c(this.f9111m.f9092m);
        w wVar = this.f9107h;
        if (wVar != null && (aVar = wVar.g) != null) {
            aVar.f();
        }
        pb.y.c(this.f9111m.f9092m);
        this.f9109k = null;
        ((SparseIntArray) this.f9111m.g.f28442b).clear();
        a(bVar);
        if ((this.f9102b instanceof rb.c) && bVar.f29885b != 24) {
            d dVar = this.f9111m;
            dVar.f9083b = true;
            ac.k kVar = dVar.f9092m;
            kVar.sendMessageDelayed(kVar.obtainMessage(19), 300000L);
        }
        if (bVar.f29885b == 4) {
            b(d.f9079p);
            return;
        }
        if (this.f9101a.isEmpty()) {
            this.f9109k = bVar;
            return;
        }
        if (runtimeException != null) {
            pb.y.c(this.f9111m.f9092m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f9111m.f9093n) {
            b(d.c(this.f9103c, bVar));
            return;
        }
        c(d.c(this.f9103c, bVar), null, true);
        if (this.f9101a.isEmpty() || i(bVar) || this.f9111m.b(bVar, this.g)) {
            return;
        }
        if (bVar.f29885b == 18) {
            this.f9108i = true;
        }
        if (!this.f9108i) {
            b(d.c(this.f9103c, bVar));
            return;
        }
        d dVar2 = this.f9111m;
        a aVar2 = this.f9103c;
        ac.k kVar2 = dVar2.f9092m;
        kVar2.sendMessageDelayed(Message.obtain(kVar2, 9, aVar2), 5000L);
    }

    public final void m(nb.b bVar) {
        pb.y.c(this.f9111m.f9092m);
        ob.c cVar = this.f9102b;
        cVar.b("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    public final void n() {
        pb.y.c(this.f9111m.f9092m);
        Status status = d.f9078o;
        b(status);
        this.f9104d.S(false, status);
        for (h hVar : (h[]) this.f9106f.keySet().toArray(new h[0])) {
            k(new y(new TaskCompletionSource()));
        }
        a(new nb.b(4, null, null));
        ob.c cVar = this.f9102b;
        if (cVar.g()) {
            cVar.h(new o7.d(8, this));
        }
    }
}
