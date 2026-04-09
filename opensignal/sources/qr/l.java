package qr;

import br.x;
import br.y;
import ir.v;
import ur.a0;

/* loaded from: classes.dex */
public final class l extends or.h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v[] f20993h;

    /* renamed from: f, reason: collision with root package name */
    public or.l f20994f;

    /* renamed from: g, reason: collision with root package name */
    public final gt.i f20995g;

    static {
        y yVar = x.f2918a;
        f20993h = new v[]{yVar.f(new br.q(yVar.b(l.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gt.l lVar, i iVar) {
        super(lVar);
        br.l.e(iVar, "kind");
        this.f20995g = new gt.i(lVar, new g(this, 1, lVar));
        int i10 = k.f20992a[iVar.ordinal()];
        if (i10 == 2) {
            c();
        } else {
            if (i10 != 3) {
                return;
            }
            c();
        }
    }

    public final r J() {
        return (r) io.sentry.config.a.Z(this.f20995g, f20993h[0]);
    }

    @Override // or.h
    public final tr.b d() {
        return J();
    }

    @Override // or.h
    public final Iterable l() {
        Iterable iterableL = super.l();
        a0 a0VarK = k();
        br.l.d(a0VarK, "builtInsModule");
        return mq.o.D0(iterableL, new h(this.f19676d, a0VarK));
    }

    @Override // or.h
    public final tr.d p() {
        return J();
    }
}
