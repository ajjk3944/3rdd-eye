package qa;

/* compiled from: TemporalField.java */
/* loaded from: classes3.dex */
public interface h {
    <R extends d> R adjustInto(R r9, long j4);

    long getFrom(e eVar);

    boolean isDateBased();

    boolean isSupportedBy(e eVar);

    boolean isTimeBased();

    m range();

    m rangeRefinedBy(e eVar);
}
