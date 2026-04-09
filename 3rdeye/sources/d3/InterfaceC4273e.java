package d3;

/* compiled from: RequestCoordinator.java */
/* renamed from: d3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4273e {

    /* compiled from: RequestCoordinator.java */
    /* renamed from: d3.e$a */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z10) {
            this.isComplete = z10;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean b(InterfaceC4272d interfaceC4272d);

    boolean c(InterfaceC4272d interfaceC4272d);

    InterfaceC4273e d();

    void e(InterfaceC4272d interfaceC4272d);

    void i(InterfaceC4272d interfaceC4272d);

    boolean k(InterfaceC4272d interfaceC4272d);
}
