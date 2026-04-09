package mp;

import br.n;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsView;
import lq.b0;

/* loaded from: classes.dex */
public final class g extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16918d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointNpsView f16919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MicroSurveyPointNpsView microSurveyPointNpsView, int i10) {
        super(0);
        this.f16918d = i10;
        this.f16919g = microSurveyPointNpsView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f16918d) {
            case 0:
                ar.a onSubmitClick = this.f16919g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f16919g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f16919g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
