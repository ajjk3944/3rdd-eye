package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xb1 implements hz, iz {
    public final v4 g;
    public final c5 h;
    public final tb1 i;
    public final int l;
    public final kc1 m;
    public boolean n;
    public final /* synthetic */ jz r;
    public final LinkedList f = new LinkedList();
    public final HashSet j = new HashSet();
    public final HashMap k = new HashMap();
    public final ArrayList o = new ArrayList();
    public rh p = null;
    public int q = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public xb1(jz jzVar, ez ezVar) {
        this.r = jzVar;
        Looper looper = jzVar.r.getLooper();
        xb4 xb4VarA = ezVar.a();
        bu1 bu1Var = new bu1((u8) xb4VarA.g, (String) xb4VarA.h, (String) xb4VarA.i);
        qb1 qb1Var = (qb1) ezVar.h.g;
        ou1.j(qb1Var);
        v4 v4VarC = qb1Var.c(ezVar.f, looper, bu1Var, ezVar.i, this, this);
        String str = ezVar.g;
        if (str != null && (v4VarC instanceof w9)) {
            ((w9) v4VarC).s = str;
        }
        if (str != null && (v4VarC instanceof qh0)) {
            ga1.o(v4VarC);
            throw null;
        }
        this.g = v4VarC;
        this.h = ezVar.j;
        this.i = new tb1();
        this.l = ezVar.k;
        if (!v4VarC.l()) {
            this.m = null;
            return;
        }
        Context context = jzVar.j;
        wc1 wc1Var = jzVar.r;
        xb4 xb4VarA2 = ezVar.a();
        this.m = new kc1(context, wc1Var, new bu1((u8) xb4VarA2.g, (String) xb4VarA2.h, (String) xb4VarA2.i));
    }

    @Override // defpackage.hz
    public final void T(int i) {
        Looper looperMyLooper = Looper.myLooper();
        wc1 wc1Var = this.r.r;
        if (looperMyLooper == wc1Var.getLooper()) {
            f(i);
        } else {
            wc1Var.post(new cd(this, i, 4));
        }
    }

    @Override // defpackage.iz
    public final void U(rh rhVar) {
        l(rhVar, null);
    }

    @Override // defpackage.hz
    public final void Y() {
        Looper looperMyLooper = Looper.myLooper();
        wc1 wc1Var = this.r.r;
        if (looperMyLooper == wc1Var.getLooper()) {
            e();
        } else {
            wc1Var.post(new a9(19, this));
        }
    }

    public final void a(rh rhVar) {
        HashSet hashSet = this.j;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (a30.c(rhVar, rh.j)) {
                this.g.h();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        ou1.g(this.r.r);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        ou1.g(this.r.r);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            cc1 cc1Var = (cc1) it.next();
            if (!z || cc1Var.a == 2) {
                if (status != null) {
                    cc1Var.c(status);
                } else {
                    cc1Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cc1 cc1Var = (cc1) arrayList.get(i);
            if (!this.g.a()) {
                return;
            }
            if (h(cc1Var)) {
                linkedList.remove(cc1Var);
            }
        }
    }

    public final void e() {
        jz jzVar = this.r;
        ou1.g(jzVar.r);
        this.p = null;
        a(rh.j);
        wc1 wc1Var = jzVar.r;
        if (this.n) {
            c5 c5Var = this.h;
            wc1Var.removeMessages(11, c5Var);
            wc1Var.removeMessages(9, c5Var);
            this.n = false;
        }
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        jz jzVar = this.r;
        wc1 wc1Var = jzVar.r;
        ou1.g(jzVar.r);
        this.p = null;
        this.n = true;
        String strJ = this.g.j();
        tb1 tb1Var = this.i;
        tb1Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strJ);
        }
        tb1Var.a(true, new Status(20, sb.toString(), null, null));
        c5 c5Var = this.h;
        wc1Var.sendMessageDelayed(Message.obtain(wc1Var, 9, c5Var), 5000L);
        wc1Var.sendMessageDelayed(Message.obtain(wc1Var, 11, c5Var), 120000L);
        ((SparseIntArray) jzVar.l.g).clear();
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
    }

    public final void g() {
        jz jzVar = this.r;
        wc1 wc1Var = jzVar.r;
        c5 c5Var = this.h;
        wc1Var.removeMessages(12, c5Var);
        wc1Var.sendMessageDelayed(wc1Var.obtainMessage(12, c5Var), jzVar.f);
    }

    public final boolean h(cc1 cc1Var) throws Resources.NotFoundException {
        ju juVar;
        if (cc1Var == null) {
            tb1 tb1Var = this.i;
            v4 v4Var = this.g;
            cc1Var.f(tb1Var, v4Var.l());
            try {
                cc1Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                T(1);
                v4Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        ju[] juVarArrB = cc1Var.b(this);
        if (juVarArrB == null || juVarArrB.length == 0) {
            juVar = null;
        } else {
            ju[] juVarArrG = this.g.g();
            if (juVarArrG == null) {
                juVarArrG = new ju[0];
            }
            s8 s8Var = new s8(juVarArrG.length);
            for (ju juVar2 : juVarArrG) {
                s8Var.put(juVar2.f, Long.valueOf(juVar2.a()));
            }
            int length = juVarArrB.length;
            for (int i = 0; i < length; i++) {
                juVar = juVarArrB[i];
                Long l = (Long) s8Var.get(juVar.f);
                if (l == null || l.longValue() < juVar.a()) {
                    break;
                }
            }
            juVar = null;
        }
        if (juVar == null) {
            tb1 tb1Var2 = this.i;
            v4 v4Var2 = this.g;
            cc1Var.f(tb1Var2, v4Var2.l());
            try {
                cc1Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                T(1);
                v4Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        new StringBuilder(this.g.getClass().getName().length() + 77 + String.valueOf(juVar.f).length());
        if (!this.r.s || !cc1Var.a(this)) {
            cc1Var.d(new d41(juVar));
            return true;
        }
        yb1 yb1Var = new yb1(this.h, juVar);
        int iIndexOf = this.o.indexOf(yb1Var);
        if (iIndexOf >= 0) {
            yb1 yb1Var2 = (yb1) this.o.get(iIndexOf);
            this.r.r.removeMessages(15, yb1Var2);
            wc1 wc1Var = this.r.r;
            wc1Var.sendMessageDelayed(Message.obtain(wc1Var, 15, yb1Var2), 5000L);
        } else {
            this.o.add(yb1Var);
            wc1 wc1Var2 = this.r.r;
            wc1Var2.sendMessageDelayed(Message.obtain(wc1Var2, 15, yb1Var), 5000L);
            wc1 wc1Var3 = this.r.r;
            wc1Var3.sendMessageDelayed(Message.obtain(wc1Var3, 16, yb1Var), 120000L);
            rh rhVar = new rh(2, null);
            if (!i(rhVar)) {
                this.r.b(rhVar, this.l);
            }
        }
        return false;
    }

    public final boolean i(rh rhVar) {
        synchronized (jz.v) {
        }
        return false;
    }

    public final void j() {
        jz jzVar = this.r;
        ou1.g(jzVar.r);
        v4 v4Var = this.g;
        if (v4Var.a() || v4Var.f()) {
            return;
        }
        try {
            vq2 vq2Var = jzVar.l;
            Context context = jzVar.j;
            SparseIntArray sparseIntArray = (SparseIntArray) vq2Var.g;
            ou1.j(context);
            int iE = v4Var.e();
            int iC = ((SparseIntArray) vq2Var.g).get(iE, -1);
            if (iC == -1) {
                iC = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iE && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iC == -1) {
                    iC = ((fz) vq2Var.h).c(context, iE);
                }
                sparseIntArray.put(iE, iC);
            }
            if (iC != 0) {
                rh rhVar = new rh(iC, null);
                new StringBuilder(v4Var.getClass().getName().length() + 35 + rhVar.toString().length());
                l(rhVar, null);
                return;
            }
            zb1 zb1Var = new zb1();
            zb1Var.k = jzVar;
            zb1Var.i = null;
            zb1Var.j = null;
            zb1Var.f = false;
            zb1Var.g = v4Var;
            zb1Var.h = this.h;
            if (v4Var.l()) {
                kc1 kc1Var = this.m;
                ou1.j(kc1Var);
                Handler handler = kc1Var.h;
                bu1 bu1Var = kc1Var.k;
                yv0 yv0Var = kc1Var.l;
                if (yv0Var != null) {
                    yv0Var.k();
                }
                bu1Var.l = Integer.valueOf(System.identityHashCode(kc1Var));
                kc1Var.l = (yv0) kc1Var.i.c(kc1Var.g, handler.getLooper(), bu1Var, (zv0) bu1Var.k, kc1Var, kc1Var);
                kc1Var.m = zb1Var;
                Set set = kc1Var.j;
                if (set == null || set.isEmpty()) {
                    handler.post(new a9(21, kc1Var));
                } else {
                    yv0 yv0Var2 = kc1Var.l;
                    yv0Var2.getClass();
                    yv0Var2.i(new f23(2, yv0Var2));
                }
            }
            try {
                v4Var.i(zb1Var);
            } catch (SecurityException e) {
                l(new rh(10), e);
            }
        } catch (IllegalStateException e2) {
            l(new rh(10), e2);
        }
    }

    public final void k(cc1 cc1Var) {
        ou1.g(this.r.r);
        boolean zA = this.g.a();
        LinkedList linkedList = this.f;
        if (zA) {
            if (h(cc1Var)) {
                g();
                return;
            } else {
                linkedList.add(cc1Var);
                return;
            }
        }
        linkedList.add(cc1Var);
        rh rhVar = this.p;
        if (rhVar == null || rhVar.g == 0 || rhVar.h == null) {
            j();
        } else {
            l(rhVar, null);
        }
    }

    public final void l(rh rhVar, RuntimeException runtimeException) {
        yv0 yv0Var;
        ou1.g(this.r.r);
        kc1 kc1Var = this.m;
        if (kc1Var != null && (yv0Var = kc1Var.l) != null) {
            yv0Var.k();
        }
        ou1.g(this.r.r);
        this.p = null;
        ((SparseIntArray) this.r.l.g).clear();
        a(rhVar);
        if ((this.g instanceof vc1) && rhVar.g != 24) {
            jz jzVar = this.r;
            jzVar.g = true;
            wc1 wc1Var = jzVar.r;
            wc1Var.sendMessageDelayed(wc1Var.obtainMessage(19), 300000L);
        }
        if (rhVar.g == 4) {
            b(jz.u);
            return;
        }
        if (this.f.isEmpty()) {
            this.p = rhVar;
            return;
        }
        if (runtimeException != null) {
            ou1.g(this.r.r);
            c(null, runtimeException, false);
            return;
        }
        if (!this.r.s) {
            b(jz.c(this.h, rhVar));
            return;
        }
        c(jz.c(this.h, rhVar), null, true);
        if (this.f.isEmpty() || i(rhVar) || this.r.b(rhVar, this.l)) {
            return;
        }
        if (rhVar.g == 18) {
            this.n = true;
        }
        if (!this.n) {
            b(jz.c(this.h, rhVar));
        } else {
            wc1 wc1Var2 = this.r.r;
            wc1Var2.sendMessageDelayed(Message.obtain(wc1Var2, 9, this.h), 5000L);
        }
    }

    public final void m() {
        ou1.g(this.r.r);
        Status status = jz.t;
        b(status);
        this.i.a(false, status);
        for (s70 s70Var : (s70[]) this.k.keySet().toArray(new s70[0])) {
            k(new qc1(new k01()));
        }
        a(new rh(4));
        v4 v4Var = this.g;
        if (v4Var.a()) {
            v4Var.b(new z71(11, this));
        }
    }
}
