package com.survicate.surveys.entities.survey;

import br.l;
import c7.a;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerProperty;", "", "name", "", "value", "propertyOperator", "Lcom/survicate/surveys/entities/survey/EventTriggerPropertyOperator;", "(Ljava/lang/String;Ljava/lang/String;Lcom/survicate/surveys/entities/survey/EventTriggerPropertyOperator;)V", "getName", "()Ljava/lang/String;", "getPropertyOperator", "()Lcom/survicate/surveys/entities/survey/EventTriggerPropertyOperator;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventTriggerProperty {
    private final String name;
    private final EventTriggerPropertyOperator propertyOperator;
    private final String value;

    public EventTriggerProperty(@o(name = "name") String str, @o(name = "value") String str2, @o(name = "operator") EventTriggerPropertyOperator eventTriggerPropertyOperator) {
        l.e(str, "name");
        l.e(str2, "value");
        l.e(eventTriggerPropertyOperator, "propertyOperator");
        this.name = str;
        this.value = str2;
        this.propertyOperator = eventTriggerPropertyOperator;
    }

    public static /* synthetic */ EventTriggerProperty copy$default(EventTriggerProperty eventTriggerProperty, String str, String str2, EventTriggerPropertyOperator eventTriggerPropertyOperator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventTriggerProperty.name;
        }
        if ((i10 & 2) != 0) {
            str2 = eventTriggerProperty.value;
        }
        if ((i10 & 4) != 0) {
            eventTriggerPropertyOperator = eventTriggerProperty.propertyOperator;
        }
        return eventTriggerProperty.copy(str, str2, eventTriggerPropertyOperator);
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
    public final EventTriggerPropertyOperator getPropertyOperator() {
        return this.propertyOperator;
    }

    public final EventTriggerProperty copy(@o(name = "name") String name, @o(name = "value") String value, @o(name = "operator") EventTriggerPropertyOperator propertyOperator) {
        l.e(name, "name");
        l.e(value, "value");
        l.e(propertyOperator, "propertyOperator");
        return new EventTriggerProperty(name, value, propertyOperator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTriggerProperty)) {
            return false;
        }
        EventTriggerProperty eventTriggerProperty = (EventTriggerProperty) other;
        return l.a(this.name, eventTriggerProperty.name) && l.a(this.value, eventTriggerProperty.value) && this.propertyOperator == eventTriggerProperty.propertyOperator;
    }

    public final String getName() {
        return this.name;
    }

    public final EventTriggerPropertyOperator getPropertyOperator() {
        return this.propertyOperator;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.propertyOperator.hashCode() + a.g(this.value, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        return "EventTriggerProperty(name=" + this.name + ", value=" + this.value + ", propertyOperator=" + this.propertyOperator + ')';
    }
}
