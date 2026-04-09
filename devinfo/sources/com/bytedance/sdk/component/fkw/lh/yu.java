package com.bytedance.sdk.component.fkw.lh;

import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.ra;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu<T> implements cf {
    private boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f7485cf;
    private int fkw;

    /* renamed from: le, reason: collision with root package name */
    private int f7486le;

    /* renamed from: lh, reason: collision with root package name */
    private T f7487lh;
    private String ouw;
    private boolean pno;
    private Map<String, String> ra;
    private ra tlj;
    private String vt;
    private T yu;

    @Override // com.bytedance.sdk.component.fkw.cf
    public final boolean fkw() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final boolean le() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T lh() {
        return this.yu;
    }

    public final yu ouw(lh lhVar, T t10, Map<String, String> map, boolean z3) {
        this.ra = map;
        this.pno = z3;
        this.f7487lh = t10;
        this.ouw = lhVar.vt;
        this.vt = lhVar.ouw;
        this.fkw = lhVar.ra;
        this.f7486le = lhVar.pno;
        this.bly = lhVar.qbp;
        this.tlj = lhVar.zin;
        this.f7485cf = lhVar.vpp;
        return this;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final int ra() {
        return this.f7485cf;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T vt() {
        return this.f7487lh;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final Map<String, String> yu() {
        return this.ra;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final String ouw() {
        return this.vt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.fkw.cf
    public final void ouw(Object obj) {
        this.yu = this.f7487lh;
        this.f7487lh = obj;
    }
}
