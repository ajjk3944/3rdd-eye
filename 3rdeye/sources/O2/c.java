package O2;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes.dex */
public class c implements b {
    @Override // O2.b
    public final Bitmap a(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // O2.b
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // O2.b
    public final Bitmap c(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // O2.b
    public final void e() {
    }

    @Override // O2.b
    public final void d(int i) {
    }
}
