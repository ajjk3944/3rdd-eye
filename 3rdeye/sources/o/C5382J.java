package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.b;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* renamed from: o.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5382J extends C5380H implements InterfaceC5381I {

    /* renamed from: F, reason: collision with root package name */
    public static final Method f44561F;

    /* renamed from: E, reason: collision with root package name */
    public b.c f44562E;

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: o.J$a */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: o.J$b */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: o.J$c */
    public static class c extends C5376D {

        /* renamed from: n, reason: collision with root package name */
        public final int f44563n;

        /* renamed from: o, reason: collision with root package name */
        public final int f44564o;

        /* renamed from: p, reason: collision with root package name */
        public InterfaceC5381I f44565p;

        /* renamed from: q, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f44566q;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f44563n = 21;
                this.f44564o = 22;
            } else {
                this.f44563n = 22;
                this.f44564o = 21;
            }
        }

        @Override // o.C5376D, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f44565p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= eVar.getCount()) ? null : eVar.getItem(i);
                androidx.appcompat.view.menu.h hVar = this.f44566q;
                if (hVar != item) {
                    androidx.appcompat.view.menu.f fVar = eVar.f14424b;
                    if (hVar != null) {
                        this.f44565p.n(fVar, hVar);
                    }
                    this.f44566q = item;
                    if (item != null) {
                        this.f44565p.d(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f44563n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f44564o) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.e) adapter).f14424b.c(false);
            return true;
        }

        public void setHoverListener(InterfaceC5381I interfaceC5381I) {
            this.f44565p = interfaceC5381I;
        }

        @Override // o.C5376D, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f44561F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.InterfaceC5381I
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        b.c cVar = this.f44562E;
        if (cVar != null) {
            cVar.d(fVar, hVar);
        }
    }

    @Override // o.InterfaceC5381I
    public final void n(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        b.c cVar = this.f44562E;
        if (cVar != null) {
            cVar.n(fVar, hVar);
        }
    }

    @Override // o.C5380H
    public final C5376D p(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
