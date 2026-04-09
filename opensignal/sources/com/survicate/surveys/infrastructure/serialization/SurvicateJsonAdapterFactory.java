package com.survicate.surveys.infrastructure.serialization;

import com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter;
import com.survicate.surveys.entities.survey.audience.NetworkAudienceKnownUserFilter;
import com.survicate.surveys.entities.survey.audience.NetworkAudienceLocaleFilter;
import com.survicate.surveys.entities.survey.audience.NetworkAudiencePlatformFilter;
import com.survicate.surveys.entities.survey.audience.NetworkAudienceScreenOrientationFilter;
import com.survicate.surveys.entities.survey.audience.NetworkAudienceUserFilter;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterBooleanAttribute;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterDateTimeAttribute;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterNumberAttribute;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterStringAttribute;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterTimeIntervalAttribute;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.cta.ButtonCloseCtaSettings;
import com.survicate.surveys.entities.survey.questions.cta.ButtonLinkCtaSettings;
import com.survicate.surveys.entities.survey.questions.cta.ButtonNextCtaSettings;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.date.SurveyPointDateSettings;
import com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings;
import com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.csat.SurveyPointCsatSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.numerical.SurveyPointNumericalSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.shape.SurveyPointShapeSettings;
import com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings;
import com.survicate.surveys.entities.survey.questions.question.smileyScale.SurveyPointSmileyScaleSettings;
import com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings;
import com.survicate.surveys.entities.survey.surveyLogic.display.DateDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.FormDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.MatrixDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.MultipleChoiceDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.RangeDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.SingleChoiceDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.TextDisplayLogic;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.entities.survey.theme.Theme;
import com.survicate.surveys.entities.survey.theme.ThemeSettings;
import com.survicate.surveys.entities.survey.theme.ThemeType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import nk.j0;
import nk.p0;
import nk.q;
import nk.r;

/* loaded from: classes.dex */
public class SurvicateJsonAdapterFactory implements q {
    @Override // nk.q
    public r create(Type type, Set<? extends Annotation> set, j0 j0Var) {
        if (type.equals(Theme.class)) {
            return new ThemeJsonAdapter(new ColorSchemeJsonAdapter(j0Var.a(MicroColorScheme.class), j0Var.a(ThemeType.class)), j0Var.a(ThemeSettings.class), j0Var.a(ThemeType.class));
        }
        if (type.equals(ColorScheme.class)) {
            return new ColorSchemeJsonAdapter(j0Var.a(MicroColorScheme.class), j0Var.a(ThemeType.class));
        }
        if (type.equals(SurveyCtaSurveyPoint.class)) {
            return new SurveyCtaSurveyPointJsonAdapter(j0Var.a(ButtonLinkCtaSettings.class), j0Var.a(ButtonNextCtaSettings.class), j0Var.a(ButtonCloseCtaSettings.class));
        }
        if (type.equals(p0.f(List.class, SurveyPoint.class))) {
            return new SurveyPointResponseJsonAdapter(j0Var.a(SurveyFormSurveyPoint.class), j0Var.a(SurveyQuestionSurveyPoint.class), j0Var.a(SurveyNpsSurveyPoint.class), j0Var.a(SurveyCtaSurveyPoint.class));
        }
        if (type.equals(SurveyQuestionSurveyPoint.class)) {
            return new SurveyQuestionSurveyPointJsonAdapter(j0Var.a(QuestionPointAnswer.class), j0Var.a(SurveyPointMatrixSettings.class), j0Var.a(SurveyPointDateSettings.class), j0Var.a(SurveyPointMultipleSettings.class), j0Var.a(SurveyPointCsatSettings.class), j0Var.a(SurveyPointNumericalSettings.class), j0Var.a(SurveyPointShapeSettings.class), j0Var.a(SurveyPointSingleSettings.class), j0Var.a(SurveyPointSmileyScaleSettings.class), j0Var.a(SurveyPointTextSettings.class));
        }
        if (type.equals(NetworkAudienceFilter.class)) {
            return new NetworkAudienceFilterJsonAdapter(j0Var.a(NetworkAudienceLocaleFilter.class), j0Var.a(NetworkAudiencePlatformFilter.class), j0Var.a(NetworkAudienceKnownUserFilter.class), j0Var.a(NetworkAudienceUserFilter.class), j0Var.a(NetworkAudienceScreenOrientationFilter.class));
        }
        if (type.equals(NetworkAudienceUserFilterAttribute.class)) {
            return new NetworkAudienceUserFilterAttributeJsonAdapter(j0Var.a(NetworkAudienceUserFilterStringAttribute.class), j0Var.a(NetworkAudienceUserFilterNumberAttribute.class), j0Var.a(NetworkAudienceUserFilterBooleanAttribute.class), j0Var.a(NetworkAudienceUserFilterDateTimeAttribute.class), j0Var.a(NetworkAudienceUserFilterTimeIntervalAttribute.class));
        }
        if (type.equals(DisplayLogic.class)) {
            return new DisplayLogicJsonAdapter(j0Var.a(TextDisplayLogic.class), j0Var.a(DateDisplayLogic.class), j0Var.a(RangeDisplayLogic.class), j0Var.a(SingleChoiceDisplayLogic.class), j0Var.a(MultipleChoiceDisplayLogic.class), j0Var.a(MatrixDisplayLogic.class), j0Var.a(FormDisplayLogic.class));
        }
        return null;
    }
}
