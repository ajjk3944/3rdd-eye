package w5;

import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: w5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5731f implements Z4.d<q> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5731f f47403a = new C5731f();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47404b = Z4.c.a("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47405c = Z4.c.a("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47406d = Z4.c.a("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47407e = Z4.c.a("defaultProcess");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        q qVar = (q) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47404b, qVar.f47437a);
        eVar2.c(f47405c, qVar.f47438b);
        eVar2.c(f47406d, qVar.f47439c);
        eVar2.e(f47407e, qVar.f47440d);
    }
}
