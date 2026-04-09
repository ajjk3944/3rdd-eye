package com.google.android.gms.internal.ads;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;

/* renamed from: com.google.android.gms.internal.ads.jP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1370jP {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable e(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(int i, int i3, int i6) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i3, i6);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ boolean q(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
