package com.google.android.material.transformation;

import E.b;
import Q3.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import u3.InterfaceC2955a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f18608a = 0;

    public ExpandableBehavior() {
    }

    @Override // E.b
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (InterfaceC2955a) view2;
        boolean z6 = ((FloatingActionButton) obj).f18348C.f22475a;
        if (z6) {
            int i = this.f18608a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.f18608a != 1) {
            return false;
        }
        this.f18608a = z6 ? 1 : 2;
        w((View) obj, view, z6, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC2955a interfaceC2955a;
        int i3;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    interfaceC2955a = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i6);
                if (f(view, view2)) {
                    interfaceC2955a = (InterfaceC2955a) view2;
                    break;
                }
                i6++;
            }
            if (interfaceC2955a != null) {
                boolean z6 = ((FloatingActionButton) interfaceC2955a).f18348C.f22475a;
                if (!z6 ? this.f18608a == 1 : !((i3 = this.f18608a) != 0 && i3 != 2)) {
                    int i7 = z6 ? 1 : 2;
                    this.f18608a = i7;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(this, view, i7, interfaceC2955a));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z6, boolean z7);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
