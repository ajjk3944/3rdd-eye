package com.bytedance.adsdk.ugeno.bw;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class xq {
    boolean aa;
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
    int xq = LinearLayoutManager.INVALID_OFFSET;
    int dg = LinearLayoutManager.INVALID_OFFSET;
    List<Integer> qh = new ArrayList();

    public int emc() {
        return this.uym;
    }

    public int ypw() {
        return this.msw - this.zz;
    }

    public void emc(View view, int i, int i3, int i6, int i7) {
        ypw ypwVar = (ypw) view.getLayoutParams();
        this.emc = Math.min(this.emc, (view.getLeft() - ypwVar.sz()) - i);
        this.ypw = Math.min(this.ypw, (view.getTop() - ypwVar.qh()) - i3);
        this.xq = Math.max(this.xq, ypwVar.cf() + view.getRight() + i6);
        this.dg = Math.max(this.dg, ypwVar.vk() + view.getBottom() + i7);
    }
}
