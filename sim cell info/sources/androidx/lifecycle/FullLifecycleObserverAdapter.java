package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b f1788a;

    /* renamed from: b, reason: collision with root package name */
    private final e f1789b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1790a;

        static {
            int[] iArr = new int[d.a.values().length];
            f1790a = iArr;
            try {
                iArr[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1790a[d.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1790a[d.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1790a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1790a[d.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1790a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1790a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f1788a = bVar;
        this.f1789b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void g(g gVar, d.a aVar) {
        switch (a.f1790a[aVar.ordinal()]) {
            case 1:
                this.f1788a.e(gVar);
                break;
            case 2:
                this.f1788a.f(gVar);
                break;
            case 3:
                this.f1788a.a(gVar);
                break;
            case 4:
                this.f1788a.b(gVar);
                break;
            case 5:
                this.f1788a.d(gVar);
                break;
            case 6:
                this.f1788a.c(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f1789b;
        if (eVar != null) {
            eVar.g(gVar, aVar);
        }
    }
}
