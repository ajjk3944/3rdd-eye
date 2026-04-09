package Hf;

import Hf.j;
import Ii.N;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import Yg.v;
import android.content.res.Resources;
import android.os.Bundle;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.n;
import f2.r;
import f2.u;
import f2.w;
import f2.z;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import xe.r0;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f7922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f7923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f7923b = wVar;
            this.f7924c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J t(z zVar) {
            z.e(zVar, 0, null, 2, null);
            return J.f24997a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f7923b, this.f7924c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            AbstractC5467b.g();
            if (this.f7922a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            w wVar = this.f7923b;
            String str = this.f7924c;
            if (str == null) {
                str = "empty";
            }
            wVar.V(str, new InterfaceC6835l() { // from class: Hf.i
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return j.a.t((z) obj2);
                }
            });
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f7925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f7926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0 f7927c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w wVar, r0 r0Var, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f7926b = wVar;
            this.f7927c = r0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(r0 r0Var, n nVar, r rVar, Bundle bundle) {
            String strW = rVar.w();
            if (strW != null) {
                int iHashCode = strW.hashCode();
                if (iHashCode == -429019104) {
                    if (strW.equals("BLUETOOTH_PERMISSION")) {
                        r0Var.a(P7.b.APP_WIZARD_BLUETOOTH);
                    }
                } else if (iHashCode == 802358425) {
                    if (strW.equals("LOCATION_PERMISSION")) {
                        r0Var.a(P7.b.APP_WIZARD_LOCATION);
                    }
                } else if (iHashCode == 1805087797 && strW.equals("APP_TO_APP_SPEEDTEST")) {
                    r0Var.a(P7.b.APP_WIZARD_A2A);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f7926b, this.f7927c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f7925a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            w wVar = this.f7926b;
            final r0 r0Var = this.f7927c;
            wVar.r(new n.c() { // from class: Hf.k
                @Override // f2.n.c
                public final void a(n nVar, r rVar, Bundle bundle) {
                    j.b.t(r0Var, nVar, rVar, bundle);
                }
            });
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(Hf.c r24, T.InterfaceC3540l r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.j.c(Hf.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(u NavHost) {
        AbstractC6492s.i(NavHost, "$this$NavHost");
        l lVar = l.f7929a;
        Ae.a.c(NavHost, "empty", null, null, lVar.a(), 6, null);
        Ae.a.c(NavHost, "LOCATION_PERMISSION", null, null, lVar.b(), 6, null);
        Ae.a.c(NavHost, "BLUETOOTH_PERMISSION", null, null, lVar.c(), 6, null);
        Ae.a.c(NavHost, "APP_TO_APP_SPEEDTEST", null, null, lVar.d(), 6, null);
        Ae.a.c(NavHost, "NOTIFICATION_PERMISSION", null, null, lVar.e(), 6, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
