package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ob extends i30 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vj x;

    public /* synthetic */ ob(vj vjVar, int i) {
        this.w = i;
        this.x = vjVar;
    }

    @Override // defpackage.i30
    public int B(View view) {
        switch (this.w) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.x;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.B(view);
        }
    }

    @Override // defpackage.i30
    public int C() {
        switch (this.w) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.x;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.C();
        }
    }

    @Override // defpackage.i30
    public final void N(int i) {
        switch (this.w) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.x;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.J(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.x;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.i30
    public final void O(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.w) {
            case 0:
                ((BottomSheetBehavior) this.x).z(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.x;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.V(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.h(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw ex0.e(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // defpackage.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.P(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // defpackage.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.w
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            vj r6 = r4.x
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            vj r0 = r4.x
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.d0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.b0
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.T(android.view.View, int):boolean");
    }

    @Override // defpackage.i30
    public final int o(View view, int i) {
        switch (this.w) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.x;
                return bd2.h(i, sideSheetBehavior.a.x(), sideSheetBehavior.a.w());
        }
    }

    @Override // defpackage.i30
    public final int p(View view, int i) {
        switch (this.w) {
            case 0:
                return bd2.h(i, ((BottomSheetBehavior) this.x).D(), C());
            default:
                return view.getTop();
        }
    }
}
