package bf;

/* loaded from: classes.dex */
public class n extends RuntimeException {
    public n() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public n(int i10) {
        super(i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
