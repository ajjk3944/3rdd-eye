package od;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;
import j4.o;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19288a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19289d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f19288a = i10;
        this.f19289d = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        hd.a aVar;
        switch (this.f19288a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f19289d;
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    view.post(new o(12, carouselLayoutManager));
                    break;
                }
                break;
            default:
                kd.a aVar2 = (kd.a) this.f19289d;
                View view2 = aVar2.N;
                ImageView imageView = aVar2.P;
                if (imageView.getVisibility() == 0 && (aVar = aVar2.f27319w0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.M.getLayoutParams();
                int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z11 = true;
                if (aVar2.f27321x0 == 1 && aVar2.f27314r0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (aVar2.f27314r0 != -2 || view2.getMeasuredWidth() == i18) {
                        z10 = false;
                    } else {
                        layoutParams2.width = Math.max(i18, Math.min(aVar2.f27311p0, aVar2.getMeasuredWidth() - (aVar2.f27317u0 * 2)));
                        z10 = true;
                    }
                    if (view2.getMeasuredHeight() < i19) {
                        layoutParams2.height = i19;
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        view2.setLayoutParams(layoutParams2);
                        break;
                    }
                }
                break;
        }
    }
}
