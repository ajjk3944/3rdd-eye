package com.survicate.surveys.entities.survey;

import br.g;
import br.l;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerSettings;", "", "delay", "", "occurrences", "Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountSettings;", "firstOccurrence", "Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;", "lastOccurrence", "(Ljava/lang/Long;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountSettings;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;)V", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFirstOccurrence", "()Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;", "getLastOccurrence", "getOccurrences", "()Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountSettings;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountSettings;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeSettings;)Lcom/survicate/surveys/entities/survey/EventTriggerSettings;", "equals", "", "other", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventTriggerSettings {
    private final Long delay;
    private final EventTriggerOccurrenceTimeSettings firstOccurrence;
    private final EventTriggerOccurrenceTimeSettings lastOccurrence;
    private final EventTriggerOccurrenceCountSettings occurrences;

    public EventTriggerSettings() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EventTriggerSettings copy$default(EventTriggerSettings eventTriggerSettings, Long l10, EventTriggerOccurrenceCountSettings eventTriggerOccurrenceCountSettings, EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings, EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = eventTriggerSettings.delay;
        }
        if ((i10 & 2) != 0) {
            eventTriggerOccurrenceCountSettings = eventTriggerSettings.occurrences;
        }
        if ((i10 & 4) != 0) {
            eventTriggerOccurrenceTimeSettings = eventTriggerSettings.firstOccurrence;
        }
        if ((i10 & 8) != 0) {
            eventTriggerOccurrenceTimeSettings2 = eventTriggerSettings.lastOccurrence;
        }
        return eventTriggerSettings.copy(l10, eventTriggerOccurrenceCountSettings, eventTriggerOccurrenceTimeSettings, eventTriggerOccurrenceTimeSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getDelay() {
        return this.delay;
    }

    /* renamed from: component2, reason: from getter */
    public final EventTriggerOccurrenceCountSettings getOccurrences() {
        return this.occurrences;
    }

    /* renamed from: component3, reason: from getter */
    public final EventTriggerOccurrenceTimeSettings getFirstOccurrence() {
        return this.firstOccurrence;
    }

    /* renamed from: component4, reason: from getter */
    public final EventTriggerOccurrenceTimeSettings getLastOccurrence() {
        return this.lastOccurrence;
    }

    public final EventTriggerSettings copy(@o(name = "delay") Long delay, @o(name = "occurrences") EventTriggerOccurrenceCountSettings occurrences, @o(name = "first_occurrence") EventTriggerOccurrenceTimeSettings firstOccurrence, @o(name = "last_occurrence") EventTriggerOccurrenceTimeSettings lastOccurrence) {
        return new EventTriggerSettings(delay, occurrences, firstOccurrence, lastOccurrence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTriggerSettings)) {
            return false;
        }
        EventTriggerSettings eventTriggerSettings = (EventTriggerSettings) other;
        return l.a(this.delay, eventTriggerSettings.delay) && l.a(this.occurrences, eventTriggerSettings.occurrences) && l.a(this.firstOccurrence, eventTriggerSettings.firstOccurrence) && l.a(this.lastOccurrence, eventTriggerSettings.lastOccurrence);
    }

    public final Long getDelay() {
        return this.delay;
    }

    public final EventTriggerOccurrenceTimeSettings getFirstOccurrence() {
        return this.firstOccurrence;
    }

    public final EventTriggerOccurrenceTimeSettings getLastOccurrence() {
        return this.lastOccurrence;
    }

    public final EventTriggerOccurrenceCountSettings getOccurrences() {
        return this.occurrences;
    }

    public int hashCode() {
        Long l10 = this.delay;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        EventTriggerOccurrenceCountSettings eventTriggerOccurrenceCountSettings = this.occurrences;
        int iHashCode2 = (iHashCode + (eventTriggerOccurrenceCountSettings == null ? 0 : eventTriggerOccurrenceCountSettings.hashCode())) * 31;
        EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings = this.firstOccurrence;
        int iHashCode3 = (iHashCode2 + (eventTriggerOccurrenceTimeSettings == null ? 0 : eventTriggerOccurrenceTimeSettings.hashCode())) * 31;
        EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings2 = this.lastOccurrence;
        return iHashCode3 + (eventTriggerOccurrenceTimeSettings2 != null ? eventTriggerOccurrenceTimeSettings2.hashCode() : 0);
    }

    public String toString() {
        return "EventTriggerSettings(delay=" + this.delay + ", occurrences=" + this.occurrences + ", firstOccurrence=" + this.firstOccurrence + ", lastOccurrence=" + this.lastOccurrence + ')';
    }

    public EventTriggerSettings(@o(name = "delay") Long l10, @o(name = "occurrences") EventTriggerOccurrenceCountSettings eventTriggerOccurrenceCountSettings, @o(name = "first_occurrence") EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings, @o(name = "last_occurrence") EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings2) {
        this.delay = l10;
        this.occurrences = eventTriggerOccurrenceCountSettings;
        this.firstOccurrence = eventTriggerOccurrenceTimeSettings;
        this.lastOccurrence = eventTriggerOccurrenceTimeSettings2;
    }

    public /* synthetic */ EventTriggerSettings(Long l10, EventTriggerOccurrenceCountSettings eventTriggerOccurrenceCountSettings, EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings, EventTriggerOccurrenceTimeSettings eventTriggerOccurrenceTimeSettings2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : eventTriggerOccurrenceCountSettings, (i10 & 4) != 0 ? null : eventTriggerOccurrenceTimeSettings, (i10 & 8) != 0 ? null : eventTriggerOccurrenceTimeSettings2);
    }
}
