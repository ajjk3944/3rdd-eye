package Q4;

import Q4.f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1495c implements Z4.d<f0.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1495c f11164a = new C1495c();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11165b = Z4.c.a("key");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11166c = Z4.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.c cVar = (f0.c) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11165b, cVar.a());
        eVar2.a(f11166c, cVar.b());
    }
}
