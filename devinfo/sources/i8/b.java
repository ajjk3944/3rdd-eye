package i8;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.d5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import x7.h;
import x7.j;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25933a;

    /* renamed from: b, reason: collision with root package name */
    public final c f25934b;

    public /* synthetic */ b(c cVar, int i4) {
        this.f25933a = i4;
        this.f25934b = cVar;
    }

    @Override // x7.j
    public final y a(Object obj, int i4, int i10, h hVar) {
        switch (this.f25933a) {
            case 0:
                return c.a(ImageDecoder.createSource((ByteBuffer) obj), i4, i10, hVar);
            default:
                return c.a(ImageDecoder.createSource(t8.b.b((InputStream) obj)), i4, i10, hVar);
        }
    }

    @Override // x7.j
    public final boolean b(Object obj, h hVar) throws IOException {
        switch (this.f25933a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM = d5.m(this.f25934b.f25935a, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                c cVar = this.f25934b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeL = d5.l(cVar.f25935a, (InputStream) obj, cVar.f25936b);
                if (imageHeaderParser$ImageTypeL == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeL == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }
}
