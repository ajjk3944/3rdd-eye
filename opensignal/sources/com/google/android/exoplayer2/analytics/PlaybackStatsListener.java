package com.google.android.exoplayer2.analytics;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ob.j;
import rb.v;
import x9.a0;
import x9.q;
import x9.r;
import x9.s;
import x9.t;
import x9.u;
import x9.y;
import x9.z;
import y9.b;
import ya.m;
import z9.e;

/* loaded from: classes.dex */
public final class PlaybackStatsListener implements AnalyticsListener {
    private Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private final z callback;
    private long discontinuityFromPositionMs;
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private y finishedPlaybackStats;
    private final boolean keepHistory;
    private Exception nonFatalException;
    private final u1 period;
    private final Map<String, a0> playbackStatsTrackers;
    private final u sessionManager;
    private final Map<String, q> sessionStartEventTimes;
    private Format videoFormat;
    private v videoSize;

    public PlaybackStatsListener(boolean z10, z zVar) {
        this.keepHistory = z10;
        t tVar = new t();
        this.sessionManager = tVar;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = y.I;
        this.period = new u1();
        this.videoSize = v.f21523e;
        tVar.f25204d = this;
    }

    private Pair<q, Boolean> findBestEventTime(r rVar, String str) {
        q qVar = null;
        boolean zA = false;
        for (int i10 = 0; i10 < rVar.f25190a.f20777a.size(); i10++) {
            q qVar2 = (q) rVar.f25191b.get(rVar.f25190a.a(i10));
            qVar2.getClass();
            boolean zA2 = ((t) this.sessionManager).a(qVar2, str);
            if (qVar == null || ((zA2 && !zA) || (zA2 == zA && qVar2.f25181a > qVar.f25181a))) {
                qVar = qVar2;
                zA = zA2;
            }
        }
        qVar.getClass();
        w1 w1Var = qVar.f25182b;
        ya.v vVar = qVar.f25184d;
        if (!zA && vVar != null) {
            int i11 = vVar.f26178b;
            Object obj = vVar.f26177a;
            if (vVar.a()) {
                w1Var.g(obj, this.period).c(i11);
                q qVar3 = new q(qVar.f25181a, w1Var, qVar.f25183c, new ya.v(i11, vVar.f26180d, obj), h.d(this.period.f4598e), w1Var, qVar.f25187g, qVar.f25188h, qVar.f25189i, qVar.j);
                zA = ((t) this.sessionManager).a(qVar3, str);
                qVar = qVar3;
            }
        }
        return Pair.create(qVar, Boolean.valueOf(zA));
    }

    private boolean hasEvent(r rVar, String str, int i10) {
        if (!rVar.f25190a.f20777a.get(i10)) {
            return false;
        }
        u uVar = this.sessionManager;
        q qVar = (q) rVar.f25191b.get(i10);
        qVar.getClass();
        return ((t) uVar).a(qVar, str);
    }

    private void maybeAddSessions(r rVar) {
        for (int i10 = 0; i10 < rVar.f25190a.f20777a.size(); i10++) {
            int iA = rVar.f25190a.a(i10);
            q qVar = (q) rVar.f25191b.get(iA);
            qVar.getClass();
            if (iA == 0) {
                t tVar = (t) this.sessionManager;
                synchronized (tVar) {
                    try {
                        tVar.f25204d.getClass();
                        w1 w1Var = tVar.f25205e;
                        tVar.f25205e = qVar.f25182b;
                        Iterator it = tVar.f25203c.values().iterator();
                        while (it.hasNext()) {
                            s sVar = (s) it.next();
                            if (!sVar.c(w1Var, tVar.f25205e)) {
                                it.remove();
                                if (sVar.f25196e) {
                                    if (sVar.f25192a.equals(tVar.f25206f)) {
                                        tVar.f25206f = null;
                                    }
                                    tVar.f25204d.onSessionFinished(qVar, sVar.f25192a, false);
                                }
                            }
                        }
                        tVar.c(qVar);
                    } finally {
                    }
                }
            } else if (iA == 12) {
                u uVar = this.sessionManager;
                int i11 = this.discontinuityReason;
                t tVar2 = (t) uVar;
                synchronized (tVar2) {
                    try {
                        tVar2.f25204d.getClass();
                        boolean z10 = i11 == 0;
                        Iterator it2 = tVar2.f25203c.values().iterator();
                        while (it2.hasNext()) {
                            s sVar2 = (s) it2.next();
                            if (sVar2.b(qVar)) {
                                it2.remove();
                                if (sVar2.f25196e) {
                                    boolean zEquals = sVar2.f25192a.equals(tVar2.f25206f);
                                    boolean z11 = z10 && zEquals && sVar2.f25197f;
                                    if (zEquals) {
                                        tVar2.f25206f = null;
                                    }
                                    tVar2.f25204d.onSessionFinished(qVar, sVar2.f25192a, z11);
                                }
                            }
                        }
                        tVar2.c(qVar);
                    } finally {
                    }
                }
            } else {
                ((t) this.sessionManager).d(qVar);
            }
        }
    }

