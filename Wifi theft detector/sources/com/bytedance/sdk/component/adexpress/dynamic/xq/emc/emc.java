package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class emc implements View.OnTouchListener {
    private static int xq = 10;
    private int bw;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw dg;
    private float emc;
    private float ypw;
    private RectF ycc = new RectF();
    private long uym = 0;
    private final int msw = 200;
    private final int zz = 3;
    private SoftReference<ViewGroup> ru = new SoftReference<>(null);

    public emc(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar, int i10, final ViewGroup viewGroup) {
        this.bw = xq;
        this.dg = mswVar;
        if (i10 > 0) {
            this.bw = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.emc.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.ru = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ycc = emc(this.ru.get());
            this.emc = motionEvent.getRawX();
            this.ypw = motionEvent.getRawY();
            this.uym = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.ycc;
            if (rectF != null && !rectF.contains(this.emc, this.ypw)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.emc);
            float fAbs2 = Math.abs(rawY - this.ypw);
            int i10 = this.bw;
            if (fAbs >= i10 && fAbs2 >= i10) {
                com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar2 = this.dg;
                if (mswVar2 != null) {
                    mswVar2.emc();
                }
            } else if ((System.currentTimeMillis() - this.uym < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (mswVar = this.dg) != null) {
                mswVar.emc();
            }
        }
        return true;
    }

    private RectF emc(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }
}
