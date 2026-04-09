package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
final class E4 implements InterfaceC4339e5 {

    /* renamed from: a, reason: collision with root package name */
    private static final E4 f34994a = new E4();

    private E4() {
    }

    public static E4 a() {
        return f34994a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4339e5
    public final InterfaceC4348f5 zza(Class cls) {
        if (!D4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC4348f5) D4.l(cls.asSubclass(D4.class)).o(D4.c.f34977c, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4339e5
    public final boolean zzb(Class cls) {
        return D4.class.isAssignableFrom(cls);
    }
}
