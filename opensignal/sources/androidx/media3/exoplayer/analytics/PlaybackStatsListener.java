package androidx.media3.exoplayer.analytics;

import a5.d0;
import android.util.Pair;
import androidx.media3.common.Metadata;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.e1;
import androidx.media3.common.f;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.m;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.y0;
import d5.d;
import e5.a;
import e5.a0;
import e5.b;
import e5.c;
import e5.f0;
import e5.g0;
import e5.h0;
import e5.k0;
import e5.l0;
import e5.m0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o5.v;
import o5.z;

/* loaded from: classes.dex */
public final class PlaybackStatsListener implements c, f0 {
    private r audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private final l0 callback;
    private long discontinuityFromPositionMs;
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private k0 finishedPlaybackStats;
    private final boolean keepHistory;
    private Exception nonFatalException;
    private final y0 period;
    private final Map<String, m0> playbackStatsTrackers;
    private final g0 sessionManager;
    private final Map<String, a> sessionStartEventTimes;
    private r videoFormat;
    private h1 videoSize;

    public PlaybackStatsListener(boolean z10, l0 l0Var) {
        this.keepHistory = z10;
        a0 a0Var = new a0();
        this.sessionManager = a0Var;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = k0.I;
        this.period = new y0();
        this.videoSize = h1.f1694x;
        a0Var.f7802d = this;
    }

    private Pair<a, Boolean> findBestEventTime(b bVar, String str) {
        a aVar = null;
        boolean zA = false;
        for (int i10 = 0; i10 < bVar.f7805a.f1732a.size(); i10++) {
            a aVarB = bVar.b(bVar.f7805a.a(i10));
            boolean zA2 = ((a0) this.sessionManager).a(aVarB, str);
            if (aVar == null || ((zA2 && !zA) || (zA2 == zA && aVarB.f7788a > aVar.f7788a))) {
                aVar = aVarB;
                zA = zA2;
            }
        }
        aVar.getClass();
        a1 a1Var = aVar.f7789b;
        z zVar = aVar.f7791d;
        if (!zA && zVar != null) {
            int i11 = zVar.f1690b;
            Object obj = zVar.f1689a;
            if (zVar.a()) {
                long jD = a1Var.g(obj, this.period).d(i11);
                if (jD == Long.MIN_VALUE) {
                    jD = this.period.f1830r;
                }
                a aVar2 = new a(aVar.f7788a, a1Var, aVar.f7790c, new z(i11, zVar.f1692d, obj), d0.P(jD + this.period.f1831x), a1Var, aVar.f7794g, aVar.f7795h, aVar.f7796i, aVar.j);
                zA = ((a0) this.sessionManager).a(aVar2, str);
                aVar = aVar2;
            }
        }
        return Pair.create(aVar, Boolean.valueOf(zA));
    }

    private boolean hasEvent(b bVar, String str, int i10) {
        if (bVar.a(i10)) {
            return ((a0) this.sessionManager).a(bVar.b(i10), str);
        }
        return false;
    }

    private void maybeAddSessions(b bVar) {
        for (int i10 = 0; i10 < bVar.f7805a.f1732a.size(); i10++) {
            int iA = bVar.f7805a.a(i10);
            a aVarB = bVar.b(iA);
            if (iA == 0) {
                ((a0) this.sessionManager).h(aVarB);
            } else if (iA == 11) {
                ((a0) this.sessionManager).g(aVarB, this.discontinuityReason);
            } else {
                ((a0) this.sessionManager).f(aVarB);
            }
        }
    }

