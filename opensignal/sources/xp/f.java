package xp;

import br.n;
import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleView;
import lq.b0;

/* loaded from: classes.dex */
public final class f extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25470d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointSmileyScaleView f25471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MicroSurveyPointSmileyScaleView microSurveyPointSmileyScaleView, int i10) {
        super(0);
        this.f25470d = i10;
        this.f25471g = microSurveyPointSmileyScaleView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f25470d) {
            case 0:
                ar.a onSubmitClick = this.f25471g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f25471g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f25471g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
