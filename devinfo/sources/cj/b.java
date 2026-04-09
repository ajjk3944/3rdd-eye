package cj;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.x1;
import java.lang.ref.SoftReference;
import jg.d;
import jg.g;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends j1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public g f2890a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f2891b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f2892c;

    /* renamed from: d, reason: collision with root package name */
    public SoftReference f2893d;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.f2892c
            r1 = 0
            java.lang.String r2 = "headerContainer"
            if (r0 == 0) goto L2b
            jg.g r3 = r4.f2890a
            if (r3 == 0) goto L25
            jg.d r3 = r3.f27664d
            if (r3 == 0) goto L20
            if (r0 == 0) goto L1c
            float r1 = r0.getTranslationY()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L20
            r1 = 0
            goto L21
        L1c:
            nk.k.k(r2)
            throw r1
        L20:
            r1 = 4
        L21:
            r0.setVisibility(r1)
            return
        L25:
            java.lang.String r0 = "stickyHeader"
            nk.k.k(r0)
            throw r1
        L2b:
            nk.k.k(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.b.a():void");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        x1 x1Var;
        View view;
        SoftReference softReference = this.f2893d;
        if (softReference == null || (x1Var = (x1) softReference.get()) == null || (view = x1Var.itemView) == null) {
            return true;
        }
        int top = view.getTop();
        FrameLayout frameLayout = this.f2892c;
        if (frameLayout == null) {
            k.k("headerContainer");
            throw null;
        }
        if (top < frameLayout.getPaddingTop()) {
            return true;
        }
        FrameLayout frameLayout2 = this.f2892c;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(4);
            return true;
        }
        k.k("headerContainer");
        throw null;
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        if (i4 == 0) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(this);
        } else {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onScrolled(RecyclerView recyclerView, int i4, int i10) {
        x1 x1VarO;
        boolean z3;
        x1 x1VarO2;
        if (i10 == 0) {
            return;
        }
        if (this.f2892c == null) {
            k.k("headerContainer");
            throw null;
        }
        float width = r8.getWidth() / 2.0f;
        if (this.f2892c == null) {
            k.k("headerContainer");
            throw null;
        }
        View viewE = recyclerView.E(width, r2.getPaddingTop());
        if (viewE == null || (x1VarO = recyclerView.O(viewE)) == null) {
            return;
        }
        if (x1VarO.getBindingAdapterPosition() == 0 && viewE.getTop() == 0) {
            SoftReference softReference = this.f2893d;
            if (softReference != null) {
                softReference.clear();
            }
            g gVar = this.f2890a;
            if (gVar == null) {
                k.k("stickyHeader");
                throw null;
            }
            gVar.b(null);
            a();
            return;
        }
        SoftReference softReference2 = this.f2893d;
        if (x1VarO.equals(softReference2 != null ? (x1) softReference2.get() : null)) {
            z3 = true;
        } else {
            SoftReference softReference3 = this.f2893d;
            if (softReference3 != null) {
                softReference3.clear();
            }
            this.f2893d = new SoftReference(x1VarO);
            g gVar2 = this.f2890a;
            if (gVar2 == null) {
                k.k("stickyHeader");
                throw null;
            }
            gVar2.b(x1VarO);
            z3 = false;
        }
        FrameLayout frameLayout = this.f2892c;
        if (frameLayout == null) {
            k.k("headerContainer");
            throw null;
        }
        int visibility = frameLayout.getVisibility();
        a();
        if (z3) {
            FrameLayout frameLayout2 = this.f2892c;
            if (frameLayout2 == null) {
                k.k("headerContainer");
                throw null;
            }
            if (visibility != frameLayout2.getVisibility()) {
                g gVar3 = this.f2890a;
                if (gVar3 == null) {
                    k.k("stickyHeader");
                    throw null;
                }
                if (this.f2892c == null) {
                    k.k("headerContainer");
                    throw null;
                }
                gVar3.a();
            }
        }
        if (this.f2892c == null) {
            k.k("headerContainer");
            throw null;
        }
        float width2 = r8.getWidth() / 2.0f;
        FrameLayout frameLayout3 = this.f2892c;
        if (frameLayout3 == null) {
            k.k("headerContainer");
            throw null;
        }
        float paddingTop = frameLayout3.getPaddingTop();
        if (this.f2891b == null) {
            k.k("headerView");
            throw null;
        }
        View viewE2 = recyclerView.E(width2, (r2.getHeight() * 1.0f) + paddingTop);
        if (viewE2 == null || (x1VarO2 = recyclerView.O(viewE2)) == null) {
            return;
        }
        if (this.f2890a == null) {
            k.k("stickyHeader");
            throw null;
        }
        if (!(x1VarO2 instanceof jg.b ? ((jg.b) x1VarO2).f27648e instanceof d : false)) {
            FrameLayout frameLayout4 = this.f2892c;
            if (frameLayout4 != null) {
                frameLayout4.setTranslationY(0.0f);
                return;
            } else {
                k.k("headerContainer");
                throw null;
            }
        }
        FrameLayout frameLayout5 = this.f2892c;
        if (frameLayout5 == null) {
            k.k("headerContainer");
            throw null;
        }
        float top = viewE2.getTop();
        if (this.f2892c != null) {
            frameLayout5.setTranslationY(top - r1.getHeight());
        } else {
            k.k("headerContainer");
            throw null;
        }
    }
}
