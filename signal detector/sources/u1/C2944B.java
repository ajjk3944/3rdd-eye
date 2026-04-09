package u1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: u1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2944B implements n1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23713a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23714b;

    public /* synthetic */ C2944B(int i, Object obj) {
        this.f23713a = i;
        this.f23714b = obj;
    }

    @Override // n1.z
    public final void b() {
        switch (this.f23713a) {
            case 2:
                ((AnimatedImageDrawable) this.f23714b).stop();
                ((AnimatedImageDrawable) this.f23714b).clearAnimationCallbacks();
                break;
        }
    }

    @Override // n1.z
    public final int c() {
        switch (this.f23713a) {
            case 0:
                return H1.p.c((Bitmap) this.f23714b);
            case 1:
                return ((byte[]) this.f23714b).length;
            case 2:
                return H1.p.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f23714b).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f23714b).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // n1.z
    public final Class e() {
        switch (this.f23713a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f23714b).getClass();
        }
    }

    @Override // n1.z
    public final Object get() {
        switch (this.f23713a) {
            case 0:
                return (Bitmap) this.f23714b;
            case 1:
                return (byte[]) this.f23714b;
            case 2:
                return (AnimatedImageDrawable) this.f23714b;
            default:
                return (File) this.f23714b;
        }
    }

    public C2944B(byte[] bArr) {
        this.f23713a = 1;
        H1.g.c(bArr, "Argument must not be null");
        this.f23714b = bArr;
    }

    public C2944B(File file) {
        this.f23713a = 3;
        H1.g.c(file, "Argument must not be null");
        this.f23714b = file;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void f() {
    }
}
