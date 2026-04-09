package D;

import C0.r;
import E0.AbstractC2633k;
import E0.InterfaceC2632j;
import Y0.s;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6538n;
import l0.C6533i;
import mh.InterfaceC6824a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6533i f2764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f2765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6533i c6533i, r rVar) {
            super(0);
            this.f2764a = c6533i;
            this.f2765b = rVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6533i invoke() {
            C6533i c6533i = this.f2764a;
            if (c6533i != null) {
                return c6533i;
            }
            r rVar = this.f2765b;
            if (!rVar.M()) {
                rVar = null;
            }
            if (rVar != null) {
                return AbstractC6538n.c(s.d(rVar.h()));
            }
            return null;
        }
    }

    public static final Object a(InterfaceC2632j interfaceC2632j, C6533i c6533i, InterfaceC5380e interfaceC5380e) {
        Object objR1;
        if (!interfaceC2632j.h1().k2()) {
            return J.f24997a;
        }
        r rVarK = AbstractC2633k.k(interfaceC2632j);
        D.a aVarC = androidx.compose.foundation.relocation.b.c(interfaceC2632j);
        return (aVarC != null && (objR1 = aVarC.r1(rVarK, new a(c6533i, rVarK), interfaceC5380e)) == AbstractC5467b.g()) ? objR1 : J.f24997a;
    }

    public static /* synthetic */ Object b(InterfaceC2632j interfaceC2632j, C6533i c6533i, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c6533i = null;
        }
        return e.a(interfaceC2632j, c6533i, interfaceC5380e);
    }
}
