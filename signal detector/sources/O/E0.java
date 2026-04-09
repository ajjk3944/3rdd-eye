package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import n.C2674h;
import n.MenuC2677k;

/* loaded from: classes.dex */
public final class E0 extends C2732p0 {

    /* renamed from: C, reason: collision with root package name */
    public B0 f22369C;

    /* renamed from: D, reason: collision with root package name */
    public n.m f22370D;

    /* renamed from: m, reason: collision with root package name */
    public final int f22371m;

    /* renamed from: n, reason: collision with root package name */
    public final int f22372n;

    public E0(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f22371m = 21;
            this.f22372n = 22;
        } else {
            this.f22371m = 22;
            this.f22372n = 21;
        }
    }

    @Override // o.C2732p0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2674h c2674h;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f22369C != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c2674h = (C2674h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2674h = (C2674h) adapter;
                headersCount = 0;
            }
            n.m mVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c2674h.getCount()) ? null : c2674h.getItem(i);
            n.m mVar = this.f22370D;
            if (mVar != mVarB) {
                MenuC2677k menuC2677k = c2674h.f22060a;
                if (mVar != null) {
                    this.f22369C.c(menuC2677k, mVar);
                }
                this.f22370D = mVarB;
                if (mVarB != null) {
                    this.f22369C.p(menuC2677k, mVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f22371m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f22372n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C2674h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C2674h) adapter).f22060a.c(false);
        return true;
    }

    public void setHoverListener(B0 b0) {
        this.f22369C = b0;
    }

    @Override // o.C2732p0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
