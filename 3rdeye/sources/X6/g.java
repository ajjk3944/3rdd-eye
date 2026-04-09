package X6;

import H6.C0672i;
import N7.X2;
import O6.C1476b;
import O6.InterfaceC1478d;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import r7.t;

/* compiled from: DivViewWrapper.kt */
/* loaded from: classes.dex */
public class g extends r7.g implements InterfaceC1478d, r7.r {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f13582n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, null, 0);
        kotlin.jvm.internal.l.f(context, "context");
        this.f13582n = new t();
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setImportantForAccessibility(2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 0) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view");
        }
        super.addView(view, 0, layoutParams);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        C1476b divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.i();
        }
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        KeyEvent.Callback child = getChild();
        InterfaceC1478d interfaceC1478d = child instanceof InterfaceC1478d ? (InterfaceC1478d) child : null;
        if (interfaceC1478d != null) {
            interfaceC1478d.d(bindingContext, x22, view);
        }
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f13582n.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f13582n.g();
    }

    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        InterfaceC1478d interfaceC1478d = child instanceof InterfaceC1478d ? (InterfaceC1478d) child : null;
        if (interfaceC1478d != null) {
            return interfaceC1478d.getDivBorderDrawer();
        }
        return null;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        KeyEvent.Callback child = getChild();
        InterfaceC1478d interfaceC1478d = child instanceof InterfaceC1478d ? (InterfaceC1478d) child : null;
        if (interfaceC1478d != null) {
            return interfaceC1478d.getNeedClipping();
        }
        return true;
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f13582n.j(view);
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        KeyEvent.Callback child = getChild();
        InterfaceC1478d interfaceC1478d = child instanceof InterfaceC1478d ? (InterfaceC1478d) child : null;
        if (interfaceC1478d == null) {
            return;
        }
        interfaceC1478d.setNeedClipping(z10);
    }
}
