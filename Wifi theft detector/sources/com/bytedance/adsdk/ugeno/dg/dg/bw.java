package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class bw extends xq {

    /* renamed from: aa, reason: collision with root package name */
    private int f9209aa;
    private int cf;
    private float gbl;
    private int qh;
    private String sba;
    private float sup;
    private int sz;
    private AtomicBoolean vk;

    public bw(Context context) {
        super(context);
        this.sz = 0;
        this.qh = Integer.MAX_VALUE;
        this.cf = Integer.MAX_VALUE;
        this.vk = new AtomicBoolean(true);
        this.f9209aa = 0;
        this.sba = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.bw;
        if (map != null) {
            this.sba = TextUtils.isEmpty(map.get("direction")) ? "all" : this.bw.get("direction");
            this.sz = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("distance"), 0);
            if (this.qh == Integer.MAX_VALUE) {
                this.qh = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.cf == Integer.MAX_VALUE) {
                this.cf = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.f9209aa = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.qh + ", mEffectiveDuration: " + this.cf + ", inEffectiveDuation: " + this.vk.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        emc();
        return emc(this.ypw, motionEvent);
    }

    private void emc() {
        if (this.cf == Integer.MAX_VALUE || this.ypw == null || System.currentTimeMillis() - this.ypw.ee() < this.cf) {
            return;
        }
        this.vk.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean emc(com.bytedance.adsdk.ugeno.ypw.xq r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            int r0 = r14.getAction()
            r1 = 1
            if (r0 == 0) goto Lbc
            r2 = 3
            if (r0 == r1) goto Le
            if (r0 == r2) goto Le
            goto Lc8
        Le:
            float r0 = r14.getX()
            float r14 = r14.getY()
            int r3 = r12.sz
            java.lang.String r4 = "Slide event, check limit"
            java.lang.String r5 = "GesThrough_UGSlideEvent"
            if (r3 != 0) goto L2a
            com.bytedance.adsdk.ugeno.dg.gbl r3 = r12.emc
            if (r3 == 0) goto L2a
            android.util.Log.d(r5, r4)
            boolean r13 = r12.emc(r13, r0, r14)
            return r13
        L2a:
            android.content.Context r3 = r12.ru
            float r6 = r12.gbl
            float r6 = r0 - r6
            int r3 = com.bytedance.adsdk.ugeno.uym.msw.ypw(r3, r6)
            android.content.Context r6 = r12.ru
            float r7 = r12.sup
            float r7 = r14 - r7
            int r6 = com.bytedance.adsdk.ugeno.uym.msw.ypw(r6, r7)
            java.lang.String r7 = r12.sba
            int r8 = r7.hashCode()
            r9 = 0
            r10 = 2
            switch(r8) {
                case 3739: goto L72;
                case 96673: goto L68;
                case 3089570: goto L5e;
                case 3317767: goto L54;
                case 108511772: goto L4a;
                default: goto L49;
            }
        L49:
            goto L7c
        L4a:
            java.lang.String r8 = "right"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r2
            goto L7d
        L54:
            java.lang.String r8 = "left"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r10
            goto L7d
        L5e:
            java.lang.String r8 = "down"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r1
            goto L7d
        L68:
            java.lang.String r8 = "all"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = 4
            goto L7d
        L72:
            java.lang.String r8 = "up"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r9
            goto L7d
        L7c:
            r7 = -1
        L7d:
            if (r7 == 0) goto La0
            if (r7 == r1) goto L9e
            if (r7 == r10) goto L9c
            if (r7 == r2) goto La1
            double r2 = (double) r3
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r7)
            double r10 = (double) r6
            double r6 = java.lang.Math.pow(r10, r7)
            double r2 = r2 + r6
            double r2 = java.lang.Math.sqrt(r2)
            double r2 = java.lang.Math.abs(r2)
            int r3 = (int) r2
            goto La1
        L9c:
            int r3 = -r3
            goto La1
        L9e:
            r3 = r6
            goto La1
        La0:
            int r3 = -r6
        La1:
            int r2 = r12.sz
            if (r3 < r2) goto Lb6
            android.util.Log.d(r5, r4)
            com.bytedance.adsdk.ugeno.dg.gbl r2 = r12.emc
            if (r2 == 0) goto Lc8
            r1 = 0
            r12.gbl = r1
            r12.sup = r1
            boolean r13 = r12.emc(r13, r0, r14)
            return r13
        Lb6:
            java.lang.String r13 = "Non-slide event"
            android.util.Log.d(r5, r13)
            return r9
        Lbc:
            float r13 = r14.getX()
            r12.gbl = r13
            float r13 = r14.getY()
            r12.sup = r13
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.dg.dg.bw.emc(com.bytedance.adsdk.ugeno.ypw.xq, android.view.MotionEvent):boolean");
    }

    private boolean emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, float f10, float f11) {
        if (this.qh <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.vk.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.f9209aa == 1 && !emc(xqVar.gbl(), f10, f11)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.emc.emc(xqVar, this.ycc, this.xq.ypw());
        int i10 = this.qh;
        if (i10 != Integer.MAX_VALUE) {
            this.qh = i10 - 1;
        }
        return true;
    }

    private boolean emc(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
