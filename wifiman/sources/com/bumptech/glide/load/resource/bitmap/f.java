package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final F2.d f34530a = new F2.e();

    @Override // C2.i
    public /* bridge */ /* synthetic */ boolean a(Object obj, C2.g gVar) {
        return d(d.a(obj), gVar);
    }

    @Override // C2.i
    public /* bridge */ /* synthetic */ E2.c b(Object obj, int i10, int i11, C2.g gVar) {
        return c(d.a(obj), i10, i11, gVar);
    }

    public E2.c c(ImageDecoder.Source source, int i10, int i11, C2.g gVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new K2.h(i10, i11, gVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new g(bitmapDecodeBitmap, this.f34530a);
    }

    public boolean d(ImageDecoder.Source source, C2.g gVar) {
        return true;
    }
}
