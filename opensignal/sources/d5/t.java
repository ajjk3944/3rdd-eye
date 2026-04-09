package d5;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;

/* loaded from: classes.dex */
public abstract class t {
    public static e5.o0 a(Context context, z zVar, boolean z10) {
        MediaMetricsListener mediaMetricsListenerCreate = MediaMetricsListener.create(context);
        if (mediaMetricsListenerCreate == null) {
            a5.a.B("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new e5.o0(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            zVar.O.addListener(mediaMetricsListenerCreate);
        }
        return new e5.o0(mediaMetricsListenerCreate.getLogSessionId());
    }
}
