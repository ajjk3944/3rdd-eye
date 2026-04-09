package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* loaded from: classes3.dex */
public class e extends MBTempContainer.k.a {

    /* renamed from: b, reason: collision with root package name */
    private h f18688b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f18689c;

    public e(com.mbridge.msdk.foundation.same.report.metrics.c cVar, h hVar) {
        this.f18688b = hVar;
        this.f18689c = cVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k.a, com.mbridge.msdk.video.bt.module.MBTempContainer.k
    public void onError(String str) {
        super.onError(str);
        h hVar = this.f18688b;
        if (hVar != null) {
            hVar.a(this.f18689c, str);
        }
    }
}
