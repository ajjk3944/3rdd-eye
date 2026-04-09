package f8;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import g8.m;
import g8.o;
import g8.x;
import x7.g;
import x7.h;
import x7.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final x f23833a = x.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f23834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23835c;

    /* renamed from: d, reason: collision with root package name */
    public final x7.a f23836d;

    /* renamed from: e, reason: collision with root package name */
    public final m f23837e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23838f;
    public final i g;

    public b(int i4, int i10, h hVar) {
        this.f23834b = i4;
        this.f23835c = i10;
        this.f23836d = (x7.a) hVar.c(o.f24585f);
        this.f23837e = (m) hVar.c(m.g);
        g gVar = o.f24587i;
        this.f23838f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.g = (i) hVar.c(o.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f23833a.c(this.f23834b, this.f23835c, this.f23838f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f23836d == x7.a.f36994b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f23834b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f23835c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f23837e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.g;
        if (iVar != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.f37005a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i4 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
