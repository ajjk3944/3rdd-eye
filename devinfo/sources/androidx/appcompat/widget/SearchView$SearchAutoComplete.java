package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import ek.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.o;
import p.o1;
import p.t2;
import p.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends o {

    /* renamed from: e, reason: collision with root package name */
    public int f791e;

    /* renamed from: f, reason: collision with root package name */
    public z2 f792f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final o1 f793h;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f793h = new o1(1, this);
        this.f791e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i4 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i4 < 600) {
            return (i4 < 640 || i10 < 480) ? 160 : 192;
        }
        return 192;
    }

    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            t2.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        f fVar = z2.f30921j0;
        fVar.getClass();
        f.a();
        Method method = fVar.f23534c;
        if (method != null) {
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f791e <= 0 || super.enoughToFilter();
    }

    @Override // p.o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.g) {
            o1 o1Var = this.f793h;
            removeCallbacks(o1Var);
            post(o1Var);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onFocusChanged(z3, i4, rect);
        z2 z2Var = this.f792f;
        z2Var.w(z2Var.P);
        z2Var.post(z2Var.f30928g0);
        if (z2Var.f30931p.hasFocus()) {
            z2Var.l();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f792f.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i4, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onWindowFocusChanged(z3);
        if (z3 && this.f792f.hasFocus() && getVisibility() == 0) {
            this.g = true;
            if (getContext().getResources().getConfiguration().orientation == 2) {
                a();
            }
        }
    }

    public void setImeVisibility(boolean z3) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        o1 o1Var = this.f793h;
        if (!z3) {
            this.g = false;
            removeCallbacks(o1Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.g = true;
                return;
            }
            this.g = false;
            removeCallbacks(o1Var);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(z2 z2Var) {
        this.f792f = z2Var;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i4) {
        super.setThreshold(i4);
        this.f791e = i4;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }
}
