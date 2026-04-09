package pp;

import br.n;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalView;
import lq.b0;

/* loaded from: classes.dex */
public final class f extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20615d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointNumericalView f20616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MicroSurveyPointNumericalView microSurveyPointNumericalView, int i10) {
        super(0);
        this.f20615d = i10;
        this.f20616g = microSurveyPointNumericalView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f20615d) {
            case 0:
                ar.a onSubmitClick = this.f20616g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f20616g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f20616g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
