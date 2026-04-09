package O6;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ParentScrollRestrictor.kt */
/* loaded from: classes.dex */
public final class H implements r7.h {

    /* renamed from: a, reason: collision with root package name */
    public static final H f10376a = new H();

    @Override // r7.h
    public final void a(ViewGroup viewGroup, MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }
}
