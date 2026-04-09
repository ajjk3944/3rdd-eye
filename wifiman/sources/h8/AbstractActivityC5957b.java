package h8;

import Yg.n;
import gg.AbstractC5912b;
import gg.s;
import h8.InterfaceC5966k;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.di.c;
import rj.AbstractC7726l2;
import sj.AbstractC7986a;

/* renamed from: h8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC5957b extends androidx.appcompat.app.c implements InterfaceC5966k, org.kodein.di.c {

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ th.l[] f48507F = {O.h(new F(AbstractActivityC5957b.class, "di", "getDi()Lorg/kodein/di/DI;", 0))};

    /* renamed from: G, reason: collision with root package name */
    public static final int f48508G = 8;

    /* renamed from: D, reason: collision with root package name */
    private final Yg.m f48509D = AbstractC7986a.c().a(this, f48507F[0]);

    /* renamed from: E, reason: collision with root package name */
    private final Yg.m f48510E = n.b(new InterfaceC6824a() { // from class: h8.a
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return AbstractActivityC5957b.V0(this.f48506a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5960e V0(AbstractActivityC5957b abstractActivityC5957b) {
        return new C5960e(abstractActivityC5957b);
    }

    @Override // h8.InterfaceC5966k
    public void B(AbstractC5912b abstractC5912b, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC6824a interfaceC6824a) {
        InterfaceC5966k.a.j(this, abstractC5912b, enumC5958c, interfaceC6835l, z10, interfaceC6824a);
    }

    @Override // org.kodein.di.c
    public org.kodein.di.f I() {
        return c.a.a(this);
    }

    @Override // h8.InterfaceC5966k
    public void J(s sVar, EnumC5958c enumC5958c, InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a, boolean z10, InterfaceC6469f interfaceC6469f2) {
        InterfaceC5966k.a.m(this, sVar, enumC5958c, interfaceC6469f, interfaceC6464a, z10, interfaceC6469f2);
    }

    @Override // h8.InterfaceC5966k
    public void M(gg.i iVar, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l interfaceC6835l2) {
        InterfaceC5966k.a.l(this, iVar, enumC5958c, interfaceC6835l, interfaceC6824a, z10, interfaceC6835l2);
    }

    @Override // h8.InterfaceC5966k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C5960e K() {
        return (C5960e) this.f48510E.getValue();
    }

    @Override // h8.InterfaceC5966k
    public void c(s sVar, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l interfaceC6835l2) {
        InterfaceC5966k.a.n(this, sVar, enumC5958c, interfaceC6835l, interfaceC6824a, z10, interfaceC6835l2);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return (DI) this.f48509D.getValue();
    }

    @Override // org.kodein.di.c
    public AbstractC7726l2 i() {
        c.a.b(this);
        return null;
    }

    @Override // h8.InterfaceC5966k
    public void k(gg.i iVar, EnumC5958c enumC5958c, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, boolean z10) {
        InterfaceC5966k.a.k(this, iVar, enumC5958c, interfaceC6469f, interfaceC6469f2, interfaceC6464a, z10);
    }

    @Override // h8.InterfaceC5966k
    public void q(AbstractC5912b abstractC5912b, EnumC5958c enumC5958c, InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f, boolean z10) {
        InterfaceC5966k.a.i(this, abstractC5912b, enumC5958c, interfaceC6464a, interfaceC6469f, z10);
    }
}
