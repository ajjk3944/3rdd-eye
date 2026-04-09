package U2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import h3.C4412a;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class t implements L2.j<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final C1603d f12446a = new C1603d();

    @Override // L2.j
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, L2.h hVar) throws IOException {
        return true;
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(InputStream inputStream, int i, int i10, L2.h hVar) throws IOException {
        return this.f12446a.c(ImageDecoder.createSource(C4412a.b(inputStream)), i, i10, hVar);
    }
}
