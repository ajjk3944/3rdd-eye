package G6;

import G6.InterfaceC2891a;
import android.content.Context;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class y implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7088a;

    public y(InterfaceC8708a interfaceC8708a) {
        this.f7088a = interfaceC8708a;
    }

    public static y a(InterfaceC8708a interfaceC8708a) {
        return new y(interfaceC8708a);
    }

    public static int c(Context context) {
        return InterfaceC2891a.c.x(context);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c((Context) this.f7088a.get()));
    }
}
