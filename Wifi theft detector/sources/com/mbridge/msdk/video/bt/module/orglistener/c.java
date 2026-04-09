package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f18677c;

    /* renamed from: d, reason: collision with root package name */
    private String f18678d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f18677c = bVar;
        this.f18678d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onAdShow");
            this.f18677c.a(this.f18678d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onVideoComplete");
            this.f18677c.a(this.f18678d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onAdClose");
            this.f18677c.a(this.f18678d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onShowFail");
            this.f18677c.a(this.f18678d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f18677c.b(this.f18678d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onEndcardShow");
            this.f18677c.c(this.f18678d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f18677c != null) {
            q0.a("H5ShowRewardListener", "onAutoLoad");
            this.f18677c.a(this.f18678d, i10, str, str2);
        }
    }
}
