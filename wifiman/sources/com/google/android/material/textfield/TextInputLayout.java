package com.google.android.material.textfield;

import F1.AbstractC2777v;
import F1.C2736a;
import F1.W;
import a4.AbstractC3764d;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C3886k;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.b0;
import androidx.transition.C4028c;
import com.google.android.material.internal.CheckableImageButton;
import f4.C5527g;
import f4.C5531k;
import i.AbstractC6050a;
import i4.AbstractC6074a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t1.AbstractC8021a;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: T1, reason: collision with root package name */
    private static final int f37680T1 = O3.i.f17143e;

    /* renamed from: U1, reason: collision with root package name */
    private static final int[][] f37681U1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f37682A;

    /* renamed from: A1, reason: collision with root package name */
    private ColorStateList f37683A1;

    /* renamed from: B, reason: collision with root package name */
    private ColorStateList f37684B;

    /* renamed from: B1, reason: collision with root package name */
    private int f37685B1;

    /* renamed from: C, reason: collision with root package name */
    private boolean f37686C;

    /* renamed from: C1, reason: collision with root package name */
    private int f37687C1;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f37688D;

    /* renamed from: D1, reason: collision with root package name */
    private int f37689D1;

    /* renamed from: E, reason: collision with root package name */
    private boolean f37690E;

    /* renamed from: E1, reason: collision with root package name */
    private ColorStateList f37691E1;

    /* renamed from: F, reason: collision with root package name */
    private C5527g f37692F;

    /* renamed from: F1, reason: collision with root package name */
    private int f37693F1;

    /* renamed from: G, reason: collision with root package name */
    private C5527g f37694G;

    /* renamed from: G1, reason: collision with root package name */
    private int f37695G1;

    /* renamed from: H, reason: collision with root package name */
    private StateListDrawable f37696H;

    /* renamed from: H1, reason: collision with root package name */
    private int f37697H1;

    /* renamed from: I, reason: collision with root package name */
    private boolean f37698I;

    /* renamed from: I1, reason: collision with root package name */
    private int f37699I1;

    /* renamed from: J, reason: collision with root package name */
    private C5527g f37700J;

    /* renamed from: J1, reason: collision with root package name */
    private int f37701J1;

    /* renamed from: K1, reason: collision with root package name */
    int f37702K1;

    /* renamed from: L1, reason: collision with root package name */
    private boolean f37703L1;

    /* renamed from: M1, reason: collision with root package name */
    final com.google.android.material.internal.a f37704M1;

    /* renamed from: N, reason: collision with root package name */
    private C5527g f37705N;

    /* renamed from: N1, reason: collision with root package name */
    private boolean f37706N1;

    /* renamed from: O1, reason: collision with root package name */
    private boolean f37707O1;

    /* renamed from: P1, reason: collision with root package name */
    private ValueAnimator f37708P1;

    /* renamed from: Q1, reason: collision with root package name */
    private boolean f37709Q1;

    /* renamed from: R1, reason: collision with root package name */
    private boolean f37710R1;

    /* renamed from: S1, reason: collision with root package name */
    private boolean f37711S1;

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f37712a;

    /* renamed from: b, reason: collision with root package name */
    private final z f37713b;

    /* renamed from: c, reason: collision with root package name */
    private final r f37714c;

    /* renamed from: d, reason: collision with root package name */
    EditText f37715d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f37716e;

    /* renamed from: f, reason: collision with root package name */
    private int f37717f;

    /* renamed from: f1, reason: collision with root package name */
    private C5531k f37718f1;

    /* renamed from: g, reason: collision with root package name */
    private int f37719g;

    /* renamed from: g1, reason: collision with root package name */
    private boolean f37720g1;

    /* renamed from: h, reason: collision with root package name */
    private int f37721h;

    /* renamed from: h1, reason: collision with root package name */
    private final int f37722h1;

    /* renamed from: i, reason: collision with root package name */
    private int f37723i;

    /* renamed from: i1, reason: collision with root package name */
    private int f37724i1;

    /* renamed from: j, reason: collision with root package name */
    private final u f37725j;

    /* renamed from: j1, reason: collision with root package name */
    private int f37726j1;

    /* renamed from: k, reason: collision with root package name */
    boolean f37727k;

    /* renamed from: k1, reason: collision with root package name */
    private int f37728k1;

    /* renamed from: l, reason: collision with root package name */
    private int f37729l;

    /* renamed from: l1, reason: collision with root package name */
    private int f37730l1;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37731m;

    /* renamed from: m1, reason: collision with root package name */
    private int f37732m1;

    /* renamed from: n, reason: collision with root package name */
    private e f37733n;

    /* renamed from: n1, reason: collision with root package name */
    private int f37734n1;

    /* renamed from: o, reason: collision with root package name */
    private TextView f37735o;

    /* renamed from: o1, reason: collision with root package name */
    private int f37736o1;

    /* renamed from: p, reason: collision with root package name */
    private int f37737p;

    /* renamed from: p1, reason: collision with root package name */
    private final Rect f37738p1;

    /* renamed from: q, reason: collision with root package name */
    private int f37739q;

    /* renamed from: q1, reason: collision with root package name */
    private final Rect f37740q1;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f37741r;

    /* renamed from: r1, reason: collision with root package name */
    private final RectF f37742r1;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37743s;

    /* renamed from: s1, reason: collision with root package name */
    private Typeface f37744s1;

    /* renamed from: t, reason: collision with root package name */
    private TextView f37745t;

    /* renamed from: t1, reason: collision with root package name */
    private Drawable f37746t1;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f37747u;

    /* renamed from: u1, reason: collision with root package name */
    private int f37748u1;

    /* renamed from: v, reason: collision with root package name */
    private int f37749v;

    /* renamed from: v1, reason: collision with root package name */
    private final LinkedHashSet f37750v1;

    /* renamed from: w, reason: collision with root package name */
    private C4028c f37751w;

    /* renamed from: w1, reason: collision with root package name */
    private Drawable f37752w1;

    /* renamed from: x, reason: collision with root package name */
    private C4028c f37753x;

    /* renamed from: x1, reason: collision with root package name */
    private int f37754x1;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f37755y;

    /* renamed from: y1, reason: collision with root package name */
    private Drawable f37756y1;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f37757z;

    /* renamed from: z1, reason: collision with root package name */
    private ColorStateList f37758z1;

    class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        int f37759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f37760b;

        a(EditText editText) {
            this.f37760b = editText;
            this.f37759a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.u0(!r0.f37710R1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f37727k) {
                textInputLayout.k0(editable);
            }
            if (TextInputLayout.this.f37743s) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.f37760b.getLineCount();
            int i10 = this.f37759a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = W.A(this.f37760b);
                    int i11 = TextInputLayout.this.f37702K1;
                    if (iA != i11) {
                        this.f37760b.setMinimumHeight(i11);
                    }
                }
                this.f37759a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f37714c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f37704M1.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C2736a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f37764d;

        public d(TextInputLayout textInputLayout) {
            this.f37764d = textInputLayout;
        }

        @Override // F1.C2736a
        public void g(View view, G1.t tVar) {
            super.g(view, tVar);
            EditText editText = this.f37764d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f37764d.getHint();
            CharSequence error = this.f37764d.getError();
            CharSequence placeholderText = this.f37764d.getPlaceholderText();
            int counterMaxLength = this.f37764d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f37764d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f37764d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f37764d.f37713b.A(tVar);
            if (!zIsEmpty) {
                tVar.M0(text);
            } else if (!TextUtils.isEmpty(string)) {
                tVar.M0(string);
                if (!zP && placeholderText != null) {
                    tVar.M0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                tVar.M0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                tVar.s0(string);
                tVar.J0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            tVar.x0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                tVar.o0(error);
            }
            View viewT = this.f37764d.f37725j.t();
            if (viewT != null) {
                tVar.u0(viewT);
            }
            this.f37764d.f37714c.m().o(view, tVar);
        }

        @Override // F1.C2736a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f37764d.f37714c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    static class g extends L1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        CharSequence f37765c;

        /* renamed from: d, reason: collision with root package name */
        boolean f37766d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f37765c) + "}";
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f37765c, parcel, i10);
            parcel.writeInt(this.f37766d ? 1 : 0);
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37765c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f37766d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16959M);
    }

    private C4028c A() {
        C4028c c4028c = new C4028c();
        c4028c.g0(AbstractC3764d.f(getContext(), O3.a.f16987z, 87));
        c4028c.i0(AbstractC3764d.g(getContext(), O3.a.f16951E, P3.a.f18021a));
        return c4028c;
    }

    private boolean B() {
        return this.f37686C && !TextUtils.isEmpty(this.f37688D) && (this.f37692F instanceof h);
    }

    private void C() {
        Iterator it = this.f37750v1.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        C5527g c5527g;
        if (this.f37705N == null || (c5527g = this.f37700J) == null) {
            return;
        }
        c5527g.draw(canvas);
        if (this.f37715d.isFocused()) {
            Rect bounds = this.f37705N.getBounds();
            Rect bounds2 = this.f37700J.getBounds();
            float fX = this.f37704M1.x();
            int iCenterX = bounds2.centerX();
            bounds.left = P3.a.c(iCenterX, bounds2.left, fX);
            bounds.right = P3.a.c(iCenterX, bounds2.right, fX);
            this.f37705N.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f37686C) {
            this.f37704M1.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f37708P1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37708P1.cancel();
        }
        if (z10 && this.f37707O1) {
            l(0.0f);
        } else {
            this.f37704M1.c0(0.0f);
        }
        if (B() && ((h) this.f37692F).h0()) {
            y();
        }
        this.f37703L1 = true;
        L();
        this.f37713b.l(true);
        this.f37714c.H(true);
    }

    private C5527g G(boolean z10) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(O3.c.f17013T);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f37715d;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(O3.c.f17033o);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(O3.c.f17011R);
        C5531k c5531kM = C5531k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f37715d;
        C5527g c5527gM = C5527g.m(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        c5527gM.setShapeAppearanceModel(c5531kM);
        c5527gM.V(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return c5527gM;
    }

    private static Drawable H(C5527g c5527g, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{V3.a.j(i11, i10, 0.1f), i10}), c5527g, c5527g);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f37715d.getCompoundPaddingLeft() : this.f37714c.y() : this.f37713b.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f37715d.getCompoundPaddingRight() : this.f37713b.c() : this.f37714c.y());
    }

    private static Drawable K(Context context, C5527g c5527g, int i10, int[][] iArr) {
        int iC = V3.a.c(context, O3.a.f16972k, "TextInputLayout");
        C5527g c5527g2 = new C5527g(c5527g.A());
        int iJ = V3.a.j(i10, iC, 0.1f);
        c5527g2.T(new ColorStateList(iArr, new int[]{iJ, 0}));
        c5527g2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        C5527g c5527g3 = new C5527g(c5527g.A());
        c5527g3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c5527g2, c5527g3), c5527g});
    }

    private void L() {
        TextView textView = this.f37745t;
        if (textView == null || !this.f37743s) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.r.a(this.f37712a, this.f37753x);
        this.f37745t.setVisibility(4);
    }

    private boolean Q() {
        return d0() || (this.f37735o != null && this.f37731m);
    }

    private boolean S() {
        return this.f37724i1 == 1 && this.f37715d.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f37715d.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.f37724i1 != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f37742r1;
            this.f37704M1.o(rectF, this.f37715d.getWidth(), this.f37715d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f37728k1);
            ((h) this.f37692F).k0(rectF);
        }
    }

    private void X() {
        if (!B() || this.f37703L1) {
            return;
        }
        y();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f37745t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f37715d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f37724i1;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean e0() {
        return (this.f37714c.G() || ((this.f37714c.A() && M()) || this.f37714c.w() != null)) && this.f37714c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f37713b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f37745t == null || !this.f37743s || TextUtils.isEmpty(this.f37741r)) {
            return;
        }
        this.f37745t.setText(this.f37741r);
        androidx.transition.r.a(this.f37712a, this.f37751w);
        this.f37745t.setVisibility(0);
        this.f37745t.bringToFront();
        announceForAccessibility(this.f37741r);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f37715d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f37692F;
        }
        int iD = V3.a.d(this.f37715d, O3.a.f16967f);
        int i10 = this.f37724i1;
        if (i10 == 2) {
            return K(getContext(), this.f37692F, iD, f37681U1);
        }
        if (i10 == 1) {
            return H(this.f37692F, this.f37736o1, iD, f37681U1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f37696H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f37696H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f37696H.addState(new int[0], G(false));
        }
        return this.f37696H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f37694G == null) {
            this.f37694G = G(true);
        }
        return this.f37694G;
    }

    private void h0() {
        if (this.f37724i1 == 1) {
            if (c4.c.h(getContext())) {
                this.f37726j1 = getResources().getDimensionPixelSize(O3.c.f17043y);
            } else if (c4.c.g(getContext())) {
                this.f37726j1 = getResources().getDimensionPixelSize(O3.c.f17042x);
            }
        }
    }

    private void i0(Rect rect) {
        C5527g c5527g = this.f37700J;
        if (c5527g != null) {
            int i10 = rect.bottom;
            c5527g.setBounds(rect.left, i10 - this.f37730l1, rect.right, i10);
        }
        C5527g c5527g2 = this.f37705N;
        if (c5527g2 != null) {
            int i11 = rect.bottom;
            c5527g2.setBounds(rect.left, i11 - this.f37732m1, rect.right, i11);
        }
    }

    private void j() {
        TextView textView = this.f37745t;
        if (textView != null) {
            this.f37712a.addView(textView);
            this.f37745t.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f37735o != null) {
            EditText editText = this.f37715d;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        if (this.f37715d == null || this.f37724i1 != 1) {
            return;
        }
        if (c4.c.h(getContext())) {
            EditText editText = this.f37715d;
            W.z0(editText, W.E(editText), getResources().getDimensionPixelSize(O3.c.f17041w), W.D(this.f37715d), getResources().getDimensionPixelSize(O3.c.f17040v));
        } else if (c4.c.g(getContext())) {
            EditText editText2 = this.f37715d;
            W.z0(editText2, W.E(editText2), getResources().getDimensionPixelSize(O3.c.f17039u), W.D(this.f37715d), getResources().getDimensionPixelSize(O3.c.f17038t));
        }
    }

    private static void l0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? O3.h.f17118c : O3.h.f17117b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void m() {
        C5527g c5527g = this.f37692F;
        if (c5527g == null) {
            return;
        }
        C5531k c5531kA = c5527g.A();
        C5531k c5531k = this.f37718f1;
        if (c5531kA != c5531k) {
            this.f37692F.setShapeAppearanceModel(c5531k);
        }
        if (w()) {
            this.f37692F.X(this.f37728k1, this.f37734n1);
        }
        int iQ = q();
        this.f37736o1 = iQ;
        this.f37692F.T(ColorStateList.valueOf(iQ));
        n();
        r0();
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f37735o;
        if (textView != null) {
            c0(textView, this.f37731m ? this.f37737p : this.f37739q);
            if (!this.f37731m && (colorStateList2 = this.f37755y) != null) {
                this.f37735o.setTextColor(colorStateList2);
            }
            if (!this.f37731m || (colorStateList = this.f37757z) == null) {
                return;
            }
            this.f37735o.setTextColor(colorStateList);
        }
    }

    private void n() {
        if (this.f37700J == null || this.f37705N == null) {
            return;
        }
        if (x()) {
            this.f37700J.T(this.f37715d.isFocused() ? ColorStateList.valueOf(this.f37685B1) : ColorStateList.valueOf(this.f37734n1));
            this.f37705N.T(ColorStateList.valueOf(this.f37734n1));
        }
        invalidate();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f37682A;
        if (colorStateListG == null) {
            colorStateListG = V3.a.g(getContext(), O3.a.f16966e);
        }
        EditText editText = this.f37715d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = AbstractC8416a.r(this.f37715d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f37684B) != null) {
            colorStateListG = colorStateList;
        }
        AbstractC8416a.o(drawableMutate, colorStateListG);
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f37722h1;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void p() {
        int i10 = this.f37724i1;
        if (i10 == 0) {
            this.f37692F = null;
            this.f37700J = null;
            this.f37705N = null;
            return;
        }
        if (i10 == 1) {
            this.f37692F = new C5527g(this.f37718f1);
            this.f37700J = new C5527g();
            this.f37705N = new C5527g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f37724i1 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f37686C || (this.f37692F instanceof h)) {
                this.f37692F = new C5527g(this.f37718f1);
            } else {
                this.f37692F = h.g0(this.f37718f1);
            }
            this.f37700J = null;
            this.f37705N = null;
        }
    }

    private int q() {
        return this.f37724i1 == 1 ? V3.a.i(V3.a.e(this, O3.a.f16972k, 0), this.f37736o1) : this.f37736o1;
    }

    private void q0() {
        W.q0(this.f37715d, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        if (this.f37715d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f37740q1;
        boolean zG = com.google.android.material.internal.n.g(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f37724i1;
        if (i10 == 1) {
            rect2.left = I(rect.left, zG);
            rect2.top = rect.top + this.f37726j1;
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.f37715d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f37715d.getPaddingRight();
        return rect2;
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f37715d.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int iMax;
        if (this.f37715d == null || this.f37715d.getMeasuredHeight() >= (iMax = Math.max(this.f37714c.getMeasuredHeight(), this.f37713b.getMeasuredHeight()))) {
            return false;
        }
        this.f37715d.setMinimumHeight(iMax);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f37715d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f37715d = editText;
        int i10 = this.f37717f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f37721h);
        }
        int i11 = this.f37719g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f37723i);
        }
        this.f37698I = false;
        V();
        setTextInputAccessibilityDelegate(new d(this));
        this.f37704M1.i0(this.f37715d.getTypeface());
        this.f37704M1.a0(this.f37715d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f37704M1.X(this.f37715d.getLetterSpacing());
        int gravity = this.f37715d.getGravity();
        this.f37704M1.S((gravity & (-113)) | 48);
        this.f37704M1.Z(gravity);
        this.f37702K1 = W.A(editText);
        this.f37715d.addTextChangedListener(new a(editText));
        if (this.f37758z1 == null) {
            this.f37758z1 = this.f37715d.getHintTextColors();
        }
        if (this.f37686C) {
            if (TextUtils.isEmpty(this.f37688D)) {
                CharSequence hint = this.f37715d.getHint();
                this.f37716e = hint;
                setHint(hint);
                this.f37715d.setHint((CharSequence) null);
            }
            this.f37690E = true;
        }
        if (i12 >= 29) {
            n0();
        }
        if (this.f37735o != null) {
            k0(this.f37715d.getText());
        }
        p0();
        this.f37725j.f();
        this.f37713b.bringToFront();
        this.f37714c.bringToFront();
        C();
        this.f37714c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f37688D)) {
            return;
        }
        this.f37688D = charSequence;
        this.f37704M1.g0(charSequence);
        if (this.f37703L1) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f37743s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            a0();
            this.f37745t = null;
        }
        this.f37743s = z10;
    }

    private int t(Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f37715d.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.f37724i1 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37712a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f37712a.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f37715d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f37740q1;
        float fW = this.f37704M1.w();
        rect2.left = rect.left + this.f37715d.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f37715d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    private int v() {
        float fQ;
        if (!this.f37686C) {
            return 0;
        }
        int i10 = this.f37724i1;
        if (i10 == 0) {
            fQ = this.f37704M1.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.f37704M1.q() / 2.0f;
        }
        return (int) fQ;
    }

    private void v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f37715d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f37715d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f37758z1;
        if (colorStateList2 != null) {
            this.f37704M1.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f37758z1;
            this.f37704M1.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f37701J1) : this.f37701J1));
        } else if (d0()) {
            this.f37704M1.M(this.f37725j.r());
        } else if (this.f37731m && (textView = this.f37735o) != null) {
            this.f37704M1.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f37683A1) != null) {
            this.f37704M1.R(colorStateList);
        }
        if (z13 || !this.f37706N1 || (isEnabled() && z12)) {
            if (z11 || this.f37703L1) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f37703L1) {
            F(z10);
        }
    }

    private boolean w() {
        return this.f37724i1 == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.f37745t == null || (editText = this.f37715d) == null) {
            return;
        }
        this.f37745t.setGravity(editText.getGravity());
        this.f37745t.setPadding(this.f37715d.getCompoundPaddingLeft(), this.f37715d.getCompoundPaddingTop(), this.f37715d.getCompoundPaddingRight(), this.f37715d.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.f37728k1 > -1 && this.f37734n1 != 0;
    }

    private void x0() {
        EditText editText = this.f37715d;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((h) this.f37692F).i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.f37733n.a(editable) != 0 || this.f37703L1) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.f37708P1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37708P1.cancel();
        }
        if (z10 && this.f37707O1) {
            l(1.0f);
        } else {
            this.f37704M1.c0(1.0f);
        }
        this.f37703L1 = false;
        if (B()) {
            W();
        }
        x0();
        this.f37713b.l(false);
        this.f37714c.H(false);
    }

    private void z0(boolean z10, boolean z11) {
        int defaultColor = this.f37691E1.getDefaultColor();
        int colorForState = this.f37691E1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f37691E1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f37734n1 = colorForState2;
        } else if (z11) {
            this.f37734n1 = colorForState;
        } else {
            this.f37734n1 = defaultColor;
        }
    }

    void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f37692F == null || this.f37724i1 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f37715d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f37715d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f37734n1 = this.f37701J1;
        } else if (d0()) {
            if (this.f37691E1 != null) {
                z0(z11, z10);
            } else {
                this.f37734n1 = getErrorCurrentTextColors();
            }
        } else if (!this.f37731m || (textView = this.f37735o) == null) {
            if (z11) {
                this.f37734n1 = this.f37689D1;
            } else if (z10) {
                this.f37734n1 = this.f37687C1;
            } else {
                this.f37734n1 = this.f37685B1;
            }
        } else if (this.f37691E1 != null) {
            z0(z11, z10);
        } else {
            this.f37734n1 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f37714c.I();
        Z();
        if (this.f37724i1 == 2) {
            int i10 = this.f37728k1;
            if (z11 && isEnabled()) {
                this.f37728k1 = this.f37732m1;
            } else {
                this.f37728k1 = this.f37730l1;
            }
            if (this.f37728k1 != i10) {
                X();
            }
        }
        if (this.f37724i1 == 1) {
            if (!isEnabled()) {
                this.f37736o1 = this.f37695G1;
            } else if (z10 && !z11) {
                this.f37736o1 = this.f37699I1;
            } else if (z11) {
                this.f37736o1 = this.f37697H1;
            } else {
                this.f37736o1 = this.f37693F1;
            }
        }
        m();
    }

    public boolean M() {
        return this.f37714c.F();
    }

    public boolean N() {
        return this.f37725j.A();
    }

    public boolean O() {
        return this.f37725j.B();
    }

    final boolean P() {
        return this.f37703L1;
    }

    public boolean R() {
        return this.f37690E;
    }

    public void Z() {
        this.f37713b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f37712a.addView(view, layoutParams2);
        this.f37712a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.h.o(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.h.o(textView, O3.i.f17139a);
        textView.setTextColor(AbstractC8021a.c(getContext(), O3.b.f16988a));
    }

    boolean d0() {
        return this.f37725j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f37715d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f37716e != null) {
            boolean z10 = this.f37690E;
            this.f37690E = false;
            CharSequence hint = editText.getHint();
            this.f37715d.setHint(this.f37716e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f37715d.setHint(hint);
                this.f37690E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f37712a.getChildCount());
        for (int i11 = 0; i11 < this.f37712a.getChildCount(); i11++) {
            View childAt = this.f37712a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f37715d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f37710R1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f37710R1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f37709Q1) {
            return;
        }
        this.f37709Q1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f37704M1;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f37715d != null) {
            u0(W.Q(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.f37709Q1 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f37715d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    C5527g getBoxBackground() {
        int i10 = this.f37724i1;
        if (i10 == 1 || i10 == 2) {
            return this.f37692F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f37736o1;
    }

    public int getBoxBackgroundMode() {
        return this.f37724i1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f37726j1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.n.g(this) ? this.f37718f1.j().a(this.f37742r1) : this.f37718f1.l().a(this.f37742r1);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.n.g(this) ? this.f37718f1.l().a(this.f37742r1) : this.f37718f1.j().a(this.f37742r1);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.n.g(this) ? this.f37718f1.r().a(this.f37742r1) : this.f37718f1.t().a(this.f37742r1);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.n.g(this) ? this.f37718f1.t().a(this.f37742r1) : this.f37718f1.r().a(this.f37742r1);
    }

    public int getBoxStrokeColor() {
        return this.f37689D1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f37691E1;
    }

    public int getBoxStrokeWidth() {
        return this.f37730l1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f37732m1;
    }

    public int getCounterMaxLength() {
        return this.f37729l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f37727k && this.f37731m && (textView = this.f37735o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f37757z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f37755y;
    }

    public ColorStateList getCursorColor() {
        return this.f37682A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f37684B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f37758z1;
    }

    public EditText getEditText() {
        return this.f37715d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f37714c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f37714c.n();
    }

    public int getEndIconMinSize() {
        return this.f37714c.o();
    }

    public int getEndIconMode() {
        return this.f37714c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f37714c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f37714c.r();
    }

    public CharSequence getError() {
        if (this.f37725j.A()) {
            return this.f37725j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f37725j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f37725j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f37725j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f37714c.s();
    }

    public CharSequence getHelperText() {
        if (this.f37725j.B()) {
            return this.f37725j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f37725j.u();
    }

    public CharSequence getHint() {
        if (this.f37686C) {
            return this.f37688D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f37704M1.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f37704M1.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f37683A1;
    }

    public e getLengthCounter() {
        return this.f37733n;
    }

    public int getMaxEms() {
        return this.f37719g;
    }

    public int getMaxWidth() {
        return this.f37723i;
    }

    public int getMinEms() {
        return this.f37717f;
    }

    public int getMinWidth() {
        return this.f37721h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f37714c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f37714c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f37743s) {
            return this.f37741r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f37749v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f37747u;
    }

    public CharSequence getPrefixText() {
        return this.f37713b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f37713b.b();
    }

    public TextView getPrefixTextView() {
        return this.f37713b.d();
    }

    public C5531k getShapeAppearanceModel() {
        return this.f37718f1;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f37713b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f37713b.f();
    }

    public int getStartIconMinSize() {
        return this.f37713b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f37713b.h();
    }

    public CharSequence getSuffixText() {
        return this.f37714c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f37714c.x();
    }

    public TextView getSuffixTextView() {
        return this.f37714c.z();
    }

    public Typeface getTypeface() {
        return this.f37744s1;
    }

    public void i(f fVar) {
        this.f37750v1.add(fVar);
        if (this.f37715d != null) {
            fVar.a(this);
        }
    }

    void k0(Editable editable) {
        int iA = this.f37733n.a(editable);
        boolean z10 = this.f37731m;
        int i10 = this.f37729l;
        if (i10 == -1) {
            this.f37735o.setText(String.valueOf(iA));
            this.f37735o.setContentDescription(null);
            this.f37731m = false;
        } else {
            this.f37731m = iA > i10;
            l0(getContext(), this.f37735o, iA, this.f37729l, this.f37731m);
            if (z10 != this.f37731m) {
                m0();
            }
            this.f37735o.setText(D1.a.c().j(getContext().getString(O3.h.f17119d, Integer.valueOf(iA), Integer.valueOf(this.f37729l))));
        }
        if (this.f37715d == null || z10 == this.f37731m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    void l(float f10) {
        if (this.f37704M1.x() == f10) {
            return;
        }
        if (this.f37708P1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f37708P1 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC3764d.g(getContext(), O3.a.f16950D, P3.a.f18022b));
            this.f37708P1.setDuration(AbstractC3764d.f(getContext(), O3.a.f16986y, 167));
            this.f37708P1.addUpdateListener(new c());
        }
        this.f37708P1.setFloatValues(this.f37704M1.x(), f10);
        this.f37708P1.start();
    }

    boolean o0() {
        boolean z10;
        if (this.f37715d == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f37713b.getMeasuredWidth() - this.f37715d.getPaddingLeft();
            if (this.f37746t1 == null || this.f37748u1 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f37746t1 = colorDrawable;
                this.f37748u1 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.h.a(this.f37715d);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f37746t1;
            if (drawable != drawable2) {
                androidx.core.widget.h.i(this.f37715d, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f37746t1 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.h.a(this.f37715d);
                androidx.core.widget.h.i(this.f37715d, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f37746t1 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f37714c.z().getMeasuredWidth() - this.f37715d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f37714c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + AbstractC2777v.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.h.a(this.f37715d);
            Drawable drawable3 = this.f37752w1;
            if (drawable3 == null || this.f37754x1 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f37752w1 = colorDrawable2;
                    this.f37754x1 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.f37752w1;
                if (drawable4 != drawable5) {
                    this.f37756y1 = drawable4;
                    androidx.core.widget.h.i(this.f37715d, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f37754x1 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.h.i(this.f37715d, drawableArrA3[0], drawableArrA3[1], this.f37752w1, drawableArrA3[3]);
            }
        } else {
            if (this.f37752w1 == null) {
                return z10;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.h.a(this.f37715d);
            if (drawableArrA4[2] == this.f37752w1) {
                androidx.core.widget.h.i(this.f37715d, drawableArrA4[0], drawableArrA4[1], this.f37756y1, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.f37752w1 = null;
        }
        return z11;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f37704M1.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f37714c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f37711S1 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.f37715d.post(new Runnable() { // from class: com.google.android.material.textfield.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37677a.U();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f37715d;
        if (editText != null) {
            Rect rect = this.f37738p1;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.f37686C) {
                this.f37704M1.a0(this.f37715d.getTextSize());
                int gravity = this.f37715d.getGravity();
                this.f37704M1.S((gravity & (-113)) | 48);
                this.f37704M1.Z(gravity);
                this.f37704M1.O(r(rect));
                this.f37704M1.W(u(rect));
                this.f37704M1.J();
                if (!B() || this.f37703L1) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f37711S1) {
            this.f37714c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f37711S1 = true;
        }
        w0();
        this.f37714c.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        setError(gVar.f37765c);
        if (gVar.f37766d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f37720g1) {
            float fA = this.f37718f1.r().a(this.f37742r1);
            float fA2 = this.f37718f1.t().a(this.f37742r1);
            C5531k c5531kM = C5531k.a().z(this.f37718f1.s()).D(this.f37718f1.q()).r(this.f37718f1.k()).v(this.f37718f1.i()).A(fA2).E(fA).s(this.f37718f1.l().a(this.f37742r1)).w(this.f37718f1.j().a(this.f37742r1)).m();
            this.f37720g1 = z10;
            setShapeAppearanceModel(c5531kM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f37765c = getError();
        }
        gVar.f37766d = this.f37714c.E();
        return gVar;
    }

    void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f37715d;
        if (editText == null || this.f37724i1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (K.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C3886k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f37731m && (textView = this.f37735o) != null) {
            background.setColorFilter(C3886k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC8416a.c(background);
            this.f37715d.refreshDrawableState();
        }
    }

    void r0() {
        EditText editText = this.f37715d;
        if (editText == null || this.f37692F == null) {
            return;
        }
        if ((this.f37698I || editText.getBackground() == null) && this.f37724i1 != 0) {
            q0();
            this.f37698I = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f37736o1 != i10) {
            this.f37736o1 = i10;
            this.f37693F1 = i10;
            this.f37697H1 = i10;
            this.f37699I1 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(AbstractC8021a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f37693F1 = defaultColor;
        this.f37736o1 = defaultColor;
        this.f37695G1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f37697H1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f37699I1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f37724i1) {
            return;
        }
        this.f37724i1 = i10;
        if (this.f37715d != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f37726j1 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f37718f1 = this.f37718f1.v().y(i10, this.f37718f1.r()).C(i10, this.f37718f1.t()).q(i10, this.f37718f1.j()).u(i10, this.f37718f1.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f37689D1 != i10) {
            this.f37689D1 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f37685B1 = colorStateList.getDefaultColor();
            this.f37701J1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f37687C1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f37689D1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f37689D1 != colorStateList.getDefaultColor()) {
            this.f37689D1 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f37691E1 != colorStateList) {
            this.f37691E1 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f37730l1 = i10;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f37732m1 = i10;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f37727k != z10) {
            if (z10) {
                D d10 = new D(getContext());
                this.f37735o = d10;
                d10.setId(O3.e.f17064J);
                Typeface typeface = this.f37744s1;
                if (typeface != null) {
                    this.f37735o.setTypeface(typeface);
                }
                this.f37735o.setMaxLines(1);
                this.f37725j.e(this.f37735o, 2);
                AbstractC2777v.d((ViewGroup.MarginLayoutParams) this.f37735o.getLayoutParams(), getResources().getDimensionPixelOffset(O3.c.f17018Y));
                m0();
                j0();
            } else {
                this.f37725j.C(this.f37735o, 2);
                this.f37735o = null;
            }
            this.f37727k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f37729l != i10) {
            if (i10 > 0) {
                this.f37729l = i10;
            } else {
                this.f37729l = -1;
            }
            if (this.f37727k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f37737p != i10) {
            this.f37737p = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f37757z != colorStateList) {
            this.f37757z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f37739q != i10) {
            this.f37739q = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f37755y != colorStateList) {
            this.f37755y = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f37682A != colorStateList) {
            this.f37682A = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f37684B != colorStateList) {
            this.f37684B = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f37758z1 = colorStateList;
        this.f37683A1 = colorStateList;
        if (this.f37715d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f37714c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f37714c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f37714c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f37714c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f37714c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f37714c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f37714c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37714c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f37714c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f37714c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f37714c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f37714c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f37725j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f37725j.w();
        } else {
            this.f37725j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f37725j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f37725j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f37725j.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f37714c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f37714c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37714c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f37714c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f37714c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f37725j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f37725j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f37706N1 != z10) {
            this.f37706N1 = z10;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f37725j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f37725j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f37725j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f37725j.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f37686C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f37707O1 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f37686C) {
            this.f37686C = z10;
            if (z10) {
                CharSequence hint = this.f37715d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f37688D)) {
                        setHint(hint);
                    }
                    this.f37715d.setHint((CharSequence) null);
                }
                this.f37690E = true;
            } else {
                this.f37690E = false;
                if (!TextUtils.isEmpty(this.f37688D) && TextUtils.isEmpty(this.f37715d.getHint())) {
                    this.f37715d.setHint(this.f37688D);
                }
                setHintInternal(null);
            }
            if (this.f37715d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f37704M1.P(i10);
        this.f37683A1 = this.f37704M1.p();
        if (this.f37715d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f37683A1 != colorStateList) {
            if (this.f37758z1 == null) {
                this.f37704M1.R(colorStateList);
            }
            this.f37683A1 = colorStateList;
            if (this.f37715d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f37733n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f37719g = i10;
        EditText editText = this.f37715d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f37723i = i10;
        EditText editText = this.f37715d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f37717f = i10;
        EditText editText = this.f37715d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f37721h = i10;
        EditText editText = this.f37715d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f37714c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f37714c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f37714c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f37714c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f37714c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f37745t == null) {
            D d10 = new D(getContext());
            this.f37745t = d10;
            d10.setId(O3.e.f17067M);
            W.u0(this.f37745t, 2);
            C4028c c4028cA = A();
            this.f37751w = c4028cA;
            c4028cA.l0(67L);
            this.f37753x = A();
            setPlaceholderTextAppearance(this.f37749v);
            setPlaceholderTextColor(this.f37747u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f37743s) {
                setPlaceholderTextEnabled(true);
            }
            this.f37741r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f37749v = i10;
        TextView textView = this.f37745t;
        if (textView != null) {
            androidx.core.widget.h.o(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f37747u != colorStateList) {
            this.f37747u = colorStateList;
            TextView textView = this.f37745t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f37713b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f37713b.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f37713b.p(colorStateList);
    }

    public void setShapeAppearanceModel(C5531k c5531k) {
        C5527g c5527g = this.f37692F;
        if (c5527g == null || c5527g.A() == c5531k) {
            return;
        }
        this.f37718f1 = c5531k;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f37713b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f37713b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f37713b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37713b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f37713b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f37713b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f37713b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f37713b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f37714c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f37714c.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f37714c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f37715d;
        if (editText != null) {
            W.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f37744s1) {
            this.f37744s1 = typeface;
            this.f37704M1.i0(typeface);
            this.f37725j.N(typeface);
            TextView textView = this.f37735o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(boolean z10) {
        v0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f37680T1;
        super(AbstractC6074a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f37717f = -1;
        this.f37719g = -1;
        this.f37721h = -1;
        this.f37723i = -1;
        this.f37725j = new u(this);
        this.f37733n = new e() { // from class: com.google.android.material.textfield.C
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.T(editable);
            }
        };
        this.f37738p1 = new Rect();
        this.f37740q1 = new Rect();
        this.f37742r1 = new RectF();
        this.f37750v1 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f37704M1 = aVar;
        this.f37711S1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f37712a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = P3.a.f18021a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        int[] iArr = O3.j.f17458m5;
        int i12 = O3.j.f17232J5;
        int i13 = O3.j.f17216H5;
        int i14 = O3.j.f17371b6;
        int i15 = O3.j.f17411g6;
        int i16 = O3.j.f17443k6;
        b0 b0VarJ = com.google.android.material.internal.k.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        z zVar = new z(this, b0VarJ);
        this.f37713b = zVar;
        this.f37686C = b0VarJ.a(O3.j.f17435j6, true);
        setHint(b0VarJ.p(O3.j.f17498r5));
        this.f37707O1 = b0VarJ.a(O3.j.f17427i6, true);
        this.f37706N1 = b0VarJ.a(O3.j.f17387d6, true);
        int i17 = O3.j.f17514t5;
        if (b0VarJ.s(i17)) {
            setMinEms(b0VarJ.k(i17, -1));
        } else {
            int i18 = O3.j.f17490q5;
            if (b0VarJ.s(i18)) {
                setMinWidth(b0VarJ.f(i18, -1));
            }
        }
        int i19 = O3.j.f17506s5;
        if (b0VarJ.s(i19)) {
            setMaxEms(b0VarJ.k(i19, -1));
        } else {
            int i20 = O3.j.f17482p5;
            if (b0VarJ.s(i20)) {
                setMaxWidth(b0VarJ.f(i20, -1));
            }
        }
        this.f37718f1 = C5531k.e(context2, attributeSet, i10, i11).m();
        this.f37722h1 = context2.getResources().getDimensionPixelOffset(O3.c.f17015V);
        this.f37726j1 = b0VarJ.e(O3.j.f17538w5, 0);
        this.f37730l1 = b0VarJ.f(O3.j.f17184D5, context2.getResources().getDimensionPixelSize(O3.c.f17016W));
        this.f37732m1 = b0VarJ.f(O3.j.f17192E5, context2.getResources().getDimensionPixelSize(O3.c.f17017X));
        this.f37728k1 = this.f37730l1;
        float fD = b0VarJ.d(O3.j.f17160A5, -1.0f);
        float fD2 = b0VarJ.d(O3.j.f17562z5, -1.0f);
        float fD3 = b0VarJ.d(O3.j.f17546x5, -1.0f);
        float fD4 = b0VarJ.d(O3.j.f17554y5, -1.0f);
        C5531k.b bVarV = this.f37718f1.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f37718f1 = bVarV.m();
        ColorStateList colorStateListB = c4.c.b(context2, b0VarJ, O3.j.f17522u5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f37693F1 = defaultColor;
            this.f37736o1 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f37695G1 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f37697H1 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f37699I1 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f37697H1 = this.f37693F1;
                ColorStateList colorStateListA = AbstractC6050a.a(context2, O3.b.f16990c);
                this.f37695G1 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f37699I1 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f37736o1 = 0;
            this.f37693F1 = 0;
            this.f37695G1 = 0;
            this.f37697H1 = 0;
            this.f37699I1 = 0;
        }
        int i21 = O3.j.f17474o5;
        if (b0VarJ.s(i21)) {
            ColorStateList colorStateListC = b0VarJ.c(i21);
            this.f37683A1 = colorStateListC;
            this.f37758z1 = colorStateListC;
        }
        int i22 = O3.j.f17168B5;
        ColorStateList colorStateListB2 = c4.c.b(context2, b0VarJ, i22);
        this.f37689D1 = b0VarJ.b(i22, 0);
        this.f37685B1 = AbstractC8021a.c(context2, O3.b.f16991d);
        this.f37701J1 = AbstractC8021a.c(context2, O3.b.f16992e);
        this.f37687C1 = AbstractC8021a.c(context2, O3.b.f16993f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = O3.j.f17176C5;
        if (b0VarJ.s(i23)) {
            setBoxStrokeErrorColor(c4.c.b(context2, b0VarJ, i23));
        }
        if (b0VarJ.n(i16, -1) != -1) {
            setHintTextAppearance(b0VarJ.n(i16, 0));
        }
        this.f37682A = b0VarJ.c(O3.j.f17248L5);
        this.f37684B = b0VarJ.c(O3.j.f17256M5);
        int iN = b0VarJ.n(i14, 0);
        CharSequence charSequenceP = b0VarJ.p(O3.j.f17334W5);
        int iK = b0VarJ.k(O3.j.f17327V5, 1);
        boolean zA = b0VarJ.a(O3.j.f17341X5, false);
        int iN2 = b0VarJ.n(i15, 0);
        boolean zA2 = b0VarJ.a(O3.j.f17403f6, false);
        CharSequence charSequenceP2 = b0VarJ.p(O3.j.f17395e6);
        int iN3 = b0VarJ.n(O3.j.f17507s6, 0);
        CharSequence charSequenceP3 = b0VarJ.p(O3.j.f17499r6);
        boolean zA3 = b0VarJ.a(O3.j.f17200F5, false);
        setCounterMaxLength(b0VarJ.k(O3.j.f17208G5, -1));
        this.f37739q = b0VarJ.n(i12, 0);
        this.f37737p = b0VarJ.n(i13, 0);
        setBoxBackgroundMode(b0VarJ.k(O3.j.f17530v5, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f37737p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f37739q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = O3.j.f17379c6;
        if (b0VarJ.s(i24)) {
            setErrorTextColor(b0VarJ.c(i24));
        }
        int i25 = O3.j.f17419h6;
        if (b0VarJ.s(i25)) {
            setHelperTextColor(b0VarJ.c(i25));
        }
        int i26 = O3.j.f17451l6;
        if (b0VarJ.s(i26)) {
            setHintTextColor(b0VarJ.c(i26));
        }
        int i27 = O3.j.f17240K5;
        if (b0VarJ.s(i27)) {
            setCounterTextColor(b0VarJ.c(i27));
        }
        int i28 = O3.j.f17224I5;
        if (b0VarJ.s(i28)) {
            setCounterOverflowTextColor(b0VarJ.c(i28));
        }
        int i29 = O3.j.f17515t6;
        if (b0VarJ.s(i29)) {
            setPlaceholderTextColor(b0VarJ.c(i29));
        }
        r rVar = new r(this, b0VarJ);
        this.f37714c = rVar;
        boolean zA4 = b0VarJ.a(O3.j.f17466n5, true);
        b0VarJ.x();
        W.u0(this, 2);
        W.w0(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f37714c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f37714c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f37714c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f37714c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f37714c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f37713b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f37713b.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
