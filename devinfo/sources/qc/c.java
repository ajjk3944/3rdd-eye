package qc;

import com.google.android.gms.internal.ads.mv0;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends mv0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f32237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i4) {
        super(1, 2);
        this.f32236c = i4;
        switch (i4) {
            case 1:
                this.f32237d = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f32237d = carouselLayoutManager;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final int a() {
        switch (this.f32236c) {
            case 0:
                return this.f32237d.getHeight();
            default:
                CarouselLayoutManager carouselLayoutManager = this.f32237d;
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final int b() {
        switch (this.f32236c) {
            case 0:
                return this.f32237d.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final int c() {
        switch (this.f32236c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f32237d;
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return this.f32237d.getWidth();
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final int d() {
        switch (this.f32236c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f32237d;
                if (carouselLayoutManager.f()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final int e() {
        switch (this.f32236c) {
            case 0:
                return 0;
            default:
                return this.f32237d.getPaddingTop();
        }
    }
}
