package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class x1 extends i1 {
    public final int I;
    public final int J;
    public u1 K;
    public o.o L;

    public x1(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.I = 21;
            this.J = 22;
        } else {
            this.I = 22;
            this.J = 21;
        }
    }

    @Override // p.i1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.j jVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.K != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jVar = (o.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (o.j) adapter;
                headersCount = 0;
            }
            o.o oVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= jVar.getCount()) ? null : jVar.getItem(i10);
            o.o oVar = this.L;
            if (oVar != oVarB) {
                o.m mVar = jVar.f18606a;
                if (oVar != null) {
                    this.K.c(mVar, oVar);
                }
                this.L = oVarB;
                if (oVarB != null) {
                    this.K.i(mVar, oVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.I) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.J) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o.j) adapter).f18606a.c(false);
        return true;
    }

    public void setHoverListener(u1 u1Var) {
        this.K = u1Var;
    }

    @Override // p.i1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
