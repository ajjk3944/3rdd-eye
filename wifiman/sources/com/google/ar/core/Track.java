package com.google.ar.core;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes3.dex */
public class Track {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected Track() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeCreateTrack(long j10);

    private static native void nativeDestroyTrack(long j10, long j11);

    private native void nativeSetId(long j10, long j11, byte[] bArr);

    private native void nativeSetMetadata(long j10, long j11, byte[] bArr);

    private native void nativeSetMimeType(long j10, long j11, String str);

    protected void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyTrack(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public Track setId(UUID uuid) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        nativeSetId(this.session.nativeWrapperHandle, this.nativeHandle, byteBufferWrap.array());
        return this;
    }

    public Track setMetadata(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeSetMetadata(this.session.nativeWrapperHandle, this.nativeHandle, bArr);
        return this;
    }

    public Track setMimeType(String str) {
        nativeSetMimeType(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public Track(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateTrack(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
