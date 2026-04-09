package dp;

import br.n;
import com.survicate.surveys.presentation.date.micro.MicroSurveyPointDateView;
import lq.b0;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7433d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointDateView f7434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MicroSurveyPointDateView microSurveyPointDateView, int i10) {
        super(0);
        this.f7433d = i10;
        this.f7434g = microSurveyPointDateView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f7433d) {
            case 0:
                ar.a onSelectDateClick = this.f7434g.getOnSelectDateClick();
                if (onSelectDateClick != null) {
                    onSelectDateClick.c();
                }
                break;
            case 1:
                ar.a onSubmitClick = this.f7434g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 2:
                ar.a onBackClick = this.f7434g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f7434g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
