package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class r implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final f f34578a = new f();

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(InputStream inputStream, int i10, int i11, C2.g gVar) {
        return this.f34578a.c(ImageDecoder.createSource(W2.a.b(inputStream)), i10, i11, gVar);
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, C2.g gVar) {
        return true;
    }
}
