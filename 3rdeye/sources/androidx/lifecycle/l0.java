package androidx.lifecycle;

import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: ViewTreeLifecycleOwner.android.kt */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements p9.l<View, InterfaceC1790x> {

    /* renamed from: g, reason: collision with root package name */
    public static final l0 f16164g = new l0(1);

    @Override // p9.l
    public final InterfaceC1790x invoke(View view) {
        View viewParent = view;
        kotlin.jvm.internal.l.f(viewParent, "viewParent");
        Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof InterfaceC1790x) {
            return (InterfaceC1790x) tag;
        }
        return null;
    }
}
