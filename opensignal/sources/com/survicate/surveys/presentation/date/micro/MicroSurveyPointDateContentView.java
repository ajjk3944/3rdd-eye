package com.survicate.surveys.presentation.date.micro;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ar.a;
import bq.g;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.date.SurveyPointDateSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import com.survicate.surveys.utils.SurvicateLocalDate;
import dp.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import on.r;
import on.t;
import on.u;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001+J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/survicate/surveys/presentation/date/micro/MicroSurveyPointDateContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnSelectDateClick", "()Lar/a;", "setOnSelectDateClick", "(Lar/a;)V", "onSelectDateClick", "d", "getOnValidationStateUpdate", "setOnValidationStateUpdate", "onValidationStateUpdate", "Lcom/survicate/surveys/utils/SurvicateLocalDate;", "<set-?>", "g", "Lcom/survicate/surveys/utils/SurvicateLocalDate;", "getSelectedDate", "()Lcom/survicate/surveys/utils/SurvicateLocalDate;", "selectedDate", "", "r", "Ljava/lang/String;", "getCommentFieldText", "()Ljava/lang/String;", "commentFieldText", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/date/SurveyPointDateSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/date/SurveyPointDateSettings;", "surveyPointSettings", "dp/b", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointDateContentView extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public final View B;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final MicroSurvicateCommentField I;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onSelectDateClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public SurvicateLocalDate selectedDate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public String commentFieldText;

    /* renamed from: x, reason: collision with root package name */
    public b f6399x;

    /* renamed from: y, reason: collision with root package name */
    public final MicroQuestionHeader f6400y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointDateContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.commentFieldText = "";
        View viewInflate = View.inflate(context, t.view_micro_survey_point_date_content, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_date_content_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6400y = (MicroQuestionHeader) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_date_content_selected_date_container);
        l.d(viewFindViewById2, "findViewById(...)");
        this.B = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_date_content_selected_year);
        l.d(viewFindViewById3, "findViewById(...)");
        this.D = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_date_content_year_month_divider);
        l.d(viewFindViewById4, "findViewById(...)");
        this.E = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_date_content_selected_month);
        l.d(viewFindViewById5, "findViewById(...)");
        this.F = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_date_content_month_day_divider);
        l.d(viewFindViewById6, "findViewById(...)");
        this.G = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_date_content_selected_day);
        l.d(viewFindViewById7, "findViewById(...)");
        this.H = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_date_content_comment);
        l.d(viewFindViewById8, "findViewById(...)");
        this.I = (MicroSurvicateCommentField) viewFindViewById8;
        viewFindViewById2.setOnClickListener(new am.b(6, this));
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        b bVar = this.f6399x;
        if (bVar != null) {
            return bVar.f7422a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointDateSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.date.SurveyPointDateSettings");
        return (SurveyPointDateSettings) settings;
    }

    public final void a(b bVar, Bundle bundle) {
        SurvicateLocalDate survicateLocalDate;
        Parcelable parcelable;
        this.f6399x = bVar;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("SELECTED_DATE", SurvicateLocalDate.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("SELECTED_DATE");
                if (!(parcelable2 instanceof SurvicateLocalDate)) {
                    parcelable2 = null;
                }
                parcelable = (SurvicateLocalDate) parcelable2;
            }
            survicateLocalDate = (SurvicateLocalDate) parcelable;
        } else {
            survicateLocalDate = null;
        }
        if (survicateLocalDate == null) {
            survicateLocalDate = bVar.f7425d;
        }
        this.selectedDate = survicateLocalDate;
        b bVar2 = this.f6399x;
        if (bVar2 == null) {
            l.l("bindingData");
            throw null;
        }
        this.f6400y.a(bVar2.f7423b);
        b();
        String string = bundle != null ? bundle.getString("COMMENT_FIELD_TEXT") : null;
        if (string == null) {
            string = "";
        }
        this.commentFieldText = string;
        String commentLabel = getSurveyPointSettings().getCommentLabel();
        String str = commentLabel != null ? commentLabel : "";
        MicroSurvicateCommentField microSurvicateCommentField = this.I;
        microSurvicateCommentField.setLabel(str);
        b bVar3 = this.f6399x;
        if (bVar3 == null) {
            l.l("bindingData");
            throw null;
        }
        String string2 = bVar3.f7424c;
        if (string2.length() == 0) {
            string2 = getContext().getString(u.survicate_input_text_placeholder);
            l.d(string2, "getString(...)");
        }
        microSurvicateCommentField.setInputHint(string2);
        microSurvicateCommentField.setVisibility(getSurveyPointSettings().getAddComment() ? 0 : 8);
        microSurvicateCommentField.a(this.commentFieldText, new g(1, this, MicroSurveyPointDateContentView.class, "onCommentChanged", "onCommentChanged(Ljava/lang/String;)V", 0, 1));
    }

    public final void b() {
        SurvicateLocalDate selectedDate = getSelectedDate();
        l.e(selectedDate, "date");
        this.D.setText(String.valueOf(selectedDate.f6603a));
        SurvicateLocalDate selectedDate2 = getSelectedDate();
        l.e(selectedDate2, "date");
        this.F.setText(tt.l.H0(2, String.valueOf(selectedDate2.f6604d)));
        SurvicateLocalDate selectedDate3 = getSelectedDate();
        l.e(selectedDate3, "date");
        this.H.setText(tt.l.H0(2, String.valueOf(selectedDate3.f6605g)));
        SurvicateLocalDate selectedDate4 = getSelectedDate();
        l.e(selectedDate4, "date");
        String str = DateFormat.getDateInstance(1).format(Long.valueOf(selectedDate4.d().getTimeInMillis()));
        l.d(str, "format(...)");
        this.B.setContentDescription(str);
    }

    public final List<SurveyAnswer> getAnswer() {
        SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
        SurvicateLocalDate selectedDate = getSelectedDate();
        l.e(selectedDate, "date");
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(selectedDate.d().getTimeInMillis()));
        l.d(str, "format(...)");
        surveyAnswer.setContent(str);
        surveyAnswer.setAnswer(surveyAnswer.getContent());
        String str2 = this.commentFieldText;
        if (tt.l.D0(str2) || !getSurveyPointSettings().getAddComment()) {
            str2 = null;
        }
        surveyAnswer.setComment(str2);
        return e5.H(surveyAnswer);
    }

    public final String getCommentFieldText() {
        return this.commentFieldText;
    }

    public final Bundle getCurrentUiState() {
        return e5.m(new lq.l("SELECTED_DATE", getSelectedDate()), new lq.l("COMMENT_FIELD_TEXT", this.commentFieldText));
    }

    public final a getOnSelectDateClick() {
        return this.onSelectDateClick;
    }

    public final a getOnValidationStateUpdate() {
        return this.onValidationStateUpdate;
    }

    public final SurvicateLocalDate getSelectedDate() {
        SurvicateLocalDate survicateLocalDate = this.selectedDate;
        if (survicateLocalDate != null) {
            return survicateLocalDate;
        }
        l.l("selectedDate");
        throw null;
    }

    public final void setOnSelectDateClick(a aVar) {
        this.onSelectDateClick = aVar;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
