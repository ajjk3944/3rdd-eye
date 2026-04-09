package g8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements z7.y, z7.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24557a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24558b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24559c;

    public c(a8.b bVar, Bitmap bitmap) {
        t8.f.c(bitmap, "Bitmap must not be null");
        this.f24558b = bitmap;
        t8.f.c(bVar, "BitmapPool must not be null");
        this.f24559c = bVar;
    }

    public static c c(a8.b bVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new c(bVar, bitmap);
    }

    @Override // z7.y
    public final void a() {
        switch (this.f24557a) {
            case 0:
                ((a8.b) this.f24559c).d((Bitmap) this.f24558b);
                break;
            default:
                ((z7.y) this.f24559c).a();
                break;
        }
    }

    @Override // z7.y
    public final Class b() {
        switch (this.f24557a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // z7.y
    public final Object get() {
        switch (this.f24557a) {
            case 0:
                return (Bitmap) this.f24558b;
            default:
                return new BitmapDrawable((Resources) this.f24558b, (Bitmap) ((z7.y) this.f24559c).get());
        }
    }

    @Override // z7.y
    public final int getSize() {
        switch (this.f24557a) {
            case 0:
                return t8.m.c((Bitmap) this.f24558b);
            default:
                return ((z7.y) this.f24559c).getSize();
        }
    }

    @Override // z7.v
    public final void initialize() {
        switch (this.f24557a) {
            case 0:
                ((Bitmap) this.f24558b).prepareToDraw();
                break;
            default:
                z7.y yVar = (z7.y) this.f24559c;
                if (yVar instanceof z7.v) {
                    ((z7.v) yVar).initialize();
                    break;
                }
                break;
        }
    }

    public c(Resources resources, z7.y yVar) {
        t8.f.c(resources, "Argument must not be null");
        this.f24558b = resources;
        t8.f.c(yVar, "Argument must not be null");
        this.f24559c = yVar;
    }
}
