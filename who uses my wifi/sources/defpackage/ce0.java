package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ce0 extends kq {
    public final int r;
    public final int s;
    public rd0 t;
    public sd0 u;

    public ce0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.kq, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ld0 ld0Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ld0Var = (ld0) headerViewListAdapter.getWrappedAdapter();
            } else {
                ld0Var = (ld0) adapter;
                headersCount = 0;
            }
            sd0 sd0VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ld0Var.getCount()) ? null : ld0Var.getItem(i);
            sd0 sd0Var = this.u;
            if (sd0Var != sd0VarB) {
                od0 od0Var = ld0Var.f;
                if (sd0Var != null) {
                    this.t.i(od0Var, sd0Var);
                }
                this.u = sd0VarB;
                if (sd0VarB != null) {
                    this.t.l(od0Var, sd0VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ld0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ld0) adapter).f.c(false);
        return true;
    }

    public void setHoverListener(rd0 rd0Var) {
        this.t = rd0Var;
    }

    @Override // defpackage.kq, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
