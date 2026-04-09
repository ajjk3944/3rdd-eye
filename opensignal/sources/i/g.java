package i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p.m1;

/* loaded from: classes.dex */
public final class g extends c.n implements DialogInterface, k {

    /* renamed from: r, reason: collision with root package name */
    public a0 f11048r;

    /* renamed from: x, reason: collision with root package name */
    public final b0 f11049x;

    /* renamed from: y, reason: collision with root package name */
    public final e f11050y;

    /* JADX WARN: Type inference failed for: r1v2, types: [i.b0] */
    public g(ContextThemeWrapper contextThemeWrapper, int i10) {
        int i11;
        int iE = e(contextThemeWrapper, i10);
        if (iE == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(h.a.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = iE;
        }
        super(contextThemeWrapper, i11);
        this.f11049x = new u3.i() { // from class: i.b0
            @Override // u3.i
            public final boolean b(KeyEvent keyEvent) {
                return this.f11006a.i(keyEvent);
            }
        };
        o oVarC = c();
        if (iE == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(h.a.dialogTheme, typedValue2, true);
            iE = typedValue2.resourceId;
        }
        ((a0) oVarC).f10979p0 = iE;
        oVarC.c();
        this.f11050y = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // c.n, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b();
        a0 a0Var = (a0) c();
        a0Var.u();
        ((ViewGroup) a0Var.W.findViewById(R.id.content)).addView(view, layoutParams);
        a0Var.I.a(a0Var.H.getCallback());
    }

    public final o c() {
        if (this.f11048r == null) {
            n nVar = o.f11099a;
            this.f11048r = new a0(getContext(), getWindow(), this, this);
        }
        return this.f11048r;
    }

    public final void d(Bundle bundle) {
        a0 a0Var = (a0) c();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(a0Var.G);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(a0Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        c().c();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ir.f0.r(this.f11049x, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a0 a0Var = (a0) c();
        a0Var.u();
        return a0Var.H.findViewById(i10);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().j(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().a();
    }

    @Override // c.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        d(bundle);
        e eVar = this.f11050y;
        eVar.f11022b.setContentView(eVar.A);
        Context context = eVar.f11021a;
        Window window = eVar.f11023c;
        View viewFindViewById2 = window.findViewById(h.f.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(h.f.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(h.f.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(h.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(h.f.customPanel);
        View viewInflate = eVar.f11027g;
        if (viewInflate == null) {
            viewInflate = eVar.f11028h != 0 ? LayoutInflater.from(context).inflate(eVar.f11028h, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !e.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(h.f.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f11029i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f11026f != null) {
                ((LinearLayout.LayoutParams) ((m1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(h.f.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(h.f.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(h.f.buttonPanel);
        ViewGroup viewGroupB = e.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = e.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = e.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(h.f.scrollView);
        eVar.f11037s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f11037s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        eVar.f11041w = textView;
        if (textView != null) {
            CharSequence charSequence = eVar.f11025e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                eVar.f11037s.removeView(eVar.f11041w);
                if (eVar.f11026f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) eVar.f11037s.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(eVar.f11037s);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(eVar.f11026f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        eVar.j = button;
        com.google.android.exoplayer2.ui.e0 e0Var = eVar.G;
        button.setOnClickListener(e0Var);
        if (TextUtils.isEmpty(eVar.k)) {
            eVar.j.setVisibility(8);
            i10 = 0;
        } else {
            eVar.j.setText(eVar.k);
            eVar.j.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        eVar.f11031m = button2;
        button2.setOnClickListener(e0Var);
        if (TextUtils.isEmpty(eVar.f11032n)) {
            eVar.f11031m.setVisibility(8);
        } else {
            eVar.f11031m.setText(eVar.f11032n);
            eVar.f11031m.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        eVar.f11034p = button3;
        button3.setOnClickListener(e0Var);
        if (TextUtils.isEmpty(eVar.f11035q)) {
            eVar.f11034p.setVisibility(8);
        } else {
            eVar.f11034p.setText(eVar.f11035q);
            eVar.f11034p.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = eVar.j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = eVar.f11031m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = eVar.f11034p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (eVar.f11042x != null) {
            viewGroupB.addView(eVar.f11042x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(h.f.title_template).setVisibility(8);
        } else {
            eVar.f11039u = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(eVar.f11024d) || !eVar.E) {
                window.findViewById(h.f.title_template).setVisibility(8);
                eVar.f11039u.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(h.f.alertTitle);
                eVar.f11040v = textView2;
                textView2.setText(eVar.f11024d);
                Drawable drawable = eVar.f11038t;
                if (drawable != null) {
                    eVar.f11039u.setImageDrawable(drawable);
                } else {
                    eVar.f11040v.setPadding(eVar.f11039u.getPaddingLeft(), eVar.f11039u.getPaddingTop(), eVar.f11039u.getPaddingRight(), eVar.f11039u.getPaddingBottom());
                    eVar.f11039u.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupB3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupB2.findViewById(h.f.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f11037s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (eVar.f11025e == null && eVar.f11026f == null) ? null : viewGroupB.findViewById(h.f.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(h.f.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f11026f;
        if (alertController$RecycleListView != null && (!z12 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f923a, alertController$RecycleListView.getPaddingRight(), z12 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f924d);
        }
        if (!z11) {
            View view = eVar.f11026f;
            if (view == null) {
                view = eVar.f11037s;
            }
            if (view != null) {
                int i12 = z12 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(h.f.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(h.f.scrollIndicatorDown);
                WeakHashMap weakHashMap = u3.i0.f23177a;
                u3.a0.b(view, i11 | i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f11026f;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f11043y) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = eVar.f11044z;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11050y.f11037s;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11050y.f11037s;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // c.n, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        a0 a0Var = (a0) c();
        a0Var.y();
        xu.l lVar = a0Var.K;
        if (lVar != null) {
            lVar.U(false);
        }
    }

    @Override // c.n, android.app.Dialog
    public final void setContentView(int i10) {
        b();
        c().g(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        c().j(getContext().getString(i10));
    }

    @Override // c.n, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        e eVar = this.f11050y;
        eVar.f11024d = charSequence;
        TextView textView = eVar.f11040v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // c.n, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().i(view, layoutParams);
    }
}
