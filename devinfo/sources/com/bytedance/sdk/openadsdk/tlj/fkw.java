package com.bytedance.sdk.openadsdk.tlj;

import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements th {
    private static int ouw;
    private final String fkw;

    /* renamed from: lh, reason: collision with root package name */
    private long f8675lh;
    private long vt = 0;
    private boolean yu;

    public fkw() {
        ouw++;
        this.fkw = "image_request_" + ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.th
    public final void ouw(String str, bly blyVar) {
        if (!this.yu) {
            ko.vt("ImageLoaderStep", "start " + this.fkw + " request:" + blyVar.ouw() + ", width:" + blyVar.vt() + ",height:" + blyVar.lh());
            this.yu = true;
        }
        this.vt = System.currentTimeMillis();
        ko.vt("ImageLoaderStep", this.fkw + " start:" + str);
    }

    @Override // com.bytedance.sdk.component.fkw.th
    public final void ouw(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.vt;
        this.f8675lh += jCurrentTimeMillis;
        StringBuilder sb2 = new StringBuilder();
        u.B(sb2, this.fkw, " end:", str, ",cost：");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms， total：");
        sb2.append(this.f8675lh);
        sb2.append("\r\n");
        ko.vt("ImageLoaderStep", sb2.toString());
    }
}
