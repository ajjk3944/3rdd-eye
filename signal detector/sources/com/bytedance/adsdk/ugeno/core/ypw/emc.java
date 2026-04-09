package com.bytedance.adsdk.ugeno.core.ypw;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class emc {
    public String emc = "GesThrough_";
    private List<MotionEvent> ypw = new ArrayList();
    private Set<String> xq = Collections.synchronizedSet(new HashSet());

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, MotionEvent motionEvent) {
        if (xqVar == null || motionEvent == null || this.ypw == null) {
            return;
        }
        emc(xqVar.gbl(), xqVar.rtt(), motionEvent);
    }

    public void emc(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.ypw == null) {
            return;
        }
        this.emc = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i3 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.ypw.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i, i3);
        this.ypw.add(motionEventObtain);
    }

    public boolean emc(MotionEvent motionEvent) {
        if (motionEvent == null || this.xq == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.xq.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        if (this.ypw.isEmpty() || this.xq == null || xqVar == null || xqVar.gbl() == null || xqVar.gbl().getRootView() == null) {
            return;
        }
        emc(xqVar.gbl());
    }

    public void emc(View view) {
        if (this.ypw.isEmpty() || this.xq == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.emc, "Re-dispatch motionEvents.size(): " + this.ypw.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ypw.emc.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : emc.this.ypw) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        emc.this.xq.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                emc.this.ypw.clear();
            }
        }, 300L);
    }
}
