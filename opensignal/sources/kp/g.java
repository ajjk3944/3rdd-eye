package kp;

import br.n;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleView;
import lq.b0;

/* loaded from: classes.dex */
public final class g extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14480d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointMultipleView f14481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MicroSurveyPointMultipleView microSurveyPointMultipleView, int i10) {
        super(0);
        this.f14480d = i10;
        this.f14481g = microSurveyPointMultipleView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f14480d) {
            case 0:
                ar.a onSubmitClick = this.f14481g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f14481g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f14481g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
