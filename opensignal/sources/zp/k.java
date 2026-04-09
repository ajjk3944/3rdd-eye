package zp;

import br.n;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView;
import lq.b0;

/* loaded from: classes.dex */
public final class k extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27518d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointTextView f27519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MicroSurveyPointTextView microSurveyPointTextView, int i10) {
        super(0);
        this.f27518d = i10;
        this.f27519g = microSurveyPointTextView;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f27518d) {
            case 0:
                ar.a onSubmitClick = this.f27519g.getOnSubmitClick();
                if (onSubmitClick != null) {
                    onSubmitClick.c();
                }
                break;
            case 1:
                ar.a onBackClick = this.f27519g.getOnBackClick();
                if (onBackClick != null) {
                    onBackClick.c();
                }
                break;
            default:
                ar.a onPoweredByClick = this.f27519g.getOnPoweredByClick();
                if (onPoweredByClick != null) {
                    onPoweredByClick.c();
                }
                break;
        }
        return b0.f15562a;
    }
}
