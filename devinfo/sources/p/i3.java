package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i3 implements o.y {

    /* renamed from: a, reason: collision with root package name */
    public o.m f30716a;

    /* renamed from: b, reason: collision with root package name */
    public o.o f30717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f30718c;

    public i3(Toolbar toolbar) {
        this.f30718c = toolbar;
    }

    @Override // o.y
    public final void b(Context context, o.m mVar) {
        o.o oVar;
        o.m mVar2 = this.f30716a;
        if (mVar2 != null && (oVar = this.f30717b) != null) {
            mVar2.d(oVar);
        }
        this.f30716a = mVar;
    }

    @Override // o.y
    public final boolean c() {
        return false;
    }

    @Override // o.y
    public final boolean d(o.e0 e0Var) {
        return false;
    }

    @Override // o.y
    public final void f() {
        if (this.f30717b != null) {
            o.m mVar = this.f30716a;
            if (mVar != null) {
                int size = mVar.f30243f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f30716a.getItem(i4) == this.f30717b) {
                        return;
                    }
                }
            }
            j(this.f30717b);
        }
    }

    @Override // o.y
    public final boolean g(o.o oVar) {
        Toolbar toolbar = this.f30718c;
        toolbar.c();
        ViewParent parent = toolbar.f824h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f824h);
            }
            toolbar.addView(toolbar.f824h);
        }
        View actionView = oVar.getActionView();
        toolbar.f825i = actionView;
        this.f30717b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f825i);
            }
            j3 j3VarH = Toolbar.h();
            j3VarH.f30723a = (toolbar.f829n & AppLovinMediationAdapter.ERROR_CHILD_USER) | 8388611;
            j3VarH.f30724b = 2;
            toolbar.f825i.setLayoutParams(j3VarH);
            toolbar.addView(toolbar.f825i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j3) childAt.getLayoutParams()).f30724b != 2 && childAt != toolbar.f818a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f30274n.p(false);
        KeyEvent.Callback callback = toolbar.f825i;
        if (callback instanceof n.b) {
            ((n.b) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // o.y
    public final boolean j(o.o oVar) {
        Toolbar toolbar = this.f30718c;
        KeyEvent.Callback callback = toolbar.f825i;
        if (callback instanceof n.b) {
            ((n.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f825i);
        toolbar.removeView(toolbar.f824h);
        toolbar.f825i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f30717b = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f30274n.p(false);
        toolbar.v();
        return true;
    }

    @Override // o.y
    public final void e(o.m mVar, boolean z3) {
    }
}
