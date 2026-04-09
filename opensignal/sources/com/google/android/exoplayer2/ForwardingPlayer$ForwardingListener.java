package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* loaded from: classes.dex */
final class ForwardingPlayer$ForwardingListener extends ForwardingPlayer$ForwardingEventListener implements Player$Listener {
    private final Player$Listener listener;

    public ForwardingPlayer$ForwardingListener(i0 i0Var, Player$Listener player$Listener) {
        super(i0Var, player$Listener);
        this.listener = player$Listener;
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public void onAudioAttributesChanged(y9.b bVar) {
        this.listener.onAudioAttributesChanged(bVar);
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public void onAudioSessionIdChanged(int i10) {
        this.listener.onAudioSessionIdChanged(i10);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, eb.k
    public void onCues(List<eb.b> list) {
        this.listener.onCues(list);
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public void onDeviceInfoChanged(aa.a aVar) {
        this.listener.onDeviceInfoChanged(aVar);
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public void onDeviceVolumeChanged(int i10, boolean z10) {
        this.listener.onDeviceVolumeChanged(i10, z10);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, pa.d
    public void onMetadata(Metadata metadata) {
        this.listener.onMetadata(metadata);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onRenderedFirstFrame() {
        this.listener.onRenderedFirstFrame();
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public void onSkipSilenceEnabledChanged(boolean z10) {
        this.listener.onSkipSilenceEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onSurfaceSizeChanged(int i10, int i11) {
        this.listener.onSurfaceSizeChanged(i10, i11);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onVideoSizeChanged(rb.v vVar) {
        this.listener.onVideoSizeChanged(vVar);
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public void onVolumeChanged(float f10) {
        this.listener.onVolumeChanged(f10);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        this.listener.onVideoSizeChanged(i10, i11, i12, f10);
    }
}
