package fd;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.u;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.b f24012b;

    public /* synthetic */ d(p3.b bVar, int i4) {
        this.f24011a = i4;
        this.f24012b = bVar;
    }

    @Override // me.t1
    public final void A(View view, int i4, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f24011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f24012b;
                WeakReference weakReference = sideSheetBehavior.f20559q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f20545a.O(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f20564v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f20545a.d(i4);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw u.o(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f24012b).z(i10);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // me.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.d.B(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    @Override // me.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(int r5, android.view.View r6) {
        /*
            r4 = this;
            int r0 = r4.f24011a
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            p3.b r0 = r4.f24012b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f20357d0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f20353b0
            if (r1 != r5) goto L31
            java.lang.ref.WeakReference r5 = r0.X
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
            java.lang.ref.WeakReference r5 = r0.W
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            p3.b r5 = r4.f24012b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            int r0 = r5.f20551h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r5 = r5.f20558p
            if (r5 == 0) goto L57
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.d.G(int, android.view.View):boolean");
    }

    @Override // me.t1
    public final int f(int i4, View view) {
        switch (this.f24011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f24012b;
                return com.bumptech.glide.d.i(i4, sideSheetBehavior.f20545a.x(), sideSheetBehavior.f20545a.w());
            default:
                return view.getLeft();
        }
    }

    @Override // me.t1
    public final int g(int i4, View view) {
        switch (this.f24011a) {
            case 0:
                return view.getTop();
            default:
                return com.bumptech.glide.d.i(i4, ((BottomSheetBehavior) this.f24012b).D(), s());
        }
    }

    @Override // me.t1
    public int r(View view) {
        switch (this.f24011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f24012b;
                return sideSheetBehavior.f20554l + sideSheetBehavior.f20557o;
            default:
                return super.r(view);
        }
    }

    @Override // me.t1
    public int s() {
        switch (this.f24011a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f24012b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.s();
        }
    }

    @Override // me.t1
    public final void z(int i4) {
        switch (this.f24011a) {
            case 0:
                if (i4 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f24012b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
            default:
                if (i4 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f24012b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.K(1);
                        break;
                    }
                }
                break;
        }
    }
}
