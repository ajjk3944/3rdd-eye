package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements q8.e {

    /* renamed from: a, reason: collision with root package name */
    public final q8.c f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f6552b;

    public n(ImageView imageView) {
        this.f6552b = imageView;
        this.f6551a = new q8.c(imageView);
    }

    @Override // q8.e
    public final void a(p8.c cVar) {
        this.f6552b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // q8.e
    public final void c(p8.g gVar) {
        this.f6551a.f32219b.remove(gVar);
    }

    @Override // q8.e
    public final p8.c f() {
        Object tag = this.f6552b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof p8.c) {
            return (p8.c) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // q8.e
    public final void g(Drawable drawable) {
        q8.c cVar = this.f6551a;
        ViewTreeObserver viewTreeObserver = cVar.f32218a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(cVar.f32220c);
        }
        cVar.f32220c = null;
        cVar.f32219b.clear();
    }

    @Override // q8.e
    public final void h(p8.g gVar) throws Throwable {
        q8.c cVar = this.f6551a;
        ArrayList arrayList = cVar.f32219b;
        ImageView imageView = cVar.f32218a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = cVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int iA2 = cVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            gVar.l(iA, iA2);
            return;
        }
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (cVar.f32220c == null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            q8.b bVar = new q8.b(cVar);
            cVar.f32220c = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }
    }

    public final String toString() {
        return "Target for: " + this.f6552b;
    }

    @Override // m8.i
    public final void onDestroy() {
    }

    @Override // m8.i
    public final void onStart() {
    }

    @Override // m8.i
    public final void onStop() {
    }

    @Override // q8.e
    public final void b(Object obj) {
    }

    @Override // q8.e
    public final void d(Drawable drawable) {
    }

    @Override // q8.e
    public final void e(Drawable drawable) {
    }
}