    public y getCombinedPlaybackStats() {
        int i10 = 1;
        y[] yVarArr = new y[this.playbackStatsTrackers.size() + 1];
        yVarArr[0] = this.finishedPlaybackStats;
        Iterator<a0> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            yVarArr[i10] = it.next().a(false);
            i10++;
        }
        return y.a(yVarArr);
    }

    public y getPlaybackStats() {
        String str;
        t tVar = (t) this.sessionManager;
        synchronized (tVar) {
            str = tVar.f25206f;
        }
        a0 a0Var = str == null ? null : this.playbackStatsTrackers.get(str);
        if (a0Var == null) {
            return null;
        }
        return a0Var.a(false);
    }

    public void onAdPlaybackStarted(q qVar, String str, String str2) {
        a0 a0Var = this.playbackStatsTrackers.get(str);
        a0Var.getClass();
        a0Var.L = true;
        a0Var.J = false;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(q qVar, b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioCodecError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(q qVar, String str, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(q qVar, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDisabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioEnabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(q qVar, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioSinkError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioUnderrun(q qVar, int i10, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q qVar, c1 c1Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(q qVar, int i10, long j, long j7) {
        this.bandwidthTimeMs = i10;
        this.bandwidthBytes = j;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderDisabled(q qVar, int i10, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderEnabled(q qVar, int i10, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderInitialized(q qVar, int i10, String str, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderInputFormatChanged(q qVar, int i10, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(q qVar, ya.r rVar) {
        int i10 = rVar.f26147b;
        Format format = rVar.f26148c;
        if (i10 == 2 || i10 == 0) {
            this.videoFormat = format;
        } else if (i10 == 1) {
            this.audioFormat = format;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(q qVar, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(q qVar, int i10, long j) {
        this.droppedFrames = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f3 A[PHI: r4
  0x01f3: PHI (r4v13 char) = (r4v11 char), (r4v12 char) binds: [B:117:0x01f1, B:145:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v64 */
    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvents(com.google.android.exoplayer2.g1 r30, x9.r r31) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.PlaybackStatsListener.onEvents(com.google.android.exoplayer2.g1, x9.r):void");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onLoadCanceled(q qVar, m mVar, ya.r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onLoadCompleted(q qVar, m mVar, ya.r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(q qVar, m mVar, ya.r rVar, IOException iOException, boolean z10) {
        this.nonFatalException = iOException;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onLoadStarted(q qVar, m mVar, ya.r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMediaItemTransition(q qVar, n0 n0Var, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(q qVar, p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMetadata(q qVar, Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(q qVar, boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(q qVar, b1 b1Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlayerError(q qVar, z0 z0Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlayerReleased(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(q qVar, boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(q qVar, p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(q qVar, Object obj, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(q qVar) {
    }

    public void onSessionActive(q qVar, String str) {
        a0 a0Var = this.playbackStatsTrackers.get(str);
        a0Var.getClass();
        a0Var.K = true;
    }

    public void onSessionCreated(q qVar, String str) {
        this.playbackStatsTrackers.put(str, new a0(qVar, this.keepHistory));
        this.sessionStartEventTimes.put(str, qVar);
    }

    public void onSessionFinished(q qVar, String str, boolean z10) {
        a0 a0VarRemove = this.playbackStatsTrackers.remove(str);
        a0VarRemove.getClass();
        this.sessionStartEventTimes.remove(str).getClass();
        long j = str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L;
        int i10 = 11;
        if (a0VarRemove.H != 11 && !z10) {
            i10 = 15;
        }
        long j7 = qVar.f25181a;
        a0VarRemove.h(j7, j);
        a0VarRemove.e(j7);
        a0VarRemove.d(j7);
        a0VarRemove.j(qVar, i10);
        this.finishedPlaybackStats = y.a(this.finishedPlaybackStats, a0VarRemove.a(true));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(q qVar, List list) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(q qVar, int i10, int i11) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onTimelineChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onTracksChanged(q qVar, TrackGroupArray trackGroupArray, j jVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(q qVar, ya.r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoCodecError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(q qVar, String str, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(q qVar, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDisabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoEnabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(q qVar, long j, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(q qVar, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(q qVar, int i10, int i11, int i12, float f10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVolumeChanged(q qVar, float f10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(q qVar, String str, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(q qVar, Format format, e eVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(q qVar, f1 f1Var, f1 f1Var2, int i10) {
        String str;
        if (this.discontinuityFromSession == null) {
            t tVar = (t) this.sessionManager;
            synchronized (tVar) {
                str = tVar.f25206f;
            }
            this.discontinuityFromSession = str;
            this.discontinuityFromPositionMs = f1Var.f4132e;
        }
        this.discontinuityReason = i10;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(q qVar, String str, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(q qVar, Format format, e eVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(q qVar, v vVar) {
        this.videoSize = vVar;
    }
}
