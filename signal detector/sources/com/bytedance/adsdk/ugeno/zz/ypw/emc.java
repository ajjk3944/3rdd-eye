package com.bytedance.adsdk.ugeno.zz.ypw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.dg;
import java.util.Map;

/* loaded from: classes.dex */
public class emc extends FrameLayout {
    private dg emc;
    private Map<Integer, sz> ypw;

    public emc(Context context) {
        super(context);
    }

    public void emc(dg dgVar) {
        this.emc = dgVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, sz> map = this.ypw;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.ycc();
        }
        super.onLayout(z6, i, i3, i6, i7);
        dg dgVar2 = this.emc;
        if (dgVar2 != null) {
            dgVar2.emc(i, i3, i6, i7);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        dg dgVar = this.emc;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i, i3);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i, i3);
        }
        dg dgVar2 = this.emc;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    public void setEventMap(Map<Integer, sz> map) {
        this.ypw = map;
    }
}
