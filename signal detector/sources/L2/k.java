package L2;

import M2.AbstractC0165e;
import a3.C0272a;
import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import b3.C0331a;
import com.google.android.gms.common.api.Status;
import h0.C2351a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import q2.C2834o;
import u.C2936e;
import u.C2937f;

/* loaded from: classes.dex */
public final class k implements K2.g, K2.h {

    /* renamed from: b, reason: collision with root package name */
    public final K2.c f2523b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2524c;

    /* renamed from: d, reason: collision with root package name */
    public final V2.h f2525d;

    /* renamed from: g, reason: collision with root package name */
    public final int f2528g;

    /* renamed from: h, reason: collision with root package name */
    public final t f2529h;
    public boolean i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f2533m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f2522a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2526e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2527f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2530j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public J2.b f2531k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f2532l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public k(c cVar, K2.f fVar) {
        this.f2533m = cVar;
        Looper looper = cVar.f2517m.getLooper();
        V2.e eVarA = fVar.a();
        C2834o c2834o = new C2834o((C2937f) eVarA.f3868b, (String) eVarA.f3869c, (String) eVarA.f3870d);
        T2.g gVar = (T2.g) fVar.f2152c.f20441b;
        M2.u.e(gVar);
        K2.c cVarA = gVar.a(fVar.f2150a, looper, c2834o, fVar.f2153d, this, this);
        String str = fVar.f2151b;
        if (str != null && (cVarA instanceof AbstractC0165e)) {
            ((AbstractC0165e) cVarA).f2750s = str;
        }
        if (str != null && (cVarA instanceof f)) {
            A.f.s(cVarA);
            throw null;
        }
        this.f2523b = cVarA;
        this.f2524c = fVar.f2154e;
        this.f2525d = new V2.h(5);
        this.f2528g = fVar.f2155f;
        if (!cVarA.m()) {
            this.f2529h = null;
            return;
        }
        Context context = cVar.f2510e;
        W2.e eVar = cVar.f2517m;
        V2.e eVarA2 = fVar.a();
        this.f2529h = new t(context, eVar, new C2834o((C2937f) eVarA2.f3868b, (String) eVarA2.f3869c, (String) eVarA2.f3870d));
    }

