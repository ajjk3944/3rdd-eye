package p4;

import L0.I;
import L0.S;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import h4.C4415c;
import java.util.WeakHashMap;
import o.X;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class p extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f45199b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f45200c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f45201d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f45202e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f45203f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f45204g;

    /* renamed from: h, reason: collision with root package name */
    public int f45205h;
    public ImageView.ScaleType i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f45206j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f45207k;

    public p(TextInputLayout textInputLayout, X x10) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f45199b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f45202e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f45200c = appCompatTextView;
        if (C4415c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f45206j;
        checkableImageButton.setOnClickListener(null);
        C5459i.d(checkableImageButton, onLongClickListener);
        this.f45206j = null;
        checkableImageButton.setOnLongClickListener(null);
        C5459i.d(checkableImageButton, null);
        TypedArray typedArray = x10.f44608b;
        if (typedArray.hasValue(69)) {
            this.f45203f = C4415c.b(getContext(), x10, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f45204g = d4.n.b(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(x10.b(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f45205h) {
            this.f45205h = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeB = C5459i.b(typedArray.getInt(68, -1));
            this.i = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(x10.a(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f45201d = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f45202e;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        return this.f45200c.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f45202e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f45203f;
            PorterDuff.Mode mode = this.f45204g;
            TextInputLayout textInputLayout = this.f45199b;
            C5459i.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            C5459i.c(textInputLayout, checkableImageButton, this.f45203f);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f45206j;
        checkableImageButton.setOnClickListener(null);
        C5459i.d(checkableImageButton, onLongClickListener);
        this.f45206j = null;
        checkableImageButton.setOnLongClickListener(null);
        C5459i.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f45202e;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f45199b.f23079e;
        if (editText == null) {
            return;
        }
        if (this.f45202e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, S> weakHashMap2 = I.f3792a;
        this.f45200c.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f45201d == null || this.f45207k) ? 8 : 0;
        setVisibility((this.f45202e.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f45200c.setVisibility(i);
        this.f45199b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) throws Resources.NotFoundException {
        super.onMeasure(i, i10);
        d();
    }
}
