package androidx.media3.exoplayer.util;

import a5.d0;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Metadata;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.e1;
import androidx.media3.common.f;
import androidx.media3.common.f1;
import androidx.media3.common.g0;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.m;
import androidx.media3.common.m0;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.r;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.y0;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.trackselection.y;
import d5.d;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import o5.q;
import o5.v;
import o5.z;
import oe.h0;
import w.g;

/* loaded from: classes.dex */
public class EventLogger implements e5.c {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final y0 period;
    private final long startTimeMs;
    private final String tag;
    private final z0 window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    private static String getDiscontinuityReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    private String getEventString(e5.a aVar, String str, String str2, Throwable th2) {
        String str3;
        StringBuilder sbL = g.l(str, " [");
        sbL.append(getEventTimeString(aVar));
        String string = sbL.toString();
        if (th2 instanceof m0) {
            StringBuilder sbL2 = g.l(string, ", errorCode=");
            int i10 = ((m0) th2).f1722a;
            if (i10 == 5001) {
                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            } else if (i10 != 5002) {
                switch (i10) {
                    case 1000:
                        str3 = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case 1001:
                        str3 = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case 1003:
                        str3 = "ERROR_CODE_TIMEOUT";
                        break;
                    case 1004:
                        str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i10) {
                            case 2000:
                                str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i10) {
                                    case 3001:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 4001:
                                                str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str3 = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i10) {
                                                    case 6000:
                                                        str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                        break;
                                                    case 6001:
                                                        str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break;
                                                    case 6002:
                                                        str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break;
                                                    case 6003:
                                                        str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break;
                                                    case 6004:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break;
                                                    case 6005:
                                                        str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break;
                                                    case 6006:
                                                        str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break;
                                                    case 6007:
                                                        str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                        break;
                                                    case 6008:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                        break;
                                                    default:
                                                        if (i10 < 1000000) {
                                                            str3 = "invalid error code";
                                                            break;
                                                        } else {
                                                            str3 = "custom error code";
                                                            break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            }
            sbL2.append(str3);
            string = sbL2.toString();
        }
        if (str2 != null) {
            string = g.g(string, ", ", str2);
        }
        String strR = a5.a.r(th2);
        if (!TextUtils.isEmpty(strR)) {
            StringBuilder sbL3 = g.l(string, "\n  ");
            sbL3.append(strR.replace("\n", "\n  "));
            sbL3.append('\n');
            string = sbL3.toString();
        }
        return g.f(string, "]");
    }

    private String getEventTimeString(e5.a aVar) {
        String string = "window=" + aVar.f7790c;
        z zVar = aVar.f7791d;
        if (zVar != null) {
            StringBuilder sbL = g.l(string, ", period=");
            sbL.append(aVar.f7789b.b(zVar.f1689a));
            string = sbL.toString();
            if (zVar.a()) {
                StringBuilder sbL2 = g.l(string, ", adGroup=");
                sbL2.append(zVar.f1690b);
                StringBuilder sbL3 = g.l(sbL2.toString(), ", ad=");
                sbL3.append(zVar.f1691c);
                string = sbL3.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder("eventTime=");
        sb2.append(getTimeString(aVar.f7788a - this.startTimeMs));
        sb2.append(", mediaPos=");
        return h0.b.s(sb2, getTimeString(aVar.f7792e), ", ", string);
    }

    private static String getMediaItemTransitionReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j) {
        return j == -9223372036854775807L ? "?" : TIME_FORMAT.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    private void printInternalError(e5.a aVar, String str, Exception exc) {
        loge(aVar, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i10 = 0; i10 < metadata.f1549a.length; i10++) {
            StringBuilder sbT = c7.a.t(str);
            sbT.append(metadata.f1549a[i10]);
            logd(sbT.toString());
        }
    }

    public void logd(String str) {
        a5.a.l();
    }

    public void loge(String str) {
        a5.a.m(this.tag, str);
    }

    @Override // e5.c
    public void onAudioAttributesChanged(e5.a aVar, f fVar) {
        logd(aVar, "audioAttributes", fVar.f1619a + "," + fVar.f1620d + "," + fVar.f1621g + "," + fVar.f1622r);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioCodecError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(e5.a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public void onAudioDecoderReleased(e5.a aVar, String str) {
        logd(aVar, "audioDecoderReleased", str);
    }

    @Override // e5.c
    public void onAudioDisabled(e5.a aVar, d5.c cVar) {
        logd(aVar, "audioDisabled");
    }

    @Override // e5.c
    public void onAudioEnabled(e5.a aVar, d5.c cVar) {
        logd(aVar, "audioEnabled");
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(e5.a aVar, r rVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(e5.a aVar, long j) {
    }

    @Override // e5.c
    public void onAudioSessionIdChanged(e5.a aVar, int i10) {
        logd(aVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSinkError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public void onAudioUnderrun(e5.a aVar, int i10, long j, long j7) {
        loge(aVar, "audioTrackUnderrun", i10 + ", " + j + ", " + j7, null);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(e5.a aVar, o0 o0Var) {
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
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(e5.a aVar, m mVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(e5.a aVar, int i10, boolean z10) {
    }

    @Override // e5.c
    public void onDownstreamFormatChanged(e5.a aVar, v vVar) {
        logd(aVar, "downstreamFormat", r.c(vVar.f19073c));
    }

    @Override // e5.c
    public void onDrmKeysLoaded(e5.a aVar) {
        logd(aVar, "drmKeysLoaded");
    }

    @Override // e5.c
    public void onDrmKeysRemoved(e5.a aVar) {
        logd(aVar, "drmKeysRemoved");
    }

    @Override // e5.c
    public void onDrmKeysRestored(e5.a aVar) {
        logd(aVar, "drmKeysRestored");
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(e5.a aVar) {
    }

    @Override // e5.c
    public void onDrmSessionManagerError(e5.a aVar, Exception exc) {
        printInternalError(aVar, "drmSessionManagerError", exc);
    }

    @Override // e5.c
    public void onDrmSessionReleased(e5.a aVar) {
        logd(aVar, "drmSessionReleased");
    }

    @Override // e5.c
    public void onDroppedVideoFrames(e5.a aVar, int i10, long j) {
        logd(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onEvents(s0 s0Var, e5.b bVar) {
    }

    @Override // e5.c
    public void onIsLoadingChanged(e5.a aVar, boolean z10) {
        logd(aVar, "loading", Boolean.toString(z10));
    }

    @Override // e5.c
    public void onIsPlayingChanged(e5.a aVar, boolean z10) {
        logd(aVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // e5.c
    public void onLoadError(e5.a aVar, q qVar, v vVar, IOException iOException, boolean z10) {
        printInternalError(aVar, "loadError", iOException);
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    public void onMediaItemTransition(e5.a aVar, e0 e0Var, int i10) {
        logd("mediaItem [" + getEventTimeString(aVar) + ", reason=" + getMediaItemTransitionReasonString(i10) + "]");
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(e5.a aVar, g0 g0Var) {
    }

    @Override // e5.c
    public void onMetadata(e5.a aVar, Metadata metadata) {
        logd("metadata [" + getEventTimeString(aVar));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // e5.c
    public void onPlayWhenReadyChanged(e5.a aVar, boolean z10, int i10) {
        logd(aVar, "playWhenReady", z10 + ", " + getPlayWhenReadyChangeReasonString(i10));
    }

    @Override // e5.c
    public void onPlaybackParametersChanged(e5.a aVar, n0 n0Var) {
        logd(aVar, "playbackParameters", n0Var.toString());
    }

    @Override // e5.c
    public void onPlaybackStateChanged(e5.a aVar, int i10) {
        logd(aVar, "state", getStateString(i10));
    }

    @Override // e5.c
    public void onPlaybackSuppressionReasonChanged(e5.a aVar, int i10) {
        logd(aVar, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i10));
    }

    @Override // e5.c
    public void onPlayerError(e5.a aVar, m0 m0Var) {
        loge(aVar, "playerFailed", m0Var);
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
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(e5.a aVar, g0 g0Var) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public void onRenderedFirstFrame(e5.a aVar, Object obj, long j) {
        logd(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // e5.c
    public void onRepeatModeChanged(e5.a aVar, int i10) {
        logd(aVar, "repeatMode", getRepeatModeString(i10));
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

    @Override // e5.c
    public void onShuffleModeChanged(e5.a aVar, boolean z10) {
        logd(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // e5.c
    public void onSkipSilenceEnabledChanged(e5.a aVar, boolean z10) {
        logd(aVar, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // e5.c
    public void onSurfaceSizeChanged(e5.a aVar, int i10, int i11) {
        logd(aVar, "surfaceSize", i10 + ", " + i11);
    }

    @Override // e5.c
    public void onTimelineChanged(e5.a aVar, int i10) {
        int iH = aVar.f7789b.h();
        a1 a1Var = aVar.f7789b;
        int iO = a1Var.o();
        logd("timeline [" + getEventTimeString(aVar) + ", periodCount=" + iH + ", windowCount=" + iO + ", reason=" + getTimelineChangeReasonString(i10));
        for (int i11 = 0; i11 < Math.min(iH, 3); i11++) {
            a1Var.f(i11, this.period, false);
            logd("  period [" + getTimeString(d0.P(this.period.f1830r)) + "]");
        }
        if (iH > 3) {
            logd("  ...");
        }
        for (int i12 = 0; i12 < Math.min(iO, 3); i12++) {
            a1Var.n(i12, this.window);
            logd("  window [" + getTimeString(d0.P(this.window.J)) + ", seekable=" + this.window.D + ", dynamic=" + this.window.E + "]");
        }
        if (iO > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(e5.a aVar, e1 e1Var) {
    }

    @Override // e5.c
    public void onTracksChanged(e5.a aVar, g1 g1Var) {
        Metadata metadata;
        logd("tracks [" + getEventTimeString(aVar));
        h0 h0Var = g1Var.f1688a;
        for (int i10 = 0; i10 < h0Var.size(); i10++) {
            f1 f1Var = (f1) h0Var.get(i10);
            logd("  group [");
            for (int i11 = 0; i11 < f1Var.f1650a; i11++) {
                logd("    " + getTrackStatusString(f1Var.f1654x[i11]) + " Track:" + i11 + ", " + r.c(f1Var.f1651d.f1575r[i11]) + ", supported=" + d0.s(f1Var.f1653r[i11]));
            }
            logd("  ]");
        }
        boolean z10 = false;
        for (int i12 = 0; !z10 && i12 < h0Var.size(); i12++) {
            f1 f1Var2 = (f1) h0Var.get(i12);
            for (int i13 = 0; !z10 && i13 < f1Var2.f1650a; i13++) {
                if (f1Var2.f1654x[i13] && (metadata = f1Var2.f1651d.f1575r[i13].F) != null && metadata.f1549a.length > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z10 = true;
                }
            }
        }
        logd("]");
    }

    @Override // e5.c
    public void onUpstreamDiscarded(e5.a aVar, v vVar) {
        logd(aVar, "upstreamDiscarded", r.c(vVar.f19073c));
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoCodecError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(e5.a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public void onVideoDecoderReleased(e5.a aVar, String str) {
        logd(aVar, "videoDecoderReleased", str);
    }

    @Override // e5.c
    public void onVideoDisabled(e5.a aVar, d5.c cVar) {
        logd(aVar, "videoDisabled");
    }

    @Override // e5.c
    public void onVideoEnabled(e5.a aVar, d5.c cVar) {
        logd(aVar, "videoEnabled");
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
    public void onVolumeChanged(e5.a aVar, float f10) {
        logd(aVar, "volume", Float.toString(f10));
    }

    public EventLogger(String str) {
        this.tag = str;
        this.window = new z0();
        this.period = new y0();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private void logd(e5.a aVar, String str) {
        logd(getEventString(aVar, str, null, null));
    }

    private void loge(e5.a aVar, String str, Throwable th2) {
        loge(getEventString(aVar, str, null, th2));
    }

    @Override // e5.c
    public void onAudioDecoderInitialized(e5.a aVar, String str, long j) {
        logd(aVar, "audioDecoderInitialized", str);
    }

    @Override // e5.c
    public void onAudioInputFormatChanged(e5.a aVar, r rVar, d dVar) {
        logd(aVar, "audioInputFormat", r.c(rVar));
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onCues(e5.a aVar, z4.c cVar) {
    }

    @Override // e5.c
    public void onDrmSessionAcquired(e5.a aVar, int i10) {
        logd(aVar, "drmSessionAcquired", h0.b.h(i10, "state="));
    }

    @Override // e5.c
    public void onPositionDiscontinuity(e5.a aVar, r0 r0Var, r0 r0Var2, int i10) {
        StringBuilder sb2 = new StringBuilder("reason=");
        sb2.append(getDiscontinuityReasonString(i10));
        sb2.append(", PositionInfo:old [mediaItem=");
        sb2.append(r0Var.f1791d);
        sb2.append(", period=");
        sb2.append(r0Var.f1794x);
        sb2.append(", pos=");
        sb2.append(r0Var.f1795y);
        int i11 = r0Var.D;
        if (i11 != -1) {
            sb2.append(", contentPos=");
            sb2.append(r0Var.B);
            sb2.append(", adGroup=");
            sb2.append(i11);
            sb2.append(", ad=");
            sb2.append(r0Var.E);
        }
        sb2.append("], PositionInfo:new [mediaItem=");
        int i12 = r0Var2.f1791d;
        int i13 = r0Var2.D;
        sb2.append(i12);
        sb2.append(", period=");
        sb2.append(r0Var2.f1794x);
        sb2.append(", pos=");
        sb2.append(r0Var2.f1795y);
        if (i13 != -1) {
            sb2.append(", contentPos=");
            sb2.append(r0Var2.B);
            sb2.append(", adGroup=");
            sb2.append(i13);
            sb2.append(", ad=");
            sb2.append(r0Var2.E);
        }
        sb2.append("]");
        logd(aVar, "positionDiscontinuity", sb2.toString());
    }

    @Override // e5.c
    public void onVideoDecoderInitialized(e5.a aVar, String str, long j) {
        logd(aVar, "videoDecoderInitialized", str);
    }

    @Override // e5.c
    public void onVideoInputFormatChanged(e5.a aVar, r rVar, d dVar) {
        logd(aVar, "videoInputFormat", r.c(rVar));
    }

    @Override // e5.c
    public void onVideoSizeChanged(e5.a aVar, h1 h1Var) {
        logd(aVar, "videoSize", h1Var.f1695a + ", " + h1Var.f1696d);
    }

    private void logd(e5.a aVar, String str, String str2) {
        logd(getEventString(aVar, str, str2, null));
    }

    private void loge(e5.a aVar, String str, String str2, Throwable th2) {
        loge(getEventString(aVar, str, str2, th2));
    }

    @Deprecated
    public EventLogger(y yVar) {
        this(DEFAULT_TAG);
    }

    @Deprecated
    public EventLogger(y yVar, String str) {
        this(str);
    }

    @Override // e5.c
    public void onLoadCanceled(e5.a aVar, q qVar, v vVar) {
    }

    @Override // e5.c
    public void onLoadCompleted(e5.a aVar, q qVar, v vVar) {
    }

    @Override // e5.c
    public void onLoadStarted(e5.a aVar, q qVar, v vVar) {
    }

    @Override // e5.c
    public void onBandwidthEstimate(e5.a aVar, int i10, long j, long j7) {
    }
}
