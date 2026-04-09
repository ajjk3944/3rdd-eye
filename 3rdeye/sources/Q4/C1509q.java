package Q4;

import Q4.f0;
import com.singular.sdk.internal.Constants;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1509q implements Z4.d<f0.e.d.a.b.AbstractC0140d.AbstractC0141a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1509q f11267a = new C1509q();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11268b = Z4.c.a(Constants.REVENUE_PRODUCT_CATEGORY_KEY);

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11269c = Z4.c.a("symbol");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11270d = Z4.c.a("file");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11271e = Z4.c.a("offset");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11272f = Z4.c.a("importance");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.b.AbstractC0140d.AbstractC0141a abstractC0141a = (f0.e.d.a.b.AbstractC0140d.AbstractC0141a) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f11268b, abstractC0141a.d());
        eVar2.a(f11269c, abstractC0141a.e());
        eVar2.a(f11270d, abstractC0141a.a());
        eVar2.b(f11271e, abstractC0141a.c());
        eVar2.c(f11272f, abstractC0141a.b());
    }
}
