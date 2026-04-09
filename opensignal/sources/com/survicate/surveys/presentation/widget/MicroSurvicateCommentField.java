package com.survicate.surveys.presentation.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import ar.a;
import ar.k;
import as.d;
import ba.m;
import bq.h;
import br.l;
import com.survicate.surveys.entities.attributes.MicroSurvicateCommentFieldStyle;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import je.g;
import kotlin.Metadata;
import on.r;
import on.t;
import on.u;
import on.w;
import se.b;
import vc.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\nR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroSurvicateCommentField;", "Landroid/widget/FrameLayout;", "Landroid/util/AttributeSet;", "attrsSet", "Llq/b0;", "setupView", "(Landroid/util/AttributeSet;)V", "", "label", "setContentDescriptionForLabel", "(Ljava/lang/String;)V", "Lcom/survicate/surveys/entities/attributes/MicroSurvicateCommentFieldStyle;", "style", "setStyle", "(Lcom/survicate/surveys/entities/attributes/MicroSurvicateCommentFieldStyle;)V", "hint", "setInputHint", "Lkotlin/Function0;", "D", "Lar/a;", "getOnInputFocus", "()Lar/a;", "setOnInputFocus", "(Lar/a;)V", "onInputFocus", "value", "getLabel", "()Ljava/lang/String;", "setLabel", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurvicateCommentField extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public Object B;

    /* renamed from: D, reason: from kotlin metadata */
    public a onInputFocus;

    /* renamed from: a, reason: collision with root package name */
    public final View f6585a;

    /* renamed from: d, reason: collision with root package name */
    public final View f6586d;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f6587g;

    /* renamed from: r, reason: collision with root package name */
    public final EditText f6588r;

    /* renamed from: x, reason: collision with root package name */
    public final iq.a f6589x;

    /* renamed from: y, reason: collision with root package name */
    public MicroSurvicateCommentFieldStyle f6590y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurvicateCommentField(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.f6590y = MicroSurvicateCommentFieldStyle.STANDALONE;
        View viewInflate = View.inflate(context, t.view_micro_comment, this);
        l.d(viewInflate, "inflate(...)");
        this.f6585a = viewInflate;
        View viewFindViewById = viewInflate.findViewById(r.view_micro_comment_label_space);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6586d = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_comment_label);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6587g = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_comment_input_text);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6588r = (EditText) viewFindViewById3;
        this.f6589x = new iq.a(new d(2, this));
        setupView(attributeSet);
    }

    private final void setContentDescriptionForLabel(String label) {
        this.f6587g.setContentDescription(!tt.l.D0(label) ? getContext().getString(u.survicate_micro_field_required_content_description, label) : null);
    }

    private final void setupView(AttributeSet attrsSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrsSet, w.MicroSurvicateCommentField);
        l.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        MicroSurvicateCommentFieldStyle microSurvicateCommentFieldStyleFromId = MicroSurvicateCommentFieldStyle.INSTANCE.fromId(typedArrayObtainStyledAttributes.getInteger(w.MicroSurvicateCommentField_survicateCommentFieldStyle, MicroSurvicateCommentFieldStyle.STANDALONE.getId()));
        typedArrayObtainStyledAttributes.recycle();
        setStyle(microSurvicateCommentFieldStyleFromId);
        EditText editText = this.f6588r;
        editText.setImeOptions(6);
        editText.setSaveEnabled(false);
        editText.setOnTouchListener(new g(1, editText));
    }

    public final void a(String str, k kVar) {
        this.B = kVar;
        EditText editText = this.f6588r;
        iq.a aVar = this.f6589x;
        editText.removeTextChangedListener(aVar);
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        editText.addTextChangedListener(aVar);
    }

    public final void b() {
        this.f6588r.clearFocus();
    }

    public final void c(MicroColorScheme microColorScheme) throws Resources.NotFoundException {
        l.e(microColorScheme, "colorScheme");
        if (this.f6590y == MicroSurvicateCommentFieldStyle.STANDALONE) {
            Context context = getContext();
            l.d(context, "getContext(...)");
            setBackground(e.n(context, microColorScheme, true));
            m.o(this.f6585a);
        } else {
            setBackground(null);
        }
        this.f6587g.setTextColor(microColorScheme.getAnswer());
        Context context2 = getContext();
        l.d(context2, "getContext(...)");
        StateListDrawable stateListDrawableP = e.p(context2, microColorScheme, false);
        EditText editText = this.f6588r;
        editText.setBackground(stateListDrawableP);
        editText.setTextColor(microColorScheme.getAnswer());
        editText.setHintTextColor(b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.InputHint.getOpacityValue()));
        editText.setOnFocusChangeListener(new h(0, this));
    }

    public final void d() {
        Rect rect = new Rect();
        getDrawingRect(rect);
        requestRectangleOnScreen(rect, false);
    }

    public final String getLabel() {
        return this.f6587g.getText().toString();
    }

    public final a getOnInputFocus() {
        return this.onInputFocus;
    }

    public final void setInputHint(String hint) {
        l.e(hint, "hint");
        this.f6588r.setHint(hint);
    }

    public final void setLabel(String str) {
        l.e(str, "value");
        TextView textView = this.f6587g;
        textView.setText(str);
        setContentDescriptionForLabel(str);
        textView.setVisibility(!tt.l.D0(str) ? 0 : 8);
        this.f6586d.setVisibility(tt.l.D0(str) ? 8 : 0);
    }

    public final void setOnInputFocus(a aVar) {
        this.onInputFocus = aVar;
    }

    public final void setStyle(MicroSurvicateCommentFieldStyle style) throws Resources.NotFoundException {
        l.e(style, "style");
        this.f6590y = style;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(style.getHeight());
        EditText editText = this.f6588r;
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = dimensionPixelSize;
        editText.setLayoutParams(layoutParams);
        this.f6586d.setVisibility(style == MicroSurvicateCommentFieldStyle.STANDALONE ? 0 : 8);
    }
}
