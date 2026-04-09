package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1781n {
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* compiled from: Lifecycle.kt */
    /* renamed from: androidx.lifecycle.n$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0246a Companion = new C0246a();

        /* compiled from: Lifecycle.kt */
        /* renamed from: androidx.lifecycle.n$a$a, reason: collision with other inner class name */
        public static final class C0246a {

            /* compiled from: Lifecycle.kt */
            /* renamed from: androidx.lifecycle.n$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0247a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f16167a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f16167a = iArr;
                }
            }

            public static a a(b state) {
                kotlin.jvm.internal.l.f(state, "state");
                int i = C0247a.f16167a[state.ordinal()];
                if (i == 1) {
                    return a.ON_DESTROY;
                }
                if (i == 2) {
                    return a.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public static a b(b state) {
                kotlin.jvm.internal.l.f(state, "state");
                int i = C0247a.f16167a[state.ordinal()];
                if (i == 1) {
                    return a.ON_START;
                }
                if (i == 2) {
                    return a.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public static a c(b state) {
                kotlin.jvm.internal.l.f(state, "state");
                int i = C0247a.f16167a[state.ordinal()];
                if (i == 1) {
                    return a.ON_CREATE;
                }
                if (i == 2) {
                    return a.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* compiled from: Lifecycle.kt */
        /* renamed from: androidx.lifecycle.n$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16168a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f16168a = iArr;
            }
        }

        public static final a downFrom(b bVar) {
            Companion.getClass();
            return C0246a.a(bVar);
        }

        public static final a downTo(b state) {
            Companion.getClass();
            kotlin.jvm.internal.l.f(state, "state");
            int i = C0246a.C0247a.f16167a[state.ordinal()];
            if (i == 1) {
                return ON_STOP;
            }
            if (i == 2) {
                return ON_PAUSE;
            }
            if (i != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        public static final a upFrom(b bVar) {
            Companion.getClass();
            return C0246a.b(bVar);
        }

        public static final a upTo(b bVar) {
            Companion.getClass();
            return C0246a.c(bVar);
        }

        public final b getTargetState() {
            switch (b.f16168a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    /* renamed from: androidx.lifecycle.n$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(b state) {
            kotlin.jvm.internal.l.f(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(D9.y mutableStateFlow, InterfaceC1790x interfaceC1790x, a event) {
        kotlin.jvm.internal.l.f(mutableStateFlow, "$mutableStateFlow");
        kotlin.jvm.internal.l.f(interfaceC1790x, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.f(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    public abstract void addObserver(InterfaceC1789w interfaceC1789w);

    public abstract b getCurrentState();

    public D9.I<b> getCurrentStateFlow() {
        D9.J jC = D9.E.c(getCurrentState());
        addObserver(new C1780m(jC, 0));
        return D9.H.a(jC);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(InterfaceC1789w interfaceC1789w);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        kotlin.jvm.internal.l.f(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
