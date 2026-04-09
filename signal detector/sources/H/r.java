package h;

import R.O;
import R.S;
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
import com.apm.insight.R;
import h0.C2351a;
import java.util.List;
import java.util.WeakHashMap;
import n.MenuC2677k;

/* loaded from: classes.dex */
public final class r implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f20359a;

    /* renamed from: b, reason: collision with root package name */
    public d4.h f20360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20361c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20362d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f20364f;

    public r(v vVar, Window.Callback callback) {
        this.f20364f = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f20359a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f20361c = true;
            callback.onContentChanged();
        } finally {
            this.f20361c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f20359a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f20359a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        m.k.a(this.f20359a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f20359a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f20362d;
        Window.Callback callback = this.f20359a;
        return z6 ? callback.dispatchKeyEvent(keyEvent) : this.f20364f.z(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f20359a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            v vVar = this.f20364f;
            vVar.H();
            com.bumptech.glide.d dVar = vVar.f20385C;
            if (dVar == null || !dVar.K(keyCode, keyEvent)) {
                u uVar = vVar.f20408a0;
                if (uVar == null || !vVar.M(uVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (vVar.f20408a0 == null) {
                        u uVarG = vVar.G(0);
                        vVar.N(uVarG, keyEvent);
                        boolean zM = vVar.M(uVarG, keyEvent.getKeyCode(), keyEvent);
                        uVarG.f20377k = false;
                        if (zM) {
                        }
                    }
                    return false;
                }
                u uVar2 = vVar.f20408a0;
                if (uVar2 != null) {
                    uVar2.f20378l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f20359a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f20359a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f20359a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f20359a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f20359a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f20359a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f20361c) {
            this.f20359a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC2677k)) {
            return this.f20359a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        d4.h hVar = this.f20360b;
        if (hVar != null) {
            View view = i == 0 ? new View(((C) hVar.f19807b).f20259a.f22522a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f20359a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f20359a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f20359a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        v vVar = this.f20364f;
        if (i == 108) {
            vVar.H();
            com.bumptech.glide.d dVar = vVar.f20385C;
            if (dVar != null) {
                dVar.q(true);
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f20363e) {
            this.f20359a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        v vVar = this.f20364f;
        if (i == 108) {
            vVar.H();
            com.bumptech.glide.d dVar = vVar.f20385C;
            if (dVar != null) {
                dVar.q(false);
                return;
            }
            return;
        }
        if (i == 0) {
            u uVarG = vVar.G(i);
            if (uVarG.f20379m) {
                vVar.x(uVarG, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z6) {
        m.l.a(this.f20359a, z6);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC2677k menuC2677k = menu instanceof MenuC2677k ? (MenuC2677k) menu : null;
        if (i == 0 && menuC2677k == null) {
            return false;
        }
        if (menuC2677k != null) {
            menuC2677k.f22075L = true;
        }
        d4.h hVar = this.f20360b;
        if (hVar != null && i == 0) {
            C c6 = (C) hVar.f19807b;
            if (!c6.f20262d) {
                c6.f20259a.f22532l = true;
                c6.f20262d = true;
            }
        }
        boolean zOnPreparePanel = this.f20359a.onPreparePanel(i, view, menu);
        if (menuC2677k != null) {
            menuC2677k.f22075L = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC2677k menuC2677k = this.f20364f.G(0).f20375h;
        if (menuC2677k != null) {
            d(list, menuC2677k, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return m.j.a(this.f20359a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f20359a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f20359a.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        if (i != 0) {
            return m.j.b(this.f20359a, callback, i);
        }
        v vVar = this.f20364f;
        Context context = vVar.f20418k;
        c1.g gVar = new c1.g(context, callback);
        m.a aVar = vVar.f20391I;
        if (aVar != null) {
            aVar.a();
        }
        C2351a c2351a = new C2351a(vVar, gVar, 25, false);
        vVar.H();
        com.bumptech.glide.d dVar = vVar.f20385C;
        if (dVar != null) {
            vVar.f20391I = dVar.a0(c2351a);
        }
        if (vVar.f20391I == null) {
            S s5 = vVar.M;
            if (s5 != null) {
                s5.b();
            }
            m.a aVar2 = vVar.f20391I;
            if (aVar2 != null) {
                aVar2.a();
            }
            int i3 = 1;
            if (vVar.f20392J == null) {
                if (vVar.f20404W) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        m.c cVar = new m.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    vVar.f20392J = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    vVar.f20393K = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    vVar.f20393K.setContentView(vVar.f20392J);
                    vVar.f20393K.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    vVar.f20392J.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    vVar.f20393K.setHeight(-2);
                    vVar.f20394L = new l(vVar, i3);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vVar.f20396O.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(vVar.D()));
                        vVar.f20392J = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vVar.f20392J != null) {
                S s6 = vVar.M;
                if (s6 != null) {
                    s6.b();
                }
                vVar.f20392J.e();
                Context context2 = vVar.f20392J.getContext();
                ActionBarContextView actionBarContextView = vVar.f20392J;
                m.d dVar2 = new m.d();
                dVar2.f21873c = context2;
                dVar2.f21874d = actionBarContextView;
                dVar2.f21875e = c2351a;
                MenuC2677k menuC2677k = new MenuC2677k(actionBarContextView.getContext());
                menuC2677k.f22086l = 1;
                dVar2.f21878h = menuC2677k;
                menuC2677k.f22080e = dVar2;
                if (((c1.g) c2351a.f20441b).A(dVar2, menuC2677k)) {
                    dVar2.h();
                    vVar.f20392J.c(dVar2);
                    vVar.f20391I = dVar2;
                    if (vVar.f20395N && (viewGroup = vVar.f20396O) != null && viewGroup.isLaidOut()) {
                        vVar.f20392J.setAlpha(0.0f);
                        S sA = O.a(vVar.f20392J);
                        sA.a(1.0f);
                        vVar.M = sA;
                        sA.d(new n(i3, vVar));
                    } else {
                        vVar.f20392J.setAlpha(1.0f);
                        vVar.f20392J.setVisibility(0);
                        if (vVar.f20392J.getParent() instanceof View) {
                            View view = (View) vVar.f20392J.getParent();
                            WeakHashMap weakHashMap = O.f3270a;
                            R.D.c(view);
                        }
                    }
                    if (vVar.f20393K != null) {
                        vVar.f20420l.getDecorView().post(vVar.f20394L);
                    }
                } else {
                    vVar.f20391I = null;
                }
            }
            vVar.P();
            vVar.f20391I = vVar.f20391I;
        }
        vVar.P();
        m.a aVar3 = vVar.f20391I;
        if (aVar3 != null) {
            return gVar.p(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f20359a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
