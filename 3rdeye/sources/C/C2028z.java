package c;

import android.view.View;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* renamed from: c.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2028z extends kotlin.jvm.internal.m implements p9.l<View, View> {

    /* renamed from: g, reason: collision with root package name */
    public static final C2028z f18331g = new C2028z(1);

    @Override // p9.l
    public final View invoke(View view) {
        View it = view;
        kotlin.jvm.internal.l.f(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
