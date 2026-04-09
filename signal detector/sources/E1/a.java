package E1;

import D1.f;
import H1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.apm.insight.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1356a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1357b;

    /* renamed from: c, reason: collision with root package name */
    public Animatable f1358c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1359d;

    public a(ImageView imageView, int i) {
        this.f1359d = i;
        g.c(imageView, "Argument must not be null");
        this.f1356a = imageView;
        this.f1357b = new d(imageView);
    }

    @Override // E1.c
    public final void a(f fVar) throws Throwable {
        d dVar = this.f1357b;
        ArrayList arrayList = dVar.f1362b;
        View view = dVar.f1361a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = dVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = dVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            fVar.m(iA, iA2);
            return;
        }
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (dVar.f1363c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            E.f fVar2 = new E.f(dVar);
            dVar.f1363c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // E1.c
    public final void b(Object obj) {
        k(obj);
        if (!(obj instanceof Animatable)) {
            this.f1358c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f1358c = animatable;
        animatable.start();
    }

    @Override // E1.c
    public final void c(f fVar) {
        this.f1357b.f1362b.remove(fVar);
    }

    @Override // E1.c
    public final void d(Drawable drawable) {
        k(null);
        this.f1358c = null;
        this.f1356a.setImageDrawable(drawable);
    }

    @Override // A1.j
    public final void e() {
        Animatable animatable = this.f1358c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // E1.c
    public final void f(D1.c cVar) {
        this.f1356a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // E1.c
    public final void g(Drawable drawable) {
        k(null);
        this.f1358c = null;
        this.f1356a.setImageDrawable(drawable);
    }

    @Override // E1.c
    public final D1.c h() {
        Object tag = this.f1356a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof D1.c) {
            return (D1.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // E1.c
    public final void i(Drawable drawable) {
        d dVar = this.f1357b;
        ViewTreeObserver viewTreeObserver = dVar.f1361a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(dVar.f1363c);
        }
        dVar.f1363c = null;
        dVar.f1362b.clear();
        Animatable animatable = this.f1358c;
        if (animatable != null) {
            animatable.stop();
        }
        k(null);
        this.f1358c = null;
        this.f1356a.setImageDrawable(drawable);
    }

    @Override // A1.j
    public final void j() {
        Animatable animatable = this.f1358c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void k(Object obj) {
        switch (this.f1359d) {
            case 0:
                this.f1356a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f1356a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.f1356a;
    }

    @Override // A1.j
    public final void onDestroy() {
    }
}
