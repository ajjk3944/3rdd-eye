package Q4;

import Q4.f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1508p implements Z4.d<f0.e.d.a.b.AbstractC0140d> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1508p f11263a = new C1508p();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11264b = Z4.c.a(AppMeasurementSdk.ConditionalUserProperty.NAME);

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11265c = Z4.c.a("importance");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11266d = Z4.c.a("frames");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.b.AbstractC0140d abstractC0140d = (f0.e.d.a.b.AbstractC0140d) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11264b, abstractC0140d.c());
        eVar2.c(f11265c, abstractC0140d.b());
        eVar2.a(f11266d, abstractC0140d.a());
    }
}
