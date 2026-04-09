package com.mbridge.msdk.playercommon.exoplayer2.source;

/* loaded from: classes3.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t10);
    }

    boolean continueLoading(long j10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    void reevaluateBuffer(long j10);
}
