package w5;

import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: w5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5733h implements Z4.d<C5724D> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5733h f47412a = new C5733h();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47413b = Z4.c.a("sessionId");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47414c = Z4.c.a("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47415d = Z4.c.a("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47416e = Z4.c.a("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47417f = Z4.c.a("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f47418g = Z4.c.a("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f47419h = Z4.c.a("firebaseAuthenticationToken");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        C5724D c5724d = (C5724D) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47413b, c5724d.f47354a);
        eVar2.a(f47414c, c5724d.f47355b);
        eVar2.c(f47415d, c5724d.f47356c);
        eVar2.b(f47416e, c5724d.f47357d);
        eVar2.a(f47417f, c5724d.f47358e);
        eVar2.a(f47418g, c5724d.f47359f);
        eVar2.a(f47419h, c5724d.f47360g);
    }
}
