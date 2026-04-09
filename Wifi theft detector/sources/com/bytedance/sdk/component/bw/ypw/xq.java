package com.bytedance.sdk.component.bw.ypw;

import com.bytedance.sdk.component.bw.uym;
import com.bytedance.sdk.component.bw.ycc;
import java.util.Map;

/* loaded from: classes.dex */
public class xq<T> implements ycc {
    private uym bw;
    private String dg;
    Map<String, String> emc;
    private T xq;
    private int ypw;

    public xq(int i10, T t10, String str) {
        this.ypw = i10;
        this.xq = t10;
        this.dg = str;
    }

    @Override // com.bytedance.sdk.component.bw.ycc
    public Map<String, String> bw() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.bw.ycc
    public String dg() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.bw.ycc
    public uym emc() {
        return this.bw;
    }

    @Override // com.bytedance.sdk.component.bw.ycc
    public T xq() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.bw.ycc
    public int ypw() {
        return this.ypw;
    }

    public void emc(uym uymVar) {
        this.bw = uymVar;
    }

    public xq(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.emc = map;
    }
}
