package d3;

import android.content.Context;
import e3.InterfaceC5417b;

/* renamed from: d3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5298l implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f45750a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f45751b;

    public C5298l(Jg.a aVar, Jg.a aVar2) {
        this.f45750a = aVar;
        this.f45751b = aVar2;
    }

    public static C5298l a(Jg.a aVar, Jg.a aVar2) {
        return new C5298l(aVar, aVar2);
    }

    public static C5297k c(Context context, Object obj) {
        return new C5297k(context, (C5295i) obj);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5297k get() {
        return c((Context) this.f45750a.get(), this.f45751b.get());
    }
}
