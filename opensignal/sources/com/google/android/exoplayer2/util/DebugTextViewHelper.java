package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import c7.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.f1;
import java.util.List;
import java.util.Locale;
import qb.b;
import w.g;

/* loaded from: classes.dex */
public class DebugTextViewHelper implements Player$Listener, Runnable {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final SimpleExoPlayer player;
    private boolean started;
    private final TextView textView;

    public DebugTextViewHelper(SimpleExoPlayer simpleExoPlayer, TextView textView) {
        b.g(simpleExoPlayer.f4040x.K == Looper.getMainLooper());
        this.player = simpleExoPlayer;
        this.textView = textView;
    }

    private static String getDecoderCountersBufferCountString(z9.b bVar) {
        if (bVar == null) {
            return "";
        }
        synchronized (bVar) {
        }
        int i10 = bVar.f26782a;
        int i11 = bVar.f26784c;
        int i12 = bVar.f26783b;
        int i13 = bVar.f26785d;
        int i14 = bVar.f26786e;
        int i15 = bVar.f26787f;
        StringBuilder sb2 = new StringBuilder(93);
        sb2.append(" sib:");
        sb2.append(i10);
        sb2.append(" sb:");
        sb2.append(i11);
        sb2.append(" rb:");
        sb2.append(i12);
        sb2.append(" db:");
        sb2.append(i13);
        sb2.append(" mcdb:");
        sb2.append(i14);
        sb2.append(" dk:");
        sb2.append(i15);
        return sb2.toString();
    }

    private static String getPixelAspectRatioString(float f10) {
        if (f10 == -1.0f || f10 == 1.0f) {
            return "";
        }
        String str = String.format(Locale.US, "%.02f", Float.valueOf(f10));
        return str.length() != 0 ? " par:".concat(str) : new String(" par:");
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i10) {
        return i10 == 0 ? "N/A" : String.valueOf((long) (j / i10));
    }

    public String getAudioString() {
        SimpleExoPlayer simpleExoPlayer = this.player;
        Format format = simpleExoPlayer.Q;
        z9.b bVar = simpleExoPlayer.f4029b0;
        if (format == null || bVar == null) {
            return "";
        }
        String str = format.H;
        String str2 = format.f4020a;
        int i10 = format.V;
        int i11 = format.U;
        String decoderCountersBufferCountString = getDecoderCountersBufferCountString(bVar);
        StringBuilder sbS = a.s(a.d(a.d(a.d(36, str), str2), decoderCountersBufferCountString), "\n", str, "(id:", str2);
        sbS.append(" hz:");
        sbS.append(i10);
        sbS.append(" ch:");
        sbS.append(i11);
        return g.j(sbS, decoderCountersBufferCountString, ")");
    }

    public String getDebugString() {
        String playerStateString = getPlayerStateString();
        String videoString = getVideoString();
        String audioString = getAudioString();
        return a.k(a.d(a.d(String.valueOf(playerStateString).length(), videoString), audioString), playerStateString, videoString, audioString);
    }

    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        String str = playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle";
        return "playWhenReady:" + this.player.getPlayWhenReady() + " playbackState:" + str + " window:" + this.player.getCurrentWindowIndex();
    }

    public String getVideoString() {
        SimpleExoPlayer simpleExoPlayer = this.player;
        Format format = simpleExoPlayer.P;
        z9.b bVar = simpleExoPlayer.f4028a0;
        if (format == null || bVar == null) {
            return "";
        }
        String str = format.H;
        String str2 = format.f4020a;
        int i10 = format.M;
        int i11 = format.N;
        String pixelAspectRatioString = getPixelAspectRatioString(format.Q);
        String decoderCountersBufferCountString = getDecoderCountersBufferCountString(bVar);
        String videoFrameProcessingOffsetAverageString = getVideoFrameProcessingOffsetAverageString(bVar.f26788g, bVar.f26789h);
        StringBuilder sbS = a.s(a.d(a.d(a.d(a.d(a.d(39, str), str2), pixelAspectRatioString), decoderCountersBufferCountString), videoFrameProcessingOffsetAverageString), "\n", str, "(id:", str2);
        sbS.append(" r:");
        sbS.append(i10);
        sbS.append("x");
        sbS.append(i11);
        g.q(sbS, pixelAspectRatioString, decoderCountersBufferCountString, " vfpo: ", videoFrameProcessingOffsetAverageString);
        sbS.append(")");
        return sbS.toString();
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlaybackStateChanged(int i10) {
        updateAndPost();
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

    @Override // java.lang.Runnable
    public final void run() {
        updateAndPost();
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.c0(this);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.H(this);
            this.textView.removeCallbacks(this);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this);
        this.textView.postDelayed(this, 1000L);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        updateAndPost();
    }
}
