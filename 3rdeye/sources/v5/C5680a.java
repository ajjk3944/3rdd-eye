package v5;

import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5680a implements Z4.d<d> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5680a f47040a = new C5680a();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47041b = Z4.c.a("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47042c = Z4.c.a("variantId");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47043d = Z4.c.a("parameterKey");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47044e = Z4.c.a("parameterValue");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47045f = Z4.c.a("templateVersion");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        d dVar = (d) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47041b, dVar.c());
        eVar2.a(f47042c, dVar.e());
        eVar2.a(f47043d, dVar.a());
        eVar2.a(f47044e, dVar.b());
        eVar2.b(f47045f, dVar.d());
    }
}
