package C;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC1700l0;
import java.util.concurrent.Executor;

/* compiled from: AndroidImageReaderProxy.java */
/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616c implements InterfaceC1700l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f689a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f690b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f691c = true;

    public C0616c(ImageReader imageReader) {
        this.f689a = imageReader;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final Surface a() {
        Surface surface;
        synchronized (this.f690b) {
            surface = this.f689a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final androidx.camera.core.c b() {
        Image imageAcquireLatestImage;
        synchronized (this.f690b) {
            try {
                imageAcquireLatestImage = this.f689a.acquireLatestImage();
            } catch (RuntimeException e4) {
                if (!"ImageReaderContext is not initialized".equals(e4.getMessage())) {
                    throw e4;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void close() {
        synchronized (this.f690b) {
            this.f689a.close();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int d() {
        int imageFormat;
        synchronized (this.f690b) {
            imageFormat = this.f689a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void e() {
        synchronized (this.f690b) {
            this.f691c = true;
            this.f689a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int f() {
        int maxImages;
        synchronized (this.f690b) {
            maxImages = this.f689a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final androidx.camera.core.c g() {
        Image imageAcquireNextImage;
        synchronized (this.f690b) {
            try {
                imageAcquireNextImage = this.f689a.acquireNextImage();
            } catch (RuntimeException e4) {
                if (!"ImageReaderContext is not initialized".equals(e4.getMessage())) {
                    throw e4;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getHeight() {
        int height;
        synchronized (this.f690b) {
            height = this.f689a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getWidth() {
        int width;
        synchronized (this.f690b) {
            width = this.f689a.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void h(final InterfaceC1700l0.a aVar, final Executor executor) {
        synchronized (this.f690b) {
            this.f691c = false;
            this.f689a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: C.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0616c c0616c = this.f678b;
                    Executor executor2 = executor;
                    InterfaceC1700l0.a aVar2 = aVar;
                    synchronized (c0616c.f690b) {
                        try {
                            if (!c0616c.f691c) {
                                executor2.execute(new RunnableC0615b(0, c0616c, aVar2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, G.m.a());
        }
    }
}
