package xp;

import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public MicroSurveyPointSmileyScaleContentView f25460r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25461x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MicroSurveyPointSmileyScaleContentView f25462y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MicroSurveyPointSmileyScaleContentView microSurveyPointSmileyScaleContentView, rq.c cVar) {
        super(cVar);
        this.f25462y = microSurveyPointSmileyScaleContentView;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f25461x = obj;
        this.B |= Integer.MIN_VALUE;
        return MicroSurveyPointSmileyScaleContentView.a(this.f25462y, this);
    }
}
