package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements View.OnTouchListener {

    /* renamed from: lh, reason: collision with root package name */
    private static int f7260lh = 10;
    private int fkw;
    private float ouw;
    private float vt;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno yu;

    /* renamed from: le, reason: collision with root package name */
    private RectF f7261le = new RectF();
    private long ra = 0;
    private final int pno = TTAdConstant.MATE_VALID;
    private final int bly = 3;
    private SoftReference<View> tlj = new SoftReference<>(null);

    public ra(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i4, final ViewGroup viewGroup) {
        this.fkw = f7260lh;
        this.yu = pnoVar;
        if (i4 > 0) {
            this.fkw = i4;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.ra.1
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    ra.this.tlj = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RectF rectF;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            View view2 = this.tlj.get();
            if (view2 == null) {
                rectF = new RectF();
            } else {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                rectF = new RectF(iArr[0], iArr[1], view2.getWidth() + r0, view2.getHeight() + iArr[1]);
            }
            this.f7261le = rectF;
            this.ouw = motionEvent.getRawX();
            this.vt = motionEvent.getRawY();
            this.ra = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF2 = this.f7261le;
            if (rectF2 != null && !rectF2.contains(this.ouw, this.vt)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.ouw);
            float fAbs2 = Math.abs(rawY - this.vt);
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(rawX - this.ouw));
            int i4 = f7260lh;
            if (fAbs < i4 || fAbs2 < i4) {
                if ((System.currentTimeMillis() - this.ra < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (pnoVar = this.yu) != null) {
                    pnoVar.ouw();
                }
            } else if (rawX > this.ouw && iVt > this.fkw && (pnoVar2 = this.yu) != null) {
                pnoVar2.ouw();
            }
        }
        return true;
    }
}
