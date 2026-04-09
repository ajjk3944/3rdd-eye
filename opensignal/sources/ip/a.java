package ip;

import br.n;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem;
import java.util.ArrayList;
import lq.b0;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12887d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f12888g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointMatrixAnswerItem f12889r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem, int i10) {
        super(0);
        this.f12887d = i10;
        this.f12888g = bVar;
        this.f12889r = microSurveyPointMatrixAnswerItem;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f12887d) {
            case 0:
                b bVar = this.f12888g;
                ArrayList arrayList = bVar.f12890d;
                MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem = this.f12889r;
                if (microSurveyPointMatrixAnswerItem.D) {
                    int iIndexOf = arrayList.indexOf(microSurveyPointMatrixAnswerItem);
                    microSurveyPointMatrixAnswerItem.D = false;
                    bVar.e(iIndexOf);
                } else {
                    int iIndexOf2 = arrayList.indexOf(microSurveyPointMatrixAnswerItem);
                    microSurveyPointMatrixAnswerItem.D = true;
                    bVar.e(iIndexOf2);
                    c7.b bVar2 = bVar.f12893g;
                    if (bVar2 != null) {
                        bVar2.a(Integer.valueOf(iIndexOf2));
                    }
                    bVar.q(microSurveyPointMatrixAnswerItem);
                }
                break;
            default:
                as.d dVar = this.f12888g.j;
                if (dVar != null) {
                    dVar.a(this.f12889r);
                }
                break;
        }
        return b0.f15562a;
    }
}
