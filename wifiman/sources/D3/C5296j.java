package d3;

import android.content.Context;
import e3.InterfaceC5417b;
import m3.InterfaceC6756a;

/* renamed from: d3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5296j implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f45742a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f45743b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f45744c;

    public C5296j(Jg.a aVar, Jg.a aVar2, Jg.a aVar3) {
        this.f45742a = aVar;
        this.f45743b = aVar2;
        this.f45744c = aVar3;
    }

    public static C5296j a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3) {
        return new C5296j(aVar, aVar2, aVar3);
    }

    public static C5295i c(Context context, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2) {
        return new C5295i(context, interfaceC6756a, interfaceC6756a2);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5295i get() {
        return c((Context) this.f45742a.get(), (InterfaceC6756a) this.f45743b.get(), (InterfaceC6756a) this.f45744c.get());
    }
}
