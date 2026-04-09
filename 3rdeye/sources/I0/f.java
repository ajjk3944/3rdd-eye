package I0;

import android.content.pm.ApkChecksum;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.TrackChangeEvent;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager d(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ TrackChangeEvent.Builder h(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean v(View view) {
        return view instanceof SplashScreenView;
    }
}
