package U2;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class A implements L2.j<Bitmap, Bitmap> {
    @Override // L2.j
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, L2.h hVar) throws IOException {
        return true;
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(Bitmap bitmap, int i, int i10, L2.h hVar) throws IOException {
        return new a(bitmap);
    }

    /* compiled from: UnitBitmapDecoder.java */
    public static final class a implements N2.u<Bitmap> {

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f12378b;

        public a(Bitmap bitmap) {
            this.f12378b = bitmap;
        }

        @Override // N2.u
        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // N2.u
        public final Bitmap get() {
            return this.f12378b;
        }

        @Override // N2.u
        public final int getSize() {
            return h3.l.c(this.f12378b);
        }

        @Override // N2.u
        public final void a() {
        }
    }
}
