package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
interface q {

    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f34569a;

        /* renamed from: b, reason: collision with root package name */
        private final List f34570b;

        /* renamed from: c, reason: collision with root package name */
        private final F2.b f34571c;

        a(ByteBuffer byteBuffer, List list, F2.b bVar) {
            this.f34569a = byteBuffer;
            this.f34570b = list;
            this.f34571c = bVar;
        }

        private InputStream e() {
            return W2.a.g(W2.a.d(this.f34569a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public int a() {
            return com.bumptech.glide.load.a.c(this.f34570b, W2.a.d(this.f34569a), this.f34571c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f34570b, W2.a.d(this.f34569a));
        }
    }

    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f34572a;

        /* renamed from: b, reason: collision with root package name */
        private final F2.b f34573b;

        /* renamed from: c, reason: collision with root package name */
        private final List f34574c;

        b(InputStream inputStream, List list, F2.b bVar) {
            this.f34573b = (F2.b) W2.k.d(bVar);
            this.f34574c = (List) W2.k.d(list);
            this.f34572a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public int a() {
            return com.bumptech.glide.load.a.b(this.f34574c, this.f34572a.a(), this.f34573b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f34572a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public void c() {
            this.f34572a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f34574c, this.f34572a.a(), this.f34573b);
        }
    }

    public static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        private final F2.b f34575a;

        /* renamed from: b, reason: collision with root package name */
        private final List f34576b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f34577c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, F2.b bVar) {
            this.f34575a = (F2.b) W2.k.d(bVar);
            this.f34576b = (List) W2.k.d(list);
            this.f34577c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public int a() {
            return com.bumptech.glide.load.a.a(this.f34576b, this.f34577c, this.f34575a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f34577c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f34576b, this.f34577c, this.f34575a);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
