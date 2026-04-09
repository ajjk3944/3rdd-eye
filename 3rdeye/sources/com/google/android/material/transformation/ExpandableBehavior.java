package com.google.android.material.transformation;

import L0.I;
import L0.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.InterfaceC1850a;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f23198a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f23199b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f23200c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1850a f23201d;

        public a(View view, int i, InterfaceC1850a interfaceC1850a) {
            this.f23199b = view;
            this.f23200c = i;
            this.f23201d = interfaceC1850a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f23199b;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f23198a == this.f23200c) {
                InterfaceC1850a interfaceC1850a = this.f23201d;
                expandableBehavior.s((View) interfaceC1850a, view, interfaceC1850a.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f23198a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC1850a interfaceC1850a = (InterfaceC1850a) view2;
        if (interfaceC1850a.a()) {
            int i = this.f23198a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.f23198a != 1) {
            return false;
        }
        this.f23198a = interfaceC1850a.a() ? 1 : 2;
        s((View) interfaceC1850a, view, interfaceC1850a.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC1850a interfaceC1850a;
        int i10;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (!view.isLaidOut()) {
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    interfaceC1850a = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i11);
                if (b(view, view2)) {
                    interfaceC1850a = (InterfaceC1850a) view2;
                    break;
                }
                i11++;
            }
            if (interfaceC1850a != null && (!interfaceC1850a.a() ? this.f23198a == 1 : !((i10 = this.f23198a) != 0 && i10 != 2))) {
                int i12 = interfaceC1850a.a() ? 1 : 2;
                this.f23198a = i12;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, interfaceC1850a));
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23198a = 0;
    }
}
