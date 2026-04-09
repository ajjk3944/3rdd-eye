package ip;

import br.n;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixContentView;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import lq.b0;

/* loaded from: classes.dex */
public final class d extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12899d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointMatrixContentView f12900g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MicroSurveyPointMatrixContentView microSurveyPointMatrixContentView, int i10) {
        super(0);
        this.f12899d = i10;
        this.f12900g = microSurveyPointMatrixContentView;
    }

    @Override // ar.a
    public final Object c() {
        MicroSurvicateCommentField microSurvicateCommentFieldB;
        MicroSurvicateCommentField microSurvicateCommentFieldB2;
        switch (this.f12899d) {
            case 0:
                MicroSurveyPointMatrixContentView microSurveyPointMatrixContentView = this.f12900g;
                MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem = microSurveyPointMatrixContentView.B;
                if (microSurveyPointMatrixAnswerItem != null && (microSurvicateCommentFieldB = microSurveyPointMatrixContentView.b(microSurveyPointMatrixAnswerItem)) != null) {
                    microSurvicateCommentFieldB.b();
                    microSurveyPointMatrixContentView.B = null;
                }
                ar.a aVar = microSurveyPointMatrixContentView.f6427a;
                if (aVar != null) {
                    aVar.c();
                }
                break;
            case 1:
                ar.a aVar2 = this.f12900g.f6427a;
                if (aVar2 != null) {
                    aVar2.c();
                }
                break;
            default:
                MicroSurveyPointMatrixContentView microSurveyPointMatrixContentView2 = this.f12900g;
                MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem2 = microSurveyPointMatrixContentView2.B;
                if (microSurveyPointMatrixAnswerItem2 != null && (microSurvicateCommentFieldB2 = microSurveyPointMatrixContentView2.b(microSurveyPointMatrixAnswerItem2)) != null && microSurveyPointMatrixAnswerItem2.D && microSurvicateCommentFieldB2.isAttachedToWindow()) {
                    microSurvicateCommentFieldB2.d();
                }
                break;
        }
        return b0.f15562a;
    }
}
