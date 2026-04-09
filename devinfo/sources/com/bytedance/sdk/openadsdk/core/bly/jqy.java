package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.lh.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jqy extends GestureDetector {
    final ouw ouw;
    final com.bytedance.sdk.openadsdk.core.lh.le vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends GestureDetector.SimpleOnGestureListener {
        boolean ouw = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.ouw = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public jqy(Context context) {
        this(context, new ouw());
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i4;
        com.bytedance.sdk.openadsdk.core.lh.le leVar = this.vt;
        leVar.pno = motionEvent.getDeviceId();
        int i10 = 0;
        leVar.ra = motionEvent.getToolType(0);
        leVar.bly = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                leVar.f8197lh = motionEvent.getRawX();
                leVar.yu = motionEvent.getRawY();
                leVar.f8196le = System.currentTimeMillis();
                if (Math.abs(leVar.f8197lh - leVar.vm) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj || Math.abs(leVar.yu - leVar.f8198th) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj) {
                    leVar.f8195cf = false;
                }
                i4 = 3;
            } else if (actionMasked != 2) {
                i10 = actionMasked != 3 ? -1 : 4;
            } else {
                com.bytedance.sdk.openadsdk.core.lh.le.ko = Math.abs(motionEvent.getX() - com.bytedance.sdk.openadsdk.core.lh.le.mwh) + com.bytedance.sdk.openadsdk.core.lh.le.ko;
                com.bytedance.sdk.openadsdk.core.lh.le.rn = Math.abs(motionEvent.getY() - com.bytedance.sdk.openadsdk.core.lh.le.f8194jg) + com.bytedance.sdk.openadsdk.core.lh.le.rn;
                com.bytedance.sdk.openadsdk.core.lh.le.mwh = motionEvent.getX();
                com.bytedance.sdk.openadsdk.core.lh.le.f8194jg = motionEvent.getY();
                if (System.currentTimeMillis() - com.bytedance.sdk.openadsdk.core.lh.le.zih <= 200 || (com.bytedance.sdk.openadsdk.core.lh.le.ko <= com.bytedance.sdk.openadsdk.core.lh.le.tlj && com.bytedance.sdk.openadsdk.core.lh.le.rn <= com.bytedance.sdk.openadsdk.core.lh.le.tlj)) {
                    i11 = 2;
                }
                leVar.f8197lh = motionEvent.getRawX();
                leVar.yu = motionEvent.getRawY();
                if (Math.abs(leVar.f8197lh - leVar.vm) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj || Math.abs(leVar.yu - leVar.f8198th) >= com.bytedance.sdk.openadsdk.core.lh.le.tlj) {
                    leVar.f8195cf = false;
                }
                i4 = i11;
            }
            leVar.ryl.put(motionEvent.getActionMasked(), new lh.ouw(i4, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            return super.onTouchEvent(motionEvent);
        }
        leVar.vm = (int) motionEvent.getRawX();
        leVar.f8198th = (int) motionEvent.getRawY();
        leVar.ouw = motionEvent.getRawX();
        leVar.vt = motionEvent.getRawY();
        leVar.fkw = System.currentTimeMillis();
        leVar.ra = motionEvent.getToolType(0);
        leVar.pno = motionEvent.getDeviceId();
        leVar.bly = motionEvent.getSource();
        com.bytedance.sdk.openadsdk.core.lh.le.zih = System.currentTimeMillis();
        leVar.f8195cf = true;
        i4 = i10;
        leVar.ryl.put(motionEvent.getActionMasked(), new lh.ouw(i4, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return super.onTouchEvent(motionEvent);
    }

    private jqy(Context context, ouw ouwVar) {
        super(context, ouwVar);
        this.ouw = ouwVar;
        this.vt = new com.bytedance.sdk.openadsdk.core.lh.le();
        setIsLongpressEnabled(false);
    }
}
