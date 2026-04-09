package i;

import a0.x0;
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
import com.liuzh.deviceinfo.R;
import e4.c1;
import e4.k0;
import e4.v0;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f25340a;

    /* renamed from: b, reason: collision with root package name */
    public o7.d f25341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25342c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25343d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f25345f;

    public r(v vVar, Window.Callback callback) {
        this.f25345f = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f25340a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f25342c = true;
            callback.onContentChanged();
        } finally {
            this.f25342c = false;
        }
    }

    public final boolean b(int i4, Menu menu) {
        return this.f25340a.onMenuOpened(i4, menu);
    }

    public final void c(int i4, Menu menu) {
        this.f25340a.onPanelClosed(i4, menu);
    }

    public final void d(List list, Menu menu, int i4) {
        n.l.a(this.f25340a, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f25340a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f25343d;
        Window.Callback callback = this.f25340a;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f25345f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f25340a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            v vVar = this.f25345f;
            vVar.C();
            wd.b bVar = vVar.f25378o;
            if (bVar == null || !bVar.F(keyCode, keyEvent)) {
                u uVar = vVar.M;
                if (uVar == null || !vVar.H(uVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (vVar.M == null) {
                        u uVarB = vVar.B(0);
                        vVar.I(uVarB, keyEvent);
                        boolean zH = vVar.H(uVarB, keyEvent.getKeyCode(), keyEvent);
                        uVarB.f25358k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                u uVar2 = vVar.M;
                if (uVar2 != null) {
                    uVar2.f25359l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f25340a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f25340a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f25340a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f25340a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f25340a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f25340a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f25342c) {
            this.f25340a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0 || (menu instanceof o.m)) {
            return this.f25340a.onCreatePanelMenu(i4, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        o7.d dVar = this.f25341b;
        if (dVar != null) {
            View view = i4 == 0 ? new View(((d0) dVar.f30421b).f25276b.f30779a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f25340a.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f25340a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f25340a.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        b(i4, menu);
        v vVar = this.f25345f;
        if (i4 == 108) {
            vVar.C();
            wd.b bVar = vVar.f25378o;
            if (bVar != null) {
                bVar.m(true);
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        if (this.f25344e) {
            this.f25340a.onPanelClosed(i4, menu);
            return;
        }
        c(i4, menu);
        v vVar = this.f25345f;
        if (i4 == 108) {
            vVar.C();
            wd.b bVar = vVar.f25378o;
            if (bVar != null) {
                bVar.m(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            u uVarB = vVar.B(i4);
            if (uVarB.f25360m) {
                vVar.t(uVarB, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        n.m.a(this.f25340a, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        o.m mVar = menu instanceof o.m ? (o.m) menu : null;
        if (i4 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f30259x = true;
        }
        o7.d dVar = this.f25341b;
        if (dVar != null && i4 == 0) {
            d0 d0Var = (d0) dVar.f30421b;
            if (!d0Var.f25279e) {
                d0Var.f25276b.f30788l = true;
                d0Var.f25279e = true;
            }
        }
        boolean zOnPreparePanel = this.f25340a.onPreparePanel(i4, view, menu);
        if (mVar != null) {
            mVar.f30259x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        o.m mVar = this.f25345f.B(0).f25356h;
        if (mVar != null) {
            d(list, mVar, i4);
        } else {
            d(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f25340a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f25340a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f25340a.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        ViewGroup viewGroup;
        if (i4 != 0) {
            return n.k.b(this.f25340a, callback, i4);
        }
        v vVar = this.f25345f;
        Context context = vVar.f25374k;
        x0 x0Var = new x0(context, callback);
        n.a aVar = vVar.f25384u;
        if (aVar != null) {
            aVar.d();
        }
        yb.i iVar = new yb.i(22, vVar, x0Var);
        vVar.C();
        wd.b bVar = vVar.f25378o;
        if (bVar != null) {
            vVar.f25384u = bVar.U(iVar);
        }
        if (vVar.f25384u == null) {
            c1 c1Var = vVar.f25388y;
            if (c1Var != null) {
                c1Var.b();
            }
            n.a aVar2 = vVar.f25384u;
            if (aVar2 != null) {
                aVar2.d();
            }
            int i10 = 1;
            if (vVar.f25385v == null) {
                if (vVar.I) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        n.c cVar = new n.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    vVar.f25385v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    vVar.f25386w = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    vVar.f25386w.setContentView(vVar.f25385v);
                    vVar.f25386w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    vVar.f25385v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    vVar.f25386w.setHeight(-2);
                    vVar.f25387x = new m(vVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vVar.A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        vVar.C();
                        wd.b bVar2 = vVar.f25378o;
                        Context contextV = bVar2 != null ? bVar2.v() : null;
                        if (contextV != null) {
                            context = contextV;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        vVar.f25385v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vVar.f25385v != null) {
                c1 c1Var2 = vVar.f25388y;
                if (c1Var2 != null) {
                    c1Var2.b();
                }
                vVar.f25385v.e();
                Context context2 = vVar.f25385v.getContext();
                ActionBarContextView actionBarContextView = vVar.f25385v;
                n.d dVar = new n.d();
                dVar.f29447d = context2;
                dVar.f29448e = actionBarContextView;
                dVar.f29449f = iVar;
                o.m mVar = new o.m(actionBarContextView.getContext());
                mVar.f30247l = 1;
                dVar.f29451i = mVar;
                mVar.f30242e = dVar;
                if (x0Var.H(dVar, mVar)) {
                    dVar.k();
                    vVar.f25385v.c(dVar);
                    vVar.f25384u = dVar;
                    if (vVar.f25389z && (viewGroup = vVar.A) != null && viewGroup.isLaidOut()) {
                        vVar.f25385v.setAlpha(0.0f);
                        c1 c1VarB = v0.b(vVar.f25385v);
                        c1VarB.a(1.0f);
                        vVar.f25388y = c1VarB;
                        c1VarB.d(new n(i10, vVar));
                    } else {
                        vVar.f25385v.setAlpha(1.0f);
                        vVar.f25385v.setVisibility(0);
                        if (vVar.f25385v.getParent() instanceof View) {
                            View view = (View) vVar.f25385v.getParent();
                            WeakHashMap weakHashMap = v0.f22405a;
                            k0.c(view);
                        }
                    }
                    if (vVar.f25386w != null) {
                        vVar.f25375l.getDecorView().post(vVar.f25387x);
                    }
                } else {
                    vVar.f25384u = null;
                }
            }
            vVar.K();
            vVar.f25384u = vVar.f25384u;
        }
        vVar.K();
        n.a aVar3 = vVar.f25384u;
        if (aVar3 != null) {
            return x0Var.y(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f25340a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
