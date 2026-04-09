package sp;

import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public MicroSurveyPointShapeContentView f22196r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22197x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointShapeContentView f22198y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MicroSurveyPointShapeContentView microSurveyPointShapeContentView, rq.c cVar) {
        super(cVar);
        this.f22198y = microSurveyPointShapeContentView;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f22197x = obj;
        this.B |= Integer.MIN_VALUE;
        return MicroSurveyPointShapeContentView.a(this.f22198y, this);
    }
}
