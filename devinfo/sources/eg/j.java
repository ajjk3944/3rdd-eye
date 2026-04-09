package eg;

import android.widget.ImageView;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements p8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f23468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f23469c;

    public /* synthetic */ j(ImageView imageView, ImageView imageView2, int i4) {
        this.f23467a = i4;
        this.f23468b = imageView;
        this.f23469c = imageView2;
    }

    @Override // p8.e
    public final void a(int i4, Object obj, Object obj2) {
        switch (this.f23467a) {
            case 0:
                nk.k.e(obj2, "model");
                u.y(i4, "dataSource");
                ImageView imageView = this.f23468b;
                if (imageView != null) {
                    imageView.setAlpha(0.0f);
                }
                ImageView imageView2 = this.f23469c;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(1.0f).start();
                break;
            default:
                ImageView imageView3 = this.f23468b;
                if (imageView3.isActivated()) {
                    boolean z3 = i4 == 5;
                    imageView3.setTag(null);
                    imageView3.setVisibility(0);
                    if (!z3) {
                        imageView3.setAlpha(0.0f);
                        imageView3.animate().alpha(1.0f).start();
                    }
                    ImageView imageView4 = this.f23469c;
                    if (imageView4 != null) {
                        if (!z3) {
                            imageView4.setAlpha(1.0f);
                            imageView4.animate().alpha(0.0f).start();
                            break;
                        } else {
                            imageView4.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // p8.e
    public final void b(q8.e eVar) {
        switch (this.f23467a) {
            case 0:
                nk.k.e(eVar, "target");
                break;
        }
    }

    private final void c(q8.e eVar) {
    }
}
