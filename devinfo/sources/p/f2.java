package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f2 extends p1 {

    /* renamed from: m, reason: collision with root package name */
    public final int f30690m;

    /* renamed from: n, reason: collision with root package name */
    public final int f30691n;

    /* renamed from: o, reason: collision with root package name */
    public c2 f30692o;

    /* renamed from: p, reason: collision with root package name */
    public o.o f30693p;

    public f2(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f30690m = 21;
            this.f30691n = 22;
        } else {
            this.f30690m = 22;
            this.f30691n = 21;
        }
    }

    @Override // p.p1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.j jVar;
        int headersCount;
        int iPointToPosition;
        int i4;
        if (this.f30692o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jVar = (o.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (o.j) adapter;
                headersCount = 0;
            }
            o.o oVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = iPointToPosition - headersCount) < 0 || i4 >= jVar.getCount()) ? null : jVar.getItem(i4);
            o.o oVar = this.f30693p;
            if (oVar != oVarB) {
                o.m mVar = jVar.f30231a;
                if (oVar != null) {
                    this.f30692o.e(mVar, oVar);
                }
                this.f30693p = oVarB;
                if (oVarB != null) {
                    this.f30692o.g(mVar, oVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f30690m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f30691n) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o.j) adapter).f30231a.c(false);
        return true;
    }

    public void setHoverListener(c2 c2Var) {
        this.f30692o = c2Var;
    }

    @Override // p.p1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
