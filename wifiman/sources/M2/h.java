package M2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List f12460a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.b f12461b;

    private static final class a implements E2.c {

        /* renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f12462a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f12462a = animatedImageDrawable;
        }

        @Override // E2.c
        public int a() {
            return this.f12462a.getIntrinsicWidth() * this.f12462a.getIntrinsicHeight() * W2.l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // E2.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f12462a;
        }

        @Override // E2.c
        public void c() {
            this.f12462a.stop();
            this.f12462a.clearAnimationCallbacks();
        }

        @Override // E2.c
        public Class d() {
            return Drawable.class;
        }
    }

    private static final class b implements C2.i {

        /* renamed from: a, reason: collision with root package name */
        private final h f12463a;

        b(h hVar) {
            this.f12463a = hVar;
        }

        @Override // C2.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public E2.c b(ByteBuffer byteBuffer, int i10, int i11, C2.g gVar) {
            return this.f12463a.b(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
        }

        @Override // C2.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, C2.g gVar) {
            return this.f12463a.d(byteBuffer);
        }
    }

    private static final class c implements C2.i {

        /* renamed from: a, reason: collision with root package name */
        private final h f12464a;

        c(h hVar) {
            this.f12464a = hVar;
        }

        @Override // C2.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public E2.c b(InputStream inputStream, int i10, int i11, C2.g gVar) {
            return this.f12464a.b(ImageDecoder.createSource(W2.a.b(inputStream)), i10, i11, gVar);
        }

        @Override // C2.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, C2.g gVar) {
            return this.f12464a.c(inputStream);
        }
    }

    private h(List list, F2.b bVar) {
        this.f12460a = list;
        this.f12461b = bVar;
    }

    public static C2.i a(List list, F2.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static C2.i f(List list, F2.b bVar) {
        return new c(new h(list, bVar));
    }

    E2.c b(ImageDecoder.Source source, int i10, int i11, C2.g gVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new K2.h(i10, i11, gVar));
        if (M2.b.a(drawableDecodeDrawable)) {
            return new a(M2.c.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f12460a, inputStream, this.f12461b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f12460a, byteBuffer));
    }
}
