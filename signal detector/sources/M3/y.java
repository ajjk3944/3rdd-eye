package M3;

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
import com.apm.insight.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import o.a1;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2947a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f2948b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2949c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2950d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2951e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2952f;

    /* renamed from: g, reason: collision with root package name */
    public int f2953g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f2954h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2955j;

    public y(TextInputLayout textInputLayout, a1 a1Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f2947a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2950d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f2948b = appCompatTextView;
        if (com.bumptech.glide.c.E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        com.bumptech.glide.d.V(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        com.bumptech.glide.d.V(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) a1Var.f22480c;
        if (typedArray.hasValue(70)) {
            this.f2951e = com.bumptech.glide.c.o(getContext(), a1Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f2952f = AbstractC2993B.k(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(a1Var.d(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2953g) {
            this.f2953g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeL = com.bumptech.glide.d.l(typedArray.getInt(69, -1));
            this.f2954h = scaleTypeL;
            checkableImageButton.setScaleType(scaleTypeL);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(a1Var.c(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f2949c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f2950d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f2948b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2950d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2951e;
            PorterDuff.Mode mode = this.f2952f;
            TextInputLayout textInputLayout = this.f2947a;
            com.bumptech.glide.d.e(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            com.bumptech.glide.d.N(textInputLayout, checkableImageButton, this.f2951e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        com.bumptech.glide.d.V(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        com.bumptech.glide.d.V(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z6) {
        CheckableImageButton checkableImageButton = this.f2950d;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f2947a.f18536e;
        if (editText == null) {
            return;
        }
        this.f2948b.setPaddingRelative(this.f2950d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.f2949c == null || this.f2955j) ? 8 : 0;
        setVisibility((this.f2950d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f2948b.setVisibility(i);
        this.f2947a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        d();
    }
}
