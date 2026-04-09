package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f5907a;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f5908d;

    /* renamed from: g, reason: collision with root package name */
    public g f5909g;

    public j(l0 l0Var, ImageView imageView, g gVar) {
        this.f5907a = l0Var;
        this.f5908d = new WeakReference(imageView);
        this.f5909g = gVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f5908d.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width > 0 && height > 0) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    l0 l0Var = this.f5907a;
                    l0Var.f5929c = false;
                    l0Var.f5928b.b(width, height);
                    l0Var.c(imageView, this.f5909g);
                }
            }
        }
        return true;
    }
}
