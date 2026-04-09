package Be;

import Be.z0;
import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import android.content.Context;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InterfaceC3923h0;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6835l;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import sa.AbstractC7930a;
import vf.AbstractC8226f;
import vf.C8221a;
import vf.C8225e;

/* loaded from: classes4.dex */
public abstract class z0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1704a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s9.d f1705b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1706c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1707d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1708e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1709f;

        /* renamed from: Be.z0$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0070a extends C6490p implements InterfaceC6835l {
            C0070a(Object obj) {
                super(1, obj, C8225e.class, "onClicked", "onClicked(I)V", 0);
            }

            public final void a(int i10) {
                ((C8225e) this.receiver).i(i10);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).intValue());
                return Yg.J.f24997a;
            }
        }

        a(boolean z10, s9.d dVar, int i10, androidx.compose.ui.e eVar, int i11, int i12) {
            this.f1704a = z10;
            this.f1705b = dVar;
            this.f1706c = i10;
            this.f1707d = eVar;
            this.f1708e = i11;
            this.f1709f = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(InterfaceC3923h0 interfaceC3923h0, C3174d c3174d, Context context, int i10) {
            interfaceC3923h0.b(c3174d);
            C8221a.f63590a.a(context);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J f(InterfaceC3923h0 interfaceC3923h0, C3174d c3174d, Context context, int i10) {
            interfaceC3923h0.b(c3174d);
            C8221a.f63590a.a(context);
            return Yg.J.f24997a;
        }

        public final void c(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(312306667, i10, -1, "com.ui.wifiman.ui.component.UiSettingsTextValueExtended.<anonymous> (UiSettingsUrlClickableTextValue.kt:35)");
            }
            final InterfaceC3923h0 interfaceC3923h0 = (InterfaceC3923h0) interfaceC3540l.t(AbstractC3932k0.f());
            final Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
            if (this.f1704a) {
                interfaceC3540l.U(1436402359);
                C8225e c8225eA = AbstractC8226f.a(AbstractC7930a.a(this.f1705b, interfaceC3540l, 0), 0L, null, null, interfaceC3540l, 0, 14);
                final C3174d c3174d = (C3174d) o1.b(c8225eA.g(), null, interfaceC3540l, 0, 1).getValue();
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                L0.U uB = c6562a.c(interfaceC3540l, i11).b().b();
                L0.U uB2 = uB.b((15204351 & 1) != 0 ? uB.f11108a.g() : c6562a.a(interfaceC3540l, i11).f().c(), (15204351 & 2) != 0 ? uB.f11108a.k() : 0L, (15204351 & 4) != 0 ? uB.f11108a.n() : null, (15204351 & 8) != 0 ? uB.f11108a.l() : null, (15204351 & 16) != 0 ? uB.f11108a.m() : null, (15204351 & 32) != 0 ? uB.f11108a.i() : null, (15204351 & 64) != 0 ? uB.f11108a.j() : null, (15204351 & 128) != 0 ? uB.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uB.f11108a.e() : null, (15204351 & 512) != 0 ? uB.f11108a.u() : null, (15204351 & 1024) != 0 ? uB.f11108a.p() : null, (15204351 & 2048) != 0 ? uB.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uB.f11108a.s() : null, (15204351 & 8192) != 0 ? uB.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uB.f11108a.h() : null, (15204351 & 32768) != 0 ? uB.f11109b.h() : this.f1706c, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uB.f11109b.i() : 0, (15204351 & 131072) != 0 ? uB.f11109b.e() : Y0.v.f24549b.a(), (15204351 & 262144) != 0 ? uB.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uB.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uB.f11109b.f() : null, (15204351 & 2097152) != 0 ? uB.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uB.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uB.f11109b.k() : null);
                interfaceC3540l.U(-923476022);
                boolean zT = interfaceC3540l.T(c8225eA);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0070a(c8225eA);
                    interfaceC3540l.K(objF);
                }
                th.g gVar = (th.g) objF;
                interfaceC3540l.J();
                androidx.compose.ui.e eVar = this.f1707d;
                int i12 = this.f1708e;
                int i13 = this.f1709f;
                interfaceC3540l.U(-923473911);
                boolean zL = interfaceC3540l.l(interfaceC3923h0) | interfaceC3540l.T(c3174d) | interfaceC3540l.l(context);
                Object objF2 = interfaceC3540l.f();
                if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new InterfaceC6835l() { // from class: Be.x0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return z0.a.e(interfaceC3923h0, c3174d, context, ((Integer) obj).intValue());
                        }
                    };
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                AbstractC2466f.d(c3174d, eVar, uB2, false, i12, i13, null, (InterfaceC6835l) objF2, (InterfaceC6835l) gVar, interfaceC3540l, 0, 72);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1437287688);
                final C3174d c3174dA = AbstractC7930a.a(this.f1705b, interfaceC3540l, 0);
                C6562a c6562a2 = C6562a.f52458a;
                int i14 = C6562a.f52459b;
                L0.U uB3 = c6562a2.c(interfaceC3540l, i14).b().b();
                L0.U uB4 = uB3.b((15204351 & 1) != 0 ? uB3.f11108a.g() : c6562a2.a(interfaceC3540l, i14).f().c(), (15204351 & 2) != 0 ? uB3.f11108a.k() : 0L, (15204351 & 4) != 0 ? uB3.f11108a.n() : null, (15204351 & 8) != 0 ? uB3.f11108a.l() : null, (15204351 & 16) != 0 ? uB3.f11108a.m() : null, (15204351 & 32) != 0 ? uB3.f11108a.i() : null, (15204351 & 64) != 0 ? uB3.f11108a.j() : null, (15204351 & 128) != 0 ? uB3.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uB3.f11108a.e() : null, (15204351 & 512) != 0 ? uB3.f11108a.u() : null, (15204351 & 1024) != 0 ? uB3.f11108a.p() : null, (15204351 & 2048) != 0 ? uB3.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uB3.f11108a.s() : null, (15204351 & 8192) != 0 ? uB3.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uB3.f11108a.h() : null, (15204351 & 32768) != 0 ? uB3.f11109b.h() : this.f1706c, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uB3.f11109b.i() : 0, (15204351 & 131072) != 0 ? uB3.f11109b.e() : Y0.v.f24549b.a(), (15204351 & 262144) != 0 ? uB3.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uB3.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uB3.f11109b.f() : null, (15204351 & 2097152) != 0 ? uB3.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uB3.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uB3.f11109b.k() : null);
                androidx.compose.ui.e eVar2 = this.f1707d;
                int i15 = this.f1708e;
                int i16 = this.f1709f;
                interfaceC3540l.U(-923449847);
                boolean zL2 = interfaceC3540l.l(interfaceC3923h0) | interfaceC3540l.T(c3174dA) | interfaceC3540l.l(context);
                Object objF3 = interfaceC3540l.f();
                if (zL2 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new InterfaceC6835l() { // from class: Be.y0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return z0.a.f(interfaceC3923h0, c3174dA, context, ((Integer) obj).intValue());
                        }
                    };
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                AbstractC2466f.d(c3174dA, eVar2, uB4, false, i15, i16, null, (InterfaceC6835l) objF3, null, interfaceC3540l, 100663296, 72);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            c((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r40, final s9.d r41, s9.d r42, final s9.d r43, boolean r44, int r45, int r46, int r47, T.InterfaceC3540l r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.z0.b(androidx.compose.ui.e, s9.d, s9.d, s9.d, boolean, int, int, int, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, s9.d dVar, s9.d dVar2, s9.d dVar3, boolean z10, int i10, int i11, int i12, int i13, int i14, InterfaceC3540l interfaceC3540l, int i15) {
        b(eVar, dVar, dVar2, dVar3, z10, i10, i11, i12, interfaceC3540l, L0.a(i13 | 1), i14);
        return Yg.J.f24997a;
    }
}
