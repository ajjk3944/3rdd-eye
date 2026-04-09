package P6;

import android.content.Context;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class p implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18093a;

    public p(InterfaceC8708a interfaceC8708a) {
        this.f18093a = interfaceC8708a;
    }

    public static p a(InterfaceC8708a interfaceC8708a) {
        return new p(interfaceC8708a);
    }

    public static o c(Context context) {
        return new o(context);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c((Context) this.f18093a.get());
    }
}
