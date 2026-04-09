package com.google.android.material.appbar;

import R.F;
import R.O;
import R.r0;
import U0.j;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.apm.insight.R;
import d3.AbstractC2266a;
import e3.AbstractC2303a;
import f3.e;
import f3.i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x3.AbstractC2993B;
import x3.AbstractC2998c;
import x3.C2997b;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: C, reason: collision with root package name */
    public boolean f18035C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18036D;

    /* renamed from: E, reason: collision with root package name */
    public final int f18037E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f18038F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f18039G;

    /* renamed from: H, reason: collision with root package name */
    public int f18040H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f18041I;

    /* renamed from: J, reason: collision with root package name */
    public ValueAnimator f18042J;

    /* renamed from: K, reason: collision with root package name */
    public long f18043K;

    /* renamed from: L, reason: collision with root package name */
    public final TimeInterpolator f18044L;
    public final TimeInterpolator M;

    /* renamed from: N, reason: collision with root package name */
    public int f18045N;

    /* renamed from: O, reason: collision with root package name */
    public f3.d f18046O;

    /* renamed from: P, reason: collision with root package name */
    public int f18047P;

    /* renamed from: Q, reason: collision with root package name */
    public int f18048Q;

    /* renamed from: R, reason: collision with root package name */
    public int f18049R;

    /* renamed from: S, reason: collision with root package name */
    public r0 f18050S;

    /* renamed from: T, reason: collision with root package name */
    public int f18051T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f18052U;

    /* renamed from: V, reason: collision with root package name */
    public int f18053V;

    /* renamed from: W, reason: collision with root package name */
    public int f18054W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18055a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f18056a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f18057b;
    public int b0;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f18058c;

    /* renamed from: d, reason: collision with root package name */
    public View f18059d;

    /* renamed from: e, reason: collision with root package name */
    public View f18060e;

    /* renamed from: f, reason: collision with root package name */
    public int f18061f;

    /* renamed from: g, reason: collision with root package name */
    public int f18062g;

    /* renamed from: h, reason: collision with root package name */
    public int f18063h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f18064j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f18065k;

    /* renamed from: l, reason: collision with root package name */
    public final C2997b f18066l;

    /* renamed from: m, reason: collision with root package name */
    public final C2997b f18067m;

    /* renamed from: n, reason: collision with root package name */
    public final t3.a f18068n;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public static i b(View view) {
        i iVar = (i) view.getTag(R.id.view_offset_helper);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(view);
        view.setTag(R.id.view_offset_helper, iVar2);
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            r1 = 2130968894(0x7f04013e, float:1.7546455E38)
            android.util.TypedValue r1 = d5.y.n(r0, r1)
            if (r1 != 0) goto Le
            goto L20
        Le:
            int r2 = r1.resourceId
            if (r2 == 0) goto L17
            android.content.res.ColorStateList r0 = G.c.b(r0, r2)
            goto L21
        L17:
            int r0 = r1.data
            if (r0 == 0) goto L20
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L28
            int r0 = r0.getDefaultColor()
            return r0
        L28:
            android.content.res.Resources r0 = r3.getResources()
            r1 = 2131165290(0x7f07006a, float:1.7944793E38)
            float r0 = r0.getDimension(r1)
            t3.a r1 = r3.f18068n
            int r2 = r1.f23669d
            int r0 = r1.a(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.getDefaultContentScrimColorForTitleCollapseFadeMode():int");
    }

    public final void a() {
        if (this.f18055a) {
            ViewGroup viewGroup = null;
            this.f18058c = null;
            this.f18059d = null;
            int i = this.f18057b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f18058c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f18059d = view;
                }
            }
            if (this.f18058c == null) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f18058c = viewGroup;
            }
            c();
            this.f18055a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.f18035C && (view = this.f18060e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f18060e);
            }
        }
        if (!this.f18035C || this.f18058c == null) {
            return;
        }
        if (this.f18060e == null) {
            this.f18060e = new View(getContext());
        }
        if (this.f18060e.getParent() == null) {
            this.f18058c.addView(this.f18060e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f3.c;
    }

    public final void d() {
        if (this.f18038F == null && this.f18039G == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f18047P < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f18058c == null && (drawable = this.f18038F) != null && this.f18040H > 0) {
            drawable.mutate().setAlpha(this.f18040H);
            this.f18038F.draw(canvas);
        }
        if (this.f18035C && this.f18036D) {
            ViewGroup viewGroup = this.f18058c;
            C2997b c2997b = this.f18067m;
            C2997b c2997b2 = this.f18066l;
            if (viewGroup == null || this.f18038F == null || this.f18040H <= 0 || this.f18049R != 1 || c2997b2.f24067b >= c2997b2.f24072e) {
                c2997b2.f(canvas);
                c2997b.f(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f18038F.getBounds(), Region.Op.DIFFERENCE);
                c2997b2.f(canvas);
                c2997b.f(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f18039G == null || this.f18040H <= 0) {
            return;
        }
        r0 r0Var = this.f18050S;
        int iD = r0Var != null ? r0Var.d() : 0;
        if (iD > 0) {
            this.f18039G.setBounds(0, -this.f18047P, getWidth(), iD - this.f18047P);
            this.f18039G.mutate().setAlpha(this.f18040H);
            this.f18039G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        boolean z6;
        View view2;
        Drawable drawable = this.f18038F;
        if (drawable == null || this.f18040H <= 0 || ((view2 = this.f18059d) == null || view2 == this ? view != this.f18058c : view != view2)) {
            z6 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f18049R == 1 && view != null && this.f18035C) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f18038F.mutate().setAlpha(this.f18040H);
            this.f18038F.draw(canvas);
            z6 = true;
        }
        return super.drawChild(canvas, view, j6) || z6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f18039G;
        boolean z6 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f18038F;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C2997b c2997b = this.f18066l;
        if (c2997b != null) {
            c2997b.f24057S = drawableState;
            ColorStateList colorStateList2 = c2997b.f24093p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c2997b.f24091o) != null && colorStateList.isStateful())) {
                c2997b.l(false);
                z6 = true;
            }
            state |= z6;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i, int i3, int i6, int i7, boolean z6) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f18035C || (view = this.f18060e) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z7 = view.isAttachedToWindow() && this.f18060e.getVisibility() == 0;
        this.f18036D = z7;
        if (z7 || z6) {
            boolean z8 = getLayoutDirection() == 1;
            View view2 = this.f18059d;
            if (view2 == null) {
                view2 = this.f18058c;
            }
            int height = ((getHeight() - b(view2).f20107b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((f3.c) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f18060e;
            Rect rect = this.f18065k;
            AbstractC2998c.a(this, view3, rect);
            ViewGroup viewGroup = this.f18058c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            }
            int i8 = rect.left + (z8 ? titleMarginEnd : titleMarginStart);
            int i9 = rect.right - (z8 ? titleMarginStart : titleMarginEnd);
            int i10 = rect.top + height + titleMarginTop;
            int i11 = (rect.bottom + height) - titleMarginBottom;
            C2997b c2997b = this.f18067m;
            TextPaint textPaint = c2997b.f24060V;
            textPaint.setTextSize(c2997b.f24089n);
            textPaint.setTypeface(c2997b.f24107x);
            textPaint.setLetterSpacing(c2997b.f24077g0);
            int iDescent = (int) (i11 - (textPaint.descent() + (-textPaint.ascent())));
            C2997b c2997b2 = this.f18066l;
            TextPaint textPaint2 = c2997b2.f24060V;
            textPaint2.setTextSize(c2997b2.f24089n);
            textPaint2.setTypeface(c2997b2.f24107x);
            textPaint2.setLetterSpacing(c2997b2.f24077g0);
            int iDescent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i10);
            if (TextUtils.isEmpty(c2997b.f24047H)) {
                c2997b2.o(i8, i10, i9, i11);
            } else {
                c2997b2.o(i8, i10, i9, iDescent);
                c2997b.o(i8, iDescent2, i9, i11);
            }
            if (this.f18037E == 0) {
                AbstractC2998c.a(this, this, rect);
                int i12 = rect.left + (z8 ? titleMarginEnd : titleMarginStart);
                int i13 = rect.right;
                if (!z8) {
                    titleMarginStart = titleMarginEnd;
                }
                int i14 = i13 - titleMarginStart;
                if (TextUtils.isEmpty(c2997b.f24047H)) {
                    c2997b2.p(i12, i10, i14, i11);
                } else {
                    c2997b2.p(i12, i10, i14, iDescent);
                    c2997b.p(i12, iDescent2, i14, i11);
                }
            }
            int i15 = z8 ? this.f18063h : this.f18061f;
            int i16 = rect.top + this.f18062g;
            int i17 = (i6 - i) - (z8 ? this.f18061f : this.f18063h);
            int i18 = (i7 - i3) - this.i;
            if (TextUtils.isEmpty(c2997b.f24047H)) {
                this.f18066l.u(i15, i16, i17, i18, true);
                c2997b2.l(z6);
            } else {
                this.f18066l.u(i15, i16, i17, (int) ((i18 - (c2997b.i() + this.f18054W)) - this.f18064j), false);
                this.f18067m.u(i15, (int) (c2997b2.i() + this.f18053V + i16 + this.f18064j), i17, i18, false);
                c2997b2.l(z6);
                c2997b.l(z6);
            }
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.f18058c;
        if (viewGroup == null || !this.f18035C) {
            return;
        }
        CharSequence subtitle = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.f18066l.f24047H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.f18058c;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.f18067m.f24047H) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        setSubtitle(subtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f3.c cVar = new f3.c(-1, -1);
        cVar.f20091a = 0;
        cVar.f20092b = 0.5f;
        return cVar;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.f18067m.f24089n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.f18067m.f24107x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.f18066l.f24085l;
    }

    public float getCollapsedTitleTextSize() {
        return this.f18066l.f24089n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f18066l.f24107x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f18038F;
    }

    public float getExpandedSubtitleTextSize() {
        return this.f18067m.f24087m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.f18067m.f24040A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.f18066l.f24083k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f18063h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f18061f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f18062g;
    }

    public int getExpandedTitleSpacing() {
        return this.f18064j;
    }

    public float getExpandedTitleTextSize() {
        return this.f18066l.f24087m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f18066l.f24040A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f18066l.f24100s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f18066l.f24082j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f18066l.f24082j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f18066l.f24082j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f18066l.f24092o0;
    }

    public int getScrimAlpha() {
        return this.f18040H;
    }

    public long getScrimAnimationDuration() {
        return this.f18043K;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f18045N;
        if (i >= 0) {
            return i + this.f18051T + this.f18053V + this.f18054W + this.b0;
        }
        r0 r0Var = this.f18050S;
        int iD = r0Var != null ? r0Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f18039G;
    }

    public CharSequence getSubtitle() {
        if (this.f18035C) {
            return this.f18067m.f24047H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.f18035C) {
            return this.f18066l.f24047H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f18049R;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f18066l.f24061W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f18066l.f24046G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f18049R == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f18046O == null) {
                this.f18046O = new f3.d(this);
            }
            f3.d dVar = this.f18046O;
            if (appBarLayout.f18024h == null) {
                appBarLayout.f18024h = new ArrayList();
            }
            if (dVar != null && !appBarLayout.f18024h.contains(dVar)) {
                appBarLayout.f18024h.add(dVar);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2997b c2997b = this.f18066l;
        c2997b.k(configuration);
        if (this.f18048Q != configuration.orientation && this.f18056a0 && c2997b.f24067b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.f18048Q = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        f3.d dVar = this.f18046O;
        if (dVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f18024h) != null) {
            arrayList.remove(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        r0 r0Var = this.f18050S;
        if (r0Var != null) {
            int iD = r0Var.d();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    WeakHashMap weakHashMap = O.f3270a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            i iVarB = b(getChildAt(i9));
            View view = iVarB.f20106a;
            iVarB.f20107b = view.getTop();
            iVarB.f20108c = view.getLeft();
        }
        e(i, i3, i6, i7, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i10 = 0; i10 < childCount3; i10++) {
            b(getChildAt(i10)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        Drawable drawable = this.f18038F;
        if (drawable != null) {
            ViewGroup viewGroup = this.f18058c;
            if (this.f18049R == 1 && viewGroup != null && this.f18035C) {
                i3 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i3);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.f18067m.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f2) {
        C2997b c2997b = this.f18067m;
        if (c2997b.f24089n != f2) {
            c2997b.f24089n = f2;
            c2997b.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        C2997b c2997b = this.f18067m;
        if (c2997b.t(typeface)) {
            c2997b.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f18066l.s(i);
        this.f18067m.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f18066l.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f2) {
        C2997b c2997b = this.f18066l;
        if (c2997b.f24089n != f2) {
            c2997b.f24089n = f2;
            c2997b.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C2997b c2997b = this.f18066l;
        if (c2997b.t(typeface)) {
            c2997b.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f18038F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f18038F = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f18058c;
                if (this.f18049R == 1 && viewGroup != null && this.f18035C) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.f18038F.setCallback(this);
                this.f18038F.setAlpha(this.f18040H);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.f18067m.w(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        C2997b c2997b = this.f18067m;
        if (c2997b.f24091o != colorStateList) {
            c2997b.f24091o = colorStateList;
            c2997b.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f2) {
        this.f18067m.y(f2);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        C2997b c2997b = this.f18067m;
        if (c2997b.z(typeface)) {
            c2997b.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f18066l.x(i);
        this.f18067m.x(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f18063h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f18061f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f18062g = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.f18064j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f18066l.w(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C2997b c2997b = this.f18066l;
        if (c2997b.f24091o != colorStateList) {
            c2997b.f24091o = colorStateList;
            c2997b.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f2) {
        this.f18066l.y(f2);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C2997b c2997b = this.f18066l;
        if (c2997b.z(typeface)) {
            c2997b.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z6) {
        this.f18056a0 = z6;
    }

    public void setForceApplySystemWindowInsetTop(boolean z6) {
        this.f18052U = z6;
    }

    public void setHyphenationFrequency(int i) {
        this.f18066l.f24100s0 = i;
    }

    public void setLineSpacingAdd(float f2) {
        this.f18066l.f24096q0 = f2;
    }

    public void setLineSpacingMultiplier(float f2) {
        this.f18066l.f24098r0 = f2;
    }

    public void setMaxLines(int i) {
        this.f18066l.v(i);
        this.f18067m.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z6) {
        this.f18066l.f24050K = z6;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f18040H) {
            if (this.f18038F != null && (viewGroup = this.f18058c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.f18040H = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j6) {
        this.f18043K = j6;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f18045N != i) {
            this.f18045N = i;
            d();
        }
    }

    public void setScrimsShown(boolean z6) {
        boolean z7 = isLaidOut() && !isInEditMode();
        if (this.f18041I != z6) {
            if (z7) {
                int i = z6 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f18042J;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f18042J = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.f18040H ? this.f18044L : this.M);
                    this.f18042J.addUpdateListener(new L3.b(2, this));
                } else if (valueAnimator.isRunning()) {
                    this.f18042J.cancel();
                }
                this.f18042J.setDuration(this.f18043K);
                this.f18042J.setIntValues(this.f18040H, i);
                this.f18042J.start();
            } else {
                setScrimAlpha(z6 ? 255 : 0);
            }
            this.f18041I = z6;
        }
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        C2997b c2997b = this.f18066l;
        c2997b.getClass();
        if (eVar != null) {
            c2997b.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f18039G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f18039G = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f18039G.setState(getDrawableState());
                }
                this.f18039G.setLayoutDirection(getLayoutDirection());
                this.f18039G.setVisible(getVisibility() == 0, false);
                this.f18039G.setCallback(this);
                this.f18039G.setAlpha(this.f18040H);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f18067m.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18066l.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.f18049R = i;
        boolean z6 = i == 1;
        this.f18066l.f24068c = z6;
        this.f18067m.f24068c = z6;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f18049R == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z6 && this.f18038F == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        C2997b c2997b = this.f18066l;
        c2997b.f24046G = truncateAt;
        c2997b.l(false);
    }

    public void setTitleEnabled(boolean z6) {
        if (z6 != this.f18035C) {
            this.f18035C = z6;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C2997b c2997b = this.f18066l;
        c2997b.f24061W = timeInterpolator;
        c2997b.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z6 = i == 0;
        Drawable drawable = this.f18039G;
        if (drawable != null && drawable.isVisible() != z6) {
            this.f18039G.setVisible(z6, false);
        }
        Drawable drawable2 = this.f18038F;
        if (drawable2 == null || drawable2.isVisible() == z6) {
            return;
        }
        this.f18038F.setVisible(z6, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f18038F || drawable == this.f18039G;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListN;
        ColorStateList colorStateListN2;
        super(O3.a.a(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.f18055a = true;
        this.f18065k = new Rect();
        this.f18045N = -1;
        this.f18051T = 0;
        this.f18053V = 0;
        this.f18054W = 0;
        this.b0 = 0;
        Context context2 = getContext();
        this.f18048Q = getResources().getConfiguration().orientation;
        C2997b c2997b = new C2997b(this);
        this.f18066l = c2997b;
        DecelerateInterpolator decelerateInterpolator = AbstractC2303a.f19931e;
        c2997b.f24062X = decelerateInterpolator;
        c2997b.l(false);
        c2997b.f24050K = false;
        this.f18068n = new t3.a(context2);
        AbstractC2993B.a(context2, attributeSet, i, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = AbstractC2266a.f19757l;
        AbstractC2993B.b(context2, attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar);
        int i3 = typedArrayObtainStyledAttributes.getInt(9, 8388691);
        int i6 = typedArrayObtainStyledAttributes.getInt(2, 8388627);
        this.f18037E = typedArrayObtainStyledAttributes.getInt(3, 1);
        c2997b.x(i3);
        c2997b.s(i6);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.i = dimensionPixelSize;
        this.f18063h = dimensionPixelSize;
        this.f18062g = dimensionPixelSize;
        this.f18061f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            this.f18061f = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.f18063h = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.f18062g = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.f18064j = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.f18035C = typedArrayObtainStyledAttributes.getBoolean(28, true);
        setTitle(typedArrayObtainStyledAttributes.getText(26));
        c2997b.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c2997b.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            c2997b.w(typedArrayObtainStyledAttributes.getResourceId(16, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            c2997b.q(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            int i7 = typedArrayObtainStyledAttributes.getInt(31, -1);
            setTitleEllipsize(i7 != 0 ? i7 != 1 ? i7 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17) && c2997b.f24091o != (colorStateListN2 = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 17))) {
            c2997b.f24091o = colorStateListN2;
            c2997b.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c2997b.r(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 5));
        }
        this.f18045N = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (typedArrayObtainStyledAttributes.hasValue(29)) {
            c2997b.v(typedArrayObtainStyledAttributes.getInt(29, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(20)) {
            c2997b.v(typedArrayObtainStyledAttributes.getInt(20, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            c2997b.f24061W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            c2997b.l(false);
        }
        C2997b c2997b2 = new C2997b(this);
        this.f18067m = c2997b2;
        c2997b2.f24062X = decelerateInterpolator;
        c2997b2.l(false);
        c2997b2.f24050K = false;
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(24));
        }
        c2997b2.x(i3);
        c2997b2.s(i6);
        c2997b2.w(R.style.TextAppearance_AppCompat_Headline);
        c2997b2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            c2997b2.w(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            c2997b2.q(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && c2997b2.f24091o != (colorStateListN = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 8))) {
            c2997b2.f24091o = colorStateListN;
            c2997b2.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            c2997b2.r(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            c2997b2.v(typedArrayObtainStyledAttributes.getInt(25, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            c2997b2.f24061W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            c2997b2.l(false);
        }
        this.f18043K = typedArrayObtainStyledAttributes.getInt(21, 600);
        this.f18044L = com.bumptech.glide.d.P(context2, R.attr.motionEasingStandardInterpolator, AbstractC2303a.f19929c);
        this.M = com.bumptech.glide.d.P(context2, R.attr.motionEasingStandardInterpolator, AbstractC2303a.f19930d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(27, 0));
        this.f18057b = typedArrayObtainStyledAttributes.getResourceId(32, -1);
        this.f18052U = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f18056a0 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        j jVar = new j(27, this);
        WeakHashMap weakHashMap = O.f3270a;
        F.k(this, jVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f3.c cVar = new f3.c(context, attributeSet);
        cVar.f20091a = 0;
        cVar.f20092b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19758m);
        cVar.f20091a = typedArrayObtainStyledAttributes.getInt(0, 0);
        cVar.f20092b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.f18067m.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f18066l.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        f3.c cVar = new f3.c(-1, -1);
        cVar.f20091a = 0;
        cVar.f20092b = 0.5f;
        return cVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f3.c cVar = new f3.c(layoutParams);
        cVar.f20091a = 0;
        cVar.f20092b = 0.5f;
        return cVar;
    }
}
