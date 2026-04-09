package androidx.work;

/* loaded from: classes.dex */
public enum WorkInfo$State {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean d() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
