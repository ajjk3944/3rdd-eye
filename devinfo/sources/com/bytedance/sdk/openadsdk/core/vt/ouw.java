package com.bytedance.sdk.openadsdk.core.vt;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.vm.lh;
import com.bytedance.sdk.openadsdk.vm.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements vpp.ouw {

    /* renamed from: lh, reason: collision with root package name */
    private final boolean f8470lh;
    final vpp.ouw ouw;
    final AdSlot vt;

    public ouw(vpp.ouw ouwVar, AdSlot adSlot, boolean z3) {
        this.ouw = ouwVar;
        this.vt = adSlot;
        this.f8470lh = z3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
    public final void ouw(final int i4, final String str) {
        AdSlot adSlot;
        if (this.ouw != null) {
            if (bs.le() || !((adSlot = this.vt) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.vpp.ouw.ouw("getads_callback_async", 0) != 1)) {
                this.ouw.ouw(i4, str);
            } else {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw.ouw(i4, str);
                    }
                });
            }
            if (!this.f8470lh || this.vt == null) {
                return;
            }
            lh.lh(new yu() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f8751lh = "load_ad";
                    ouwVar.ra = ouw.this.vt.getCodeId();
                    ouwVar.pno = uoy.lh(ouw.this.vt.getDurationSlotType());
                    ouwVar.vt = BuildConfig.VERSION_NAME;
                    ouwVar.mwh = uoy.ouw(ouw.this.vt).toString();
                    return ouwVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
    public final void ouw(final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, final com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        AdSlot adSlot;
        if (this.ouw != null) {
            if (!bs.le() && ((adSlot = this.vt) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.vpp.ouw.ouw("getads_callback_async", 0) != 1)) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw.ouw(ouwVar, lhVar);
                    }
                });
            } else {
                this.ouw.ouw(ouwVar, lhVar);
            }
            if (!this.f8470lh || this.vt == null) {
                return;
            }
            lh.vt(new yu() { // from class: com.bytedance.sdk.openadsdk.core.vt.ouw.4
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar2.f8751lh = "load_ad";
                    ouwVar2.ra = ouw.this.vt.getCodeId();
                    ouwVar2.pno = uoy.lh(ouw.this.vt.getDurationSlotType());
                    ouwVar2.vt = BuildConfig.VERSION_NAME;
                    ouwVar2.mwh = uoy.ouw(ouw.this.vt).toString();
                    return ouwVar2;
                }
            });
        }
    }
}
