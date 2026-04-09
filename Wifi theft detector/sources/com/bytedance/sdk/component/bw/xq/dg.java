package com.bytedance.sdk.component.bw.xq;

import com.bytedance.sdk.component.bw.gbl;
import java.util.Map;

/* loaded from: classes.dex */
public class dg<T> implements gbl {
    private int bw;
    private T dg;
    private String emc;
    private int gbl;
    private boolean msw;
    private com.bytedance.sdk.component.bw.uym ru;
    private Map<String, String> uym;
    private T xq;
    private int ycc;
    private String ypw;
    private boolean zz;

    @Override // com.bytedance.sdk.component.bw.gbl
    public boolean bw() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.component.bw.gbl
    public Map<String, String> dg() {
        return this.uym;
    }

    public dg emc(xq xqVar, T t10) {
        this.xq = t10;
        this.emc = xqVar.ru();
        this.ypw = xqVar.emc();
        this.bw = xqVar.ypw();
        this.ycc = xqVar.xq();
        this.zz = xqVar.cf();
        this.ru = xqVar.vk();
        this.gbl = xqVar.aa();
        return this;
    }

    @Override // com.bytedance.sdk.component.bw.gbl
    public int uym() {
        return this.gbl;
    }

    @Override // com.bytedance.sdk.component.bw.gbl
    public T xq() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.bw.gbl
    public boolean ycc() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.component.bw.gbl
    public T ypw() {
        return this.xq;
    }

    public dg emc(xq xqVar, T t10, Map<String, String> map, boolean z10) {
        this.uym = map;
        this.msw = z10;
        return emc(xqVar, t10);
    }

    @Override // com.bytedance.sdk.component.bw.gbl
    public String emc() {
        return this.ypw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.bw.gbl
    public void emc(Object obj) {
        this.dg = this.xq;
        this.xq = obj;
    }
}
