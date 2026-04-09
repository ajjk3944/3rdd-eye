package x3;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5762d implements Z4.d<x> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5762d f47680a = new C5762d();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47681b = Z4.c.a("clientType");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47682c = Z4.c.a("androidClientInfo");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        x xVar = (x) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47681b, xVar.b());
        eVar2.a(f47682c, xVar.a());
    }
}
