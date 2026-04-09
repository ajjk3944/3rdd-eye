package kd;

import android.content.res.ColorStateList;
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
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f28242a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f28243b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f28244c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f28245d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f28246e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f28247f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f28248h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f28249i;
    public boolean j;

    public x(TextInputLayout textInputLayout, i0.f fVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f28242a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f28245d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f28243b = appCompatTextView;
        if (jm.a.q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f28249i;
        checkableImageButton.setOnClickListener(null);
        z3.t(checkableImageButton, onLongClickListener);
        this.f28249i = null;
        checkableImageButton.setOnLongClickListener(null);
        z3.t(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) fVar.f25417c;
        if (typedArray.hasValue(70)) {
            this.f28246e = jm.a.k(getContext(), fVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f28247f = zc.m.h(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(fVar.A(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.g) {
            this.g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeC = z3.c(typedArray.getInt(69, -1));
            this.f28248h = scaleTypeC;
            checkableImageButton.setScaleType(scaleTypeC);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(fVar.y(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f28244c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f28245d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f28243b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f28245d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f28246e;
            PorterDuff.Mode mode = this.f28247f;
            TextInputLayout textInputLayout = this.f28242a;
            z3.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            z3.s(textInputLayout, checkableImageButton, this.f28246e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f28249i;
        checkableImageButton.setOnClickListener(null);
        z3.t(checkableImageButton, onLongClickListener);
        this.f28249i = null;
        checkableImageButton.setOnLongClickListener(null);
        z3.t(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.f28245d;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f28242a.f20603e;
        if (editText == null) {
            return;
        }
        this.f28243b.setPaddingRelative(this.f28245d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i4 = (this.f28244c == null || this.j) ? 8 : 0;
        setVisibility((this.f28245d.getVisibility() == 0 || i4 == 0) ? 0 : 8);
        this.f28243b.setVisibility(i4);
        this.f28242a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        d();
    }
}
