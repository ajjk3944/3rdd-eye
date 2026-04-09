package vp;

import br.n;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleView;
import lq.b0;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23942d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointSingleView f23943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MicroSurveyPointSingleView microSurveyPointSingleView, int i10) {
        super(0);
        this.f23942d = i10;
        this.f23943g = microSurveyPointSingleView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f23942d) {
            case 0:
                ar.a onSubmitClick = this.f23943g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f23943g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f23943g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
