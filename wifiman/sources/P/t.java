package P;

import E0.InterfaceC2632j;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC6492s;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f17975a = AbstractC6492s.d(Build.DEVICE, "layoutlib");

    /* JADX INFO: Access modifiers changed from: private */
    public static final j c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof j) {
                return (j) childAt;
            }
        }
        j jVar = new j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    public static final InterfaceC2632j d(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a) {
        return f17975a ? new c(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a, null) : new b(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup e(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
