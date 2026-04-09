package G6;

import android.content.Context;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class F implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f6999a;

    public F(InterfaceC8708a interfaceC8708a) {
        this.f6999a = interfaceC8708a;
    }

    public static F a(InterfaceC8708a interfaceC8708a) {
        return new F(interfaceC8708a);
    }

    public static E c(Context context) {
        return new E(context);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E get() {
        return c((Context) this.f6999a.get());
    }
}
