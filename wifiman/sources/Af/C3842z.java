package af;

import L0.C3174d;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.z1;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;
import q.AbstractC7402u;
import sa.AbstractC7930a;

/* renamed from: af.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3842z {

    /* renamed from: a, reason: collision with root package name */
    public static final C3842z f26194a = new C3842z();

    private C3842z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(C3842z c3842z, androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c3842z.b(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public final void b(androidx.compose.ui.e eVar, final s9.d text, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-511574372);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = i10 | (interfaceC3540lR.T(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-511574372, i12, -1, "com.ui.wifiman.ui.speed.component.SpeedTabCardDefaults.TitleText (SpeedTabCardDefaults.kt:26)");
            }
            C3174d c3174dA = AbstractC7930a.a(text, interfaceC3540lR, (i12 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            a1.c(c3174dA, eVar3, c6562a.a(interfaceC3540lR, i14).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i14).a().b(), interfaceC3540lR, (i12 << 3) & 112, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.y
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return C3842z.c(this.f26189a, eVar3, text, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final z1 d(boolean z10, long j10, long j11, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-961895380);
        long jB = (i11 & 2) != 0 ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).e().b() : j10;
        long jE = (i11 & 4) != 0 ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().e() : j11;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-961895380, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabCardDefaults.backgroundColor (SpeedTabCardDefaults.kt:20)");
        }
        z1 z1VarA = AbstractC7402u.a(z10 ? jE : jB, null, "bg color", null, interfaceC3540l, 384, 10);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }
}
