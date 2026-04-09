package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import b4.C0336a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6542a;

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f6542a) {
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
        switch (this.f6542a) {
            case 0:
                return new h(obj);
            case 1:
                return new h((ParcelFileDescriptor) obj);
            default:
                return new C0336a((ByteBuffer) obj, 2);
        }
    }
}
