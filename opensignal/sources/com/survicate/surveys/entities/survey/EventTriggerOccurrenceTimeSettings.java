package com.survicate.surveys.entities.survey;

import br.l;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;", "", "periodMs", "", "dates", "", "", "operator", "Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeOperator;", "(Ljava/lang/Long;Ljava/util/List;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeOperator;)V", "getDates", "()Ljava/util/List;", "getOperator", "()Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeOperator;", "getPeriodMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/util/List;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeOperator;)Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;", "equals", "", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventTriggerOccurrenceTimeSettings {
    private final List<String> dates;
    private final EventTriggerOccurrenceTimeOperator operator;
    private final Long periodMs;

    public EventTriggerOccurrenceTimeSettings(@o(name = "period") Long l10, @o(name = "dates") List<String> list, @o(name = "operator") EventTriggerOccurrenceTimeOperator eventTriggerOccurrenceTimeOperator) {
        l.e(list, "dates");
        l.e(eventTriggerOccurrenceTimeOperator, "operator");
        this.periodMs = l10;
        this.dates = list;
        this.operator = eventTriggerOccurrenceTimeOperator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTriggerOccurrenceTimeSettings copy$default(EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings, Long l10, List list, EventTriggerOccurrenceTimeOperator eventTriggerOccurrenceTimeOperator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = eventTriggerOccurrenceTimeSettings.periodMs;
        }
        if ((i10 & 2) != 0) {
            list = eventTriggerOccurrenceTimeSettings.dates;
        }
        if ((i10 & 4) != 0) {
            eventTriggerOccurrenceTimeOperator = eventTriggerOccurrenceTimeSettings.operator;
        }
        return eventTriggerOccurrenceTimeSettings.copy(l10, list, eventTriggerOccurrenceTimeOperator);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getPeriodMs() {
        return this.periodMs;
    }

    public final List<String> component2() {
        return this.dates;
    }

    /* renamed from: component3, reason: from getter */
    public final EventTriggerOccurrenceTimeOperator getOperator() {
        return this.operator;
    }

    public final EventTriggerOccurrenceTimeSettings copy(@o(name = "period") Long periodMs, @o(name = "dates") List<String> dates, @o(name = "operator") EventTriggerOccurrenceTimeOperator operator) {
        l.e(dates, "dates");
        l.e(operator, "operator");
        return new EventTriggerOccurrenceTimeSettings(periodMs, dates, operator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTriggerOccurrenceTimeSettings)) {
            return false;
        }
        EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings = (EventTriggerOccurrenceTimeSettings) other;
        return l.a(this.periodMs, eventTriggerOccurrenceTimeSettings.periodMs) && l.a(this.dates, eventTriggerOccurrenceTimeSettings.dates) && this.operator == eventTriggerOccurrenceTimeSettings.operator;
    }

    public final List<String> getDates() {
        return this.dates;
    }

    public final EventTriggerOccurrenceTimeOperator getOperator() {
        return this.operator;
    }

    public final Long getPeriodMs() {
        return this.periodMs;
    }

    public int hashCode() {
        Long l10 = this.periodMs;
        return this.operator.hashCode() + b.c((l10 == null ? 0 : l10.hashCode()) * 31, 31, this.dates);
    }

    public String toString() {
        return "EventTriggerOccurrenceTimeSettings(periodMs=" + this.periodMs + ", dates=" + this.dates + ", operator=" + this.operator + ')';
    }
}
