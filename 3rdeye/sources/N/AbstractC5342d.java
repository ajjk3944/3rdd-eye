package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

/* compiled from: MenuPopup.java */
/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5342d implements InterfaceC5344f, j, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Rect f44187b;

    public static int l(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public static boolean t(androidx.appcompat.view.menu.f fVar) {
        int size = fVar.f14436f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = fVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(h hVar) {
        return false;
    }

    public abstract void k(androidx.appcompat.view.menu.f fVar);

    public abstract void m(View view);

    public abstract void n(boolean z10);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.e) listAdapter).f14424b.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof androidx.appcompat.view.menu.b) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z10);

    public abstract void s(int i);

    @Override // androidx.appcompat.view.menu.j
    public final void f(Context context, androidx.appcompat.view.menu.f fVar) {
    }
}
