package androidx.appcompat.widget;

import aa.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.liuzh.deviceinfo.R;
import e4.c1;
import e4.v0;
import o.a0;
import o.m;
import p.a;
import p.g;
import p.k;
import p.v3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final a f703a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f704b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f705c;

    /* renamed from: d, reason: collision with root package name */
    public k f706d;

    /* renamed from: e, reason: collision with root package name */
    public int f707e;

    /* renamed from: f, reason: collision with root package name */
    public c1 f708f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f709h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f710i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public View f711k;

    /* renamed from: l, reason: collision with root package name */
    public View f712l;

    /* renamed from: m, reason: collision with root package name */
    public View f713m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f714n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f715o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f716p;

    /* renamed from: q, reason: collision with root package name */
    public final int f717q;

    /* renamed from: r, reason: collision with root package name */
    public final int f718r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f719s;

    /* renamed from: t, reason: collision with root package name */
    public final int f720t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f703a = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f704b = context;
        } else {
            this.f704b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f24779d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : jm.a.l(resourceId, context));
        this.f717q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f718r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f707e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f720t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i4, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, LinearLayoutManager.INVALID_OFFSET), i10);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int g(View view, boolean z3, int i4, int i10, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z3) {
            view.layout(i4 - measuredWidth, i12, i4, measuredHeight + i12);
        } else {
            view.layout(i4, i12, i4 + measuredWidth, measuredHeight + i12);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void c(n.a aVar) {
        View view = this.f711k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f720t, (ViewGroup) this, false);
            this.f711k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f711k);
        }
        View viewFindViewById = this.f711k.findViewById(R.id.action_mode_close_button);
        this.f712l = viewFindViewById;
        viewFindViewById.setOnClickListener(new j(6, aVar));
        m mVarG = aVar.g();
        k kVar = this.f706d;
        if (kVar != null) {
            kVar.h();
            g gVar = kVar.f30742t;
            if (gVar != null && gVar.b()) {
                gVar.f30307i.dismiss();
            }
        }
        k kVar2 = new k(getContext());
        this.f706d = kVar2;
        kVar2.f30734l = true;
        kVar2.f30735m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mVarG.b(this.f706d, this.f704b);
        k kVar3 = this.f706d;
        a0 a0Var = kVar3.f30731h;
        if (a0Var == null) {
            a0 a0Var2 = (a0) kVar3.f30728d.inflate(kVar3.f30730f, (ViewGroup) this, false);
            kVar3.f30731h = a0Var2;
            a0Var2.b(kVar3.f30727c);
            kVar3.f();
        }
        a0 a0Var3 = kVar3.f30731h;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(kVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f705c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f705c, layoutParams);
    }

    public final void d() {
        if (this.f714n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f714n = linearLayout;
            this.f715o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f716p = (TextView) this.f714n.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f717q;
            if (i4 != 0) {
                this.f715o.setTextAppearance(getContext(), i4);
            }
            int i10 = this.f718r;
            if (i10 != 0) {
                this.f716p.setTextAppearance(getContext(), i10);
            }
        }
        this.f715o.setText(this.f710i);
        this.f716p.setText(this.j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f710i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.j);
        this.f716p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f714n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f714n.getParent() == null) {
            addView(this.f714n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f713m = null;
        this.f705c = null;
        this.f706d = null;
        View view = this.f712l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f708f != null ? this.f703a.f30606b : getVisibility();
    }

    public int getContentHeight() {
        return this.f707e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.f710i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            c1 c1Var = this.f708f;
            if (c1Var != null) {
                c1Var.b();
            }
            super.setVisibility(i4);
        }
    }

    public final c1 i(int i4, long j) {
        c1 c1Var = this.f708f;
        if (c1Var != null) {
            c1Var.b();
        }
        a aVar = this.f703a;
        if (i4 != 0) {
            c1 c1VarB = v0.b(this);
            c1VarB.a(0.0f);
            c1VarB.c(j);
            ((ActionBarContextView) aVar.f30607c).f708f = c1VarB;
            aVar.f30606b = i4;
            c1VarB.d(aVar);
            return c1VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        c1 c1VarB2 = v0.b(this);
        c1VarB2.a(1.0f);
        c1VarB2.c(j);
        ((ActionBarContextView) aVar.f30607c).f708f = c1VarB2;
        aVar.f30606b = i4;
        c1VarB2.d(aVar);
        return c1VarB2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f24776a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        k kVar = this.f706d;
        if (kVar != null) {
            Configuration configuration2 = kVar.f30726b.getResources().getConfiguration();
            int i4 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            kVar.f30738p = (configuration2.smallestScreenWidthDp > 600 || i4 > 600 || (i4 > 960 && i10 > 720) || (i4 > 720 && i10 > 960)) ? 5 : (i4 >= 500 || (i4 > 640 && i10 > 480) || (i4 > 480 && i10 > 640)) ? 4 : i4 >= 360 ? 3 : 2;
            m mVar = kVar.f30727c;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f706d;
        if (kVar != null) {
            kVar.h();
            g gVar = this.f706d.f30742t;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f30307i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f709h = false;
        }
        if (!this.f709h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f709h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f709h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        boolean z10 = v3.f30896a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i11 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f711k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f711k.getLayoutParams();
            int i13 = z11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z11 ? paddingRight - i13 : paddingRight + i13;
            int iG = g(this.f711k, z11, i15, paddingTop, paddingTop2) + i15;
            paddingRight = z11 ? iG - i14 : iG + i14;
        }
        LinearLayout linearLayout = this.f714n;
        if (linearLayout != null && this.f713m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f714n, z11, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f713m;
        if (view2 != null) {
            g(view2, z11, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z11 ? getPaddingLeft() : (i11 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f705c;
        if (actionMenuView != null) {
            g(actionMenuView, !z11, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = this.f707e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, LinearLayoutManager.INVALID_OFFSET);
        View view = this.f711k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f711k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f705c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f705c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f714n;
        if (linearLayout != null && this.f713m == null) {
            if (this.f719s) {
                this.f714n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f714n.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f714n.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f713m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f713m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f707e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.g = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.f707e = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f713m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f713m = view;
        if (view != null && (linearLayout = this.f714n) != null) {
            removeView(linearLayout);
            this.f714n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f710i = charSequence;
        d();
        v0.p(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f719s) {
            requestLayout();
        }
        this.f719s = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
