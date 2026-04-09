package com.bytedance.adsdk.ugeno.core.ypw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.sz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class bw {
    private boolean gbl;
    private sz msw;
    private Context ru;
    private boolean sup;
    private emc sz;
    private sz uym;
    private String zz;
    private float emc = Float.MIN_VALUE;
    private float ypw = Float.MIN_VALUE;
    private int xq = 0;
    private int dg = Integer.MAX_VALUE;
    private int bw = Integer.MAX_VALUE;
    private AtomicBoolean ycc = new AtomicBoolean(true);

    public bw(Context context, sz szVar, boolean z6, boolean z7) {
        this.ru = context;
        this.uym = szVar;
        this.gbl = z6;
        this.sup = z7;
        xq();
    }

    private void xq() {
        if (this.sup) {
            this.sz = new emc();
        }
        sz szVar = this.uym;
        if (szVar == null) {
            return;
        }
        this.xq = szVar.xq().optInt("slideThreshold");
        this.zz = this.uym.xq().optString("slideDirection");
        this.dg = this.uym.xq().optInt("frequency", Integer.MAX_VALUE);
        this.bw = this.uym.xq().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.dg + ", mEffectiveDuration: " + this.bw + ", inEffectiveDuation: " + this.ycc.get());
    }

    public void ypw() {
        this.emc = Float.MIN_VALUE;
        this.ypw = Float.MIN_VALUE;
    }

    public void emc() {
        if (this.bw == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ypw.bw.1
            @Override // java.lang.Runnable
            public void run() {
                bw.this.ycc.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.bw);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean emc(com.bytedance.adsdk.ugeno.core.cf r8, com.bytedance.adsdk.ugeno.ypw.xq r9, android.view.MotionEvent r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.ypw.bw.emc(com.bytedance.adsdk.ugeno.core.cf, com.bytedance.adsdk.ugeno.ypw.xq, android.view.MotionEvent, boolean):boolean");
    }

    public bw(Context context, sz szVar, sz szVar2, boolean z6, boolean z7) {
        this.ru = context;
        this.uym = szVar;
        this.msw = szVar2;
        this.gbl = z6;
        this.sup = z7;
        xq();
    }

    private void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        if (this.sz != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.sz.emc(xqVar);
        }
    }

    private void emc(cf cfVar, sz szVar, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        if (this.dg <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            emc(xqVar);
        } else {
            if (!this.ycc.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                emc(xqVar);
                return;
            }
            cfVar.emc(szVar, xqVar, xqVar);
            int i = this.dg;
            if (i != Integer.MAX_VALUE) {
                this.dg = i - 1;
            }
        }
    }
}
