package a8;

import android.graphics.Bitmap;
import ar.n;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import lq.b0;
import n0.n1;
import n0.o1;
import n0.u0;
import wt.t;

/* loaded from: classes.dex */
public final class j extends rq.j implements n {
    public Object B;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f208x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f209y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l8.j jVar, l lVar, m8.h hVar, b bVar, Bitmap bitmap, pq.c cVar) {
        super(2, cVar);
        this.B = jVar;
        this.D = lVar;
        this.E = hVar;
        this.F = bVar;
        this.G = bitmap;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f208x) {
            case 0:
                return new j((l8.j) this.B, (l) this.D, (m8.h) this.E, (b) this.F, (Bitmap) this.G, cVar);
            case 1:
                j jVar = new j((o1) this.E, (n1) this.F, (u0) this.G, cVar);
                jVar.D = obj;
                return jVar;
            default:
                return new j((wo.e) this.D, (wo.d) this.E, (SurveyPoint) this.F, (on.a) this.G, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Collection] */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.j.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        t tVar = (t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f208x) {
        }
        return ((j) o(tVar, cVar)).q(b0.f15562a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o1 o1Var, n1 n1Var, u0 u0Var, pq.c cVar) {
        super(2, cVar);
        this.E = o1Var;
        this.F = n1Var;
        this.G = u0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wo.e eVar, wo.d dVar, SurveyPoint surveyPoint, on.a aVar, pq.c cVar) {
        super(2, cVar);
        this.D = eVar;
        this.E = dVar;
        this.F = surveyPoint;
        this.G = aVar;
    }
}
