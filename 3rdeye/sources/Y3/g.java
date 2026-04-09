package y3;

import c5.C2065a;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class g implements Z4.d<B3.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f48049a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f48050b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f48051c;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f48050b = new Z4.c("startMs", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 2;
        f48051c = new Z4.c("endMs", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB2.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        B3.f fVar = (B3.f) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f48050b, fVar.f477a);
        eVar2.b(f48051c, fVar.f478b);
    }
}
