package oh;

import android.view.Surface;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements Serializable {
    private final t videoTest;

    public a(t tVar) {
        br.l.e(tVar, "videoTest");
        this.videoTest = tVar;
    }

    public abstract String getTAG();

    public abstract int getVideoTrackType();

    public final void onBandwidthEstimate(b bVar, int i10, long j, long j7) {
        br.l.e(bVar, "eventTime");
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder("onBandwidthEstimate() called with: eventTime = [");
        sb2.append(bVar.f19449a);
        sb2.append("], totalLoadTimeMs = [");
        sb2.append(i10);
        sb2.append("], totalBytesLoaded = [");
        sb2.append(j);
        sb2.append("], bitrateEstimate = [");
        ch.n.b(tag, w.g.h(sb2, j7, ']'));
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Integer.valueOf(i10), "TOTAL_LOAD_TIME_MS"));
        arrayList.add(new fh.d(Long.valueOf(j), "TOTAL_BYTES_LOADED"));
        arrayList.add(new fh.d(Long.valueOf(j7), "BITRATE_ESTIMATE"));
        arrayList.addAll(t.b(bVar));
        tVar.a("BANDWIDTH_ESTIMATE", arrayList);
    }

    public final void onDecoderInitialized(b bVar, int i10, String str, long j) {
        br.l.e(bVar, "eventTime");
        br.l.e(str, "decoderName");
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder("onDecoderInitialized() called with: eventTime = [");
        sb2.append(bVar.f19449a);
        sb2.append("], trackType = [");
        sb2.append(i10);
        sb2.append("], decoderName = [");
        sb2.append(str);
        sb2.append("], initializationDurationMs = [");
        ch.n.b(tag, w.g.h(sb2, j, ']'));
        if (i10 == getVideoTrackType()) {
            t tVar = this.videoTest;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new fh.d(str, "DECODER_NAME"));
            arrayList.add(new fh.d(Long.valueOf(j), "INITIALIZATION_DURATION_MS"));
            arrayList.addAll(t.b(bVar));
            tVar.a("DECODER_INITIALIZED", arrayList);
        }
    }

    public final void onDecoderInputFormatChanged(b bVar, int i10, l lVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(lVar, "format");
        ch.n.b(getTAG(), "onDecoderInputFormatChanged() called with: eventTime = [" + bVar.f19449a + "], trackType = [" + i10 + "], format = [" + lVar + ']');
        if (i10 == getVideoTrackType()) {
            t tVar = this.videoTest;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(t.c(lVar));
            arrayList.addAll(t.b(bVar));
            tVar.a("DECODER_INPUT_FORMAT_CHANGED", arrayList);
        }
    }

    public final void onDownstreamFormatChanged(b bVar, d dVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(dVar, "mediaLoadData");
        ch.n.b(getTAG(), "onDownstreamFormatChanged() called with: eventTime = " + bVar + ", mediaLoadData = " + dVar);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t.d(dVar));
        arrayList.addAll(t.b(bVar));
        tVar.a("DOWNSTREAM_FORMAT_CHANGED", arrayList);
    }

    public final void onDroppedVideoFrames(b bVar, int i10, long j) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onDroppedVideoFrames() called with: eventTime = [" + bVar.f19449a + "], droppedFrames = [" + i10 + "], elapsedMs = [" + j + ']');
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Integer.valueOf(i10), "DROPPED_FRAMES"));
        arrayList.addAll(t.b(bVar));
        tVar.a("DROPPED_VIDEO_FRAMES", arrayList);
    }

    public final void onIsPlayingChanged(b bVar, boolean z10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onIsPlayingChanged() called with: eventTime = " + bVar + ", isPlaying = " + z10);
        this.videoTest.u(bVar, z10);
    }

    public final void onLoadCanceled(b bVar, c cVar, d dVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(cVar, "loadEventInfo");
        br.l.e(dVar, "mediaLoadData");
        ch.n.b(getTAG(), "onLoadCanceled() called with: eventTime = " + bVar + ", loadEventInfo = " + cVar + ", mediaLoadData = " + dVar);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t.j(bVar, cVar, dVar));
        tVar.a("LOAD_CANCELED", arrayList);
    }

    public final void onLoadCompleted(b bVar, c cVar, d dVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(cVar, "loadEventInfo");
        br.l.e(dVar, "mediaLoadData");
        ch.n.b(getTAG(), "onLoadCompleted() called with: eventTime = " + bVar + ", loadEventInfo = " + cVar + ", mediaLoadData = " + dVar);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t.j(bVar, cVar, dVar));
        tVar.a("LOAD_COMPLETED", arrayList);
    }

    public final void onLoadError(b bVar, c cVar, d dVar, IOException iOException, boolean z10) {
        br.l.e(bVar, "eventTime");
        br.l.e(cVar, "loadEventInfo");
        br.l.e(dVar, "mediaLoadData");
        br.l.e(iOException, "error");
        ch.n.b(getTAG(), "onLoadError() called with: eventTime = " + bVar + ", loadEventInfo = " + cVar + ", mediaLoadData = " + dVar + ", error = " + iOException + ", wasCanceled = " + z10);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t.j(bVar, cVar, dVar));
        arrayList.add(new fh.d(iOException, "EXCEPTION"));
        arrayList.add(new fh.d(Boolean.valueOf(z10), "CANCELED"));
        tVar.a("LOAD_ERROR", arrayList);
    }

    public final void onLoadStarted(b bVar, c cVar, d dVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(cVar, "loadEventInfo");
        br.l.e(dVar, "mediaLoadData");
        ch.n.b(getTAG(), "onLoadStarted() called with: eventTime = " + bVar + ", loadEventInfo = " + cVar + ", mediaLoadData = " + dVar);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t.j(bVar, cVar, dVar));
        tVar.a("LOAD_STARTED", arrayList);
    }

    public final void onLoadingChanged(b bVar, boolean z10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onLoadingChanged() called with: eventTime = " + bVar + ", isLoading = " + z10);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Boolean.valueOf(z10), "IS_LOADING"));
        arrayList.addAll(t.b(bVar));
        tVar.a("LOADING_CHANGED", arrayList);
    }

    public final void onPlaybackParametersChanged(b bVar, m mVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(mVar, "playbackParameters");
        ch.n.b(getTAG(), "onPlaybackParametersChanged() called with: eventTime = " + bVar + ", playbackParameters = " + mVar);
        t tVar = this.videoTest;
        float f10 = mVar.f19479b;
        float f11 = mVar.f19478a;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Float.valueOf(f10), "PLAYBACK_SPEED"));
        arrayList.add(new fh.d(Float.valueOf(f11), "PLAYBACK_PITCH"));
        arrayList.addAll(t.b(bVar));
        tVar.a("PLAYBACK_PARAMETERS_CHANGED", arrayList);
    }

    public final void onPlaybackStateChanged(b bVar, int i10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onPlaybackStateChanged() called with: eventTime = " + bVar + ", state = " + i10);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Integer.valueOf(i10), "STATE"));
        arrayList.addAll(t.b(bVar));
        tVar.a("PLAYBACK_STATE_CHANGED", arrayList);
    }

    public final void onPlayerError(b bVar, int i10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onPlayerError() called with: eventTime = " + bVar + ", error = " + i10);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Integer.valueOf(i10), "ERROR_TYPE"));
        arrayList.addAll(t.b(bVar));
        tVar.a("VIDEO_ERROR_DETAIL", arrayList);
    }

    public final void onPlayerStateChanged(b bVar, int i10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onPlayerStateChanged() called with: eventTime = " + bVar + ", playbackState = " + i10);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Integer.valueOf(i10), "STATE"));
        arrayList.addAll(t.b(bVar));
        tVar.a("PLAYER_STATE_CHANGED", arrayList);
    }

    public final void onPositionDiscontinuity(b bVar, int i10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onPositionDiscontinuity() called with: eventTime = " + bVar + ", reason = " + i10);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Integer.valueOf(i10), "REASON"));
        arrayList.addAll(t.b(bVar));
        tVar.a("POSITION_DISCONTINUITY", arrayList);
    }

    public final void onRenderedFirstFrame(b bVar, Surface surface) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onRenderedFirstFrame() called with: eventTime = [" + bVar.f19449a + "], surface = [" + surface + ']');
        t tVar = this.videoTest;
        tVar.getClass();
        tVar.a("RENDERED_FIRST_FRAME", t.b(bVar));
    }

    public final void onVideoDecoderInitialized(b bVar, String str, long j) {
        br.l.e(bVar, "eventTime");
        br.l.e(str, "decoderName");
        ch.n.b(getTAG(), "onVideoDecoderInitialized() called with: eventTime = " + bVar + ", decoderName = " + str + ", initializationDurationMs = " + j);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(str, "DECODER_NAME"));
        arrayList.add(new fh.d(Long.valueOf(j), "INITIALIZATION_DURATION_MS"));
        arrayList.addAll(t.b(bVar));
        tVar.a("VIDEO_DECODER_INITIALIZED", arrayList);
    }

    public final void onVideoFrameProcessingOffset(b bVar, long j, int i10) {
        br.l.e(bVar, "eventTime");
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder("onVideoFrameProcessingOffset() called with: eventTime = ");
        sb2.append(bVar);
        sb2.append(", totalProcessingOffsetUs = ");
        sb2.append(j);
        ch.n.b(tag, c7.a.l(i10, ", frameCount = ", sb2));
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Long.valueOf(j), "TOTAL_PROCESSING_OFFSET_US"));
        arrayList.add(new fh.d(Integer.valueOf(i10), "FRAME_COUNT"));
        arrayList.addAll(t.b(bVar));
        tVar.a("VIDEO_FRAME_PROCESSING_OFFSET", arrayList);
    }

    public final void onVideoInputFormatChanged(b bVar, l lVar) {
        br.l.e(bVar, "eventTime");
        br.l.e(lVar, "format");
        ch.n.b(getTAG(), "onVideoInputFormatChanged() called with: eventTime = " + bVar + ", format = " + lVar);
        t tVar = this.videoTest;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t.c(lVar));
        arrayList.addAll(t.b(bVar));
        tVar.a("VIDEO_INPUT_FORMAT_CHANGED", arrayList);
    }

    public final void onVideoSizeChanged(b bVar, int i10, int i11, int i12, float f10) {
        br.l.e(bVar, "eventTime");
        ch.n.b(getTAG(), "onVideoSizeChanged() called with: eventTime = [" + bVar.f19449a + "], width = [" + i10 + "], height = [" + i11 + "], unappliedRotationDegrees = [" + i12 + "], pixelWidthHeightRatio = [" + f10 + ']');
        this.videoTest.y(i10, i11);
    }

    public static /* synthetic */ void getTAG$annotations() {
    }
}
