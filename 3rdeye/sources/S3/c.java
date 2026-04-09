package S3;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselLayoutManager.java */
/* loaded from: classes2.dex */
public final class c extends u {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f11899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f11899q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public final PointF a(int i) {
        return this.f11899q.f(i);
    }

    @Override // androidx.recyclerview.widget.u
    public final int h(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.f11899q;
        if (carouselLayoutManager.f22645u == null || !carouselLayoutManager.k1()) {
            return 0;
        }
        int iB0 = RecyclerView.p.b0(view);
        return (int) (carouselLayoutManager.f22640p - carouselLayoutManager.h1(iB0, carouselLayoutManager.g1(iB0)));
    }

    @Override // androidx.recyclerview.widget.u
    public final int i(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.f11899q;
        if (carouselLayoutManager.f22645u == null || carouselLayoutManager.k1()) {
            return 0;
        }
        int iB0 = RecyclerView.p.b0(view);
        return (int) (carouselLayoutManager.f22640p - carouselLayoutManager.h1(iB0, carouselLayoutManager.g1(iB0)));
    }
}
