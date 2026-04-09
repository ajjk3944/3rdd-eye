package H3;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d5.y;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class e extends T2.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E.b f1794e;

    public /* synthetic */ e(E.b bVar, int i) {
        this.f1793d = i;
        this.f1794e = bVar;
    }

    @Override // T2.g
    public final void A(int i) {
        switch (this.f1793d) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1794e;
                    if (sideSheetBehavior.f18434g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1794e;
                    if (bottomSheetBehavior.f18135Y) {
                        bottomSheetBehavior.J(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // T2.g
    public final void B(View view, int i, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1793d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1794e;
                WeakReference weakReference = sideSheetBehavior.f18421E;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f18428a.Q(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f18426J;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f18428a.c(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw A.f.f(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f1794e).z(i3);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // T2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.e.C(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    @Override // T2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(int r5, android.view.View r6) {
        /*
            r4 = this;
            int r0 = r4.f1793d
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            E.b r0 = r4.f1794e
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.b0
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f18166r0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f18164p0
            if (r1 != r5) goto L31
            java.lang.ref.WeakReference r5 = r0.f18158l0
            if (r5 == 0) goto L26
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L31
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L31
            goto L3f
        L31:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r5 = r0.f18156k0
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            E.b r5 = r4.f1794e
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            int r0 = r5.f18435h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r5 = r5.f18420D
            if (r5 == 0) goto L57
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.e.N(int, android.view.View):boolean");
    }

    @Override // T2.g
    public final int d(int i, View view) {
        switch (this.f1793d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1794e;
                return y.f(i, sideSheetBehavior.f18428a.v(), sideSheetBehavior.f18428a.u());
            default:
                return view.getLeft();
        }
    }

    @Override // T2.g
    public final int e(int i, View view) {
        switch (this.f1793d) {
            case 0:
                return view.getTop();
            default:
                return y.f(i, ((BottomSheetBehavior) this.f1794e).D(), s());
        }
    }

    @Override // T2.g
    public int r(View view) {
        switch (this.f1793d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1794e;
                return sideSheetBehavior.f18438l + sideSheetBehavior.f18419C;
            default:
                return super.r(view);
        }
    }

    @Override // T2.g
    public int s() {
        switch (this.f1793d) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1794e;
                return bottomSheetBehavior.f18133W ? bottomSheetBehavior.f18154j0 : bottomSheetBehavior.f18131U;
            default:
                return super.s();
        }
    }
}
