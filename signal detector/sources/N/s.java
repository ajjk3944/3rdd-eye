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

/* loaded from: classes.dex */
public abstract class s implements InterfaceC2664A, w, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f22129a;

    public static int o(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    @Override // n.w
    public final int getId() {
        return 0;
    }

    @Override // n.w
    public final boolean j(m mVar) {
        return false;
    }

    @Override // n.w
    public final boolean m(m mVar) {
        return false;
    }

    public abstract void n(MenuC2677k menuC2677k);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C2674h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C2674h) listAdapter).f22060a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC2671e) ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z6);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z6);

    public abstract void v(int i);

    @Override // n.w
    public final void d(Context context, MenuC2677k menuC2677k) {
    }
}
