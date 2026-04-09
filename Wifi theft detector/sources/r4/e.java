package r4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f24169a;

    public class a extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f24170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f24170b = carouselLayoutManager;
        }

        @Override // r4.e
        public int d() {
            return this.f24170b.getHeight();
        }

        @Override // r4.e
        public int e() {
            return this.f24170b.getPaddingLeft();
        }

        @Override // r4.e
        public int f() {
            return this.f24170b.getWidth() - this.f24170b.getPaddingRight();
        }

        @Override // r4.e
        public int g() {
            return h();
        }

        @Override // r4.e
        public int h() {
            return 0;
        }

        @Override // r4.e
        public void i(View view, int i10, int i11) {
            int iE = e();
            this.f24170b.layoutDecoratedWithMargins(view, iE, i10, iE + k(view), i11);
        }

        @Override // r4.e
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        public int k(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f24170b.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
        }
    }

    public class b extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f24171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f24171b = carouselLayoutManager;
        }

        @Override // r4.e
        public int d() {
            return this.f24171b.getHeight() - this.f24171b.getPaddingBottom();
        }

        @Override // r4.e
        public int e() {
            return 0;
        }

        @Override // r4.e
        public int f() {
            return this.f24171b.getWidth();
        }

        @Override // r4.e
        public int g() {
            return this.f24171b.X() ? f() : e();
        }

        @Override // r4.e
        public int h() {
            return this.f24171b.getPaddingTop();
        }

        @Override // r4.e
        public void i(View view, int i10, int i11) {
            int iH = h();
            this.f24171b.layoutDecoratedWithMargins(view, i10, iH, i11, iH + k(view));
        }

        @Override // r4.e
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        public int k(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f24171b.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
        }
    }

    public /* synthetic */ e(int i10, a aVar) {
        this(i10);
    }

    public static e a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static e b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static e c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract void i(View view, int i10, int i11);

    public abstract void j(View view, Rect rect, float f10, float f11);

    public e(int i10) {
        this.f24169a = i10;
    }
}
