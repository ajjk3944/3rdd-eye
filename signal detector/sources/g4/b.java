package G4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.lefan.base.view.ZoomImageView;

/* loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZoomImageView f1675a;

    public b(ZoomImageView zoomImageView) {
        this.f1675a = zoomImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ZoomImageView zoomImageView = this.f1675a;
        if (!zoomImageView.f18790F && zoomImageView.getScale() < zoomImageView.f18797h) {
            zoomImageView.f18790F = true;
            float x6 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float scale = zoomImageView.getScale();
            float f2 = zoomImageView.f18796g;
            if (scale < f2) {
                zoomImageView.postDelayed(new c(zoomImageView, f2, x6, y3), 16L);
                return true;
            }
            zoomImageView.postDelayed(new c(zoomImageView, zoomImageView.f18795f, x6, y3), 16L);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ZoomImageView zoomImageView = this.f1675a;
        View.OnClickListener onClickListener = zoomImageView.f18791G;
        if (onClickListener == null) {
            return false;
        }
        onClickListener.onClick(zoomImageView);
        return true;
    }
}
