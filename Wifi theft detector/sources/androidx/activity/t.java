package androidx.activity;

import android.view.View;

/* loaded from: classes.dex */
public abstract class t {
    public static final void a(View view, q onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.p.e(view, "<this>");
        kotlin.jvm.internal.p.e(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(r.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
