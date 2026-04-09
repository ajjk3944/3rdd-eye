package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4936q2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f36665g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f36666a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4920o2 f36667b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f36668c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f36669d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f36670e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f36671f;

    public final Object a(Object obj) {
        synchronized (this.f36669d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC4912n2.f36600a == null) {
            return this.f36668c;
        }
        synchronized (f36665g) {
            try {
                if (C4834e.a()) {
                    return this.f36671f == null ? this.f36668c : this.f36671f;
                }
                try {
                    for (C4936q2 c4936q2 : N.f36061a) {
                        if (C4834e.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC4920o2 interfaceC4920o2 = c4936q2.f36667b;
                            if (interfaceC4920o2 != null) {
                                objZza = interfaceC4920o2.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f36665g) {
                            c4936q2.f36671f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC4920o2 interfaceC4920o22 = this.f36667b;
                if (interfaceC4920o22 == null) {
                    return this.f36668c;
                }
                try {
                    return interfaceC4920o22.zza();
                } catch (IllegalStateException unused3) {
                    return this.f36668c;
                } catch (SecurityException unused4) {
                    return this.f36668c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f36666a;
    }

    private C4936q2(String str, Object obj, Object obj2, InterfaceC4920o2 interfaceC4920o2) {
        this.f36669d = new Object();
        this.f36670e = null;
        this.f36671f = null;
        this.f36666a = str;
        this.f36668c = obj;
        this.f36667b = interfaceC4920o2;
    }
}
