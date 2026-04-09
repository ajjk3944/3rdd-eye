package com.survicate.surveys.entities.models;

import br.g;
import br.l;
import br.x;
import br.y;
import gu.d;
import iu.e;
import java.lang.annotation.Annotation;
import java.util.List;
import ju.b;
import kc.f;
import kotlin.Metadata;
import ku.c;
import ku.k0;
import ku.p0;
import ku.y0;
import lq.h;
import lq.j;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \n2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction;", "", "respondentUuid", "", "getRespondentUuid", "()Ljava/lang/String;", "userId", "getUserId", "userKey", "getUserKey", "Companion", "InvokeEvent", "SetAttributes", "SurveyInteraction", "SurveyInteractionType", "VerifyUser", "Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;", "Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes;", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;", "Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContactAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final gu.a serializer() {
            y yVar = x.f2918a;
            return new d("com.survicate.surveys.entities.models.ContactAction", yVar.b(ContactAction.class), new ir.d[]{yVar.b(InvokeEvent.class), yVar.b(SetAttributes.class), yVar.b(SurveyInteraction.class), yVar.b(VerifyUser.class)}, new gu.a[]{ContactAction$InvokeEvent$$serializer.INSTANCE, ContactAction$SetAttributes$$serializer.INSTANCE, ContactAction$SurveyInteraction$$serializer.INSTANCE, ContactAction$VerifyUser$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000398:B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB[\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u001bR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001fR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b7\u0010.\u001a\u0004\b\n\u0010!¨\u0006;"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;", "Lcom/survicate/surveys/entities/models/ContactAction;", "", "userId", "userKey", "respondentUuid", "", "Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Event;", "events", "", "isScheduled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getUserKey", "getUserKey$annotations", "getRespondentUuid", "getRespondentUuid$annotations", "Ljava/util/List;", "getEvents", "getEvents$annotations", "Z", "isScheduled$annotations", "Companion", "$serializer", "Event", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvokeEvent implements ContactAction {
        private final List<Event> events;
        private final boolean isScheduled;
        private final String respondentUuid;
        private final String userId;
        private final String userKey;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final gu.a[] $childSerializers = {null, null, null, new c(ContactAction$InvokeEvent$Event$$serializer.INSTANCE), null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactAction$InvokeEvent$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Event;", "", "", "name", "", "timestampMs", "<init>", "(Ljava/lang/String;J)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;JLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Event;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Event;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "J", "getTimestampMs", "getTimestampMs$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Event {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String name;
            private final long timestampMs;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Event$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent$Event;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final gu.a serializer() {
                    return ContactAction$InvokeEvent$Event$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @lq.c
            public /* synthetic */ Event(int i10, String str, long j, y0 y0Var) {
                if (3 != (i10 & 3)) {
                    p0.f(i10, 3, ContactAction$InvokeEvent$Event$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.name = str;
                this.timestampMs = j;
            }

            public static /* synthetic */ Event copy$default(Event event, String str, long j, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = event.name;
                }
                if ((i10 & 2) != 0) {
                    j = event.timestampMs;
                }
                return event.copy(str, j);
            }

            public static /* synthetic */ void getName$annotations() {
            }

            public static /* synthetic */ void getTimestampMs$annotations() {
            }

            public static final /* synthetic */ void write$Self(Event self, b output, e serialDesc) {
                mu.y yVar = (mu.y) output;
                yVar.x(serialDesc, 0, self.name);
                yVar.v(serialDesc, 1, self.timestampMs);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final long getTimestampMs() {
                return this.timestampMs;
            }

            public final Event copy(String name, long timestampMs) {
                l.e(name, "name");
                return new Event(name, timestampMs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Event)) {
                    return false;
                }
                Event event = (Event) other;
                return l.a(this.name, event.name) && this.timestampMs == event.timestampMs;
            }

            public final String getName() {
                return this.name;
            }

            public final long getTimestampMs() {
                return this.timestampMs;
            }

            public int hashCode() {
                return Long.hashCode(this.timestampMs) + (this.name.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Event(name=");
                sb2.append(this.name);
                sb2.append(", timestampMs=");
                return w.g.h(sb2, this.timestampMs, ')');
            }

            public Event(String str, long j) {
                l.e(str, "name");
                this.name = str;
                this.timestampMs = j;
            }
        }

        @lq.c
        public /* synthetic */ InvokeEvent(int i10, String str, String str2, String str3, List list, boolean z10, y0 y0Var) {
            if (31 != (i10 & 31)) {
                p0.f(i10, 31, ContactAction$InvokeEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
            this.events = list;
            this.isScheduled = z10;
        }

        public static /* synthetic */ InvokeEvent copy$default(InvokeEvent invokeEvent, String str, String str2, String str3, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = invokeEvent.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = invokeEvent.userKey;
            }
            if ((i10 & 4) != 0) {
                str3 = invokeEvent.respondentUuid;
            }
            if ((i10 & 8) != 0) {
                list = invokeEvent.events;
            }
            if ((i10 & 16) != 0) {
                z10 = invokeEvent.isScheduled;
            }
            boolean z11 = z10;
            String str4 = str3;
            return invokeEvent.copy(str, str2, str4, list, z11);
        }

        public static /* synthetic */ void getEvents$annotations() {
        }

        public static /* synthetic */ void getRespondentUuid$annotations() {
        }

        public static /* synthetic */ void getUserId$annotations() {
        }

        public static /* synthetic */ void getUserKey$annotations() {
        }

        public static /* synthetic */ void isScheduled$annotations() {
        }

        public static final /* synthetic */ void write$Self(InvokeEvent self, b output, e serialDesc) {
            gu.a[] aVarArr = $childSerializers;
            mu.y yVar = (mu.y) output;
            yVar.x(serialDesc, 0, self.getUserId());
            yVar.x(serialDesc, 1, self.getUserKey());
            yVar.x(serialDesc, 2, self.getRespondentUuid());
            yVar.w(serialDesc, 3, aVarArr[3], self.events);
            yVar.s(serialDesc, 4, self.isScheduled);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserKey() {
            return this.userKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRespondentUuid() {
            return this.respondentUuid;
        }

        public final List<Event> component4() {
            return this.events;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsScheduled() {
            return this.isScheduled;
        }

        public final InvokeEvent copy(String userId, String userKey, String respondentUuid, List<Event> events, boolean isScheduled) {
            l.e(userId, "userId");
            l.e(userKey, "userKey");
            l.e(respondentUuid, "respondentUuid");
            l.e(events, "events");
            return new InvokeEvent(userId, userKey, respondentUuid, events, isScheduled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvokeEvent)) {
                return false;
            }
            InvokeEvent invokeEvent = (InvokeEvent) other;
            return l.a(this.userId, invokeEvent.userId) && l.a(this.userKey, invokeEvent.userKey) && l.a(this.respondentUuid, invokeEvent.respondentUuid) && l.a(this.events, invokeEvent.events) && this.isScheduled == invokeEvent.isScheduled;
        }

        public final List<Event> getEvents() {
            return this.events;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getRespondentUuid() {
            return this.respondentUuid;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserId() {
            return this.userId;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserKey() {
            return this.userKey;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iC = h0.b.c(c7.a.g(this.respondentUuid, c7.a.g(this.userKey, this.userId.hashCode() * 31, 31), 31), 31, this.events);
            boolean z10 = this.isScheduled;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iC + i10;
        }

        public final boolean isScheduled() {
            return this.isScheduled;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("InvokeEvent(userId=");
            sb2.append(this.userId);
            sb2.append(", userKey=");
            sb2.append(this.userKey);
            sb2.append(", respondentUuid=");
            sb2.append(this.respondentUuid);
            sb2.append(", events=");
            sb2.append(this.events);
            sb2.append(", isScheduled=");
            return c7.a.r(sb2, this.isScheduled, ')');
        }

        public InvokeEvent(String str, String str2, String str3, List<Event> list, boolean z10) {
            l.e(str, "userId");
            l.e(str2, "userKey");
            l.e(str3, "respondentUuid");
            l.e(list, "events");
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
            this.events = list;
            this.isScheduled = z10;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0003453B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0019R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001d¨\u00066"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes;", "Lcom/survicate/surveys/entities/models/ContactAction;", "", "userId", "userKey", "respondentUuid", "", "Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Attribute;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getUserKey", "getUserKey$annotations", "getRespondentUuid", "getRespondentUuid$annotations", "Ljava/util/List;", "getAttributes", "getAttributes$annotations", "Companion", "$serializer", "Attribute", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAttributes implements ContactAction {
        private final List<Attribute> attributes;
        private final String respondentUuid;
        private final String userId;
        private final String userKey;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final gu.a[] $childSerializers = {null, null, null, new c(ContactAction$SetAttributes$Attribute$$serializer.INSTANCE)};

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Attribute;", "", "", "name", "value", "", "timestampMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Attribute;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Attribute;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getValue", "getValue$annotations", "Ljava/lang/Long;", "getTimestampMs", "getTimestampMs$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Attribute {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String name;
            private final Long timestampMs;
            private final String value;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Attribute$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Attribute;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final gu.a serializer() {
                    return ContactAction$SetAttributes$Attribute$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @lq.c
            public /* synthetic */ Attribute(int i10, String str, String str2, Long l10, y0 y0Var) {
                if (7 != (i10 & 7)) {
                    p0.f(i10, 7, ContactAction$SetAttributes$Attribute$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.name = str;
                this.value = str2;
                this.timestampMs = l10;
            }

            public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, Long l10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = attribute.name;
                }
                if ((i10 & 2) != 0) {
                    str2 = attribute.value;
                }
                if ((i10 & 4) != 0) {
                    l10 = attribute.timestampMs;
                }
                return attribute.copy(str, str2, l10);
            }

            public static /* synthetic */ void getName$annotations() {
            }

            public static /* synthetic */ void getTimestampMs$annotations() {
            }

            public static /* synthetic */ void getValue$annotations() {
            }

            public static final /* synthetic */ void write$Self(Attribute self, b output, e serialDesc) {
                mu.y yVar = (mu.y) output;
                yVar.x(serialDesc, 0, self.name);
                yVar.x(serialDesc, 1, self.value);
                yVar.i(serialDesc, 2, k0.f14571a, self.timestampMs);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getTimestampMs() {
                return this.timestampMs;
            }

            public final Attribute copy(String name, String value, Long timestampMs) {
                l.e(name, "name");
                l.e(value, "value");
                return new Attribute(name, value, timestampMs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Attribute)) {
                    return false;
                }
                Attribute attribute = (Attribute) other;
                return l.a(this.name, attribute.name) && l.a(this.value, attribute.value) && l.a(this.timestampMs, attribute.timestampMs);
            }

            public final String getName() {
                return this.name;
            }

            public final Long getTimestampMs() {
                return this.timestampMs;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int iG = c7.a.g(this.value, this.name.hashCode() * 31, 31);
                Long l10 = this.timestampMs;
                return iG + (l10 == null ? 0 : l10.hashCode());
            }

            public String toString() {
                return "Attribute(name=" + this.name + ", value=" + this.value + ", timestampMs=" + this.timestampMs + ')';
            }

            public Attribute(String str, String str2, Long l10) {
                l.e(str, "name");
                l.e(str2, "value");
                this.name = str;
                this.value = str2;
                this.timestampMs = l10;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$SetAttributes;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactAction$SetAttributes$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @lq.c
        public /* synthetic */ SetAttributes(int i10, String str, String str2, String str3, List list, y0 y0Var) {
            if (15 != (i10 & 15)) {
                p0.f(i10, 15, ContactAction$SetAttributes$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
            this.attributes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetAttributes copy$default(SetAttributes setAttributes, String str, String str2, String str3, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setAttributes.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = setAttributes.userKey;
            }
            if ((i10 & 4) != 0) {
                str3 = setAttributes.respondentUuid;
            }
            if ((i10 & 8) != 0) {
                list = setAttributes.attributes;
            }
            return setAttributes.copy(str, str2, str3, list);
        }

        public static /* synthetic */ void getAttributes$annotations() {
        }

        public static /* synthetic */ void getRespondentUuid$annotations() {
        }

        public static /* synthetic */ void getUserId$annotations() {
        }

        public static /* synthetic */ void getUserKey$annotations() {
        }

        public static final /* synthetic */ void write$Self(SetAttributes self, b output, e serialDesc) {
            gu.a[] aVarArr = $childSerializers;
            mu.y yVar = (mu.y) output;
            yVar.x(serialDesc, 0, self.getUserId());
            yVar.x(serialDesc, 1, self.getUserKey());
            yVar.x(serialDesc, 2, self.getRespondentUuid());
            yVar.w(serialDesc, 3, aVarArr[3], self.attributes);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserKey() {
            return this.userKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRespondentUuid() {
            return this.respondentUuid;
        }

        public final List<Attribute> component4() {
            return this.attributes;
        }

        public final SetAttributes copy(String userId, String userKey, String respondentUuid, List<Attribute> attributes) {
            l.e(userId, "userId");
            l.e(userKey, "userKey");
            l.e(respondentUuid, "respondentUuid");
            l.e(attributes, "attributes");
            return new SetAttributes(userId, userKey, respondentUuid, attributes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetAttributes)) {
                return false;
            }
            SetAttributes setAttributes = (SetAttributes) other;
            return l.a(this.userId, setAttributes.userId) && l.a(this.userKey, setAttributes.userKey) && l.a(this.respondentUuid, setAttributes.respondentUuid) && l.a(this.attributes, setAttributes.attributes);
        }

        public final List<Attribute> getAttributes() {
            return this.attributes;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getRespondentUuid() {
            return this.respondentUuid;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserId() {
            return this.userId;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserKey() {
            return this.userKey;
        }

        public int hashCode() {
            return this.attributes.hashCode() + c7.a.g(this.respondentUuid, c7.a.g(this.userKey, this.userId.hashCode() * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SetAttributes(userId=");
            sb2.append(this.userId);
            sb2.append(", userKey=");
            sb2.append(this.userKey);
            sb2.append(", respondentUuid=");
            sb2.append(this.respondentUuid);
            sb2.append(", attributes=");
            return h0.b.t(sb2, this.attributes, ')');
        }

        public SetAttributes(String str, String str2, String str3, List<Attribute> list) {
            l.e(str, "userId");
            l.e(str2, "userKey");
            l.e(str3, "respondentUuid");
            l.e(list, "attributes");
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
            this.attributes = list;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0003435B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0019R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001d¨\u00066"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;", "Lcom/survicate/surveys/entities/models/ContactAction;", "", "userId", "userKey", "respondentUuid", "", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;", "interactions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getUserKey", "getUserKey$annotations", "getRespondentUuid", "getRespondentUuid$annotations", "Ljava/util/List;", "getInteractions", "getInteractions$annotations", "Companion", "$serializer", "Interaction", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SurveyInteraction implements ContactAction {
        private final List<Interaction> interactions;
        private final String respondentUuid;
        private final String userId;
        private final String userKey;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final gu.a[] $childSerializers = {null, null, null, new c(ContactAction$SurveyInteraction$Interaction$$serializer.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactAction$SurveyInteraction$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00062"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;", "", "", "surveyId", "", "timestampMs", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;", "type", "<init>", "(Ljava/lang/String;JLcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;JLcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;", "copy", "(Ljava/lang/String;JLcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;)Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSurveyId", "getSurveyId$annotations", "()V", "J", "getTimestampMs", "getTimestampMs$annotations", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;", "getType", "getType$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Interaction {
            private final String surveyId;
            private final long timestampMs;
            private final SurveyInteractionType type;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final gu.a[] $childSerializers = {null, null, SurveyInteractionType.INSTANCE.serializer()};

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final gu.a serializer() {
                    return ContactAction$SurveyInteraction$Interaction$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @lq.c
            public /* synthetic */ Interaction(int i10, String str, long j, SurveyInteractionType surveyInteractionType, y0 y0Var) {
                if (7 != (i10 & 7)) {
                    p0.f(i10, 7, ContactAction$SurveyInteraction$Interaction$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.surveyId = str;
                this.timestampMs = j;
                this.type = surveyInteractionType;
            }

            public static /* synthetic */ Interaction copy$default(Interaction interaction, String str, long j, SurveyInteractionType surveyInteractionType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = interaction.surveyId;
                }
                if ((i10 & 2) != 0) {
                    j = interaction.timestampMs;
                }
                if ((i10 & 4) != 0) {
                    surveyInteractionType = interaction.type;
                }
                return interaction.copy(str, j, surveyInteractionType);
            }

            public static /* synthetic */ void getSurveyId$annotations() {
            }

            public static /* synthetic */ void getTimestampMs$annotations() {
            }

            public static /* synthetic */ void getType$annotations() {
            }

            public static final /* synthetic */ void write$Self(Interaction self, b output, e serialDesc) {
                gu.a[] aVarArr = $childSerializers;
                mu.y yVar = (mu.y) output;
                yVar.x(serialDesc, 0, self.surveyId);
                yVar.v(serialDesc, 1, self.timestampMs);
                yVar.w(serialDesc, 2, aVarArr[2], self.type);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSurveyId() {
                return this.surveyId;
            }

            /* renamed from: component2, reason: from getter */
            public final long getTimestampMs() {
                return this.timestampMs;
            }

            /* renamed from: component3, reason: from getter */
            public final SurveyInteractionType getType() {
                return this.type;
            }

            public final Interaction copy(String surveyId, long timestampMs, SurveyInteractionType type) {
                l.e(surveyId, "surveyId");
                l.e(type, "type");
                return new Interaction(surveyId, timestampMs, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Interaction)) {
                    return false;
                }
                Interaction interaction = (Interaction) other;
                return l.a(this.surveyId, interaction.surveyId) && this.timestampMs == interaction.timestampMs && this.type == interaction.type;
            }

            public final String getSurveyId() {
                return this.surveyId;
            }

            public final long getTimestampMs() {
                return this.timestampMs;
            }

            public final SurveyInteractionType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + h0.b.b(this.surveyId.hashCode() * 31, 31, this.timestampMs);
            }

            public String toString() {
                return "Interaction(surveyId=" + this.surveyId + ", timestampMs=" + this.timestampMs + ", type=" + this.type + ')';
            }

            public Interaction(String str, long j, SurveyInteractionType surveyInteractionType) {
                l.e(str, "surveyId");
                l.e(surveyInteractionType, "type");
                this.surveyId = str;
                this.timestampMs = j;
                this.type = surveyInteractionType;
            }
        }

        @lq.c
        public /* synthetic */ SurveyInteraction(int i10, String str, String str2, String str3, List list, y0 y0Var) {
            if (15 != (i10 & 15)) {
                p0.f(i10, 15, ContactAction$SurveyInteraction$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
            this.interactions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SurveyInteraction copy$default(SurveyInteraction surveyInteraction, String str, String str2, String str3, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = surveyInteraction.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = surveyInteraction.userKey;
            }
            if ((i10 & 4) != 0) {
                str3 = surveyInteraction.respondentUuid;
            }
            if ((i10 & 8) != 0) {
                list = surveyInteraction.interactions;
            }
            return surveyInteraction.copy(str, str2, str3, list);
        }

        public static /* synthetic */ void getInteractions$annotations() {
        }

        public static /* synthetic */ void getRespondentUuid$annotations() {
        }

        public static /* synthetic */ void getUserId$annotations() {
        }

        public static /* synthetic */ void getUserKey$annotations() {
        }

        public static final /* synthetic */ void write$Self(SurveyInteraction self, b output, e serialDesc) {
            gu.a[] aVarArr = $childSerializers;
            mu.y yVar = (mu.y) output;
            yVar.x(serialDesc, 0, self.getUserId());
            yVar.x(serialDesc, 1, self.getUserKey());
            yVar.x(serialDesc, 2, self.getRespondentUuid());
            yVar.w(serialDesc, 3, aVarArr[3], self.interactions);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserKey() {
            return this.userKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRespondentUuid() {
            return this.respondentUuid;
        }

        public final List<Interaction> component4() {
            return this.interactions;
        }

        public final SurveyInteraction copy(String userId, String userKey, String respondentUuid, List<Interaction> interactions) {
            l.e(userId, "userId");
            l.e(userKey, "userKey");
            l.e(respondentUuid, "respondentUuid");
            l.e(interactions, "interactions");
            return new SurveyInteraction(userId, userKey, respondentUuid, interactions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SurveyInteraction)) {
                return false;
            }
            SurveyInteraction surveyInteraction = (SurveyInteraction) other;
            return l.a(this.userId, surveyInteraction.userId) && l.a(this.userKey, surveyInteraction.userKey) && l.a(this.respondentUuid, surveyInteraction.respondentUuid) && l.a(this.interactions, surveyInteraction.interactions);
        }

        public final List<Interaction> getInteractions() {
            return this.interactions;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getRespondentUuid() {
            return this.respondentUuid;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserId() {
            return this.userId;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserKey() {
            return this.userKey;
        }

        public int hashCode() {
            return this.interactions.hashCode() + c7.a.g(this.respondentUuid, c7.a.g(this.userKey, this.userId.hashCode() * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SurveyInteraction(userId=");
            sb2.append(this.userId);
            sb2.append(", userKey=");
            sb2.append(this.userKey);
            sb2.append(", respondentUuid=");
            sb2.append(this.respondentUuid);
            sb2.append(", interactions=");
            return h0.b.t(sb2, this.interactions, ')');
        }

        public SurveyInteraction(String str, String str2, String str3, List<Interaction> list) {
            l.e(str, "userId");
            l.e(str2, "userKey");
            l.e(str3, "respondentUuid");
            l.e(list, "interactions");
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
            this.interactions = list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;", "", "(Ljava/lang/String;I)V", "SEEN", "ANSWERED", "COMPLETED", "CLOSED", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SurveyInteractionType {
        private static final /* synthetic */ sq.a $ENTRIES;
        private static final /* synthetic */ SurveyInteractionType[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SurveyInteractionType SEEN = new SurveyInteractionType("SEEN", 0);
        public static final SurveyInteractionType ANSWERED = new SurveyInteractionType("ANSWERED", 1);
        public static final SurveyInteractionType COMPLETED = new SurveyInteractionType("COMPLETED", 2);
        public static final SurveyInteractionType CLOSED = new SurveyInteractionType("CLOSED", 3);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            private final /* synthetic */ gu.a get$cachedSerializer() {
                return (gu.a) SurveyInteractionType.$cachedSerializer$delegate.getValue();
            }

            public final gu.a serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ SurveyInteractionType[] $values() {
            return new SurveyInteractionType[]{SEEN, ANSWERED, COMPLETED, CLOSED};
        }

        static {
            SurveyInteractionType[] surveyInteractionTypeArr$values = $values();
            $VALUES = surveyInteractionTypeArr$values;
            $ENTRIES = a.a.j(surveyInteractionTypeArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = f.E(j.PUBLICATION, a.f6357d);
        }

        private SurveyInteractionType(String str, int i10) {
        }

        public static sq.a getEntries() {
            return $ENTRIES;
        }

        public static SurveyInteractionType valueOf(String str) {
            return (SurveyInteractionType) Enum.valueOf(SurveyInteractionType.class, str);
        }

        public static SurveyInteractionType[] values() {
            return (SurveyInteractionType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0016¨\u0006-"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;", "Lcom/survicate/surveys/entities/models/ContactAction;", "", "userId", "userKey", "respondentUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getUserKey", "getUserKey$annotations", "getRespondentUuid", "getRespondentUuid$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerifyUser implements ContactAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String respondentUuid;
        private final String userId;
        private final String userKey;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactAction$VerifyUser$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @lq.c
        public /* synthetic */ VerifyUser(int i10, String str, String str2, String str3, y0 y0Var) {
            if (7 != (i10 & 7)) {
                p0.f(i10, 7, ContactAction$VerifyUser$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
        }

        public static /* synthetic */ VerifyUser copy$default(VerifyUser verifyUser, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verifyUser.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = verifyUser.userKey;
            }
            if ((i10 & 4) != 0) {
                str3 = verifyUser.respondentUuid;
            }
            return verifyUser.copy(str, str2, str3);
        }

        public static /* synthetic */ void getRespondentUuid$annotations() {
        }

        public static /* synthetic */ void getUserId$annotations() {
        }

        public static /* synthetic */ void getUserKey$annotations() {
        }

        public static final /* synthetic */ void write$Self(VerifyUser self, b output, e serialDesc) {
            mu.y yVar = (mu.y) output;
            yVar.x(serialDesc, 0, self.getUserId());
            yVar.x(serialDesc, 1, self.getUserKey());
            yVar.x(serialDesc, 2, self.getRespondentUuid());
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserKey() {
            return this.userKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRespondentUuid() {
            return this.respondentUuid;
        }

        public final VerifyUser copy(String userId, String userKey, String respondentUuid) {
            l.e(userId, "userId");
            l.e(userKey, "userKey");
            l.e(respondentUuid, "respondentUuid");
            return new VerifyUser(userId, userKey, respondentUuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyUser)) {
                return false;
            }
            VerifyUser verifyUser = (VerifyUser) other;
            return l.a(this.userId, verifyUser.userId) && l.a(this.userKey, verifyUser.userKey) && l.a(this.respondentUuid, verifyUser.respondentUuid);
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getRespondentUuid() {
            return this.respondentUuid;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserId() {
            return this.userId;
        }

        @Override // com.survicate.surveys.entities.models.ContactAction
        public String getUserKey() {
            return this.userKey;
        }

        public int hashCode() {
            return this.respondentUuid.hashCode() + c7.a.g(this.userKey, this.userId.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("VerifyUser(userId=");
            sb2.append(this.userId);
            sb2.append(", userKey=");
            sb2.append(this.userKey);
            sb2.append(", respondentUuid=");
            return h0.b.r(sb2, this.respondentUuid, ')');
        }

        public VerifyUser(String str, String str2, String str3) {
            l.e(str, "userId");
            l.e(str2, "userKey");
            l.e(str3, "respondentUuid");
            this.userId = str;
            this.userKey = str2;
            this.respondentUuid = str3;
        }
    }

    String getRespondentUuid();

    String getUserId();

    String getUserKey();
}
