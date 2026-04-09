package y3;

import c5.C2065a;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class b implements Z4.d<B3.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f48036a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f48037b;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f48037b = new Z4.c("storageMetrics", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        eVar.a(f48037b, ((B3.b) obj).f469a);
    }
}
