package com.google.android.exoplayer2.ui;

import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.e1;
import com.google.android.exoplayer2.g1;
import java.util.List;

/* loaded from: classes.dex */
class PlayerNotificationManager$PlayerListener implements Player$Listener {
    final /* synthetic */ m this$0;

    private PlayerNotificationManager$PlayerListener(m mVar) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onEvents(g1 g1Var, e1 e1Var) {
        if (e1Var.b(5, 6, 8, 0, 13, 12, 9, 10, 15)) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
