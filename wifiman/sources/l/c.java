package L;

import L0.AbstractC3190u;
import L0.U;
import L0.V;
import Q0.AbstractC3434k;
import Y0.t;
import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final a f10901h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f10902i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static c f10903j;

    /* renamed from: a, reason: collision with root package name */
    private final t f10904a;

    /* renamed from: b, reason: collision with root package name */
    private final U f10905b;

    /* renamed from: c, reason: collision with root package name */
    private final Y0.d f10906c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3434k.b f10907d;

    /* renamed from: e, reason: collision with root package name */
    private final U f10908e;

    /* renamed from: f, reason: collision with root package name */
    private float f10909f;

    /* renamed from: g, reason: collision with root package name */
    private float f10910g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(c cVar, t tVar, U u10, Y0.d dVar, AbstractC3434k.b bVar) {
            if (cVar != null && tVar == cVar.g() && AbstractC6492s.d(u10, cVar.f()) && dVar.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            c cVar2 = c.f10903j;
            if (cVar2 != null && tVar == cVar2.g() && AbstractC6492s.d(u10, cVar2.f()) && dVar.getDensity() == cVar2.d().getDensity() && bVar == cVar2.e()) {
                return cVar2;
            }
            c cVar3 = new c(tVar, V.d(u10, tVar), Y0.f.a(dVar.getDensity(), dVar.y()), bVar, null);
            c.f10903j = cVar3;
            return cVar3;
        }

        private a() {
        }
    }

    public /* synthetic */ c(t tVar, U u10, Y0.d dVar, AbstractC3434k.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, u10, dVar, bVar);
    }

    public final long c(long j10, int i10) {
        float height = this.f10910g;
        float height2 = this.f10909f;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = AbstractC3190u.a(d.f10911a, this.f10908e, Y0.c.b(0, 0, 0, 0, 15, null), this.f10906c, this.f10907d, (64 & 32) != 0 ? AbstractC3689v.l() : null, (64 & 64) != 0 ? AbstractC3689v.l() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : false).getHeight();
            height2 = AbstractC3190u.a(d.f10912b, this.f10908e, Y0.c.b(0, 0, 0, 0, 15, null), this.f10906c, this.f10907d, (64 & 32) != 0 ? AbstractC3689v.l() : null, (64 & 64) != 0 ? AbstractC3689v.l() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : false).getHeight() - height;
            this.f10910g = height;
            this.f10909f = height2;
        }
        return Y0.c.a(Y0.b.n(j10), Y0.b.l(j10), i10 != 1 ? AbstractC7978m.g(AbstractC7978m.d(Math.round(height + (height2 * (i10 - 1))), 0), Y0.b.k(j10)) : Y0.b.m(j10), Y0.b.k(j10));
    }

    public final Y0.d d() {
        return this.f10906c;
    }

    public final AbstractC3434k.b e() {
        return this.f10907d;
    }

    public final U f() {
        return this.f10905b;
    }

    public final t g() {
        return this.f10904a;
    }

    private c(t tVar, U u10, Y0.d dVar, AbstractC3434k.b bVar) {
        this.f10904a = tVar;
        this.f10905b = u10;
        this.f10906c = dVar;
        this.f10907d = bVar;
        this.f10908e = V.d(u10, tVar);
        this.f10909f = Float.NaN;
        this.f10910g = Float.NaN;
    }
}
