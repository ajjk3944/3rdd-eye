package N;

import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6537m;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r0.AbstractC7554d;

/* renamed from: N.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3309a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.e f14221a = androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24));

    /* renamed from: N.a0$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC7554d f14222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14223b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14225d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14226e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14227f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC7554d abstractC7554d, String str, androidx.compose.ui.e eVar, long j10, int i10, int i11) {
            super(2);
            this.f14222a = abstractC7554d;
            this.f14223b = str;
            this.f14224c = eVar;
            this.f14225d = j10;
            this.f14226e = i10;
            this.f14227f = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3309a0.a(this.f14222a, this.f14223b, this.f14224c, this.f14225d, interfaceC3540l, T.L0.a(this.f14226e | 1), this.f14227f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.a0$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f14228a = str;
        }

        public final void a(J0.w wVar) {
            J0.t.a0(wVar, this.f14228a);
            J0.t.i0(wVar, J0.g.f9602b.d());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(r0.AbstractC7554d r21, java.lang.String r22, androidx.compose.ui.e r23, long r24, T.InterfaceC3540l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3309a0.a(r0.d, java.lang.String, androidx.compose.ui.e, long, T.l, int, int):void");
    }

    private static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, AbstractC7554d abstractC7554d) {
        return eVar.b0((C6537m.f(abstractC7554d.l(), C6537m.f52356b.a()) || c(abstractC7554d.l())) ? f14221a : androidx.compose.ui.e.f28771b0);
    }

    private static final boolean c(long j10) {
        return Float.isInfinite(C6537m.i(j10)) && Float.isInfinite(C6537m.g(j10));
    }
}
