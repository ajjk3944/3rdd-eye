package com.survicate.surveys.entities.models;

import br.g;
import br.l;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import mq.o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/survicate/surveys/entities/models/EventSuggestion;", "", "name", "", "properties", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventSuggestion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String name;
    private final List<String> properties;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/survicate/surveys/entities/models/EventSuggestion$Companion;", "", "<init>", "()V", "Lcq/a;", "activeEvent", "Lcom/survicate/surveys/entities/models/EventSuggestion;", "fromActiveEvent", "(Lcq/a;)Lcom/survicate/surveys/entities/models/EventSuggestion;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final EventSuggestion fromActiveEvent(cq.a activeEvent) {
            l.e(activeEvent, "activeEvent");
            return new EventSuggestion(activeEvent.f6606a, o.Q0(activeEvent.f6607b.keySet()));
        }

        private Companion() {
        }
    }

    public EventSuggestion(String str, List<String> list) {
        l.e(str, "name");
        l.e(list, "properties");
        this.name = str;
        this.properties = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventSuggestion copy$default(EventSuggestion eventSuggestion, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventSuggestion.name;
        }
        if ((i10 & 2) != 0) {
            list = eventSuggestion.properties;
        }
        return eventSuggestion.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component2() {
        return this.properties;
    }

    public final EventSuggestion copy(String name, List<String> properties) {
        l.e(name, "name");
        l.e(properties, "properties");
        return new EventSuggestion(name, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSuggestion)) {
            return false;
        }
        EventSuggestion eventSuggestion = (EventSuggestion) other;
        return l.a(this.name, eventSuggestion.name) && l.a(this.properties, eventSuggestion.properties);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventSuggestion(name=");
        sb2.append(this.name);
        sb2.append(", properties=");
        return b.t(sb2, this.properties, ')');
    }
}
