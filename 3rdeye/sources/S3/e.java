package S3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: classes2.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f11901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f11901b = carouselLayoutManager;
    }

    @Override // S3.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.left;
        float f11 = rectF3.left;
        if (f10 < f11 && rectF2.right > f11) {
            float f12 = f11 - f10;
            rectF.left += f12;
            rectF2.left += f12;
        }
        float f13 = rectF2.right;
        float f14 = rectF3.right;
        if (f13 <= f14 || rectF2.left >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.right = Math.max(rectF.right - f15, rectF.left);
        rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
    }

    @Override // S3.f
    public final float b(RecyclerView.q qVar) {
        return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
    }

    @Override // S3.f
    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(f13, 0.0f, f11 - f13, f10);
    }

    @Override // S3.f
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f11901b;
        return carouselLayoutManager.f16511o - carouselLayoutManager.X();
    }

    @Override // S3.f
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f11901b;
        if (carouselLayoutManager.l1()) {
            return 0;
        }
        return carouselLayoutManager.f16510n;
    }

    @Override // S3.f
    public final int f() {
        return 0;
    }

    @Override // S3.f
    public final int g() {
        return this.f11901b.f16510n;
    }

    @Override // S3.f
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.f11901b;
        if (carouselLayoutManager.l1()) {
            return carouselLayoutManager.f16510n;
        }
        return 0;
    }

    @Override // S3.f
    public final int i() {
        return this.f11901b.a0();
    }

    @Override // S3.f
    public final void j(View view, int i, int i10) {
        int iA0 = this.f11901b.a0();
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        this.f11901b.h0(view, i, iA0, i10, RecyclerView.p.T(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + iA0);
    }

    @Override // S3.f
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // S3.f
    public final void l(View view, Rect rect, float f10, float f11) {
        view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
    }
}
