package w5;

import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: w5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5732g implements Z4.d<w> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5732g f47408a = new C5732g();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47409b = Z4.c.a("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47410c = Z4.c.a("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47411d = Z4.c.a("applicationInfo");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        w wVar = (w) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47409b, wVar.f47474a);
        eVar2.a(f47410c, wVar.f47475b);
        eVar2.a(f47411d, wVar.f47476c);
    }
}
