package c;

import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* renamed from: c.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2002A extends kotlin.jvm.internal.m implements p9.l<View, InterfaceC2025w> {

    /* renamed from: g, reason: collision with root package name */
    public static final C2002A f18263g = new C2002A(1);

    @Override // p9.l
    public final InterfaceC2025w invoke(View view) {
        View it = view;
        kotlin.jvm.internal.l.f(it, "it");
        Object tag = it.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof InterfaceC2025w) {
            return (InterfaceC2025w) tag;
        }
        return null;
    }
}
