package n5;

import c5.C2065a;
import java.io.IOException;
import o5.C5423b;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: n5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5365b implements Z4.d<C5423b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5365b f44331a = new C5365b();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f44332b;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f44332b = new Z4.c("messagingClientEvent", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        eVar.a(f44332b, ((C5423b) obj).f44844a);
    }
}
