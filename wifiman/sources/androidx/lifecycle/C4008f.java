package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4008f implements InterfaceC4015m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4007e f31651a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015m f31652b;

    /* renamed from: androidx.lifecycle.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31653a;

        static {
            int[] iArr = new int[AbstractC4013k.a.values().length];
            try {
                iArr[AbstractC4013k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC4013k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC4013k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC4013k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC4013k.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC4013k.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC4013k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f31653a = iArr;
        }
    }

    public C4008f(InterfaceC4007e defaultLifecycleObserver, InterfaceC4015m interfaceC4015m) {
        AbstractC6492s.i(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f31651a = defaultLifecycleObserver;
        this.f31652b = interfaceC4015m;
    }

    @Override // androidx.lifecycle.InterfaceC4015m
    public void j(InterfaceC4017o source, AbstractC4013k.a event) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(event, "event");
        switch (a.f31653a[event.ordinal()]) {
            case 1:
                this.f31651a.h(source);
                break;
            case 2:
                this.f31651a.onStart(source);
                break;
            case 3:
                this.f31651a.g(source);
                break;
            case 4:
                this.f31651a.p(source);
                break;
            case 5:
                this.f31651a.onStop(source);
                break;
            case 6:
                this.f31651a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC4015m interfaceC4015m = this.f31652b;
        if (interfaceC4015m != null) {
            interfaceC4015m.j(source, event);
        }
    }
}
