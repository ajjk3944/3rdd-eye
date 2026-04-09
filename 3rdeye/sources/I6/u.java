package I6;

import android.view.View;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: ViewCopies.kt */
/* loaded from: classes.dex */
public final class u extends K1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroupOverlay f2595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f2596c;

    public u(View view, ViewGroupOverlay viewGroupOverlay, ImageView imageView) {
        this.f2594a = view;
        this.f2595b = viewGroupOverlay;
        this.f2596c = imageView;
    }

    @Override // K1.i.d
    public final void a(K1.i iVar) {
        View view = this.f2594a;
        view.setTag(R.id.save_overlay_view, null);
        view.setVisibility(0);
        this.f2595b.remove(this.f2596c);
        iVar.z(this);
    }

    @Override // K1.l, K1.i.d
    public final void b(K1.i iVar) {
        this.f2594a.setVisibility(4);
    }

    @Override // K1.l, K1.i.d
    public final void c(K1.i iVar) {
        ImageView imageView = this.f2596c;
        if (imageView.getParent() == null) {
            this.f2595b.add(imageView);
        }
    }

    @Override // K1.l, K1.i.d
    public final void g(K1.i iVar) {
        this.f2595b.remove(this.f2596c);
    }
}
