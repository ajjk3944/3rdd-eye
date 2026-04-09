package kp;

import br.n;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem;
import lq.b0;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14461d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f14462g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointMultipleAnswerItem f14463r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, MicroSurveyPointMultipleAnswerItem microSurveyPointMultipleAnswerItem, int i10) {
        super(0);
        this.f14461d = i10;
        this.f14462g = bVar;
        this.f14463r = microSurveyPointMultipleAnswerItem;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f14461d) {
            case 0:
                c7.b bVar = (c7.b) this.f14462g.f14467g;
                if (bVar != null) {
                    bVar.a(this.f14463r);
                }
                break;
            default:
                j1.a aVar = (j1.a) this.f14462g.f14469i;
                if (aVar != null) {
                    aVar.a(this.f14463r);
                }
                break;
        }
        return b0.f15562a;
    }
}
