package G6;

import G6.InterfaceC2891a;
import android.content.Context;
import z2.InterfaceC8708a;

/* renamed from: G6.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2905o implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7063a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7064b;

    public C2905o(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f7063a = interfaceC8708a;
        this.f7064b = interfaceC8708a2;
    }

    public static C2905o a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new C2905o(interfaceC8708a, interfaceC8708a2);
    }

    public static boolean c(Context context, int i10) {
        return InterfaceC2891a.c.n(context, i10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c((Context) this.f7063a.get(), ((Integer) this.f7064b.get()).intValue()));
    }
}
