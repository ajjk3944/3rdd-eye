package W2;

import L2.h;
import L2.j;
import N2.u;
import android.graphics.drawable.Drawable;
import java.io.IOException;

/* compiled from: UnitDrawableDecoder.java */
/* loaded from: classes.dex */
public final class f implements j<Drawable, Drawable> {
    @Override // L2.j
    public final /* bridge */ /* synthetic */ boolean a(Drawable drawable, h hVar) throws IOException {
        return true;
    }

    @Override // L2.j
    public final u<Drawable> b(Drawable drawable, int i, int i10, h hVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new d(drawable2);
        }
        return null;
    }
}
