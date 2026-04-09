package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
class ArImage extends com.google.ar.core.dependencies.b {

    /* renamed from: a, reason: collision with root package name */
    private final Session f38167a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38168b;

    /* renamed from: c, reason: collision with root package name */
    long f38169c;

    ArImage(Session session, long j10) {
        this.f38167a = session;
        this.f38169c = j10;
        this.f38168b = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetBuffer, reason: merged with bridge method [inline-methods] */
    public native ByteBuffer h(long j10, long j11, int i10);

    private native int nativeGetFormat(long j10, long j11);

    private native int nativeGetHeight(long j10, long j11);

    private native int nativeGetNumberOfPlanes(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetPixelStride, reason: merged with bridge method [inline-methods] */
    public native int g(long j10, long j11, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetRowStride, reason: merged with bridge method [inline-methods] */
    public native int a(long j10, long j11, int i10);

    private native long nativeGetTimestamp(long j10, long j11);

    private native int nativeGetWidth(long j10, long j11);

    static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.f38168b, this.f38169c);
        this.f38169c = 0L;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int iNativeGetFormat = nativeGetFormat(this.f38167a.nativeWrapperHandle, this.f38169c);
        if (iNativeGetFormat != -1) {
            return iNativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public final int getHeight() {
        int iNativeGetHeight = nativeGetHeight(this.f38167a.nativeWrapperHandle, this.f38169c);
        if (iNativeGetHeight != -1) {
            return iNativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int iNativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.f38167a.nativeWrapperHandle, this.f38169c);
        if (iNativeGetNumberOfPlanes == -1) {
            throw new FatalException("Unknown error in ArImage.getPlanes().");
        }
        D[] dArr = new D[iNativeGetNumberOfPlanes];
        for (int i10 = 0; i10 < iNativeGetNumberOfPlanes; i10++) {
            dArr[i10] = new D(this, this.f38169c, i10);
        }
        return dArr;
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long jNativeGetTimestamp = nativeGetTimestamp(this.f38167a.nativeWrapperHandle, this.f38169c);
        if (jNativeGetTimestamp != -1) {
            return jNativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public final int getWidth() {
        int iNativeGetWidth = nativeGetWidth(this.f38167a.nativeWrapperHandle, this.f38169c);
        if (iNativeGetWidth != -1) {
            return iNativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    final /* synthetic */ Session j() {
        return this.f38167a;
    }

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j10) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
