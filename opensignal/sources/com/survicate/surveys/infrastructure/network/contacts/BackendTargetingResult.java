package com.survicate.surveys.infrastructure.network.contacts;

import br.g;
import br.l;
import iu.e;
import java.util.List;
import ju.b;
import kotlin.Metadata;
import ku.c;
import ku.p0;
import ku.y0;
import mu.y;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017¨\u0006,"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "", "", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;", "surveys", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;", "audiences", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;Lju/b;Liu/e;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSurveys", "getSurveys$annotations", "()V", "getAudiences", "getAudiences$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BackendTargetingResult {
    private final List<BackendTargetingAudienceResult> audiences;
    private final List<BackendTargetingSurveyResult> surveys;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final gu.a[] $childSerializers = {new c(BackendTargetingSurveyResult$$serializer.INSTANCE), new c(BackendTargetingAudienceResult$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final gu.a serializer() {
            return BackendTargetingResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @lq.c
    public /* synthetic */ BackendTargetingResult(int i10, List list, List list2, y0 y0Var) {
        if (3 != (i10 & 3)) {
            p0.f(i10, 3, BackendTargetingResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.surveys = list;
        this.audiences = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackendTargetingResult copy$default(BackendTargetingResult backendTargetingResult, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = backendTargetingResult.surveys;
        }
        if ((i10 & 2) != 0) {
            list2 = backendTargetingResult.audiences;
        }
        return backendTargetingResult.copy(list, list2);
    }

    public static /* synthetic */ void getAudiences$annotations() {
    }

    public static /* synthetic */ void getSurveys$annotations() {
    }

    public static final /* synthetic */ void write$Self(BackendTargetingResult self, b output, e serialDesc) {
        gu.a[] aVarArr = $childSerializers;
        y yVar = (y) output;
        yVar.w(serialDesc, 0, aVarArr[0], self.surveys);
        yVar.w(serialDesc, 1, aVarArr[1], self.audiences);
    }

    public final List<BackendTargetingSurveyResult> component1() {
        return this.surveys;
    }

    public final List<BackendTargetingAudienceResult> component2() {
        return this.audiences;
    }

    public final BackendTargetingResult copy(List<BackendTargetingSurveyResult> surveys, List<BackendTargetingAudienceResult> audiences) {
        l.e(surveys, "surveys");
        l.e(audiences, "audiences");
        return new BackendTargetingResult(surveys, audiences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackendTargetingResult)) {
            return false;
        }
        BackendTargetingResult backendTargetingResult = (BackendTargetingResult) other;
        return l.a(this.surveys, backendTargetingResult.surveys) && l.a(this.audiences, backendTargetingResult.audiences);
    }

    public final List<BackendTargetingAudienceResult> getAudiences() {
        return this.audiences;
    }

    public final List<BackendTargetingSurveyResult> getSurveys() {
        return this.surveys;
    }

    public int hashCode() {
        return this.audiences.hashCode() + (this.surveys.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackendTargetingResult(surveys=");
        sb2.append(this.surveys);
        sb2.append(", audiences=");
        return h0.b.t(sb2, this.audiences, ')');
    }

    public BackendTargetingResult(List<BackendTargetingSurveyResult> list, List<BackendTargetingAudienceResult> list2) {
        l.e(list, "surveys");
        l.e(list2, "audiences");
        this.surveys = list;
        this.audiences = list2;
    }
}
