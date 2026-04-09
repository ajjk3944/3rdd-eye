package com.survicate.surveys.entities.models;

import br.g;
import br.l;
import br.x;
import br.y;
import com.survicate.surveys.entities.survey.NetworkTargetingEvent;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.infrastructure.network.SurveyAnswer$$serializer;
import com.survicate.surveys.infrastructure.network.VisitData;
import com.survicate.surveys.infrastructure.network.VisitData$$serializer;
import com.survicate.surveys.infrastructure.network.VisitorData;
import com.survicate.surveys.infrastructure.network.VisitorData$$serializer;
import com.survicate.surveys.infrastructure.serialization.IntegrationPayloadSerializer;
import gu.d;
import iu.e;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.f;
import ku.g0;
import ku.p0;
import ku.y0;
import lq.c;
import on.h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent;", "", "Companion", "Installed", "QuestionAnswered", "SurveySeen", "Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RespondentEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/RespondentEvent;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final gu.a serializer() {
            y yVar = x.f2918a;
            return new d("com.survicate.surveys.entities.models.RespondentEvent", yVar.b(RespondentEvent.class), new ir.d[]{yVar.b(Installed.class), yVar.b(QuestionAnswered.class), yVar.b(SurveySeen.class)}, new gu.a[]{RespondentEvent$Installed$$serializer.INSTANCE, RespondentEvent$QuestionAnswered$$serializer.INSTANCE, RespondentEvent$SurveySeen$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0014¨\u0006%"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "Lcom/survicate/surveys/entities/models/RespondentEvent;", "", "platform", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlatform", "getPlatform$annotations", "()V", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Installed implements RespondentEvent {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String platform;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$Installed$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return RespondentEvent$Installed$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Installed() {
            this((String) null, 1, (g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Installed copy$default(Installed installed, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = installed.platform;
            }
            return installed.copy(str);
        }

        public static /* synthetic */ void getPlatform$annotations() {
        }

        public static final /* synthetic */ void write$Self(Installed self, b output, e serialDesc) {
            if (!output.n(serialDesc) && l.a(self.platform, NetworkTargetingEvent.TYPE_MOBILE)) {
                return;
            }
            ((mu.y) output).x(serialDesc, 0, self.platform);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        public final Installed copy(String platform) {
            l.e(platform, "platform");
            return new Installed(platform);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Installed) && l.a(this.platform, ((Installed) other).platform);
        }

        public final String getPlatform() {
            return this.platform;
        }

        public int hashCode() {
            return this.platform.hashCode();
        }

        public String toString() {
            return h0.b.r(new StringBuilder("Installed(platform="), this.platform, ')');
        }

        @c
        public /* synthetic */ Installed(int i10, String str, y0 y0Var) {
            if ((i10 & 1) == 0) {
                this.platform = NetworkTargetingEvent.TYPE_MOBILE;
            } else {
                this.platform = str;
            }
        }

        public Installed(String str) {
            l.e(str, "platform");
            this.platform = str;
        }

        public /* synthetic */ Installed(String str, int i10, g gVar) {
            this((i10 & 1) != 0 ? NetworkTargetingEvent.TYPE_MOBILE : str);
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016B\u00ad\u0001\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0096\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u0010\u00101\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J(\u0010=\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:HÇ\u0001¢\u0006\u0004\b=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010?\u0012\u0004\bD\u0010B\u001a\u0004\bC\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010E\u0012\u0004\bG\u0010B\u001a\u0004\bF\u0010 R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010H\u0012\u0004\bJ\u0010B\u001a\u0004\bI\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010K\u0012\u0004\bM\u0010B\u001a\u0004\bL\u0010$R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bP\u0010B\u001a\u0004\bO\u0010&R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Q\u0012\u0004\bS\u0010B\u001a\u0004\bR\u0010(R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\bV\u0010B\u001a\u0004\bU\u0010*R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\bY\u0010B\u001a\u0004\bX\u0010,R.\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010T\u0012\u0004\b[\u0010B\u001a\u0004\bZ\u0010*¨\u0006^"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "Lcom/survicate/surveys/entities/models/RespondentEvent;", "", "surveyId", "responseUuid", "", "surveyPointId", "Lcom/survicate/surveys/infrastructure/network/VisitorData;", "visitorData", "Lcom/survicate/surveys/infrastructure/network/VisitData;", "visitData", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "responses", "", "overwrite", "", "Lon/h;", "integrations", "disclaimerAccepted", "responseAttributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/VisitorData;Lcom/survicate/surveys/infrastructure/network/VisitData;Ljava/util/List;ZLjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/VisitorData;Lcom/survicate/surveys/infrastructure/network/VisitData;Ljava/util/List;ZLjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Lku/y0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Lcom/survicate/surveys/infrastructure/network/VisitorData;", "component5", "()Lcom/survicate/surveys/infrastructure/network/VisitData;", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "()Ljava/util/Map;", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/VisitorData;Lcom/survicate/surveys/infrastructure/network/VisitData;Ljava/util/List;ZLjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;Lju/b;Liu/e;)V", "Ljava/lang/String;", "getSurveyId", "getSurveyId$annotations", "()V", "getResponseUuid", "getResponseUuid$annotations", "J", "getSurveyPointId", "getSurveyPointId$annotations", "Lcom/survicate/surveys/infrastructure/network/VisitorData;", "getVisitorData", "getVisitorData$annotations", "Lcom/survicate/surveys/infrastructure/network/VisitData;", "getVisitData", "getVisitData$annotations", "Ljava/util/List;", "getResponses", "getResponses$annotations", "Z", "getOverwrite", "getOverwrite$annotations", "Ljava/util/Map;", "getIntegrations", "getIntegrations$annotations", "Ljava/lang/Boolean;", "getDisclaimerAccepted", "getDisclaimerAccepted$annotations", "getResponseAttributes", "getResponseAttributes$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class QuestionAnswered implements RespondentEvent {
        private final Boolean disclaimerAccepted;
        private final Map<String, h> integrations;
        private final boolean overwrite;
        private final Map<String, String> responseAttributes;
        private final String responseUuid;
        private final List<SurveyAnswer> responses;
        private final String surveyId;
        private final long surveyPointId;
        private final VisitData visitData;
        private final VisitorData visitorData;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final gu.a[] $childSerializers = {null, null, null, null, null, new ku.c(SurveyAnswer$$serializer.INSTANCE), null, new g0(IntegrationPayloadSerializer.INSTANCE), null, new g0(c1.f14534a)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return RespondentEvent$QuestionAnswered$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ QuestionAnswered(int i10, String str, String str2, long j, VisitorData visitorData, VisitData visitData, List list, boolean z10, Map map, Boolean bool, Map map2, y0 y0Var) {
            if (1023 != (i10 & 1023)) {
                p0.f(i10, 1023, RespondentEvent$QuestionAnswered$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.surveyId = str;
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

        public static /* synthetic */ QuestionAnswered copy$default(QuestionAnswered questionAnswered, String str, String str2, long j, VisitorData visitorData, VisitData visitData, List list, boolean z10, Map map, Boolean bool, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = questionAnswered.surveyId;
            }
            if ((i10 & 2) != 0) {
                str2 = questionAnswered.responseUuid;
            }
            if ((i10 & 4) != 0) {
                j = questionAnswered.surveyPointId;
            }
            if ((i10 & 8) != 0) {
                visitorData = questionAnswered.visitorData;
            }
            if ((i10 & 16) != 0) {
                visitData = questionAnswered.visitData;
            }
            if ((i10 & 32) != 0) {
                list = questionAnswered.responses;
            }
            if ((i10 & 64) != 0) {
                z10 = questionAnswered.overwrite;
            }
            if ((i10 & 128) != 0) {
                map = questionAnswered.integrations;
            }
            if ((i10 & 256) != 0) {
                bool = questionAnswered.disclaimerAccepted;
            }
            if ((i10 & 512) != 0) {
                map2 = questionAnswered.responseAttributes;
            }
            Boolean bool2 = bool;
            Map map3 = map2;
            Map map4 = map;
            List list2 = list;
            VisitorData visitorData2 = visitorData;
            long j7 = j;
            return questionAnswered.copy(str, str2, j7, visitorData2, visitData, list2, z10, map4, bool2, map3);
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

        public static /* synthetic */ void getSurveyId$annotations() {
        }

        public static /* synthetic */ void getSurveyPointId$annotations() {
        }

        public static /* synthetic */ void getVisitData$annotations() {
        }

        public static /* synthetic */ void getVisitorData$annotations() {
        }

        public static final /* synthetic */ void write$Self(QuestionAnswered self, b output, e serialDesc) {
            gu.a[] aVarArr = $childSerializers;
            mu.y yVar = (mu.y) output;
            yVar.x(serialDesc, 0, self.surveyId);
            yVar.x(serialDesc, 1, self.responseUuid);
            yVar.v(serialDesc, 2, self.surveyPointId);
            yVar.w(serialDesc, 3, VisitorData$$serializer.INSTANCE, self.visitorData);
            yVar.w(serialDesc, 4, VisitData$$serializer.INSTANCE, self.visitData);
            yVar.w(serialDesc, 5, aVarArr[5], self.responses);
            yVar.s(serialDesc, 6, self.overwrite);
            yVar.w(serialDesc, 7, aVarArr[7], self.integrations);
            yVar.i(serialDesc, 8, f.f14545a, self.disclaimerAccepted);
            yVar.i(serialDesc, 9, aVarArr[9], self.responseAttributes);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSurveyId() {
            return this.surveyId;
        }

        public final Map<String, String> component10() {
            return this.responseAttributes;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResponseUuid() {
            return this.responseUuid;
        }

        /* renamed from: component3, reason: from getter */
        public final long getSurveyPointId() {
            return this.surveyPointId;
        }

        /* renamed from: component4, reason: from getter */
        public final VisitorData getVisitorData() {
            return this.visitorData;
        }

        /* renamed from: component5, reason: from getter */
        public final VisitData getVisitData() {
            return this.visitData;
        }

        public final List<SurveyAnswer> component6() {
            return this.responses;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getOverwrite() {
            return this.overwrite;
        }

        public final Map<String, h> component8() {
            return this.integrations;
        }

        /* renamed from: component9, reason: from getter */
        public final Boolean getDisclaimerAccepted() {
            return this.disclaimerAccepted;
        }

        public final QuestionAnswered copy(String surveyId, String responseUuid, long surveyPointId, VisitorData visitorData, VisitData visitData, List<SurveyAnswer> responses, boolean overwrite, Map<String, h> integrations, Boolean disclaimerAccepted, Map<String, String> responseAttributes) {
            l.e(surveyId, "surveyId");
            l.e(responseUuid, "responseUuid");
            l.e(visitorData, "visitorData");
            l.e(visitData, "visitData");
            l.e(responses, "responses");
            l.e(integrations, "integrations");
            return new QuestionAnswered(surveyId, responseUuid, surveyPointId, visitorData, visitData, responses, overwrite, integrations, disclaimerAccepted, responseAttributes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionAnswered)) {
                return false;
            }
            QuestionAnswered questionAnswered = (QuestionAnswered) other;
            return l.a(this.surveyId, questionAnswered.surveyId) && l.a(this.responseUuid, questionAnswered.responseUuid) && this.surveyPointId == questionAnswered.surveyPointId && l.a(this.visitorData, questionAnswered.visitorData) && l.a(this.visitData, questionAnswered.visitData) && l.a(this.responses, questionAnswered.responses) && this.overwrite == questionAnswered.overwrite && l.a(this.integrations, questionAnswered.integrations) && l.a(this.disclaimerAccepted, questionAnswered.disclaimerAccepted) && l.a(this.responseAttributes, questionAnswered.responseAttributes);
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

        public final String getSurveyId() {
            return this.surveyId;
        }

        public final long getSurveyPointId() {
            return this.surveyPointId;
        }

        public final VisitData getVisitData() {
            return this.visitData;
        }

        public final VisitorData getVisitorData() {
            return this.visitorData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iC = h0.b.c((this.visitData.hashCode() + ((this.visitorData.hashCode() + h0.b.b(c7.a.g(this.responseUuid, this.surveyId.hashCode() * 31, 31), 31, this.surveyPointId)) * 31)) * 31, 31, this.responses);
            boolean z10 = this.overwrite;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int iHashCode = (this.integrations.hashCode() + ((iC + i10) * 31)) * 31;
            Boolean bool = this.disclaimerAccepted;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, String> map = this.responseAttributes;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "QuestionAnswered(surveyId=" + this.surveyId + ", responseUuid=" + this.responseUuid + ", surveyPointId=" + this.surveyPointId + ", visitorData=" + this.visitorData + ", visitData=" + this.visitData + ", responses=" + this.responses + ", overwrite=" + this.overwrite + ", integrations=" + this.integrations + ", disclaimerAccepted=" + this.disclaimerAccepted + ", responseAttributes=" + this.responseAttributes + ')';
        }

        public QuestionAnswered(String str, String str2, long j, VisitorData visitorData, VisitData visitData, List<SurveyAnswer> list, boolean z10, Map<String, h> map, Boolean bool, Map<String, String> map2) {
            l.e(str, "surveyId");
            l.e(str2, "responseUuid");
            l.e(visitorData, "visitorData");
            l.e(visitData, "visitData");
            l.e(list, "responses");
            l.e(map, "integrations");
            this.surveyId = str;
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
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB=\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "Lcom/survicate/surveys/entities/models/RespondentEvent;", "", "id", "surveyId", "", "surveyFirstSeen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getSurveyId", "getSurveyId$annotations", "Z", "getSurveyFirstSeen", "getSurveyFirstSeen$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SurveySeen implements RespondentEvent {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final boolean surveyFirstSeen;
        private final String surveyId;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return RespondentEvent$SurveySeen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ SurveySeen(int i10, String str, String str2, boolean z10, y0 y0Var) {
            if (7 != (i10 & 7)) {
                p0.f(i10, 7, RespondentEvent$SurveySeen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.surveyId = str2;
            this.surveyFirstSeen = z10;
        }

        public static /* synthetic */ SurveySeen copy$default(SurveySeen surveySeen, String str, String str2, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = surveySeen.id;
            }
            if ((i10 & 2) != 0) {
                str2 = surveySeen.surveyId;
            }
            if ((i10 & 4) != 0) {
                z10 = surveySeen.surveyFirstSeen;
            }
            return surveySeen.copy(str, str2, z10);
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getSurveyFirstSeen$annotations() {
        }

        public static /* synthetic */ void getSurveyId$annotations() {
        }

        public static final /* synthetic */ void write$Self(SurveySeen self, b output, e serialDesc) {
            mu.y yVar = (mu.y) output;
            yVar.x(serialDesc, 0, self.id);
            yVar.x(serialDesc, 1, self.surveyId);
            yVar.s(serialDesc, 2, self.surveyFirstSeen);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSurveyId() {
            return this.surveyId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSurveyFirstSeen() {
            return this.surveyFirstSeen;
        }

        public final SurveySeen copy(String id2, String surveyId, boolean surveyFirstSeen) {
            l.e(id2, "id");
            l.e(surveyId, "surveyId");
            return new SurveySeen(id2, surveyId, surveyFirstSeen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SurveySeen)) {
                return false;
            }
            SurveySeen surveySeen = (SurveySeen) other;
            return l.a(this.id, surveySeen.id) && l.a(this.surveyId, surveySeen.surveyId) && this.surveyFirstSeen == surveySeen.surveyFirstSeen;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean getSurveyFirstSeen() {
            return this.surveyFirstSeen;
        }

        public final String getSurveyId() {
            return this.surveyId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iG = c7.a.g(this.surveyId, this.id.hashCode() * 31, 31);
            boolean z10 = this.surveyFirstSeen;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iG + i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SurveySeen(id=");
            sb2.append(this.id);
            sb2.append(", surveyId=");
            sb2.append(this.surveyId);
            sb2.append(", surveyFirstSeen=");
            return c7.a.r(sb2, this.surveyFirstSeen, ')');
        }

        public SurveySeen(String str, String str2, boolean z10) {
            l.e(str, "id");
            l.e(str2, "surveyId");
            this.id = str;
            this.surveyId = str2;
            this.surveyFirstSeen = z10;
        }
    }
}
