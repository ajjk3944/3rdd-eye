package S3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: classes2.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f11900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f11900b = carouselLayoutManager;
    }

    @Override // S3.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.top;
        float f11 = rectF3.top;
        if (f10 < f11 && rectF2.bottom > f11) {
            float f12 = f11 - f10;
            rectF.top += f12;
            rectF3.top += f12;
        }
        float f13 = rectF2.bottom;
        float f14 = rectF3.bottom;
        if (f13 <= f14 || rectF2.top >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
    }

    @Override // S3.f
    public final float b(RecyclerView.q qVar) {
        return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
    }

    @Override // S3.f
    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(0.0f, f12, f11, f10 - f12);
    }

    @Override // S3.f
    public final int d() {
        return this.f11900b.f16511o;
    }

    @Override // S3.f
    public final int e() {
        return this.f11900b.f16511o;
    }

    @Override // S3.f
    public final int f() {
        return this.f11900b.Y();
    }

    @Override // S3.f
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.f11900b;
        return carouselLayoutManager.f16510n - carouselLayoutManager.Z();
    }

    @Override // S3.f
    public final int h() {
        return 0;
    }

    @Override // S3.f
    public final int i() {
        return 0;
    }

    @Override // S3.f
    public final void j(View view, int i, int i10) {
        int iY = this.f11900b.Y();
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        this.f11900b.h0(view, iY, i, RecyclerView.p.U(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + iY, i10);
    }

    @Override // S3.f
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // S3.f
    public final void l(View view, Rect rect, float f10, float f11) {
        view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
    }
}
