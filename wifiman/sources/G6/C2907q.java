package G6;

import G6.InterfaceC2891a;
import android.content.Context;
import z2.InterfaceC8708a;

/* renamed from: G6.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2907q implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7068a;

    public C2907q(InterfaceC8708a interfaceC8708a) {
        this.f7068a = interfaceC8708a;
    }

    public static C2907q a(InterfaceC8708a interfaceC8708a) {
        return new C2907q(interfaceC8708a);
    }

    public static boolean c(Context context) {
        return InterfaceC2891a.c.p(context);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c((Context) this.f7068a.get()));
    }
}
