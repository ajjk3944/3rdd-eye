package je;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p.q0;

/* loaded from: classes.dex */
public final class m extends LinearLayout {
    public final CheckableImageButton B;
    public final b5.m D;
    public int E;
    public final LinkedHashSet F;
    public ColorStateList G;
    public PorterDuff.Mode H;
    public int I;
    public ImageView.ScaleType J;
    public View.OnLongClickListener K;
    public CharSequence L;
    public final q0 M;
    public boolean N;
    public EditText O;
    public final AccessibilityManager P;
    public AccessibilityManager.TouchExplorationStateChangeListener Q;
    public final k R;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f13642a;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f13643d;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f13644g;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f13645r;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f13646x;

    /* renamed from: y, reason: collision with root package name */
    public View.OnLongClickListener f13647y;

    public m(TextInputLayout textInputLayout, io.sentry.k kVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.E = 0;
        this.F = new LinkedHashSet();
        this.R = new k(this);
        l lVar = new l(this);
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f13642a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f13643d = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, ed.f.text_input_error_icon);
        this.f13644g = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, ed.f.text_input_end_icon);
        this.B = checkableImageButtonA2;
        b5.m mVar = new b5.m();
        mVar.f2459g = new SparseArray();
        mVar.f2460r = this;
        int i10 = ed.l.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) kVar.f12398g;
        mVar.f2457a = typedArray.getResourceId(i10, 0);
        mVar.f2458d = typedArray.getResourceId(ed.l.TextInputLayout_passwordToggleDrawable, 0);
        this.D = mVar;
        q0 q0Var = new q0(getContext(), null);
        this.M = q0Var;
        int i11 = ed.l.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) kVar.f12398g;
        if (typedArray2.hasValue(i11)) {
            this.f13645r = xu.l.r(getContext(), kVar, ed.l.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(ed.l.TextInputLayout_errorIconTintMode)) {
            this.f13646x = xd.l.d(typedArray2.getInt(ed.l.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(ed.l.TextInputLayout_errorIconDrawable)) {
            i(kVar.U(ed.l.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(ed.j.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(ed.l.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(ed.l.TextInputLayout_endIconTint)) {
                this.G = xu.l.r(getContext(), kVar, ed.l.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(ed.l.TextInputLayout_endIconTintMode)) {
                this.H = xd.l.d(typedArray2.getInt(ed.l.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray2.hasValue(ed.l.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(ed.l.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(ed.l.TextInputLayout_endIconContentDescription) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(ed.l.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(ed.l.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(ed.l.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(ed.l.TextInputLayout_passwordToggleTint)) {
                this.G = xu.l.r(getContext(), kVar, ed.l.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(ed.l.TextInputLayout_passwordToggleTintMode)) {
                this.H = xd.l.d(typedArray2.getInt(ed.l.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            g(typedArray2.getBoolean(ed.l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(ed.l.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(ed.l.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(ed.d.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.I) {
            this.I = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(ed.l.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeJ = vc.e.j(typedArray2.getInt(ed.l.TextInputLayout_endIconScaleType, -1));
            this.J = scaleTypeJ;
            checkableImageButtonA2.setScaleType(scaleTypeJ);
            checkableImageButtonA.setScaleType(scaleTypeJ);
        }
        q0Var.setVisibility(8);
        q0Var.setId(ed.f.textinput_suffix_text);
        q0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        q0Var.setAccessibilityLiveRegion(1);
        q0Var.setTextAppearance(typedArray2.getResourceId(ed.l.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray2.hasValue(ed.l.TextInputLayout_suffixTextColor)) {
            q0Var.setTextColor(kVar.T(ed.l.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray2.getText(ed.l.TextInputLayout_suffixText);
        this.L = TextUtils.isEmpty(text3) ? null : text3;
        q0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(q0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.B0.add(lVar);
        if (textInputLayout.f5767x != null) {
            lVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new g1.e(4, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(ed.h.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (xu.l.F(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n dVar;
        int i10 = this.E;
        b5.m mVar = this.D;
        SparseArray sparseArray = (SparseArray) mVar.f2459g;
        n nVar = (n) sparseArray.get(i10);
        if (nVar != null) {
            return nVar;
        }
        m mVar2 = (m) mVar.f2460r;
        if (i10 == -1) {
            dVar = new d(mVar2, 0);
        } else if (i10 == 0) {
            dVar = new d(mVar2, 1);
        } else if (i10 == 1) {
            dVar = new u(mVar2, mVar.f2458d);
        } else if (i10 == 2) {
            dVar = new c(mVar2);
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(h0.b.h(i10, "Invalid end icon mode: "));
            }
            dVar = new j(mVar2);
        }
        sparseArray.append(i10, dVar);
        return dVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.B;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.M.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f13643d.getVisibility() == 0 && this.B.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f13644g.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean z12;
        n nVarB = b();
        boolean zJ = nVarB.j();
        CheckableImageButton checkableImageButton = this.B;
        boolean z13 = true;
        if (!zJ || (z12 = checkableImageButton.f5657r) == nVarB.k()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        }
        if (!(nVarB instanceof j) || (zIsActivated = checkableImageButton.isActivated()) == ((j) nVarB).f13633l) {
            z13 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z13) {
            vc.e.H(this.f13642a, checkableImageButton, this.G);
        }
    }

    public final void g(int i10) {
        if (this.E == i10) {
            return;
        }
        n nVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.Q;
        AccessibilityManager accessibilityManager = this.P;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.Q = null;
        nVarB.r();
        this.E = i10;
        Iterator it = this.F.iterator();
        if (it.hasNext()) {
            throw w.g.d(it);
        }
        h(i10 != 0);
        n nVarB2 = b();
        int iD = this.D.f2457a;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawableR = iD != 0 ? ic.a.r(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.B;
        checkableImageButton.setImageDrawable(drawableR);
        TextInputLayout textInputLayout = this.f13642a;
        if (drawableR != null) {
            vc.e.b(textInputLayout, checkableImageButton, this.G, this.H);
            vc.e.H(textInputLayout, checkableImageButton, this.G);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.j());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        nVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = nVarB2.h();
        this.Q = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.Q);
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.K;
        checkableImageButton.setOnClickListener(onClickListenerF);
        vc.e.O(checkableImageButton, onLongClickListener);
        EditText editText = this.O;
        if (editText != null) {
            nVarB2.l(editText);
            j(nVarB2);
        }
        vc.e.b(textInputLayout, checkableImageButton, this.G, this.H);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.B.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f13642a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f13644g;
        checkableImageButton.setImageDrawable(drawable);
        l();
        vc.e.b(this.f13642a, checkableImageButton, this.f13645r, this.f13646x);
    }

    public final void j(n nVar) {
        if (this.O == null) {
            return;
        }
        if (nVar.e() != null) {
            this.O.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.B.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void k() {
        this.f13643d.setVisibility((this.B.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.L == null || this.N) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f13644g;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f13642a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.G.f13672q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.E != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f13642a;
        if (textInputLayout.f5767x == null) {
            return;
        }
        this.M.setPaddingRelative(getContext().getResources().getDimensionPixelSize(ed.d.material_input_text_to_prefix_suffix_padding), textInputLayout.f5767x.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f5767x.getPaddingEnd(), textInputLayout.f5767x.getPaddingBottom());
    }

    public final void n() {
        q0 q0Var = this.M;
        int visibility = q0Var.getVisibility();
        int i10 = (this.L == null || this.N) ? 8 : 0;
        if (visibility != i10) {
            b().o(i10 == 0);
        }
        k();
        q0Var.setVisibility(i10);
        this.f13642a.s();
    }
}
