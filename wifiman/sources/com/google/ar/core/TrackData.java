package com.google.ar.core;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class TrackData {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    TrackData(long j10, Session session) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private native ByteBuffer nativeGetData(long j10, long j11);

    private native long nativeGetFrameTimestamp(long j10, long j11);

    private static native void nativeReleaseTrackData(long j10, long j11);

    private void release() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseTrackData(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
    }

    public void close() {
        release();
    }

    protected void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public ByteBuffer getData() {
        return nativeGetData(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public long getFrameTimestamp() {
        return nativeGetFrameTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
