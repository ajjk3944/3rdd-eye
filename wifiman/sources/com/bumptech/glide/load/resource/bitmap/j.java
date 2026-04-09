package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final f f34534a = new f();

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(ByteBuffer byteBuffer, int i10, int i11, C2.g gVar) {
        return this.f34534a.c(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, C2.g gVar) {
        return true;
    }
}
