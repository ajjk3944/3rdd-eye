package g8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 implements x7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24560a;

    public /* synthetic */ c0(int i4) {
        this.f24560a = i4;
    }

    @Override // x7.j
    public final z7.y a(Object obj, int i4, int i10, x7.h hVar) {
        switch (this.f24560a) {
            case 0:
                return new b0((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new i8.d(drawable, 0);
                }
                return null;
            default:
                return new b0((File) obj);
        }
    }

    @Override // x7.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, x7.h hVar) {
        switch (this.f24560a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
