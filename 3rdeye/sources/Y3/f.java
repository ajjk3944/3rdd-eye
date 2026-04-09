package y3;

import c5.C2065a;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class f implements Z4.d<B3.e> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f48046a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f48047b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f48048c;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f48047b = new Z4.c("currentCacheSizeBytes", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 2;
        f48048c = new Z4.c("maxCacheSizeBytes", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB2.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        B3.e eVar2 = (B3.e) obj;
        Z4.e eVar3 = eVar;
        eVar3.b(f48047b, eVar2.f475a);
        eVar3.b(f48048c, eVar2.f476b);
    }
}
