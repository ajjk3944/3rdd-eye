package T;

import java.util.List;
import o.C7033y;

/* renamed from: T.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3555t {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f21251a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final B f21252b = new a();

    /* renamed from: T.t$a */
    public static final class a implements B {
        a() {
        }
    }

    public static final InterfaceC3548p a(InterfaceC3526f interfaceC3526f, AbstractC3550q abstractC3550q) {
        return new C3553s(abstractC3550q, interfaceC3526f, null, 4, null);
    }

    public static final U0 b(InterfaceC3526f interfaceC3526f, AbstractC3550q abstractC3550q) {
        return new C3553s(abstractC3550q, interfaceC3526f, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List list, int i10, int i11) {
        Object obj = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C7033y c7033y, int i10, int i11) {
        int iA = c7033y.a(i10);
        c7033y.m(i10, c7033y.a(i11));
        c7033y.m(i11, iA);
    }
}
