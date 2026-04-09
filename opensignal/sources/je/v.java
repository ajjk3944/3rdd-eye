package je;

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
import p.q0;

/* loaded from: classes.dex */
public final class v extends LinearLayout {
    public int B;
    public ImageView.ScaleType D;
    public View.OnLongClickListener E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f13692a;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f13693d;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f13694g;

    /* renamed from: r, reason: collision with root package name */
    public final CheckableImageButton f13695r;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f13696x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f13697y;

    public v(TextInputLayout textInputLayout, io.sentry.k kVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f13692a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ed.h.design_text_input_start_icon, (ViewGroup) this, false);
        this.f13695r = checkableImageButton;
        q0 q0Var = new q0(getContext(), null);
        this.f13693d = q0Var;
        if (xu.l.F(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.E;
        checkableImageButton.setOnClickListener(null);
        vc.e.O(checkableImageButton, onLongClickListener);
        this.E = null;
        checkableImageButton.setOnLongClickListener(null);
        vc.e.O(checkableImageButton, null);
        int i10 = ed.l.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) kVar.f12398g;
        if (typedArray.hasValue(i10)) {
            this.f13696x = xu.l.r(getContext(), kVar, ed.l.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_startIconTintMode)) {
            this.f13697y = xd.l.d(typedArray.getInt(ed.l.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_startIconDrawable)) {
            b(kVar.U(ed.l.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(ed.l.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(ed.l.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(ed.l.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(ed.l.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(ed.d.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.B) {
            this.B = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeJ = vc.e.j(typedArray.getInt(ed.l.TextInputLayout_startIconScaleType, -1));
            this.D = scaleTypeJ;
            checkableImageButton.setScaleType(scaleTypeJ);
        }
        q0Var.setVisibility(8);
        q0Var.setId(ed.f.textinput_prefix_text);
        q0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        q0Var.setAccessibilityLiveRegion(1);
        q0Var.setTextAppearance(typedArray.getResourceId(ed.l.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(ed.l.TextInputLayout_prefixTextColor)) {
            q0Var.setTextColor(kVar.T(ed.l.TextInputLayout_prefixTextColor));
        }
        CharSequence text2 = typedArray.getText(ed.l.TextInputLayout_prefixText);
        this.f13694g = TextUtils.isEmpty(text2) ? null : text2;
        q0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(q0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f13695r;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f13693d.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f13695r;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f13696x;
            PorterDuff.Mode mode = this.f13697y;
            TextInputLayout textInputLayout = this.f13692a;
            vc.e.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            vc.e.H(textInputLayout, checkableImageButton, this.f13696x);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.E;
        checkableImageButton.setOnClickListener(null);
        vc.e.O(checkableImageButton, onLongClickListener);
        this.E = null;
        checkableImageButton.setOnLongClickListener(null);
        vc.e.O(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f13695r;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f13692a.f5767x;
        if (editText == null) {
            return;
        }
        this.f13693d.setPaddingRelative(this.f13695r.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ed.d.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10 = (this.f13694g == null || this.F) ? 8 : 0;
        setVisibility((this.f13695r.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f13693d.setVisibility(i10);
        this.f13692a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
