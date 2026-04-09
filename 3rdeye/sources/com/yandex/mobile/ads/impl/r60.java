package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes3.dex */
public final class r60 implements Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final kl f32535a;

    /* renamed from: b, reason: collision with root package name */
    private final w60 f32536b;

    /* renamed from: c, reason: collision with root package name */
    private final ai1 f32537c;

    /* renamed from: d, reason: collision with root package name */
    private final li1 f32538d;

    /* renamed from: e, reason: collision with root package name */
    private final fi1 f32539e;

    /* renamed from: f, reason: collision with root package name */
    private final x42 f32540f;

    /* renamed from: g, reason: collision with root package name */
    private final oh1 f32541g;

    public r60(kl bindingControllerHolder, w60 exoPlayerProvider, ai1 playbackStateChangedListener, li1 playerStateChangedListener, fi1 playerErrorListener, x42 timelineChangedListener, oh1 playbackChangesHandler) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(exoPlayerProvider, "exoPlayerProvider");
        kotlin.jvm.internal.l.f(playbackStateChangedListener, "playbackStateChangedListener");
        kotlin.jvm.internal.l.f(playerStateChangedListener, "playerStateChangedListener");
        kotlin.jvm.internal.l.f(playerErrorListener, "playerErrorListener");
        kotlin.jvm.internal.l.f(timelineChangedListener, "timelineChangedListener");
        kotlin.jvm.internal.l.f(playbackChangesHandler, "playbackChangesHandler");
        this.f32535a = bindingControllerHolder;
        this.f32536b = exoPlayerProvider;
        this.f32537c = playbackStateChangedListener;
        this.f32538d = playerStateChangedListener;
        this.f32539e = playerErrorListener;
        this.f32540f = timelineChangedListener;
        this.f32541g = playbackChangesHandler;
    }

    public final void onPlayWhenReadyChanged(boolean z10, int i) {
        Player playerA = this.f32536b.a();
        if (!this.f32535a.b() || playerA == null) {
            return;
        }
        this.f32538d.a(z10, playerA.getPlaybackState());
    }

    public final void onPlaybackStateChanged(int i) {
        Player playerA = this.f32536b.a();
        if (!this.f32535a.b() || playerA == null) {
            return;
        }
        this.f32537c.a(i, playerA);
    }

    public final void onPlayerError(PlaybackException error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f32539e.a(error);
    }

    public final void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int i) {
        kotlin.jvm.internal.l.f(oldPosition, "oldPosition");
        kotlin.jvm.internal.l.f(newPosition, "newPosition");
        this.f32541g.a();
    }

    public final void onRenderedFirstFrame() {
        Player playerA = this.f32536b.a();
        if (playerA != null) {
            onPlaybackStateChanged(playerA.getPlaybackState());
        }
    }

    public final void onTimelineChanged(Timeline timeline, int i) {
        kotlin.jvm.internal.l.f(timeline, "timeline");
        this.f32540f.a(timeline);
    }
}
