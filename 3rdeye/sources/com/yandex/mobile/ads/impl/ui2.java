package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nm;
import com.yandex.mobile.ads.impl.op1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
final class ui2 implements op1.b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f34070a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final zq1 f34071b;

    /* renamed from: c, reason: collision with root package name */
    private final sm f34072c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f34073d;

    public ui2(sm smVar, PriorityBlockingQueue priorityBlockingQueue, zq1 zq1Var) {
        this.f34071b = zq1Var;
        this.f34072c = smVar;
        this.f34073d = priorityBlockingQueue;
    }

    public final synchronized boolean a(op1<?> op1Var) {
        try {
            String strD = op1Var.d();
            if (!this.f34070a.containsKey(strD)) {
                this.f34070a.put(strD, null);
                op1Var.a((op1.b) this);
                if (gi2.f27765a) {
                    fp0.a(strD);
                }
                return false;
            }
            List arrayList = (List) this.f34070a.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            op1Var.a("waiting-for-response");
            arrayList.add(op1Var);
            this.f34070a.put(strD, arrayList);
            if (gi2.f27765a) {
                fp0.a(strD);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(op1<?> op1Var) {
        BlockingQueue<op1<?>> blockingQueue;
        try {
            String strD = op1Var.d();
            List list = (List) this.f34070a.remove(strD);
            if (list != null && !list.isEmpty()) {
                if (gi2.f27765a) {
                    fp0.e(Integer.valueOf(list.size()), strD);
                }
                op1<?> op1Var2 = (op1) list.remove(0);
                this.f34070a.put(strD, list);
                op1Var2.a((op1.b) this);
                if (this.f34072c != null && (blockingQueue = this.f34073d) != null) {
                    try {
                        blockingQueue.put(op1Var2);
                    } catch (InterruptedException e4) {
                        fp0.b(e4.toString());
                        Thread.currentThread().interrupt();
                        this.f34072c.b();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(op1<?> op1Var, rq1<?> rq1Var) {
        List list;
        nm.a aVar = rq1Var.f32764b;
        if (aVar != null && aVar.f30933e >= System.currentTimeMillis()) {
            String strD = op1Var.d();
            synchronized (this) {
                list = (List) this.f34070a.remove(strD);
            }
            if (list != null) {
                if (gi2.f27765a) {
                    fp0.e(Integer.valueOf(list.size()), strD);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((c60) this.f34071b).a((op1) it.next(), rq1Var, null);
                }
                return;
            }
            return;
        }
        b(op1Var);
    }
}
