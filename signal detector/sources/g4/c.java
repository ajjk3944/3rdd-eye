package G4;

import android.graphics.Matrix;
import com.lefan.base.view.ZoomImageView;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final float f1676a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1677b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1678c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ZoomImageView f1680e;

    public c(ZoomImageView zoomImageView, float f2, float f5, float f6) {
        this.f1680e = zoomImageView;
        this.f1676a = f2;
        this.f1677b = f5;
        this.f1678c = f6;
        if (zoomImageView.getScale() < f2) {
            this.f1679d = 1.07f;
        } else {
            this.f1679d = 0.93f;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ZoomImageView zoomImageView = this.f1680e;
        Matrix matrix = zoomImageView.f18794e;
        float f2 = this.f1679d;
        float f5 = this.f1677b;
        float f6 = this.f1678c;
        matrix.postScale(f2, f2, f5, f6);
        zoomImageView.d();
        zoomImageView.setImageMatrix(zoomImageView.f18794e);
        float scale = zoomImageView.getScale();
        float f7 = this.f1676a;
        if ((f2 > 1.0f && scale < f7) || (f2 < 1.0f && scale > f7)) {
            zoomImageView.postDelayed(this, 16L);
            return;
        }
        float f8 = f7 / scale;
        zoomImageView.f18794e.postScale(f8, f8, f5, f6);
        zoomImageView.d();
        zoomImageView.setImageMatrix(zoomImageView.f18794e);
        zoomImageView.f18790F = false;
    }
}
