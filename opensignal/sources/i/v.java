package i;

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
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f11110a;

    /* renamed from: d, reason: collision with root package name */
    public g0 f11111d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11112g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11113r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11114x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a0 f11115y;

    public v(a0 a0Var, Window.Callback callback) {
        this.f11115y = a0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f11110a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f11112g = true;
            callback.onContentChanged();
        } finally {
            this.f11112g = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f11110a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f11110a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        n.l.a(this.f11110a, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11110a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f11113r;
        Window.Callback callback = this.f11110a;
        return z10 ? callback.dispatchKeyEvent(keyEvent) : this.f11115y.s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.f11110a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            a0 a0Var = this.f11115y;
            a0Var.y();
            xu.l lVar = a0Var.K;
            if (lVar == null || !lVar.L(keyCode, keyEvent)) {
                z zVar = a0Var.f10972i0;
                if (zVar == null || !a0Var.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (a0Var.f10972i0 == null) {
                        z zVarX = a0Var.x(0);
                        a0Var.F(zVarX, keyEvent);
                        boolean zE = a0Var.E(zVarX, keyEvent.getKeyCode(), keyEvent);
                        zVarX.k = false;
                        if (zE) {
                        }
                    }
                    return false;
                }
                z zVar2 = a0Var.f10972i0;
                if (zVar2 != null) {
                    zVar2.f11130l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f11110a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11110a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11110a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f11110a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f11110a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f11110a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f11112g) {
            this.f11110a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof o.m)) {
            return this.f11110a.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        g0 g0Var = this.f11111d;
        if (g0Var != null) {
            View view = i10 == 0 ? new View(((h0) g0Var.f11051a).f11054c.f20152a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f11110a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f11110a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f11110a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i10, menu);
        a0 a0Var = this.f11115y;
        if (i10 == 108) {
            a0Var.y();
            xu.l lVar = a0Var.K;
            if (lVar != null) {
                lVar.n(true);
            }
        } else {
            a0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f11114x) {
            this.f11110a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        a0 a0Var = this.f11115y;
        if (i10 == 108) {
            a0Var.y();
            xu.l lVar = a0Var.K;
            if (lVar != null) {
                lVar.n(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            z zVarX = a0Var.x(i10);
            if (zVarX.f11131m) {
                a0Var.q(zVarX, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        n.m.a(this.f11110a, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        o.m mVar = menu instanceof o.m ? (o.m) menu : null;
        if (i10 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f18634x = true;
        }
        g0 g0Var = this.f11111d;
        if (g0Var != null && i10 == 0) {
            h0 h0Var = (h0) g0Var.f11051a;
            if (!h0Var.f11057f) {
                h0Var.f11054c.f20161l = true;
                h0Var.f11057f = true;
            }
        }
        boolean zOnPreparePanel = this.f11110a.onPreparePanel(i10, view, menu);
        if (mVar != null) {
            mVar.f18634x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        o.m mVar = this.f11115y.x(0).f11128h;
        if (mVar != null) {
            d(list, mVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f11110a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11110a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f11110a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (i10 != 0) {
            return n.k.b(this.f11110a, callback, i10);
        }
        a0 a0Var = this.f11115y;
        Context context = a0Var.G;
        js.e eVar = new js.e(context, callback);
        n.a aVar = a0Var.Q;
        if (aVar != null) {
            aVar.b();
        }
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(29, a0Var, eVar, false);
        a0Var.y();
        xu.l lVar = a0Var.K;
        if (lVar != null) {
            a0Var.Q = lVar.W(cVar);
        }
        if (a0Var.Q == null) {
            u3.l0 l0Var = a0Var.U;
            if (l0Var != null) {
                l0Var.b();
            }
            n.a aVar2 = a0Var.Q;
            if (aVar2 != null) {
                aVar2.b();
            }
            int i11 = 1;
            if (a0Var.R == null) {
                if (a0Var.f10968e0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(h.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        n.c cVar2 = new n.c(context, 0);
                        cVar2.getTheme().setTo(themeNewTheme);
                        context = cVar2;
                    }
                    a0Var.R = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, h.a.actionModePopupWindowStyle);
                    a0Var.S = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    a0Var.S.setContentView(a0Var.R);
                    a0Var.S.setWidth(-1);
                    context.getTheme().resolveAttribute(h.a.actionBarSize, typedValue, true);
                    a0Var.R.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    a0Var.S.setHeight(-2);
                    a0Var.T = new p(a0Var, i11);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) a0Var.W.findViewById(h.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        a0Var.y();
                        xu.l lVar2 = a0Var.K;
                        Context contextY = lVar2 != null ? lVar2.y() : null;
                        if (contextY != null) {
                            context = contextY;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        a0Var.R = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (a0Var.R != null) {
                u3.l0 l0Var2 = a0Var.U;
                if (l0Var2 != null) {
                    l0Var2.b();
                }
                a0Var.R.e();
                Context context2 = a0Var.R.getContext();
                ActionBarContextView actionBarContextView = a0Var.R;
                n.d dVar = new n.d();
                dVar.f17079r = context2;
                dVar.f17080x = actionBarContextView;
                dVar.f17081y = cVar;
                o.m mVar = new o.m(actionBarContextView.getContext());
                mVar.f18622l = 1;
                dVar.E = mVar;
                mVar.f18617e = dVar;
                if (eVar.m0(dVar, mVar)) {
                    dVar.i();
                    a0Var.R.c(dVar);
                    a0Var.Q = dVar;
                    if (a0Var.V && (viewGroup = a0Var.W) != null && viewGroup.isLaidOut()) {
                        a0Var.R.setAlpha(0.0f);
                        u3.l0 l0VarA = u3.i0.a(a0Var.R);
                        l0VarA.a(1.0f);
                        a0Var.U = l0VarA;
                        l0VarA.d(new r(i11, a0Var));
                    } else {
                        a0Var.R.setAlpha(1.0f);
                        a0Var.R.setVisibility(0);
                        if (a0Var.R.getParent() instanceof View) {
                            View view = (View) a0Var.R.getParent();
                            WeakHashMap weakHashMap = u3.i0.f23177a;
                            u3.x.c(view);
                        }
                    }
                    if (a0Var.S != null) {
                        a0Var.H.getDecorView().post(a0Var.T);
                    }
                } else {
                    a0Var.Q = null;
                }
            }
            a0Var.H();
            a0Var.Q = a0Var.Q;
        }
        a0Var.H();
        n.a aVar3 = a0Var.Q;
        if (aVar3 != null) {
            return eVar.V(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f11110a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
