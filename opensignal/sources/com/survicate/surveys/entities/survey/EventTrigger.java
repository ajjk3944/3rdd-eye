package com.survicate.surveys.entities.survey;

import br.l;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTrigger;", "", "name", "", "relation", "Lcom/survicate/surveys/entities/survey/EventTriggerRelation;", "properties", "", "Lcom/survicate/surveys/entities/survey/EventTriggerProperty;", "settings", "Lcom/survicate/surveys/entities/survey/EventTriggerSettings;", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/EventTriggerRelation;Ljava/util/List;Lcom/survicate/surveys/entities/survey/EventTriggerSettings;)V", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/List;", "getRelation", "()Lcom/survicate/surveys/entities/survey/EventTriggerRelation;", "getSettings", "()Lcom/survicate/surveys/entities/survey/EventTriggerSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventTrigger {
    private final String name;
    private final List<EventTriggerProperty> properties;
    private final EventTriggerRelation relation;
    private final EventTriggerSettings settings;

    public EventTrigger(@o(name = "name") String str, @o(name = "relation") EventTriggerRelation eventTriggerRelation, @o(name = "properties") List<EventTriggerProperty> list, @o(name = "settings") EventTriggerSettings eventTriggerSettings) {
        l.e(str, "name");
        l.e(eventTriggerRelation, "relation");
        l.e(list, "properties");
        l.e(eventTriggerSettings, "settings");
        this.name = str;
        this.relation = eventTriggerRelation;
        this.properties = list;
        this.settings = eventTriggerSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTrigger copy$default(EventTrigger eventTrigger, String str, EventTriggerRelation eventTriggerRelation, List list, EventTriggerSettings eventTriggerSettings, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventTrigger.name;
        }
        if ((i10 & 2) != 0) {
            eventTriggerRelation = eventTrigger.relation;
        }
        if ((i10 & 4) != 0) {
            list = eventTrigger.properties;
        }
        if ((i10 & 8) != 0) {
            eventTriggerSettings = eventTrigger.settings;
        }
        return eventTrigger.copy(str, eventTriggerRelation, list, eventTriggerSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final EventTriggerRelation getRelation() {
        return this.relation;
    }

    public final List<EventTriggerProperty> component3() {
        return this.properties;
    }

    /* renamed from: component4, reason: from getter */
    public final EventTriggerSettings getSettings() {
        return this.settings;
    }

    public final EventTrigger copy(@o(name = "name") String name, @o(name = "relation") EventTriggerRelation relation, @o(name = "properties") List<EventTriggerProperty> properties, @o(name = "settings") EventTriggerSettings settings) {
        l.e(name, "name");
        l.e(relation, "relation");
        l.e(properties, "properties");
        l.e(settings, "settings");
        return new EventTrigger(name, relation, properties, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTrigger)) {
            return false;
        }
        EventTrigger eventTrigger = (EventTrigger) other;
        return l.a(this.name, eventTrigger.name) && this.relation == eventTrigger.relation && l.a(this.properties, eventTrigger.properties) && l.a(this.settings, eventTrigger.settings);
    }

    public final String getName() {
        return this.name;
    }

    public final List<EventTriggerProperty> getProperties() {
        return this.properties;
    }

    public final EventTriggerRelation getRelation() {
        return this.relation;
    }

    public final EventTriggerSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode() + b.c((this.relation.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.properties);
    }

    public String toString() {
        return "EventTrigger(name=" + this.name + ", relation=" + this.relation + ", properties=" + this.properties + ", settings=" + this.settings + ')';
    }
}
