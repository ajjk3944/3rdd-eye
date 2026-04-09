package Q4;

import Q4.f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1507o implements Z4.d<f0.e.d.a.b.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1507o f11259a = new C1507o();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11260b = Z4.c.a(AppMeasurementSdk.ConditionalUserProperty.NAME);

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11261c = Z4.c.a("code");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11262d = Z4.c.a("address");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.b.c cVar = (f0.e.d.a.b.c) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11260b, cVar.c());
        eVar2.a(f11261c, cVar.b());
        eVar2.b(f11262d, cVar.a());
    }
}
