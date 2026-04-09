package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class l0 extends j0 implements k0 {
    private static Method M;
    private k0 L;

    public static class a extends f0 {

        /* renamed from: p, reason: collision with root package name */
        final int f1035p;

        /* renamed from: q, reason: collision with root package name */
        final int f1036q;

        /* renamed from: r, reason: collision with root package name */
        private k0 f1037r;

        /* renamed from: s, reason: collision with root package name */
        private MenuItem f1038s;

        public a(Context context, boolean z2) {
            super(context, z2);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1035p = 22;
                this.f1036q = 21;
            } else {
                this.f1035p = 21;
                this.f1036q = 22;
            }
        }

        @Override // androidx.appcompat.widget.f0
        public /* bridge */ /* synthetic */ int d(int i2, int i3, int i4, int i5, int i6) {
            return super.d(i2, i3, i4, i5, i6);
        }

        @Override // androidx.appcompat.widget.f0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i2) {
            return super.e(motionEvent, i2);
        }

        @Override // androidx.appcompat.widget.f0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            int iPointToPosition;
            int i2;
            if (this.f1037r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) adapter;
                androidx.appcompat.view.menu.g item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = iPointToPosition - headersCount) >= 0 && i2 < dVar.getCount()) {
                    item = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f1038s;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f1037r.k(eVarB, menuItem);
                    }
                    this.f1038s = item;
                    if (item != null) {
                        this.f1037r.g(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1035p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.f1036q) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.d) getAdapter()).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.f0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(k0 k0Var) {
            this.f1037r = k0Var;
        }

        @Override // androidx.appcompat.widget.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.setEnterTransition((Transition) obj);
        }
    }

    public void O(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.setExitTransition((Transition) obj);
        }
    }

    public void P(k0 k0Var) {
        this.L = k0Var;
    }

    public void Q(boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.H.setTouchModal(z2);
            return;
        }
        Method method = M;
        if (method != null) {
            try {
                method.invoke(this.H, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void g(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.g(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void k(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.k(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.j0
    f0 s(Context context, boolean z2) {
        a aVar = new a(context, z2);
        aVar.setHoverListener(this);
        return aVar;
    }
}
