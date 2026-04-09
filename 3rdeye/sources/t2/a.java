package T2;

import L2.g;
import L2.h;
import L2.i;
import U2.l;
import U2.m;
import U2.r;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: DefaultOnHeaderDecodedListener.java */
/* loaded from: classes.dex */
public final class a implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f12240a = r.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f12241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12242c;

    /* renamed from: d, reason: collision with root package name */
    public final L2.b f12243d;

    /* renamed from: e, reason: collision with root package name */
    public final l f12244e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12245f;

    /* renamed from: g, reason: collision with root package name */
    public final i f12246g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* renamed from: T2.a$a, reason: collision with other inner class name */
    public class C0170a implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i, int i10, h hVar) {
        this.f12241b = i;
        this.f12242c = i10;
        this.f12243d = (L2.b) hVar.c(m.f12414f);
        this.f12244e = (l) hVar.c(l.f12412f);
        g<Boolean> gVar = m.i;
        this.f12245f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f12246g = (i) hVar.c(m.f12415g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f12240a.c(this.f12241b, this.f12242c, this.f12245f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f12243d == L2.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0170a());
        Size size = imageInfo.getSize();
        int width = this.f12241b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f12242c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f12244e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f12246g;
        if (iVar != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
