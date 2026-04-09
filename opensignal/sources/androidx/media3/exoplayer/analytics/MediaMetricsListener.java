package androidx.media3.exoplayer.analytics;

import a5.d0;
import a5.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Metadata;
import androidx.media3.common.a1;
import androidx.media3.common.e1;
import androidx.media3.common.f1;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.j;
import androidx.media3.common.k0;
import androidx.media3.common.m0;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.r;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.y0;
import androidx.media3.common.z0;
import b5.c0;
import b5.u;
import b5.v;
import b5.w;
import d5.f;
import e5.a0;
import e5.b;
import e5.b0;
import e5.c;
import e5.e0;
import e5.f0;
import e5.g0;
import f5.k;
import i5.a;
import i5.d;
import i5.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import l5.l;
import l5.p;
import o5.q;
import o5.z;
import oe.h0;

/* loaded from: classes.dex */
public final class MediaMetricsListener implements c, f0 {
    private String activeSessionId;
    private int audioUnderruns;
    private final Context context;
    private r currentAudioFormat;
    private r currentTextFormat;
    private r currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;
    private PlaybackMetrics.Builder metricsBuilder;
    private e0 pendingAudioFormat;
    private m0 pendingPlayerError;
    private e0 pendingTextFormat;
    private e0 pendingVideoFormat;
    private final PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final g0 sessionManager;
    private final z0 window = new z0();
    private final y0 period = new y0();
    private final HashMap<String, Long> bandwidthBytes = new HashMap<>();
    private final HashMap<String, Long> bandwidthTimeMs = new HashMap<>();
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    private MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        a0 a0Var = new a0();
        this.sessionManager = a0Var;
        a0Var.f7802d = this;
    }

    private boolean canReportPendingFormatUpdate(e0 e0Var) {
        String str;
        if (e0Var == null) {
            return false;
        }
        String str2 = e0Var.f7816c;
        a0 a0Var = (a0) this.sessionManager;
        synchronized (a0Var) {
            str = a0Var.f7804f;
        }
        return str2.equals(str);
    }

    public static MediaMetricsListener create(Context context) {
        MediaMetricsManager mediaMetricsManagerA = b0.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new MediaMetricsListener(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            Long l10 = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.metricsBuilder.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.playbackSession.reportPlaybackMetrics(this.metricsBuilder.build());
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int getDrmErrorCode(int i10) {
        switch (d0.q(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static DrmInitData getDrmInitData(h0 h0Var) {
        DrmInitData drmInitData;
        oe.f0 f0VarListIterator = h0Var.listIterator(0);
        while (f0VarListIterator.hasNext()) {
            f1 f1Var = (f1) f0VarListIterator.next();
            for (int i10 = 0; i10 < f1Var.f1650a; i10++) {
                if (f1Var.f1654x[i10] && (drmInitData = f1Var.f1651d.f1575r[i10].K) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.f1543r; i10++) {
            UUID uuid = drmInitData.f1540a[i10].f1545d;
            if (uuid.equals(j.f1704d)) {
                return 3;
            }
            if (uuid.equals(j.f1705e)) {
                return 2;
            }
            if (uuid.equals(j.f1703c)) {
                return 6;
            }
        }
        return 1;
    }

    private static e5.d0 getErrorInfo(m0 m0Var, Context context, boolean z10) throws NumberFormatException {
        int i10;
        boolean z11;
        if (m0Var.f1722a == 1001) {
            return new e5.d0(20, 0);
        }
        if (m0Var instanceof f) {
            f fVar = (f) m0Var;
            z11 = fVar.f6984g == 1;
            i10 = fVar.B;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable cause = m0Var.getCause();
        cause.getClass();
        if (!(cause instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new e5.d0(35, 0);
            }
            if (z11 && i10 == 3) {
                return new e5.d0(15, 0);
            }
            if (z11 && i10 == 2) {
                return new e5.d0(23, 0);
            }
            if (cause instanceof p) {
                return new e5.d0(13, d0.r(((p) cause).f14734r));
            }
            if (cause instanceof l) {
                return new e5.d0(14, d0.r(((l) cause).f14722a));
            }
            if (cause instanceof OutOfMemoryError) {
                return new e5.d0(14, 0);
            }
            if (cause instanceof f5.j) {
                return new e5.d0(17, ((f5.j) cause).f8532a);
            }
            if (cause instanceof k) {
                return new e5.d0(18, ((k) cause).f8534a);
            }
            if (d0.f105a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                return new e5.d0(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
            return new e5.d0(getDrmErrorCode(errorCode), errorCode);
        }
        if (cause instanceof w) {
            return new e5.d0(5, ((w) cause).f2468r);
        }
        if ((cause instanceof v) || (cause instanceof k0)) {
            return new e5.d0(z10 ? 10 : 11, 0);
        }
        boolean z12 = cause instanceof u;
        if (z12 || (cause instanceof c0)) {
            if (t.c(context).d() == 1) {
                return new e5.d0(3, 0);
            }
            Throwable cause2 = cause.getCause();
            return cause2 instanceof UnknownHostException ? new e5.d0(6, 0) : cause2 instanceof SocketTimeoutException ? new e5.d0(7, 0) : (z12 && ((u) cause).f2467g == 1) ? new e5.d0(4, 0) : new e5.d0(8, 0);
        }
        if (m0Var.f1722a == 1002) {
            return new e5.d0(21, 0);
        }
        if (!(cause instanceof d)) {
            if (!(cause instanceof b5.r) || !(cause.getCause() instanceof FileNotFoundException)) {
                return new e5.d0(9, 0);
            }
            Throwable cause3 = cause.getCause();
            cause3.getClass();
            Throwable cause4 = cause3.getCause();
            return (d0.f105a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) ? new e5.d0(32, 0) : new e5.d0(31, 0);
        }
        Throwable cause5 = cause.getCause();
        cause5.getClass();
        int i11 = d0.f105a;
        if (i11 < 21 || !(cause5 instanceof MediaDrm.MediaDrmStateException)) {
            return (i11 < 23 || !(cause5 instanceof MediaDrmResetException)) ? (i11 < 18 || !(cause5 instanceof NotProvisionedException)) ? (i11 < 18 || !(cause5 instanceof DeniedByServerException)) ? cause5 instanceof m ? new e5.d0(23, 0) : cause5 instanceof a ? new e5.d0(28, 0) : new e5.d0(30, 0) : new e5.d0(29, 0) : new e5.d0(24, 0) : new e5.d0(27, 0);
        }
        int iR = d0.r(((MediaDrm.MediaDrmStateException) cause5).getDiagnosticInfo());
        return new e5.d0(getDrmErrorCode(iR), iR);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        int i10 = d0.f105a;
        String[] strArrSplit = str.split("-", -1);
        return Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
    }

    private static int getNetworkType(Context context) {
        switch (t.c(context).d()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            default:
                return 1;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(androidx.media3.common.e0 e0Var) {
        androidx.media3.common.b0 b0Var = e0Var.f1608d;
        if (b0Var == null) {
            return 0;
        }
        int iB = d0.B(b0Var.f1560a, b0Var.f1561b);
        if (iB == 0) {
            return 3;
        }
        if (iB != 1) {
            return iB != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int getTrackChangeReason(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void maybeAddSessions(b bVar) {
        for (int i10 = 0; i10 < bVar.f7805a.f1732a.size(); i10++) {
            int iA = bVar.f7805a.a(i10);
            e5.a aVarB = bVar.b(iA);
            if (iA == 0) {
                ((a0) this.sessionManager).h(aVarB);
            } else if (iA == 11) {
                ((a0) this.sessionManager).g(aVarB, this.discontinuityReason);
            } else {
                ((a0) this.sessionManager).f(aVarB);
            }
        }
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.context);
        if (networkType != this.currentNetworkType) {
            this.currentNetworkType = networkType;
            this.playbackSession.reportNetworkEvent(e5.c0.g().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private void maybeReportPlaybackError(long j) throws NumberFormatException {
        m0 m0Var = this.pendingPlayerError;
        if (m0Var == null) {
            return;
        }
        e5.d0 errorInfo = getErrorInfo(m0Var, this.context, this.ioErrorType == 4);
        this.playbackSession.reportPlaybackErrorEvent(e5.c0.h().setTimeSinceCreatedMillis(j - this.startTimeMs).setErrorCode(errorInfo.f7809a).setSubErrorCode(errorInfo.f7810b).setException(m0Var).build());
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeReportPlaybackStateChange(s0 s0Var, b bVar, long j) {
        if (s0Var.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (s0Var.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (bVar.a(10)) {
            this.hasFatalError = true;
        }
        int iResolveNewPlaybackState = resolveNewPlaybackState(s0Var);
        if (this.currentPlaybackState != iResolveNewPlaybackState) {
            this.currentPlaybackState = iResolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            this.playbackSession.reportPlaybackStateEvent(e5.c0.j().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private void maybeReportTrackChanges(s0 s0Var, b bVar, long j) {
        if (bVar.a(2)) {
            g1 currentTracks = s0Var.getCurrentTracks();
            boolean zA = currentTracks.a(2);
            boolean zA2 = currentTracks.a(1);
            boolean zA3 = currentTracks.a(3);
            if (zA || zA2 || zA3) {
                if (!zA) {
                    maybeUpdateVideoFormat(j, null, 0);
                }
                if (!zA2) {
                    maybeUpdateAudioFormat(j, null, 0);
                }
                if (!zA3) {
                    maybeUpdateTextFormat(j, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat)) {
            e0 e0Var = this.pendingVideoFormat;
            r rVar = e0Var.f7814a;
            if (rVar.N != -1) {
                maybeUpdateVideoFormat(j, rVar, e0Var.f7815b);
                this.pendingVideoFormat = null;
            }
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            e0 e0Var2 = this.pendingAudioFormat;
            maybeUpdateAudioFormat(j, e0Var2.f7814a, e0Var2.f7815b);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            e0 e0Var3 = this.pendingTextFormat;
            maybeUpdateTextFormat(j, e0Var3.f7814a, e0Var3.f7815b);
            this.pendingTextFormat = null;
        }
    }

    private void maybeUpdateAudioFormat(long j, r rVar, int i10) {
        if (d0.a(this.currentAudioFormat, rVar)) {
            return;
        }
        if (this.currentAudioFormat == null && i10 == 0) {
            i10 = 1;
        }
        this.currentAudioFormat = rVar;
        reportTrackChangeEvent(0, j, rVar, i10);
    }

    private void maybeUpdateMetricsBuilderValues(s0 s0Var, b bVar) {
        DrmInitData drmInitData;
        if (bVar.a(0)) {
            e5.a aVarB = bVar.b(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(aVarB.f7789b, aVarB.f7791d);
            }
        }
        if (bVar.a(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(s0Var.getCurrentTracks().f1688a)) != null) {
            PlaybackMetrics.Builder builder = this.metricsBuilder;
            int i10 = d0.f105a;
            b0.i(builder).setDrmType(getDrmType(drmInitData));
        }
        if (bVar.a(1011)) {
            this.audioUnderruns++;
        }
    }

    private void maybeUpdateTextFormat(long j, r rVar, int i10) {
        if (d0.a(this.currentTextFormat, rVar)) {
            return;
        }
        if (this.currentTextFormat == null && i10 == 0) {
            i10 = 1;
        }
        this.currentTextFormat = rVar;
        reportTrackChangeEvent(2, j, rVar, i10);
    }

    private void maybeUpdateTimelineMetadata(a1 a1Var, z zVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (zVar == null || (iB = a1Var.b(zVar.f1689a)) == -1) {
            return;
        }
        a1Var.f(iB, this.period, false);
        a1Var.n(this.period.f1829g, this.window);
        builder.setStreamType(getStreamType(this.window.f1844g));
        z0 z0Var = this.window;
        if (z0Var.J != -9223372036854775807L && !z0Var.H && !z0Var.E && !z0Var.a()) {
            builder.setMediaDurationMillis(d0.P(this.window.J));
        }
        builder.setPlaybackType(this.window.a() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void maybeUpdateVideoFormat(long j, r rVar, int i10) {
        if (d0.a(this.currentVideoFormat, rVar)) {
            return;
        }
        if (this.currentVideoFormat == null && i10 == 0) {
            i10 = 1;
        }
        this.currentVideoFormat = rVar;
        reportTrackChangeEvent(1, j, rVar, i10);
    }

    private void reportTrackChangeEvent(int i10, long j, r rVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = e5.c0.m(i10).setTimeSinceCreatedMillis(j - this.startTimeMs);
        if (rVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i11));
            String str = rVar.G;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = rVar.H;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = rVar.E;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = rVar.D;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = rVar.M;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = rVar.N;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = rVar.U;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = rVar.V;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = rVar.f1786g;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = rVar.O;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.playbackSession.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int resolveNewPlaybackState(s0 s0Var) {
        int playbackState = s0Var.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i10 = this.currentPlaybackState;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (s0Var.getPlayWhenReady()) {
                return s0Var.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (s0Var.getPlayWhenReady()) {
                return s0Var.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.currentPlaybackState == 0) {
            return this.currentPlaybackState;
        }
        return 12;
    }

    public LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(e5.a aVar, androidx.media3.common.f fVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioCodecError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(e5.a aVar, String str, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(e5.a aVar, String str) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDisabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioEnabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(e5.a aVar, r rVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(e5.a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSinkError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioUnderrun(e5.a aVar, int i10, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(e5.a aVar, o0 o0Var) {
    }

    @Override // e5.c
    public void onBandwidthEstimate(e5.a aVar, int i10, long j, long j7) {
        z zVar = aVar.f7791d;
        if (zVar != null) {
            g0 g0Var = this.sessionManager;
            a1 a1Var = aVar.f7789b;
            zVar.getClass();
            String strD = ((a0) g0Var).d(a1Var, zVar);
            Long l10 = this.bandwidthBytes.get(strD);
            Long l11 = this.bandwidthTimeMs.get(strD);
            this.bandwidthBytes.put(strD, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j));
            this.bandwidthTimeMs.put(strD, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(e5.a aVar, List list) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderDisabled(e5.a aVar, int i10, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderEnabled(e5.a aVar, int i10, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderInitialized(e5.a aVar, int i10, String str, long j) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderInputFormatChanged(e5.a aVar, int i10, r rVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(e5.a aVar, androidx.media3.common.m mVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(e5.a aVar, int i10, boolean z10) {
    }

    @Override // e5.c
    public void onDownstreamFormatChanged(e5.a aVar, o5.v vVar) {
        if (aVar.f7791d == null) {
            return;
        }
        r rVar = vVar.f19073c;
        rVar.getClass();
        int i10 = vVar.f19074d;
        g0 g0Var = this.sessionManager;
        a1 a1Var = aVar.f7789b;
        z zVar = aVar.f7791d;
        zVar.getClass();
        e0 e0Var = new e0(rVar, i10, ((a0) g0Var).d(a1Var, zVar));
        int i11 = vVar.f19072b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.pendingAudioFormat = e0Var;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.pendingTextFormat = e0Var;
                return;
            }
        }
        this.pendingVideoFormat = e0Var;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(e5.a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(e5.a aVar, int i10, long j) {
    }

    @Override // e5.c
    public void onEvents(s0 s0Var, b bVar) throws NumberFormatException {
        if (bVar.f7805a.f1732a.size() == 0) {
            return;
        }
        maybeAddSessions(bVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(s0Var, bVar);
        maybeReportPlaybackError(jElapsedRealtime);
        maybeReportTrackChanges(s0Var, bVar, jElapsedRealtime);
        maybeReportNetworkChange(jElapsedRealtime);
        maybeReportPlaybackStateChange(s0Var, bVar, jElapsedRealtime);
        if (bVar.a(1028)) {
            ((a0) this.sessionManager).b(bVar.b(1028));
        }
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onLoadCanceled(e5.a aVar, q qVar, o5.v vVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onLoadCompleted(e5.a aVar, q qVar, o5.v vVar) {
    }

    @Override // e5.c
    public void onLoadError(e5.a aVar, q qVar, o5.v vVar, IOException iOException, boolean z10) {
        this.ioErrorType = vVar.f19071a;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onLoadStarted(e5.a aVar, q qVar, o5.v vVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaItemTransition(e5.a aVar, androidx.media3.common.e0 e0Var, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(e5.a aVar, androidx.media3.common.g0 g0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMetadata(e5.a aVar, Metadata metadata) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(e5.a aVar, boolean z10, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(e5.a aVar, n0 n0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public void onPlayerError(e5.a aVar, m0 m0Var) {
        this.pendingPlayerError = m0Var;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(e5.a aVar, m0 m0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerReleased(e5.a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(e5.a aVar, boolean z10, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(e5.a aVar, androidx.media3.common.g0 g0Var) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(e5.a aVar, Object obj, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed(e5.a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(e5.a aVar) {
    }

    @Override // e5.f0
    public void onSessionActive(e5.a aVar, String str) {
        z zVar = aVar.f7791d;
        if (zVar == null || !zVar.a()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = e5.c0.i().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion(MediaLibraryInfo.VERSION);
            maybeUpdateTimelineMetadata(aVar.f7789b, aVar.f7791d);
        }
    }

    @Override // e5.f0
    public void onSessionFinished(e5.a aVar, String str, boolean z10) {
        z zVar = aVar.f7791d;
        if ((zVar == null || !zVar.a()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(e5.a aVar, int i10, int i11) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTimelineChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(e5.a aVar, e1 e1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTracksChanged(e5.a aVar, g1 g1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(e5.a aVar, o5.v vVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoCodecError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(e5.a aVar, String str, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(e5.a aVar, String str) {
    }

    @Override // e5.c
    public void onVideoDisabled(e5.a aVar, d5.c cVar) {
        this.droppedFrames += cVar.f6941g;
        this.playedFrames += cVar.f6939e;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoEnabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(e5.a aVar, long j, int i10) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(e5.a aVar, r rVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(e5.a aVar, int i10, int i11, int i12, float f10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVolumeChanged(e5.a aVar, float f10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(e5.a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(e5.a aVar, r rVar, d5.d dVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onCues(e5.a aVar, z4.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public void onPositionDiscontinuity(e5.a aVar, r0 r0Var, r0 r0Var2, int i10) {
        if (i10 == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i10;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(e5.a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(e5.a aVar, r rVar, d5.d dVar) {
    }

    @Override // e5.c
    public void onVideoSizeChanged(e5.a aVar, h1 h1Var) {
        e0 e0Var = this.pendingVideoFormat;
        if (e0Var != null) {
            r rVar = e0Var.f7814a;
            if (rVar.N == -1) {
                androidx.media3.common.q qVarA = rVar.a();
                qVarA.f1747p = h1Var.f1695a;
                qVarA.f1748q = h1Var.f1696d;
                this.pendingVideoFormat = new e0(new r(qVarA), e0Var.f7815b, e0Var.f7816c);
            }
        }
    }

    @Override // e5.f0
    public void onSessionCreated(e5.a aVar, String str) {
    }

    @Override // e5.f0
    public void onAdPlaybackStarted(e5.a aVar, String str, String str2) {
    }
}
