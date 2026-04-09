package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1498f implements Z4.d<f0.d.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1498f f11199a = new C1498f();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11200b = Z4.c.a("filename");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11201c = Z4.c.a("contents");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.d.a aVar = (f0.d.a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11200b, aVar.b());
        eVar2.a(f11201c, aVar.a());
    }
}
