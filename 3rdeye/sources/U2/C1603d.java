package U2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* renamed from: U2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603d implements L2.j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final O2.c f12396a = new O2.c();

    @Override // L2.j
    public final /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, L2.h hVar) throws IOException {
        I6.j.o(source);
        return true;
    }

    @Override // L2.j
    public final /* bridge */ /* synthetic */ N2.u<Bitmap> b(ImageDecoder.Source source, int i, int i10, L2.h hVar) throws IOException {
        return c(J0.e.c(source), i, i10, hVar);
    }

    public final e c(ImageDecoder.Source source, int i, int i10, L2.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new T2.a(i, i10, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i10 + "]");
        }
        return new e(this.f12396a, bitmapDecodeBitmap);
    }
}
