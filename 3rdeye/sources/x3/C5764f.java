package x3;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: x3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5764f implements Z4.d<z> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5764f f47686a = new C5764f();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47687b = Z4.c.a("clearBlob");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47688c = Z4.c.a("encryptedBlob");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        z zVar = (z) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47687b, zVar.a());
        eVar2.a(f47688c, zVar.b());
    }
}
