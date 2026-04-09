package defpackage;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i71 {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void j() {
    }
}
