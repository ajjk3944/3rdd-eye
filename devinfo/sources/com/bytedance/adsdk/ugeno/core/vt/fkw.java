package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    public Context bly;

    /* renamed from: cf, reason: collision with root package name */
    public ouw f6866cf;

    /* renamed from: le, reason: collision with root package name */
    public mwh f6867le;
    private boolean mwh;
    public String pno;
    public mwh ra;
    public boolean tlj;
    public float ouw = Float.MIN_VALUE;
    public float vt = Float.MIN_VALUE;

    /* renamed from: lh, reason: collision with root package name */
    public int f6868lh = 0;
    private int ryl = Integer.MAX_VALUE;
    public int yu = Integer.MAX_VALUE;
    AtomicBoolean fkw = new AtomicBoolean(true);

    public fkw(Context context, mwh mwhVar, boolean z3, boolean z10) {
        this.bly = context;
        this.f6867le = mwhVar;
        this.tlj = z3;
        this.mwh = z10;
        vt();
    }

    private void vt() {
        if (this.mwh) {
            this.f6866cf = new ouw();
        }
        mwh mwhVar = this.f6867le;
        if (mwhVar == null) {
            return;
        }
        this.f6868lh = mwhVar.f6850lh.optInt("slideThreshold");
        this.pno = this.f6867le.f6850lh.optString("slideDirection");
        this.ryl = this.f6867le.f6850lh.optInt("frequency", Integer.MAX_VALUE);
        this.yu = this.f6867le.f6850lh.optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.ryl + ", mEffectiveDuration: " + this.yu + ", inEffectiveDuation: " + this.fkw.get());
    }

    public final void ouw() {
        this.ouw = Float.MIN_VALUE;
        this.vt = Float.MIN_VALUE;
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (this.f6866cf != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.f6866cf.ouw(lhVar);
        }
    }

    public final void ouw(ko koVar, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (this.ryl <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            ouw(lhVar);
        } else {
            if (!this.fkw.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                ouw(lhVar);
                return;
            }
            koVar.ouw(mwhVar, lhVar);
            int i4 = this.ryl;
            if (i4 != Integer.MAX_VALUE) {
                this.ryl = i4 - 1;
            }
        }
    }

    public fkw(Context context, mwh mwhVar, mwh mwhVar2, boolean z3, boolean z10) {
        this.bly = context;
        this.f6867le = mwhVar;
        this.ra = mwhVar2;
        this.tlj = z3;
        this.mwh = z10;
        vt();
    }
}
