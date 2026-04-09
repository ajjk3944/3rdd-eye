package sp;

import br.n;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeView;
import lq.b0;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22206d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointShapeView f22207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MicroSurveyPointShapeView microSurveyPointShapeView, int i10) {
        super(0);
        this.f22206d = i10;
        this.f22207g = microSurveyPointShapeView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f22206d) {
            case 0:
                ar.a onSubmitClick = this.f22207g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f22207g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f22207g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
