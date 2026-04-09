package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C1193a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f34250a;

        C1193a(InputStream inputStream) {
            this.f34250a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f34250a);
            } finally {
                this.f34250a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f34251a;

        b(ByteBuffer byteBuffer) {
            this.f34251a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f34251a);
            } finally {
                W2.a.d(this.f34251a);
            }
        }
    }

    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f34252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F2.b f34253b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F2.b bVar) {
            this.f34252a = parcelFileDescriptorRewinder;
            this.f34253b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            u uVar;
            u uVar2 = null;
            try {
                uVar = new u(new FileInputStream(this.f34252a.a().getFileDescriptor()), this.f34253b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(uVar);
                uVar.h();
                this.f34252a.a();
                return imageTypeB;
            } catch (Throwable th3) {
                th = th3;
                uVar2 = uVar;
                if (uVar2 != null) {
                    uVar2.h();
                }
                this.f34252a.a();
                throw th;
            }
        }
    }

    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f34254a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F2.b f34255b;

        d(ByteBuffer byteBuffer, F2.b bVar) {
            this.f34254a = byteBuffer;
            this.f34255b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f34254a, this.f34255b);
            } finally {
                W2.a.d(this.f34254a);
            }
        }
    }

    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f34256a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F2.b f34257b;

        e(InputStream inputStream, F2.b bVar) {
            this.f34256a = inputStream;
            this.f34257b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f34256a, this.f34257b);
            } finally {
                this.f34256a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f34258a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F2.b f34259b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F2.b bVar) {
            this.f34258a = parcelFileDescriptorRewinder;
            this.f34259b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            u uVar;
            u uVar2 = null;
            try {
                uVar = new u(new FileInputStream(this.f34258a.a().getFileDescriptor()), this.f34259b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int iD = imageHeaderParser.d(uVar, this.f34259b);
                uVar.h();
                this.f34258a.a();
                return iD;
            } catch (Throwable th3) {
                th = th3;
                uVar2 = uVar;
                if (uVar2 != null) {
                    uVar2.h();
                }
                this.f34258a.a();
                throw th;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F2.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, F2.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, F2.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = gVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F2.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, F2.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C1193a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
