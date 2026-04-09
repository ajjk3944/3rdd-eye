package io.sentry.android.replay.screenshot;

import android.graphics.Picture;
import android.media.ImageReader;
import br.l;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements ImageReader.OnImageAvailableListener, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final int f11966a;

    /* renamed from: d, reason: collision with root package name */
    public final int f11967d;

    /* renamed from: g, reason: collision with root package name */
    public final as.d f11968g;

    /* renamed from: r, reason: collision with root package name */
    public final Picture f11969r = new Picture();

    /* renamed from: x, reason: collision with root package name */
    public final ImageReader f11970x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f11971y;

    public c(int i10, int i11, as.d dVar) {
        this.f11966a = i10;
        this.f11967d = i11;
        this.f11968g = dVar;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i10, i11, 1, 1);
        l.d(imageReaderNewInstance, "newInstance(...)");
        this.f11970x = imageReaderNewInstance;
        this.f11971y = new AtomicBoolean(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f11970x.close();
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        if (imageReader != null) {
            this.f11968g.a(this);
        }
    }
}
