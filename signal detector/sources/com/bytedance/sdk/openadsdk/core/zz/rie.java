package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.sup;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class rie extends GestureDetector {
    private final emc emc;
    private final com.bytedance.sdk.openadsdk.core.xq.ycc ypw;

    public static class emc extends GestureDetector.SimpleOnGestureListener {
        boolean emc = false;

        public void emc() {
            this.emc = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.emc = true;
            return super.onSingleTapUp(motionEvent);
        }

        public boolean ypw() {
            return this.emc;
        }
    }

    public rie(Context context) {
        this(context, new emc());
    }

    public void emc() {
        this.emc.emc();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.ypw.emc(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public boolean ypw() {
        return this.emc.ypw();
    }

    public rie(Context context, emc emcVar) {
        super(context, emcVar);
        this.emc = emcVar;
        this.ypw = new com.bytedance.sdk.openadsdk.core.xq.ycc();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.sup emc(Context context, View view) {
        if (this.ypw == null) {
            return new sup.emc().emc();
        }
        return new sup.emc().ycc(this.ypw.emc).bw(this.ypw.ypw).dg(this.ypw.xq).xq(this.ypw.dg).ypw(this.ypw.bw).emc(this.ypw.ycc).emc(vw.emc(view)).ypw(vw.xq(view)).dg(this.ypw.uym).bw(this.ypw.msw).ycc(this.ypw.zz).emc(this.ypw.sup).ypw(com.bytedance.sdk.openadsdk.core.zz.ypw().emc() ? 1 : 2).emc("vessel").emc(vw.msw(context)).xq(vw.ru(context)).ypw(vw.zz(context)).emc();
    }
}
