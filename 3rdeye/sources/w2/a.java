package W2;

import L2.h;
import L2.j;
import N2.u;
import O2.g;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import h3.C4412a;
import h3.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: AnimatedImageDecoder.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13329a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13330b;

    /* compiled from: AnimatedImageDecoder.java */
    /* renamed from: W2.a$a, reason: collision with other inner class name */
    public static final class C0191a implements u<Drawable> {

        /* renamed from: b, reason: collision with root package name */
        public final AnimatedImageDrawable f13331b;

        public C0191a(AnimatedImageDrawable animatedImageDrawable) {
            this.f13331b = animatedImageDrawable;
        }

        @Override // N2.u
        public final void a() {
            this.f13331b.stop();
            this.f13331b.clearAnimationCallbacks();
        }

        @Override // N2.u
        public final Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // N2.u
        public final Drawable get() {
            return this.f13331b;
        }

        @Override // N2.u
        public final int getSize() {
            return l.d(Bitmap.Config.ARGB_8888) * this.f13331b.getIntrinsicHeight() * this.f13331b.getIntrinsicWidth() * 2;
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    public static final class b implements j<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final a f13332a;

        public b(a aVar) {
            this.f13332a = aVar;
        }

        @Override // L2.j
        public final boolean a(ByteBuffer byteBuffer, h hVar) throws IOException {
            ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.a.c(this.f13332a.f13329a, byteBuffer);
            if (imageTypeC != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // L2.j
        public final u<Drawable> b(ByteBuffer byteBuffer, int i, int i10, h hVar) throws IOException {
            return a.a(ImageDecoder.createSource(byteBuffer), i, i10, hVar);
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    public static final class c implements j<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final a f13333a;

        public c(a aVar) {
            this.f13333a = aVar;
        }

        @Override // L2.j
        public final boolean a(InputStream inputStream, h hVar) throws IOException {
            a aVar = this.f13333a;
            ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.a.b(aVar.f13329a, inputStream, aVar.f13330b);
            if (imageTypeB != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeB == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // L2.j
        public final u<Drawable> b(InputStream inputStream, int i, int i10, h hVar) throws IOException {
            return a.a(ImageDecoder.createSource(C4412a.b(inputStream)), i, i10, hVar);
        }
    }

    public a(ArrayList arrayList, g gVar) {
        this.f13329a = arrayList;
        this.f13330b = gVar;
    }

    public static C0191a a(ImageDecoder.Source source, int i, int i10, h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new T2.a(i, i10, hVar));
        if (J0.e.l(drawableDecodeDrawable)) {
            return new C0191a(I6.j.b(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
