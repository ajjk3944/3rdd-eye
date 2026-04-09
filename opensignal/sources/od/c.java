package od;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c extends c5.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19292g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f19293r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i10) {
        super(1, 3);
        this.f19292g = i10;
        switch (i10) {
            case 1:
                this.f19293r = carouselLayoutManager;
                super(0, 3);
                break;
            default:
                this.f19293r = carouselLayoutManager;
                break;
        }
    }

    @Override // c5.a
    public final int i() {
        switch (this.f19292g) {
            case 0:
                return this.f19293r.f10285o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f19293r;
                return carouselLayoutManager.f10285o - carouselLayoutManager.D();
        }
    }

    @Override // c5.a
    public final int j() {
        switch (this.f19292g) {
            case 0:
                return this.f19293r.E();
            default:
                return 0;
        }
    }

    @Override // c5.a
    public final int k() {
        switch (this.f19292g) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f19293r;
                return carouselLayoutManager.f10284n - carouselLayoutManager.F();
            default:
                return this.f19293r.f10284n;
        }
    }

    @Override // c5.a
    public final int l() {
        switch (this.f19292g) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f19293r;
                if (carouselLayoutManager.F0()) {
                    return carouselLayoutManager.f10284n;
                }
                return 0;
        }
    }

    @Override // c5.a
    public final int m() {
        switch (this.f19292g) {
            case 0:
                return 0;
            default:
                return this.f19293r.G();
        }
    }
}
