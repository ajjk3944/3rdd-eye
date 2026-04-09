package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import n.MenuC2677k;
import n.SubMenuC2666C;

/* loaded from: classes.dex */
public final class d1 implements n.w {

    /* renamed from: a, reason: collision with root package name */
    public MenuC2677k f22502a;

    /* renamed from: b, reason: collision with root package name */
    public n.m f22503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f22504c;

    public d1(Toolbar toolbar) {
        this.f22504c = toolbar;
    }

    @Override // n.w
    public final void b(boolean z6) {
        if (this.f22503b != null) {
            MenuC2677k menuC2677k = this.f22502a;
            if (menuC2677k != null) {
                int size = menuC2677k.f22081f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f22502a.getItem(i) == this.f22503b) {
                        return;
                    }
                }
            }
            m(this.f22503b);
        }
    }

    @Override // n.w
    public final void d(Context context, MenuC2677k menuC2677k) {
        n.m mVar;
        MenuC2677k menuC2677k2 = this.f22502a;
        if (menuC2677k2 != null && (mVar = this.f22503b) != null) {
            menuC2677k2.d(mVar);
        }
        this.f22502a = menuC2677k;
    }

    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) {
        return false;
    }

    @Override // n.w
    public final boolean f() {
        return false;
    }

    @Override // n.w
    public final int getId() {
        return 0;
    }

    @Override // n.w
    public final boolean j(n.m mVar) {
        Toolbar toolbar = this.f22504c;
        toolbar.c();
        ViewParent parent = toolbar.f5018h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f5018h);
            }
            toolbar.addView(toolbar.f5018h);
        }
        View actionView = mVar.getActionView();
        toolbar.i = actionView;
        this.f22503b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            e1 e1VarH = Toolbar.h();
            e1VarH.f22505a = (toolbar.f5027n & 112) | 8388611;
            e1VarH.f22506b = 2;
            toolbar.i.setLayoutParams(e1VarH);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e1) childAt.getLayoutParams()).f22506b != 2 && childAt != toolbar.f5005a) {
                toolbar.removeViewAt(childCount);
                toolbar.f5000S.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.f22105Q = true;
        mVar.f22118n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof m.b) {
            ((m.b) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // n.w
    public final Parcelable k() {
        return null;
    }

    @Override // n.w
    public final boolean m(n.m mVar) {
        Toolbar toolbar = this.f22504c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof m.b) {
            ((m.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.f5018h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f5000S;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f22503b = null;
        toolbar.requestLayout();
        mVar.f22105Q = false;
        mVar.f22118n.p(false);
        toolbar.v();
        return true;
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
    }
}
