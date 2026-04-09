package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class uym implements View.OnTouchListener {
    private static int xq = 10;
    private int bw;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw dg;
    private float emc;
    private float ypw;
    private RectF ycc = new RectF();
    private long uym = 0;
    private final int msw = TTAdConstant.MATE_VALID;
    private final int zz = 3;
    private SoftReference<View> ru = new SoftReference<>(null);

    public uym(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar, int i, final ViewGroup viewGroup) {
        this.bw = xq;
        this.dg = mswVar;
        if (i > 0) {
            this.bw = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.emc.uym.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    uym.this.ru = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar;
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar2;
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
            int iYpw = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), Math.abs(rawX - this.emc));
            int i = xq;
            if (fAbs < i || fAbs2 < i) {
                if ((System.currentTimeMillis() - this.uym < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (mswVar = this.dg) != null) {
                    mswVar.emc();
                }
            } else if (rawX > this.emc && iYpw > this.bw && (mswVar2 = this.dg) != null) {
                mswVar2.emc();
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
        return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
    }
}
