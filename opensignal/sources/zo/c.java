package zo;

import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView;

/* loaded from: classes.dex */
public final class c extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public MicroSurveyPointCsatContentView f27478r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27479x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointCsatContentView f27480y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MicroSurveyPointCsatContentView microSurveyPointCsatContentView, rq.c cVar) {
        super(cVar);
        this.f27480y = microSurveyPointCsatContentView;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27479x = obj;
        this.B |= Integer.MIN_VALUE;
        return MicroSurveyPointCsatContentView.a(this.f27480y, this);
    }
}
