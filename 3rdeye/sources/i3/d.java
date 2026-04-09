package i3;

/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: StateVerifier.java */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f38451a;

        public final void a() {
            if (this.f38451a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
