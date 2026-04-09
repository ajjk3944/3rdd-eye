package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import y.InterfaceC8558m;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3312c {

    /* renamed from: N.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.W f14351a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f14352b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f14353c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14354d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f14355e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r.W w10, InterfaceC3551q0 interfaceC3551q0, androidx.compose.foundation.o oVar, androidx.compose.ui.e eVar, mh.q qVar) {
            super(2);
            this.f14351a = w10;
            this.f14352b = interfaceC3551q0;
            this.f14353c = oVar;
            this.f14354d = eVar;
            this.f14355e = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-47803778, i10, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:138)");
            }
            AbstractC3327j0.a(this.f14351a, this.f14352b, this.f14353c, this.f14354d, this.f14355e, interfaceC3540l, r.W.f59543d | 48, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.c$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14359d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f14360e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.r f14361f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f14362g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14363h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f14364i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, long j10, androidx.compose.foundation.o oVar, androidx.compose.ui.window.r rVar, mh.q qVar, int i10, int i11) {
            super(2);
            this.f14356a = z10;
            this.f14357b = interfaceC6824a;
            this.f14358c = eVar;
            this.f14359d = j10;
            this.f14360e = oVar;
            this.f14361f = rVar;
            this.f14362g = qVar;
            this.f14363h = i10;
            this.f14364i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3312c.a(this.f14356a, this.f14357b, this.f14358c, this.f14359d, this.f14360e, this.f14361f, this.f14362g, interfaceC3540l, T.L0.a(this.f14363h | 1), this.f14364i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.c$c, reason: collision with other inner class name */
    static final class C0554c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f14365a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0554c(InterfaceC3551q0 interfaceC3551q0) {
            super(2);
            this.f14365a = interfaceC3551q0;
        }

        public final void a(Y0.p pVar, Y0.p pVar2) {
            this.f14365a.setValue(androidx.compose.ui.graphics.f.b(AbstractC3327j0.h(pVar, pVar2)));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Y0.p) obj, (Y0.p) obj2);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.c$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z.N f14369d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14370e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.q f14371f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14372g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14373h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, z.N n10, InterfaceC8558m interfaceC8558m, mh.q qVar, int i10, int i11) {
            super(2);
            this.f14366a = interfaceC6824a;
            this.f14367b = eVar;
            this.f14368c = z10;
            this.f14369d = n10;
            this.f14370e = interfaceC8558m;
            this.f14371f = qVar;
            this.f14372g = i10;
            this.f14373h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3312c.b(this.f14366a, this.f14367b, this.f14368c, this.f14369d, this.f14370e, this.f14371f, interfaceC3540l, T.L0.a(this.f14372g | 1), this.f14373h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r24, mh.InterfaceC6824a r25, androidx.compose.ui.e r26, long r27, androidx.compose.foundation.o r29, androidx.compose.ui.window.r r30, mh.q r31, T.InterfaceC3540l r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3312c.a(boolean, mh.a, androidx.compose.ui.e, long, androidx.compose.foundation.o, androidx.compose.ui.window.r, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(mh.InterfaceC6824a r18, androidx.compose.ui.e r19, boolean r20, z.N r21, y.InterfaceC8558m r22, mh.q r23, T.InterfaceC3540l r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3312c.b(mh.a, androidx.compose.ui.e, boolean, z.N, y.m, mh.q, T.l, int, int):void");
    }
}
