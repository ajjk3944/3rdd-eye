package L0;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* renamed from: L0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781l {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC0783n> f3922b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3923c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* renamed from: L0.l$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1781n f3924a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1788v f3925b;

        public a(AbstractC1781n abstractC1781n, InterfaceC1788v interfaceC1788v) {
            this.f3924a = abstractC1781n;
            this.f3925b = interfaceC1788v;
            abstractC1781n.addObserver(interfaceC1788v);
        }
    }

    public C0781l(Runnable runnable) {
        this.f3921a = runnable;
    }

    public final void a(InterfaceC0783n interfaceC0783n) {
        this.f3922b.remove(interfaceC0783n);
        a aVar = (a) this.f3923c.remove(interfaceC0783n);
        if (aVar != null) {
            aVar.f3924a.removeObserver(aVar.f3925b);
            aVar.f3925b = null;
        }
        this.f3921a.run();
    }
}
