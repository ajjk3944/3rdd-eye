package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.media.Image;

/* loaded from: classes2.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f57152a;

    private a(Bitmap bitmap) {
        Ij.a.c(bitmap, "Cannot load null bitmap.");
        Ij.a.b(bitmap.getConfig().equals(Bitmap.Config.ARGB_8888), "Only supports loading ARGB_8888 bitmaps.");
        this.f57152a = bitmap;
    }

    static a e(Bitmap bitmap) {
        return new a(bitmap);
    }

    @Override // org.tensorflow.lite.support.image.c
    public Jj.a a(org.tensorflow.lite.a aVar) {
        Jj.a aVarD = Jj.a.d(aVar);
        d.a(this.f57152a, aVarD);
        return aVarD;
    }

    @Override // org.tensorflow.lite.support.image.c
    public Image b() {
        throw new UnsupportedOperationException("Converting from Bitmap to android.media.Image is unsupported.");
    }

    @Override // org.tensorflow.lite.support.image.c
    public b c() {
        return b.fromBitmapConfig(this.f57152a.getConfig());
    }

    @Override // org.tensorflow.lite.support.image.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a mo18clone() {
        Bitmap bitmap = this.f57152a;
        return e(bitmap.copy(bitmap.getConfig(), this.f57152a.isMutable()));
    }

    @Override // org.tensorflow.lite.support.image.c
    public int getHeight() {
        return this.f57152a.getHeight();
    }

    @Override // org.tensorflow.lite.support.image.c
    public int getWidth() {
        return this.f57152a.getWidth();
    }
}
