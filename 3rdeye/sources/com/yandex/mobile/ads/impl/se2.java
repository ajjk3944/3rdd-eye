package com.yandex.mobile.ads.impl;

import android.view.View;
import c9.C2077A;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class se2 {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<?> f32952a;

    /* renamed from: b, reason: collision with root package name */
    private final fg2 f32953b;

    public se2(mb2<?> videoAdInfo, fg2 videoViewProvider) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        this.f32952a = videoAdInfo;
        this.f32953b = videoViewProvider;
    }

    public final Map<String, Object> a() {
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        View view = this.f32953b.getView();
        Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
        Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
        sv0 sv0VarC = this.f32952a.c();
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        jp1Var.b(numValueOf, "view_container_height");
        if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        jp1Var.b(numValueOf2, "view_container_width");
        jp1Var.b(sv0VarC.d() > 0 ? Integer.valueOf(sv0VarC.d()) : null, "video_height");
        jp1Var.b(sv0VarC.h() > 0 ? Integer.valueOf(sv0VarC.h()) : null, "video_width");
        jp1Var.b(sv0VarC.c(), "video_codec");
        jp1Var.b(sv0VarC.e(), "video_mime_type");
        jp1Var.b(sv0VarC.g(), "video_vmaf");
        return C2077A.m(new b9.l("video_playback_info", jp1Var.b()));
    }
}
