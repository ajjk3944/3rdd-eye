package Q4;

import Q4.f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1504l implements Z4.d<f0.e.d.a.b.AbstractC0138a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1504l f11242a = new C1504l();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11243b = Z4.c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11244c = Z4.c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11245d = Z4.c.a(AppMeasurementSdk.ConditionalUserProperty.NAME);

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11246e = Z4.c.a(CommonUrlParts.UUID);

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.b.AbstractC0138a abstractC0138a = (f0.e.d.a.b.AbstractC0138a) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f11243b, abstractC0138a.a());
        eVar2.b(f11244c, abstractC0138a.c());
        eVar2.a(f11245d, abstractC0138a.b());
        String strD = abstractC0138a.d();
        eVar2.a(f11246e, strD != null ? strD.getBytes(f0.f11202a) : null);
    }
}
