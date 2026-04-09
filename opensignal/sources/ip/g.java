package ip;

import br.n;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixView;
import lq.b0;

/* loaded from: classes.dex */
public final class g extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12908d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointMatrixView f12909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MicroSurveyPointMatrixView microSurveyPointMatrixView, int i10) {
        super(0);
        this.f12908d = i10;
        this.f12909g = microSurveyPointMatrixView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f12908d) {
            case 0:
                ar.a onSubmitClick = this.f12909g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f12909g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f12909g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
