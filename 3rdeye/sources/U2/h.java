package U2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements L2.j<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final C1603d f12400a = new C1603d();

    @Override // L2.j
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, L2.h hVar) throws IOException {
        return true;
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(ByteBuffer byteBuffer, int i, int i10, L2.h hVar) throws IOException {
        return this.f12400a.c(ImageDecoder.createSource(byteBuffer), i, i10, hVar);
    }
}
