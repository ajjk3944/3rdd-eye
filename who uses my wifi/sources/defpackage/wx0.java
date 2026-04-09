package defpackage;

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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wx0 extends LinearLayout {
    public final TextInputLayout f;
    public final s7 g;
    public CharSequence h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public int l;
    public ImageView.ScaleType m;
    public View.OnLongClickListener n;
    public boolean o;

    public wx0(TextInputLayout textInputLayout, xb4 xb4Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        s7 s7Var = new s7(getContext(), null);
        this.g = s7Var;
        if (ob1.o(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        bd2.w(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        bd2.w(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) xb4Var.h;
        if (typedArray.hasValue(70)) {
            this.j = ob1.f(getContext(), xb4Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.k = qb1.m(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(xb4Var.m(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.l) {
            this.l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeJ = bd2.j(typedArray.getInt(69, -1));
            this.m = scaleTypeJ;
            checkableImageButton.setScaleType(scaleTypeJ);
        }
        s7Var.setVisibility(8);
        s7Var.setId(R.id.textinput_prefix_text);
        s7Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        s7Var.setAccessibilityLiveRegion(1);
        s7Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            s7Var.setTextColor(xb4Var.k(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text2) ? null : text2;
        s7Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(s7Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.g.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.j;
            PorterDuff.Mode mode = this.k;
            TextInputLayout textInputLayout = this.f;
            bd2.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            bd2.t(textInputLayout, checkableImageButton, this.j);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        bd2.w(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        bd2.w(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.i;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f.j;
        if (editText == null) {
            return;
        }
        this.g.setPaddingRelative(this.i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.h == null || this.o) ? 8 : 0;
        setVisibility((this.i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.g.setVisibility(i);
        this.f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
