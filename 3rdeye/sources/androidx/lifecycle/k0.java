package androidx.lifecycle;

import android.view.View;

/* compiled from: ViewTreeLifecycleOwner.android.kt */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements p9.l<View, View> {

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f16161g = new k0(1);

    @Override // p9.l
    public final View invoke(View view) {
        View currentView = view;
        kotlin.jvm.internal.l.f(currentView, "currentView");
        Object parent = currentView.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
