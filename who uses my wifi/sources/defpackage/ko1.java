package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ko1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public ko1(h83 h83Var, a83 a83Var, fn2 fn2Var, qn2 qn2Var, s63 s63Var, rm2 rm2Var, po2 po2Var, sn2 sn2Var, sp2 sp2Var, gm2 gm2Var, xv2 xv2Var) {
        this.a = h83Var;
        this.b = a83Var;
        this.c = fn2Var;
        this.d = qn2Var;
        this.e = s63Var;
        this.f = rm2Var;
        this.g = po2Var;
        this.h = sn2Var;
        this.i = sp2Var;
        this.j = gm2Var;
        this.k = xv2Var;
    }

    public void a() {
        bo1 bo1Var = (bo1) this.h;
        if (bo1Var != null) {
            bo1Var.i = true;
            bo1Var.interrupt();
        }
        fo1[] fo1VarArr = (fo1[]) this.g;
        for (int i = 0; i < 4; i++) {
            fo1 fo1Var = fo1VarArr[i];
            if (fo1Var != null) {
                fo1Var.i = true;
                fo1Var.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.d;
        wo1 wo1Var = (wo1) this.e;
        f20 f20Var = (f20) this.k;
        bo1 bo1Var2 = new bo1(priorityBlockingQueue, priorityBlockingQueue2, wo1Var, f20Var);
        this.h = bo1Var2;
        bo1Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            fo1 fo1Var2 = new fo1(priorityBlockingQueue2, (vq2) this.f, wo1Var, f20Var);
            fo1VarArr[i2] = fo1Var2;
            fo1Var2.start();
        }
    }

    public void b(jo1 jo1Var) {
        jo1Var.m = this;
        HashSet hashSet = (HashSet) this.b;
        synchronized (hashSet) {
            hashSet.add(jo1Var);
        }
        jo1Var.l = Integer.valueOf(((AtomicInteger) this.a).incrementAndGet());
        jo1Var.a("add-to-queue");
        c();
        ((PriorityBlockingQueue) this.c).add(jo1Var);
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ko1(wo1 wo1Var, vq2 vq2Var) {
        f20 f20Var = new f20(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = wo1Var;
        this.f = vq2Var;
        this.g = new fo1[4];
        this.k = f20Var;
    }
}
