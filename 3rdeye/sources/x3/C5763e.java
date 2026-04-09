package x3;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: x3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5763e implements Z4.d<y> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5763e f47683a = new C5763e();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47684b = Z4.c.a("privacyContext");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47685c = Z4.c.a("productIdOrigin");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        y yVar = (y) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47684b, yVar.a());
        eVar2.a(f47685c, yVar.b());
    }
}
