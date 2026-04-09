package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class W4 implements InterfaceC4339e5 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4339e5[] f35141a;

    W4(InterfaceC4339e5... interfaceC4339e5Arr) {
        this.f35141a = interfaceC4339e5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4339e5
    public final InterfaceC4348f5 zza(Class cls) {
        for (InterfaceC4339e5 interfaceC4339e5 : this.f35141a) {
            if (interfaceC4339e5.zzb(cls)) {
                return interfaceC4339e5.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4339e5
    public final boolean zzb(Class cls) {
        for (InterfaceC4339e5 interfaceC4339e5 : this.f35141a) {
            if (interfaceC4339e5.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
