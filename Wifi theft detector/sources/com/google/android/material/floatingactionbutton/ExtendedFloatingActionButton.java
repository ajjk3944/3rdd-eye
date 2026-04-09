package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.a0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: f0, reason: collision with root package name */
    public static final int f10503f0 = j4.k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: g0, reason: collision with root package name */
    public static final Property f10504g0 = new f(Float.class, "width");

    /* renamed from: h0, reason: collision with root package name */
    public static final Property f10505h0 = new g(Float.class, "height");

    /* renamed from: i0, reason: collision with root package name */
    public static final Property f10506i0 = new h(Float.class, "paddingStart");

    /* renamed from: j0, reason: collision with root package name */
    public static final Property f10507j0 = new i(Float.class, "paddingEnd");
    public int K;
    public boolean L;
    public final z4.a M;
    public final com.google.android.material.floatingactionbutton.b N;
    public final com.google.android.material.floatingactionbutton.b O;
    public final com.google.android.material.floatingactionbutton.b P;
    public final com.google.android.material.floatingactionbutton.b Q;
    public final int R;
    public int S;
    public int T;
    public final CoordinatorLayout.c U;
    public boolean V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f10508a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f10509b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f10510c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f10511d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f10512e0;

    public class a implements n {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    public class b implements n {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.T;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.S;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ((ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getPaddingStart()) - ExtendedFloatingActionButton.this.getPaddingEnd()) + ExtendedFloatingActionButton.this.S + ExtendedFloatingActionButton.this.T;
        }
    }

    public class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f10518a;

        public c(n nVar) {
            this.f10518a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.f10511d0 != -1) {
                return (ExtendedFloatingActionButton.this.f10511d0 == 0 || ExtendedFloatingActionButton.this.f10511d0 == -2) ? this.f10518a.getHeight() : ExtendedFloatingActionButton.this.f10511d0;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f10518a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }
            return this.f10518a.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.f10511d0 == 0 ? -2 : ExtendedFloatingActionButton.this.f10511d0);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.T;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.S;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f10518a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }
            return this.f10518a.getWidth();
        }
    }

    public class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f10520a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f10521b;

        public d(n nVar, n nVar2) {
            this.f10520a = nVar;
            this.f10521b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.f10511d0 == -1 ? this.f10520a.getHeight() : (ExtendedFloatingActionButton.this.f10511d0 == 0 || ExtendedFloatingActionButton.this.f10511d0 == -2) ? this.f10521b.getHeight() : ExtendedFloatingActionButton.this.f10511d0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.f10510c0 == 0 ? -2 : ExtendedFloatingActionButton.this.f10510c0, ExtendedFloatingActionButton.this.f10511d0 != 0 ? ExtendedFloatingActionButton.this.f10511d0 : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.T;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.S;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.f10510c0 == -1 ? this.f10520a.getWidth() : (ExtendedFloatingActionButton.this.f10510c0 == 0 || ExtendedFloatingActionButton.this.f10510c0 == -2) ? this.f10521b.getWidth() : ExtendedFloatingActionButton.this.f10510c0;
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10523a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.b f10524b;

        public e(com.google.android.material.floatingactionbutton.b bVar, l lVar) {
            this.f10524b = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10523a = true;
            this.f10524b.d();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10524b.f();
            if (this.f10523a) {
                return;
            }
            this.f10524b.j(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10524b.onAnimationStart(animator);
            this.f10523a = false;
        }
    }

    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    public class h extends Property {
        public h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.setPaddingRelative(f10.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public class i extends Property {
        public i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public class j extends z4.b {

        /* renamed from: g, reason: collision with root package name */
        public final n f10526g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f10527h;

        public j(z4.a aVar, n nVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f10526g = nVar;
            this.f10527h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void a() {
            ExtendedFloatingActionButton.this.V = this.f10527h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f10527h) {
                ExtendedFloatingActionButton.this.f10510c0 = layoutParams.width;
                ExtendedFloatingActionButton.this.f10511d0 = layoutParams.height;
            }
            layoutParams.width = this.f10526g.getLayoutParams().width;
            layoutParams.height = this.f10526g.getLayoutParams().height;
            if (this.f10527h) {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                extendedFloatingActionButton.M(extendedFloatingActionButton.f10509b0);
            } else if (ExtendedFloatingActionButton.this.getText() != null && ExtendedFloatingActionButton.this.getText() != "") {
                ExtendedFloatingActionButton.this.M(ColorStateList.valueOf(0));
            }
            ExtendedFloatingActionButton.this.setPaddingRelative(this.f10526g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f10526g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean c() {
            return this.f10527h == ExtendedFloatingActionButton.this.V || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int e() {
            return this.f10527h ? j4.a.mtrl_extended_fab_change_size_expand_motion_spec : j4.a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void f() {
            super.f();
            ExtendedFloatingActionButton.this.W = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f10526g.getLayoutParams().width;
            layoutParams.height = this.f10526g.getLayoutParams().height;
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public AnimatorSet g() {
            k4.h hVarM = m();
            if (hVarM.j("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrG = hVarM.g("width");
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f10526g.getWidth());
                hVarM.l("width", propertyValuesHolderArrG);
            }
            if (hVarM.j("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = hVarM.g("height");
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f10526g.getHeight());
                hVarM.l("height", propertyValuesHolderArrG2);
            }
            if (hVarM.j("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrG3 = hVarM.g("paddingStart");
                propertyValuesHolderArrG3[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingStart(), this.f10526g.getPaddingStart());
                hVarM.l("paddingStart", propertyValuesHolderArrG3);
            }
            if (hVarM.j("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrG4 = hVarM.g("paddingEnd");
                propertyValuesHolderArrG4[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingEnd(), this.f10526g.getPaddingEnd());
                hVarM.l("paddingEnd", propertyValuesHolderArrG4);
            }
            if (hVarM.j("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrG5 = hVarM.g("labelOpacity");
                boolean z10 = this.f10527h;
                propertyValuesHolderArrG5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
                hVarM.l("labelOpacity", propertyValuesHolderArrG5);
            }
            return super.l(hVarM);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void j(l lVar) {
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.V = this.f10527h;
            ExtendedFloatingActionButton.this.W = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    public class k extends z4.b {

        /* renamed from: g, reason: collision with root package name */
        public boolean f10529g;

        public k(z4.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void a() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean c() {
            return ExtendedFloatingActionButton.this.H();
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void d() {
            super.d();
            this.f10529g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int e() {
            return j4.a.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void f() {
            super.f();
            ExtendedFloatingActionButton.this.K = 0;
            if (this.f10529g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void j(l lVar) {
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f10529g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.K = 1;
        }
    }

    public static abstract class l {
    }

    public class m extends z4.b {
        public m(z4.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void a() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean c() {
            return ExtendedFloatingActionButton.this.I();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int e() {
            return j4.a.mtrl_extended_fab_show_motion_spec;
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void f() {
            super.f();
            ExtendedFloatingActionButton.this.K = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void j(l lVar) {
        }

        @Override // z4.b, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.K = 2;
        }
    }

    public interface n {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H() {
        return getVisibility() == 0 ? this.K == 1 : this.K != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        return getVisibility() != 0 ? this.K == 2 : this.K != 1;
    }

    public final n G(int i10) {
        b bVar = new b();
        c cVar = new c(bVar);
        return i10 != 1 ? i10 != 2 ? new d(cVar, bVar) : cVar : bVar;
    }

    public final void J(int i10, l lVar) {
        com.google.android.material.floatingactionbutton.b bVar;
        if (i10 == 0) {
            bVar = this.P;
        } else if (i10 == 1) {
            bVar = this.Q;
        } else if (i10 == 2) {
            bVar = this.N;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i10);
            }
            bVar = this.O;
        }
        if (bVar.c()) {
            return;
        }
        if (!L()) {
            bVar.a();
            bVar.j(lVar);
            return;
        }
        if (i10 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f10510c0 = layoutParams.width;
                this.f10511d0 = layoutParams.height;
            } else {
                this.f10510c0 = getWidth();
                this.f10511d0 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetG = bVar.g();
        animatorSetG.addListener(new e(bVar, lVar));
        Iterator it = bVar.h().iterator();
        while (it.hasNext()) {
            animatorSetG.addListener((Animator.AnimatorListener) it.next());
        }
        animatorSetG.start();
    }

    public final void K() {
        this.f10509b0 = getTextColors();
    }

    public final boolean L() {
        if (this.L) {
            return (isLaidOut() || (!I() && this.f10508a0)) && !isInEditMode();
        }
        return false;
    }

    public void M(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        return this.U;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i10 = this.R;
        return i10 < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize() : i10;
    }

    @Nullable
    public k4.h getExtendMotionSpec() {
        return this.O.b();
    }

    @Nullable
    public k4.h getHideMotionSpec() {
        return this.Q.b();
    }

    @Nullable
    public k4.h getShowMotionSpec() {
        return this.P.b();
    }

    @Nullable
    public k4.h getShrinkMotionSpec() {
        return this.N.b();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.V && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.V = false;
            this.N.a();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f10508a0 = z10;
    }

    public void setAnimationEnabled(boolean z10) {
        this.L = z10;
    }

    public void setExtendMotionSpec(@Nullable k4.h hVar) {
        this.O.i(hVar);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i10) {
        setExtendMotionSpec(k4.h.d(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.V == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.b bVar = z10 ? this.O : this.N;
        if (bVar.c()) {
            return;
        }
        bVar.a();
    }

    public void setHideMotionSpec(@Nullable k4.h hVar) {
        this.Q.i(hVar);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(k4.h.d(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.V || this.W) {
            return;
        }
        this.S = getPaddingStart();
        this.T = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.V || this.W) {
            return;
        }
        this.S = i10;
        this.T = i12;
    }

    public void setShowMotionSpec(@Nullable k4.h hVar) {
        this.P.i(hVar);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(k4.h.d(getContext(), i10));
    }

    public void setShrinkMotionSpec(@Nullable k4.h hVar) {
        this.N.i(hVar);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i10) {
        setShrinkMotionSpec(k4.h.d(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        K();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        public Rect f10513a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10514b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10515c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f10514b = false;
            this.f10515c = true;
        }

        public static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.J(this.f10515c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            Q(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f10514b || this.f10515c) && ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.J(this.f10515c ? 2 : 1, null);
        }

        public final boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f10513a == null) {
                this.f10513a = new Rect();
            }
            Rect rect = this.f10513a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        public final boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.e eVar) {
            if (eVar.f2339h == 0) {
                eVar.f2339h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f10514b = typedArrayObtainStyledAttributes.getBoolean(j4.l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f10515c = typedArrayObtainStyledAttributes.getBoolean(j4.l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f10503f0;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.K = 0;
        this.L = true;
        z4.a aVar = new z4.a();
        this.M = aVar;
        m mVar = new m(aVar);
        this.P = mVar;
        k kVar = new k(aVar);
        this.Q = kVar;
        this.V = true;
        this.W = false;
        this.f10508a0 = false;
        Context context2 = getContext();
        this.U = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayI = a0.i(context2, attributeSet, j4.l.ExtendedFloatingActionButton, i10, i11, new int[0]);
        k4.h hVarC = k4.h.c(context2, typedArrayI, j4.l.ExtendedFloatingActionButton_showMotionSpec);
        k4.h hVarC2 = k4.h.c(context2, typedArrayI, j4.l.ExtendedFloatingActionButton_hideMotionSpec);
        k4.h hVarC3 = k4.h.c(context2, typedArrayI, j4.l.ExtendedFloatingActionButton_extendMotionSpec);
        k4.h hVarC4 = k4.h.c(context2, typedArrayI, j4.l.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.R = typedArrayI.getDimensionPixelSize(j4.l.ExtendedFloatingActionButton_collapsedSize, -1);
        int i12 = typedArrayI.getInt(j4.l.ExtendedFloatingActionButton_extendStrategy, 1);
        this.f10512e0 = i12;
        this.S = getPaddingStart();
        this.T = getPaddingEnd();
        z4.a aVar2 = new z4.a();
        j jVar = new j(aVar2, G(i12), true);
        this.O = jVar;
        j jVar2 = new j(aVar2, new a(), false);
        this.N = jVar2;
        mVar.i(hVarC);
        kVar.i(hVarC2);
        jVar.i(hVarC3);
        jVar2.i(hVarC4);
        typedArrayI.recycle();
        setShapeAppearanceModel(com.google.android.material.shape.a.g(context2, attributeSet, i10, i11, com.google.android.material.shape.a.f10982m).m());
        K();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        K();
    }
}
