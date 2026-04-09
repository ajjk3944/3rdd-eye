package u1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: u1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2945C implements l1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23715a;

    public /* synthetic */ C2945C(int i) {
        this.f23715a = i;
    }

    @Override // l1.j
    public final /* bridge */ /* synthetic */ boolean a(Object obj, l1.h hVar) {
        switch (this.f23715a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // l1.j
    public final n1.z b(Object obj, int i, int i3, l1.h hVar) {
        switch (this.f23715a) {
            case 0:
                return new C2944B(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new w1.c(drawable, 0);
                }
                return null;
            default:
                return new C2944B((File) obj);
        }
    }
}
