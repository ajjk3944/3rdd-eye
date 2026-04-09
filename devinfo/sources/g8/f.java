package g8;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements x7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24564a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24565b;

    public f(int i4) {
        this.f24564a = i4;
        switch (i4) {
            case 1:
                this.f24565b = new f(2);
                break;
            case 2:
                this.f24565b = new ed.f(1);
                break;
            default:
                this.f24565b = new f(2);
                break;
        }
    }

    @Override // x7.j
    public final z7.y a(Object obj, int i4, int i10, x7.h hVar) {
        switch (this.f24564a) {
            case 0:
                return ((f) this.f24565b).c(ImageDecoder.createSource((ByteBuffer) obj), i4, i10, hVar);
            case 1:
                return ((f) this.f24565b).c(ImageDecoder.createSource(t8.b.b((InputStream) obj)), i4, i10, hVar);
            default:
                return c(f4.b.e(obj), i4, i10, hVar);
        }
    }

    @Override // x7.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, x7.h hVar) {
        switch (this.f24564a) {
            case 0:
                break;
            case 1:
                break;
            default:
                f4.b.e(obj);
                break;
        }
        return true;
    }

    public c c(ImageDecoder.Source source, int i4, int i10, x7.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new f8.b(i4, i10, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i4 + "x" + i10 + "]");
        }
        return new c((ed.f) this.f24565b, bitmapDecodeBitmap);
    }
}
