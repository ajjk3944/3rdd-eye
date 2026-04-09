package i3;

import android.content.Context;
import e3.AbstractC5419d;
import e3.InterfaceC5417b;
import j3.x;
import k3.InterfaceC6370d;
import m3.InterfaceC6756a;

/* renamed from: i3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6073i implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f48819a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f48820b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f48821c;

    /* renamed from: d, reason: collision with root package name */
    private final Jg.a f48822d;

    public C6073i(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4) {
        this.f48819a = aVar;
        this.f48820b = aVar2;
        this.f48821c = aVar3;
        this.f48822d = aVar4;
    }

    public static C6073i a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4) {
        return new C6073i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC6370d interfaceC6370d, j3.f fVar, InterfaceC6756a interfaceC6756a) {
        return (x) AbstractC5419d.d(AbstractC6072h.a(context, interfaceC6370d, fVar, interfaceC6756a));
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f48819a.get(), (InterfaceC6370d) this.f48820b.get(), (j3.f) this.f48821c.get(), (InterfaceC6756a) this.f48822d.get());
    }
}
