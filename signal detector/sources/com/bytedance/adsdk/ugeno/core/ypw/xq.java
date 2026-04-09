package com.bytedance.adsdk.ugeno.core.ypw;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.sz;

/* loaded from: classes.dex */
public class xq {
    private boolean bw;
    private Context dg;
    private float emc;
    private sz xq;
    private final int ycc;
    private float ypw;

    public xq(Context context, sz szVar) {
        this.dg = context;
        this.xq = szVar;
        this.ycc = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean emc(cf cfVar, com.bytedance.adsdk.ugeno.ypw.xq xqVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.emc = motionEvent.getX();
            this.ypw = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x6 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (Math.abs(x6 - this.emc) >= this.ycc || Math.abs(y3 - this.ypw) >= this.ycc) {
                    this.bw = true;
                }
            } else if (action == 3) {
                this.bw = false;
            }
        } else {
            if (this.bw) {
                this.bw = false;
                return false;
            }
            float x7 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (Math.abs(x7 - this.emc) >= this.ycc || Math.abs(y4 - this.ypw) >= this.ycc) {
                this.bw = false;
            } else if (cfVar != null) {
                cfVar.emc(this.xq, xqVar, xqVar);
                return true;
            }
        }
        return true;
    }
}
