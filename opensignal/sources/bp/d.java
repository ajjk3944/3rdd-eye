package bp;

import android.widget.FrameLayout;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatView;
import com.survicate.surveys.presentation.cta.micro.MicroSurveyPointCtaView;
import com.survicate.surveys.presentation.date.micro.MicroSurveyPointDateView;
import com.survicate.surveys.presentation.form.micro.MicroSurveyPointFormView;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixView;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleView;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsView;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalView;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeView;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleView;
import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleView;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView;
import g4.j;

/* loaded from: classes.dex */
public final class d extends wo.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2852g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2853r;

    public /* synthetic */ d(FrameLayout frameLayout, int i10) {
        this.f2852g = i10;
        this.f2853r = frameLayout;
    }

    @Override // wo.b
    public final void a() {
        switch (this.f2852g) {
            case 0:
                ar.a onCloseSurveyClick = ((MicroSurveyPointCtaView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick != null) {
                    onCloseSurveyClick.c();
                    break;
                }
                break;
            case 1:
                ar.a onCloseSurveyClick2 = ((MicroSurveyPointDateView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick2 != null) {
                    onCloseSurveyClick2.c();
                    break;
                }
                break;
            case 2:
                ar.a onCloseSurveyClick3 = ((MicroSurveyPointFormView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick3 != null) {
                    onCloseSurveyClick3.c();
                    break;
                }
                break;
            case 3:
                ar.a onCloseSurveyClick4 = ((MicroSurveyPointMatrixView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick4 != null) {
                    onCloseSurveyClick4.c();
                    break;
                }
                break;
            case 4:
                ar.a onCloseSurveyClick5 = ((MicroSurveyPointMultipleView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick5 != null) {
                    onCloseSurveyClick5.c();
                    break;
                }
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                ar.a onCloseSurveyClick6 = ((MicroSurveyPointNpsView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick6 != null) {
                    onCloseSurveyClick6.c();
                    break;
                }
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                ar.a onCloseSurveyClick7 = ((MicroSurveyPointNumericalView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick7 != null) {
                    onCloseSurveyClick7.c();
                    break;
                }
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ar.a onCloseSurveyClick8 = ((MicroSurveyPointShapeView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick8 != null) {
                    onCloseSurveyClick8.c();
                    break;
                }
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                ar.a onCloseSurveyClick9 = ((MicroSurveyPointSingleView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick9 != null) {
                    onCloseSurveyClick9.c();
                    break;
                }
                break;
            case 9:
                ar.a onCloseSurveyClick10 = ((MicroSurveyPointSmileyScaleView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick10 != null) {
                    onCloseSurveyClick10.c();
                    break;
                }
                break;
            case 10:
                ar.a onCloseSurveyClick11 = ((MicroSurveyPointCsatView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick11 != null) {
                    onCloseSurveyClick11.c();
                    break;
                }
                break;
            default:
                ar.a onCloseSurveyClick12 = ((MicroSurveyPointTextView) this.f2853r).getOnCloseSurveyClick();
                if (onCloseSurveyClick12 != null) {
                    onCloseSurveyClick12.c();
                    break;
                }
                break;
        }
    }
}
