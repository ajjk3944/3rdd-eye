package F2;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements d {
    @Override // F2.d
    public void a(int i10) {
    }

    @Override // F2.d
    public void b() {
    }

    @Override // F2.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // F2.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // F2.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
