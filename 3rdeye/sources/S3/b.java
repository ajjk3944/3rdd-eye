package S3;

import G.n;
import android.view.View;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11898c;

    public /* synthetic */ b(Object obj, int i) {
        this.f11897b = i;
        this.f11898c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Object obj = this.f11898c;
        switch (this.f11897b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i13 || i10 != i14 || i11 != i15 || i12 != i16) {
                    view.post(new C8.a(carouselLayoutManager, 4));
                    break;
                }
            default:
                PreviewView.c cVar = PreviewView.f15157n;
                PreviewView previewView = (PreviewView) obj;
                if (i11 - i != i15 - i13 || i12 - i10 != i16 - i14) {
                    previewView.a();
                    n.a();
                    previewView.getViewPort();
                    break;
                }
                break;
        }
    }
}
