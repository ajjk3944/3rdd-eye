package com.bytedance.sdk.openadsdk.utils;

import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cd implements Handler.Callback, ouw.InterfaceC0093ouw {
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f8692cf;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8694lh;
    private final com.bytedance.sdk.openadsdk.core.model.vpp pno;
    private int ryl;
    private boolean tlj;
    public boolean vt;
    public boolean yu;

    /* renamed from: le, reason: collision with root package name */
    private float f8693le = 1.0f;
    private int ra = 1000;
    public final Handler ouw = new Handler(Looper.getMainLooper(), this);
    public int fkw = 0;

    public cd(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        this.f8692cf = 0;
        this.ryl = 0;
        this.bly = ouwVar;
        this.pno = vppVar;
        if (vppVar.ey()) {
            if (vppVar.ng() >= 0) {
                this.ryl = vppVar.ng();
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                this.ryl = com.bytedance.sdk.openadsdk.core.settings.cf.ra(String.valueOf(vppVar.fqk()));
            }
        } else if (vppVar.rrs()) {
            if (vppVar.myk() >= 0) {
                this.ryl = vppVar.myk();
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                this.ryl = com.bytedance.sdk.openadsdk.core.settings.cf.jg(String.valueOf(vppVar.fqk()));
            }
        }
        this.f8692cf = (int) ouwVar.ex.zin();
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "totalTime: " + this.f8692cf + ", skipTime=" + this.ryl);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.cd.handleMessage(android.os.Message):boolean");
    }

    public final void ouw() {
        if (this.vt) {
            this.ouw.removeMessages(Segment.SHARE_MINIMUM);
            this.ouw.sendEmptyMessage(Segment.SHARE_MINIMUM);
            this.f8694lh = false;
        }
    }

    public final void vt() {
        this.ouw.removeMessages(Segment.SHARE_MINIMUM);
        this.vt = false;
        this.yu = true;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ex.zih();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0093ouw
    public final void ouw(int i4) {
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i4)));
        if (i4 == 1) {
            ouw();
            return;
        }
        if (i4 != 2) {
            if (i4 == 3 || i4 == 4) {
                vt();
                return;
            }
            return;
        }
        if (!this.vt || this.f8694lh) {
            return;
        }
        this.ouw.removeMessages(Segment.SHARE_MINIMUM);
        this.f8694lh = true;
    }
}
