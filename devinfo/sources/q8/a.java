package q8;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import p8.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f32211a;

    /* renamed from: b, reason: collision with root package name */
    public final f f32212b;

    /* renamed from: c, reason: collision with root package name */
    public Animatable f32213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32214d;

    public a(ImageView imageView, int i4) {
        this.f32214d = i4;
        t8.f.c(imageView, "Argument must not be null");
        this.f32211a = imageView;
        this.f32212b = new f(imageView);
    }

    @Override // q8.e
    public final void a(p8.c cVar) {
        this.f32211a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // q8.e
    public final void b(Object obj) {
        i(obj);
        if (!(obj instanceof Animatable)) {
            this.f32213c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f32213c = animatable;
        animatable.start();
    }

    @Override // q8.e
    public final void c(g gVar) {
        this.f32212b.f32223b.remove(gVar);
    }

    @Override // q8.e
    public final void d(Drawable drawable) {
        i(null);
        this.f32213c = null;
        this.f32211a.setImageDrawable(drawable);
    }

    @Override // q8.e
    public final void e(Drawable drawable) {
        i(null);
        this.f32213c = null;
        this.f32211a.setImageDrawable(drawable);
    }

    @Override // q8.e
    public final p8.c f() {
        Object tag = this.f32211a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof p8.c) {
            return (p8.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // q8.e
    public final void g(Drawable drawable) {
        f fVar = this.f32212b;
        ViewTreeObserver viewTreeObserver = fVar.f32222a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f32224c);
        }
        fVar.f32224c = null;
        fVar.f32223b.clear();
        Animatable animatable = this.f32213c;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f32213c = null;
        this.f32211a.setImageDrawable(drawable);
    }

    @Override // q8.e
    public final void h(g gVar) throws Throwable {
        f fVar = this.f32212b;
        ArrayList arrayList = fVar.f32223b;
        View view = fVar.f32222a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = fVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = fVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            gVar.l(iA, iA2);
            return;
        }
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (fVar.f32224c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            b bVar = new b(fVar);
            fVar.f32224c = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }
    }

    public final void i(Object obj) {
        switch (this.f32214d) {
            case 0:
                this.f32211a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f32211a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // m8.i
    public final void onStart() {
        Animatable animatable = this.f32213c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // m8.i
    public final void onStop() {
        Animatable animatable = this.f32213c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.f32211a;
    }

    @Override // m8.i
    public final void onDestroy() {
    }
}
