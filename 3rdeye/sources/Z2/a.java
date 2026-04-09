package Z2;

import L2.h;
import N2.u;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public final class a implements b<Bitmap, byte[]> {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.CompressFormat f14007b = Bitmap.CompressFormat.JPEG;

    /* renamed from: c, reason: collision with root package name */
    public final int f14008c = 100;

    @Override // Z2.b
    public final u<byte[]> c(u<Bitmap> uVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f14007b, this.f14008c, byteArrayOutputStream);
        uVar.a();
        return new V2.b(byteArrayOutputStream.toByteArray());
    }
}
