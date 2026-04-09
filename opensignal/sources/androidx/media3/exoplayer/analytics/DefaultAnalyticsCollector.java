package androidx.media3.exoplayer.analytics;

import a5.b;
import a5.d0;
import a5.g;
import a5.m;
import a5.x;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.lifecycle.f0;
import androidx.media3.common.Metadata;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.e1;
import androidx.media3.common.g0;
import androidx.media3.common.g1;
import androidx.media3.common.h0;
import androidx.media3.common.h1;
import androidx.media3.common.m0;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.p;
import androidx.media3.common.p0;
import androidx.media3.common.r;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.y0;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.trackselection.h;
import com.google.android.exoplayer2.w;
import d5.d;
import d5.f;
import d5.v;
import e5.a;
import e5.c;
import e5.e;
import e5.i;
import e5.j;
import e5.k;
import e5.l;
import e5.n;
import e5.o;
import e5.q;
import e5.t;
import e5.u;
import e5.y;
import java.io.IOException;
import java.util.List;
import o5.z;
import oe.s;

/* loaded from: classes.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final b clock;
    private final SparseArray<a> eventTimes;
    private g handler;
    private boolean isSeeking;
    private m listeners;
    private final y mediaPeriodQueueTracker;
    private final y0 period;
    private s0 player;
    private final z0 window;

    public DefaultAnalyticsCollector(b bVar) {
        bVar.getClass();
        this.clock = bVar;
        int i10 = d0.f105a;
        Looper looperMyLooper = Looper.myLooper();
        this.listeners = new m(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, bVar, new v(3));
        y0 y0Var = new y0();
        this.period = y0Var;
        this.window = new z0();
        this.mediaPeriodQueueTracker = new y(y0Var);
        this.eventTimes = new SparseArray<>();
    }

    private a generateLoadingMediaPeriodEventTime() {
        y yVar = this.mediaPeriodQueueTracker;
        return generateEventTime(yVar.f7948b.isEmpty() ? null : (z) s.i(yVar.f7948b));
    }

    private a generateMediaPeriodEventTime(int i10, z zVar) {
        this.player.getClass();
        if (zVar != null) {
            return ((a1) this.mediaPeriodQueueTracker.f7949c.get(zVar)) != null ? generateEventTime(zVar) : generateEventTime(a1.f1564a, i10, zVar);
        }
        a1 currentTimeline = this.player.getCurrentTimeline();
        if (i10 >= currentTimeline.o()) {
            currentTimeline = a1.f1564a;
        }
        return generateEventTime(currentTimeline, i10, null);
    }

    private a generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.f7951e);
    }

    private a generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.f7952f);
    }

    private a getEventTimeForErrorEvent(m0 m0Var) {
        h0 h0Var;
        return (!(m0Var instanceof f) || (h0Var = ((f) m0Var).D) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(new z(h0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$4(a aVar, String str, long j, long j7, c cVar) {
        cVar.onAudioDecoderInitialized(aVar, str, j);
        cVar.onAudioDecoderInitialized(aVar, str, j7, j);
        cVar.onDecoderInitialized(aVar, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDisabled$9(a aVar, d5.c cVar, c cVar2) {
        cVar2.onAudioDisabled(aVar, cVar);
        cVar2.onDecoderDisabled(aVar, 1, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioEnabled$3(a aVar, d5.c cVar, c cVar2) {
        cVar2.onAudioEnabled(aVar, cVar);
        cVar2.onDecoderEnabled(aVar, 1, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioInputFormatChanged$5(a aVar, r rVar, d dVar, c cVar) {
        cVar.onAudioInputFormatChanged(aVar, rVar);
        cVar.onAudioInputFormatChanged(aVar, rVar, dVar);
        cVar.onDecoderInputFormatChanged(aVar, 1, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$62(a aVar, int i10, c cVar) {
        cVar.onDrmSessionAcquired(aVar);
        cVar.onDrmSessionAcquired(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$32(a aVar, boolean z10, c cVar) {
        cVar.onLoadingChanged(aVar, z10);
        cVar.onIsLoadingChanged(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$43(a aVar, int i10, r0 r0Var, r0 r0Var2, c cVar) {
        cVar.onPositionDiscontinuity(aVar, i10);
        cVar.onPositionDiscontinuity(aVar, r0Var, r0Var2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$14(a aVar, String str, long j, long j7, c cVar) {
        cVar.onVideoDecoderInitialized(aVar, str, j);
        cVar.onVideoDecoderInitialized(aVar, str, j7, j);
        cVar.onDecoderInitialized(aVar, 2, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDisabled$18(a aVar, d5.c cVar, c cVar2) {
        cVar2.onVideoDisabled(aVar, cVar);
        cVar2.onDecoderDisabled(aVar, 2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoEnabled$13(a aVar, d5.c cVar, c cVar2) {
        cVar2.onVideoEnabled(aVar, cVar);
        cVar2.onDecoderEnabled(aVar, 2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoInputFormatChanged$15(a aVar, r rVar, d dVar, c cVar) {
        cVar.onVideoInputFormatChanged(aVar, rVar);
        cVar.onVideoInputFormatChanged(aVar, rVar, dVar);
        cVar.onDecoderInputFormatChanged(aVar, 2, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$57(a aVar, h1 h1Var, c cVar) {
        cVar.onVideoSizeChanged(aVar, h1Var);
        cVar.onVideoSizeChanged(aVar, h1Var.f1695a, h1Var.f1696d, h1Var.f1697g, h1Var.f1698r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$1(s0 s0Var, c cVar, p pVar) {
        cVar.onEvents(s0Var, new e5.b(pVar, this.eventTimes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 1028, new e5.d(aVarGenerateCurrentPlayerMediaPeriodEventTime, 0));
        this.listeners.d();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void addListener(c cVar) {
        cVar.getClass();
        this.listeners.a(cVar);
    }

    public final a generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.f7950d);
    }

    public final a generateEventTime(a1 a1Var, int i10, z zVar) {
        z zVar2 = a1Var.p() ? null : zVar;
        ((x) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = a1Var.equals(this.player.getCurrentTimeline()) && i10 == this.player.getCurrentMediaItemIndex();
        long jP = 0;
        if (zVar2 == null || !zVar2.a()) {
            if (z10) {
                jP = this.player.getContentPosition();
            } else if (!a1Var.p()) {
                jP = d0.P(a1Var.m(i10, this.window, 0L).I);
            }
        } else if (z10 && this.player.getCurrentAdGroupIndex() == zVar2.f1690b && this.player.getCurrentAdIndexInAdGroup() == zVar2.f1691c) {
            jP = this.player.getCurrentPosition();
        }
        return new a(jElapsedRealtime, a1Var, i10, zVar2, jP, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.f7950d, this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, -1, new e5.d(aVarGenerateCurrentPlayerMediaPeriodEventTime, 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onAudioAttributesChanged(androidx.media3.common.f fVar) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 20, new h(aVarGenerateReadingMediaPeriodEventTime, 8, fVar));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(Exception exc) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1029, new e5.m(aVarGenerateReadingMediaPeriodEventTime, exc, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j7) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1008, new e5.p(aVarGenerateReadingMediaPeriodEventTime, str, j7, j, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(String str) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1012, new e5.h(aVarGenerateReadingMediaPeriodEventTime, str, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(d5.c cVar) {
        a aVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(aVarGeneratePlayingMediaPeriodEventTime, 1013, new e(aVarGeneratePlayingMediaPeriodEventTime, 1, cVar));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(d5.c cVar) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1007, new e(aVarGenerateReadingMediaPeriodEventTime, 0, cVar));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(r rVar, d dVar) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1009, new t(aVarGenerateReadingMediaPeriodEventTime, rVar, dVar, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(long j) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1010, new e5.f(aVarGenerateReadingMediaPeriodEventTime, j, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onAudioSessionIdChanged(int i10) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 21, new j(aVarGenerateReadingMediaPeriodEventTime, i10, 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(Exception exc) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1014, new e5.m(aVarGenerateReadingMediaPeriodEventTime, exc, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(int i10, long j, long j7) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1011, new k(aVarGenerateReadingMediaPeriodEventTime, i10, j, j7, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onAvailableCommandsChanged(o0 o0Var) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 13, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 6, o0Var));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onBandwidthSample(int i10, long j, long j7) {
        a aVarGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(aVarGenerateLoadingMediaPeriodEventTime, 1006, new k(aVarGenerateLoadingMediaPeriodEventTime, i10, j, j7, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onCues(List<z4.b> list) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 27, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 11, list));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onDeviceInfoChanged(androidx.media3.common.m mVar) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 29, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 12, mVar));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onDeviceVolumeChanged(int i10, boolean z10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 30, new o(aVarGenerateCurrentPlayerMediaPeriodEventTime, i10, z10));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, o5.f0
    public final void onDownstreamFormatChanged(int i10, z zVar, o5.v vVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1004, new e5.s(aVarGenerateMediaPeriodEventTime, vVar, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDrmKeysLoaded(int i10, z zVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1023, new e5.d(aVarGenerateMediaPeriodEventTime, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDrmKeysRemoved(int i10, z zVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1026, new e5.d(aVarGenerateMediaPeriodEventTime, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDrmKeysRestored(int i10, z zVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1025, new e5.d(aVarGenerateMediaPeriodEventTime, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, z zVar) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDrmSessionManagerError(int i10, z zVar, Exception exc) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1024, new e5.m(aVarGenerateMediaPeriodEventTime, exc, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDrmSessionReleased(int i10, z zVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1027, new e5.d(aVarGenerateMediaPeriodEventTime, 6));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i10, long j) {
        a aVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(aVarGeneratePlayingMediaPeriodEventTime, 1018, new q(aVarGeneratePlayingMediaPeriodEventTime, i10, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onEvents(s0 s0Var, p0 p0Var) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onIsLoadingChanged(boolean z10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 3, new e5.g(aVarGenerateCurrentPlayerMediaPeriodEventTime, z10, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onIsPlayingChanged(boolean z10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 7, new e5.g(aVarGenerateCurrentPlayerMediaPeriodEventTime, z10, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, o5.f0
    public final void onLoadCanceled(int i10, z zVar, o5.q qVar, o5.v vVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1002, new i(aVarGenerateMediaPeriodEventTime, qVar, vVar, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, o5.f0
    public final void onLoadCompleted(int i10, z zVar, o5.q qVar, o5.v vVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1001, new i(aVarGenerateMediaPeriodEventTime, qVar, vVar, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, o5.f0
    public final void onLoadError(int i10, z zVar, o5.q qVar, o5.v vVar, IOException iOException, boolean z10) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1003, new n(aVarGenerateMediaPeriodEventTime, qVar, vVar, iOException, z10, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, o5.f0
    public final void onLoadStarted(int i10, z zVar, o5.q qVar, o5.v vVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1000, new i(aVarGenerateMediaPeriodEventTime, qVar, vVar, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onLoadingChanged(boolean z10) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onMaxSeekToPreviousPositionChanged(long j) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 18, new e5.f(aVarGenerateCurrentPlayerMediaPeriodEventTime, j, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onMediaItemTransition(e0 e0Var, int i10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 1, new w(aVarGenerateCurrentPlayerMediaPeriodEventTime, e0Var, i10, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onMediaMetadataChanged(g0 g0Var) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 14, new u(aVarGenerateCurrentPlayerMediaPeriodEventTime, g0Var, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onMetadata(Metadata metadata) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 28, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 9, metadata));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 5, new o(aVarGenerateCurrentPlayerMediaPeriodEventTime, z10, i10, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPlaybackParametersChanged(n0 n0Var) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 12, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 4, n0Var));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPlaybackStateChanged(int i10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 4, new j(aVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 6, new j(aVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPlayerError(m0 m0Var) {
        a eventTimeForErrorEvent = getEventTimeForErrorEvent(m0Var);
        sendEvent(eventTimeForErrorEvent, 10, new e5.r(eventTimeForErrorEvent, m0Var, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onPlayerErrorChanged(m0 m0Var) {
        a eventTimeForErrorEvent = getEventTimeForErrorEvent(m0Var);
        sendEvent(eventTimeForErrorEvent, 10, new e5.r(eventTimeForErrorEvent, m0Var, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, -1, new o(aVarGenerateCurrentPlayerMediaPeriodEventTime, z10, i10, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onPlaylistMetadataChanged(g0 g0Var) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 15, new u(aVarGenerateCurrentPlayerMediaPeriodEventTime, g0Var, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onRepeatModeChanged(int i10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 8, new j(aVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onSeekBackIncrementChanged(long j) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 16, new e5.f(aVarGenerateCurrentPlayerMediaPeriodEventTime, j, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onSeekForwardIncrementChanged(long j) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 17, new e5.f(aVarGenerateCurrentPlayerMediaPeriodEventTime, j, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onSeekProcessed() {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, -1, new e5.d(aVarGenerateCurrentPlayerMediaPeriodEventTime, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 9, new e5.g(aVarGenerateCurrentPlayerMediaPeriodEventTime, z10, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 23, new e5.g(aVarGenerateReadingMediaPeriodEventTime, z10, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 24, new e5.x(aVarGenerateReadingMediaPeriodEventTime, i10, i11, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onTimelineChanged(a1 a1Var, int i10) {
        y yVar = this.mediaPeriodQueueTracker;
        s0 s0Var = this.player;
        s0Var.getClass();
        yVar.f7950d = y.b(s0Var, yVar.f7948b, yVar.f7951e, yVar.f7947a);
        yVar.d(s0Var.getCurrentTimeline());
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 0, new j(aVarGenerateCurrentPlayerMediaPeriodEventTime, i10, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onTrackSelectionParametersChanged(e1 e1Var) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 19, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 5, e1Var));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onTracksChanged(g1 g1Var) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 2, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 10, g1Var));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, o5.f0
    public final void onUpstreamDiscarded(int i10, z zVar, o5.v vVar) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1005, new e5.s(aVarGenerateMediaPeriodEventTime, vVar, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(Exception exc) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1030, new e5.m(aVarGenerateReadingMediaPeriodEventTime, exc, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j7) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1016, new e5.p(aVarGenerateReadingMediaPeriodEventTime, str, j7, j, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(String str) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1019, new e5.h(aVarGenerateReadingMediaPeriodEventTime, str, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(d5.c cVar) {
        a aVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(aVarGeneratePlayingMediaPeriodEventTime, 1020, new e(aVarGeneratePlayingMediaPeriodEventTime, 3, cVar));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(d5.c cVar) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1015, new e(aVarGenerateReadingMediaPeriodEventTime, 2, cVar));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long j, int i10) {
        a aVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(aVarGeneratePlayingMediaPeriodEventTime, 1021, new q(aVarGeneratePlayingMediaPeriodEventTime, j, i10));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(r rVar, d dVar) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 1017, new t(aVarGenerateReadingMediaPeriodEventTime, rVar, dVar, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onVideoSizeChanged(h1 h1Var) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 25, new h(aVarGenerateReadingMediaPeriodEventTime, 13, h1Var));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onVolumeChanged(float f10) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 22, new l(aVarGenerateReadingMediaPeriodEventTime, f10, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void release() {
        g gVar = this.handler;
        a5.a.j(gVar);
        ((a5.z) gVar).d(new f0(11, this));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void removeListener(c cVar) {
        this.listeners.e(cVar);
    }

    public final void sendEvent(a aVar, int i10, a5.j jVar) {
        this.eventTimes.put(i10, aVar);
        this.listeners.f(i10, jVar);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void setPlayer(s0 s0Var, Looper looper) {
        a5.a.i(this.player == null || this.mediaPeriodQueueTracker.f7948b.isEmpty());
        s0Var.getClass();
        this.player = s0Var;
        this.handler = ((x) this.clock).a(looper, null);
        m mVar = this.listeners;
        this.listeners = new m(mVar.f135d, looper, mVar.f132a, new h(this, 7, s0Var));
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.listeners.f140i = z10;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<z> list, z zVar) {
        y yVar = this.mediaPeriodQueueTracker;
        s0 s0Var = this.player;
        s0Var.getClass();
        yVar.getClass();
        yVar.f7948b = oe.h0.l(list);
        if (!list.isEmpty()) {
            yVar.f7951e = list.get(0);
            zVar.getClass();
            yVar.f7952f = zVar;
        }
        if (yVar.f7950d == null) {
            yVar.f7950d = y.b(s0Var, yVar.f7948b, yVar.f7951e, yVar.f7947a);
        }
        yVar.d(s0Var.getCurrentTimeline());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDrmSessionAcquired(int i10, z zVar, int i11) {
        a aVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, zVar);
        sendEvent(aVarGenerateMediaPeriodEventTime, 1022, new j(aVarGenerateMediaPeriodEventTime, i11, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public final void onPositionDiscontinuity(r0 r0Var, r0 r0Var2, int i10) {
        if (i10 == 1) {
            this.isSeeking = false;
        }
        y yVar = this.mediaPeriodQueueTracker;
        s0 s0Var = this.player;
        s0Var.getClass();
        yVar.f7950d = y.b(s0Var, yVar.f7948b, yVar.f7951e, yVar.f7947a);
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 11, new e5.v(aVarGenerateCurrentPlayerMediaPeriodEventTime, i10, r0Var, r0Var2, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(Object obj, long j) {
        a aVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(aVarGenerateReadingMediaPeriodEventTime, 26, new e5.w(aVarGenerateReadingMediaPeriodEventTime, obj, j, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.q0
    public void onCues(z4.c cVar) {
        a aVarGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(aVarGenerateCurrentPlayerMediaPeriodEventTime, 27, new h(aVarGenerateCurrentPlayerMediaPeriodEventTime, 14, cVar));
    }

    private a generateEventTime(z zVar) {
        this.player.getClass();
        a1 a1Var = zVar == null ? null : (a1) this.mediaPeriodQueueTracker.f7949c.get(zVar);
        if (zVar != null && a1Var != null) {
            return generateEventTime(a1Var, a1Var.g(zVar.f1689a, this.period).f1829g, zVar);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        a1 currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.o()) {
            currentTimeline = a1.f1564a;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(c cVar, p pVar) {
    }
}
