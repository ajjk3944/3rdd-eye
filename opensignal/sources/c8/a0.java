package c8;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Size;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class a0 implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ br.w f3315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f3316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ br.t f3317c;

    public a0(br.w wVar, c0 c0Var, br.t tVar) {
        this.f3315a = wVar;
        this.f3316b = c0Var;
        this.f3317c = tVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.f3315a.f2917a = imageDecoder;
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        l8.n nVar = this.f3316b.f3324b;
        m8.h hVar = nVar.f14951d;
        m8.g gVar = nVar.f14952e;
        m8.h hVar2 = m8.h.f16324c;
        int iK = br.l.a(hVar, hVar2) ? width : i3.g.K(hVar.f16325a, gVar);
        l8.n nVar2 = this.f3316b.f3324b;
        m8.h hVar3 = nVar2.f14951d;
        int iK2 = br.l.a(hVar3, hVar2) ? height : i3.g.K(hVar3.f16326b, nVar2.f14952e);
        if (width > 0 && height > 0 && (width != iK || height != iK2)) {
            double dG = y3.g(width, height, iK, iK2, this.f3316b.f3324b.f14952e);
            boolean z10 = dG < 1.0d;
            this.f3317c.f2914a = z10;
            if (z10 || !this.f3316b.f3324b.f14953f) {
                imageDecoder.setTargetSize(dr.a.E(width * dG), dr.a.E(dG * height));
            }
        }
        l8.n nVar3 = this.f3316b.f3324b;
        imageDecoder.setAllocator((Build.VERSION.SDK_INT < 26 || nVar3.f14949b != Bitmap.Config.HARDWARE) ? 1 : 3);
        imageDecoder.setMemorySizePolicy(!nVar3.f14954g ? 1 : 0);
        ColorSpace colorSpace = nVar3.f14950c;
        if (colorSpace != null) {
            imageDecoder.setTargetColorSpace(colorSpace);
        }
        imageDecoder.setUnpremultipliedRequired(!nVar3.f14955h);
        if (nVar3.f14957l.f14962a.get("coil#animated_transformation") != null) {
            throw new ClassCastException();
        }
        imageDecoder.setPostProcessor(null);
    }
}
