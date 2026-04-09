package L0;

import Q0.AbstractC3434k;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: f, reason: collision with root package name */
    public static final a f11095f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3434k.b f11096a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0.d f11097b;

    /* renamed from: c, reason: collision with root package name */
    private final Y0.t f11098c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11099d;

    /* renamed from: e, reason: collision with root package name */
    private final K f11100e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final M b(L l10) {
            C3182l c3182l = new C3182l(l10.j(), V.d(l10.i(), l10.d()), l10.g(), l10.b(), l10.c());
            int iN = Y0.b.n(l10.a());
            int iL = ((l10.h() || W0.t.e(l10.f(), W0.t.f23567a.b())) && Y0.b.h(l10.a())) ? Y0.b.l(l10.a()) : MPv3.MAX_MESSAGE_ID;
            int iE = (l10.h() || !W0.t.e(l10.f(), W0.t.f23567a.b())) ? l10.e() : 1;
            if (iN != iL) {
                iL = AbstractC7978m.k(AbstractC3190u.d(c3182l.b()), iN, iL);
            }
            return new M(l10, new C3181k(c3182l, Y0.b.f24516b.b(0, iL, 0, Y0.b.k(l10.a())), iE, W0.t.e(l10.f(), W0.t.f23567a.b()), null), Y0.c.f(l10.a(), Y0.s.a((int) Math.ceil(r13.A()), (int) Math.ceil(r13.h()))), null);
        }

        private a() {
        }
    }

    public O(AbstractC3434k.b bVar, Y0.d dVar, Y0.t tVar, int i10) {
        this.f11096a = bVar;
        this.f11097b = dVar;
        this.f11098c = tVar;
        this.f11099d = i10;
        this.f11100e = i10 > 0 ? new K(i10) : null;
    }

    public static /* synthetic */ M d(O o10, C3174d c3174d, U u10, int i10, boolean z10, int i11, List list, long j10, Y0.t tVar, Y0.d dVar, AbstractC3434k.b bVar, boolean z11, int i12, Object obj) {
        return o10.c(c3174d, (i12 & 2) != 0 ? U.f11106d.a() : u10, (i12 & 4) != 0 ? W0.t.f23567a.a() : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? MPv3.MAX_MESSAGE_ID : i11, (i12 & 32) != 0 ? AbstractC3689v.l() : list, (i12 & 64) != 0 ? Y0.c.b(0, 0, 0, 0, 15, null) : j10, (i12 & 128) != 0 ? o10.f11098c : tVar, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? o10.f11097b : dVar, (i12 & 512) != 0 ? o10.f11096a : bVar, (i12 & 1024) != 0 ? false : z11);
    }

    public final M a(String str, U u10, int i10, boolean z10, int i11, long j10, Y0.t tVar, Y0.d dVar, AbstractC3434k.b bVar, boolean z11) {
        return d(this, new C3174d(str, null, null, 6, null), u10, i10, z10, i11, null, j10, tVar, dVar, bVar, z11, 32, null);
    }

    public final M c(C3174d c3174d, U u10, int i10, boolean z10, int i11, List list, long j10, Y0.t tVar, Y0.d dVar, AbstractC3434k.b bVar, boolean z11) {
        K k10;
        L l10 = new L(c3174d, u10, list, i11, z10, i10, dVar, tVar, bVar, j10, (DefaultConstructorMarker) null);
        M mA = (z11 || (k10 = this.f11100e) == null) ? null : k10.a(l10);
        if (mA != null) {
            return mA.a(l10, Y0.c.f(j10, Y0.s.a(AbstractC3190u.d(mA.w().A()), AbstractC3190u.d(mA.w().h()))));
        }
        M mB = f11095f.b(l10);
        K k11 = this.f11100e;
        if (k11 == null) {
            return mB;
        }
        k11.b(l10, mB);
        return mB;
    }
}
