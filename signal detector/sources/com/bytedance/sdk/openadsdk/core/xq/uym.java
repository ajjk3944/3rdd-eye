package com.bytedance.sdk.openadsdk.core.xq;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.utils.vk;

/* loaded from: classes.dex */
public abstract class uym extends xq {
    private final String emc;
    private xq xq;
    private final com.bytedance.sdk.openadsdk.core.sup.emc ypw;

    public uym(String str, com.bytedance.sdk.openadsdk.core.sup.emc emcVar) {
        this(str, emcVar, null);
    }

    public void emc(xq xqVar) {
        this.xq = xqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.xq, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public uym(String str, com.bytedance.sdk.openadsdk.core.sup.emc emcVar, xq xqVar) {
        this.emc = str;
        this.ypw = emcVar;
        this.xq = xqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
        com.bytedance.sdk.openadsdk.core.sup.emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.bw(this.emc);
        }
        if (view != null) {
            if (view.getId() == vk.bw) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == vk.zz) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.emc);
            }
        }
        xq xqVar = this.xq;
        if (xqVar != null) {
            xqVar.hxp = this.hxp;
            xqVar.ee = this.ee;
            xqVar.db = this.db;
            int i = this.db;
            xqVar.sb = i;
            xqVar.sf = i;
            xqVar.emc(view, f2, f5, f6, f7, sparseArray, z6);
        }
    }
}