    public final void a(J2.b bVar) {
        HashSet hashSet = this.f2526e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (M2.u.g(bVar, J2.b.f2043f)) {
                this.f2523b.e();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        M2.u.b(this.f2533m.f2517m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z6) {
        M2.u.b(this.f2533m.f2517m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2522a.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (!z6 || pVar.f2544a == 2) {
                if (status != null) {
                    pVar.c(status);
                } else {
                    pVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f2522a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            if (!this.f2523b.i()) {
                return;
            }
            if (h(pVar)) {
                linkedList.remove(pVar);
            }
        }
    }

    public final void e() {
        c cVar = this.f2533m;
        M2.u.b(cVar.f2517m);
        this.f2531k = null;
        a(J2.b.f2043f);
        W2.e eVar = cVar.f2517m;
        if (this.i) {
            a aVar = this.f2524c;
            eVar.removeMessages(11, aVar);
            eVar.removeMessages(9, aVar);
            this.i = false;
        }
        Iterator it = this.f2527f.values().iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        c cVar = this.f2533m;
        W2.e eVar = cVar.f2517m;
        M2.u.b(cVar.f2517m);
        this.f2531k = null;
        this.i = true;
        String strL = this.f2523b.l();
        V2.h hVar = this.f2525d;
        hVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strL != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strL);
        }
        hVar.A(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f2524c;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, aVar), 5000L);
        eVar.sendMessageDelayed(Message.obtain(eVar, 11, aVar), 120000L);
        ((SparseIntArray) cVar.f2512g.f20441b).clear();
        Iterator it = this.f2527f.values().iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
    }

    public final void g() {
        c cVar = this.f2533m;
        W2.e eVar = cVar.f2517m;
        a aVar = this.f2524c;
        eVar.removeMessages(12, aVar);
        eVar.sendMessageDelayed(eVar.obtainMessage(12, aVar), cVar.f2506a);
    }

    @Override // K2.g
    public final void g0(int i) {
        Looper looperMyLooper = Looper.myLooper();
        W2.e eVar = this.f2533m.f2517m;
        if (looperMyLooper == eVar.getLooper()) {
            f(i);
        } else {
            eVar.post(new A3.h(i, 2, this));
        }
    }

    public final boolean h(p pVar) throws Resources.NotFoundException {
        J2.d dVar;
        if (pVar == null) {
            V2.h hVar = this.f2525d;
            K2.c cVar = this.f2523b;
            pVar.f(hVar, cVar.m());
            try {
                pVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                g0(1);
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        J2.d[] dVarArrB = pVar.b(this);
        if (dVarArrB == null || dVarArrB.length == 0) {
            dVar = null;
        } else {
            J2.d[] dVarArrK = this.f2523b.k();
            if (dVarArrK == null) {
                dVarArrK = new J2.d[0];
            }
            C2936e c2936e = new C2936e(dVarArrK.length);
            for (J2.d dVar2 : dVarArrK) {
                c2936e.put(dVar2.f2052a, Long.valueOf(dVar2.a()));
            }
            int length = dVarArrB.length;
            for (int i = 0; i < length; i++) {
                dVar = dVarArrB[i];
                Long l2 = (Long) c2936e.get(dVar.f2052a);
                if (l2 == null || l2.longValue() < dVar.a()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            V2.h hVar2 = this.f2525d;
            K2.c cVar2 = this.f2523b;
            pVar.f(hVar2, cVar2.m());
            try {
                pVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                g0(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f2523b.getClass().getName();
        String str = dVar.f2052a;
        long jA = dVar.a();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        A.f.w(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f2533m.f2518n || !pVar.a(this)) {
            pVar.d(new K2.k(dVar));
            return true;
        }
        l lVar = new l(this.f2524c, dVar);
        int iIndexOf = this.f2530j.indexOf(lVar);
        if (iIndexOf >= 0) {
            l lVar2 = (l) this.f2530j.get(iIndexOf);
            this.f2533m.f2517m.removeMessages(15, lVar2);
            W2.e eVar = this.f2533m.f2517m;
            eVar.sendMessageDelayed(Message.obtain(eVar, 15, lVar2), 5000L);
        } else {
            this.f2530j.add(lVar);
            W2.e eVar2 = this.f2533m.f2517m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, lVar), 5000L);
            W2.e eVar3 = this.f2533m.f2517m;
            eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, lVar), 120000L);
            J2.b bVar = new J2.b(2, null, null);
            if (!i(bVar)) {
                this.f2533m.b(bVar, this.f2528g);
            }
        }
        return false;
    }

    @Override // K2.g
    public final void h0() {
        Looper looperMyLooper = Looper.myLooper();
        W2.e eVar = this.f2533m.f2517m;
        if (looperMyLooper == eVar.getLooper()) {
            e();
        } else {
            eVar.post(new C0.k(1, this));
        }
    }

    public final boolean i(J2.b bVar) {
        synchronized (c.f2504E) {
        }
        return false;
    }

    public final void j() {
        c cVar = this.f2533m;
        M2.u.b(cVar.f2517m);
        K2.c cVar2 = this.f2523b;
        if (cVar2.i() || cVar2.d()) {
            return;
        }
        try {
            C2351a c2351a = cVar.f2512g;
            Context context = cVar.f2510e;
            SparseIntArray sparseIntArray = (SparseIntArray) c2351a.f20441b;
            M2.u.e(context);
            int iJ = cVar2.j();
            int iC = ((SparseIntArray) c2351a.f20441b).get(iJ, -1);
            if (iC == -1) {
                iC = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iJ && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iC == -1) {
                    iC = ((J2.e) c2351a.f20442c).c(context, iJ);
                }
                sparseIntArray.put(iJ, iC);
            }
            if (iC != 0) {
                J2.b bVar = new J2.b(iC, null, null);
                String name = cVar2.getClass().getName();
                String string = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                l(bVar, null);
                return;
            }
            m mVar = new m();
            mVar.f2541f = cVar;
            mVar.f2539d = null;
            mVar.f2540e = null;
            mVar.f2536a = false;
            mVar.f2537b = cVar2;
            mVar.f2538c = this.f2524c;
            if (cVar2.m()) {
                t tVar = this.f2529h;
                M2.u.e(tVar);
                Handler handler = tVar.f2558c;
                C2834o c2834o = tVar.f2561f;
                C0331a c0331a = tVar.f2562g;
                if (c0331a != null) {
                    c0331a.h();
                }
                c2834o.f23257g = Integer.valueOf(System.identityHashCode(tVar));
                tVar.f2562g = (C0331a) tVar.f2559d.a(tVar.f2557b, handler.getLooper(), c2834o, (C0272a) c2834o.f23256f, tVar, tVar);
                tVar.f2563h = mVar;
                Set set = tVar.f2560e;
                if (set == null || set.isEmpty()) {
                    handler.post(new C0.k(3, tVar));
                } else {
                    C0331a c0331a2 = tVar.f2562g;
                    c0331a2.getClass();
                    c0331a2.f(new M2.k((AbstractC0165e) c0331a2));
                }
            }
            try {
                cVar2.f(mVar);
            } catch (SecurityException e6) {
                l(new J2.b(10, null, null), e6);
            }
        } catch (IllegalStateException e7) {
            l(new J2.b(10, null, null), e7);
        }
    }

    public final void k(p pVar) {
        M2.u.b(this.f2533m.f2517m);
        boolean zI = this.f2523b.i();
        LinkedList linkedList = this.f2522a;
        if (zI) {
            if (h(pVar)) {
                g();
                return;
            } else {
                linkedList.add(pVar);
                return;
            }
        }
        linkedList.add(pVar);
        J2.b bVar = this.f2531k;
        if (bVar == null || bVar.f2045b == 0 || bVar.f2046c == null) {
            j();
        } else {
            l(bVar, null);
        }
    }

    @Override // K2.h
    public final void k0(J2.b bVar) {
        l(bVar, null);
    }

    public final void l(J2.b bVar, RuntimeException runtimeException) {
        C0331a c0331a;
        M2.u.b(this.f2533m.f2517m);
        t tVar = this.f2529h;
        if (tVar != null && (c0331a = tVar.f2562g) != null) {
            c0331a.h();
        }
        M2.u.b(this.f2533m.f2517m);
        this.f2531k = null;
        ((SparseIntArray) this.f2533m.f2512g.f20441b).clear();
        a(bVar);
        if ((this.f2523b instanceof O2.d) && bVar.f2045b != 24) {
            c cVar = this.f2533m;
            cVar.f2507b = true;
            W2.e eVar = cVar.f2517m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f2045b == 4) {
            b(c.f2503D);
            return;
        }
        if (this.f2522a.isEmpty()) {
            this.f2531k = bVar;
            return;
        }
        if (runtimeException != null) {
            M2.u.b(this.f2533m.f2517m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f2533m.f2518n) {
            b(c.c(this.f2524c, bVar));
            return;
        }
        c(c.c(this.f2524c, bVar), null, true);
        if (this.f2522a.isEmpty() || i(bVar) || this.f2533m.b(bVar, this.f2528g)) {
            return;
        }
        if (bVar.f2045b == 18) {
            this.i = true;
        }
        if (!this.i) {
            b(c.c(this.f2524c, bVar));
        } else {
            W2.e eVar2 = this.f2533m.f2517m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, this.f2524c), 5000L);
        }
    }

    public final void m() {
        M2.u.b(this.f2533m.f2517m);
        Status status = c.f2502C;
        b(status);
        this.f2525d.A(false, status);
        for (e eVar : (e[]) this.f2527f.keySet().toArray(new e[0])) {
            k(new v(new c3.f()));
        }
        a(new J2.b(4, null, null));
        K2.c cVar = this.f2523b;
        if (cVar.i()) {
            cVar.g(new A0.e(8, this));
        }
    }
}
