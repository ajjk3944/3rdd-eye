package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qd extends w60 {
    public final /* synthetic */ int p = 1;

    public /* synthetic */ qd(Context context) {
        super(context);
    }

    @Override // defpackage.w60
    public int b(View view, int i) {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.w60
    public int c(View view, int i) {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.w60
    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.w60
    public PointF f(int i) {
        switch (this.p) {
            case 0:
                return null;
            default:
                return super.f(i);
        }
    }

    public qd(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
