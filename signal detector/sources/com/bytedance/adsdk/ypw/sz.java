package com.bytedance.adsdk.ypw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class sz<T> {
    public static Executor emc = Executors.newCachedThreadPool();
    private volatile sup<T> bw;
    private final Handler dg;
    private final Set<gbl<Throwable>> xq;
    private final Set<gbl<T>> ypw;

    public class emc extends FutureTask<sup<T>> {
        public emc(Callable<sup<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                sz.this.emc((sup) get());
            } catch (InterruptedException | ExecutionException e6) {
                sz.this.emc(new sup(e6));
            }
        }
    }

    public sz(Callable<sup<T>> callable) {
        this(callable, false);
    }

    public synchronized sz<T> dg(gbl<Throwable> gblVar) {
        this.xq.remove(gblVar);
        return this;
    }

    public synchronized sz<T> xq(gbl<Throwable> gblVar) {
        try {
            sup<T> supVar = this.bw;
            if (supVar != null && supVar.ypw() != null) {
                gblVar.emc(supVar.ypw());
            }
            this.xq.add(gblVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized sz<T> ypw(gbl<T> gblVar) {
        this.ypw.remove(gblVar);
        return this;
    }

    public sz(Callable<sup<T>> callable, boolean z6) {
        this.ypw = new LinkedHashSet(1);
        this.xq = new LinkedHashSet(1);
        this.dg = new Handler(Looper.getMainLooper());
        this.bw = null;
        if (!z6) {
            emc.execute(new emc(callable));
            return;
        }
        try {
            emc((sup) callable.call());
        } catch (Throwable th) {
            emc((sup) new sup<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(sup<T> supVar) {
        if (this.bw == null) {
            this.bw = supVar;
            emc();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized sz<T> emc(gbl<T> gblVar) {
        try {
            sup<T> supVar = this.bw;
            if (supVar != null && supVar.emc() != null) {
                gblVar.emc(supVar.emc());
            }
            this.ypw.add(gblVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void emc() {
        this.dg.post(new Runnable() { // from class: com.bytedance.adsdk.ypw.sz.1
            @Override // java.lang.Runnable
            public void run() {
                sup supVar = sz.this.bw;
                if (supVar == null) {
                    return;
                }
                if (supVar.emc() != null) {
                    sz.this.emc((sz) supVar.emc());
                } else {
                    sz.this.emc(supVar.ypw());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(T t6) {
        ArrayList arrayList = new ArrayList(this.ypw);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gbl) obj).emc(t6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(Throwable th) {
        ArrayList arrayList = new ArrayList(this.xq);
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gbl) obj).emc(th);
        }
    }
}
