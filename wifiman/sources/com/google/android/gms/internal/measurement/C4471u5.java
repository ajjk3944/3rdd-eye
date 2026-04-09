package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4471u5 {

    /* renamed from: c, reason: collision with root package name */
    private static final C4471u5 f35492c = new C4471u5();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f35494b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4487w5 f35493a = new V4();

    private C4471u5() {
    }

    public static C4471u5 a() {
        return f35492c;
    }

    public final InterfaceC4495x5 b(Class cls) {
        F4.f(cls, "messageType");
        InterfaceC4495x5 interfaceC4495x5 = (InterfaceC4495x5) this.f35494b.get(cls);
        if (interfaceC4495x5 != null) {
            return interfaceC4495x5;
        }
        InterfaceC4495x5 interfaceC4495x5Zza = this.f35493a.zza(cls);
        F4.f(cls, "messageType");
        F4.f(interfaceC4495x5Zza, "schema");
        InterfaceC4495x5 interfaceC4495x52 = (InterfaceC4495x5) this.f35494b.putIfAbsent(cls, interfaceC4495x5Zza);
        return interfaceC4495x52 != null ? interfaceC4495x52 : interfaceC4495x5Zza;
    }

    public final InterfaceC4495x5 c(Object obj) {
        return b(obj.getClass());
    }
}
