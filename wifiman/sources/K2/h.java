package K2;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.p;

/* loaded from: classes.dex */
public final class h implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final p f10260a = p.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f10261b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10262c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.b f10263d;

    /* renamed from: e, reason: collision with root package name */
    private final k f10264e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10265f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.h f10266g;

    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public h(int i10, int i11, C2.g gVar) {
        this.f10261b = i10;
        this.f10262c = i11;
        this.f10263d = (C2.b) gVar.c(l.f34544f);
        this.f10264e = (k) gVar.c(k.f34542h);
        C2.f fVar = l.f34548j;
        this.f10265f = gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue();
        this.f10266g = (C2.h) gVar.c(l.f34545g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f10260a.f(this.f10261b, this.f10262c, this.f10265f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f10263d == C2.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f10261b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f10262c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f10264e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        C2.h hVar = this.f10266g;
        if (hVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((hVar == C2.h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
