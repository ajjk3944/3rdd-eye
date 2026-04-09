package com.survicate.surveys.presentation.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import ar.k;
import as.d;
import bq.h;
import bq.i;
import br.l;
import br.n;
import com.google.android.material.datepicker.g;
import com.survicate.surveys.entities.attributes.MicroSurvicateTextInputStyle;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.entities.views.AnswerableView;
import com.survicate.surveys.entities.views.InitialValidationView;
import com.survicate.surveys.entities.views.InputValidationResult;
import com.survicate.surveys.entities.views.InputValidationView;
import com.survicate.surveys.entities.views.InputValidator;
import iq.a;
import kotlin.Metadata;
import on.r;
import on.t;
import on.w;
import se.b;
import u3.i0;
import vc.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\u00020\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000eJ\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u0011J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroSurvicateTextInput;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/views/InitialValidationView;", "", "Lcom/survicate/surveys/entities/views/InputValidationView;", "Lcom/survicate/surveys/entities/views/AnswerableView;", "Landroid/util/AttributeSet;", "attrsSet", "Llq/b0;", "setupView", "(Landroid/util/AttributeSet;)V", "", "limit", "setCharacterLimit", "(I)V", "error", "setError", "(Ljava/lang/String;)V", "Lcom/survicate/surveys/entities/attributes/MicroSurvicateTextInputStyle;", "inputStyle", "setInputStyle", "(Lcom/survicate/surveys/entities/attributes/MicroSurvicateTextInputStyle;)V", "inputType", "setInputType", "hint", "setAutofillHint", "label", "setInputLabel", "description", "setLabelContentDescription", "setInputHint", "getAnswer", "()Ljava/lang/String;", "", "enabled", "setAutoSaveEnabled", "(Z)V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurvicateTextInput extends FrameLayout implements InitialValidationView<String>, InputValidationView<String>, AnswerableView {
    public static final /* synthetic */ int H = 0;
    public MicroColorScheme B;
    public n D;
    public k E;
    public InputValidator F;
    public int G;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6591a;

    /* renamed from: d, reason: collision with root package name */
    public final View f6592d;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f6593g;

    /* renamed from: r, reason: collision with root package name */
    public final EditText f6594r;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6595x;

    /* renamed from: y, reason: collision with root package name */
    public final a f6596y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MicroSurvicateTextInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        l.e(context, "context");
    }

    private final void setCharacterLimit(int limit) {
        this.G = limit;
        this.f6595x.setVisibility(limit > 0 ? 0 : 8);
        EditText editText = this.f6594r;
        if (limit > 0) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(limit)});
        } else {
            editText.setFilters(new InputFilter[0]);
        }
    }

    private final void setError(String error) throws Resources.NotFoundException {
        this.f6592d.setVisibility(0);
        this.f6593g.setText(error);
        Context context = getContext();
        l.d(context, "getContext(...)");
        MicroColorScheme microColorScheme = this.B;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        StateListDrawable stateListDrawableP = e.p(context, microColorScheme, true);
        EditText editText = this.f6594r;
        editText.setBackground(stateListDrawableP);
        editText.setTag(r.survicate_accessibility_state_error, error);
    }

    private final void setupView(AttributeSet attrsSet) {
        Context context = getContext();
        l.d(context, "getContext(...)");
        int[] iArr = w.MicroSurvicateTextInput;
        l.d(iArr, "MicroSurvicateTextInput");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrsSet, iArr, 0, 0);
        setInputStyle(MicroSurvicateTextInputStyle.INSTANCE.fromId(typedArrayObtainStyledAttributes.getInteger(w.MicroSurvicateTextInput_survicateTextInputStyle, MicroSurvicateTextInputStyle.TEXT_ANSWER.getId())));
        typedArrayObtainStyledAttributes.recycle();
        i0.n(this.f6594r, new g(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, int i10, k kVar) {
        this.D = (n) kVar;
        EditText editText = this.f6594r;
        a aVar = this.f6596y;
        editText.removeTextChangedListener(aVar);
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        editText.addTextChangedListener(aVar);
        setCharacterLimit(i10);
        d(editText.getText().length());
    }

    public final void b() throws Resources.NotFoundException {
        this.f6592d.setVisibility(8);
        Context context = getContext();
        l.d(context, "getContext(...)");
        MicroColorScheme microColorScheme = this.B;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        StateListDrawable stateListDrawableP = e.p(context, microColorScheme, false);
        EditText editText = this.f6594r;
        editText.setBackground(stateListDrawableP);
        editText.setTag(r.survicate_accessibility_state_error, null);
    }

    @Override // com.survicate.surveys.entities.views.InitialValidationView
    public final void bindInitialValidator(k kVar) {
        l.e(kVar, "validator");
        this.E = kVar;
    }

    @Override // com.survicate.surveys.entities.views.InputValidationView
    public final void bindValidator(InputValidator<String> inputValidator) {
        l.e(inputValidator, "validator");
        this.F = inputValidator;
    }

    public final void c(MicroColorScheme microColorScheme) throws Resources.NotFoundException {
        l.e(microColorScheme, "colorScheme");
        this.B = microColorScheme;
        this.f6591a.setTextColor(microColorScheme.getQuestion());
        Context context = getContext();
        l.d(context, "getContext(...)");
        StateListDrawable stateListDrawableP = e.p(context, microColorScheme, false);
        EditText editText = this.f6594r;
        editText.setBackground(stateListDrawableP);
        editText.setTextColor(microColorScheme.getAnswer());
        editText.setOnFocusChangeListener(new h(1, this));
        editText.setHintTextColor(b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.InputHint.getOpacityValue()));
        this.f6595x.setTextColor(microColorScheme.getAnswer());
    }

    public final void d(int i10) {
        if (this.G > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append('/');
            sb2.append(this.G);
            this.f6595x.setText(sb2.toString());
        }
    }

    @Override // com.survicate.surveys.entities.views.AnswerableView
    public String getAnswer() {
        return this.f6594r.getText().toString();
    }

    @Override // com.survicate.surveys.entities.views.InitialValidationView
    public final boolean isInitiallyValid() {
        return ((Boolean) this.E.a(this.f6594r.getText().toString())).booleanValue();
    }

    public final void setAutoSaveEnabled(boolean enabled) {
        this.f6594r.setSaveEnabled(enabled);
    }

    public final void setAutofillHint(String hint) {
        int i10 = hint != null ? 1 : 2;
        EditText editText = this.f6594r;
        editText.setImportantForAutofill(i10);
        editText.setAutofillHints(new String[]{hint});
    }

    public final void setInputHint(String hint) {
        l.e(hint, "hint");
        this.f6594r.setHint(hint);
    }

    public final void setInputLabel(String label) {
        String str = label == null ? "" : label;
        TextView textView = this.f6591a;
        textView.setText(str);
        textView.setVisibility(label == null || tt.l.D0(label) ? 8 : 0);
        textView.setLabelFor((label == null || tt.l.D0(label)) ? -1 : r.view_micro_survicate_text_input);
    }

    public final void setInputStyle(MicroSurvicateTextInputStyle inputStyle) {
        l.e(inputStyle, "inputStyle");
        int dimensionPixelSize = inputStyle.getHeight() != null ? getContext().getResources().getDimensionPixelSize(inputStyle.getHeight().intValue()) : -2;
        EditText editText = this.f6594r;
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = dimensionPixelSize;
        editText.setLayoutParams(layoutParams);
        editText.setMaxLines(inputStyle.getSingleLine() ? 1 : Integer.MAX_VALUE);
        if (inputStyle.getSingleLine()) {
            return;
        }
        editText.setOnTouchListener(new je.g(1, editText));
    }

    public final void setInputType(int inputType) {
        this.f6594r.setInputType(inputType);
    }

    public final void setLabelContentDescription(String description) {
        l.e(description, "description");
        this.f6591a.setContentDescription(description);
    }

    @Override // com.survicate.surveys.entities.views.InputValidationView
    public final boolean validate() {
        InputValidator inputValidator = this.F;
        if (inputValidator == null) {
            return true;
        }
        InputValidationResult inputValidationResultValidate = inputValidator.validate(this.f6594r.getText().toString());
        if (inputValidationResultValidate.isSuccess()) {
            b();
        } else {
            String errorMessage = inputValidationResultValidate.getErrorMessage();
            if (errorMessage == null) {
                errorMessage = "";
            }
            setError(errorMessage);
        }
        return inputValidationResultValidate.isSuccess();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MicroSurvicateTextInput(Context context, AttributeSet attributeSet, int i10) {
        attributeSet = (i10 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.E = i.f2871d;
        View viewInflate = View.inflate(context, t.view_micro_survicate_text_input, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survicate_text_input_label);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6591a = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survicate_text_input_error_popup);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6592d = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survicate_text_input_error);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6593g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survicate_text_input);
        l.d(viewFindViewById4, "findViewById(...)");
        this.f6594r = (EditText) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survicate_text_input_char_limit);
        l.d(viewFindViewById5, "findViewById(...)");
        this.f6595x = (TextView) viewFindViewById5;
        this.f6596y = new a(new d(3, this));
        setupView(attributeSet);
    }
}
