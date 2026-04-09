package com.yandex.mobile.ads.impl;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;

/* loaded from: classes3.dex */
public final class q60 implements Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final jl f32080a;

    /* renamed from: b, reason: collision with root package name */
    private final v60 f32081b;

    /* renamed from: c, reason: collision with root package name */
    private final zh1 f32082c;

    /* renamed from: d, reason: collision with root package name */
    private final ki1 f32083d;

    /* renamed from: e, reason: collision with root package name */
    private final ei1 f32084e;

    /* renamed from: f, reason: collision with root package name */
    private final w42 f32085f;

    /* renamed from: g, reason: collision with root package name */
    private final nh1 f32086g;

    public q60(jl bindingControllerHolder, v60 exoPlayerProvider, zh1 playbackStateChangedListener, ki1 playerStateChangedListener, ei1 playerErrorListener, w42 timelineChangedListener, nh1 playbackChangesHandler) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(exoPlayerProvider, "exoPlayerProvider");
        kotlin.jvm.internal.l.f(playbackStateChangedListener, "playbackStateChangedListener");
        kotlin.jvm.internal.l.f(playerStateChangedListener, "playerStateChangedListener");
        kotlin.jvm.internal.l.f(playerErrorListener, "playerErrorListener");
        kotlin.jvm.internal.l.f(timelineChangedListener, "timelineChangedListener");
        kotlin.jvm.internal.l.f(playbackChangesHandler, "playbackChangesHandler");
        this.f32080a = bindingControllerHolder;
        this.f32081b = exoPlayerProvider;
        this.f32082c = playbackStateChangedListener;
        this.f32083d = playerStateChangedListener;
        this.f32084e = playerErrorListener;
        this.f32085f = timelineChangedListener;
        this.f32086g = playbackChangesHandler;
    }

    public final void onPlayWhenReadyChanged(boolean z10, int i) {
        Player playerA = this.f32081b.a();
        if (!this.f32080a.b() || playerA == null) {
            return;
        }
        this.f32083d.a(z10, playerA.getPlaybackState());
    }

    public final void onPlaybackStateChanged(int i) {
        Player playerA = this.f32081b.a();
        if (!this.f32080a.b() || playerA == null) {
            return;
        }
        this.f32082c.a(i, playerA);
    }

    public final void onPlayerError(PlaybackException error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f32084e.a(error);
    }

    public final void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int i) {
        kotlin.jvm.internal.l.f(oldPosition, "oldPosition");
        kotlin.jvm.internal.l.f(newPosition, "newPosition");
        this.f32086g.a();
    }

    public final void onRenderedFirstFrame() {
        Player playerA = this.f32081b.a();
        if (playerA != null) {
            onPlaybackStateChanged(playerA.getPlaybackState());
        }
    }

    public final void onTimelineChanged(Timeline timeline, int i) {
        kotlin.jvm.internal.l.f(timeline, "timeline");
        this.f32085f.a(timeline);
    }
}
