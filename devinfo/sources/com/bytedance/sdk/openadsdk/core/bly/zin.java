package com.bytedance.sdk.openadsdk.core.bly;

import android.view.View;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin extends com.bytedance.sdk.component.adexpress.vt.ouw<ouw> {
    final com.bytedance.sdk.component.adexpress.vt.mwh fkw;

    /* renamed from: le, reason: collision with root package name */
    AtomicBoolean f8101le = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.vt.lh f8102lh;
    ouw ouw;
    final View vt;
    com.bytedance.sdk.component.adexpress.vt.ra yu;

    public zin(View view, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar) {
        this.vt = view;
        this.fkw = mwhVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final /* bridge */ /* synthetic */ View lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.yu = raVar;
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.zin.1
            @Override // java.lang.Runnable
            public final void run() {
                zin zinVar = zin.this;
                if (zinVar.f8101le.get()) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.vt.lh lhVar = zinVar.f8102lh;
                if (lhVar == null || !lhVar.ouw((qbp) zinVar.vt)) {
                    zinVar.yu.ouw(FacebookMediationAdapter.ERROR_NULL_CONTEXT, "backup false");
                    return;
                }
                zinVar.fkw.vt.pno();
                ouw ouwVar = (ouw) zinVar.vt.findViewWithTag("tt_express_backup_fl_tag_26");
                zinVar.ouw = ouwVar;
                if (ouwVar == null) {
                    zinVar.yu.ouw(FacebookMediationAdapter.ERROR_NULL_CONTEXT, "backupview is null");
                    return;
                }
                com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
                ouw ouwVar2 = zinVar.ouw;
                float realWidth = ouwVar2 == null ? 0.0f : ouwVar2.getRealWidth();
                ouw ouwVar3 = zinVar.ouw;
                float realHeight = ouwVar3 != null ? ouwVar3.getRealHeight() : 0.0f;
                jgVar.vt = true;
                jgVar.f7393lh = realWidth;
                jgVar.yu = realHeight;
                zinVar.yu.ouw(zinVar.ouw, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.ouw
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.lh lhVar) {
        this.f8102lh = lhVar;
    }
}
