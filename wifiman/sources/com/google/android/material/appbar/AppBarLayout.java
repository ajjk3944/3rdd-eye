package com.google.android.material.appbar;

import F1.C2736a;
import F1.W;
import G1.t;
import O3.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f.AbstractC5487d;
import java.lang.ref.WeakReference;
import java.util.List;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
public abstract class AppBarLayout extends LinearLayout {

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a {

        /* renamed from: k, reason: collision with root package name */
        private int f36953k;

        /* renamed from: l, reason: collision with root package name */
        private int f36954l;

        /* renamed from: m, reason: collision with root package name */
        private b f36955m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference f36956n;

        class a extends C2736a {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f36957d;

            a(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f36957d = coordinatorLayout;
            }

            @Override // F1.C2736a
            public void g(View view, t tVar) {
                super.g(view, tVar);
                tVar.g0(ScrollView.class.getName());
                throw null;
            }

            @Override // F1.C2736a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    throw null;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.L() == 0) {
                    return false;
                }
                if (BaseBehavior.this.U(this.f36957d).canScrollVertically(-1)) {
                    throw null;
                }
                throw null;
            }
        }

        protected static class b extends L1.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            boolean f36959c;

            /* renamed from: d, reason: collision with root package name */
            boolean f36960d;

            /* renamed from: e, reason: collision with root package name */
            int f36961e;

            /* renamed from: f, reason: collision with root package name */
            float f36962f;

            /* renamed from: g, reason: collision with root package name */
            boolean f36963g;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f36959c = parcel.readByte() != 0;
                this.f36960d = parcel.readByte() != 0;
                this.f36961e = parcel.readInt();
                this.f36962f = parcel.readFloat();
                this.f36963g = parcel.readByte() != 0;
            }

            @Override // L1.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f36959c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f36960d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f36961e);
                parcel.writeFloat(this.f36962f);
                parcel.writeByte(this.f36963g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (W.L(coordinatorLayout)) {
                return;
            }
            W.m0(coordinatorLayout, new a(appBarLayout, coordinatorLayout));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View U(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.e) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private void j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            AbstractC5487d.a(view);
            return e0(coordinatorLayout, null, view2, view3, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AbstractC5487d.a(view);
            f0(coordinatorLayout, null, view2, i10);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ boolean G(View view) {
            AbstractC5487d.a(view);
            return T(null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int J(View view) {
            AbstractC5487d.a(view);
            return V(null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int K(View view) {
            AbstractC5487d.a(view);
            return W(null);
        }

        @Override // com.google.android.material.appbar.a
        int L() {
            return E() + this.f36953k;
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            AbstractC5487d.a(view);
            X(coordinatorLayout, null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AbstractC5487d.a(view);
            return i0(coordinatorLayout, null, i10, i11, i12);
        }

        boolean T(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f36956n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        int V(AppBarLayout appBarLayout) {
            throw null;
        }

        int W(AppBarLayout appBarLayout) {
            throw null;
        }

        void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            j0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            super.l(coordinatorLayout, appBarLayout, i10);
            throw null;
        }

        public boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            throw null;
        }

        public void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            if (i11 != 0 && i11 >= 0) {
                throw null;
            }
            throw null;
        }

        public void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                throw null;
            }
            if (i13 == 0) {
                S(coordinatorLayout, appBarLayout);
            }
        }

        public void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof b) {
                g0((b) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f36955m.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f36955m = null;
            }
        }

        public Parcelable d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            b bVarH0 = h0(parcelableY, appBarLayout);
            return bVarH0 == null ? parcelableY : bVarH0;
        }

        public boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            if ((i10 & 2) != 0) {
                throw null;
            }
            this.f36956n = null;
            this.f36954l = i11;
            return false;
        }

        public void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f36954l == 0 || i10 == 1) {
                j0(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f36956n = new WeakReference(view);
        }

        void g0(b bVar, boolean z10) {
            if (this.f36955m == null || z10) {
                this.f36955m = bVar;
            }
        }

        b h0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        int i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int iL = L();
            if (i11 == 0 || iL < i11 || iL > i12) {
                this.f36953k = 0;
            } else if (iL != AbstractC8707a.b(i10, i11, i12)) {
                throw null;
            }
            S(coordinatorLayout, appBarLayout);
            return 0;
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AbstractC5487d.a(view);
            return Y(coordinatorLayout, null, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            AbstractC5487d.a(view);
            return Z(coordinatorLayout, null, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            AbstractC5487d.a(view);
            a0(coordinatorLayout, null, view2, i10, i11, iArr, i12);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            AbstractC5487d.a(view);
            b0(coordinatorLayout, null, view2, i10, i11, i12, i13, i14, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AbstractC5487d.a(view);
            c0(coordinatorLayout, null, parcelable);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            AbstractC5487d.a(view);
            return d0(coordinatorLayout, null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.Y(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.Z(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.a0(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.b0(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.c0(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.d0(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.e0(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.f0(coordinatorLayout, appBarLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private void P(View view, View view2) {
            CoordinatorLayout.b bVarE = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (bVarE instanceof BaseBehavior) {
                W.X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVarE).f36953k) + K()) - H(view2));
            }
        }

        private void Q(View view, View view2) {
        }

        @Override // com.google.android.material.appbar.b
        /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        @Override // com.google.android.material.appbar.b
        float I(View view) {
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int J(View view) {
            return super.J(view);
        }

        AppBarLayout O(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            O(coordinatorLayout.q(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17393e4);
            M(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17401f4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
