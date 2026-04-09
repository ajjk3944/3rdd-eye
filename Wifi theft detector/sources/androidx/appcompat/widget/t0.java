package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class t0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: l, reason: collision with root package name */
    public static final Interpolator f1319l = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Runnable f1320a;

    /* renamed from: b, reason: collision with root package name */
    public c f1321b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayoutCompat f1322c;

    /* renamed from: d, reason: collision with root package name */
    public Spinner f1323d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1324e;

    /* renamed from: f, reason: collision with root package name */
    public int f1325f;

    /* renamed from: g, reason: collision with root package name */
    public int f1326g;

    /* renamed from: h, reason: collision with root package name */
    public int f1327h;

    /* renamed from: i, reason: collision with root package name */
    public int f1328i;

    /* renamed from: j, reason: collision with root package name */
    public ViewPropertyAnimator f1329j;

    /* renamed from: k, reason: collision with root package name */
    public final e f1330k;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1331a;

        public a(View view) {
            this.f1331a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.this.smoothScrollTo(this.f1331a.getLeft() - ((t0.this.getWidth() - this.f1331a.getWidth()) / 2), 0);
            t0.this.f1320a = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return t0.this.f1322c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            ((d) t0.this.f1322c.getChildAt(i10)).b();
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                t0 t0Var = t0.this;
                androidx.appcompat.app.z.a(getItem(i10));
                return t0Var.d(null, true);
            }
            androidx.appcompat.app.z.a(getItem(i10));
            ((d) view).a(null);
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b();
            throw null;
        }
    }

    public class d extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f1335a;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, ActionBar.b bVar, boolean z10) {
            int i10 = c.a.actionBarTabStyle;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f1335a = iArr;
            z0 z0VarV = z0.v(context, null, iArr, i10, 0);
            if (z0VarV.s(0)) {
                setBackgroundDrawable(z0VarV.g(0));
            }
            z0VarV.x();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(ActionBar.b bVar) {
            c();
        }

        public ActionBar.b b() {
            return null;
        }

        public void c() {
            throw null;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (t0.this.f1325f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = t0.this.f1325f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1337a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1338b;

        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1337a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1337a) {
                return;
            }
            t0 t0Var = t0.this;
            t0Var.f1329j = null;
            t0Var.setVisibility(this.f1338b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t0.this.setVisibility(0);
            this.f1337a = false;
        }
    }

    public t0(@NonNull Context context) {
        super(context);
        this.f1330k = new e();
        setHorizontalScrollBarEnabled(false);
        h.a aVarB = h.a.b(context);
        setContentHeight(aVarB.f());
        this.f1326g = aVarB.e();
        LinearLayoutCompat linearLayoutCompatC = c();
        this.f1322c = linearLayoutCompatC;
        addView(linearLayoutCompatC, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(int i10) {
        View childAt = this.f1322c.getChildAt(i10);
        Runnable runnable = this.f1320a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1320a = aVar;
        post(aVar);
    }

    public final Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, c.a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public final LinearLayoutCompat c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, c.a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        return linearLayoutCompat;
    }

    public d d(ActionBar.b bVar, boolean z10) {
        d dVar = new d(getContext(), bVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1327h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f1321b == null) {
            this.f1321b = new c();
        }
        dVar.setOnClickListener(this.f1321b);
        return dVar;
    }

    public final boolean e() {
        Spinner spinner = this.f1323d;
        return spinner != null && spinner.getParent() == this;
    }

    public final void f() {
        if (e()) {
            return;
        }
        if (this.f1323d == null) {
            this.f1323d = b();
        }
        removeView(this.f1322c);
        addView(this.f1323d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1323d.getAdapter() == null) {
            this.f1323d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1320a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1320a = null;
        }
        this.f1323d.setSelection(this.f1328i);
    }

    public final boolean g() {
        if (!e()) {
            return false;
        }
        removeView(this.f1323d);
        addView(this.f1322c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1323d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1320a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h.a aVarB = h.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1326g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1320a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        ((d) view).b();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1322c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1325f = -1;
        } else {
            if (childCount > 2) {
                this.f1325f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1325f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1325f = Math.min(this.f1325f, this.f1326g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1327h, 1073741824);
        if (z10 || !this.f1324e) {
            g();
        } else {
            this.f1322c.measure(0, iMakeMeasureSpec);
            if (this.f1322c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                f();
            } else {
                g();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1328i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1324e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1327h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1328i = i10;
        int childCount = this.f1322c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1322c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1323d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
