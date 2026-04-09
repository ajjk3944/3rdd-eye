package com.bytedance.sdk.openadsdk.component.pno;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.f1;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh implements ouw.InterfaceC0087ouw {
    private vpp fkw;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7900lh = false;
    public Context ouw;
    public vt vt;
    private FrameLayout yu;

    public lh(Context context) {
        this.ouw = context.getApplicationContext();
    }

    private long le() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            return vtVar.zih();
        }
        return 0L;
    }

    private long ra() {
        vt vtVar = this.vt;
        if (vtVar == null) {
            return 0L;
        }
        return this.vt.zih() + vtVar.th();
    }

    public final long fkw() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            return vtVar.bly;
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0087ouw
    public long getVideoProgress() {
        return fkw();
    }

    public final void lh() {
        try {
            if (ouw()) {
                this.vt.cf();
            }
        } catch (Throwable th2) {
            qbp.yu("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public final boolean ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        vt vtVar = this.vt;
        return (vtVar == null || (lhVar = vtVar.f8336le) == null || !lhVar.le()) ? false : true;
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        vt vtVar = this.vt;
        return (vtVar == null || (lhVar = vtVar.f8336le) == null || !lhVar.ra()) ? false : true;
    }

    public final void yu() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.ryl();
        }
    }

    public final boolean ouw(float f10) {
        try {
            vt vtVar = this.vt;
            if (vtVar != null) {
                return vtVar.ouw(f10);
            }
        } catch (Throwable th2) {
            qbp.yu("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th2.getMessage());
        }
        return false;
    }

    public final void ouw(int i4) {
        if (this.vt != null) {
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(fkw());
            ouwVar.vt(ra());
            ouwVar.vt = le();
            ouwVar.tlj = i4;
            ouwVar.ryl = this.vt.vm();
            ouwVar.f8763le = this.vt.jae();
            this.vt.ouw(ouwVar);
        }
    }

    public final boolean ouw(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.ouw ouwVar, vpp vppVar) {
        this.yu = frameLayout;
        this.fkw = vppVar;
        vt vtVar = new vt(this.ouw, frameLayout, vppVar);
        this.vt = vtVar;
        vtVar.f8338od = ouwVar;
        try {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(0)).M(), this.fkw);
            vtVarOuw.f6566le = this.fkw.pv;
            vtVarOuw.ra = this.yu.getWidth();
            vtVarOuw.pno = this.yu.getHeight();
            vtVarOuw.bly = this.fkw.yhj;
            vtVarOuw.tlj = 0L;
            vtVarOuw.f6564cf = true;
            return this.vt.ouw(vtVarOuw);
        } catch (Throwable th2) {
            qbp.yu("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th2.getMessage());
            return false;
        }
    }
}
