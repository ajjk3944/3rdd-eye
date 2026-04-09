package k3;

import android.content.Context;
import e3.InterfaceC5417b;

/* loaded from: classes.dex */
public final class X implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f51155a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f51156b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f51157c;

    public X(Jg.a aVar, Jg.a aVar2, Jg.a aVar3) {
        this.f51155a = aVar;
        this.f51156b = aVar2;
        this.f51157c = aVar3;
    }

    public static X a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3) {
        return new X(aVar, aVar2, aVar3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f51155a.get(), (String) this.f51156b.get(), ((Integer) this.f51157c.get()).intValue());
    }
}
