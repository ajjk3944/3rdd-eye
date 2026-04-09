package cq;

import android.os.Bundle;
import com.survicate.surveys.SurveyActivity;
import com.survicate.surveys.entities.models.SurveyPointDisplayRequest;
import com.survicate.surveys.entities.survey.SurveyAnswerType;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.theme.ThemeType;
import o4.j0;
import on.c0;
import on.d0;
import on.r;

/* loaded from: classes.dex */
public final /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6630b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f6629a = i10;
        this.f6630b = obj;
    }

    public final void a(Object obj) {
        int i10 = this.f6629a;
        Object obj2 = this.f6630b;
        switch (i10) {
            case 0:
                ((m) obj2).a(obj);
                return;
            case 1:
                ((m) obj2).a(obj);
                return;
            case 2:
                ((m) obj2).a(obj);
                return;
            case 3:
                ((m) obj2).a(obj);
                return;
            case 4:
                SurveyActivity surveyActivity = (SurveyActivity) obj2;
                SurveyPointDisplayRequest surveyPointDisplayRequest = (SurveyPointDisplayRequest) obj;
                int i11 = SurveyActivity.X;
                SurveyPoint surveyPoint = surveyPointDisplayRequest.getSurveyPoint();
                String str = surveyPoint.getId() + "";
                androidx.fragment.app.b bVarE = surveyActivity.o().E(str);
                xo.d bVar = bVarE instanceof xo.d ? (xo.d) bVarE : null;
                if (bVar == null) {
                    SurveyAnswerType surveyAnswerTypeFromString = SurveyAnswerType.INSTANCE.fromString(surveyPoint.getAnswerType());
                    if (surveyAnswerTypeFromString == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    wo.d dVar = surveyActivity.T;
                    a2.g gVar = dVar != null ? dVar.f24552c : null;
                    if (gVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    ThemeType themeType = (ThemeType) gVar.f31a;
                    if ((themeType == null ? -1 : ep.a.f8247b[themeType.ordinal()]) != 1) {
                        throw new IllegalArgumentException("No support for this question type in current theme: " + ((ThemeType) gVar.f31a));
                    }
                    switch (ep.a.f8246a[surveyAnswerTypeFromString.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            bVar = new bp.b();
                            break;
                        case 4:
                            bVar = new vp.c();
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            bVar = new kp.e();
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            bVar = new ip.e();
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bVar = new zp.i();
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            bVar = new dp.c();
                            break;
                        case 9:
                            bVar = new xp.d();
                            break;
                        case 10:
                            bVar = new mp.e();
                            break;
                        case 11:
                            bVar = new sp.c();
                            break;
                        case 12:
                            bVar = new pp.d();
                            break;
                        case 13:
                            bVar = new zo.d();
                            break;
                        case 14:
                            bVar = new gp.d();
                            break;
                        default:
                            throw new bf.n();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("SURVEY_POINT", surveyPoint);
                    bVar.a0(bundle);
                }
                androidx.fragment.app.b bVarD = surveyActivity.o().D(r.survey_point_container);
                if (bVar.equals(bVarD instanceof xo.d ? (xo.d) bVarD : null)) {
                    return;
                }
                boolean zIsNavigatingBack = surveyPointDisplayRequest.isNavigatingBack();
                j0 j0VarO = surveyActivity.o();
                j0VarO.getClass();
                o4.a aVar = new o4.a(j0VarO);
                if (!xu.d.S(surveyActivity)) {
                    int i12 = zIsNavigatingBack ? on.m.survicate_slide_in_from_left : on.m.survicate_slide_in_from_right;
                    int i13 = zIsNavigatingBack ? on.m.survicate_slide_out_to_right : on.m.survicate_slide_out_to_left;
                    aVar.f18759b = i12;
                    aVar.f18760c = i13;
                    aVar.f18761d = i12;
                    aVar.f18762e = i13;
                }
                aVar.i(r.survey_point_container, bVar, str);
                aVar.e();
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((j1.a) obj2).a(obj);
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((c0) obj2).a(obj);
                return;
            default:
                ((d0) obj2).a(obj);
                return;
        }
    }
}
