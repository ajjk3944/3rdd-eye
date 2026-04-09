package v;

import o0.b;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* renamed from: v.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5642C implements b.c, I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5670z.g f46611b;

    public /* synthetic */ C5642C(C5670z.g gVar) {
        this.f46611b = gVar;
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        i0 i0Var = this.f46611b.f46986a.f46758h;
        i0Var.getClass();
        return o0.b.a(new B.d(i0Var, 28));
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        C5670z.g gVar = this.f46611b;
        if (!gVar.f46990e.h()) {
            aVar.b(null);
            return "EnableTorchInternal";
        }
        C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
        gVar.f46986a.n(true);
        aVar.b(null);
        return "EnableTorchInternal";
    }
}
