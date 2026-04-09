package zo;

import br.n;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatView;
import lq.b0;

/* loaded from: classes.dex */
public final class g extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27490d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointCsatView f27491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MicroSurveyPointCsatView microSurveyPointCsatView, int i10) {
        super(0);
        this.f27490d = i10;
        this.f27491g = microSurveyPointCsatView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f27490d) {
            case 0:
                ar.a onSubmitClick = this.f27491g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f27491g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f27491g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
