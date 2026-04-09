package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import ba.e;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import e5.x;
import et.d;
import io.sentry.h4;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import oe.h0;
import oe.s;
import p5.b;
import qb.a;
import qb.f;
import qb.g;
import qb.i;
import qb.k;
import qb.t;
import qb.v;
import rb.u;
import x9.c;
import x9.l;
import x9.m;
import x9.n;
import x9.o;
import x9.p;
import x9.q;
import x9.r;
import y9.j;
import ya.b0;

/* loaded from: classes.dex */
public class AnalyticsCollector implements Player$Listener, j, u, b0, e {
    private final a clock;
    private final SparseArray<q> eventTimes;
    private g handler;
    private boolean isSeeking;
    private k listeners;
    private final p mediaPeriodQueueTracker;
    private final u1 period;
    private g1 player;
    private final v1 window;

    public AnalyticsCollector(a aVar) {
        aVar.getClass();
        this.clock = aVar;
        int i10 = v.f20828a;
        Looper looperMyLooper = Looper.myLooper();
        this.listeners = new k(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, aVar, new b(29));
        u1 u1Var = new u1();
        this.period = u1Var;
        this.window = new v1();
        this.mediaPeriodQueueTracker = new p(u1Var);
        this.eventTimes = new SparseArray<>();
    }

    private q generateLoadingMediaPeriodEventTime() {
        p pVar = this.mediaPeriodQueueTracker;
        return generateEventTime(pVar.f25176b.isEmpty() ? null : (ya.v) s.i(pVar.f25176b));
    }

    private q generateMediaPeriodEventTime(int i10, ya.v vVar) {
        this.player.getClass();
        w1 w1Var = w1.f4774a;
        if (vVar != null) {
            return ((w1) this.mediaPeriodQueueTracker.f25177c.get(vVar)) != null ? generateEventTime(vVar) : generateEventTime(w1Var, i10, vVar);
        }
        w1 currentTimeline = this.player.getCurrentTimeline();
        if (i10 < currentTimeline.o()) {
            w1Var = currentTimeline;
        }
        return generateEventTime(w1Var, i10, null);
    }

