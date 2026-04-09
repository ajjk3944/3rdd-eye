package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sd extends td {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 0);
        this.c = i;
        switch (i) {
            case 1:
                this.d = carouselLayoutManager;
                super(0, 0);
                break;
            default:
                this.d = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.td
    public final int a() {
        switch (this.c) {
            case 0:
                return this.d.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                return carouselLayoutManager.o - carouselLayoutManager.D();
        }
    }

    @Override // defpackage.td
    public final int b() {
        switch (this.c) {
            case 0:
                return this.d.E();
            default:
                return 0;
        }
    }

    @Override // defpackage.td
    public final int c() {
        switch (this.c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.d;
                return carouselLayoutManager.n - carouselLayoutManager.F();
            default:
                return this.d.n;
        }
    }

    @Override // defpackage.td
    public final int d() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.td
    public final int e() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.d.G();
        }
    }
}
