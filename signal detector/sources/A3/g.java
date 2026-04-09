package A3;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;
import g3.C2332a;
import j3.C2561a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f372b;

    public /* synthetic */ g(int i, Object obj) {
        this.f371a = i;
        this.f372b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
        boolean z6;
        C2332a c2332a;
        switch (this.f371a) {
            case 0:
                C2561a c2561a = (C2561a) this.f372b;
                View view2 = c2561a.f384F;
                ImageView imageView = c2561a.f386H;
                if (imageView.getVisibility() == 0 && (c2332a = c2561a.f427o0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    c2332a.setBounds(rect);
                    c2332a.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2561a.f383E.getLayoutParams();
                int i12 = (i6 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i13 = (i7 - i3) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z7 = true;
                if (c2561a.f428p0 == 1 && c2561a.f418j0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (c2561a.f418j0 != -2 || view2.getMeasuredWidth() == i12) {
                        z6 = false;
                    } else {
                        layoutParams2.width = Math.max(i12, Math.min(c2561a.f415h0, c2561a.getMeasuredWidth() - (c2561a.f424m0 * 2)));
                        z6 = true;
                    }
                    if (view2.getMeasuredHeight() < i13) {
                        layoutParams2.height = i13;
                    } else {
                        z7 = z6;
                    }
                    if (z7) {
                        view2.setLayoutParams(layoutParams2);
                        break;
                    }
                }
                break;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f372b;
                if (i6 - i != i10 - i8 || i7 - i3 != i11 - i9) {
                    view.post(new z(17, carouselLayoutManager));
                    break;
                }
                break;
        }
    }
}
