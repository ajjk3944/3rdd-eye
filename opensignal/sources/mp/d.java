package mp;

import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView;

/* loaded from: classes.dex */
public final class d extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public MicroSurveyPointNpsContentView f16908r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f16909x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointNpsContentView f16910y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MicroSurveyPointNpsContentView microSurveyPointNpsContentView, rq.c cVar) {
        super(cVar);
        this.f16910y = microSurveyPointNpsContentView;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f16909x = obj;
        this.B |= Integer.MIN_VALUE;
        return MicroSurveyPointNpsContentView.a(this.f16910y, this);
    }
}
