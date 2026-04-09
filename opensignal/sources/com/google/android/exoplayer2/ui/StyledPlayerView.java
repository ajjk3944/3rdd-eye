package com.google.android.exoplayer2.ui;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.u1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class StyledPlayerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4611a = 0;

    public final class ComponentListener implements Player$Listener, View.OnLayoutChangeListener, View.OnClickListener {
        private Object lastPeriodUidWithTracks;
        private final u1 period = new u1();
        final /* synthetic */ StyledPlayerView this$0;

        public ComponentListener(StyledPlayerView styledPlayerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, eb.k
        public void onCues(List<eb.b> list) {
            int i10 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            int i11 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onPlaybackStateChanged(int i10) {
            int i11 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, rb.r
        public void onRenderedFirstFrame() {
            int i10 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar) {
            int i10 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, rb.r
        @Deprecated
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        }

        public void onVisibilityChange(int i10) {
            int i11 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
            int i11 = StyledPlayerView.f4611a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player$Listener, rb.r
        public void onVideoSizeChanged(rb.v vVar) {
            int i10 = StyledPlayerView.f4611a;
            throw null;
        }
    }
}
