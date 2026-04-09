package F5;

import A5.f;
import A5.h;
import F3.B;
import F3.T;
import F3.U;
import F3.c0;
import F3.f0;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public final class b extends f {

    /* renamed from: i, reason: collision with root package name */
    private static final C5.a f6021i = C5.a.a();

    /* renamed from: d, reason: collision with root package name */
    private final h f6022d;

    /* renamed from: e, reason: collision with root package name */
    private final T f6023e;

    /* renamed from: f, reason: collision with root package name */
    private final U f6024f;

    /* renamed from: g, reason: collision with root package name */
    private final f0 f6025g;

    /* renamed from: h, reason: collision with root package name */
    final B f6026h;

    b(h hVar, E5.a aVar) {
        T tB = c0.b("object-detection");
        AbstractC7901p.m(hVar, "Context can not be null");
        AbstractC7901p.m(aVar, "ObjectDetectorOptions can not be null");
        this.f6023e = tB;
        this.f6024f = U.a(hVar.b());
        this.f6022d = hVar;
        d.a(aVar);
        this.f6025g = f0.a(hVar.b());
    }
}
