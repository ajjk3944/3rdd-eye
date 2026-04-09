package vp;

import bq.g;
import br.n;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem;
import lq.b0;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23929d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kp.b f23930g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointSingleAnswerItem f23931r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(kp.b bVar, MicroSurveyPointSingleAnswerItem microSurveyPointSingleAnswerItem, int i10) {
        super(0);
        this.f23929d = i10;
        this.f23930g = bVar;
        this.f23931r = microSurveyPointSingleAnswerItem;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f23929d) {
            case 0:
                g gVar = (g) this.f23930g.f14467g;
                if (gVar != null) {
                    gVar.a(this.f23931r);
                }
                break;
            default:
                j1.a aVar = (j1.a) this.f23930g.f14469i;
                if (aVar != null) {
                    aVar.a(this.f23931r);
                }
                break;
        }
        return b0.f15562a;
    }
}
