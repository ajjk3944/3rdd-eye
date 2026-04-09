package t1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import l1.C2641g;
import l1.EnumC2635a;
import l1.h;
import l1.i;
import u1.n;
import u1.p;
import u1.x;

/* loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final x f23529a = x.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f23530b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23531c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC2635a f23532d;

    /* renamed from: e, reason: collision with root package name */
    public final n f23533e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23534f;

    /* renamed from: g, reason: collision with root package name */
    public final i f23535g;

    public b(int i, int i3, h hVar) {
        this.f23530b = i;
        this.f23531c = i3;
        this.f23532d = (EnumC2635a) hVar.c(p.f23753f);
        this.f23533e = (n) hVar.c(n.f23750g);
        C2641g c2641g = p.i;
        this.f23534f = hVar.c(c2641g) != null && ((Boolean) hVar.c(c2641g)).booleanValue();
        this.f23535g = (i) hVar.c(p.f23754g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f23529a.c(this.f23530b, this.f23531c, this.f23534f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f23532d == EnumC2635a.f21813b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C2904a());
        Size size = imageInfo.getSize();
        int width = this.f23530b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f23531c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f23533e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f23535g;
        if (iVar != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.f21824a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
