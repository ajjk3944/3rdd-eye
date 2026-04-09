package K6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: DivActionBinder.kt */
/* renamed from: K6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760v extends kotlin.jvm.internal.m implements p9.l<View, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public static final C0760v f3652g = new C0760v(1);

    @Override // p9.l
    public final Boolean invoke(View view) {
        View view2 = view;
        kotlin.jvm.internal.l.f(view2, "view");
        boolean zPerformLongClick = false;
        do {
            ViewParent parent = view2.getParent();
            view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view2 == null || view2.getParent() == null) {
                break;
            }
            zPerformLongClick = view2.performLongClick();
        } while (!zPerformLongClick);
        return Boolean.valueOf(zPerformLongClick);
    }
}
