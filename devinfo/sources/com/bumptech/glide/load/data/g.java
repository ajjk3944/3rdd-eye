package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6520a;

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f6520a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        switch (this.f6520a) {
            case 0:
                return new h(obj);
            case 1:
                return new h((ParcelFileDescriptor) obj);
            default:
                return new g8.i((ByteBuffer) obj, 1);
        }
    }
}
