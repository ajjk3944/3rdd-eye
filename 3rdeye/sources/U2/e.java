package U2;

import android.graphics.Bitmap;
import t4.C5606d;

/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public final class e implements N2.u<Bitmap>, N2.r {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f12397b;

    /* renamed from: c, reason: collision with root package name */
    public final O2.b f12398c;

    public e(O2.b bVar, Bitmap bitmap) {
        C5606d.l(bitmap, "Bitmap must not be null");
        this.f12397b = bitmap;
        C5606d.l(bVar, "BitmapPool must not be null");
        this.f12398c = bVar;
    }

    public static e b(O2.b bVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new e(bVar, bitmap);
    }

    @Override // N2.u
    public final void a() {
        this.f12398c.b(this.f12397b);
    }

    @Override // N2.u
    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // N2.u
    public final Bitmap get() {
        return this.f12397b;
    }

    @Override // N2.u
    public final int getSize() {
        return h3.l.c(this.f12397b);
    }

    @Override // N2.r
    public final void initialize() {
        this.f12397b.prepareToDraw();
    }
}
