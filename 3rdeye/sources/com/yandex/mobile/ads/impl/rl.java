package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class rl {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f32684a;

    public rl(tv0 referenceMediaFileInfo) {
        kotlin.jvm.internal.l.f(referenceMediaFileInfo, "referenceMediaFileInfo");
        this.f32684a = referenceMediaFileInfo;
    }

    public final int a(sv0 mediaFile) {
        kotlin.jvm.internal.l.f(mediaFile, "mediaFile");
        int iB = mediaFile.b();
        if (iB != 0) {
            return iB;
        }
        return (int) (((mediaFile.d() * mediaFile.h()) / (this.f32684a.b() * this.f32684a.c())) * this.f32684a.a());
    }
}
