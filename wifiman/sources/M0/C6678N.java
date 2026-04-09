package m0;

import android.graphics.Bitmap;

/* renamed from: m0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6678N implements J0 {

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f52829b;

    public C6678N(Bitmap bitmap) {
        this.f52829b = bitmap;
    }

    @Override // m0.J0
    public void a() {
        this.f52829b.prepareToDraw();
    }

    @Override // m0.J0
    public int b() {
        return AbstractC6679O.e(this.f52829b.getConfig());
    }

    public final Bitmap c() {
        return this.f52829b;
    }

    @Override // m0.J0
    public int getHeight() {
        return this.f52829b.getHeight();
    }

    @Override // m0.J0
    public int getWidth() {
        return this.f52829b.getWidth();
    }
}
