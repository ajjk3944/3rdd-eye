package w5;

import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: w5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5730e implements Z4.d<C5735j> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5730e f47399a = new C5730e();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47400b = Z4.c.a("performance");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47401c = Z4.c.a("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47402d = Z4.c.a("sessionSamplingRate");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        C5735j c5735j = (C5735j) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47400b, c5735j.f47420a);
        eVar2.a(f47401c, c5735j.f47421b);
        eVar2.d(f47402d, c5735j.f47422c);
    }
}