    public k0 getCombinedPlaybackStats() {
        int i10 = 1;
        k0[] k0VarArr = new k0[this.playbackStatsTrackers.size() + 1];
        k0VarArr[0] = this.finishedPlaybackStats;
        Iterator<m0> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            k0VarArr[i10] = it.next().a(false);
            i10++;
        }
        return k0.a(k0VarArr);
    }

    public k0 getPlaybackStats() {
        String str;
        a0 a0Var = (a0) this.sessionManager;
        synchronized (a0Var) {
            str = a0Var.f7804f;
        }
        m0 m0Var = str == null ? null : this.playbackStatsTrackers.get(str);
        if (m0Var == null) {
            return null;
        }
        return m0Var.a(false);
    }

    @Override // e5.f0
    public void onAdPlaybackStarted(a aVar, String str, String str2) {
        m0 m0Var = this.playbackStatsTrackers.get(str);
        m0Var.getClass();
        m0Var.L = true;
        m0Var.J = false;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(a aVar, f fVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioCodecError(a aVar, Exception exc) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(a aVar, String str, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(a aVar, String str) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDisabled(a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioEnabled(a aVar, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(a aVar, r rVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSinkError(a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioUnderrun(a aVar, int i10, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(a aVar, o0 o0Var) {
    }

    @Override // e5.c
    public void onBandwidthEstimate(a aVar, int i10, long j, long j7) {
        this.bandwidthTimeMs = i10;
        this.bandwidthBytes = j;
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(a aVar, List list) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderDisabled(a aVar, int i10, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderEnabled(a aVar, int i10, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderInitialized(a aVar, int i10, String str, long j) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderInputFormatChanged(a aVar, int i10, r rVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(a aVar, m mVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(a aVar, int i10, boolean z10) {
    }

    @Override // e5.c
    public void onDownstreamFormatChanged(a aVar, v vVar) {
        int i10 = vVar.f19072b;
        r rVar = vVar.f19073c;
        if (i10 == 2 || i10 == 0) {
            this.videoFormat = rVar;
        } else if (i10 == 1) {
            this.audioFormat = rVar;
        }
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(a aVar) {
    }

    @Override // e5.c
    public void onDrmSessionManagerError(a aVar, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(a aVar) {
    }

    @Override // e5.c
    public void onDroppedVideoFrames(a aVar, int i10, long j) {
        this.droppedFrames = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    @Override // e5.c
    public void onEvents(s0 s0Var, b bVar) {
        boolean z10;
        boolean z11;
        ?? r22;
        int i10;
        r rVar;
        if (bVar.f7805a.f1732a.size() == 0) {
            return;
        }
        maybeAddSessions(bVar);
        Iterator<String> it = this.playbackStatsTrackers.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<a, Boolean> pairFindBestEventTime = findBestEventTime(bVar, next);
            m0 m0Var = this.playbackStatsTrackers.get(next);
            boolean zHasEvent = hasEvent(bVar, next, 11);
            boolean zHasEvent2 = hasEvent(bVar, next, 1018);
            boolean zHasEvent3 = hasEvent(bVar, next, 1011);
            boolean zHasEvent4 = hasEvent(bVar, next, 1000);
            boolean zHasEvent5 = hasEvent(bVar, next, 10);
            boolean z12 = hasEvent(bVar, next, 1003) || hasEvent(bVar, next, 1024);
            boolean zHasEvent6 = hasEvent(bVar, next, 1006);
            boolean zHasEvent7 = hasEvent(bVar, next, 1004);
            boolean zHasEvent8 = hasEvent(bVar, next, 25);
            a aVar = (a) pairFindBestEventTime.first;
            boolean zBooleanValue = ((Boolean) pairFindBestEventTime.second).booleanValue();
            Iterator<String> it2 = it;
            long j = next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L;
            int i11 = zHasEvent2 ? this.droppedFrames : 0;
            androidx.media3.common.m0 playerError = zHasEvent5 ? s0Var.getPlayerError() : null;
            Exception exc = z12 ? this.nonFatalException : null;
            long j7 = zHasEvent6 ? this.bandwidthTimeMs : 0L;
            long j10 = zHasEvent6 ? this.bandwidthBytes : 0L;
            r rVar2 = zHasEvent7 ? this.videoFormat : null;
            r rVar3 = zHasEvent7 ? this.audioFormat : null;
            h1 h1Var = zHasEvent8 ? this.videoSize : null;
            boolean z13 = m0Var.f7874a;
            if (j != -9223372036854775807L) {
                z10 = zHasEvent3;
                z11 = zHasEvent4;
                m0Var.h(aVar.f7788a, j);
                r22 = 1;
                m0Var.J = true;
            } else {
                z10 = zHasEvent3;
                z11 = zHasEvent4;
                r22 = 1;
            }
            if (s0Var.getPlaybackState() != 2) {
                m0Var.J = false;
            }
            int playbackState = s0Var.getPlaybackState();
            if (playbackState == r22 || playbackState == 4 || zHasEvent) {
                m0Var.L = false;
            }
            if (playerError != null) {
                m0Var.M = r22;
                m0Var.F += r22;
                if (z13) {
                    m0Var.f7880g.add(new h0(aVar, playerError));
                }
            } else if (s0Var.getPlayerError() == null) {
                m0Var.M = false;
            }
            if (m0Var.K && !m0Var.L) {
                g1 currentTracks = s0Var.getCurrentTracks();
                if (currentTracks.a(2)) {
                    rVar = null;
                } else {
                    rVar = null;
                    m0Var.i(aVar, null);
                }
                if (!currentTracks.a(1)) {
                    m0Var.f(aVar, rVar);
                }
            }
            if (rVar2 != null) {
                m0Var.i(aVar, rVar2);
            }
            if (rVar3 != null) {
                m0Var.f(aVar, rVar3);
            }
            r rVar4 = m0Var.P;
            if (rVar4 != null && rVar4.N == -1 && h1Var != null) {
                q qVarA = rVar4.a();
                qVarA.f1747p = h1Var.f1695a;
                qVarA.f1748q = h1Var.f1696d;
                m0Var.i(aVar, new r(qVarA));
            }
            if (z11) {
                m0Var.N = true;
            }
            if (z10) {
                m0Var.E++;
            }
            m0Var.D += i11;
            m0Var.B += j7;
            m0Var.C += j10;
            if (exc != null) {
                m0Var.G++;
                if (z13) {
                    m0Var.f7881h.add(new h0(aVar, exc));
                }
            }
            int playbackState2 = s0Var.getPlaybackState();
            if (m0Var.J && m0Var.K) {
                i10 = 5;
            } else if (m0Var.M) {
                i10 = 13;
            } else if (!m0Var.K) {
                i10 = m0Var.N;
            } else if (m0Var.L) {
                i10 = 14;
            } else if (playbackState2 == 4) {
                i10 = 11;
            } else if (playbackState2 == 2) {
                int i12 = m0Var.H;
                i10 = (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 14) ? 2 : !s0Var.getPlayWhenReady() ? 7 : s0Var.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            } else {
                i10 = 3;
                if (playbackState2 != 3) {
                    i10 = (playbackState2 != 1 || m0Var.H == 0) ? m0Var.H : 12;
                } else if (!s0Var.getPlayWhenReady()) {
                    i10 = 4;
                } else if (s0Var.getPlaybackSuppressionReason() != 0) {
                    i10 = 9;
                }
            }
            float f10 = s0Var.getPlaybackParameters().f1725a;
            if (m0Var.H != i10 || m0Var.T != f10) {
                long j11 = aVar.f7788a;
                m0Var.h(j11, zBooleanValue ? aVar.f7792e : -9223372036854775807L);
                m0Var.e(j11);
                m0Var.d(j11);
            }
            m0Var.T = f10;
            if (m0Var.H != i10) {
                m0Var.j(aVar, i10);
            }
            it = it2;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (bVar.a(1028)) {
            ((a0) this.sessionManager).b(bVar.b(1028));
        }
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onLoadCanceled(a aVar, o5.q qVar, v vVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onLoadCompleted(a aVar, o5.q qVar, v vVar) {
    }

    @Override // e5.c
    public void onLoadError(a aVar, o5.q qVar, v vVar, IOException iOException, boolean z10) {
        this.nonFatalException = iOException;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onLoadStarted(a aVar, o5.q qVar, v vVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaItemTransition(a aVar, e0 e0Var, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(a aVar, androidx.media3.common.g0 g0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMetadata(a aVar, Metadata metadata) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(a aVar, boolean z10, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(a aVar, n0 n0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerError(a aVar, androidx.media3.common.m0 m0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(a aVar, androidx.media3.common.m0 m0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerReleased(a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(a aVar, boolean z10, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(a aVar, androidx.media3.common.g0 g0Var) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(a aVar, Object obj, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(a aVar, long j) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed(a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(a aVar) {
    }

    @Override // e5.f0
    public void onSessionActive(a aVar, String str) {
        m0 m0Var = this.playbackStatsTrackers.get(str);
        m0Var.getClass();
        m0Var.K = true;
    }

    @Override // e5.f0
    public void onSessionCreated(a aVar, String str) {
        this.playbackStatsTrackers.put(str, new m0(aVar, this.keepHistory));
        this.sessionStartEventTimes.put(str, aVar);
    }

    @Override // e5.f0
    public void onSessionFinished(a aVar, String str, boolean z10) {
        m0 m0VarRemove = this.playbackStatsTrackers.remove(str);
        m0VarRemove.getClass();
        this.sessionStartEventTimes.remove(str).getClass();
        long j = str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L;
        int i10 = 11;
        if (m0VarRemove.H != 11 && !z10) {
            i10 = 15;
        }
        long j7 = aVar.f7788a;
        m0VarRemove.h(j7, j);
        m0VarRemove.e(j7);
        m0VarRemove.d(j7);
        m0VarRemove.j(aVar, i10);
        this.finishedPlaybackStats = k0.a(this.finishedPlaybackStats, m0VarRemove.a(true));
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(a aVar, int i10, int i11) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTimelineChanged(a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(a aVar, e1 e1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTracksChanged(a aVar, g1 g1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(a aVar, v vVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoCodecError(a aVar, Exception exc) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(a aVar, String str, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(a aVar, String str) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDisabled(a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoEnabled(a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(a aVar, long j, int i10) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(a aVar, r rVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(a aVar, int i10, int i11, int i12, float f10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVolumeChanged(a aVar, float f10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(a aVar, r rVar, d dVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onCues(a aVar, z4.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(a aVar, int i10) {
    }

    @Override // e5.c
    public void onPositionDiscontinuity(a aVar, r0 r0Var, r0 r0Var2, int i10) {
        String str;
        if (this.discontinuityFromSession == null) {
            a0 a0Var = (a0) this.sessionManager;
            synchronized (a0Var) {
                str = a0Var.f7804f;
            }
            this.discontinuityFromSession = str;
            this.discontinuityFromPositionMs = r0Var.f1795y;
        }
        this.discontinuityReason = i10;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(a aVar, r rVar, d dVar) {
    }

    @Override // e5.c
    public void onVideoSizeChanged(a aVar, h1 h1Var) {
        this.videoSize = h1Var;
    }
}
