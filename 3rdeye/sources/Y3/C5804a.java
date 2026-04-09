package y3;

import c5.C2065a;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5804a implements Z4.d<B3.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5804a f48031a = new C5804a();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f48032b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f48033c;

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f48034d;

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f48035e;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f48032b = new Z4.c("window", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 2;
        f48033c = new Z4.c("logSourceMetrics", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB2.a())));
        C2065a c2065aB3 = C2065a.b();
        c2065aB3.f18486a = 3;
        f48034d = new Z4.c("globalMetrics", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB3.a())));
        C2065a c2065aB4 = C2065a.b();
        c2065aB4.f18486a = 4;
        f48035e = new Z4.c("appNamespace", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB4.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        B3.a aVar = (B3.a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f48032b, aVar.f461a);
        eVar2.a(f48033c, aVar.f462b);
        eVar2.a(f48034d, aVar.f463c);
        eVar2.a(f48035e, aVar.f464d);
    }
}
