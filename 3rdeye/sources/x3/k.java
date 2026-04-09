package x3;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class k implements Z4.d<F> {

    /* renamed from: a, reason: collision with root package name */
    public static final k f47710a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47711b = Z4.c.a("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47712c = Z4.c.a("mobileSubtype");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        F f10 = (F) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47711b, f10.b());
        eVar2.a(f47712c, f10.a());
    }
}
