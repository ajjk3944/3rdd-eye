package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class V4 implements InterfaceC4487w5 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC4339e5 f35131b = new U4();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4339e5 f35132a;

    public V4() {
        this(new W4(E4.a(), f35131b));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4487w5
    public final InterfaceC4495x5 zza(Class cls) {
        AbstractC4511z5.o(cls);
        InterfaceC4348f5 interfaceC4348f5Zza = this.f35132a.zza(cls);
        if (interfaceC4348f5Zza.zzc()) {
            return C4400l5.g(AbstractC4511z5.f(), AbstractC4454s4.a(), interfaceC4348f5Zza.zza());
        }
        return C4392k5.k(cls, interfaceC4348f5Zza, AbstractC4440q5.a(), T4.a(), AbstractC4511z5.f(), X4.f35162a[interfaceC4348f5Zza.zzb().ordinal()] != 1 ? AbstractC4454s4.a() : null, AbstractC4321c5.a());
    }

    private V4(InterfaceC4339e5 interfaceC4339e5) {
        this.f35132a = (InterfaceC4339e5) F4.f(interfaceC4339e5, "messageInfoFactory");
    }
}
