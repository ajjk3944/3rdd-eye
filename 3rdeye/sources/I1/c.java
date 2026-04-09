package I1;

/* compiled from: StartupException.java */
/* loaded from: classes.dex */
public final class c extends RuntimeException {
    public c() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
