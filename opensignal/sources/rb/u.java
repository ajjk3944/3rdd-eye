package rb;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public interface u {
    void onDroppedFrames(int i10, long j);

    void onRenderedFirstFrame(Object obj, long j);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j7);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(z9.b bVar);

    void onVideoEnabled(z9.b bVar);

    void onVideoFrameProcessingOffset(long j, int i10);

    void onVideoInputFormatChanged(Format format);

    void onVideoInputFormatChanged(Format format, z9.e eVar);

    void onVideoSizeChanged(v vVar);
}
