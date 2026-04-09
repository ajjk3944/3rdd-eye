package y3;

import c5.C2065a;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class c implements Z4.d<B3.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f48038a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f48039b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f48040c;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f48039b = new Z4.c("eventsDroppedCount", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 3;
        f48040c = new Z4.c("reason", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB2.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        B3.c cVar = (B3.c) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f48039b, cVar.f470a);
        eVar2.a(f48040c, cVar.f471b);
    }
}
