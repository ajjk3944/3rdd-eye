package P4;

import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes2.dex */
public final class a implements Z4.d<k> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10595a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f10596b = Z4.c.a("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f10597c = Z4.c.a("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f10598d = Z4.c.a("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f10599e = Z4.c.a("variantId");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f10600f = Z4.c.a("templateVersion");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        k kVar = (k) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f10596b, kVar.c());
        eVar2.a(f10597c, kVar.a());
        eVar2.a(f10598d, kVar.b());
        eVar2.a(f10599e, kVar.e());
        eVar2.b(f10600f, kVar.d());
    }
}
