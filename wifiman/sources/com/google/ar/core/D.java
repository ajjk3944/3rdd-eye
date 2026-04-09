package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class D extends com.google.ar.core.dependencies.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f38173a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38174b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArImage f38175c;

    public D(ArImage arImage, long j10, int i10) {
        this.f38175c = arImage;
        this.f38173a = j10;
        this.f38174b = i10;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        ArImage arImage = this.f38175c;
        return arImage.h(arImage.j().nativeWrapperHandle, this.f38173a, this.f38174b).asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        ArImage arImage = this.f38175c;
        int iG = arImage.g(arImage.j().nativeWrapperHandle, this.f38173a, this.f38174b);
        if (iG != -1) {
            return iG;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        ArImage arImage = this.f38175c;
        int iA = arImage.a(arImage.j().nativeWrapperHandle, this.f38173a, this.f38174b);
        if (iA != -1) {
            return iA;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
