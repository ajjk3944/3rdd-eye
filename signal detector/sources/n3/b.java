package n3;

import C0.q;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f22326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 3);
        this.f22325c = i;
        switch (i) {
            case 1:
                this.f22326d = carouselLayoutManager;
                super(0, 3);
                break;
            default:
                this.f22326d = carouselLayoutManager;
                break;
        }
    }

    @Override // C0.q
    public final int c() {
        switch (this.f22325c) {
            case 0:
                return this.f22326d.getHeight();
            default:
                CarouselLayoutManager carouselLayoutManager = this.f22326d;
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // C0.q
    public final int d() {
        switch (this.f22325c) {
            case 0:
                return this.f22326d.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // C0.q
    public final int e() {
        switch (this.f22325c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f22326d;
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return this.f22326d.getWidth();
        }
    }

    @Override // C0.q
    public final int f() {
        switch (this.f22325c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f22326d;
                if (carouselLayoutManager.f()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    @Override // C0.q
    public final int g() {
        switch (this.f22325c) {
            case 0:
                return 0;
            default:
                return this.f22326d.getPaddingTop();
        }
    }
}
