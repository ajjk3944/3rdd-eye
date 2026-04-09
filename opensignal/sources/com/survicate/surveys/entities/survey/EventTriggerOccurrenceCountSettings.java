package com.survicate.surveys.entities.survey;

import br.l;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountSettings;", "", "value", "", "", "operator", "Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountOperator;", "(Ljava/util/List;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountOperator;)V", "getOperator", "()Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountOperator;", "getValue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventTriggerOccurrenceCountSettings {
    private final EventTriggerOccurrenceCountOperator operator;
    private final List<Long> value;

    public EventTriggerOccurrenceCountSettings(@o(name = "value") List<Long> list, @o(name = "operator") EventTriggerOccurrenceCountOperator eventTriggerOccurrenceCountOperator) {
        l.e(list, "value");
        l.e(eventTriggerOccurrenceCountOperator, "operator");
        this.value = list;
        this.operator = eventTriggerOccurrenceCountOperator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTriggerOccurrenceCountSettings copy$default(EventTriggerOccurrenceCountSettings eventTriggerOccurrenceCountSettings, List list, EventTriggerOccurrenceCountOperator eventTriggerOccurrenceCountOperator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = eventTriggerOccurrenceCountSettings.value;
        }
        if ((i10 & 2) != 0) {
            eventTriggerOccurrenceCountOperator = eventTriggerOccurrenceCountSettings.operator;
        }
        return eventTriggerOccurrenceCountSettings.copy(list, eventTriggerOccurrenceCountOperator);
    }

    public final List<Long> component1() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final EventTriggerOccurrenceCountOperator getOperator() {
        return this.operator;
    }

    public final EventTriggerOccurrenceCountSettings copy(@o(name = "value") List<Long> value, @o(name = "operator") EventTriggerOccurrenceCountOperator operator) {
        l.e(value, "value");
        l.e(operator, "operator");
        return new EventTriggerOccurrenceCountSettings(value, operator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTriggerOccurrenceCountSettings)) {
            return false;
        }
        EventTriggerOccurrenceCountSettings eventTriggerOccurrenceCountSettings = (EventTriggerOccurrenceCountSettings) other;
        return l.a(this.value, eventTriggerOccurrenceCountSettings.value) && this.operator == eventTriggerOccurrenceCountSettings.operator;
    }

    public final EventTriggerOccurrenceCountOperator getOperator() {
        return this.operator;
    }

    public final List<Long> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.operator.hashCode() + (this.value.hashCode() * 31);
    }

    public String toString() {
        return "EventTriggerOccurrenceCountSettings(value=" + this.value + ", operator=" + this.operator + ')';
    }
}
