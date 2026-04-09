package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class u implements c0, y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f30297a;

    public static int l(ListAdapter listAdapter, Context context, int i4) {
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
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    @Override // o.y
    public final boolean g(o oVar) {
        return false;
    }

    @Override // o.y
    public final boolean j(o oVar) {
        return false;
    }

    public abstract void k(m mVar);

    public abstract void m(View view);

    public abstract void n(boolean z3);

    public abstract void o(int i4);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (j) listAdapter).f30231a.q((MenuItem) listAdapter.getItem(i4), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(int i4);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z3);

    public abstract void s(int i4);

    @Override // o.y
    public final void b(Context context, m mVar) {
    }
}
