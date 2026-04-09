package y3;

import c5.C2065a;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class d implements Z4.d<B3.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f48041a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f48042b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f48043c;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f48042b = new Z4.c("logSource", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 2;
        f48043c = new Z4.c("logEventDropped", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB2.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        B3.d dVar = (B3.d) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f48042b, dVar.f473a);
        eVar2.a(f48043c, dVar.f474b);
    }
}
