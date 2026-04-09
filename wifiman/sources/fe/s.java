package fe;

import Yg.J;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f47333a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f47334b = Yg.n.b(new InterfaceC6824a() { // from class: fe.q
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return s.k(this.f47331a);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f47335c = Yg.n.b(new InterfaceC6824a() { // from class: fe.r
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return s.l(this.f47332a);
        }
    });

    static final class a implements InterfaceC6469f {
        a() {
        }

        @Override // kg.InterfaceC6469f
        public final void accept(Object it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h(s.this.i() + " state: " + it, null, 2, null);
        }
    }

    private final void e() {
        Object objF;
        Fg.a aVarH = h();
        Collection collectionValues = this.f47333a.values();
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                AbstractC6492s.f(next);
                int iJ = j(next);
                do {
                    Object next2 = it.next();
                    AbstractC6492s.f(next2);
                    int iJ2 = j(next2);
                    if (iJ < iJ2) {
                        next = next2;
                        iJ = iJ2;
                    }
                } while (it.hasNext());
            }
            objF = next;
        } else {
            objF = null;
        }
        if (objF == null) {
            objF = f();
        }
        aVarH.h(objF);
    }

    private final Fg.a h() {
        Object value = this.f47334b.getValue();
        AbstractC6492s.h(value, "getValue(...)");
        return (Fg.a) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fg.a k(s sVar) {
        return Fg.a.k2(sVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i l(s sVar) {
        gg.i iVarI2 = sVar.h().W().f0(sVar.new a()).e1().X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final s sVar, Object obj, final InterfaceC5913c emitter) {
        AbstractC6492s.i(emitter, "emitter");
        emitter.d(new InterfaceC6468e() { // from class: fe.p
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                s.o(this.f47329a, emitter);
            }
        });
        synchronized (sVar.f47333a) {
            sVar.f47333a.put(Integer.valueOf(emitter.hashCode()), obj);
            sVar.e();
            J j10 = J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(s sVar, InterfaceC5913c interfaceC5913c) {
        synchronized (sVar.f47333a) {
            sVar.f47333a.remove(Integer.valueOf(interfaceC5913c.hashCode()));
            sVar.e();
            J j10 = J.f24997a;
        }
    }

    protected abstract Object f();

    public final gg.i g() {
        return (gg.i) this.f47335c.getValue();
    }

    protected abstract String i();

    public abstract int j(Object obj);

    public final AbstractC5912b m(final Object mode) {
        AbstractC6492s.i(mode, "mode");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new InterfaceC5915e() { // from class: fe.o
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                s.n(this.f47327a, mode, interfaceC5913c);
            }
        });
        AbstractC6492s.h(abstractC5912bR, "create(...)");
        return abstractC5912bR;
    }
}
