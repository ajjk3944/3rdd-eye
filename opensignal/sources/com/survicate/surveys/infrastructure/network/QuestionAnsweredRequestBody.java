package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import com.survicate.surveys.entities.models.RespondentEvent;
import com.survicate.surveys.infrastructure.serialization.IntegrationPayloadSerializer;
import gu.a;
import iu.e;
import java.util.List;
import java.util.Map;
import ju.b;
import kotlin.Metadata;
import ku.c;
import ku.c1;
import ku.f;
import ku.g0;
import ku.p0;
import ku.y0;
import mu.y;
import on.h;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u0000 L2\u00020\u0001:\u0002MLB\u007f\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019B\u00ad\u0001\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0015\u0010\u001eJ(\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"HÇ\u0001¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010)R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b=\u0010+\u001a\u0004\b;\u0010<R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010>\u0012\u0004\bA\u0010+\u001a\u0004\b?\u0010@R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010B\u0012\u0004\bE\u0010+\u001a\u0004\bC\u0010DR\"\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\bI\u0010+\u001a\u0004\bG\u0010HR.\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010B\u0012\u0004\bK\u0010+\u001a\u0004\bJ\u0010D¨\u0006N"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "", "", "version", "responseUuid", "", "surveyPointId", "Lcom/survicate/surveys/infrastructure/network/VisitorData;", "visitorData", "Lcom/survicate/surveys/infrastructure/network/VisitData;", "visitData", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "responses", "", "overwrite", "", "Lon/h;", "integrations", "disclaimerAccepted", "responseAttributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/VisitorData;Lcom/survicate/surveys/infrastructure/network/VisitData;Ljava/util/List;ZLjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;)V", "Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "event", "(Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/VisitorData;Lcom/survicate/surveys/infrastructure/network/VisitData;Ljava/util/List;ZLjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;Lju/b;Liu/e;)V", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "getVersion$annotations", "()V", "getResponseUuid", "getResponseUuid$annotations", "J", "getSurveyPointId", "()J", "getSurveyPointId$annotations", "Lcom/survicate/surveys/infrastructure/network/VisitorData;", "getVisitorData", "()Lcom/survicate/surveys/infrastructure/network/VisitorData;", "getVisitorData$annotations", "Lcom/survicate/surveys/infrastructure/network/VisitData;", "getVisitData", "()Lcom/survicate/surveys/infrastructure/network/VisitData;", "getVisitData$annotations", "Ljava/util/List;", "getResponses", "()Ljava/util/List;", "getResponses$annotations", "Z", "getOverwrite", "()Z", "getOverwrite$annotations", "Ljava/util/Map;", "getIntegrations", "()Ljava/util/Map;", "getIntegrations$annotations", "Ljava/lang/Boolean;", "getDisclaimerAccepted", "()Ljava/lang/Boolean;", "getDisclaimerAccepted$annotations", "getResponseAttributes", "getResponseAttributes$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QuestionAnsweredRequestBody {
    private final Boolean disclaimerAccepted;
    private final Map<String, h> integrations;
    private final boolean overwrite;
    private final Map<String, String> responseAttributes;
    private final String responseUuid;
    private final List<SurveyAnswer> responses;
    private final long surveyPointId;
    private final String version;
    private final VisitData visitData;
    private final VisitorData visitorData;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, new c(SurveyAnswer$$serializer.INSTANCE), null, new g0(IntegrationPayloadSerializer.INSTANCE), null, new g0(c1.f14534a)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return QuestionAnsweredRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @lq.c
    public /* synthetic */ QuestionAnsweredRequestBody(int i10, String str, String str2, long j, VisitorData visitorData, VisitData visitData, List list, boolean z10, Map map, Boolean bool, Map map2, y0 y0Var) {
        if (1022 != (i10 & 1022)) {
            p0.f(i10, 1022, QuestionAnsweredRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.version = "4.1";
        } else {
            this.version = str;
        }
        this.responseUuid = str2;
        this.surveyPointId = j;
        this.visitorData = visitorData;
        this.visitData = visitData;
        this.responses = list;
        this.overwrite = z10;
        this.integrations = map;
        this.disclaimerAccepted = bool;
        this.responseAttributes = map2;
    }

    public static /* synthetic */ void getDisclaimerAccepted$annotations() {
    }

    public static /* synthetic */ void getIntegrations$annotations() {
    }

    public static /* synthetic */ void getOverwrite$annotations() {
    }

    public static /* synthetic */ void getResponseAttributes$annotations() {
    }

    public static /* synthetic */ void getResponseUuid$annotations() {
    }

    public static /* synthetic */ void getResponses$annotations() {
    }

    public static /* synthetic */ void getSurveyPointId$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void getVisitData$annotations() {
    }

    public static /* synthetic */ void getVisitorData$annotations() {
    }

    public static final /* synthetic */ void write$Self(QuestionAnsweredRequestBody self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        if (output.n(serialDesc) || !l.a(self.version, "4.1")) {
            ((y) output).x(serialDesc, 0, self.version);
        }
        y yVar = (y) output;
        yVar.x(serialDesc, 1, self.responseUuid);
        yVar.v(serialDesc, 2, self.surveyPointId);
        yVar.w(serialDesc, 3, VisitorData$$serializer.INSTANCE, self.visitorData);
        yVar.w(serialDesc, 4, VisitData$$serializer.INSTANCE, self.visitData);
        output.i(serialDesc, 5, aVarArr[5], self.responses);
        yVar.s(serialDesc, 6, self.overwrite);
        yVar.w(serialDesc, 7, aVarArr[7], self.integrations);
        output.i(serialDesc, 8, f.f14545a, self.disclaimerAccepted);
        output.i(serialDesc, 9, aVarArr[9], self.responseAttributes);
    }

    public final Boolean getDisclaimerAccepted() {
        return this.disclaimerAccepted;
    }

    public final Map<String, h> getIntegrations() {
        return this.integrations;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public final Map<String, String> getResponseAttributes() {
        return this.responseAttributes;
    }

    public final String getResponseUuid() {
        return this.responseUuid;
    }

    public final List<SurveyAnswer> getResponses() {
        return this.responses;
    }

    public final long getSurveyPointId() {
        return this.surveyPointId;
    }

    public final String getVersion() {
        return this.version;
    }

    public final VisitData getVisitData() {
        return this.visitData;
    }

    public final VisitorData getVisitorData() {
        return this.visitorData;
    }

    private QuestionAnsweredRequestBody(String str, String str2, long j, VisitorData visitorData, VisitData visitData, List<SurveyAnswer> list, boolean z10, Map<String, h> map, Boolean bool, Map<String, String> map2) {
        this.version = str;
        this.responseUuid = str2;
        this.surveyPointId = j;
        this.visitorData = visitorData;
        this.visitData = visitData;
        this.responses = list;
        this.overwrite = z10;
        this.integrations = map;
        this.disclaimerAccepted = bool;
        this.responseAttributes = map2;
    }

    public /* synthetic */ QuestionAnsweredRequestBody(String str, String str2, long j, VisitorData visitorData, VisitData visitData, List list, boolean z10, Map map, Boolean bool, Map map2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "4.1" : str, str2, j, visitorData, visitData, list, z10, map, bool, map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuestionAnsweredRequestBody(RespondentEvent.QuestionAnswered questionAnswered) {
        this((String) null, questionAnswered.getResponseUuid(), questionAnswered.getSurveyPointId(), questionAnswered.getVisitorData(), questionAnswered.getVisitData(), questionAnswered.getResponses(), questionAnswered.getOverwrite(), questionAnswered.getIntegrations(), questionAnswered.getDisclaimerAccepted(), questionAnswered.getResponseAttributes(), 1, (g) null);
        l.e(questionAnswered, "event");
    }
}
