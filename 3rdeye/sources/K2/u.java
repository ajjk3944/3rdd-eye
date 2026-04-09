package k2;

import java.util.ArrayList;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5271d;
import p2.s;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public final class u implements InterfaceC5212c, AbstractC5268a.InterfaceC0489a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f43293a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f43294b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final s.a f43295c;

    /* renamed from: d, reason: collision with root package name */
    public final C5271d f43296d;

    /* renamed from: e, reason: collision with root package name */
    public final C5271d f43297e;

    /* renamed from: f, reason: collision with root package name */
    public final C5271d f43298f;

    public u(q2.b bVar, p2.s sVar) {
        sVar.getClass();
        this.f43293a = sVar.f45100e;
        this.f43295c = sVar.f45096a;
        C5271d c5271dA = sVar.f45097b.a();
        this.f43296d = c5271dA;
        C5271d c5271dA2 = sVar.f45098c.a();
        this.f43297e = c5271dA2;
        C5271d c5271dA3 = sVar.f45099d.a();
        this.f43298f = c5271dA3;
        bVar.e(c5271dA);
        bVar.e(c5271dA2);
        bVar.e(c5271dA3);
        c5271dA.a(this);
        c5271dA2.a(this);
        c5271dA3.a(this);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f43294b;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5268a.InterfaceC0489a) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(AbstractC5268a.InterfaceC0489a interfaceC0489a) {
        this.f43294b.add(interfaceC0489a);
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
    }
}
