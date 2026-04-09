package com.bytedance.adsdk.ugeno.bw;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class xq {

    /* renamed from: aa, reason: collision with root package name */
    boolean f9206aa;
    int bw;
    int cf;
    float gbl;
    int msw;
    float ru;
    boolean sba;
    int sup;
    int sz;
    int uym;
    int vk;
    int ycc;
    int zz;
    int emc = Integer.MAX_VALUE;
    int ypw = Integer.MAX_VALUE;
    int xq = Integer.MIN_VALUE;
    int dg = Integer.MIN_VALUE;
    List<Integer> qh = new ArrayList();

    public int emc() {
        return this.uym;
    }

    public int ypw() {
        return this.msw - this.zz;
    }

    public void emc(View view, int i10, int i11, int i12, int i13) {
        ypw ypwVar = (ypw) view.getLayoutParams();
        this.emc = Math.min(this.emc, (view.getLeft() - ypwVar.sz()) - i10);
        this.ypw = Math.min(this.ypw, (view.getTop() - ypwVar.qh()) - i11);
        this.xq = Math.max(this.xq, view.getRight() + ypwVar.cf() + i12);
        this.dg = Math.max(this.dg, view.getBottom() + ypwVar.vk() + i13);
    }
}
