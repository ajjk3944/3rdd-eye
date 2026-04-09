package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k, reason: collision with root package name */
    private static final Interpolator f1069k = new DecelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    Runnable f1070b;

    /* renamed from: c, reason: collision with root package name */
    private c f1071c;

    /* renamed from: d, reason: collision with root package name */
    i0 f1072d;

    /* renamed from: e, reason: collision with root package name */
    private Spinner f1073e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1074f;

    /* renamed from: g, reason: collision with root package name */
    int f1075g;

    /* renamed from: h, reason: collision with root package name */
    int f1076h;

    /* renamed from: i, reason: collision with root package name */
    private int f1077i;

    /* renamed from: j, reason: collision with root package name */
    private int f1078j;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1079b;

        a(View view) {
            this.f1079b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f1079b.getLeft() - ((p0.this.getWidth() - this.f1079b.getWidth()) / 2), 0);
            p0.this.f1070b = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f1072d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) p0.this.f1072d.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f1072d.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = p0.this.f1072d.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1083b;

        /* renamed from: c, reason: collision with root package name */
        private a.c f1084c;

        /* renamed from: d, reason: collision with root package name */
        private TextView f1085d;

        /* renamed from: e, reason: collision with root package name */
        private ImageView f1086e;

        /* renamed from: f, reason: collision with root package name */
        private View f1087f;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z2) {
            int i2 = a.a.f3d;
            super(context, null, i2);
            int[] iArr = {R.attr.background};
            this.f1083b = iArr;
            this.f1084c = cVar;
            w0 w0VarT = w0.t(context, null, iArr, i2, 0);
            if (w0VarT.q(0)) {
                setBackgroundDrawable(w0VarT.f(0));
            }
            w0VarT.u();
            if (z2) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f1084c = cVar;
            c();
        }

        public a.c b() {
            return this.f1084c;
        }

        public void c() {
            a.c cVar = this.f1084c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1087f = viewB;
                TextView textView = this.f1085d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1086e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1086e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1087f;
            if (view != null) {
                removeView(view);
                this.f1087f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1086e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1086e = oVar;
                }
                this.f1086e.setImageDrawable(drawableC);
                this.f1086e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1086e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1086e.setImageDrawable(null);
                }
            }
            boolean z2 = !TextUtils.isEmpty(charSequenceD);
            if (z2) {
                if (this.f1085d == null) {
                    z zVar = new z(getContext(), null, a.a.f4e);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f1085d = zVar;
                }
                this.f1085d.setText(charSequenceD);
                this.f1085d.setVisibility(0);
            } else {
                TextView textView2 = this.f1085d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1085d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1086e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            y0.a(this, z2 ? null : cVar.a());
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
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (p0.this.f1075g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = p0.this.f1075g;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            boolean z3 = isSelected() != z2;
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, a.a.f7h);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f1073e;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1073e == null) {
            this.f1073e = b();
        }
        removeView(this.f1072d);
        addView(this.f1073e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1073e.getAdapter() == null) {
            this.f1073e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1070b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1070b = null;
        }
        this.f1073e.setSelection(this.f1078j);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1073e);
        addView(this.f1072d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1073e.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f1072d.getChildAt(i2);
        Runnable runnable = this.f1070b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1070b = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z2) {
        d dVar = new d(getContext(), cVar, z2);
        if (z2) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1077i));
        } else {
            dVar.setFocusable(true);
            if (this.f1071c == null) {
                this.f1071c = new c();
            }
            dVar.setOnClickListener(this.f1071c);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1070b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f.a aVarB = f.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1076h = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1070b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.i0 r4 = r6.f1072d
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3f
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3f
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2f
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.f1075g = r8
            goto L36
        L2f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.f1075g = r4
        L36:
            int r8 = r6.f1075g
            int r4 = r6.f1076h
            int r8 = java.lang.Math.min(r8, r4)
            goto L40
        L3f:
            r8 = -1
        L40:
            r6.f1075g = r8
            int r8 = r6.f1077i
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4f
            boolean r2 = r6.f1074f
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 == 0) goto L67
            androidx.appcompat.widget.i0 r0 = r6.f1072d
            r0.measure(r1, r8)
            androidx.appcompat.widget.i0 r0 = r6.f1072d
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L67
            r6.e()
            goto L6a
        L67:
            r6.f()
        L6a:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7e
            if (r0 == r7) goto L7e
            int r7 = r6.f1078j
            r6.setTabSelected(r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z2) {
        this.f1074f = z2;
    }

    public void setContentHeight(int i2) {
        this.f1077i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1078j = i2;
        int childCount = this.f1072d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f1072d.getChildAt(i3);
            boolean z2 = i3 == i2;
            childAt.setSelected(z2);
            if (z2) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f1073e;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}
