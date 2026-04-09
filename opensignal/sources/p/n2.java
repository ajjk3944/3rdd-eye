package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n2 implements o.y {

    /* renamed from: a, reason: collision with root package name */
    public o.m f20120a;

    /* renamed from: d, reason: collision with root package name */
    public o.o f20121d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f20122g;

    public n2(Toolbar toolbar) {
        this.f20122g = toolbar;
    }

    @Override // o.y
    public final void b(boolean z10) {
        if (this.f20121d != null) {
            o.m mVar = this.f20120a;
            if (mVar != null) {
                int size = mVar.f18618f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f20120a.getItem(i10) == this.f20121d) {
                        return;
                    }
                }
            }
            m(this.f20121d);
        }
    }

    @Override // o.y
    public final void d(Context context, o.m mVar) {
        o.o oVar;
        o.m mVar2 = this.f20120a;
        if (mVar2 != null && (oVar = this.f20121d) != null) {
            mVar2.d(oVar);
        }
        this.f20120a = mVar;
    }

    @Override // o.y
    public final boolean e() {
        return false;
    }

    @Override // o.y
    public final boolean f(o.e0 e0Var) {
        return false;
    }

    @Override // o.y
    public final int getId() {
        return 0;
    }

    @Override // o.y
    public final boolean i(o.o oVar) {
        Toolbar toolbar = this.f20122g;
        toolbar.c();
        ViewParent parent = toolbar.D.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.D);
            }
            toolbar.addView(toolbar.D);
        }
        View actionView = oVar.getActionView();
        toolbar.E = actionView;
        this.f20121d = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.E);
            }
            o2 o2VarH = Toolbar.h();
            o2VarH.f20128a = (toolbar.J & 112) | 8388611;
            o2VarH.f20129b = 2;
            toolbar.E.setLayoutParams(o2VarH);
            toolbar.addView(toolbar.E);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((o2) childAt.getLayoutParams()).f20129b != 2 && childAt != toolbar.f1011a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1016d0.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f18649n.p(false);
        KeyEvent.Callback callback = toolbar.E;
        if (callback instanceof n.b) {
            ((o.q) ((n.b) callback)).f18664a.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // o.y
    public final Parcelable l() {
        return null;
    }

    @Override // o.y
    public final boolean m(o.o oVar) {
        Toolbar toolbar = this.f20122g;
        KeyEvent.Callback callback = toolbar.E;
        if (callback instanceof n.b) {
            ((o.q) ((n.b) callback)).f18664a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.E);
        toolbar.removeView(toolbar.D);
        toolbar.E = null;
        ArrayList arrayList = toolbar.f1016d0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f20121d = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f18649n.p(false);
        toolbar.v();
        return true;
    }

    @Override // o.y
    public final void h(Parcelable parcelable) {
    }

    @Override // o.y
    public final void c(o.m mVar, boolean z10) {
    }
}
