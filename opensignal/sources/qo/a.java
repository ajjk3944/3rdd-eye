package qo;

import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionRepository;
import rq.c;

/* loaded from: classes.dex */
public final class a extends c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public SurvicateFollowUpQuestionRepository f20946r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f20947x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SurvicateFollowUpQuestionRepository f20948y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SurvicateFollowUpQuestionRepository survicateFollowUpQuestionRepository, pq.c cVar) {
        super(cVar);
        this.f20948y = survicateFollowUpQuestionRepository;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f20947x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f20948y.requestFollowUpQuestion(null, null, this);
    }
}
