package u1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o1.InterfaceC2753a;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2949d implements n1.z, n1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23732a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23733b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23734c;

    public C2949d(Bitmap bitmap, InterfaceC2753a interfaceC2753a) {
        H1.g.c(bitmap, "Bitmap must not be null");
        this.f23733b = bitmap;
        H1.g.c(interfaceC2753a, "BitmapPool must not be null");
        this.f23734c = interfaceC2753a;
    }

    public static C2949d d(Bitmap bitmap, InterfaceC2753a interfaceC2753a) {
        if (bitmap == null) {
            return null;
        }
        return new C2949d(bitmap, interfaceC2753a);
    }

    @Override // n1.w
    public final void a() {
        switch (this.f23732a) {
            case 0:
                ((Bitmap) this.f23733b).prepareToDraw();
                break;
            default:
                n1.z zVar = (n1.z) this.f23734c;
                if (zVar instanceof n1.w) {
                    ((n1.w) zVar).a();
                    break;
                }
                break;
        }
    }

    @Override // n1.z
    public final void b() {
        switch (this.f23732a) {
            case 0:
                ((InterfaceC2753a) this.f23734c).e((Bitmap) this.f23733b);
                break;
            default:
                ((n1.z) this.f23734c).b();
                break;
        }
    }

    @Override // n1.z
    public final int c() {
        switch (this.f23732a) {
            case 0:
                return H1.p.c((Bitmap) this.f23733b);
            default:
                return ((n1.z) this.f23734c).c();
        }
    }

    @Override // n1.z
    public final Class e() {
        switch (this.f23732a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // n1.z
    public final Object get() {
        switch (this.f23732a) {
            case 0:
                return (Bitmap) this.f23733b;
            default:
                return new BitmapDrawable((Resources) this.f23733b, (Bitmap) ((n1.z) this.f23734c).get());
        }
    }

    public C2949d(Resources resources, n1.z zVar) {
        H1.g.c(resources, "Argument must not be null");
        this.f23733b = resources;
        H1.g.c(zVar, "Argument must not be null");
        this.f23734c = zVar;
    }
}
