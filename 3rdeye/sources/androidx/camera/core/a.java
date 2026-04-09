package androidx.camera.core;

import C.C0620g;
import C.L;
import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.c;
import androidx.camera.core.impl.P0;
import java.nio.ByteBuffer;

/* compiled from: AndroidImageProxy.java */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Image f14836b;

    /* renamed from: c, reason: collision with root package name */
    public final C0230a[] f14837c;

    /* renamed from: d, reason: collision with root package name */
    public final C0620g f14838d;

    /* compiled from: AndroidImageProxy.java */
    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0230a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final Image.Plane f14839a;

        public C0230a(Image.Plane plane) {
            this.f14839a = plane;
        }

        @Override // androidx.camera.core.c.a
        public final ByteBuffer q() {
            return this.f14839a.getBuffer();
        }

        @Override // androidx.camera.core.c.a
        public final int r() {
            return this.f14839a.getRowStride();
        }

        @Override // androidx.camera.core.c.a
        public final int s() {
            return this.f14839a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f14836b = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f14837c = new C0230a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f14837c[i] = new C0230a(planes[i]);
            }
        } else {
            this.f14837c = new C0230a[0];
        }
        this.f14838d = new C0620g(P0.f14934b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f14836b.close();
    }

    @Override // androidx.camera.core.c
    public final int getFormat() {
        return this.f14836b.getFormat();
    }

    @Override // androidx.camera.core.c
    public final int getHeight() {
        return this.f14836b.getHeight();
    }

    @Override // androidx.camera.core.c
    public final Image getImage() {
        return this.f14836b;
    }

    @Override // androidx.camera.core.c
    public final int getWidth() {
        return this.f14836b.getWidth();
    }

    @Override // androidx.camera.core.c
    public final L i0() {
        return this.f14838d;
    }

    @Override // androidx.camera.core.c
    public final c.a[] y() {
        return this.f14837c;
    }
}
