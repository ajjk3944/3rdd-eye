package com.bytedance.sdk.component.adexpress.vt;

import com.bytedance.sdk.component.adexpress.vt.tlj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl implements tlj.ouw {

    /* renamed from: lh, reason: collision with root package name */
    private bly f7414lh;
    ko ouw;
    private List<tlj> vt;
    private AtomicBoolean yu = new AtomicBoolean(false);

    public ryl(List<tlj> list, bly blyVar) {
        this.vt = list;
        this.f7414lh = blyVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void lh() {
        this.yu.getAndSet(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void ouw() {
        this.f7414lh.yu();
        Iterator<tlj> it = this.vt.iterator();
        if (it.hasNext()) {
            it.next().ouw(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final boolean vt(tlj tljVar) {
        int iIndexOf = this.vt.indexOf(tljVar);
        return iIndexOf < this.vt.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final boolean yu() {
        return this.yu.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final ko vt() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void ouw(tlj tljVar) {
        int i4;
        int iIndexOf = this.vt.indexOf(tljVar);
        if (iIndexOf >= 0 && (i4 = iIndexOf + 1) < this.vt.size()) {
            this.vt.get(i4).ouw(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void ouw(ko koVar) {
        this.ouw = koVar;
    }
}
