package me;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f16698a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16699d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vd.a f16700g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f16701r;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, vd.a aVar) {
        this.f16701r = expandableBehavior;
        this.f16698a = view;
        this.f16699d = i10;
        this.f16700g = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f16698a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f16701r;
        if (expandableBehavior.f5797a == this.f16699d) {
            Object obj = this.f16700g;
            expandableBehavior.s((View) obj, view, ((FloatingActionButton) obj).K.f10067b, false);
        }
        return false;
    }
}
