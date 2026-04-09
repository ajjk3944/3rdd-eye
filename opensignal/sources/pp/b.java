package pp;

import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalContentView;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public MicroSurveyPointNumericalContentView f20603r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f20604x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointNumericalContentView f20605y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MicroSurveyPointNumericalContentView microSurveyPointNumericalContentView, rq.c cVar) {
        super(cVar);
        this.f20605y = microSurveyPointNumericalContentView;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f20604x = obj;
        this.B |= Integer.MIN_VALUE;
        return MicroSurveyPointNumericalContentView.a(this.f20605y, this);
    }
}
