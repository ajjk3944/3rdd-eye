package bp;

import br.n;
import com.survicate.surveys.presentation.cta.micro.MicroSurveyPointCtaView;
import lq.b0;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2854d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointCtaView f2855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MicroSurveyPointCtaView microSurveyPointCtaView, int i10) {
        super(0);
        this.f2854d = i10;
        this.f2855g = microSurveyPointCtaView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f2854d) {
            case 0:
                ar.a onPoweredByClick = this.f2855g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
            case 1:
                ar.a onSubmitClick = this.f2855g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            default:
                ar.a onBackClick = this.f2855g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
