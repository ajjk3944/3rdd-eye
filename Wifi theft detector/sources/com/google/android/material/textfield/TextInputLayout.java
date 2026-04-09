package com.google.android.material.textfield;

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
import android.text.StaticLayout;
import android.text.TextPaint;
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
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.z0;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int D0 = j4.k.Widget_Design_TextInputLayout;
    public static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public boolean D;
    public CharSequence E;
    public boolean F;
    public MaterialShapeDrawable G;
    public MaterialShapeDrawable H;
    public StateListDrawable I;
    public boolean J;
    public MaterialShapeDrawable K;
    public MaterialShapeDrawable L;
    public com.google.android.material.shape.a M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Rect W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f11251a;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f11252a0;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f11253b;

    /* renamed from: b0, reason: collision with root package name */
    public final RectF f11254b0;

    /* renamed from: c, reason: collision with root package name */
    public final s f11255c;

    /* renamed from: c0, reason: collision with root package name */
    public Typeface f11256c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f11257d;

    /* renamed from: d0, reason: collision with root package name */
    public Drawable f11258d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f11259e;

    /* renamed from: e0, reason: collision with root package name */
    public int f11260e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f11261f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f11262f0;

    /* renamed from: g, reason: collision with root package name */
    public int f11263g;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f11264g0;

    /* renamed from: h, reason: collision with root package name */
    public int f11265h;

    /* renamed from: h0, reason: collision with root package name */
    public int f11266h0;

    /* renamed from: i, reason: collision with root package name */
    public int f11267i;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f11268i0;

    /* renamed from: j, reason: collision with root package name */
    public int f11269j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f11270j0;

    /* renamed from: k, reason: collision with root package name */
    public final v f11271k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f11272k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11273l;

    /* renamed from: l0, reason: collision with root package name */
    public int f11274l0;

    /* renamed from: m, reason: collision with root package name */
    public int f11275m;

    /* renamed from: m0, reason: collision with root package name */
    public int f11276m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11277n;

    /* renamed from: n0, reason: collision with root package name */
    public int f11278n0;

    /* renamed from: o, reason: collision with root package name */
    public f f11279o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f11280o0;

    /* renamed from: p, reason: collision with root package name */
    public TextView f11281p;

    /* renamed from: p0, reason: collision with root package name */
    public int f11282p0;

    /* renamed from: q, reason: collision with root package name */
    public int f11283q;

    /* renamed from: q0, reason: collision with root package name */
    public int f11284q0;

    /* renamed from: r, reason: collision with root package name */
    public int f11285r;

    /* renamed from: r0, reason: collision with root package name */
    public int f11286r0;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f11287s;

    /* renamed from: s0, reason: collision with root package name */
    public int f11288s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11289t;

    /* renamed from: t0, reason: collision with root package name */
    public int f11290t0;

    /* renamed from: u, reason: collision with root package name */
    public TextView f11291u;

    /* renamed from: u0, reason: collision with root package name */
    public int f11292u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f11293v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f11294v0;

    /* renamed from: w, reason: collision with root package name */
    public int f11295w;

    /* renamed from: w0, reason: collision with root package name */
    public final com.google.android.material.internal.b f11296w0;

    /* renamed from: x, reason: collision with root package name */
    public androidx.transition.b f11297x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f11298x0;

    /* renamed from: y, reason: collision with root package name */
    public androidx.transition.b f11299y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f11300y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f11301z;

    /* renamed from: z0, reason: collision with root package name */
    public ValueAnimator f11302z0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f11303c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11304d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f11303c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f11303c, parcel, i10);
            parcel.writeInt(this.f11304d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11303c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11304d = parcel.readInt() == 1;
        }
    }

    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public int f11305a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f11306b;

        public a(EditText editText) {
            this.f11306b = editText;
            this.f11305a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.B0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f11273l) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.f11289t) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f11306b.getLineCount();
            int i10 = this.f11305a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = this.f11306b.getMinimumHeight();
                    int i11 = TextInputLayout.this.f11292u0;
                    if (minimumHeight != i11) {
                        this.f11306b.setMinimumHeight(i11);
                    }
                }
                this.f11305a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            xVar.P0(false);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f11255c.h();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f11296w0.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f11311d;

        public e(TextInputLayout textInputLayout) {
            this.f11311d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            EditText editText = this.f11311d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f11311d.getHint();
            CharSequence error = this.f11311d.getError();
            CharSequence placeholderText = this.f11311d.getPlaceholderText();
            int counterMaxLength = this.f11311d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f11311d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f11311d.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f11311d.f11253b.A(xVar);
            if (!zIsEmpty) {
                xVar.N0(text);
            } else if (!TextUtils.isEmpty(string)) {
                xVar.N0(string);
                if (!zQ && placeholderText != null) {
                    xVar.N0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                xVar.N0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    xVar.y0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    xVar.N0(string);
                }
                xVar.J0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            xVar.A0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                xVar.t0(error);
            }
            View viewT = this.f11311d.f11271k.t();
            if (viewT != null) {
                xVar.z0(viewT);
            }
            this.f11311d.f11255c.m().o(view, xVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f11311d.f11255c.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    public static Drawable I(MaterialShapeDrawable materialShapeDrawable, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{u4.a.j(i11, i10, 0.1f), i10}), materialShapeDrawable, materialShapeDrawable);
    }

    public static Drawable L(Context context, MaterialShapeDrawable materialShapeDrawable, int i10, int[][] iArr) {
        int iC = u4.a.c(context, j4.b.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.K());
        int iJ = u4.a.j(i10, iC, 0.1f);
        materialShapeDrawable2.i0(new ColorStateList(iArr, new int[]{iJ, 0}));
        materialShapeDrawable2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.K());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    public static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f11259e;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.G;
        }
        int iD = u4.a.d(this.f11259e, c.a.colorControlHighlight);
        int i10 = this.P;
        if (i10 == 2) {
            return L(getContext(), this.G, iD, E0);
        }
        if (i10 == 1) {
            return I(this.G, this.V, iD, E0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], H(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = H(true);
        }
        return this.H;
    }

    public static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? j4.j.character_counter_overflowed_content_description : j4.j.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f11259e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f11259e = editText;
        int i10 = this.f11263g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f11267i);
        }
        int i11 = this.f11265h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f11269j);
        }
        this.J = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.f11296w0.p0(this.f11259e.getTypeface());
        this.f11296w0.h0(this.f11259e.getTextSize());
        this.f11296w0.d0(this.f11259e.getLetterSpacing());
        int gravity = this.f11259e.getGravity();
        this.f11296w0.X((gravity & (-113)) | 48);
        this.f11296w0.g0(gravity);
        this.f11292u0 = editText.getMinimumHeight();
        this.f11259e.addTextChangedListener(new a(editText));
        if (this.f11270j0 == null) {
            this.f11270j0 = this.f11259e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f11259e.getHint();
                this.f11261f = hint;
                setHint(hint);
                this.f11259e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f11281p != null) {
            l0(this.f11259e.getText());
        }
        q0();
        this.f11271k.f();
        this.f11253b.bringToFront();
        this.f11255c.bringToFront();
        D();
        this.f11255c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.f11296w0.n0(charSequence);
        if (this.f11294v0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f11289t == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            a0();
            this.f11291u = null;
        }
        this.f11289t = z10;
    }

    public final void A(boolean z10) {
        ValueAnimator valueAnimator = this.f11302z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f11302z0.cancel();
        }
        if (z10 && this.f11300y0) {
            m(1.0f);
        } else {
            this.f11296w0.j0(1.0f);
        }
        this.f11294v0 = false;
        if (C()) {
            W();
        }
        z0();
        this.f11253b.l(false);
        this.f11255c.H(false);
    }

    public final void A0(Editable editable) {
        if (this.f11279o.a(editable) != 0 || this.f11294v0) {
            M();
        } else {
            g0();
        }
    }

    public final androidx.transition.b B() {
        androidx.transition.b bVar = new androidx.transition.b();
        bVar.W(b5.k.f(getContext(), j4.b.motionDurationShort2, 87));
        bVar.Y(b5.k.g(getContext(), j4.b.motionEasingLinearInterpolator, k4.a.f21834a));
        return bVar;
    }

    public final void B0(boolean z10, boolean z11) {
        int defaultColor = this.f11280o0.getDefaultColor();
        int colorForState = this.f11280o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f11280o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.U = colorForState2;
        } else if (z11) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final boolean C() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof h);
    }

    public void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f11259e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f11259e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.U = this.f11290t0;
        } else if (d0()) {
            if (this.f11280o0 != null) {
                B0(z11, z10);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.f11277n || (textView = this.f11281p) == null) {
            if (z11) {
                this.U = this.f11278n0;
            } else if (z10) {
                this.U = this.f11276m0;
            } else {
                this.U = this.f11274l0;
            }
        } else if (this.f11280o0 != null) {
            B0(z11, z10);
        } else {
            this.U = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f11255c.I();
        Z();
        if (this.P == 2) {
            int i10 = this.R;
            if (z11 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i10) {
                X();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.f11284q0;
            } else if (z10 && !z11) {
                this.V = this.f11288s0;
            } else if (z11) {
                this.V = this.f11286r0;
            } else {
                this.V = this.f11282p0;
            }
        }
        n();
    }

    public final void D() {
        Iterator it = this.f11262f0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    public final void E(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.L == null || (materialShapeDrawable = this.K) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f11259e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float fB = this.f11296w0.B();
            int iCenterX = bounds2.centerX();
            bounds.left = k4.a.c(iCenterX, bounds2.left, fB);
            bounds.right = k4.a.c(iCenterX, bounds2.right, fB);
            this.L.draw(canvas);
        }
    }

    public final void F(Canvas canvas) {
        if (this.D) {
            this.f11296w0.k(canvas);
        }
    }

    public final void G(boolean z10) {
        ValueAnimator valueAnimator = this.f11302z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f11302z0.cancel();
        }
        if (z10 && this.f11300y0) {
            m(0.0f);
        } else {
            this.f11296w0.j0(0.0f);
        }
        if (C() && ((h) this.G).F0()) {
            z();
        }
        this.f11294v0 = true;
        M();
        this.f11253b.l(true);
        this.f11255c.H(true);
    }

    public final MaterialShapeDrawable H(boolean z10) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(j4.d.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f11259e;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(j4.d.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(j4.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.a aVarM = com.google.android.material.shape.a.a().D(f10).H(f10).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.f11259e;
        MaterialShapeDrawable materialShapeDrawableR = MaterialShapeDrawable.r(getContext(), popupElevation, editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null);
        materialShapeDrawableR.setShapeAppearanceModel(aVarM);
        materialShapeDrawableR.l0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return materialShapeDrawableR;
    }

    public final int J(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f11259e.getCompoundPaddingLeft() : this.f11255c.y() : this.f11253b.c());
    }

    public final int K(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f11259e.getCompoundPaddingRight() : this.f11253b.c() : this.f11255c.y());
    }

    public final void M() {
        TextView textView = this.f11291u;
        if (textView == null || !this.f11289t) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.e.a(this.f11251a, this.f11299y);
        this.f11291u.setVisibility(4);
    }

    public boolean N() {
        return this.f11255c.F();
    }

    public boolean O() {
        return this.f11271k.A();
    }

    public boolean P() {
        return this.f11271k.B();
    }

    public final boolean Q() {
        return this.f11294v0;
    }

    public final boolean R() {
        return getHintMaxLines() == 1;
    }

    public final boolean S() {
        if (d0()) {
            return true;
        }
        return this.f11281p != null && this.f11277n;
    }

    public boolean T() {
        return this.F;
    }

    public final boolean U() {
        return this.P == 1 && this.f11259e.getMinLines() <= 1;
    }

    public final void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.P != 0) {
            v0();
        }
        b0();
    }

    public final void W() {
        if (C()) {
            RectF rectF = this.f11254b0;
            this.f11296w0.o(rectF, this.f11259e.getWidth(), this.f11259e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R);
            rectF.top = 0.0f;
            ((h) this.G).I0(rectF);
        }
    }

    public final void X() {
        if (!C() || this.f11294v0) {
            return;
        }
        z();
        W();
    }

    public void Z() {
        this.f11253b.m();
    }

    public final void a0() {
        TextView textView = this.f11291u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f11251a.addView(view, layoutParams2);
        this.f11251a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.f11259e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.P;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void c0(TextView textView, int i10) {
        try {
            TextViewCompat.m(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.m(textView, c.i.TextAppearance_AppCompat_Caption);
        textView.setTextColor(ContextCompat.getColor(getContext(), j4.c.design_error));
    }

    public boolean d0() {
        return this.f11271k.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f11259e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f11261f != null) {
            boolean z10 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f11259e.setHint(this.f11261f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f11259e.setHint(hint);
                this.F = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f11251a.getChildCount());
        for (int i11 = 0; i11 < this.f11251a.getChildCount(); i11++) {
            View childAt = this.f11251a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f11259e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f11296w0;
        boolean zM0 = bVar != null ? bVar.m0(drawableState) : false;
        if (this.f11259e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (zM0) {
            invalidate();
        }
        this.A0 = false;
    }

    public final boolean e0() {
        return (this.f11255c.G() || ((this.f11255c.A() && N()) || this.f11255c.w() != null)) && this.f11255c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f11253b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.f11291u == null || !this.f11289t || TextUtils.isEmpty(this.f11287s)) {
            return;
        }
        this.f11291u.setText(this.f11287s);
        androidx.transition.e.a(this.f11251a, this.f11297x);
        this.f11291u.setVisibility(0);
        this.f11291u.bringToFront();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11259e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i10 = this.P;
        if (i10 == 1 || i10 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.d0.l(this) ? this.M.j().a(this.f11254b0) : this.M.l().a(this.f11254b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.d0.l(this) ? this.M.l().a(this.f11254b0) : this.M.j().a(this.f11254b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.d0.l(this) ? this.M.r().a(this.f11254b0) : this.M.t().a(this.f11254b0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.d0.l(this) ? this.M.t().a(this.f11254b0) : this.M.r().a(this.f11254b0);
    }

    public int getBoxStrokeColor() {
        return this.f11278n0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f11280o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.f11275m;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f11273l && this.f11277n && (textView = this.f11281p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f11301z;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.B;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f11270j0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f11259e;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f11255c.l();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f11255c.n();
    }

    public int getEndIconMinSize() {
        return this.f11255c.o();
    }

    public int getEndIconMode() {
        return this.f11255c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f11255c.q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f11255c.r();
    }

    @Nullable
    public CharSequence getError() {
        if (this.f11271k.A()) {
            return this.f11271k.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f11271k.n();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f11271k.o();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f11271k.q();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f11255c.s();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f11271k.B()) {
            return this.f11271k.s();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.f11271k.u();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f11296w0.q();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.f11296w0.t();
    }

    public int getHintMaxLines() {
        return this.f11296w0.x();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f11272k0;
    }

    @NonNull
    public f getLengthCounter() {
        return this.f11279o;
    }

    public int getMaxEms() {
        return this.f11265h;
    }

    @Px
    public int getMaxWidth() {
        return this.f11269j;
    }

    public int getMinEms() {
        return this.f11263g;
    }

    @Px
    public int getMinWidth() {
        return this.f11267i;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f11255c.u();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f11255c.v();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f11289t) {
            return this.f11287s;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f11295w;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f11293v;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f11253b.a();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f11253b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f11253b.d();
    }

    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.M;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f11253b.e();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f11253b.f();
    }

    public int getStartIconMinSize() {
        return this.f11253b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f11253b.h();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f11255c.w();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f11255c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f11255c.z();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f11256c0;
    }

    public final void h0() {
        if (this.P == 1) {
            if (d5.c.i(getContext())) {
                this.Q = getResources().getDimensionPixelSize(j4.d.material_font_2_0_box_collapsed_padding_top);
            } else if (d5.c.h(getContext())) {
                this.Q = getResources().getDimensionPixelSize(j4.d.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    public final void i0(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.K;
        if (materialShapeDrawable != null) {
            int i10 = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i10 - this.S, rect.right, i10);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.L;
        if (materialShapeDrawable2 != null) {
            int i11 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i11 - this.T, rect.right, i11);
        }
    }

    public void j(g gVar) {
        this.f11262f0.add(gVar);
        if (this.f11259e != null) {
            gVar.a(this);
        }
    }

    public final void j0(int i10) {
        this.f11296w0.s0(i10);
        Rect rect = this.W;
        com.google.android.material.internal.d.a(this, this.f11259e, rect);
        this.f11296w0.S(s(rect));
        v0();
        l();
        t0(i10);
    }

    public final void k() {
        TextView textView = this.f11291u;
        if (textView != null) {
            this.f11251a.addView(textView);
            this.f11291u.setVisibility(0);
        }
    }

    public final void k0() {
        if (this.f11281p != null) {
            EditText editText = this.f11259e;
            l0(editText == null ? null : editText.getText());
        }
    }

    public final void l() {
        if (this.f11259e == null || this.P != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f11259e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f11296w0.q() + this.f11257d), this.f11259e.getPaddingEnd(), getResources().getDimensionPixelSize(j4.d.material_filled_edittext_font_1_3_padding_bottom));
        } else if (d5.c.i(getContext())) {
            EditText editText2 = this.f11259e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(j4.d.material_filled_edittext_font_2_0_padding_top), this.f11259e.getPaddingEnd(), getResources().getDimensionPixelSize(j4.d.material_filled_edittext_font_2_0_padding_bottom));
        } else if (d5.c.h(getContext())) {
            EditText editText3 = this.f11259e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(j4.d.material_filled_edittext_font_1_3_padding_top), this.f11259e.getPaddingEnd(), getResources().getDimensionPixelSize(j4.d.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public void l0(Editable editable) {
        int iA = this.f11279o.a(editable);
        boolean z10 = this.f11277n;
        int i10 = this.f11275m;
        if (i10 == -1) {
            this.f11281p.setText(String.valueOf(iA));
            this.f11281p.setContentDescription(null);
            this.f11277n = false;
        } else {
            this.f11277n = iA > i10;
            m0(getContext(), this.f11281p, iA, this.f11275m, this.f11277n);
            if (z10 != this.f11277n) {
                n0();
            }
            this.f11281p.setText(q0.a.c().j(getContext().getString(j4.j.character_counter_pattern, Integer.valueOf(iA), Integer.valueOf(this.f11275m))));
        }
        if (this.f11259e == null || z10 == this.f11277n) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    public void m(float f10) {
        if (this.f11296w0.B() == f10) {
            return;
        }
        if (this.f11302z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11302z0 = valueAnimator;
            valueAnimator.setInterpolator(b5.k.g(getContext(), j4.b.motionEasingEmphasizedInterpolator, k4.a.f21835b));
            this.f11302z0.setDuration(b5.k.f(getContext(), j4.b.motionDurationMedium4, 167));
            this.f11302z0.addUpdateListener(new d());
        }
        this.f11302z0.setFloatValues(this.f11296w0.B(), f10);
        this.f11302z0.start();
    }

    public final void n() {
        MaterialShapeDrawable materialShapeDrawable = this.G;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.a aVarK = materialShapeDrawable.K();
        com.google.android.material.shape.a aVar = this.M;
        if (aVarK != aVar) {
            this.G.setShapeAppearanceModel(aVar);
        }
        if (x()) {
            this.G.s0(this.R, this.U);
        }
        int iR = r();
        this.V = iR;
        this.G.i0(ColorStateList.valueOf(iR));
        o();
        s0();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f11281p;
        if (textView != null) {
            c0(textView, this.f11277n ? this.f11283q : this.f11285r);
            if (!this.f11277n && (colorStateList2 = this.f11301z) != null) {
                this.f11281p.setTextColor(colorStateList2);
            }
            if (!this.f11277n || (colorStateList = this.A) == null) {
                return;
            }
            this.f11281p.setTextColor(colorStateList);
        }
    }

    public final void o() {
        if (this.K == null || this.L == null) {
            return;
        }
        if (y()) {
            this.K.i0(this.f11259e.isFocused() ? ColorStateList.valueOf(this.f11274l0) : ColorStateList.valueOf(this.U));
            this.L.i0(ColorStateList.valueOf(this.U));
        }
        invalidate();
    }

    public final void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.B;
        if (colorStateListG == null) {
            colorStateListG = u4.a.g(getContext(), c.a.colorControlActivated);
        }
        EditText editText = this.f11259e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = k0.a.r(this.f11259e.getTextCursorDrawable()).mutate();
        if (S() && (colorStateList = this.C) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11296w0.L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f11255c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.C0 = false;
        boolean zU0 = u0();
        boolean zP0 = p0();
        if (zU0 || zP0) {
            this.f11259e.post(new Runnable() { // from class: com.google.android.material.textfield.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11339a.f11259e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f11259e;
        if (editText != null) {
            Rect rect = this.W;
            com.google.android.material.internal.d.a(this, editText, rect);
            i0(rect);
            if (this.D) {
                this.f11296w0.h0(this.f11259e.getTextSize());
                int gravity = this.f11259e.getGravity();
                this.f11296w0.X((gravity & (-113)) | 48);
                this.f11296w0.g0(gravity);
                this.f11296w0.S(s(rect));
                this.f11296w0.c0(v(rect));
                this.f11296w0.N();
                if (!C() || this.f11294v0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.C0) {
            this.f11255c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        y0();
        this.f11255c.x0();
        if (R()) {
            return;
        }
        j0((this.f11259e.getMeasuredWidth() - this.f11259e.getCompoundPaddingLeft()) - this.f11259e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        setError(savedState.f11303c);
        if (savedState.f11304d) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.N) {
            float fA = this.M.r().a(this.f11254b0);
            float fA2 = this.M.t().a(this.f11254b0);
            com.google.android.material.shape.a aVarM = com.google.android.material.shape.a.a().C(this.M.s()).G(this.M.q()).t(this.M.k()).x(this.M.i()).D(fA2).H(fA).u(this.M.l().a(this.f11254b0)).y(this.M.j().a(this.f11254b0)).m();
            this.N = z10;
            setShapeAppearanceModel(aVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.f11303c = getError();
        }
        savedState.f11304d = this.f11255c.E();
        return savedState;
    }

    public final void p(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.O;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    public boolean p0() {
        boolean z10;
        if (this.f11259e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f11253b.getMeasuredWidth() - this.f11259e.getPaddingLeft();
            if (this.f11258d0 == null || this.f11260e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f11258d0 = colorDrawable;
                this.f11260e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f11259e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f11258d0;
            if (drawable != drawable2) {
                this.f11259e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f11258d0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f11259e.getCompoundDrawablesRelative();
                this.f11259e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f11258d0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f11255c.z().getMeasuredWidth() - this.f11259e.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f11255c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f11259e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f11264g0;
            if (drawable3 != null && this.f11266h0 != measuredWidth2) {
                this.f11266h0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f11259e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f11264g0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f11264g0 = colorDrawable2;
                this.f11266h0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f11264g0;
            if (drawable4 != drawable5) {
                this.f11268i0 = drawable4;
                this.f11259e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f11264g0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f11259e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f11264g0) {
                this.f11259e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f11268i0, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f11264g0 = null;
            return z11;
        }
        return z10;
    }

    public final void q() {
        int i10 = this.P;
        if (i10 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
            return;
        }
        if (i10 == 1) {
            this.G = new MaterialShapeDrawable(this.M);
            this.K = new MaterialShapeDrawable();
            this.L = new MaterialShapeDrawable();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.G instanceof h)) {
                this.G = new MaterialShapeDrawable(this.M);
            } else {
                this.G = h.D0(this.M);
            }
            this.K = null;
            this.L = null;
        }
    }

    public void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f11259e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.j0.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(androidx.appcompat.widget.i.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f11277n && (textView = this.f11281p) != null) {
            background.setColorFilter(androidx.appcompat.widget.i.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            k0.a.c(background);
            this.f11259e.refreshDrawableState();
        }
    }

    public final int r() {
        return this.P == 1 ? u4.a.i(u4.a.e(this, j4.b.colorSurface, 0), this.V) : this.V;
    }

    public final void r0() {
        this.f11259e.setBackground(getEditTextBoxBackground());
    }

    public final Rect s(Rect rect) {
        if (this.f11259e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f11252a0;
        boolean zL = com.google.android.material.internal.d0.l(this);
        rect2.bottom = rect.bottom;
        int i10 = this.P;
        if (i10 == 1) {
            rect2.left = J(rect.left, zL);
            rect2.top = rect.top + this.Q;
            rect2.right = K(rect.right, zL);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = J(rect.left, zL);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, zL);
            return rect2;
        }
        rect2.left = rect.left + this.f11259e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f11259e.getPaddingRight();
        return rect2;
    }

    public void s0() {
        EditText editText = this.f11259e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            r0();
            this.J = true;
        }
    }

    public void setBoxBackgroundColor(@ColorInt int i10) {
        if (this.V != i10) {
            this.V = i10;
            this.f11282p0 = i10;
            this.f11286r0 = i10;
            this.f11288s0 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i10) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f11282p0 = defaultColor;
        this.V = defaultColor;
        this.f11284q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f11286r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f11288s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.P) {
            return;
        }
        this.P = i10;
        if (this.f11259e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.Q = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.M = this.M.w().B(i10, this.M.r()).F(i10, this.M.t()).s(i10, this.M.j()).w(i10, this.M.l()).m();
        n();
    }

    public void setBoxStrokeColor(@ColorInt int i10) {
        if (this.f11278n0 != i10) {
            this.f11278n0 = i10;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f11274l0 = colorStateList.getDefaultColor();
            this.f11290t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f11276m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f11278n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f11278n0 != colorStateList.getDefaultColor()) {
            this.f11278n0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f11280o0 != colorStateList) {
            this.f11280o0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.S = i10;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.T = i10;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f11273l != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f11281p = appCompatTextView;
                appCompatTextView.setId(j4.f.textinput_counter);
                Typeface typeface = this.f11256c0;
                if (typeface != null) {
                    this.f11281p.setTypeface(typeface);
                }
                this.f11281p.setMaxLines(1);
                this.f11271k.e(this.f11281p, 2);
                ((ViewGroup.MarginLayoutParams) this.f11281p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(j4.d.mtrl_textinput_counter_margin_start));
                n0();
                k0();
            } else {
                this.f11271k.C(this.f11281p, 2);
                this.f11281p = null;
            }
            this.f11273l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f11275m != i10) {
            if (i10 > 0) {
                this.f11275m = i10;
            } else {
                this.f11275m = -1;
            }
            if (this.f11273l) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f11283q != i10) {
            this.f11283q = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f11285r != i10) {
            this.f11285r = i10;
            n0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f11301z != colorStateList) {
            this.f11301z = colorStateList;
            n0();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o0();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f11270j0 = colorStateList;
        this.f11272k0 = colorStateList;
        if (this.f11259e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f11255c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f11255c.O(z10);
    }

    public void setEndIconContentDescription(@StringRes int i10) {
        this.f11255c.P(i10);
    }

    public void setEndIconDrawable(@DrawableRes int i10) {
        this.f11255c.R(i10);
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i10) {
        this.f11255c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f11255c.U(i10);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f11255c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f11255c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f11255c.X(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.f11255c.Y(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f11255c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f11255c.a0(z10);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f11271k.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f11271k.w();
        } else {
            this.f11271k.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f11271k.E(i10);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f11271k.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f11271k.G(z10);
    }

    public void setErrorIconDrawable(@DrawableRes int i10) {
        this.f11255c.b0(i10);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f11255c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f11255c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f11255c.f0(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f11255c.g0(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i10) {
        this.f11271k.H(i10);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f11271k.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f11298x0 != z10) {
            this.f11298x0 = z10;
            w0(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f11271k.R(charSequence);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f11271k.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f11271k.K(z10);
    }

    public void setHelperTextTextAppearance(@StyleRes int i10) {
        this.f11271k.J(i10);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(KEYRecord.Flags.FLAG4);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f11300y0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            if (z10) {
                CharSequence hint = this.f11259e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f11259e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f11259e.getHint())) {
                    this.f11259e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f11259e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.f11296w0.T(i10);
        this.f11296w0.e0(i10);
        requestLayout();
    }

    public void setHintTextAppearance(@StyleRes int i10) {
        this.f11296w0.U(i10);
        this.f11272k0 = this.f11296w0.p();
        if (this.f11259e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f11272k0 != colorStateList) {
            if (this.f11270j0 == null) {
                this.f11296w0.W(colorStateList);
            }
            this.f11272k0 = colorStateList;
            if (this.f11259e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull f fVar) {
        this.f11279o = fVar;
    }

    public void setMaxEms(int i10) {
        this.f11265h = i10;
        EditText editText = this.f11259e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(@Px int i10) {
        this.f11269j = i10;
        EditText editText = this.f11259e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(@DimenRes int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f11263g = i10;
        EditText editText = this.f11259e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(@Px int i10) {
        this.f11267i = i10;
        EditText editText = this.f11259e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(@DimenRes int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i10) {
        this.f11255c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i10) {
        this.f11255c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f11255c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f11255c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f11255c.o0(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f11291u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f11291u = appCompatTextView;
            appCompatTextView.setId(j4.f.textinput_placeholder);
            this.f11291u.setImportantForAccessibility(1);
            this.f11291u.setAccessibilityLiveRegion(1);
            androidx.transition.b bVarB = B();
            this.f11297x = bVarB;
            bVarB.b0(67L);
            this.f11299y = B();
            setPlaceholderTextAppearance(this.f11295w);
            setPlaceholderTextColor(this.f11293v);
            ViewCompat.j0(this.f11291u, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f11289t) {
                setPlaceholderTextEnabled(true);
            }
            this.f11287s = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i10) {
        this.f11295w = i10;
        TextView textView = this.f11291u;
        if (textView != null) {
            TextViewCompat.m(textView, i10);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f11293v != colorStateList) {
            this.f11293v = colorStateList;
            TextView textView = this.f11291u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f11253b.n(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i10) {
        this.f11253b.o(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f11253b.p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        MaterialShapeDrawable materialShapeDrawable = this.G;
        if (materialShapeDrawable == null || materialShapeDrawable.K() == aVar) {
            return;
        }
        this.M = aVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f11253b.q(z10);
    }

    public void setStartIconContentDescription(@StringRes int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i10) {
        setStartIconDrawable(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i10) {
        this.f11253b.t(i10);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f11253b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f11253b.v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f11253b.w(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.f11253b.x(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f11253b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f11253b.z(z10);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f11255c.p0(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i10) {
        this.f11255c.q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f11255c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable e eVar) {
        EditText editText = this.f11259e;
        if (editText != null) {
            ViewCompat.j0(editText, eVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f11256c0) {
            this.f11256c0 = typeface;
            this.f11296w0.p0(typeface);
            this.f11271k.N(typeface);
            TextView textView = this.f11281p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, Rect rect2, float f10) {
        return U() ? (int) (rect2.top + f10) : rect.bottom - this.f11259e.getCompoundPaddingBottom();
    }

    public final void t0(int i10) {
        if (this.f11259e == null) {
            return;
        }
        float fZ = this.f11296w0.z();
        float height = 0.0f;
        if (this.f11287s != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f11291u.getPaint());
            textPaint.setTextSize(this.f11291u.getTextSize());
            textPaint.setTypeface(this.f11291u.getTypeface());
            textPaint.setLetterSpacing(this.f11291u.getLetterSpacing());
            try {
                height = StaticLayoutBuilderCompat.b(this.f11287s, textPaint, i10).g(getLayoutDirection() == 1).f(true).h(this.f11291u.getLineSpacingExtra(), this.f11291u.getLineSpacingMultiplier()).j(new com.google.android.material.internal.x() { // from class: com.google.android.material.textfield.k0
                    @Override // com.google.android.material.internal.x
                    public final void a(StaticLayout.Builder builder) {
                        builder.setBreakStrategy(this.f11342a.f11291u.getBreakStrategy());
                    }
                }).a().getHeight() + (this.P == 1 ? this.f11296w0.q() + this.Q + this.f11257d : 0.0f);
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
                Log.e("TextInputLayout", e10.getCause().getMessage(), e10);
            }
        }
        float fMax = Math.max(fZ, height);
        if (this.f11259e.getMeasuredHeight() < fMax) {
            this.f11259e.setMinimumHeight(Math.round(fMax));
        }
    }

    public final int u(Rect rect, float f10) {
        if (U()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f11259e.getCompoundPaddingTop()) - ((this.P != 0 || R()) ? 0 : (int) (this.f11296w0.A() / 2.0f));
    }

    public final boolean u0() {
        int iMax;
        if (this.f11259e == null || this.f11259e.getMeasuredHeight() >= (iMax = Math.max(this.f11255c.getMeasuredHeight(), this.f11253b.getMeasuredHeight()))) {
            return false;
        }
        this.f11259e.setMinimumHeight(iMax);
        return true;
    }

    public final Rect v(Rect rect) {
        if (this.f11259e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f11252a0;
        float fA = R() ? this.f11296w0.A() : this.f11296w0.y() * this.f11296w0.w();
        rect2.left = rect.left + this.f11259e.getCompoundPaddingLeft();
        rect2.top = u(rect, fA);
        rect2.right = rect.right - this.f11259e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fA);
        return rect2;
    }

    public final void v0() {
        if (this.P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11251a.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f11251a.requestLayout();
            }
        }
    }

    public final int w() {
        if (!this.D) {
            return 0;
        }
        int i10 = this.P;
        if (i10 == 0) {
            return (int) this.f11296w0.q();
        }
        if (i10 != 2) {
            return 0;
        }
        return R() ? (int) (this.f11296w0.q() / 2.0f) : Math.max(0, (int) (this.f11296w0.q() - (this.f11296w0.n() / 2.0f)));
    }

    public void w0(boolean z10) {
        x0(z10, false);
    }

    public final boolean x() {
        return this.P == 2 && y();
    }

    public final void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f11259e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f11259e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f11270j0;
        if (colorStateList2 != null) {
            this.f11296w0.Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f11270j0;
            this.f11296w0.Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f11290t0) : this.f11290t0));
        } else if (d0()) {
            this.f11296w0.Q(this.f11271k.r());
        } else if (this.f11277n && (textView = this.f11281p) != null) {
            this.f11296w0.Q(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f11272k0) != null) {
            this.f11296w0.W(colorStateList);
        }
        if (z13 || !this.f11298x0 || (isEnabled() && z12)) {
            if (z11 || this.f11294v0) {
                A(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f11294v0) {
            G(z10);
        }
    }

    public final boolean y() {
        return this.R > -1 && this.U != 0;
    }

    public final void y0() {
        EditText editText;
        if (this.f11291u == null || (editText = this.f11259e) == null) {
            return;
        }
        this.f11291u.setGravity(editText.getGravity());
        this.f11291u.setPadding(this.f11259e.getCompoundPaddingLeft(), this.f11259e.getCompoundPaddingTop(), this.f11259e.getCompoundPaddingRight(), this.f11259e.getCompoundPaddingBottom());
    }

    public final void z() {
        if (C()) {
            ((h) this.G).G0();
        }
    }

    public final void z0() {
        EditText editText = this.f11259e;
        A0(editText == null ? null : editText.getText());
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.textInputStyle);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.f11255c.Q(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f11255c.S(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f11255c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f11255c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f11255c.l0(drawable);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f11253b.r(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f11253b.s(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = D0;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f11263g = -1;
        this.f11265h = -1;
        this.f11267i = -1;
        this.f11269j = -1;
        this.f11271k = new v(this);
        this.f11279o = new f() { // from class: com.google.android.material.textfield.j0
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.W = new Rect();
        this.f11252a0 = new Rect();
        this.f11254b0 = new RectF();
        this.f11262f0 = new LinkedHashSet();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f11296w0 = bVar;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f11251a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = k4.a.f21834a;
        bVar.o0(timeInterpolator);
        bVar.l0(timeInterpolator);
        bVar.X(8388659);
        int[] iArr = j4.l.TextInputLayout;
        int i12 = j4.l.TextInputLayout_counterTextAppearance;
        int i13 = j4.l.TextInputLayout_counterOverflowTextAppearance;
        int i14 = j4.l.TextInputLayout_errorTextAppearance;
        int i15 = j4.l.TextInputLayout_helperTextTextAppearance;
        int i16 = j4.l.TextInputLayout_hintTextAppearance;
        z0 z0VarJ = com.google.android.material.internal.a0.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        a0 a0Var = new a0(this, z0VarJ);
        this.f11253b = a0Var;
        this.D = z0VarJ.a(j4.l.TextInputLayout_hintEnabled, true);
        setHint(z0VarJ.p(j4.l.TextInputLayout_android_hint));
        this.f11300y0 = z0VarJ.a(j4.l.TextInputLayout_hintAnimationEnabled, true);
        this.f11298x0 = z0VarJ.a(j4.l.TextInputLayout_expandedHintEnabled, true);
        int i17 = j4.l.TextInputLayout_android_minEms;
        if (z0VarJ.s(i17)) {
            setMinEms(z0VarJ.k(i17, -1));
        } else {
            int i18 = j4.l.TextInputLayout_android_minWidth;
            if (z0VarJ.s(i18)) {
                setMinWidth(z0VarJ.f(i18, -1));
            }
        }
        int i19 = j4.l.TextInputLayout_android_maxEms;
        if (z0VarJ.s(i19)) {
            setMaxEms(z0VarJ.k(i19, -1));
        } else {
            int i20 = j4.l.TextInputLayout_android_maxWidth;
            if (z0VarJ.s(i20)) {
                setMaxWidth(z0VarJ.f(i20, -1));
            }
        }
        this.M = com.google.android.material.shape.a.e(context2, attributeSet, i10, i11).m();
        this.O = context2.getResources().getDimensionPixelOffset(j4.d.mtrl_textinput_box_label_cutout_padding);
        this.Q = z0VarJ.e(j4.l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f11257d = getResources().getDimensionPixelSize(j4.d.m3_multiline_hint_filled_text_extra_space);
        this.S = z0VarJ.f(j4.l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(j4.d.mtrl_textinput_box_stroke_width_default));
        this.T = z0VarJ.f(j4.l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(j4.d.mtrl_textinput_box_stroke_width_focused));
        this.R = this.S;
        float fD = z0VarJ.d(j4.l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fD2 = z0VarJ.d(j4.l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fD3 = z0VarJ.d(j4.l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fD4 = z0VarJ.d(j4.l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        a.b bVarW = this.M.w();
        if (fD >= 0.0f) {
            bVarW.D(fD);
        }
        if (fD2 >= 0.0f) {
            bVarW.H(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarW.y(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarW.u(fD4);
        }
        this.M = bVarW.m();
        ColorStateList colorStateListB = d5.c.b(context2, z0VarJ, j4.l.TextInputLayout_boxBackgroundColor);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f11282p0 = defaultColor;
            this.V = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f11284q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f11286r0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f11288s0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f11286r0 = this.f11282p0;
                ColorStateList colorStateListA = d.a.a(context2, j4.c.mtrl_filled_background_color);
                this.f11284q0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f11288s0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.f11282p0 = 0;
            this.f11284q0 = 0;
            this.f11286r0 = 0;
            this.f11288s0 = 0;
        }
        int i21 = j4.l.TextInputLayout_android_textColorHint;
        if (z0VarJ.s(i21)) {
            ColorStateList colorStateListC = z0VarJ.c(i21);
            this.f11272k0 = colorStateListC;
            this.f11270j0 = colorStateListC;
        }
        int i22 = j4.l.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateListB2 = d5.c.b(context2, z0VarJ, i22);
        this.f11278n0 = z0VarJ.b(i22, 0);
        this.f11274l0 = ContextCompat.getColor(context2, j4.c.mtrl_textinput_default_box_stroke_color);
        this.f11290t0 = ContextCompat.getColor(context2, j4.c.mtrl_textinput_disabled_color);
        this.f11276m0 = ContextCompat.getColor(context2, j4.c.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = j4.l.TextInputLayout_boxStrokeErrorColor;
        if (z0VarJ.s(i23)) {
            setBoxStrokeErrorColor(d5.c.b(context2, z0VarJ, i23));
        }
        if (z0VarJ.n(i16, -1) != -1) {
            setHintTextAppearance(z0VarJ.n(i16, 0));
        }
        this.B = z0VarJ.c(j4.l.TextInputLayout_cursorColor);
        this.C = z0VarJ.c(j4.l.TextInputLayout_cursorErrorColor);
        int iN = z0VarJ.n(i14, 0);
        CharSequence charSequenceP = z0VarJ.p(j4.l.TextInputLayout_errorContentDescription);
        int iK = z0VarJ.k(j4.l.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zA = z0VarJ.a(j4.l.TextInputLayout_errorEnabled, false);
        int iN2 = z0VarJ.n(i15, 0);
        boolean zA2 = z0VarJ.a(j4.l.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceP2 = z0VarJ.p(j4.l.TextInputLayout_helperText);
        int iN3 = z0VarJ.n(j4.l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceP3 = z0VarJ.p(j4.l.TextInputLayout_placeholderText);
        boolean zA3 = z0VarJ.a(j4.l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(z0VarJ.k(j4.l.TextInputLayout_counterMaxLength, -1));
        this.f11285r = z0VarJ.n(i12, 0);
        this.f11283q = z0VarJ.n(i13, 0);
        setBoxBackgroundMode(z0VarJ.k(j4.l.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f11283q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f11285r);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = j4.l.TextInputLayout_errorTextColor;
        if (z0VarJ.s(i24)) {
            setErrorTextColor(z0VarJ.c(i24));
        }
        int i25 = j4.l.TextInputLayout_helperTextTextColor;
        if (z0VarJ.s(i25)) {
            setHelperTextColor(z0VarJ.c(i25));
        }
        int i26 = j4.l.TextInputLayout_hintTextColor;
        if (z0VarJ.s(i26)) {
            setHintTextColor(z0VarJ.c(i26));
        }
        int i27 = j4.l.TextInputLayout_counterTextColor;
        if (z0VarJ.s(i27)) {
            setCounterTextColor(z0VarJ.c(i27));
        }
        int i28 = j4.l.TextInputLayout_counterOverflowTextColor;
        if (z0VarJ.s(i28)) {
            setCounterOverflowTextColor(z0VarJ.c(i28));
        }
        int i29 = j4.l.TextInputLayout_placeholderTextColor;
        if (z0VarJ.s(i29)) {
            setPlaceholderTextColor(z0VarJ.c(i29));
        }
        s sVar = new s(this, z0VarJ);
        this.f11255c = sVar;
        boolean zA4 = z0VarJ.a(j4.l.TextInputLayout_android_enabled, true);
        setHintMaxLines(z0VarJ.k(j4.l.TextInputLayout_hintMaxLines, 1));
        z0VarJ.x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(a0Var);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setHint(@StringRes int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
