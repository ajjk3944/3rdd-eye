package i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;

/* loaded from: classes.dex */
public abstract class d implements f, h, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f21521a;

    public static int p(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean y(androidx.appcompat.view.menu.d dVar) {
        int size = dVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = dVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.c z(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.c) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.c) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean c(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.f fVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean j(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.f fVar) {
        return false;
    }

    public abstract void l(androidx.appcompat.view.menu.d dVar);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.f21521a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        z(listAdapter).f706a.P((MenuItem) listAdapter.getItem(i10), this, m() ? 0 : 4);
    }

    public abstract void q(View view);

    public void r(Rect rect) {
        this.f21521a = rect;
    }

    public abstract void s(boolean z10);

    public abstract void t(int i10);

    public abstract void u(int i10);

    public abstract void v(PopupWindow.OnDismissListener onDismissListener);

    public abstract void w(boolean z10);

    public abstract void x(int i10);

    @Override // androidx.appcompat.view.menu.h
    public void k(Context context, androidx.appcompat.view.menu.d dVar) {
    }
}
