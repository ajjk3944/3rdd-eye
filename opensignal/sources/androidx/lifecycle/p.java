package androidx.lifecycle;

import com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRequestBody;
import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionApi;
import d4.f1;
import java.util.Set;

/* loaded from: classes.dex */
public final class p extends rq.j implements ar.n {
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1510x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f1511y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SurvicateFollowUpQuestionApi survicateFollowUpQuestionApi, FollowUpQuestionRequestBody followUpQuestionRequestBody, pq.c cVar) {
        super(2, cVar);
        this.f1510x = 5;
        this.f1511y = survicateFollowUpQuestionApi;
        this.B = followUpQuestionRequestBody;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f1510x) {
            case 0:
                p pVar = new p((q) this.B, cVar, 0);
                pVar.f1511y = obj;
                return pVar;
            case 1:
                p pVar2 = new p((f1) this.B, cVar, 1);
                pVar2.f1511y = obj;
                return pVar2;
            case 2:
                p pVar3 = new p((e7.e) this.B, cVar, 2);
                pVar3.f1511y = obj;
                return pVar3;
            case 3:
                p pVar4 = new p((Set) this.B, cVar, 3);
                pVar4.f1511y = obj;
                return pVar4;
            case 4:
                p pVar5 = new p((on.i0) this.B, cVar, 4);
                pVar5.f1511y = obj;
                return pVar5;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new p((SurvicateFollowUpQuestionApi) this.f1511y, (FollowUpQuestionRequestBody) this.B, cVar);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                p pVar6 = new p((ar.k) this.B, cVar, 6);
                pVar6.f1511y = obj;
                return pVar6;
            default:
                p pVar7 = new p((ar.a) this.B, cVar, 7);
                pVar7.f1511y = obj;
                return pVar7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return r5.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r0.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        throw r11;
     */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws Throwable {
        switch (this.f1510x) {
            case 0:
                p pVar = (p) o((wt.t) obj, (pq.c) obj2);
                lq.b0 b0Var = lq.b0.f15562a;
                pVar.q(b0Var);
                return b0Var;
            case 1:
                return ((p) o((f1) obj, (pq.c) obj2)).q(lq.b0.f15562a);
            case 2:
                ((p) o((wt.t) obj, (pq.c) obj2)).q(lq.b0.f15562a);
                throw null;
            case 3:
                return ((p) o((h4.b) obj, (pq.c) obj2)).q(lq.b0.f15562a);
            case 4:
                p pVar2 = (p) o((wt.t) obj, (pq.c) obj2);
                lq.b0 b0Var2 = lq.b0.f15562a;
                pVar2.q(b0Var2);
                return b0Var2;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return ((p) o((wt.t) obj, (pq.c) obj2)).q(lq.b0.f15562a);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                p pVar3 = (p) o((h4.b) obj, (pq.c) obj2);
                lq.b0 b0Var3 = lq.b0.f15562a;
                pVar3.q(b0Var3);
                return b0Var3;
            default:
                return ((p) o((wt.t) obj, (pq.c) obj2)).q(lq.b0.f15562a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, pq.c cVar, int i10) {
        super(2, cVar);
        this.f1510x = i10;
        this.B = obj;
    }
}
