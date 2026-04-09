package androidx.media3.exoplayer.trackselection;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class o implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultTrackSelector f1913a;

    public o(DefaultTrackSelector defaultTrackSelector) {
        this.f1913a = defaultTrackSelector;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f1913a.maybeInvalidateForAudioChannelCountConstraints();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f1913a.maybeInvalidateForAudioChannelCountConstraints();
    }
}