    private q generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.f25179e);
    }

    private q generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.f25180f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$6(q qVar, String str, long j, long j7, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(qVar, str, j);
        analyticsListener.onAudioDecoderInitialized(qVar, str, j7, j);
        analyticsListener.onDecoderInitialized(qVar, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDisabled$11(q qVar, z9.b bVar, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDisabled(qVar, bVar);
        analyticsListener.onDecoderDisabled(qVar, 1, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioEnabled$5(q qVar, z9.b bVar, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioEnabled(qVar, bVar);
        analyticsListener.onDecoderEnabled(qVar, 1, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioInputFormatChanged$7(q qVar, Format format, z9.e eVar, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(qVar, format);
        analyticsListener.onAudioInputFormatChanged(qVar, format, eVar);
        analyticsListener.onDecoderInputFormatChanged(qVar, 1, format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$59(q qVar, int i10, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(qVar);
        analyticsListener.onDrmSessionAcquired(qVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$39(q qVar, boolean z10, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(qVar, z10);
        analyticsListener.onIsLoadingChanged(qVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$49(q qVar, int i10, f1 f1Var, f1 f1Var2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(qVar, i10);
        analyticsListener.onPositionDiscontinuity(qVar, f1Var, f1Var2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$19(q qVar, String str, long j, long j7, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(qVar, str, j);
        analyticsListener.onVideoDecoderInitialized(qVar, str, j7, j);
        analyticsListener.onDecoderInitialized(qVar, 2, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDisabled$23(q qVar, z9.b bVar, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDisabled(qVar, bVar);
        analyticsListener.onDecoderDisabled(qVar, 2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoEnabled$18(q qVar, z9.b bVar, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoEnabled(qVar, bVar);
        analyticsListener.onDecoderEnabled(qVar, 2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoInputFormatChanged$20(q qVar, Format format, z9.e eVar, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(qVar, format);
        analyticsListener.onVideoInputFormatChanged(qVar, format, eVar);
        analyticsListener.onDecoderInputFormatChanged(qVar, 2, format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$24(q qVar, rb.v vVar, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(qVar, vVar);
        analyticsListener.onVideoSizeChanged(qVar, vVar.f21524a, vVar.f21525b, vVar.f21526c, vVar.f21527d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$release$3() {
        k kVar = this.listeners;
        CopyOnWriteArraySet copyOnWriteArraySet = kVar.f20785d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            qb.j jVar = (qb.j) it.next();
            i iVar = kVar.f20784c;
            jVar.f20781d = true;
            if (jVar.f20780c) {
                iVar.d(jVar.f20778a, jVar.f20779b.c());
            }
        }
        copyOnWriteArraySet.clear();
        kVar.f20788g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$1(g1 g1Var, AnalyticsListener analyticsListener, f fVar) {
        analyticsListener.onEvents(g1Var, new r(fVar, this.eventTimes));
    }

    public void addListener(AnalyticsListener analyticsListener) {
        analyticsListener.getClass();
        k kVar = this.listeners;
        if (kVar.f20788g) {
            return;
        }
        kVar.f20785d.add(new qb.j(analyticsListener));
    }

    public final q generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.f25178d);
    }

    public final q generateEventTime(w1 w1Var, int i10, ya.v vVar) {
        ya.v vVar2 = w1Var.p() ? null : vVar;
        ((d) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = w1Var.equals(this.player.getCurrentTimeline()) && i10 == this.player.getCurrentWindowIndex();
        long jD = 0;
        if (vVar2 == null || !vVar2.a()) {
            if (z10) {
                jD = this.player.getContentPosition();
            } else if (!w1Var.p()) {
                jD = h.d(w1Var.m(i10, this.window, 0L).f4750m);
            }
        } else if (z10 && this.player.getCurrentAdGroupIndex() == vVar2.f26178b && this.player.getCurrentAdIndexInAdGroup() == vVar2.f26179c) {
            jD = this.player.getCurrentPosition();
        }
        return new q(jElapsedRealtime, w1Var, i10, vVar2, jD, this.player.getCurrentTimeline(), this.player.getCurrentWindowIndex(), this.mediaPeriodQueueTracker.f25178d, this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, -1, new x9.e(qVarGenerateCurrentPlayerMediaPeriodEventTime, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public final void onAudioAttributesChanged(y9.b bVar) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1016, new kg.q(qVarGenerateReadingMediaPeriodEventTime, 18, bVar));
    }

    @Override // y9.j
    public final void onAudioCodecError(Exception exc) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1037, new x9.b(qVarGenerateReadingMediaPeriodEventTime, exc, 3));
    }

    @Override // y9.j
    public final void onAudioDecoderInitialized(String str, long j, long j7) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1009, new n(qVarGenerateReadingMediaPeriodEventTime, str, j7, j, 0));
    }

    @Override // y9.j
    public final void onAudioDecoderReleased(String str) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1013, new x9.k(qVarGenerateReadingMediaPeriodEventTime, str, 0));
    }

    @Override // y9.j
    public final void onAudioDisabled(z9.b bVar) {
        q qVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(qVarGeneratePlayingMediaPeriodEventTime, 1014, new c(qVarGeneratePlayingMediaPeriodEventTime, 1, bVar));
    }

    @Override // y9.j
    public final void onAudioEnabled(z9.b bVar) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1008, new c(qVarGenerateReadingMediaPeriodEventTime, 3, bVar));
    }

    @Override // y9.j
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(Format format) {
    }

    @Override // y9.j
    public final void onAudioPositionAdvancing(long j) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1011, new x9.f(qVarGenerateReadingMediaPeriodEventTime, j, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public final void onAudioSessionIdChanged(int i10) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1015, new x9.g(qVarGenerateReadingMediaPeriodEventTime, i10, 3));
    }

    @Override // y9.j
    public final void onAudioSinkError(Exception exc) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1018, new x9.b(qVarGenerateReadingMediaPeriodEventTime, exc, 2));
    }

    @Override // y9.j
    public final void onAudioUnderrun(int i10, long j, long j7) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1012, new o(qVarGenerateReadingMediaPeriodEventTime, i10, j, j7, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onAvailableCommandsChanged(c1 c1Var) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 14, new kg.q(qVarGenerateCurrentPlayerMediaPeriodEventTime, 15, c1Var));
    }

    public final void onBandwidthSample(int i10, long j, long j7) {
        q qVarGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(qVarGenerateLoadingMediaPeriodEventTime, 1006, new o(qVarGenerateLoadingMediaPeriodEventTime, i10, j, j7, 1));
    }

    @Override // ya.b0
    public final void onDownstreamFormatChanged(int i10, ya.v vVar, ya.r rVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1004, new m(qVarGenerateMediaPeriodEventTime, rVar, 0));
    }

    public final void onDrmKeysLoaded(int i10, ya.v vVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1031, new x9.e(qVarGenerateMediaPeriodEventTime, 2));
    }

    public final void onDrmKeysRemoved(int i10, ya.v vVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1034, new x9.e(qVarGenerateMediaPeriodEventTime, 1));
    }

    public final void onDrmKeysRestored(int i10, ya.v vVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1033, new x9.e(qVarGenerateMediaPeriodEventTime, 4));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, ya.v vVar) {
    }

    public final void onDrmSessionManagerError(int i10, ya.v vVar, Exception exc) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1032, new x9.b(qVarGenerateMediaPeriodEventTime, exc, 0));
    }

    public final void onDrmSessionReleased(int i10, ya.v vVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1035, new x9.e(qVarGenerateMediaPeriodEventTime, 5));
    }

    @Override // rb.u
    public final void onDroppedFrames(int i10, long j) {
        q qVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(qVarGeneratePlayingMediaPeriodEventTime, 1023, new x9.d(qVarGeneratePlayingMediaPeriodEventTime, i10, j));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onIsLoadingChanged(boolean z10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 4, new x9.a(qVarGenerateCurrentPlayerMediaPeriodEventTime, z10, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onIsPlayingChanged(boolean z10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 8, new x9.a(qVarGenerateCurrentPlayerMediaPeriodEventTime, z10, 3));
    }

    @Override // ya.b0
    public final void onLoadCanceled(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1002, new x9.h(qVarGenerateMediaPeriodEventTime, mVar, rVar, 0));
    }

    @Override // ya.b0
    public final void onLoadCompleted(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1001, new x9.h(qVarGenerateMediaPeriodEventTime, mVar, rVar, 1));
    }

    @Override // ya.b0
    public final void onLoadError(int i10, ya.v vVar, ya.m mVar, ya.r rVar, IOException iOException, boolean z10) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1003, new e5.n(qVarGenerateMediaPeriodEventTime, mVar, rVar, iOException, z10, 1));
    }

    @Override // ya.b0
    public final void onLoadStarted(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1000, new x9.h(qVarGenerateMediaPeriodEventTime, mVar, rVar, 2));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onMaxSeekToPreviousPositionChanged(int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 19, new x9.g(qVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 4));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onMediaItemTransition(n0 n0Var, int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 1, new w(qVarGenerateCurrentPlayerMediaPeriodEventTime, n0Var, i10, 4));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onMediaMetadataChanged(p0 p0Var) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 15, new x9.i(qVarGenerateCurrentPlayerMediaPeriodEventTime, p0Var, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, pa.d
    public final void onMetadata(Metadata metadata) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 1007, new kg.q(qVarGenerateCurrentPlayerMediaPeriodEventTime, 14, metadata));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 6, new l(qVarGenerateCurrentPlayerMediaPeriodEventTime, z10, i10, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlaybackParametersChanged(b1 b1Var) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 13, new kg.q(qVarGenerateCurrentPlayerMediaPeriodEventTime, 16, b1Var));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlaybackStateChanged(int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 5, new x9.g(qVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 2));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 7, new x9.g(qVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 6));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlayerError(z0 z0Var) {
        ya.u uVar;
        q qVarGenerateEventTime = (!(z0Var instanceof com.google.android.exoplayer2.n) || (uVar = ((com.google.android.exoplayer2.n) z0Var).D) == null) ? null : generateEventTime(new ya.v(uVar));
        if (qVarGenerateEventTime == null) {
            qVarGenerateEventTime = generateCurrentPlayerMediaPeriodEventTime();
        }
        sendEvent(qVarGenerateEventTime, 11, new kg.q(qVarGenerateEventTime, 17, z0Var));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, -1, new l(qVarGenerateCurrentPlayerMediaPeriodEventTime, z10, i10, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onPlaylistMetadataChanged(p0 p0Var) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 16, new x9.i(qVarGenerateCurrentPlayerMediaPeriodEventTime, p0Var, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // rb.u
    public final void onRenderedFirstFrame(Object obj, long j) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1027, new e5.w(qVarGenerateReadingMediaPeriodEventTime, obj, j, 5));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onRepeatModeChanged(int i10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 9, new x9.g(qVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 5));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onSeekBackIncrementChanged(long j) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 17, new x9.f(qVarGenerateCurrentPlayerMediaPeriodEventTime, j, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onSeekForwardIncrementChanged(long j) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 18, new x9.f(qVarGenerateCurrentPlayerMediaPeriodEventTime, j, 2));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onSeekProcessed() {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, -1, new x9.e(qVarGenerateCurrentPlayerMediaPeriodEventTime, 3));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 10, new x9.a(qVarGenerateCurrentPlayerMediaPeriodEventTime, z10, 2));
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1017, new x9.a(qVarGenerateReadingMediaPeriodEventTime, z10, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public final void onStaticMetadataChanged(List<Metadata> list) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 3, new kg.q(qVarGenerateCurrentPlayerMediaPeriodEventTime, 13, list));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onSurfaceSizeChanged(int i10, int i11) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1029, new x(qVarGenerateReadingMediaPeriodEventTime, i10, i11, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onTimelineChanged(w1 w1Var, int i10) {
        p pVar = this.mediaPeriodQueueTracker;
        g1 g1Var = this.player;
        g1Var.getClass();
        pVar.f25178d = p.b(g1Var, pVar.f25176b, pVar.f25179e, pVar.f25175a);
        pVar.d(g1Var.getCurrentTimeline());
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 0, new x9.g(qVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 0));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar) {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 2, new h4(qVarGenerateCurrentPlayerMediaPeriodEventTime, trackGroupArray, jVar, 14));
    }

    @Override // ya.b0
    public final void onUpstreamDiscarded(int i10, ya.v vVar, ya.r rVar) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1005, new m(qVarGenerateMediaPeriodEventTime, rVar, 1));
    }

    @Override // rb.u
    public final void onVideoCodecError(Exception exc) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1038, new x9.b(qVarGenerateReadingMediaPeriodEventTime, exc, 1));
    }

    @Override // rb.u
    public final void onVideoDecoderInitialized(String str, long j, long j7) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1021, new n(qVarGenerateReadingMediaPeriodEventTime, str, j7, j, 1));
    }

    @Override // rb.u
    public final void onVideoDecoderReleased(String str) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1024, new x9.k(qVarGenerateReadingMediaPeriodEventTime, str, 1));
    }

    @Override // rb.u
    public final void onVideoDisabled(z9.b bVar) {
        q qVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(qVarGeneratePlayingMediaPeriodEventTime, 1025, new c(qVarGeneratePlayingMediaPeriodEventTime, 2, bVar));
    }

    @Override // rb.u
    public final void onVideoEnabled(z9.b bVar) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1020, new c(qVarGenerateReadingMediaPeriodEventTime, 0, bVar));
    }

    @Override // rb.u
    public final void onVideoFrameProcessingOffset(long j, int i10) {
        q qVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(qVarGeneratePlayingMediaPeriodEventTime, 1026, new x9.d(qVarGeneratePlayingMediaPeriodEventTime, j, i10));
    }

    @Override // rb.u
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(Format format) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener
    public final void onVolumeChanged(float f10) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1019, new e5.l(qVarGenerateReadingMediaPeriodEventTime, f10, 1));
    }

    public void release() {
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.eventTimes.put(1036, qVarGenerateCurrentPlayerMediaPeriodEventTime);
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 1036, new x9.e(qVarGenerateCurrentPlayerMediaPeriodEventTime, 6));
        g gVar = this.handler;
        qb.b.k(gVar);
        ((t) gVar).f20823a.post(new j4.o(19, this));
    }

    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.c(analyticsListener);
    }

    public final void sendEvent(q qVar, int i10, qb.h hVar) {
        this.eventTimes.put(i10, qVar);
        k kVar = this.listeners;
        kVar.b(i10, hVar);
        kVar.a();
    }

    public void setPlayer(g1 g1Var, Looper looper) {
        qb.b.j(this.player == null || this.mediaPeriodQueueTracker.f25176b.isEmpty());
        g1Var.getClass();
        this.player = g1Var;
        this.handler = ((d) this.clock).g(looper, null);
        k kVar = this.listeners;
        this.listeners = new k(kVar.f20785d, looper, kVar.f20782a, new kg.q(this, 12, g1Var));
    }

    public final void updateMediaPeriodQueueInfo(List<ya.v> list, ya.v vVar) {
        p pVar = this.mediaPeriodQueueTracker;
        g1 g1Var = this.player;
        g1Var.getClass();
        pVar.getClass();
        pVar.f25176b = h0.l(list);
        if (!list.isEmpty()) {
            pVar.f25179e = list.get(0);
            vVar.getClass();
            pVar.f25180f = vVar;
        }
        if (pVar.f25178d == null) {
            pVar.f25178d = p.b(g1Var, pVar.f25176b, pVar.f25179e, pVar.f25175a);
        }
        pVar.d(g1Var.getCurrentTimeline());
    }

    @Override // y9.j
    public final void onAudioInputFormatChanged(Format format, z9.e eVar) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1010, new x9.j(qVarGenerateReadingMediaPeriodEventTime, format, eVar, 0));
    }

    public final void onDrmSessionAcquired(int i10, ya.v vVar, int i11) {
        q qVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, vVar);
        sendEvent(qVarGenerateMediaPeriodEventTime, 1030, new x9.g(qVarGenerateMediaPeriodEventTime, i11, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        if (i10 == 1) {
            this.isSeeking = false;
        }
        p pVar = this.mediaPeriodQueueTracker;
        g1 g1Var = this.player;
        g1Var.getClass();
        pVar.f25178d = p.b(g1Var, pVar.f25176b, pVar.f25179e, pVar.f25175a);
        q qVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(qVarGenerateCurrentPlayerMediaPeriodEventTime, 12, new e5.v(qVarGenerateCurrentPlayerMediaPeriodEventTime, i10, f1Var, f1Var2, 1));
    }

    @Override // rb.u
    public final void onVideoInputFormatChanged(Format format, z9.e eVar) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1022, new x9.j(qVarGenerateReadingMediaPeriodEventTime, format, eVar, 1));
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public final void onVideoSizeChanged(rb.v vVar) {
        q qVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(qVarGenerateReadingMediaPeriodEventTime, 1028, new kg.q(qVarGenerateReadingMediaPeriodEventTime, 11, vVar));
    }

    private q generateEventTime(ya.v vVar) {
        this.player.getClass();
        w1 w1Var = vVar == null ? null : (w1) this.mediaPeriodQueueTracker.f25177c.get(vVar);
        if (vVar != null && w1Var != null) {
            return generateEventTime(w1Var, w1Var.g(vVar.f26177a, this.period).f4596c, vVar);
        }
        int currentWindowIndex = this.player.getCurrentWindowIndex();
        w1 currentTimeline = this.player.getCurrentTimeline();
        if (currentWindowIndex >= currentTimeline.o()) {
            currentTimeline = w1.f4774a;
        }
        return generateEventTime(currentTimeline, currentWindowIndex, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(AnalyticsListener analyticsListener, f fVar) {
    }
}
