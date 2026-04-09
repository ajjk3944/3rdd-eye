package Ye;

import N.C0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Ye.d;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import z.N;

/* loaded from: classes4.dex */
public abstract class n {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d.b f24953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f24954b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f24955c;

        /* renamed from: Ye.n$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0960a extends C6490p implements InterfaceC6824a {
            C0960a(Object obj) {
                super(0, obj, f.class, "onUnavailablePrimaryButtonClicked", "onUnavailablePrimaryButtonClicked()V", 0);
            }

            public final void a() {
                ((f) this.receiver).A0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(d.b bVar, androidx.compose.ui.e eVar, f fVar) {
            this.f24953a = bVar;
            this.f24954b = eVar;
            this.f24955c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(z.N r16, T.InterfaceC3540l r17, int r18) {
            /*
                Method dump skipped, instructions count: 521
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Ye.n.a.a(z.N, T.l, int):void");
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final d.b reason, final f vm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        AbstractC6492s.i(reason, "reason");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-420949906);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(reason) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(vm) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i14 = i12;
        if ((i14 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-420949906, i14, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUnavailableUi (FloorplanMapperUnavailableUi.kt:28)");
            }
            androidx.compose.ui.e eVar4 = eVar3;
            C0.a(eVar3, null, b.f24905a.a(), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, b0.c.e(-786079632, true, new a(reason, eVar3, vm), interfaceC3540lR, 54), interfaceC3540lR, (i14 & 14) | 384, 12582912, 131066);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar2;
            x0Z.a(new InterfaceC6839p() { // from class: Ye.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return n.c(eVar5, reason, vm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, d.b bVar, f fVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, bVar, fVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
