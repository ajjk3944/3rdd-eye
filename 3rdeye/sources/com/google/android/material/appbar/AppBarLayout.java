package com.google.android.material.appbar;

import B7.d;
import D0.a;
import E.u;
import L0.I;
import L0.InterfaceC0784o;
import L0.S;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l4.C5287f;

/* loaded from: classes2.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: b, reason: collision with root package name */
    public int f22448b;

    /* renamed from: c, reason: collision with root package name */
    public int f22449c;

    /* renamed from: d, reason: collision with root package name */
    public int f22450d;

    /* renamed from: e, reason: collision with root package name */
    public int f22451e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22452f;

    /* renamed from: g, reason: collision with root package name */
    public int f22453g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22454h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22455j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22456k;

    /* renamed from: l, reason: collision with root package name */
    public int f22457l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference<View> f22458m;

    /* renamed from: n, reason: collision with root package name */
    public ValueAnimator f22459n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f22460o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f22461p;

    /* renamed from: q, reason: collision with root package name */
    public Behavior f22462q;

    public static class BaseBehavior<T extends AppBarLayout> extends M3.a<T> {

        /* renamed from: j, reason: collision with root package name */
        public int f22463j;

        /* renamed from: k, reason: collision with root package name */
        public int f22464k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f22465l;

        /* renamed from: m, reason: collision with root package name */
        public a f22466m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference<View> f22467n;

        public static class a extends U0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0339a();

            /* renamed from: d, reason: collision with root package name */
            public boolean f22468d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f22469e;

            /* renamed from: f, reason: collision with root package name */
            public int f22470f;

            /* renamed from: g, reason: collision with root package name */
            public float f22471g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f22472h;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            public class C0339a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new a[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f22468d = parcel.readByte() != 0;
                this.f22469e = parcel.readByte() != 0;
                this.f22470f = parcel.readInt();
                this.f22471g = parcel.readFloat();
                this.f22472h = parcel.readByte() != 0;
            }

            @Override // U0.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f22468d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f22469e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f22470f);
                parcel.writeFloat(this.f22471g);
                parcel.writeByte(this.f22472h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f15468a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0784o) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void H(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r0 = 1
                int r1 = java.lang.Math.abs(r9)
                int r2 = r8.getChildCount()
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L20
                android.view.View r5 = r8.getChildAt(r4)
                int r6 = r5.getTop()
                if (r1 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r1 > r6) goto L1e
                goto L21
            L1e:
                int r4 = r4 + r0
                goto Lb
            L20:
                r5 = 0
            L21:
                if (r5 == 0) goto L5c
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f22475a
                r2 = r1 & 1
                if (r2 == 0) goto L5c
                java.util.WeakHashMap<android.view.View, L0.S> r2 = L0.I.f3792a
                int r2 = r5.getMinimumHeight()
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
            L48:
                r9 = r0
                goto L5d
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5c
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
                goto L48
            L5c:
                r9 = r3
            L5d:
                boolean r10 = r8.f22456k
                if (r10 == 0) goto L69
                android.view.View r9 = D(r7)
                boolean r9 = r8.e(r9)
            L69:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto La8
                if (r9 == 0) goto Lcf
                G5.c r9 = r7.f15449c
                java.lang.Object r9 = r9.f1911b
                m0.i r9 = (m0.C5316i) r9
                java.lang.Object r9 = r9.get(r8)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f15451e
                r7.clear()
                if (r9 == 0) goto L87
                r7.addAll(r9)
            L87:
                int r9 = r7.size()
            L8b:
                if (r3 >= r9) goto Lcf
                java.lang.Object r10 = r7.get(r3)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f15468a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto La6
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r7 = r10.f4172f
                if (r7 == 0) goto Lcf
                goto La8
            La6:
                int r3 = r3 + r0
                goto L8b
            La8:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lb5
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lb5:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lc2
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lc2:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Lcf
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Lcf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.H(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(t() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iT = t();
            if (iT == i) {
                ValueAnimator valueAnimator = this.f22465l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f22465l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f22465l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f22465l = valueAnimator3;
                valueAnimator3.setInterpolator(L3.a.f4038e);
                this.f22465l.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f22465l.setDuration(Math.min(iRound, 600));
            this.f22465l.setIntValues(iT, i);
            this.f22465l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void E(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.t()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.z(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.f22456k
                if (r9 == 0) goto L37
                boolean r9 = r4.e(r11)
                r4.d(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final a F(Parcelable parcelable, T t10) {
            int iS = s();
            int childCount = t10.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t10.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = U0.a.f12347c;
                    }
                    a aVar = new a(parcelable);
                    boolean z10 = iS == 0;
                    aVar.f22469e = z10;
                    aVar.f22468d = !z10 && (-iS) >= t10.getTotalScrollRange();
                    aVar.f22470f = i;
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    aVar.f22472h = bottom == t10.getTopInset() + childAt.getMinimumHeight();
                    aVar.f22471g = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t10) {
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int iT = t() - paddingTop;
            int childCount = t10.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t10.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.f22475a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i10 = -iT;
                if (top <= i10 && bottom >= i10) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t10.getChildAt(i);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i11 = cVar2.f22475a;
                if ((i11 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        if (t10.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= t10.getTopInset();
                        }
                    }
                    if ((i11 & 2) == 2) {
                        WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i11 & 5) == 5) {
                        WeakHashMap<View, S> weakHashMap3 = I.f3792a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iT < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i11 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iT < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, t10, d.h(topInset + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // M3.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            a aVar = this.f22466m;
            if (aVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i10 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            C(coordinatorLayout, appBarLayout, i10);
                        } else {
                            A(coordinatorLayout, appBarLayout, i10);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.f22468d) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (aVar.f22469e) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(aVar.f22470f);
                int i11 = -childAt.getBottom();
                if (this.f22466m.f22472h) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i11;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f22466m.f22471g) + i11;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f22453g = 0;
            this.f22466m = null;
            int iH = d.h(s(), -appBarLayout.getTotalScrollRange(), 0);
            M3.d dVar = this.f4173a;
            if (dVar == null) {
                this.f4174b = iH;
            } else if (dVar.f4177c != iH) {
                dVar.f4177c = iH;
                dVar.b();
            }
            H(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f22448b = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                appBarLayout.postInvalidateOnAnimation();
            }
            if (I.e(coordinatorLayout) != null) {
                return true;
            }
            I.o(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10, int[] iArr, int i11) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, t() - i11, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i11 == 0 && I.e(coordinatorLayout2) == null) {
                I.o(coordinatorLayout2, new com.google.android.material.appbar.b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof a) {
                this.f22466m = (a) parcelable;
            } else {
                this.f22466m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            a aVarF = F(absSavedState, (AppBarLayout) view);
            return aVarF == null ? absSavedState : aVarF;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i10) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i & 2) != 0 && (appBarLayout.f22456k || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f22465l) != null) {
                valueAnimator.cancel();
            }
            this.f22467n = null;
            this.f22464k = i10;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f22464k == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f22456k) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f22467n = new WeakReference<>(view2);
        }

        @Override // M3.c
        public final int t() {
            return s() + this.f22463j;
        }

        @Override // M3.a
        public final boolean v(View view) {
            WeakReference<View> weakReference = this.f22467n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // M3.a
        public final int w(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // M3.a
        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // M3.a
        public final void y(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.f22456k) {
                appBarLayout.d(appBarLayout.e(D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
        @Override // M3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 389
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends M3.b {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iH;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f15468a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f22463j + this.f4171e;
                if (this.f4172f == 0) {
                    iH = 0;
                } else {
                    float fW = w(view2);
                    int i = this.f4172f;
                    iH = d.h((int) (fW * i), 0, i);
                }
                int i10 = bottom - iH;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                view.offsetTopAndBottom(i10);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f22456k) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                I.o(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f4169c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.f22453g = (z10 ? 0 : 4) | 10;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // M3.b
        public final AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // M3.b
        public final float w(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f15468a;
                int iT = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).t() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iT > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iT / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // M3.b
        public final int x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3135w);
            this.f4172f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f22473a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f22474b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f22475a;

        /* renamed from: b, reason: collision with root package name */
        public b f22476b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f22477c;
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.f22475a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f22475a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.f22475a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f22475a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3114a);
        cVar.f22475a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.f22476b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f22477c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        BaseBehavior.a aVarF = (this.f22449c == -1 || this.f22453g != 0) ? null : this.f22462q.F(U0.a.f12347c, this);
        this.f22449c = -1;
        this.f22450d = -1;
        this.f22451e = -1;
        if (aVarF != null) {
            Behavior behavior = this.f22462q;
            if (behavior.f22466m != null) {
                return;
            }
            behavior.f22466m = aVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z10) {
        if (this.f22454h || this.f22455j == z10) {
            return false;
        }
        this.f22455j = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof C5287f) || !this.f22456k) {
            return true;
        }
        ValueAnimator valueAnimator = this.f22459n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.f22459n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(0L);
        this.f22459n.setInterpolator(null);
        this.f22459n.start();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22461p == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f22448b);
        this.f22461p.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f22461p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i;
        if (this.f22458m == null && (i = this.f22457l) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f22457l);
            }
            if (viewFindViewById != null) {
                this.f22458m = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f22458m;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f22475a = 1;
        return cVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f22462q = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.f22450d
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r7 = (com.google.android.material.appbar.AppBarLayout.c) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.f22475a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, L0.S> r7 = L0.I.f3792a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, L0.S> r7 = L0.I.f3792a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap<android.view.View, L0.S> r9 = L0.I.f3792a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.f22450d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.f22451e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i11 = cVar.f22475a;
                if ((i11 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i11 & 2) != 0) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f22451e = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f22457l;
    }

    public C5287f getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C5287f) {
            return (C5287f) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f22453g;
    }

    public Drawable getStatusBarForeground() {
        return this.f22461p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f22449c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = cVar.f22475a;
                if ((i11 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i10 == 0) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i11 & 2) != 0) {
                    WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f22449c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C5287f) {
            u.N(this, (C5287f) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f22460o == null) {
            this.f22460o = new int[4];
        }
        int[] iArr = this.f22460o;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z10 = this.i;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969779;
        iArr[1] = (z10 && this.f22455j) ? R.attr.state_lifted : -2130969780;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969775;
        iArr[3] = (z10 && this.f22455j) ? R.attr.state_collapsed : -2130969774;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f22458m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22458m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        boolean z11 = true;
        super.onLayout(z10, i, i10, i11, i12);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f22452f = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i13).getLayoutParams()).f22477c != null) {
                this.f22452f = true;
                break;
            }
            i13++;
        }
        Drawable drawable = this.f22461p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f22454h) {
            return;
        }
        if (!this.f22456k) {
            int childCount3 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i15 = ((c) getChildAt(i14).getLayoutParams()).f22475a;
                if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (this.i != z11) {
            this.i = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = d.h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof C5287f) {
            ((C5287f) background).j(f10);
        }
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        this.f22453g = (z10 ? 1 : 2) | (isLaidOut() ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z10) {
        this.f22456k = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f22457l = -1;
        if (view != null) {
            this.f22458m = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f22458m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22458m = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f22457l = i;
        WeakReference<View> weakReference = this.f22458m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22458m = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f22454h = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f22461p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f22461p = drawableMutate;
            if (drawableMutate instanceof C5287f) {
                int i = ((C5287f) drawableMutate).f43778v;
            } else {
                ColorStateList colorStateListA = Z3.a.a(drawableMutate);
                if (colorStateListA != null) {
                    colorStateListA.getDefaultColor();
                }
            }
            Drawable drawable3 = this.f22461p;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f22461p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f22461p;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                a.b.b(drawable4, getLayoutDirection());
                this.f22461p.setVisible(getVisibility() == 0, false);
                this.f22461p.setCallback(this);
            }
            if (this.f22461p != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap<View, S> weakHashMap2 = I.f3792a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(A9.I.w(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j4 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130969780}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j4));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f10).setDuration(j4));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.f22461p;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22461p;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f22475a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
