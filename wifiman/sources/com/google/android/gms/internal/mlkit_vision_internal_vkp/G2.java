package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class G2 {

    /* renamed from: c, reason: collision with root package name */
    private static final G2 f35590c = new G2();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35591d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f35593b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final K2 f35592a = new C4692q2();

    private G2() {
    }

    public static G2 a() {
        return f35590c;
    }

    public final J2 b(Class cls) {
        AbstractC4593h2.c(cls, "messageType");
        J2 j2Zza = (J2) this.f35593b.get(cls);
        if (j2Zza == null) {
            j2Zza = this.f35592a.zza(cls);
            AbstractC4593h2.c(cls, "messageType");
            J2 j22 = (J2) this.f35593b.putIfAbsent(cls, j2Zza);
            if (j22 != null) {
                return j22;
            }
        }
        return j2Zza;
    }
}
