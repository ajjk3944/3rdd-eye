package C;

/* compiled from: CameraState.java */
/* renamed from: C.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0633u {

    /* compiled from: CameraState.java */
    /* renamed from: C.u$a */
    public static abstract class a {
        public abstract Throwable a();

        public abstract int b();
    }

    /* compiled from: CameraState.java */
    /* renamed from: C.u$b */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public abstract a a();

    public abstract b b();
}
