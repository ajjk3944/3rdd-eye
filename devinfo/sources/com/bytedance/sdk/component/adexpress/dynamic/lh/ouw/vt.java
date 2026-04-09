package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.lh.bly;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements View.OnTouchListener {
    private bly fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno f7262le;

    /* renamed from: lh, reason: collision with root package name */
    private long f7263lh;
    private float ouw;
    private float vt;
    private boolean yu;

    public vt(bly blyVar, com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar) {
        this.fkw = blyVar;
        this.f7262le = pnoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r6 = r7.getAction()
            r0 = 2
            java.lang.String r1 = "2"
            r2 = 1
            if (r6 == 0) goto L85
            if (r6 == r2) goto L43
            if (r6 == r0) goto L10
            goto Lcf
        L10:
            float r6 = r7.getX()
            float r7 = r7.getY()
            float r0 = r5.ouw
            float r6 = r6 - r0
            float r6 = java.lang.Math.abs(r6)
            android.content.Context r0 = com.bytedance.sdk.component.adexpress.yu.ouw()
            r3 = 1092616192(0x41200000, float:10.0)
            float r0 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(r0, r3)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L40
            float r6 = r5.vt
            float r7 = r7 - r6
            float r6 = java.lang.Math.abs(r7)
            android.content.Context r7 = com.bytedance.sdk.component.adexpress.yu.ouw()
            float r7 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(r7, r3)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto Lcf
        L40:
            r5.yu = r2
            goto L5e
        L43:
            boolean r6 = r5.yu
            if (r6 == 0) goto L49
            r6 = 0
            return r6
        L49:
            long r6 = java.lang.System.currentTimeMillis()
            long r3 = r5.f7263lh
            long r6 = r6 - r3
            r3 = 1500(0x5dc, double:7.41E-321)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 < 0) goto L5e
            com.bytedance.sdk.component.adexpress.dynamic.lh.pno r6 = r5.f7262le
            if (r6 == 0) goto Lcf
            r6.ouw()
            goto Lcf
        L5e:
            com.bytedance.sdk.component.adexpress.dynamic.lh.bly r6 = r5.fkw
            android.view.View r7 = r6.ouw
            if (r7 == 0) goto Lcf
            java.lang.String r7 = r6.f7249lh
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 == 0) goto Lcf
            android.view.View r6 = r6.ouw
            boolean r7 = r6 instanceof com.bytedance.sdk.component.adexpress.le.lh
            if (r7 == 0) goto Lcf
            com.bytedance.sdk.component.adexpress.le.lh r6 = (com.bytedance.sdk.component.adexpress.le.lh) r6
            com.bytedance.sdk.component.adexpress.le.zih r7 = r6.ouw
            android.animation.ValueAnimator r7 = r7.ouw
            if (r7 == 0) goto L7d
            r7.cancel()
        L7d:
            com.bytedance.sdk.component.adexpress.le.zih r6 = r6.ouw
            r6.f7370lh = r2
            r6.invalidate()
            goto Lcf
        L85:
            long r3 = java.lang.System.currentTimeMillis()
            r5.f7263lh = r3
            float r6 = r7.getX()
            r5.ouw = r6
            float r6 = r7.getY()
            r5.vt = r6
            com.bytedance.sdk.component.adexpress.dynamic.lh.bly r6 = r5.fkw
            android.view.View r7 = r6.ouw
            if (r7 == 0) goto Lcf
            java.lang.String r7 = r6.f7249lh
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 == 0) goto Lcf
            android.view.View r6 = r6.ouw
            boolean r7 = r6 instanceof com.bytedance.sdk.component.adexpress.le.lh
            if (r7 == 0) goto Lcf
            com.bytedance.sdk.component.adexpress.le.lh r6 = (com.bytedance.sdk.component.adexpress.le.lh) r6
            com.bytedance.sdk.component.adexpress.le.zih r6 = r6.ouw
            float[] r7 = new float[r0]
            r7 = {x00d0: FILL_ARRAY_DATA , data: [0, 1135869952} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r7)
            r6.ouw = r7
            int r0 = r6.vt
            long r0 = (long) r0
            r7.setDuration(r0)
            android.animation.ValueAnimator r7 = r6.ouw
            com.bytedance.sdk.component.adexpress.le.zih$1 r0 = new com.bytedance.sdk.component.adexpress.le.zih$1
            r0.<init>()
            r7.addUpdateListener(r0)
            android.animation.ValueAnimator r6 = r6.ouw
            r6.start()
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.vt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
