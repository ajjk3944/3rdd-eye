package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b6 implements Window.Callback {
    public final Window.Callback f;
    public zs1 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ h6 k;

    public b6(h6 h6Var, Window.Callback callback) {
        this.k = h6Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.h = true;
            callback.onContentChanged();
        } finally {
            this.h = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        o81.a(this.f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.i;
        Window.Callback callback = this.f;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.k.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            h6 h6Var = this.k;
            h6Var.A();
            m54 m54Var = h6Var.t;
            if (m54Var == null || !m54Var.u(keyCode, keyEvent)) {
                g6 g6Var = h6Var.R;
                if (g6Var == null || !h6Var.F(g6Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (h6Var.R == null) {
                        g6 g6VarZ = h6Var.z(0);
                        h6Var.G(g6VarZ, keyEvent);
                        boolean zF = h6Var.F(g6VarZ, keyEvent.getKeyCode(), keyEvent);
                        g6VarZ.k = false;
                        if (zF) {
                        }
                    }
                    return false;
                }
                g6 g6Var2 = h6Var.R;
                if (g6Var2 != null) {
                    g6Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.h) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof od0)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        zs1 zs1Var = this.g;
        if (zs1Var != null) {
            View view = i == 0 ? new View(((f21) zs1Var.g).g.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i, menu);
        h6 h6Var = this.k;
        if (i == 108) {
            h6Var.A();
            m54 m54Var = h6Var.t;
            if (m54Var != null) {
                m54Var.d(true);
            }
        } else {
            h6Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.j) {
            this.f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        h6 h6Var = this.k;
        if (i == 108) {
            h6Var.A();
            m54 m54Var = h6Var.t;
            if (m54Var != null) {
                m54Var.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            g6 g6VarZ = h6Var.z(i);
            if (g6VarZ.m) {
                h6Var.s(g6VarZ, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        p81.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        od0 od0Var = menu instanceof od0 ? (od0) menu : null;
        if (i == 0 && od0Var == null) {
            return false;
        }
        if (od0Var != null) {
            od0Var.x = true;
        }
        zs1 zs1Var = this.g;
        if (zs1Var != null && i == 0) {
            f21 f21Var = (f21) zs1Var.g;
            if (!f21Var.j) {
                f21Var.g.l = true;
                f21Var.j = true;
            }
        }
        boolean zOnPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (od0Var != null) {
            od0Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        od0 od0Var = this.k.z(0).h;
        if (od0Var != null) {
            d(list, od0Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n81.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (i != 0) {
            return n81.b(this.f, callback, i);
        }
        h6 h6Var = this.k;
        Context context = h6Var.p;
        p21 p21Var = new p21();
        p21Var.g = context;
        p21Var.f = callback;
        p21Var.h = new ArrayList();
        boolean z = false;
        p21Var.i = new bw0(0);
        c2 c2Var = h6Var.z;
        if (c2Var != null) {
            c2Var.a();
        }
        vq2 vq2Var = new vq2(h6Var, p21Var, 3, z);
        h6Var.A();
        m54 m54Var = h6Var.t;
        if (m54Var != null) {
            h6Var.z = m54Var.B(vq2Var);
        }
        if (h6Var.z == null) {
            w61 w61Var = h6Var.D;
            if (w61Var != null) {
                w61Var.b();
            }
            c2 c2Var2 = h6Var.z;
            if (c2Var2 != null) {
                c2Var2.a();
            }
            int i2 = 1;
            if (h6Var.A == null) {
                if (h6Var.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        nj njVar = new nj(context, 0);
                        njVar.getTheme().setTo(themeNewTheme);
                        context = njVar;
                    }
                    h6Var.A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    h6Var.B = popupWindow;
                    jl0.d(popupWindow, 2);
                    h6Var.B.setContentView(h6Var.A);
                    h6Var.B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    h6Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    h6Var.B.setHeight(-2);
                    h6Var.C = new v5(h6Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) h6Var.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        h6Var.A();
                        m54 m54Var2 = h6Var.t;
                        Context contextP = m54Var2 != null ? m54Var2.p() : null;
                        if (contextP != null) {
                            context = contextP;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        h6Var.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (h6Var.A != null) {
                w61 w61Var2 = h6Var.D;
                if (w61Var2 != null) {
                    w61Var2.b();
                }
                h6Var.A.e();
                Context context2 = h6Var.A.getContext();
                ActionBarContextView actionBarContextView = h6Var.A;
                ux0 ux0Var = new ux0();
                ux0Var.h = context2;
                ux0Var.i = actionBarContextView;
                ux0Var.j = vq2Var;
                od0 od0Var = new od0(actionBarContextView.getContext());
                od0Var.l = 1;
                ux0Var.m = od0Var;
                od0Var.e = ux0Var;
                if (p21Var.w(ux0Var, od0Var)) {
                    ux0Var.h();
                    h6Var.A.c(ux0Var);
                    h6Var.z = ux0Var;
                    if (h6Var.E && (viewGroup = h6Var.F) != null && viewGroup.isLaidOut()) {
                        h6Var.A.setAlpha(0.0f);
                        w61 w61VarA = e61.a(h6Var.A);
                        w61VarA.a(1.0f);
                        h6Var.D = w61VarA;
                        w61VarA.d(new w5(i2, h6Var));
                    } else {
                        h6Var.A.setAlpha(1.0f);
                        h6Var.A.setVisibility(0);
                        if (h6Var.A.getParent() instanceof View) {
                            View view = (View) h6Var.A.getParent();
                            WeakHashMap weakHashMap = e61.a;
                            r51.c(view);
                        }
                    }
                    if (h6Var.B != null) {
                        h6Var.q.getDecorView().post(h6Var.C);
                    }
                } else {
                    h6Var.z = null;
                }
            }
            h6Var.I();
            h6Var.z = h6Var.z;
        }
        h6Var.I();
        c2 c2Var3 = h6Var.z;
        if (c2Var3 != null) {
            return p21Var.k(c2Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
