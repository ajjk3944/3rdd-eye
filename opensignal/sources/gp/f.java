package gp;

import br.n;
import com.survicate.surveys.presentation.form.micro.MicroSurveyPointFormView;
import lq.b0;

/* loaded from: classes.dex */
public final class f extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9640d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointFormView f9641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MicroSurveyPointFormView microSurveyPointFormView, int i10) {
        super(0);
        this.f9640d = i10;
        this.f9641g = microSurveyPointFormView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f9640d) {
            case 0:
                ar.a onSubmitClick = this.f9641g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f9641g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f9641g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
