package com.survicate.surveys.infrastructure.network.ai;

import br.g;
import br.l;
import gu.a;
import kotlin.Metadata;
import ku.p0;
import ku.y0;
import lq.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014¨\u0006&"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponseData;", "data", "<init>", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponseData;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponseData;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;Lju/b;Liu/e;)V", "component1", "()Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponseData;", "copy", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponseData;)Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponseData;", "getData", "getData$annotations", "()V", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FollowUpQuestionResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FollowUpQuestionResponseData data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return FollowUpQuestionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ FollowUpQuestionResponse(int i10, FollowUpQuestionResponseData followUpQuestionResponseData, y0 y0Var) {
        if (1 == (i10 & 1)) {
            this.data = followUpQuestionResponseData;
        } else {
            p0.f(i10, 1, FollowUpQuestionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ FollowUpQuestionResponse copy$default(FollowUpQuestionResponse followUpQuestionResponse, FollowUpQuestionResponseData followUpQuestionResponseData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            followUpQuestionResponseData = followUpQuestionResponse.data;
        }
        return followUpQuestionResponse.copy(followUpQuestionResponseData);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final FollowUpQuestionResponseData getData() {
        return this.data;
    }

    public final FollowUpQuestionResponse copy(FollowUpQuestionResponseData data) {
        l.e(data, "data");
        return new FollowUpQuestionResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FollowUpQuestionResponse) && l.a(this.data, ((FollowUpQuestionResponse) other).data);
    }

    public final FollowUpQuestionResponseData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "FollowUpQuestionResponse(data=" + this.data + ')';
    }

    public FollowUpQuestionResponse(FollowUpQuestionResponseData followUpQuestionResponseData) {
        l.e(followUpQuestionResponseData, "data");
        this.data = followUpQuestionResponseData;
    }
}
