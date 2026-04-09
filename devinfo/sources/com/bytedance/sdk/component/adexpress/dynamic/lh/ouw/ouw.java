package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements View.OnTouchListener {

    /* renamed from: lh, reason: collision with root package name */
    private static int f7256lh = 10;
    private int fkw;
    private float ouw;
    private float vt;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno yu;

    /* renamed from: le, reason: collision with root package name */
    private RectF f7257le = new RectF();
    private long ra = 0;
    private final int pno = TTAdConstant.MATE_VALID;
    private final int bly = 3;
    private SoftReference<ViewGroup> tlj = new SoftReference<>(null);

    public ouw(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i4, final ViewGroup viewGroup) {
        this.fkw = f7256lh;
        this.yu = pnoVar;
        if (i4 > 0) {
            this.fkw = i4;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.tlj = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RectF rectF;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewGroup viewGroup = this.tlj.get();
            if (viewGroup == null) {
                rectF = new RectF();
            } else {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                rectF = new RectF(iArr[0], iArr[1], viewGroup.getWidth() + r0, viewGroup.getHeight() + iArr[1]);
            }
            this.f7257le = rectF;
            this.ouw = motionEvent.getRawX();
            this.vt = motionEvent.getRawY();
            this.ra = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF2 = this.f7257le;
            if (rectF2 != null && !rectF2.contains(this.ouw, this.vt)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.ouw);
            float fAbs2 = Math.abs(rawY - this.vt);
            int i4 = this.fkw;
            if (fAbs < i4 || fAbs2 < i4) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.ra;
                ko.vt("limittouch", "d:" + jCurrentTimeMillis + " a:" + fAbs + " b:" + fAbs2);
                if ((jCurrentTimeMillis < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (pnoVar = this.yu) != null) {
                    pnoVar.ouw();
                }
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2 = this.yu;
                if (pnoVar2 != null) {
                    pnoVar2.ouw();
                }
            }
        }
        return true;
    }
}
