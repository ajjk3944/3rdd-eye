package U2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import h3.C4412a;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import t4.C5606d;

/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
public interface s {

    /* compiled from: ImageReader.java */
    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f12440a;

        /* renamed from: b, reason: collision with root package name */
        public final O2.g f12441b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f12442c;

        public b(h3.j jVar, ArrayList arrayList, O2.g gVar) {
            C5606d.l(gVar, "Argument must not be null");
            this.f12441b = gVar;
            C5606d.l(arrayList, "Argument must not be null");
            this.f12442c = arrayList;
            this.f12440a = new com.bumptech.glide.load.data.k(jVar, gVar);
        }

        @Override // U2.s
        public final int a() throws IOException {
            w wVar = this.f12440a.f22314a;
            wVar.reset();
            return com.bumptech.glide.load.a.a(this.f12442c, wVar, this.f12441b);
        }

        @Override // U2.s
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            w wVar = this.f12440a.f22314a;
            wVar.reset();
            return BitmapFactory.decodeStream(wVar, null, options);
        }

        @Override // U2.s
        public final void c() {
            w wVar = this.f12440a.f22314a;
            synchronized (wVar) {
                wVar.f12452d = wVar.f12450b.length;
            }
        }

        @Override // U2.s
        public final ImageHeaderParser.ImageType d() throws IOException {
            w wVar = this.f12440a.f22314a;
            wVar.reset();
            return com.bumptech.glide.load.a.b(this.f12442c, wVar, this.f12441b);
        }
    }

    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;

    /* compiled from: ImageReader.java */
    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12437a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f12438b;

        /* renamed from: c, reason: collision with root package name */
        public final O2.g f12439c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, O2.g gVar) {
            this.f12437a = byteBuffer;
            this.f12438b = arrayList;
            this.f12439c = gVar;
        }

        @Override // U2.s
        public final int a() throws IOException {
            ByteBuffer byteBufferC = C4412a.c(this.f12437a);
            O2.g gVar = this.f12439c;
            if (byteBufferC != null) {
                ArrayList arrayList = this.f12438b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iD = ((ImageHeaderParser) arrayList.get(i)).d(byteBufferC, gVar);
                        if (iD != -1) {
                            return iD;
                        }
                    } finally {
                    }
                }
            }
            return -1;
        }

        @Override // U2.s
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new C4412a.C0463a(C4412a.c(this.f12437a)), null, options);
        }

        @Override // U2.s
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.c(this.f12438b, C4412a.c(this.f12437a));
        }

        @Override // U2.s
        public final void c() {
        }
    }

    /* compiled from: ImageReader.java */
    public static final class c implements s {

        /* renamed from: a, reason: collision with root package name */
        public final O2.g f12443a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f12444b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f12445c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, O2.g gVar) {
            C5606d.l(gVar, "Argument must not be null");
            this.f12443a = gVar;
            C5606d.l(arrayList, "Argument must not be null");
            this.f12444b = arrayList;
            this.f12445c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // U2.s
        public final int a() throws Throwable {
            w wVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f12445c;
            O2.g gVar = this.f12443a;
            ArrayList arrayList = this.f12444b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                w wVar2 = null;
                try {
                    wVar = new w(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), gVar);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    int iC = imageHeaderParser.c(wVar, gVar);
                    wVar.release();
                    parcelFileDescriptorRewinder.c();
                    if (iC != -1) {
                        return iC;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    wVar2 = wVar;
                    if (wVar2 != null) {
                        wVar2.release();
                    }
                    parcelFileDescriptorRewinder.c();
                    throw th;
                }
            }
            return -1;
        }

        @Override // U2.s
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f12445c.c().getFileDescriptor(), null, options);
        }

        @Override // U2.s
        public final ImageHeaderParser.ImageType d() throws Throwable {
            w wVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f12445c;
            O2.g gVar = this.f12443a;
            ArrayList arrayList = this.f12444b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                w wVar2 = null;
                try {
                    wVar = new w(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), gVar);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(wVar);
                    wVar.release();
                    parcelFileDescriptorRewinder.c();
                    if (imageTypeB != ImageHeaderParser.ImageType.UNKNOWN) {
                        return imageTypeB;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    wVar2 = wVar;
                    if (wVar2 != null) {
                        wVar2.release();
                    }
                    parcelFileDescriptorRewinder.c();
                    throw th;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // U2.s
        public final void c() {
        }
    }
}
