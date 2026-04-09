package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import android.text.TextUtils;
import c7.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ob.i;
import ob.j;
import qb.b;
import w.g;
import x9.q;
import ya.m;
import ya.r;
import ya.v;
import z9.e;

/* loaded from: classes.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final u1 period;
    private final long startTimeMs;
    private final String tag;
    private final i trackSelector;
    private final v1 window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(i iVar) {
        this(iVar, DEFAULT_TAG);
    }

    private static String getAdaptiveSupportString(int i10, int i11) {
        if (i10 < 2) {
            return "N/A";
        }
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i11 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static String getDiscontinuityReasonString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    private String getEventString(q qVar, String str, String str2, Throwable th2) {
        String str3;
        String eventTimeString = getEventTimeString(qVar);
        String strK = a.k(a.d(a.d(2, str), eventTimeString), str, " [", eventTimeString);
        if (th2 instanceof z0) {
            String strValueOf = String.valueOf(strK);
            int i10 = ((z0) th2).f4795a;
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
            strK = a.k(str3.length() + strValueOf.length() + 12, strValueOf, ", errorCode=", str3);
        }
        if (str2 != null) {
            String strValueOf2 = String.valueOf(strK);
            strK = a.k(str2.length() + strValueOf2.length() + 2, strValueOf2, ", ", str2);
        }
        String strU = b.u(th2);
        if (!TextUtils.isEmpty(strU)) {
            String strValueOf3 = String.valueOf(strK);
            String strReplace = strU.replace("\n", "\n  ");
            StringBuilder sb2 = new StringBuilder(a.d(strValueOf3.length() + 4, strReplace));
            sb2.append(strValueOf3);
            sb2.append("\n  ");
            sb2.append(strReplace);
            sb2.append('\n');
            strK = sb2.toString();
        }
        return String.valueOf(strK).concat("]");
    }

    private String getEventTimeString(q qVar) {
        String strE = g.e("window=", 18, qVar.f25183c);
        v vVar = qVar.f25184d;
        if (vVar != null) {
            String strValueOf = String.valueOf(strE);
            int iB = qVar.f25182b.b(vVar.f26177a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append(strValueOf);
            sb2.append(", period=");
            sb2.append(iB);
            strE = sb2.toString();
            if (vVar.a()) {
                String strValueOf2 = String.valueOf(strE);
                int i10 = vVar.f26178b;
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 21);
                sb3.append(strValueOf2);
                sb3.append(", adGroup=");
                sb3.append(i10);
                String strValueOf3 = String.valueOf(sb3.toString());
                int i11 = vVar.f26179c;
                StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 16);
                sb4.append(strValueOf3);
                sb4.append(", ad=");
                sb4.append(i11);
                strE = sb4.toString();
            }
        }
        String timeString = getTimeString(qVar.f25181a - this.startTimeMs);
        String timeString2 = getTimeString(qVar.f25185e);
        return g.j(a.s(a.d(a.d(a.d(23, timeString), timeString2), strE), "eventTime=", timeString, ", mediaPos=", timeString2), ", ", strE);
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

    private static String getTrackStatusString(TrackSelection trackSelection, TrackGroup trackGroup, int i10) {
        return getTrackStatusString((trackSelection == null || trackSelection.getTrackGroup() != trackGroup || trackSelection.indexOf(i10) == -1) ? false : true);
    }

    private void printInternalError(q qVar, String str, Exception exc) {
        loge(qVar, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f4241a;
            if (i10 >= entryArr.length) {
                return;
            }
            String strValueOf = String.valueOf(entryArr[i10]);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + String.valueOf(str).length());
            sb2.append(str);
            sb2.append(strValueOf);
            logd(sb2.toString());
            i10++;
        }
    }

    public void logd(String str) {
    }

    public void loge(String str) {
        e0.d(this.tag, str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioAttributesChanged(q qVar, y9.b bVar) {
        bVar.getClass();
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("0,0,1,1");
        logd(qVar, "audioAttributes", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioCodecError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(q qVar, String str, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderReleased(q qVar, String str) {
        logd(qVar, "audioDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDisabled(q qVar, z9.b bVar) {
        logd(qVar, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioEnabled(q qVar, z9.b bVar) {
        logd(qVar, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(q qVar, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(q qVar, int i10) {
        logd(qVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioSinkError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(q qVar, int i10, long j, long j7) {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(j);
        sb2.append(", ");
        sb2.append(j7);
        loge(qVar, "audioTrackUnderrun", sb2.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q qVar, c1 c1Var) {
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
    public void onDownstreamFormatChanged(q qVar, r rVar) {
        logd(qVar, "downstreamFormat", Format.f(rVar.f26148c));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(q qVar) {
        logd(qVar, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(q qVar) {
        logd(qVar, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(q qVar) {
        logd(qVar, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(q qVar, Exception exc) {
        printInternalError(qVar, "drmSessionManagerError", exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionReleased(q qVar) {
        logd(qVar, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(q qVar, int i10, long j) {
        logd(qVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onEvents(g1 g1Var, x9.r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsLoadingChanged(q qVar, boolean z10) {
        logd(qVar, "loading", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(q qVar, boolean z10) {
        logd(qVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(q qVar, m mVar, r rVar, IOException iOException, boolean z10) {
        printInternalError(qVar, "loadError", iOException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaItemTransition(q qVar, n0 n0Var, int i10) {
        String eventTimeString = getEventTimeString(qVar);
        String mediaItemTransitionReasonString = getMediaItemTransitionReasonString(i10);
        StringBuilder sbS = a.s(a.d(a.d(21, eventTimeString), mediaItemTransitionReasonString), "mediaItem [", eventTimeString, ", reason=", mediaItemTransitionReasonString);
        sbS.append("]");
        logd(sbS.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(q qVar, p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(q qVar, Metadata metadata) {
        String strValueOf = String.valueOf(getEventTimeString(qVar));
        logd(strValueOf.length() != 0 ? "metadata [".concat(strValueOf) : new String("metadata ["));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(q qVar, boolean z10, int i10) {
        String playWhenReadyChangeReasonString = getPlayWhenReadyChangeReasonString(i10);
        StringBuilder sb2 = new StringBuilder(a.d(7, playWhenReadyChangeReasonString));
        sb2.append(z10);
        sb2.append(", ");
        sb2.append(playWhenReadyChangeReasonString);
        logd(qVar, "playWhenReady", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(q qVar, b1 b1Var) {
        logd(qVar, "playbackParameters", b1Var.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackStateChanged(q qVar, int i10) {
        logd(qVar, "state", getStateString(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(q qVar, int i10) {
        logd(qVar, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(q qVar, z0 z0Var) {
        loge(qVar, "playerFailed", z0Var);
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
    public void onRenderedFirstFrame(q qVar, Object obj, long j) {
        logd(qVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(q qVar, int i10) {
        logd(qVar, "repeatMode", getRepeatModeString(i10));
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

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(q qVar, boolean z10) {
        logd(qVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(q qVar, boolean z10) {
        logd(qVar, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(q qVar, List list) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(q qVar, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        logd(qVar, "surfaceSize", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(q qVar, int i10) {
        int iH = qVar.f25182b.h();
        w1 w1Var = qVar.f25182b;
        int iO = w1Var.o();
        String eventTimeString = getEventTimeString(qVar);
        String timelineChangeReasonString = getTimelineChangeReasonString(i10);
        StringBuilder sb2 = new StringBuilder(a.d(a.d(69, eventTimeString), timelineChangeReasonString));
        sb2.append("timeline [");
        sb2.append(eventTimeString);
        sb2.append(", periodCount=");
        sb2.append(iH);
        sb2.append(", windowCount=");
        sb2.append(iO);
        sb2.append(", reason=");
        sb2.append(timelineChangeReasonString);
        logd(sb2.toString());
        for (int i11 = 0; i11 < Math.min(iH, 3); i11++) {
            w1Var.f(i11, this.period, false);
            String timeString = getTimeString(h.d(this.period.f4597d));
            StringBuilder sb3 = new StringBuilder(a.d(11, timeString));
            sb3.append("  period [");
            sb3.append(timeString);
            sb3.append("]");
            logd(sb3.toString());
        }
        if (iH > 3) {
            logd("  ...");
        }
        for (int i12 = 0; i12 < Math.min(iO, 3); i12++) {
            w1Var.n(i12, this.window);
            String timeString2 = getTimeString(h.d(this.window.f4751n));
            v1 v1Var = this.window;
            boolean z10 = v1Var.f4747h;
            boolean z11 = v1Var.f4748i;
            StringBuilder sb4 = new StringBuilder(a.d(42, timeString2));
            sb4.append("  window [");
            sb4.append(timeString2);
            sb4.append(", seekable=");
            sb4.append(z10);
            sb4.append(", dynamic=");
            sb4.append(z11);
            sb4.append("]");
            logd(sb4.toString());
        }
        if (iO > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(q qVar, TrackGroupArray trackGroupArray, j jVar) {
        TrackGroupArray[] trackGroupArrayArr;
        String[] strArr;
        int i10;
        i iVar = this.trackSelector;
        ob.h currentMappedTrackInfo = iVar != null ? iVar.getCurrentMappedTrackInfo() : null;
        if (currentMappedTrackInfo == null) {
            logd(qVar, "tracks", "[]");
            return;
        }
        int[][][] iArr = currentMappedTrackInfo.f19245f;
        TrackGroupArray[] trackGroupArrayArr2 = currentMappedTrackInfo.f19243d;
        String[] strArr2 = currentMappedTrackInfo.f19241b;
        String strValueOf = String.valueOf(getEventTimeString(qVar));
        logd(strValueOf.length() != 0 ? "tracks [".concat(strValueOf) : new String("tracks ["));
        int i11 = currentMappedTrackInfo.f19240a;
        int i12 = 0;
        while (true) {
            String str = "  ]";
            String str2 = ", supported=";
            String str3 = "    ]";
            if (i12 >= i11) {
                break;
            }
            TrackGroupArray trackGroupArray2 = trackGroupArrayArr2[i12];
            int i13 = i11;
            int[][][] iArr2 = iArr;
            TrackSelection trackSelection = jVar.f19248b[i12];
            if (trackGroupArray2.f4457a == 0) {
                String str4 = strArr2[i12];
                StringBuilder sb2 = new StringBuilder(a.d(5, str4));
                sb2.append("  ");
                sb2.append(str4);
                sb2.append(" []");
                logd(sb2.toString());
                trackGroupArrayArr = trackGroupArrayArr2;
                strArr = strArr2;
                i10 = i12;
            } else {
                trackGroupArrayArr = trackGroupArrayArr2;
                String str5 = strArr2[i12];
                strArr = strArr2;
                i10 = i12;
                StringBuilder sb3 = new StringBuilder(a.d(4, str5));
                sb3.append("  ");
                sb3.append(str5);
                sb3.append(" [");
                logd(sb3.toString());
                int i14 = 0;
                while (i14 < trackGroupArray2.f4457a) {
                    TrackGroup trackGroup = trackGroupArray2.f4458d[i14];
                    int i15 = trackGroup.f4453a;
                    int i16 = trackGroupArrayArr[i10].f4458d[i14].f4453a;
                    TrackGroupArray trackGroupArray3 = trackGroupArray2;
                    int[] iArr3 = new int[i16];
                    String str6 = str;
                    String str7 = str3;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i16) {
                        int i19 = i16;
                        int i20 = i17;
                        if ((iArr2[i10][i14][i17] & 7) == 4) {
                            iArr3[i18] = i20;
                            i18++;
                        }
                        i17 = i20 + 1;
                        i16 = i19;
                    }
                    int[] iArrCopyOf = Arrays.copyOf(iArr3, i18);
                    int iMin = 16;
                    int i21 = 0;
                    boolean z10 = false;
                    int i22 = 0;
                    String str8 = str2;
                    String str9 = null;
                    while (i21 < iArrCopyOf.length) {
                        int[] iArr4 = iArrCopyOf;
                        String str10 = trackGroupArrayArr[i10].f4458d[i14].f4454d[iArrCopyOf[i21]].H;
                        int i23 = i22 + 1;
                        if (i22 == 0) {
                            str9 = str10;
                        } else {
                            z10 |= !qb.v.a(str9, str10);
                        }
                        iMin = Math.min(iMin, iArr2[i10][i14][i21] & 24);
                        i21++;
                        i22 = i23;
                        iArrCopyOf = iArr4;
                    }
                    if (z10) {
                        iMin = Math.min(iMin, currentMappedTrackInfo.f19244e[i10]);
                    }
                    String adaptiveSupportString = getAdaptiveSupportString(i15, iMin);
                    StringBuilder sb4 = new StringBuilder(a.d(44, adaptiveSupportString));
                    sb4.append("    Group:");
                    sb4.append(i14);
                    sb4.append(", adaptive_supported=");
                    sb4.append(adaptiveSupportString);
                    sb4.append(" [");
                    logd(sb4.toString());
                    for (int i24 = 0; i24 < trackGroup.f4453a; i24++) {
                        String trackStatusString = getTrackStatusString(trackSelection, trackGroup, i24);
                        String strB = h.b(iArr2[i10][i14][i24] & 7);
                        String strF = Format.f(trackGroup.f4454d[i24]);
                        StringBuilder sb5 = new StringBuilder(strB.length() + a.d(a.d(38, trackStatusString), strF));
                        sb5.append("      ");
                        sb5.append(trackStatusString);
                        sb5.append(" Track:");
                        sb5.append(i24);
                        sb5.append(", ");
                        sb5.append(strF);
                        sb5.append(str8);
                        sb5.append(strB);
                        logd(sb5.toString());
                    }
                    logd(str7);
                    i14++;
                    str3 = str7;
                    str2 = str8;
                    trackGroupArray2 = trackGroupArray3;
                    str = str6;
                }
                String str11 = str;
                String str12 = str3;
                if (trackSelection != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= trackSelection.length()) {
                            break;
                        }
                        Metadata metadata = trackSelection.getFormat(i25).F;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd(str12);
                            break;
                        }
                        i25++;
                    }
                }
                logd(str11);
            }
            i12 = i10 + 1;
            i11 = i13;
            iArr = iArr2;
            trackGroupArrayArr2 = trackGroupArrayArr;
            strArr2 = strArr;
        }
        TrackGroupArray trackGroupArray4 = currentMappedTrackInfo.f19246g;
        int i26 = trackGroupArray4.f4457a;
        if (i26 > 0) {
            logd("  Unmapped [");
            int i27 = 0;
            while (i27 < i26) {
                StringBuilder sb6 = new StringBuilder(23);
                sb6.append("    Group:");
                sb6.append(i27);
                sb6.append(" [");
                logd(sb6.toString());
                TrackGroup trackGroup2 = trackGroupArray4.f4458d[i27];
                int i28 = 0;
                while (i28 < trackGroup2.f4453a) {
                    String trackStatusString2 = getTrackStatusString(false);
                    String strB2 = h.b(0);
                    TrackGroupArray trackGroupArray5 = trackGroupArray4;
                    String strF2 = Format.f(trackGroup2.f4454d[i28]);
                    int i29 = i26;
                    StringBuilder sb7 = new StringBuilder(strB2.length() + a.d(a.d(38, trackStatusString2), strF2));
                    sb7.append("      ");
                    sb7.append(trackStatusString2);
                    sb7.append(" Track:");
                    sb7.append(i28);
                    sb7.append(", ");
                    sb7.append(strF2);
                    sb7.append(", supported=");
                    sb7.append(strB2);
                    logd(sb7.toString());
                    i28++;
                    i27 = i27;
                    trackGroupArray4 = trackGroupArray5;
                    i26 = i29;
                }
                logd("    ]");
                i27++;
            }
            logd("  ]");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(q qVar, r rVar) {
        logd(qVar, "upstreamDiscarded", Format.f(rVar.f26148c));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoCodecError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(q qVar, String str, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderReleased(q qVar, String str) {
        logd(qVar, "videoDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(q qVar, z9.b bVar) {
        logd(qVar, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoEnabled(q qVar, z9.b bVar) {
        logd(qVar, "videoEnabled");
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
    public void onVolumeChanged(q qVar, float f10) {
        logd(qVar, "volume", Float.toString(f10));
    }

    public EventLogger(i iVar, String str) {
        this.trackSelector = iVar;
        this.tag = str;
        this.window = new v1();
        this.period = new u1();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private void logd(q qVar, String str) {
        logd(getEventString(qVar, str, null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(q qVar, String str, long j) {
        logd(qVar, "audioDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(q qVar, Format format, e eVar) {
        logd(qVar, "audioInputFormat", Format.f(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionAcquired(q qVar, int i10) {
        logd(qVar, "drmSessionAcquired", g.e("state=", 17, i10));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(q qVar, f1 f1Var, f1 f1Var2, int i10) {
        StringBuilder sb2 = new StringBuilder("reason=");
        sb2.append(getDiscontinuityReasonString(i10));
        sb2.append(", PositionInfo:old [window=");
        sb2.append(f1Var.f4129b);
        sb2.append(", period=");
        sb2.append(f1Var.f4131d);
        sb2.append(", pos=");
        sb2.append(f1Var.f4132e);
        int i11 = f1Var.f4134g;
        if (i11 != -1) {
            sb2.append(", contentPos=");
            sb2.append(f1Var.f4133f);
            sb2.append(", adGroup=");
            sb2.append(i11);
            sb2.append(", ad=");
            sb2.append(f1Var.f4135h);
        }
        sb2.append("], PositionInfo:new [window=");
        int i12 = f1Var2.f4129b;
        int i13 = f1Var2.f4134g;
        sb2.append(i12);
        sb2.append(", period=");
        sb2.append(f1Var2.f4131d);
        sb2.append(", pos=");
        sb2.append(f1Var2.f4132e);
        if (i13 != -1) {
            sb2.append(", contentPos=");
            sb2.append(f1Var2.f4133f);
            sb2.append(", adGroup=");
            sb2.append(i13);
            sb2.append(", ad=");
            sb2.append(f1Var2.f4135h);
        }
        sb2.append("]");
        logd(qVar, "positionDiscontinuity", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(q qVar, String str, long j) {
        logd(qVar, "videoDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(q qVar, Format format, e eVar) {
        logd(qVar, "videoInputFormat", Format.f(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(q qVar, rb.v vVar) {
        int i10 = vVar.f21524a;
        int i11 = vVar.f21525b;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        logd(qVar, "videoSize", sb2.toString());
    }

    private void logd(q qVar, String str, String str2) {
        logd(getEventString(qVar, str, str2, null));
    }

    private void loge(q qVar, String str, Throwable th2) {
        loge(getEventString(qVar, str, null, th2));
    }

    private static String getTrackStatusString(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    private void loge(q qVar, String str, String str2, Throwable th2) {
        loge(getEventString(qVar, str, str2, th2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(q qVar, m mVar, r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(q qVar, m mVar, r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(q qVar, m mVar, r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(q qVar, int i10, long j, long j7) {
    }
}
