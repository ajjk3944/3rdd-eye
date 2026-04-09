package com.survicate.surveys.presentation.widget;

import am.b;
import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import ar.a;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.attributes.MicroSurvicateSelectionType;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import kotlin.Metadata;
import on.r;
import on.t;
import vc.e;
import xu.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroDisclaimerView;", "Landroid/widget/FrameLayout;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnCheckboxToggle", "()Lar/a;", "setOnCheckboxToggle", "(Lar/a;)V", "onCheckboxToggle", "bq/a", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroDisclaimerView extends FrameLayout {
    public static final /* synthetic */ int H = 0;
    public final View B;
    public final View D;
    public final TextView E;
    public final Space F;
    public final TextView G;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onCheckboxToggle;

    /* renamed from: d, reason: collision with root package name */
    public final View f6542d;

    /* renamed from: g, reason: collision with root package name */
    public final View f6543g;

    /* renamed from: r, reason: collision with root package name */
    public final CheckBox f6544r;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6545x;

    /* renamed from: y, reason: collision with root package name */
    public final View f6546y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroDisclaimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_disclaimer, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_disclaimer_checkbox_section);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6542d = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_disclaimer_checkbox_touch_area);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6543g = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_disclaimer_checkbox);
        l.d(viewFindViewById3, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById3;
        this.f6544r = checkBox;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_disclaimer_checkbox_label);
        l.d(viewFindViewById4, "findViewById(...)");
        this.f6545x = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_disclaimer_divider_top);
        l.d(viewFindViewById5, "findViewById(...)");
        this.f6546y = viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_disclaimer_divider_middle);
        l.d(viewFindViewById6, "findViewById(...)");
        this.B = viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_disclaimer_text_section);
        l.d(viewFindViewById7, "findViewById(...)");
        this.D = viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_disclaimer_title);
        l.d(viewFindViewById8, "findViewById(...)");
        this.E = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(r.view_micro_disclaimer_title_space);
        l.d(viewFindViewById9, "findViewById(...)");
        this.F = (Space) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(r.view_micro_disclaimer_description);
        l.d(viewFindViewById10, "findViewById(...)");
        this.G = (TextView) viewFindViewById10;
        checkBox.setSaveEnabled(false);
        Context context2 = getContext();
        l.d(context2, "getContext(...)");
        viewFindViewById2.setBackground(e.o(context2, 0.0f));
        viewFindViewById2.setOnClickListener(new b(2, this));
    }

    public final void a(bq.a aVar, Bundle bundle) {
        String str = aVar.f2857b;
        String str2 = aVar.f2856a;
        String str3 = aVar.f2858c;
        boolean zD0 = tt.l.D0(str3);
        int i10 = 8;
        this.f6542d.setVisibility(!zD0 ? 0 : 8);
        this.f6545x.setText(str3);
        this.f6544r.setChecked(bundle != null ? bundle.getBoolean("IS_DISCLAIMER_CHECKBOX_CHECKED") : false);
        boolean z10 = (tt.l.D0(str2) && tt.l.D0(str)) ? false : true;
        this.D.setVisibility(z10 ? 0 : 8);
        TextView textView = this.E;
        textView.setText(str2);
        textView.setVisibility(!tt.l.D0(str2) ? 0 : 8);
        this.F.setVisibility((tt.l.D0(str2) || tt.l.D0(str)) ? 8 : 0);
        a.a.A(this.G, str);
        if (z10 && !zD0) {
            i10 = 0;
        }
        this.B.setVisibility(i10);
    }

    public final void b(MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        int iZ = se.b.z(microColorScheme.getQuestion(), MicroColorControlOpacity.Divider.getOpacityValue());
        this.f6546y.setBackgroundColor(iZ);
        this.B.setBackgroundColor(iZ);
        this.E.setTextColor(microColorScheme.getAnswer());
        int answer = microColorScheme.getAnswer();
        TextView textView = this.G;
        l.e(textView, "<this>");
        textView.setTextColor(answer);
        textView.setLinkTextColor(answer);
        Context context = getContext();
        l.d(context, "getContext(...)");
        textView.setBackground(e.o(context, 0.0f));
        this.f6545x.setTextColor(microColorScheme.getAnswer());
        RippleDrawable rippleDrawableN = d.n(microColorScheme);
        CheckBox checkBox = this.f6544r;
        checkBox.setBackground(rippleDrawableN);
        Context context2 = getContext();
        l.d(context2, "getContext(...)");
        checkBox.setButtonDrawable(d.l(context2, microColorScheme, MicroSurvicateSelectionType.Checkbox));
    }

    public final Bundle getCurrentUiState() {
        return e5.m(new lq.l("IS_DISCLAIMER_CHECKBOX_CHECKED", Boolean.valueOf(this.f6544r.isChecked())));
    }

    public final a getOnCheckboxToggle() {
        return this.onCheckboxToggle;
    }

    public final void setOnCheckboxToggle(a aVar) {
        this.onCheckboxToggle = aVar;
    }
}
