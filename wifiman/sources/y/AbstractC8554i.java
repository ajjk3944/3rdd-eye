package y;

import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.O;
import T.t1;
import T.z1;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.List;
import mh.InterfaceC6839p;

/* renamed from: y.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8554i {

    /* renamed from: y.i$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f66186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f66187b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f66188c;

        /* renamed from: y.i$a$a, reason: collision with other inner class name */
        static final class C2350a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f66189a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f66190b;

            C2350a(List list, InterfaceC3551q0 interfaceC3551q0) {
                this.f66189a = list;
                this.f66190b = interfaceC3551q0;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                if (interfaceC8555j instanceof C8552g) {
                    this.f66189a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof C8553h) {
                    this.f66189a.remove(((C8553h) interfaceC8555j).a());
                }
                this.f66190b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f66189a.isEmpty()));
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC8556k interfaceC8556k, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f66187b = interfaceC8556k;
            this.f66188c = interfaceC3551q0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f66187b, this.f66188c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66186a;
            if (i10 == 0) {
                v.b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC3220g interfaceC3220gB = this.f66187b.b();
                C2350a c2350a = new C2350a(arrayList, this.f66188c);
                this.f66186a = 1;
                if (interfaceC3220gB.b(c2350a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final z1 a(InterfaceC8556k interfaceC8556k, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1206586544, i10, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = t1.d(Boolean.FALSE, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && interfaceC3540l.T(interfaceC8556k)) || (i10 & 6) == 4;
        Object objF2 = interfaceC3540l.f();
        if (z10 || objF2 == aVar.a()) {
            objF2 = new a(interfaceC8556k, interfaceC3551q0, null);
            interfaceC3540l.K(objF2);
        }
        O.f(interfaceC8556k, (InterfaceC6839p) objF2, interfaceC3540l, i11);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC3551q0;
    }
}
