package com.bytedance.sdk.component.msw;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class uym<V> extends FutureTask<V> implements Comparable<uym<V>> {
    private int emc;
    private int ypw;

    public uym(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.emc = i10 == -1 ? 5 : i10;
        this.ypw = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(uym uymVar) {
        if (emc() < uymVar.emc()) {
            return 1;
        }
        return emc() > uymVar.emc() ? -1 : 0;
    }

    public int emc() {
        return this.emc;
    }
}
