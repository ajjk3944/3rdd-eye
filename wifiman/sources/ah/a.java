package Ah;

import Bh.AbstractC2509t;
import Bh.D;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.g0;
import Dh.O;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.AbstractC6159f;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a extends AbstractC6159f {

    /* renamed from: e, reason: collision with root package name */
    public static final C0030a f767e = new C0030a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Zh.f f768f;

    /* renamed from: Ah.a$a, reason: collision with other inner class name */
    public static final class C0030a {
        public /* synthetic */ C0030a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Zh.f a() {
            return a.f768f;
        }

        private C0030a() {
        }
    }

    static {
        Zh.f fVarH = Zh.f.h("clone");
        AbstractC6492s.h(fVarH, "identifier(...)");
        f768f = fVarH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oi.n storageManager, InterfaceC2495e containingClass) {
        super(storageManager, containingClass);
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingClass, "containingClass");
    }

    @Override // ii.AbstractC6159f
    protected List j() {
        O oL1 = O.l1(m(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), f768f, InterfaceC2492b.a.DECLARATION, g0.f1784a);
        oL1.R0(null, m().J0(), AbstractC3689v.l(), AbstractC3689v.l(), AbstractC3689v.l(), AbstractC5833e.m(m()).i(), D.OPEN, AbstractC2509t.f1794c);
        return AbstractC3689v.e(oL1);
    }
}
