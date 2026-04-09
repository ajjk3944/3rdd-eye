package jd;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.material.tabs.TabLayout;
import e4.v0;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f27517l = 0;

    /* renamed from: a, reason: collision with root package name */
    public h f27518a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f27519b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f27520c;

    /* renamed from: d, reason: collision with root package name */
    public View f27521d;

    /* renamed from: e, reason: collision with root package name */
    public lc.a f27522e;

    /* renamed from: f, reason: collision with root package name */
    public View f27523f;
    public TextView g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f27524h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f27525i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TabLayout f27526k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TabLayout tabLayout, Context context) {
        super(context);
        this.f27526k = tabLayout;
        this.j = 2;
        e(context);
        setPaddingRelative(tabLayout.f20574e, tabLayout.f20575f, tabLayout.g, tabLayout.f20576h);
        setGravity(17);
        setOrientation(!tabLayout.D ? 1 : 0);
        setClickable(true);
        v0.q(this, Build.VERSION.SDK_INT >= 24 ? new p6.i(j4.j(getContext())) : new p6.i((Object) null));
    }

    private lc.a getBadge() {
        return this.f27522e;
    }

    private lc.a getOrCreateBadge() {
        if (this.f27522e == null) {
            this.f27522e = new lc.a(getContext());
        }
        b();
        lc.a aVar = this.f27522e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.f27522e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f27521d;
            if (view != null) {
                lc.a aVar = this.f27522e;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f27521d = null;
            }
        }
    }

    public final void b() {
        if (this.f27522e != null) {
            if (this.f27523f != null) {
                a();
                return;
            }
            TextView textView = this.f27519b;
            if (textView == null || this.f27518a == null) {
                a();
                return;
            }
            if (this.f27521d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.f27519b;
            if (this.f27522e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            lc.a aVar = this.f27522e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(textView2, null);
            if (aVar.d() != null) {
                aVar.d().setForeground(aVar);
            } else {
                textView2.getOverlay().add(aVar);
            }
            this.f27521d = textView2;
        }
    }

    public final void c(View view) {
        lc.a aVar = this.f27522e;
        if (aVar == null || view != this.f27521d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.i(view, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            r3.f()
            jd.h r0 = r3.f27518a
            if (r0 == 0) goto L20
            com.google.android.material.tabs.TabLayout r1 = r0.f27510d
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L20
            int r0 = r0.f27508b
            if (r1 != r0) goto L20
            r0 = 1
            goto L21
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Tab not attached to a TabLayout"
            r0.<init>(r1)
            throw r0
        L20:
            r0 = 0
        L21:
            r3.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.k.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f27525i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f27525i.setState(drawableState)) {
            invalidate();
            this.f27526k.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, jd.k] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.graphics.drawable.RippleDrawable] */
    public final void e(Context context) {
        TabLayout tabLayout = this.f27526k;
        int i4 = tabLayout.f20587t;
        if (i4 != 0) {
            Drawable drawableL = jm.a.l(i4, context);
            this.f27525i = drawableL;
            if (drawableL != null && drawableL.isStateful()) {
                this.f27525i.setState(getDrawableState());
            }
        } else {
            this.f27525i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f20581n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.f20581n;
            int iA = cd.a.a(colorStateList, cd.a.f2843c);
            int[] iArr = cd.a.f2842b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{cd.a.f2844d, iArr, StateSet.NOTHING}, new int[]{iA, cd.a.a(colorStateList, iArr), cd.a.a(colorStateList, cd.a.f2841a)});
            boolean z3 = tabLayout.H;
            if (z3) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z3 ? null : gradientDrawable2);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i4;
        ViewParent parent;
        h hVar = this.f27518a;
        View view = hVar != null ? hVar.f27509c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f27523f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f27523f);
                }
                addView(view);
            }
            this.f27523f = view;
            TextView textView = this.f27519b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f27520c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f27520c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.f27524h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f27523f;
            if (view3 != null) {
                removeView(view3);
                this.f27523f = null;
            }
            this.g = null;
            this.f27524h = null;
        }
        if (this.f27523f == null) {
            if (this.f27520c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.liuzh.deviceinfo.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f27520c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f27519b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.liuzh.deviceinfo.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f27519b = textView3;
                addView(textView3);
                this.j = this.f27519b.getMaxLines();
            }
            TextView textView4 = this.f27519b;
            TabLayout tabLayout = this.f27526k;
            textView4.setTextAppearance(tabLayout.f20577i);
            if (!isSelected() || (i4 = tabLayout.f20578k) == -1) {
                this.f27519b.setTextAppearance(tabLayout.j);
            } else {
                this.f27519b.setTextAppearance(i4);
            }
            ColorStateList colorStateList = tabLayout.f20579l;
            if (colorStateList != null) {
                this.f27519b.setTextColor(colorStateList);
            }
            g(this.f27519b, this.f27520c, true);
            b();
            ImageView imageView3 = this.f27520c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new j(this, imageView3));
            }
            TextView textView5 = this.f27519b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new j(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.f27524h != null) {
                g(textView6, this.f27524h, false);
            }
        }
        if (hVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z3) {
        boolean z10;
        h hVar = this.f27518a;
        CharSequence charSequence = hVar != null ? hVar.f27507a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z10 = false;
            } else {
                this.f27518a.getClass();
                z10 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z10 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z3 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iD = (z10 && imageView.getVisibility() == 0) ? (int) m.d(8, getContext()) : 0;
            if (this.f27526k.D) {
                if (iD != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iD);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iD != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iD;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            pd.b.s(this, zIsEmpty ? null : charSequence);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f27519b, this.f27520c, this.f27523f};
        int iMax = 0;
        int iMin = 0;
        boolean z3 = false;
        for (int i4 = 0; i4 < 3; i4++) {
            View view = viewArr[i4];
            if (view != null && view.getVisibility() == 0) {
                iMin = z3 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z3 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z3 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f27519b, this.f27520c, this.f27523f};
        int iMax = 0;
        int iMin = 0;
        boolean z3 = false;
        for (int i4 = 0; i4 < 3; i4++) {
            View view = viewArr[i4];
            if (view != null && view.getVisibility() == 0) {
                iMin = z3 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z3 ? Math.max(iMax, view.getRight()) : view.getRight();
                z3 = true;
            }
        }
        return iMax - iMin;
    }

    public h getTab() {
        return this.f27518a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r7 = this;
            super.onInitializeAccessibilityNodeInfo(r8)
            lc.a r0 = r7.f27522e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L85
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L85
            lc.a r0 = r7.f27522e
            lc.c r3 = r0.f28656e
            boolean r4 = r0.isVisible()
            r5 = 0
            if (r4 != 0) goto L1c
            goto L82
        L1c:
            lc.b r3 = r3.f28688b
            java.lang.String r4 = r3.j
            if (r4 == 0) goto L24
            r4 = r2
            goto L25
        L24:
            r4 = r1
        L25:
            if (r4 == 0) goto L33
            java.lang.CharSequence r5 = r3.f28675o
            if (r5 == 0) goto L2c
            goto L82
        L2c:
            lc.c r0 = r0.f28656e
            lc.b r0 = r0.f28688b
            java.lang.String r5 = r0.j
            goto L82
        L33:
            boolean r4 = r0.g()
            if (r4 == 0) goto L80
            int r4 = r3.f28677q
            if (r4 == 0) goto L82
            java.lang.ref.WeakReference r4 = r0.f28652a
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L48
            goto L82
        L48:
            int r5 = r0.f28658h
            r6 = -2
            if (r5 == r6) goto L65
            int r5 = r0.e()
            int r6 = r0.f28658h
            if (r5 > r6) goto L56
            goto L65
        L56:
            int r0 = r3.f28678r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r3
            java.lang.String r5 = r4.getString(r0, r5)
            goto L82
        L65:
            android.content.res.Resources r4 = r4.getResources()
            int r3 = r3.f28677q
            int r5 = r0.e()
            int r0 = r0.e()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r0
            java.lang.String r5 = r4.getQuantityString(r3, r5, r6)
            goto L82
        L80:
            java.lang.CharSequence r5 = r3.f28676p
        L82:
            r8.setContentDescription(r5)
        L85:
            jd.h r0 = r7.f27518a
            int r0 = r0.f27508b
            boolean r3 = r7.isSelected()
            f4.e r0 = f4.e.a(r1, r2, r0, r2, r3)
            java.lang.Object r0 = r0.f23649a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            r8.setCollectionItemInfo(r0)
            boolean r0 = r7.isSelected()
            if (r0 == 0) goto Laa
            r8.setClickable(r1)
            f4.c r0 = f4.c.f23632e
            java.lang.Object r0 = r0.f23645a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r8.removeAction(r0)
        Laa:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131887232(0x7f120480, float:1.9409065E38)
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r8 = r8.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            r8.putCharSequence(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.k.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        TabLayout tabLayout = this.f27526k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i4 = View.MeasureSpec.makeMeasureSpec(tabLayout.f20588u, LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i4, i10);
        if (this.f27519b != null) {
            float f10 = tabLayout.f20584q;
            if (isSelected() && tabLayout.f20578k != -1) {
                f10 = tabLayout.f20585r;
            }
            int i11 = this.j;
            ImageView imageView = this.f27520c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f27519b;
                if (textView != null && textView.getLineCount() > 1) {
                    f10 = tabLayout.f20586s;
                }
            } else {
                i11 = 1;
            }
            float textSize = this.f27519b.getTextSize();
            int lineCount = this.f27519b.getLineCount();
            int maxLines = this.f27519b.getMaxLines();
            if (f10 != textSize || (maxLines >= 0 && i11 != maxLines)) {
                if (tabLayout.C == 1 && f10 > textSize && lineCount == 1) {
                    Layout layout = this.f27519b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f27519b.setTextSize(0, f10);
                this.f27519b.setMaxLines(i11);
                super.onMeasure(i4, i10);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f27518a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        h hVar = this.f27518a;
        TabLayout tabLayout = hVar.f27510d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.h(hVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z3) {
        isSelected();
        super.setSelected(z3);
        TextView textView = this.f27519b;
        if (textView != null) {
            textView.setSelected(z3);
        }
        ImageView imageView = this.f27520c;
        if (imageView != null) {
            imageView.setSelected(z3);
        }
        View view = this.f27523f;
        if (view != null) {
            view.setSelected(z3);
        }
    }

    public void setTab(h hVar) {
        if (hVar != this.f27518a) {
            this.f27518a = hVar;
            d();
        }
    }
}
