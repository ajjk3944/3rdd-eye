package com.bytedance.sdk.openadsdk.vm;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.jg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class fkw implements yu {

    /* renamed from: lh, reason: collision with root package name */
    private int f8745lh;
    private yu ouw;
    private int vt;
    private int yu;

    public fkw(yu yuVar, int i4, int i10, int i11) {
        this.ouw = yuVar;
        this.vt = i4;
        this.f8745lh = i10;
        this.yu = i11;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.yu
    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVarOuw = this.ouw.ouw();
        ouwVarOuw.vt = BuildConfig.VERSION_NAME;
        ouwVarOuw.yu = this.vt;
        ouwVarOuw.fkw = this.f8745lh;
        ouwVarOuw.f8750le = this.yu;
        ouwVarOuw.f8749cf = bly.ouw().ra();
        ouwVarOuw.ryl = jg.yu();
        return ouwVarOuw;
    }
}
