package com.survicate.surveys.infrastructure.network.contacts;

import br.g;
import br.l;
import com.survicate.surveys.entities.models.ContactAction;
import com.survicate.surveys.infrastructure.network.UserAgentBuilder;
import iu.e;
import ju.b;
import kc.f;
import ku.k0;
import ku.p0;
import ku.y0;
import lq.c;
import lq.h;
import lq.j;
import mu.y;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u00042\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels;", "", "()V", "Attribute", "Companion", "Event", "Metadata", "Respondent", "SurveyInteraction", "SurveyInteractionType", "User", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactsApiModels {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Attribute;", "", "", "name", "value", "", "timestampMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Attribute;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Attribute;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getValue", "getValue$annotations", "Ljava/lang/Long;", "getTimestampMs", "getTimestampMs$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Attribute {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String name;
        private final Long timestampMs;
        private final String value;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Attribute$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Attribute;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactsApiModels$Attribute$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ Attribute(int i10, String str, String str2, Long l10, y0 y0Var) {
            if (7 != (i10 & 7)) {
                p0.f(i10, 7, ContactsApiModels$Attribute$$serializer.INSTANCE.getDescriptor());
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
            y yVar = (y) output;
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Companion;", "", "()V", "buildMetadata", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "version", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Metadata buildMetadata(String version) {
            l.e(version, "version");
            return new Metadata(version, UserAgentBuilder.INSTANCE.build());
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Event;", "", "", "name", "", "timestampMs", "<init>", "(Ljava/lang/String;J)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;JLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Event;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Event;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "J", "getTimestampMs", "getTimestampMs$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Event {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String name;
        private final long timestampMs;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Event$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Event;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactsApiModels$Event$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ Event(int i10, String str, long j, y0 y0Var) {
            if (3 != (i10 & 3)) {
                p0.f(i10, 3, ContactsApiModels$Event$$serializer.INSTANCE.getDescriptor());
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
            y yVar = (y) output;
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "", "", "version", "userAgent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVersion", "getVersion$annotations", "()V", "getUserAgent", "getUserAgent$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Metadata {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String userAgent;
        private final String version;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactsApiModels$Metadata$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ Metadata(int i10, String str, String str2, y0 y0Var) {
            if (3 != (i10 & 3)) {
                p0.f(i10, 3, ContactsApiModels$Metadata$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.version = str;
            this.userAgent = str2;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = metadata.version;
            }
            if ((i10 & 2) != 0) {
                str2 = metadata.userAgent;
            }
            return metadata.copy(str, str2);
        }

        public static /* synthetic */ void getUserAgent$annotations() {
        }

        public static /* synthetic */ void getVersion$annotations() {
        }

        public static final /* synthetic */ void write$Self(Metadata self, b output, e serialDesc) {
            y yVar = (y) output;
            yVar.x(serialDesc, 0, self.version);
            yVar.x(serialDesc, 1, self.userAgent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserAgent() {
            return this.userAgent;
        }

        public final Metadata copy(String version, String userAgent) {
            l.e(version, "version");
            l.e(userAgent, "userAgent");
            return new Metadata(version, userAgent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return l.a(this.version, metadata.version) && l.a(this.userAgent, metadata.userAgent);
        }

        public final String getUserAgent() {
            return this.userAgent;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.userAgent.hashCode() + (this.version.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Metadata(version=");
            sb2.append(this.version);
            sb2.append(", userAgent=");
            return h0.b.r(sb2, this.userAgent, ')');
        }

        public Metadata(String str, String str2) {
            l.e(str, "version");
            l.e(str2, "userAgent");
            this.version = str;
            this.userAgent = str2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006$"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "", "", "uuid", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getUuid$annotations", "()V", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Respondent {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String uuid;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactsApiModels$Respondent$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ Respondent(int i10, String str, y0 y0Var) {
            if (1 == (i10 & 1)) {
                this.uuid = str;
            } else {
                p0.f(i10, 1, ContactsApiModels$Respondent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Respondent copy$default(Respondent respondent, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = respondent.uuid;
            }
            return respondent.copy(str);
        }

        public static /* synthetic */ void getUuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        public final Respondent copy(String uuid) {
            l.e(uuid, "uuid");
            return new Respondent(uuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Respondent) && l.a(this.uuid, ((Respondent) other).uuid);
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return h0.b.r(new StringBuilder("Respondent(uuid="), this.uuid, ')');
        }

        public Respondent(String str) {
            l.e(str, "uuid");
            this.uuid = str;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB=\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001f¨\u00065"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction;", "", "", "id", "", "timestampMs", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;", "type", "<init>", "(Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;)V", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;", "interaction", "(Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;JLcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;", "copy", "(Ljava/lang/String;JLcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "J", "getTimestampMs", "getTimestampMs$annotations", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;", "getType", "getType$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SurveyInteraction {
        private final String id;
        private final long timestampMs;
        private final SurveyInteractionType type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final gu.a[] $childSerializers = {null, null, SurveyInteractionType.INSTANCE.serializer()};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactsApiModels$SurveyInteraction$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ SurveyInteraction(int i10, String str, long j, SurveyInteractionType surveyInteractionType, y0 y0Var) {
            if (7 != (i10 & 7)) {
                p0.f(i10, 7, ContactsApiModels$SurveyInteraction$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.timestampMs = j;
            this.type = surveyInteractionType;
        }

        public static /* synthetic */ SurveyInteraction copy$default(SurveyInteraction surveyInteraction, String str, long j, SurveyInteractionType surveyInteractionType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = surveyInteraction.id;
            }
            if ((i10 & 2) != 0) {
                j = surveyInteraction.timestampMs;
            }
            if ((i10 & 4) != 0) {
                surveyInteractionType = surveyInteraction.type;
            }
            return surveyInteraction.copy(str, j, surveyInteractionType);
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getTimestampMs$annotations() {
        }

        public static /* synthetic */ void getType$annotations() {
        }

        public static final /* synthetic */ void write$Self(SurveyInteraction self, b output, e serialDesc) {
            gu.a[] aVarArr = $childSerializers;
            y yVar = (y) output;
            yVar.x(serialDesc, 0, self.id);
            yVar.v(serialDesc, 1, self.timestampMs);
            yVar.w(serialDesc, 2, aVarArr[2], self.type);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        /* renamed from: component3, reason: from getter */
        public final SurveyInteractionType getType() {
            return this.type;
        }

        public final SurveyInteraction copy(String id2, long timestampMs, SurveyInteractionType type) {
            l.e(id2, "id");
            l.e(type, "type");
            return new SurveyInteraction(id2, timestampMs, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SurveyInteraction)) {
                return false;
            }
            SurveyInteraction surveyInteraction = (SurveyInteraction) other;
            return l.a(this.id, surveyInteraction.id) && this.timestampMs == surveyInteraction.timestampMs && this.type == surveyInteraction.type;
        }

        public final String getId() {
            return this.id;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public final SurveyInteractionType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + h0.b.b(this.id.hashCode() * 31, 31, this.timestampMs);
        }

        public String toString() {
            return "SurveyInteraction(id=" + this.id + ", timestampMs=" + this.timestampMs + ", type=" + this.type + ')';
        }

        public SurveyInteraction(String str, long j, SurveyInteractionType surveyInteractionType) {
            l.e(str, "id");
            l.e(surveyInteractionType, "type");
            this.id = str;
            this.timestampMs = j;
            this.type = surveyInteractionType;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SurveyInteraction(ContactAction.SurveyInteraction.Interaction interaction) {
            this(interaction.getSurveyId(), interaction.getTimestampMs(), ContactsApiModelsKt.toApiModel(interaction.getType()));
            l.e(interaction, "interaction");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;", "", "(Ljava/lang/String;I)V", "SEEN", "ANSWERED", "COMPLETED", "CLOSED", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            $cachedSerializer$delegate = f.E(j.PUBLICATION, a.f6376d);
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "", "", "id", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getKey", "getKey$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class User {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final String key;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final gu.a serializer() {
                return ContactsApiModels$User$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public /* synthetic */ User(int i10, String str, String str2, y0 y0Var) {
            if (3 != (i10 & 3)) {
                p0.f(i10, 3, ContactsApiModels$User$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.key = str2;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = user.id;
            }
            if ((i10 & 2) != 0) {
                str2 = user.key;
            }
            return user.copy(str, str2);
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getKey$annotations() {
        }

        public static final /* synthetic */ void write$Self(User self, b output, e serialDesc) {
            y yVar = (y) output;
            yVar.x(serialDesc, 0, self.id);
            yVar.x(serialDesc, 1, self.key);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public final User copy(String id2, String key) {
            l.e(id2, "id");
            l.e(key, "key");
            return new User(id2, key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return l.a(this.id, user.id) && l.a(this.key, user.key);
        }

        public final String getId() {
            return this.id;
        }

        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.key.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("User(id=");
            sb2.append(this.id);
            sb2.append(", key=");
            return h0.b.r(sb2, this.key, ')');
        }

        public User(String str, String str2) {
            l.e(str, "id");
            l.e(str2, "key");
            this.id = str;
            this.key = str2;
        }
    }
}
