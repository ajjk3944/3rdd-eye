package fe;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kc.f;
import w.g;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e3.b f8837f;

    public /* synthetic */ b(e3.b bVar, int i10) {
        this.f8836e = i10;
        this.f8837f = bVar;
    }

    @Override // kc.f
    public int B(View view) {
        switch (this.f8836e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8837f;
                return sideSheetBehavior.f5692l + sideSheetBehavior.f5695o;
            default:
                return super.B(view);
        }
    }

    @Override // kc.f
    public int C() {
        switch (this.f8836e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8837f;
                int i10 = BottomSheetBehavior.f5508g0;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.C();
        }
    }

    @Override // kc.f
    public final void M(int i10) {
        switch (this.f8836e) {
            case 0:
                if (i10 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8837f;
                    if (sideSheetBehavior.f5689g) {
                        sideSheetBehavior.s(1);
                        break;
                    }
                }
                break;
            default:
                if (i10 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8837f;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.D(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kc.f
    public final void N(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f8836e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8837f;
                WeakReference weakReference = sideSheetBehavior.f5697q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f5683a.j0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f5701u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f5683a.g(i10);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw g.d(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f8837f).v(i11);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // kc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.b.O(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    @Override // kc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean W(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f8836e
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            e3.b r0 = r4.f8837f
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f5514c0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f5510a0
            if (r1 != r6) goto L31
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L26
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L31
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L31
            goto L3f
        L31:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            e3.b r6 = r4.f8837f
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f5690h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r6 = r6.f5696p
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.b.W(android.view.View, int):boolean");
    }

    @Override // kc.f
    public final int k(View view, int i10) {
        switch (this.f8836e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8837f;
                return dr.a.g(i10, sideSheetBehavior.f5683a.E(), sideSheetBehavior.f5683a.D());
            default:
                return view.getLeft();
        }
    }

    @Override // kc.f
    public final int l(View view, int i10) {
        switch (this.f8836e) {
            case 0:
                return view.getTop();
            default:
                return dr.a.g(i10, ((BottomSheetBehavior) this.f8837f).y(), C());
        }
    }
}
