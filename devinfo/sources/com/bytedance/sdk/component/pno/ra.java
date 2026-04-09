package com.bytedance.sdk.component.pno;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra<V> extends FutureTask<V> implements Comparable<ra<V>> {
    private int ouw;
    private int vt;

    public ra(Callable<V> callable) {
        super(callable);
        this.ouw = 5;
        this.vt = 2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i4 = this.ouw;
        int i10 = ((ra) obj).ouw;
        if (i4 < i10) {
            return 1;
        }
        return i4 > i10 ? -1 : 0;
    }
}
