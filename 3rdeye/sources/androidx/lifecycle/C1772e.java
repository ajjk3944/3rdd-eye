package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772e implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1771d f16140b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1788v f16141c;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    /* renamed from: androidx.lifecycle.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16142a;

        static {
            int[] iArr = new int[AbstractC1781n.a.values().length];
            try {
                iArr[AbstractC1781n.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1781n.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1781n.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1781n.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1781n.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1781n.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1781n.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f16142a = iArr;
        }
    }

    public C1772e(InterfaceC1771d defaultLifecycleObserver, InterfaceC1788v interfaceC1788v) {
        kotlin.jvm.internal.l.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f16140b = defaultLifecycleObserver;
        this.f16141c = interfaceC1788v;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        int i = a.f16142a[aVar.ordinal()];
        InterfaceC1771d interfaceC1771d = this.f16140b;
        switch (i) {
            case 1:
                interfaceC1771d.onCreate(interfaceC1790x);
                break;
            case 2:
                interfaceC1771d.onStart(interfaceC1790x);
                break;
            case 3:
                interfaceC1771d.onResume(interfaceC1790x);
                break;
            case 4:
                interfaceC1771d.onPause(interfaceC1790x);
                break;
            case 5:
                interfaceC1771d.onStop(interfaceC1790x);
                break;
            case 6:
                interfaceC1771d.onDestroy(interfaceC1790x);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1788v interfaceC1788v = this.f16141c;
        if (interfaceC1788v != null) {
            interfaceC1788v.c(interfaceC1790x, aVar);
        }
    }
}
