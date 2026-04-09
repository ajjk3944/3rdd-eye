package z3;

/* compiled from: BackendResponse.java */
/* loaded from: classes.dex */
public abstract class g {

    /* compiled from: BackendResponse.java */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long a();

    public abstract a b();
}
